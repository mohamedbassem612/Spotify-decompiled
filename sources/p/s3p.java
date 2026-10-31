package p;

import android.content.Context;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3p implements dl4 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final Object V0;
    public final Object W0;
    public final Object X;
    public final Object X0;
    public final Object Y;
    public final Object Y0;
    public final Object Z;
    public final Object Z0;
    public final Object a;
    public final Object a1;
    public final Object b;
    public final Object b1;
    public final Object c;
    public final Object c1;
    public final Object d;
    public final Object d1;
    public final Object e;
    public final Object e1;
    public final Object f;
    public final Object f1;
    public final Object g;
    public final Object g1;
    public final Object h;
    public final Object h1;
    public final Object i;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final Object o1;
    public final Object p1;
    public final Object q1;
    public final Object r1;
    public final Object s1;
    public final Object t;

    public s3p(daq daqVar, LyricsFullscreenPageActivity lyricsFullscreenPageActivity) {
        this.Y0 = daqVar;
        this.X0 = lyricsFullscreenPageActivity;
        this.a = xqu.b(new s2q(daqVar, this, 2, (byte) 12));
        this.b = xqu.b(new s2q(daqVar, this, 1, (byte) 12));
        this.Z0 = new s2q(daqVar, this, 0, (byte) 12);
        this.a1 = new s2q(daqVar, this, 4, (byte) 12);
        this.b1 = new s2q(daqVar, this, 6, (byte) 12);
        this.c1 = new s2q(daqVar, this, 5, (byte) 12);
        this.d1 = new s2q(daqVar, this, 7, (byte) 12);
        this.e1 = new s2q(daqVar, this, 8, (byte) 12);
        this.c = xqu.b(new s2q(daqVar, this, 3, (byte) 12));
        this.f1 = new s2q(daqVar, this, 9, (byte) 12);
        this.g1 = new s2q(daqVar, this, 12, (byte) 12);
        this.h1 = new s2q(daqVar, this, 11, (byte) 12);
        this.i1 = new s2q(daqVar, this, 14, (byte) 12);
        this.d = iy81.a(new s2q(daqVar, this, 13, (byte) 12));
        this.e = iy81.a(new s2q(daqVar, this, 15, (byte) 12));
        this.j1 = new s2q(daqVar, this, 16, (byte) 12);
        this.f = iy81.a(new s2q(daqVar, this, 18, (byte) 12));
        this.g = iy81.a(new s2q(daqVar, this, 19, (byte) 12));
        this.h = iy81.a(new s2q(daqVar, this, 17, (byte) 12));
        this.i = iy81.a(new s2q(daqVar, this, 21, (byte) 12));
        this.t = iy81.a(new s2q(daqVar, this, 20, (byte) 12));
        this.X = iy81.a(new s2q(daqVar, this, 23, (byte) 12));
        this.Y = iy81.a(new s2q(daqVar, this, 22, (byte) 12));
        this.Z = iy81.a(new s2q(daqVar, this, 24, (byte) 12));
        this.N0 = iy81.a(new s2q(daqVar, this, 25, (byte) 12));
        this.O0 = xqu.b(new s2q(daqVar, this, 27, (byte) 12));
        this.k1 = new s2q(daqVar, this, 26, (byte) 12);
        this.l1 = new s2q(daqVar, this, 28, (byte) 12);
        this.m1 = new s2q(daqVar, this, 29, (byte) 12);
        this.n1 = new s2q(daqVar, this, 30, (byte) 12);
        this.o1 = new s2q(daqVar, this, 31, (byte) 12);
        this.P0 = xqu.b(new s2q(daqVar, this, 33, (byte) 12));
        this.Q0 = xqu.b(new s2q(daqVar, this, 38, (byte) 12));
        this.R0 = xqu.b(new s2q(daqVar, this, 37, (byte) 12));
        this.p1 = new s2q(daqVar, this, 36, (byte) 12);
        this.S0 = iy81.a(new s2q(daqVar, this, 35, (byte) 12));
        this.T0 = xqu.b(new s2q(daqVar, this, 34, (byte) 12));
        this.U0 = xqu.b(new s2q(daqVar, this, 32, (byte) 12));
        this.V0 = iy81.a(new s2q(daqVar, this, 40, (byte) 12));
        this.W0 = xqu.b(new s2q(daqVar, this, 39, (byte) 12));
        this.q1 = iy81.a(new s2q(daqVar, this, 10, (byte) 12));
        this.r1 = new s2q(daqVar, this, 42, (byte) 12);
        this.s1 = xqu.b(new s2q(daqVar, this, 41, (byte) 12));
    }

    public static j0v0 c(k0v0 k0v0Var, String str, Object obj) {
        return new j0v0(l1d.k(k0v0Var.a, str, "_with_index_"), k0v0Var.b.b(), new yeu0(k0v0Var, obj, (byte) 7));
    }

    public vu4 a() {
        return new vu4(false, false, false, (luk) ((daq) this.Y0).L1.get());
    }

    public qop b() {
        return (qop) ((idd1) this.V0).getValue();
    }

    public aru0 d() {
        i7c i7cVar = (i7c) this.X0;
        gw70 gw70VarB = i7cVar.b();
        c8o.l(gw70VarB);
        luk lukVar = (luk) i7cVar.m.get();
        c8o.l(lukVar);
        m35 m35Var = new m35(false, lukVar);
        ycm ycmVar = (ycm) i7cVar.n.get();
        c8o.l(ycmVar);
        return new aru0(gw70VarB, m35Var, ycmVar, (byte) 21);
    }

    public myq0 e() {
        return new myq0((clm) ((b2p) this.e1).get(), xqu.a((b2p) this.l1), (byte) 19);
    }

    public ytp0 f() {
        i7c i7cVar = (i7c) this.X0;
        yh2 yh2Var = (yh2) i7cVar.V.get();
        c8o.l(yh2Var);
        vb2 vb2Var = (vb2) i7cVar.U.get();
        c8o.l(vb2Var);
        qns0 qns0Var = (qns0) i7cVar.T.get();
        c8o.l(qns0Var);
        zr00 zr00Var = (zr00) i7cVar.W.get();
        c8o.l(zr00Var);
        y390 y390Var = (y390) i7cVar.X.get();
        c8o.l(y390Var);
        iac0 iac0Var = ((q7r0) this.Z0).d.c;
        c8o.m(iac0Var);
        return new ytp0(yh2Var, zr00Var, y390Var.a(iac0Var, r6h1.c), qns0Var, vb2Var, (byte) 11);
    }

    public aru0 g() {
        return new aru0((yqg) ((b2p) this.k1).get(), (nwt) ((b2p) this.m1).get(), (clm) ((b2p) this.e1).get(), (byte) 20);
    }

    public vqb1 h() {
        daq daqVar = (daq) this.Y0;
        t8u0 t8u0Var = (t8u0) daqVar.d9.get();
        LyricsFullscreenPageActivity lyricsFullscreenPageActivity = (LyricsFullscreenPageActivity) this.X0;
        return new vqb1(t8u0Var.a(lyricsFullscreenPageActivity.getLifecycle()), (Flowable) daqVar.D5.get(), (loc1) ((s2q) this.i1).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get());
    }

    public void w(Object obj) {
        LyricsFullscreenPageActivity lyricsFullscreenPageActivity = (LyricsFullscreenPageActivity) obj;
        daq daqVar = (daq) this.Y0;
        ((t3b1) lyricsFullscreenPageActivity).b1 = (jgu) daqVar.a.g0.get();
        ((t3b1) lyricsFullscreenPageActivity).c1 = new tuk(xqu.a((s2q) this.Z0));
        lyricsFullscreenPageActivity.f1 = (a2k) ((jly0) this.c).get();
        lyricsFullscreenPageActivity.m1 = (gw70) daqVar.d8.get();
        lyricsFullscreenPageActivity.k1 = new mqp((mqp) ((jly0) this.q1).get(), (byte) 2);
        lyricsFullscreenPageActivity.l1 = (mwn0) daqVar.Wd.get();
        Object obj2 = this.s1;
        lyricsFullscreenPageActivity.j1 = (lir0) ((jly0) obj2).get();
        lyricsFullscreenPageActivity.h1 = (l6h1) ((jly0) obj2).get();
        lyricsFullscreenPageActivity.i1 = (n7h1) ((jly0) obj2).get();
        lyricsFullscreenPageActivity.g1 = (i8h1) ((jly0) obj2).get();
    }

    public s3p(Context context, ut71 ut71Var, ouz ouzVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, String str, ksk kskVar, c8c0 c8c0Var, n6r0 n6r0Var) {
        this.X0 = ouzVar;
        this.Y0 = list;
        this.Z0 = list2;
        this.a1 = list3;
        this.b1 = list4;
        this.c1 = list5;
        this.d1 = list6;
        this.e1 = list7;
        this.f1 = list8;
        this.g1 = list9;
        this.h1 = list10;
        this.i1 = list11;
        this.j1 = list12;
        this.k1 = list13;
        this.l1 = list14;
        this.m1 = list15;
        this.n1 = list16;
        this.o1 = list17;
        this.p1 = list18;
        this.q1 = list19;
        this.r1 = list20;
        this.s1 = list21;
        this.a = list22;
        this.b = list23;
        this.c = list24;
        this.d = list25;
        this.e = list26;
        this.f = list27;
        this.g = list28;
        this.h = list29;
        this.i = list30;
        this.t = list31;
        this.X = list32;
        this.Y = list33;
        this.Z = list34;
        this.N0 = list35;
        this.O0 = list36;
        this.P0 = list37;
        this.Q0 = list38;
        this.R0 = list39;
        this.S0 = str;
        this.T0 = c8c0Var;
        this.U0 = n6r0Var;
        this.V0 = new idd1(new pcp0(this, ut71Var, context, (byte) 29));
        this.W0 = new ewn0(kskVar, (byte) 25);
    }

    public s3p(i7c i7cVar, j7c j7cVar, q7r0 q7r0Var) {
        this.X0 = i7cVar;
        this.Y0 = j7cVar;
        this.Z0 = q7r0Var;
        byte b = 6;
        this.a1 = new b2p(this, 0, b);
        this.a = xqu.b(new b2p(this, 2, b));
        this.b = xqu.b(new b2p(this, 1, b));
        this.b1 = new b2p(this, 4, b);
        this.c = iy81.a(new b2p(this, 5, b));
        this.c1 = new b2p(this, b, b);
        this.d = iy81.a(new b2p(this, 7, b));
        this.e = iy81.a(new b2p(this, 8, b));
        this.d1 = new b2p(this, 11, b);
        this.f = iy81.a(new b2p(this, 12, b));
        this.g = iy81.a(new b2p(this, 10, b));
        this.h = iy81.a(new b2p(this, 9, b));
        this.i = iy81.a(new b2p(this, 13, b));
        this.t = iy81.a(new b2p(this, 15, b));
        this.X = iy81.a(new b2p(this, 14, b));
        this.Y = iy81.a(new b2p(this, 17, b));
        this.Z = iy81.a(new b2p(this, 16, b));
        this.e1 = new b2p(this, 20, b);
        this.f1 = new b2p(this, 23, b);
        this.g1 = new b2p(this, 22, b);
        this.h1 = new b2p(this, 24, b);
        this.i1 = new b2p(this, 25, b);
        this.j1 = new b2p(this, 26, b);
        this.k1 = new b2p(this, 27, b);
        this.l1 = new b2p(this, 21, b);
        this.N0 = iy81.a(new b2p(this, 19, b));
        this.O0 = iy81.a(new b2p(this, 18, b));
        this.m1 = new b2p(this, 30, b);
        this.n1 = new b2p(this, 32, b);
        this.o1 = new b2p(this, 33, b);
        this.p1 = new b2p(this, 36, b);
        this.P0 = xqu.b(new b2p(this, 35, b));
        this.Q0 = iy81.a(new b2p(this, 34, b));
        this.q1 = new b2p(this, 37, b);
        this.R0 = iy81.a(new b2p(this, 31, b));
        this.r1 = new b2p(this, 38, b);
        this.s1 = new b2p(this, 39, b);
        this.S0 = iy81.a(new b2p(this, 29, b));
        this.T0 = iy81.a(new b2p(this, 40, b));
        this.U0 = iy81.a(new b2p(this, 28, b));
        this.V0 = xqu.b(new b2p(this, 41, b));
        this.W0 = xqu.b(new b2p(this, 3, b));
    }
}
