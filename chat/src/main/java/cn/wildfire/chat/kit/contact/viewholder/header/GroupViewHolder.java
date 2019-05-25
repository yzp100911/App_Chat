package cn.wildfire.chat.kit.contact.viewholder.header;

import android.view.View;

import androidx.fragment.app.Fragment;
import cn.wildfire.chat.kit.annotation.LayoutRes;
import cn.wildfire.chat.kit.contact.ContactAdapter;
import cn.wildfire.chat.kit.contact.model.GroupValue;
import cn.wildfirechat.chat.R;

@SuppressWarnings("unused")
@LayoutRes(resId = R.layout.contact_header_group)
public class GroupViewHolder extends HeaderViewHolder<GroupValue> {

    public GroupViewHolder(Fragment fragment, ContactAdapter adapter, View itemView) {
        super(fragment, adapter, itemView);
    }

    @Override
    public void onBind(GroupValue groupValue) {

    }
}
