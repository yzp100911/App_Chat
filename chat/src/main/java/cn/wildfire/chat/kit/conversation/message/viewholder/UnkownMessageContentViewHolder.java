package cn.wildfire.chat.kit.conversation.message.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Bind;
import cn.wildfire.chat.kit.annotation.EnableContextMenu;
import cn.wildfire.chat.kit.annotation.MessageContentType;
import cn.wildfire.chat.kit.annotation.ReceiveLayoutRes;
import cn.wildfire.chat.kit.annotation.SendLayoutRes;
import cn.wildfire.chat.kit.conversation.message.model.UiMessage;
import cn.wildfirechat.chat.R;
import cn.wildfirechat.message.UnknownMessageContent;

@MessageContentType(UnknownMessageContent.class)
@SendLayoutRes(resId = R.layout.conversation_item_unknown_send)
@ReceiveLayoutRes(resId = R.layout.conversation_item_unknown_receive)
@EnableContextMenu
public class UnkownMessageContentViewHolder extends NormalMessageContentViewHolder {
    @Bind(R.id.contentTextView)
    TextView contentTextView;

    public UnkownMessageContentViewHolder(FragmentActivity context, RecyclerView.Adapter adapter, View itemView) {
        super(context, adapter, itemView);
    }

    @Override
    public void onBind(UiMessage message) {
        contentTextView.setText("unknown message");
    }
}
