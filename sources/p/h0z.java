package p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h0z extends emc0 {
    public static final kn5 Y = new kn5((byte) 15);
    public final LinkedHashSet X;
    public final o0g1 e;
    public final egx f;
    public final kly0 g;
    public final i3b h;
    public final d4e i;
    public hws t;

    public h0z(o0g1 o0g1Var, egx egxVar, kly0 kly0Var, i3b i3bVar, d4e d4eVar) {
        super(Y);
        this.e = o0g1Var;
        this.f = egxVar;
        this.g = kly0Var;
        this.h = i3bVar;
        this.i = d4eVar;
        this.X = new LinkedHashSet();
    }

    public final void B(List list, List list2) {
        l0x0 l0x0Var = (l0x0) this.e.e;
        ((RecyclerView) l0x0Var.b).addOnLayoutChangeListener(new eg7(l0x0Var, (byte) 21));
        if (list.equals(list2)) {
            return;
        }
        this.i.invoke();
    }

    public final void n(int i, w611 w611Var) {
        g0z g0zVar = (g0z) w611Var;
        t7l1 t7l1Var = (t7l1) A(i);
        odr odrVar = g0zVar.U0;
        odrVar.f(t7l1Var.a);
        k0t k0tVar = g0zVar.V0;
        s7l1 s7l1Var = t7l1Var.b;
        ljj1 ljj1Var = s7l1Var.a;
        boolean z = s7l1Var.c;
        String str = s7l1Var.b;
        h0z h0zVar = g0zVar.W0;
        w75 w75Var = (w75) h0zVar.h.b;
        k0tVar.c(new vxz(new sqj1(ljj1Var, z, str, new rqj1("watch-feed-entrypoint-video-card", w75Var.b(), w75Var.a(), w75Var.c()), String.valueOf(t7l1Var.hashCode()))));
        odrVar.n(new f0z(g0zVar, h0zVar, (byte) 0));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        int measuredWidth;
        int paddingEnd;
        int iE = e();
        f3a f3aVar = (f3a) this.e.f;
        f3aVar.getClass();
        if (iE > 3) {
            measuredWidth = viewGroup.getMeasuredWidth();
            paddingEnd = viewGroup.getPaddingStart();
        } else {
            measuredWidth = viewGroup.getMeasuredWidth() - viewGroup.getPaddingStart();
            paddingEnd = viewGroup.getPaddingEnd();
        }
        int i2 = measuredWidth - paddingEnd;
        int iMin = Math.min(f3aVar.b, (int) ((i2 - (yoi1.q(iE - 1, new tr80(2, 3, 1)) * f3aVar.a)) / ((Number) yoi1.u(Float.valueOf(iE), new jsg(3.0f, 3.3f))).floatValue()));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iMin, (int) ((iMin * 16) / 9.0f));
        odr odrVarA = this.f.a((l0i) null);
        ((RoundedConstraintLayout) odrVarA.e).setLayoutParams(layoutParams);
        return new g0z(this, odrVarA);
    }

    public final void t(w611 w611Var) {
        this.X.add((g0z) w611Var);
    }

    public final void u(w611 w611Var) {
        g0z g0zVar = (g0z) w611Var;
        this.X.remove(g0zVar);
        g0zVar.V0.c(zyz.g);
    }
}
