package p;

import android.view.View;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g0j0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MessageInputView b;
    public final /* synthetic */ String c;

    public /* synthetic */ g0j0(MessageInputView messageInputView, String str, byte b) {
        this.a = b;
        this.b = messageInputView;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        String str = this.c;
        MessageInputView messageInputView = this.b;
        switch (b) {
            case 0:
                messageInputView.V0.invoke(new vzi0(str));
                break;
            default:
                messageInputView.V0.invoke(new xzi0(str));
                break;
        }
    }
}
