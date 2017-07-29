package com.rong.map.fitclock;

import android.content.Context;
import android.widget.Switch;

import com.rong.map.fitclock.model.ClockModel;

import org.byteam.superadapter.SuperAdapter;
import org.byteam.superadapter.SuperViewHolder;

import java.util.List;

/**
 * 作者：陈华榕
 * 邮箱:mpa.chen@sportq.com
 * 时间：2017/7/29  20:20
 */

public class MainAdapter extends SuperAdapter<ClockModel> {
    /**
     * Constructor for single itemView type.
     *
     * @param context
     * @param items
     * @param layoutResId
     */
    public MainAdapter(Context context, List<ClockModel> items, int layoutResId) {
        super(context, items, layoutResId);
    }

    /**
     * Method for binding data to view.
     *
     * @param holder         ViewHolder
     * @param viewType       {@link RecyclerSupportAdapter#getItemViewType(int)}
     * @param layoutPosition position
     * @param item           data
     */
    @Override
    public void onBind(SuperViewHolder holder, int viewType, int layoutPosition, ClockModel item) {
        holder.setText(R.id.time, item.time);
        holder.setText(R.id.date, item.date);
//        ((Switch) holder.findViewById(R.id. switch))
    }
}
