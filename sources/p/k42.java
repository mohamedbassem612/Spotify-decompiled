package p;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k42 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f25p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;

    public k42(lof lofVar, pof pofVar, q7r0 q7r0Var) {
        this.a = lofVar;
        this.b = q7r0Var;
        this.c = pofVar;
        this.d = new b2p(this, 0, (byte) 20);
        this.e = xqu.b(new b2p(this, 1, (byte) 20));
        this.f = xqu.b(new b2p(this, 2, (byte) 20));
        this.g = iy81.a(new b2p(this, 4, (byte) 20));
        this.h = xqu.b(new b2p(this, 6, (byte) 20));
        this.i = xqu.b(new b2p(this, 5, (byte) 20));
        this.j = iy81.a(new b2p(this, 7, (byte) 20));
        this.k = iy81.a(new b2p(this, 3, (byte) 20));
        this.l = xqu.b(new b2p(this, 9, (byte) 20));
        this.m = xqu.b(new b2p(this, 12, (byte) 20));
        this.n = iy81.a(new b2p(this, 11, (byte) 20));
        this.o = xqu.b(new b2p(this, 10, (byte) 20));
        this.f25p = iy81.a(new b2p(this, 14, (byte) 20));
        this.q = xqu.b(new b2p(this, 13, (byte) 20));
        this.r = xqu.b(new b2p(this, 15, (byte) 20));
        this.s = iy81.a(new b2p(this, 8, (byte) 20));
        this.t = iy81.a(new b2p(this, 16, (byte) 20));
    }

    public d140 a() {
        lik1 lik1Var = (lik1) ((jly0) this.e).get();
        ivj ivjVar = (ivj) this.b;
        a8e0 a8e0VarA = ivjVar.a();
        c8o.l(a8e0VarA);
        gw70 gw70VarB = ivjVar.b();
        pe peVarJ = c13.j(gw70VarB, ivjVar);
        c8o.l(ivjVar.f());
        hvj hvjVar = new hvj(a8e0VarA, new q3b1(gw70VarB, peVarJ));
        h140 h140Var = (h140) this.a;
        e140 e140Var = (e140) this.c;
        RetrofitMaker retrofitMaker = (RetrofitMaker) e140Var.d.get();
        c8o.l(retrofitMaker);
        z431 z431Var = new z431((g631) retrofitMaker.createWebgateService(g631.class, "android-musicquiz-network-results"));
        RetrofitMaker retrofitMaker2 = (RetrofitMaker) e140Var.d.get();
        c8o.l(retrofitMaker2);
        return new d140(lik1Var, hvjVar, h140Var, z431Var, new e5l0((p7n0) retrofitMaker2.createWebgateService(p7n0.class, "android-musicquiz-network-quizui"), (byte) 3), (rip) ((jly0) this.t).get(), (zja1) ((jly0) this.q).get());
    }

    public void b() {
        bpb1 bpb1Var = (bpb1) this.f25p;
        m6l1 m6l1Var = m6l1.c;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, m6l1Var);
        bpb1 bpb1Var2 = (bpb1) this.q;
        Boolean bool = Boolean.FALSE;
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, bool);
        ((hcl1) this.k).c.l((Object) null);
        ((n8l1) this.n).a();
        op71.s((j0d1) this.r);
    }

    public er0 c() {
        return (er0) ((kly0) this.e).get();
    }

    public g0l d() {
        return (g0l) this.k;
    }

    public wen0 e() {
        return (wen0) this.c;
    }

    public Flowable f() {
        return (Flowable) this.a;
    }

    public b1y g() {
        return (b1y) this.f;
    }

    public k42(cce cceVar, dbp dbpVar, q9l1 q9l1Var, q9l1 q9l1Var2, fbp fbpVar, abu abuVar, pe peVar, gw70 gw70Var, bcl1 bcl1Var, hcl1 hcl1Var, hcl1 hcl1Var2, m0t m0tVar, fq10 fq10Var, q8n q8nVar, ViewGroup viewGroup, n8l1 n8l1Var) {
        this.a = cceVar;
        this.b = dbpVar;
        this.c = q9l1Var;
        this.d = q9l1Var2;
        this.e = fbpVar;
        this.f = abuVar;
        this.g = peVar;
        this.h = gw70Var;
        this.i = bcl1Var;
        this.j = hcl1Var;
        this.k = hcl1Var2;
        this.l = m0tVar;
        this.m = fq10Var;
        this.n = n8l1Var;
        this.o = gio1.b((Object) null);
        this.f25p = gio1.b(m6l1.b);
        this.q = gio1.b(Boolean.FALSE);
        j0d1 j0d1VarB = guo1.B();
        this.r = j0d1VarB;
        this.s = smo1.e(flo1.l(j0d1VarB, q8nVar));
        ComposeView composeView = new ComposeView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new j2i(-1610944024, new fak1(this, (byte) 6), true));
        this.t = composeView;
    }

    public k42(gib1 gib1Var, fib1 fib1Var) {
        this.a = fib1Var;
        this.b = gib1Var;
        this.c = new ipq(this, 1, (byte) 28);
        this.d = xqu.b(new ipq(this, 2, (byte) 28));
        this.e = new ipq(this, 3, (byte) 28);
        this.f = new ipq(this, 4, (byte) 28);
        this.g = new ipq(this, 5, (byte) 28);
        this.h = new ipq(this, 7, (byte) 28);
        this.i = xqu.b(new ipq(this, 6, (byte) 28));
        this.j = new ipq(this, 8, (byte) 28);
        this.k = new ipq(this, 9, (byte) 28);
        this.l = xqu.b(new ipq(this, 0, (byte) 28));
        this.m = new ipq(this, 11, (byte) 28);
        this.n = new ipq(this, 12, (byte) 28);
        this.o = new ipq(this, 13, (byte) 28);
        this.f25p = new ipq(this, 14, (byte) 28);
        this.q = new ipq(this, 15, (byte) 28);
        this.r = new ipq(this, 16, (byte) 28);
        this.s = new ipq(this, 10, (byte) 28);
        this.t = xqu.b(new ipq(this, 17, (byte) 28));
    }

    public /* synthetic */ k42(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.j = obj10;
        this.k = obj11;
        this.l = obj12;
        this.m = obj13;
        this.n = obj14;
        this.o = obj15;
        this.f25p = obj16;
        this.q = obj17;
        this.r = obj18;
        this.s = obj19;
        this.t = obj20;
    }

    public k42(e140 e140Var, ivj ivjVar, h140 h140Var, q7r0 q7r0Var) {
        this.a = h140Var;
        this.b = ivjVar;
        this.c = e140Var;
        this.d = q7r0Var;
        this.e = xqu.b(new chp(this, 0, (byte) 12));
        this.f = xqu.b(new chp(this, 3, (byte) 12));
        this.g = iy81.a(new chp(this, 2, (byte) 12));
        this.h = iy81.a(new chp(this, 4, (byte) 12));
        this.i = iy81.a(new chp(this, 6, (byte) 12));
        this.j = iy81.a(new chp(this, 7, (byte) 12));
        this.k = iy81.a(new chp(this, 5, (byte) 12));
        this.l = xqu.b(new chp(this, 9, (byte) 12));
        this.m = iy81.a(new chp(this, 10, (byte) 12));
        this.n = iy81.a(new chp(this, 8, (byte) 12));
        this.o = xqu.b(new chp(this, 12, (byte) 12));
        this.f25p = xqu.b(new chp(this, 13, (byte) 12));
        this.q = xqu.b(new chp(this, 11, (byte) 12));
        this.r = xqu.b(new chp(this, 15, (byte) 12));
        this.s = xqu.b(new chp(this, 14, (byte) 12));
        this.t = iy81.a(new chp(this, 1, (byte) 12));
    }
}
