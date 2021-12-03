package com.example.storeonlinehw.productAdapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.storeonlinehw.ProductDetails
import com.example.storeonlinehw.R
import com.example.storeonlinehw.model.Phone


class ItemAdapter(
    private val context: Context,
    private val dataset: List<Phone>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val productimg: ImageView = view.findViewById(R.id.ImgProduct)
        val name: TextView = view.findViewById(R.id.productName)
        val priceview: TextView = view.findViewById(R.id.price_product)
        val productStar: ImageView = view.findViewById(R.id.productVIP)
        val buyQuantity: Button = view.findViewById(R.id.buy_button)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    @SuppressLint("ResourceType")
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.productimg.setImageResource(item.imageProduct)
        holder.name.text = item.name
        holder.priceview.text= context.resources.getString(R.id.price_product, item.price)
       if(item.isVip){
           holder.productStar.setImageResource(R.drawable.ic_baseline_star_rate_24)
       }

        holder.buyQuantity.setOnClickListener {
            if (item.quantityNumber > 0) {
                val context = holder.itemView.context
                val intent = Intent(context, ProductDetails::class.java)
                intent.putExtra(ProductDetails.prodName,item.name)
                context.startActivity(intent)
            }
            else{
                val toast =Toast.makeText(context, "Item Not available",Toast.LENGTH_SHORT)
                toast.show()
            }
        }

    }


    override fun getItemCount() = dataset.size
}