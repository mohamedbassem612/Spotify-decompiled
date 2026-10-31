package p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zl51 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ zl51(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(wl51.a);
                break;
            case 1:
                iu30Var.invoke(lm51.a);
                break;
            case 2:
                iu30Var.invoke(rih1Var);
                break;
            case 3:
                iu30Var.invoke(rih1Var);
                break;
            case 4:
                iu30Var.invoke(rih1Var);
                break;
            case 5:
                iu30Var.invoke(c791.a);
                break;
            case 6:
                iu30Var.invoke(rih1Var);
                break;
            case 7:
                iu30Var.invoke(new i011((tv80) null));
                break;
            case 8:
                iu30Var.invoke(nga1.a);
                break;
            case 9:
                iu30Var.invoke(rih1Var);
                break;
            case 10:
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                iu30Var.invoke(new csa1(new bsa1(rect.left, rect.top, rect.right, rect.bottom)));
                break;
            case 11:
                iu30Var.invoke(yyb1.a);
                break;
            case 12:
                iu30Var.invoke(hof1.a);
                break;
            case 13:
                iu30Var.invoke(hof1.b);
                break;
            case 14:
                iu30Var.invoke(jsz0.a);
                break;
            default:
                iu30Var.invoke(g7l1.a);
                break;
        }
    }
}
