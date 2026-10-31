package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wer implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ wer(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        rwf1 rwf1Var = rwf1.b;
        tgu0 tgu0Var = tgu0.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(z53.c);
                break;
            case 1:
                iu30Var.invoke(vee.b);
                break;
            case 2:
                iu30Var.invoke(b2z.b);
                break;
            case 3:
                iu30Var.invoke(d2z.b);
                break;
            case 4:
                iu30Var.invoke(o9z.a);
                break;
            case 5:
                iu30Var.invoke(v9z.c);
                break;
            case 6:
                iu30Var.invoke(zt70.b);
                break;
            case 7:
                iu30Var.invoke(pup0.b);
                break;
            case 8:
                iu30Var.invoke(zvp0.b);
                break;
            case 9:
                iu30Var.invoke(yis0.d);
                break;
            case 10:
                iu30Var.invoke(qgu0.b);
                break;
            case 11:
                iu30Var.invoke(tgu0Var);
                break;
            case 12:
                iu30Var.invoke(tsu0.c);
                break;
            case 13:
                iu30Var.invoke(dq01.b);
                break;
            case 14:
                iu30Var.invoke(rwf1Var);
                break;
            case 15:
                iu30Var.invoke(twf1.e);
                break;
            case 16:
                iu30Var.invoke(dxf1.b);
                break;
            case 17:
                iu30Var.invoke(gxf1.c);
                break;
            case 18:
                iu30Var.invoke(rwf1Var);
                break;
            default:
                iu30Var.invoke(tgu0Var);
                break;
        }
        return true;
    }
}
