package p;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class whr implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ whr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((xhr) obj).c.a(et8.c);
                break;
            case 1:
                t2u t2uVar = (t2u) obj;
                Dialog dialog = t2uVar.Q1;
                if (dialog != null) {
                    t2uVar.onDismiss(dialog);
                }
                break;
            case 2:
                ((suu) obj).e.a(dx7.b);
                break;
            case 3:
                ((o1r0) obj).Q0.e();
                break;
            case 4:
                ((u0a1) obj).g2.invoke(s0a1.b);
                break;
            case 5:
                ((yt91) obj).d = null;
                break;
            case 6:
                ((iu30) obj).invoke(mga1.a);
                break;
            default:
                ((owf1) obj).b = null;
                break;
        }
    }
}
