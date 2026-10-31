package p;

import android.view.View;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v20 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ v20(byte b, Object obj, iu30 iu30Var) {
        this.a = b;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x8c0 lifecycle;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(rih1Var);
                break;
            case 1:
                iu30Var.invoke(dm0.a);
                break;
            case 2:
                iu30Var.invoke(tm0.a);
                break;
            case 3:
                iu30Var.invoke(mw0.a);
                break;
            case 4:
                iu30Var.invoke(rw0.a);
                break;
            case 5:
                iu30Var.invoke(Boolean.FALSE);
                break;
            case 6:
                iu30Var.invoke(he8.a);
                break;
            case 7:
                iu30Var.invoke(he8.c);
                break;
            case 8:
                iu30Var.invoke(he8.b);
                break;
            case 9:
                iu30Var.invoke(rih1Var);
                break;
            case 10:
                view.getClass();
                iac0 iac0VarH = x9p1.h(view);
                u9c0 u9c0VarH = (iac0VarH == null || (lifecycle = iac0VarH.getLifecycle()) == null) ? null : zso1.H(lifecycle);
                if (u9c0VarH != null) {
                    fn31.T(u9c0VarH, (o8n) null, 0, new w73(iu30Var, (lnm) null, (byte) 3), 3);
                }
                break;
            case 11:
                iu30Var.invoke(rih1Var);
                break;
            case 12:
                iu30Var.invoke(zfd.a);
                break;
            case 13:
                iu30Var.invoke(vco.b);
                break;
            case 14:
                iu30Var.invoke(rih1Var);
                break;
            case 15:
                iu30Var.invoke(rih1Var);
                break;
            case 16:
                iu30Var.invoke(rih1Var);
                break;
            case 17:
                iu30Var.invoke(reh.a);
                break;
            case 18:
                iu30Var.invoke(teh.a);
                break;
            case 19:
                iu30Var.invoke(rih1Var);
                break;
            case 20:
                iu30Var.invoke(czn.a);
                break;
            case 21:
                iu30Var.invoke(czn.d);
                break;
            case 22:
                iu30Var.invoke(czn.c);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                iu30Var.invoke(rih1Var);
                break;
            case 24:
                iu30Var.invoke(hao.a);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(ix.a);
                break;
            case 26:
                iu30Var.invoke(he1.a);
                break;
            case 27:
                iu30Var.invoke(me1.a);
                break;
            case 28:
                iu30Var.invoke(z53.b);
                break;
            default:
                iu30Var.invoke(b73.a);
                break;
        }
    }

    public /* synthetic */ v20(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }
}
