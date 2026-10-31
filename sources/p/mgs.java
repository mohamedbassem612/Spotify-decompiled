package p;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mgs implements PopupWindow.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mgs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lus) obj).invoke();
                break;
            default:
                ((jti0) obj).c();
                break;
        }
    }
}
