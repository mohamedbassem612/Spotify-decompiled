package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rak implements h8l {
    public final oak X;
    public final bqk0 Y;
    public final dtw Z;
    public final p2o0 a;
    public final q7r0 b;
    public final d520 c;
    public final yqg d;
    public final Bundle e;
    public final l2a f;
    public final idd1 g;
    public final bpb1 h;
    public final bpb1 i;
    public es41 t;

    public rak(LayoutInflater layoutInflater, g7p g7pVar, nak nakVar, p2o0 p2o0Var, d0r d0rVar, q7r0 q7r0Var, d520 d520Var, yqg yqgVar, Bundle bundle) {
        this.a = p2o0Var;
        this.b = q7r0Var;
        this.c = d520Var;
        this.d = yqgVar;
        this.e = bundle;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624450, (ViewGroup) null, false);
        int i = 2131428166;
        ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428166);
        if (composeViewT != null) {
            i = 2131428167;
            if (m5n1.t(constraintLayoutInflate, 2131428167) != null) {
                i = 2131428200;
                CoordinatorLayout coordinatorLayoutT = m5n1.t(constraintLayoutInflate, 2131428200);
                if (coordinatorLayoutT != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    this.f = new l2a(composeViewT, constraintLayout, coordinatorLayoutT);
                    this.g = new idd1(fki.Z0);
                    this.h = gio1.b((Object) null);
                    this.i = gio1.b(Boolean.FALSE);
                    this.X = new oak(this, (byte) 1);
                    xhk1.c(constraintLayout, new h3h1(new oak(this, (byte) 0)));
                    this.Y = new bqk0(nakVar.b, (byte) 29);
                    tka0 tka0Var = dtw.C;
                    Context context = layoutInflater.getContext();
                    x2p x2pVar = (x2p) g7pVar.a.c;
                    mak makVar = (mak) x2pVar.c;
                    gw70 gw70Var = (gw70) ((mak) x2pVar.c).e.get();
                    c8o.l(gw70Var);
                    lzn0 lzn0Var = (lzn0) makVar.c.get();
                    c8o.l(lzn0Var);
                    y1t0 y1t0VarL = x2pVar.l();
                    i4q i4qVar = (i4q) makVar.p.get();
                    c8o.l(i4qVar);
                    f971 f971Var = (f971) makVar.q.get();
                    c8o.l(f971Var);
                    sd41 sd41Var = (sd41) makVar.o.get();
                    c8o.l(sd41Var);
                    dtw dtwVarB = mhc.b(context, coordinatorLayoutT, new sbk(gw70Var, lzn0Var, y1t0VarL, i4qVar, f971Var, sd41Var, new lbs((h7p) x2pVar.b.get()), d0rVar), new nbk(2047, null, null, null, null, null), (ipb1) null, 112);
                    this.Z = dtwVarB;
                    coordinatorLayoutT.addView(dtwVarB.w, 0);
                    composeViewT.setContent(new j2i(1052831401, new boj(this, (byte) 14), true));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        bpb1 bpb1Var = this.h;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, consumer);
        return new rp(this, (byte) 15);
    }

    public final Object getView() {
        return (ConstraintLayout) this.f.b;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        es41 es41Var = this.t;
        bundle.putInt("scroll-value", es41Var != null ? es41Var.a.s() : 0);
        return bundle;
    }

    public final void start() {
        Boolean bool = Boolean.TRUE;
        bpb1 bpb1Var = this.i;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }

    public final void stop() {
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1Var = this.i;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }
}
