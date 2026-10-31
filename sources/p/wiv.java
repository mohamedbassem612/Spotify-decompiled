package p;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wiv implements bhd1 {
    public final /* synthetic */ fai0 a;
    public final /* synthetic */ f2t b;
    public final /* synthetic */ teb c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qwc1 e;

    public wiv(fai0 fai0Var, f2t f2tVar, teb tebVar, String str, qwc1 qwc1Var) {
        this.a = fai0Var;
        this.b = f2tVar;
        this.c = tebVar;
        this.d = str;
        this.e = qwc1Var;
    }

    public final void a(dhd1 dhd1Var) {
        List list = (List) this.a.e();
        ito itoVar = list != null ? (ito) o7h.t0(dhd1Var.b, list) : null;
        if (itoVar != null) {
            String str = itoVar.b;
            this.b.invoke();
            TextView textViewN = xzo1.n(dhd1Var);
            if (textViewN != null) {
                textViewN.setTextAppearance(2132018004);
            }
            teb tebVar = this.c;
            View view = (View) tebVar.e;
            if (view != null) {
                view.setVisibility(u890.j(str, this.d) ? 0 : 8);
            }
            tebVar.f = str;
            this.e.invoke(new kod1(dhd1Var.b, str));
        }
    }

    public final void b(dhd1 dhd1Var) {
        xzo1.x(dhd1Var);
    }

    public final void c(dhd1 dhd1Var) {
    }
}
