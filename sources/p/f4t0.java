package p;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f4t0 implements f4h1 {
    public final q9l1 N0;
    public int O0;
    public final vku P0 = new vku();
    public boolean Q0;
    public t480 R0;
    public final kz50 S0;
    public final q9l1 X;
    public final v7m0 Y;
    public final hcl1 Z;
    public final phi0 a;
    public final ArrayList b;
    public final s9l1 c;
    public final j4t0 d;
    public final fq10 e;
    public final vi11 f;
    public final abu g;
    public final i4t0 h;
    public final hcl1 i;
    public final bcl1 t;

    public f4t0(phi0 phi0Var, Bundle bundle, ArrayList arrayList, o7r0 o7r0Var, dg30 dg30Var, s9l1 s9l1Var, fal1 fal1Var, j4t0 j4t0Var, cir0 cir0Var, fq10 fq10Var, vi11 vi11Var, abu abuVar, i4t0 i4t0Var, jxp0 jxp0Var, hcl1 hcl1Var, bcl1 bcl1Var, q9l1 q9l1Var, v7m0 v7m0Var, hcl1 hcl1Var2, lxp lxpVar, q9l1 q9l1Var2) {
        this.a = phi0Var;
        this.b = arrayList;
        this.c = s9l1Var;
        this.d = j4t0Var;
        this.e = fq10Var;
        this.f = vi11Var;
        this.g = abuVar;
        this.h = i4t0Var;
        this.i = hcl1Var;
        this.t = bcl1Var;
        this.X = q9l1Var;
        this.Y = v7m0Var;
        this.Z = hcl1Var2;
        this.N0 = q9l1Var2;
        ComposeView composeView = (ComposeView) phi0Var.f;
        mxp mxpVar = (mxp) lxpVar.a.c;
        v7m0 v7m0Var2 = (v7m0) mxpVar.p0.get();
        cce cceVarD = mxpVar.d();
        d8u d8uVar = mxpVar.a;
        gw70 gw70VarB = d8uVar.B();
        c8o.l(gw70VarB);
        pe peVarA = d8uVar.a();
        c8o.l(peVarA);
        this.S0 = new kz50(v7m0Var2, cceVarD, gw70VarB, peVarA, (q9l1) mxpVar.g.get(), (dbp) mxpVar.f2.get(), composeView);
        cir0Var.j(new pd8(this, (byte) 13));
        ViewPager2 viewPager2 = (ViewPager2) phi0Var.c;
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(new b4t0(bundle, viewPager2, arrayList, o7r0Var, dg30Var, fal1Var, cir0Var));
        viewPager2.setUserInputEnabled(arrayList.size() > 1);
        RecyclerView recyclerViewQ = jhc1.q(0, viewPager2);
        m191 m191Var = new m191();
        m191Var.b = -1;
        recyclerViewQ.l(m191Var);
        recyclerViewQ.m(m191Var);
        viewPager2.b(new d4t0(viewPager2, this));
        q9l1Var.g = viewPager2;
    }

    public final Object getView() {
        return (ConstraintLayout) this.a.d;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        z511 adapter = ((ViewPager2) this.a.c).getAdapter();
        b4t0 b4t0Var = adapter instanceof b4t0 ? (b4t0) adapter : null;
        if (b4t0Var != null) {
            for (z3t0 z3t0Var : b4t0Var.X) {
                b4t0.A(z3t0Var);
                bundle.putBundle(z3t0Var.a, z3t0Var.g.a);
                bundle.putBundle(z3t0Var.b, z3t0Var.g.b);
                bundle.putSparseParcelableArray(z3t0Var.c, z3t0Var.g.c);
            }
            bundle.putBoolean("watch_feed_playback_mute_state_key", ((Boolean) b4t0Var.i.d.getValue()).booleanValue());
            b4t0Var.d = bundle;
        }
        ArrayList<fbr0> arrayList = this.b;
        if (arrayList.size() > 1) {
            Bundle bundle2 = new Bundle();
            for (fbr0 fbr0Var : arrayList) {
                bundle2.putParcelable(fbr0Var.b, fbr0Var.c);
            }
            bundle.putBundle("pivoting_additional_page_parameters", bundle2);
        }
        return bundle;
    }

    public final void start() {
        ug7 ug7Var;
        ComposeView composeView = (ComposeView) this.a.f;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        s9l1 s9l1Var = this.c;
        kz50 kz50Var = this.S0;
        if (size > 1) {
            ((bpb1) kz50Var.g).l(s9l1Var.a);
            bpb1 bpb1Var = (bpb1) kz50Var.h;
            Boolean bool = Boolean.TRUE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
            composeView.setVisibility(0);
        } else {
            bpb1 bpb1Var2 = (bpb1) kz50Var.h;
            Boolean bool2 = Boolean.FALSE;
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, bool2);
            composeView.setVisibility(8);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fbr0) it.next()).c);
        }
        this.h.a = arrayList2;
        cbq0 cbq0Var = s9l1Var.f;
        boolean z = (cbq0Var == null || (ug7Var = cbq0Var.b) == null) ? false : ug7Var.e;
        String strA = bbu.a(this.g);
        if (strA == null) {
            hhg1.n("Required value was null.");
            return;
        }
        bma1 bma1VarN = bma1.b.n("watch_feed_tooltip_onboarding_user_".concat(strA));
        vi11 vi11Var = this.f;
        Disposable disposableSubscribe = yoi1.i(((dma1) vi11Var.b).q(bma1VarN), o6x.a).filter(w1x0.P0).map(y1x0.X).startWith(Observable.fromCallable(new tt71(vi11Var, bma1VarN, (byte) 0))).distinctUntilChanged().filter(new m980((byte) 23, z)).flatMap(new swm0(this, (byte) 21)).subscribe(new e4t0(this, (byte) 0));
        vku vkuVar = this.P0;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(this.i.i.filter(zi20.U0).subscribe(new e4t0(this, (byte) 1)));
        vkuVar.a(this.Z.e.subscribe(new e4t0(this, (byte) 2)));
    }

    public final void stop() {
        bpb1 bpb1Var = (bpb1) this.S0.h;
        Boolean bool = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
        this.P0.c();
        this.h.a = null;
    }
}
