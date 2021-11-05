package dev.jahidhasanco.montra.presentation.fragment.Onboarding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import dev.jahidhasanco.montra.R
import dev.jahidhasanco.montra.data.onboarding.OnboardingData

class OnBoardingAdapter(private val context: Context, private val data: List<OnboardingData>) :
    PagerAdapter() {

    override fun getCount(): Int {
        return data.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.single_onboarding_layout, null)
        val imageView: ImageView = view.findViewById(R.id.image_Onboarding)
        val title: TextView = view.findViewById(R.id.title_Onboarding)
        val desc: TextView = view.findViewById(R.id.desc_Oboarding)

        imageView.run {
            setImageResource(data[position].image)
        }
        title.text = data[position].title
        desc.text = data[position].desc

        container.addView(view)
        return view
    }
}