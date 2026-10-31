package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ljk implements h8l {
    public final ga00 a;
    public final rxk0 b;
    public final cfd c;
    public final i7d d;
    public final yqg e;
    public final nsg f;
    public final idd1 g;
    public final idd1 h;
    public nx30 i;
    public final qzh t;

    public ljk(xfx xfxVar, gw70 gw70Var, LayoutInflater layoutInflater, ga00 ga00Var, rxk0 rxk0Var, cfd cfdVar, i7d i7dVar, yqg yqgVar) {
        this.a = ga00Var;
        this.b = rxk0Var;
        this.c = cfdVar;
        this.d = i7dVar;
        this.e = yqgVar;
        byte b = 0;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624455, (ViewGroup) null, false);
        int i = 2131428249;
        CoordinatorLayout coordinatorLayoutT = m5n1.t(constraintLayoutInflate, 2131428249);
        if (coordinatorLayoutT != null) {
            i = 2131430271;
            ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131430271);
            if (composeViewT != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                this.f = new nsg(composeViewT, constraintLayout, coordinatorLayoutT);
                this.g = new idd1(fki.d1);
                this.h = new idd1(fki.c1);
                ufx ufxVar = xfxVar.d;
                zmr zmrVar = new zmr(ufxVar.a, ufxVar.b, true);
                this.t = zmrVar;
                rwq0.s(constraintLayout, zrj.N0);
                coordinatorLayoutT.addView((BehaviorRetainingAppBarLayout) zmrVar.d.b, 0);
                composeViewT.setContent(new j2i(-655304348, new jjk(this, gw70Var, b), true));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        bpb1 bpb1Var = (wen0) this.h.getValue();
        m42 m42Var = new m42(consumer, (byte) 7);
        bpb1 bpb1Var2 = bpb1Var;
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, m42Var);
        this.t.n(new kjk(this, consumer, (byte) 0));
        cfd cfdVar = this.c;
        i8h1 i8h1Var = (i8h1) ((kly0) cfdVar.b).get();
        rxk0 rxk0Var = (rxk0) cfdVar.c;
        rxk0Var.getClass();
        x6h1 x6h1VarC = rxk0Var.b.c();
        x6h1VarC.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = rxk0Var.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = rxk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
        return new rp(this, (byte) 16);
    }

    public final Object getView() {
        return this.f.a;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
