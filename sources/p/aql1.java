package p;

import android.util.Size;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetViewBound;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aql1 {
    public final t2j0 a;
    public final qpj1 b;

    public aql1(t2j0 t2j0Var, qpj1 qpj1Var) {
        this.a = t2j0Var;
        this.b = qpj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, WidgetState widgetState, onm onmVar) {
        zpl1 zpl1Var;
        if (onmVar instanceof zpl1) {
            zpl1Var = (zpl1) onmVar;
            int i2 = zpl1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zpl1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                zpl1Var = new zpl1(this, onmVar);
            }
        } else {
            zpl1Var = new zpl1(this, onmVar);
        }
        Object objR = zpl1Var.b;
        int i3 = zpl1Var.d;
        if (i3 == 0) {
            hm5.M(objR);
            zpl1Var.a = widgetState;
            zpl1Var.d = 1;
            objR = this.b.r(i, zpl1Var);
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            widgetState = zpl1Var.a;
            hm5.M(objR);
        }
        Size size = (Size) objR;
        m9p0 m9p0VarN = NpvRecommendationsWidgetViewBound.n();
        m9p0VarN.r(widgetState.getWidgetCategory());
        m9p0VarN.n(widgetState.getInstrumentationValue());
        m9p0VarN.u(size.getWidth());
        m9p0VarN.s(size.getHeight());
        m9p0VarN.t();
        m9p0VarN.q(widgetState instanceof WidgetState.ActiveSession ? ((WidgetState.ActiveSession) widgetState).getContentType().getValue() : "");
        this.a.a(m9p0VarN.build());
        return rih1.a;
    }
}
