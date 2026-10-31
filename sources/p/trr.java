package p;

import android.view.View;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trr implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ trr(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b1w b1wVar = b1w.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(rfo.a);
                break;
            case 1:
                iu30Var.invoke(zfo.a);
                break;
            case 2:
                iu30Var.invoke(zmo.a);
                break;
            case 3:
                iu30Var.invoke(k7u.a);
                break;
            case 4:
                iu30Var.invoke(b1wVar);
                break;
            case 5:
                iu30Var.invoke(b1wVar);
                break;
            case 6:
                iu30Var.invoke(h2x.e);
                break;
            case 7:
                iu30Var.invoke(s7x.a);
                break;
            case 8:
                iu30Var.invoke(d8x.a);
                break;
            case 9:
                iu30Var.invoke(b2z.a);
                break;
            case 10:
                iu30Var.invoke(d2z.a);
                break;
            case 11:
                iu30Var.invoke(s2z.a);
                break;
            case 12:
                iu30Var.invoke(s2z.b);
                break;
            case 13:
                iu30Var.invoke(n9z.a);
                break;
            case 14:
                iu30Var.invoke(v9z.b);
                break;
            case 15:
                iu30Var.invoke(v9z.a);
                break;
            case 16:
                iu30Var.invoke(qaz.a);
                break;
            case 17:
                iu30Var.invoke(ebz.a);
                break;
            case 18:
                iu30Var.invoke(hgz.a);
                break;
            case 19:
                iu30Var.invoke(y800.a);
                break;
            case 20:
                iu30Var.invoke(c900.a);
                break;
            case 21:
                iu30Var.invoke(c900.b);
                break;
            case 22:
                iu30Var.invoke(u6z0.a);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                iu30Var.invoke(gi10.a);
                break;
            case 24:
                iu30Var.invoke(gi10.b);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(qg20.b);
                break;
            case 26:
                iu30Var.invoke(e640.a);
                break;
            case 27:
                iu30Var.invoke(e640.b);
                break;
            case 28:
                iu30Var.invoke(hj40.a);
                break;
            default:
                iu30Var.invoke(df50.a);
                break;
        }
    }
}
