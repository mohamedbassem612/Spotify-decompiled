package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ib3 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
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
    public final Object f12p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public ib3(kt1 kt1Var, jt1 jt1Var) {
        this.a = jt1Var;
        this.b = kt1Var;
        byte b = 5;
        this.c = xqu.b(new fwo(this, 1, b));
        this.d = new fwo(this, 2, b);
        this.e = iy81.a(new fwo(this, 3, b));
        this.f = xqu.b(new fwo(this, 4, b));
        this.g = new fwo(this, 6, b);
        this.h = iy81.a(new fwo(this, b, b));
        this.i = xqu.b(new fwo(this, 7, b));
        this.j = iy81.a(new fwo(this, 8, b));
        this.k = xqu.b(new fwo(this, 9, b));
        this.l = new fwo(this, 12, b);
        this.m = new fwo(this, 13, b);
        this.n = new fwo(this, 14, b);
        this.o = new fwo(this, 15, b);
        this.f12p = new fwo(this, 16, b);
        this.q = new fwo(this, 17, b);
        this.r = new fwo(this, 18, b);
        this.s = new fwo(this, 19, b);
        this.t = new fwo(this, 11, b);
        this.u = xqu.b(new fwo(this, 21, b));
        this.v = new fwo(this, 20, b);
        this.w = new fwo(this, 22, b);
        this.x = iy81.a(new fwo(this, 23, b));
        this.y = xqu.b(new fwo(this, 24, b));
        this.z = xqu.b(new fwo(this, 25, b));
        this.A = xqu.b(new fwo(this, 10, b));
        this.B = new fwo(this, 27, b);
        this.C = new fwo(this, 26, b);
        this.D = xqu.b(new fwo(this, 28, b));
        this.E = xqu.b(new fwo(this, 29, b));
        this.F = xqu.b(new fwo(this, 30, b));
        this.G = xqu.b(new fwo(this, 31, b));
        this.H = iy81.a(new fwo(this, 0, b));
        this.I = xqu.b(new fwo(this, 32, b));
    }

    public eyh0 a() {
        Context context = (Context) ((fwo) this.d).get();
        kt1 kt1Var = (kt1) this.b;
        Activity activity = (Activity) kt1Var.a.a;
        c8o.l(activity);
        wt1 wt1VarB = b();
        kt91 kt91Var = (kt91) kt1Var.o.get();
        c8o.l(kt91Var);
        a1r0 a1r0Var = (a1r0) kt1Var.x.get();
        c8o.l(a1r0Var);
        return new eyh0(context, activity, wt1VarB, kt91Var, a1r0Var);
    }

    public wt1 b() {
        n6r0 n6r0VarP = kmq0.p((jt1) this.a);
        i8h1 i8h1Var = (i8h1) ((jly0) this.c).get();
        c8o.l(((kt1) this.b).c());
        return new wt1(n6r0VarP, i8h1Var, c());
    }

    public av1 c() {
        Bundle bundleO0 = ((jt1) this.a).O0();
        String string = bundleO0.getString("username", "");
        String string2 = bundleO0.getString("source_view_uri", "");
        String string3 = bundleO0.getString("source_context_uri", "");
        List stringArrayList = bundleO0.getStringArrayList("item_uris");
        if (stringArrayList == null) {
            stringArrayList = z6x.a;
        }
        List list = stringArrayList;
        ay1 ay1Var = (gy1) bundleO0.getParcelable("use_case");
        if (ay1Var == null) {
            ay1Var = ay1.a;
        }
        boolean z = bundleO0.getBoolean("force_expanded", false);
        w7x w7xVar = w7x.a;
        return new av1(string, null, string2, list, string3, w7xVar, false, w7xVar, ay1Var, z, w7xVar);
    }

    public tx4 d() {
        luk lukVar = (luk) ((kt1) this.b).y.get();
        c8o.l(lukVar);
        return new tx4(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    public jhm e(String str, String str2, boolean z, boolean z2, boolean z3) {
        tkx tkxVar;
        int i;
        yu3 yu3Var = (yu3) this.c;
        String str3 = (String) this.u;
        if (z2) {
            tkxVar = tkx.c;
        } else if (z) {
            tkxVar = z3 ? epx.c : nrx.c;
        } else {
            tkxVar = fux.c;
        }
        tkx tkxVar2 = tkxVar;
        if (z2) {
            i = z ? 2131954464 : 2131954324;
        } else if (str2 == null || str2.toLowerCase(Locale.ROOT).equals("context")) {
            ixu0 ixu0Var = nyu0.e;
            if (!z) {
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str);
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, ixu0Var)) {
                    i = 2131953982;
                } else {
                    if (i4a.a[s4b1VarX.c.ordinal()] == 1) {
                        i = 2131953981;
                    } else {
                        i = 2131954384;
                    }
                }
            } else if (z3) {
                i = 2131953990;
            } else {
                Set set2 = s4b1.f;
                s4b1 s4b1VarX2 = uic.x(str);
                v5b1 v5b1Var2 = s4b1VarX2.d;
                if (u890.j(v5b1Var2 != null ? v5b1Var2.getType() : null, ixu0Var)) {
                    i = 2131953989;
                } else {
                    if (i4a.a[s4b1VarX2.c.ordinal()] == 1) {
                        i = 2131953988;
                    } else {
                        i = 2131954470;
                    }
                }
            }
        } else if (z && z3) {
            i = 2131953990;
        } else if (z) {
            i = 2131954470;
        } else {
            i = 2131954384;
        }
        Integer numValueOf = Integer.valueOf(i);
        ygm ygmVar = new ygm(3);
        hhm hhmVar = hhm.a;
        if (z2 && z) {
            hhmVar = hhm.c;
        }
        return new jhm("collection_ban_track", tkxVar2, (fhm) null, numValueOf, (String) null, false, (tm81) null, new ihm(ygmVar, hhmVar, new ghm(fr9.a1, new cl1(z, str3, (byte) 4)), new j4a(yu3Var, str3, z, str, str2, z2)), 244);
    }

    public hqo f() {
        Object obj = this.h;
        ruz ruzVarA = ((cyp) ((jly0) obj).get()).a();
        Object obj2 = this.b;
        nnf1 nnf1Var = (nnf1) obj2;
        tmf1 tmf1Var = (tmf1) this.a;
        Flowable flowable = (Flowable) tmf1Var.r.get();
        c8o.l(flowable);
        muz muzVarD = ((cyp) ((jly0) obj).get()).d();
        y390 y390Var = (y390) tmf1Var.l.get();
        c8o.l(y390Var);
        String strPath = kmq0.p(nnf1Var).path();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-track-page-free";
        x6h1VarI.f = "5.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = strPath;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("free-tier-track");
        r6h1 r6h1Var = r6h1.c;
        wr00 wr00VarA = y390Var.a(nnf1Var, new r6h1(kk0.l(y6h1VarA), (u8h1) null));
        zr00 zr00Var = (zr00) tmf1Var.m.get();
        c8o.l(zr00Var);
        b7r0 b7r0Var = (b7r0) tmf1Var.n.get();
        c8o.l(b7r0Var);
        gn10 gn10VarR = j310.r(nnf1Var);
        String str = (String) tmf1Var.F.get();
        c8o.l(str);
        return new hqo(ruzVarA, nnf1Var, flowable, new pjt0(muzVarD, new oi(wr00VarA, zr00Var, nnf1Var), new hl00(nnf1Var, (byte) 13), (i8h1) ((jly0) this.d).get(), (nnf1) obj2, b7r0Var, d8.b(gn10VarR, str, d8.c(nnf1Var), wwo1.D(nnf1Var))));
    }

    public yjq g() {
        kt1 kt1Var = (kt1) this.b;
        xrc0 xrc0Var = (xrc0) kt1Var.k.get();
        c8o.l(xrc0Var);
        av1 av1VarC = c();
        q8n q8nVar = (q8n) kt1Var.g.get();
        c8o.l(q8nVar);
        uu00 uu00Var = (uu00) kt1Var.G.get();
        c8o.l(uu00Var);
        luk lukVar = (luk) kt1Var.y.get();
        c8o.l(lukVar);
        return new yjq(xrc0Var, av1VarC, q8nVar, uu00Var, new vo4(false, lukVar));
    }

    public boolean h() {
        tmf1 tmf1Var = (tmf1) this.a;
        luk lukVar = (luk) tmf1Var.z.get();
        c8o.l(lukVar);
        return td70.b(new qm4(false, lukVar), ((Boolean) tmf1Var.U.get()).booleanValue());
    }

    public pbq i() {
        kt1 kt1Var = (kt1) this.b;
        xrc0 xrc0Var = (xrc0) kt1Var.k.get();
        c8o.l(xrc0Var);
        iyc0 iyc0Var = (iyc0) kt1Var.l.get();
        c8o.l(iyc0Var);
        rpm1 rpm1Var = (rpm1) kt1Var.r.get();
        c8o.l(rpm1Var);
        av1 av1VarC = c();
        agc0 agc0VarC = kt1Var.c();
        c8o.l(agc0VarC);
        cfr cfrVar = (cfr) kt1Var.s.get();
        c8o.l(cfrVar);
        r5h r5hVar = (r5h) kt1Var.J.get();
        c8o.l(r5hVar);
        yjq yjqVarG = g();
        dv00 dv00Var = (dv00) kt1Var.H.get();
        c8o.l(dv00Var);
        w0r w0rVar = new w0r(dv00Var);
        vlo vloVarB = kt1Var.b();
        c8o.l(vloVarB);
        xrm1 xrm1Var = (xrm1) kt1Var.A.get();
        c8o.l(xrm1Var);
        return new pbq(xrc0Var, iyc0Var, rpm1Var, av1VarC, agc0VarC, cfrVar, r5hVar, yjqVarG, w0rVar, vloVarB, xrm1Var, (cqa1) ((jly0) this.k).get());
    }

    public zud0 j() {
        tmf1 tmf1Var = (tmf1) this.a;
        ov20 ov20Var = (ov20) tmf1Var.b.get();
        c8o.l(ov20Var);
        luk lukVar = (luk) tmf1Var.z.get();
        c8o.l(lukVar);
        return new zud0(new drj0(ov20Var, new vn4(false, lukVar), (byte) 26), (byte) 29);
    }

    public ib3(f971 f971Var, jl21 jl21Var, yu3 yu3Var, uf0 uf0Var, oh41 oh41Var, dc31 dc31Var, oy1 oy1Var, oy1 oy1Var2, ke71 ke71Var, cab cabVar, t2 t2Var, i6c i6cVar, in8 in8Var, kr60 kr60Var, gmt gmtVar, yje yjeVar, ua91 ua91Var, e821 e821Var, k811 k811Var, kqi0 kqi0Var, kdy0 kdy0Var, dxy dxyVar, vi11 vi11Var, gmt gmtVar2, efr efrVar, mta mtaVar, i6b i6bVar, ic9 ic9Var, nuh0 nuh0Var, mxr mxrVar, st60 st60Var, ltf1 ltf1Var, ajq0 ajq0Var, twb twbVar, yo31 yo31Var, String str, lik1 lik1Var) {
        this.a = f971Var;
        this.b = jl21Var;
        this.c = yu3Var;
        this.d = uf0Var;
        this.e = oh41Var;
        this.f = dc31Var;
        this.g = oy1Var;
        this.h = oy1Var2;
        this.i = ke71Var;
        this.j = cabVar;
        this.k = t2Var;
        this.l = i6cVar;
        this.m = in8Var;
        this.n = kr60Var;
        this.o = gmtVar;
        this.f12p = yjeVar;
        this.q = ua91Var;
        this.r = e821Var;
        this.s = k811Var;
        this.t = kqi0Var;
        this.v = kdy0Var;
        this.w = dxyVar;
        this.x = vi11Var;
        this.y = gmtVar2;
        this.z = efrVar;
        this.A = i6bVar;
        this.B = ic9Var;
        this.C = nuh0Var;
        this.D = mxrVar;
        this.E = st60Var;
        this.F = ltf1Var;
        this.G = ajq0Var;
        this.H = yo31Var;
        this.u = str;
        this.I = lik1Var;
    }

    public ib3(r8r0 r8r0Var, q8r0 q8r0Var, q7r0 q7r0Var) {
        this.a = r8r0Var;
        this.b = q7r0Var;
        this.c = xqu.b(new ywp(this, 0, (byte) 5));
        this.d = new ywp(this, 3, (byte) 5);
        this.e = new ywp(this, 4, (byte) 5);
        this.f = new ywp(this, 2, (byte) 5);
        this.g = new ywp(this, 1, (byte) 5);
        this.h = new ywp(this, 7, (byte) 5);
        this.i = new ywp(this, 8, (byte) 5);
        this.j = new ywp(this, 9, (byte) 5);
        this.k = new ywp(this, 10, (byte) 5);
        this.l = new ywp(this, 11, (byte) 5);
        this.m = new ywp(this, 6, (byte) 5);
        this.n = new ywp(this, 5, (byte) 5);
        this.o = new ywp(this, 14, (byte) 5);
        this.f12p = new ywp(this, 15, (byte) 5);
        this.q = new ywp(this, 16, (byte) 5);
        this.r = new ywp(this, 17, (byte) 5);
        this.s = new ywp(this, 18, (byte) 5);
        this.t = new ywp(this, 19, (byte) 5);
        this.u = new ywp(this, 20, (byte) 5);
        this.v = new ywp(this, 21, (byte) 5);
        this.w = new ywp(this, 22, (byte) 5);
        this.x = new ywp(this, 23, (byte) 5);
        this.y = new ywp(this, 24, (byte) 5);
        this.z = new ywp(this, 25, (byte) 5);
        this.A = new ywp(this, 26, (byte) 5);
        this.B = new ywp(this, 13, (byte) 5);
        this.C = new ywp(this, 12, (byte) 5);
        this.D = new ywp(this, 29, (byte) 5);
        this.E = new ywp(this, 30, (byte) 5);
        this.F = new ywp(this, 28, (byte) 5);
        this.G = new ywp(this, 27, (byte) 5);
        this.H = iy81.a(new ywp(this, 31, (byte) 5));
        this.I = new ywp(this, 32, (byte) 5);
    }

    public ib3(yqg yqgVar, ojv0 ojv0Var, Context context, gw70 gw70Var, lzn0 lzn0Var, vgm vgmVar, htr htrVar, luk lukVar, ycm ycmVar, ov20 ov20Var, b7r0 b7r0Var, xrc0 xrc0Var, zut0 zut0Var, h5q h5qVar, n3d0 n3d0Var, i8h1 i8h1Var, g3q0 g3q0Var, ugn0 ugn0Var, dma1 dma1Var, xfx xfxVar, agc0 agc0Var, String str, cyp cypVar, iac0 iac0Var, qns0 qns0Var, vb2 vb2Var, yh2 yh2Var, zr00 zr00Var, y390 y390Var, upp0 upp0Var, mr20 mr20Var, String str2, e9g1 e9g1Var, c3s c3sVar, nwt nwtVar, nfa0 nfa0Var) {
        this.a = yqgVar;
        this.b = ojv0Var;
        this.c = context;
        this.d = gw70Var;
        this.e = lzn0Var;
        this.f = vgmVar;
        this.g = lukVar;
        this.h = ycmVar;
        this.i = ov20Var;
        this.j = b7r0Var;
        this.k = xrc0Var;
        this.l = zut0Var;
        this.m = h5qVar;
        this.n = n3d0Var;
        this.o = i8h1Var;
        this.f12p = g3q0Var;
        this.q = ugn0Var;
        this.r = dma1Var;
        this.s = xfxVar;
        this.t = agc0Var;
        this.u = str;
        this.w = cypVar;
        this.x = iac0Var;
        this.y = qns0Var;
        this.z = vb2Var;
        this.A = yh2Var;
        this.B = zr00Var;
        this.C = y390Var;
        this.D = upp0Var;
        this.E = mr20Var;
        this.v = str2;
        this.F = e9g1Var;
        this.G = c3sVar;
        this.H = nwtVar;
        this.I = nfa0Var;
    }

    public ib3(tmf1 tmf1Var, nnf1 nnf1Var) {
        this.a = tmf1Var;
        this.b = nnf1Var;
        this.c = eqq.o(this, 4);
        this.d = eqq.o(this, 3);
        this.e = xqu.b(new tsq(this, 5, (byte) 5));
        this.f = eqq.o(this, 6);
        this.g = eqq.o(this, 8);
        this.h = eqq.o(this, 9);
        this.i = eqq.o(this, 11);
        this.j = iy81.a(new tsq(this, 10, (byte) 5));
        this.k = xqu.b(new tsq(this, 7, (byte) 5));
        this.l = eqq.o(this, 12);
        this.m = xqu.b(new tsq(this, 13, (byte) 5));
        this.n = new tsq(this, 14, (byte) 5);
        this.o = eqq.o(this, 15);
        this.f12p = eqq.o(this, 2);
        this.q = eqq.o(this, 16);
        this.r = eqq.o(this, 1);
        this.s = eqq.o(this, 17);
        this.t = eqq.o(this, 0);
        this.u = eqq.o(this, 18);
        xqu.b(new tsq(this, 19, (byte) 5));
        this.v = new tsq(this, 21, (byte) 5);
        this.w = eqq.o(this, 22);
        this.x = eqq.o(this, 25);
        this.y = new tsq(this, 24, (byte) 5);
        this.z = new tsq(this, 26, (byte) 5);
        this.A = new tsq(this, 27, (byte) 5);
        this.B = eqq.o(this, 23);
        this.C = eqq.o(this, 20);
        this.D = eqq.o(this, 30);
        this.E = eqq.o(this, 31);
        this.F = xqu.b(jo80.a(nnf1Var));
        this.G = eqq.o(this, 29);
        this.H = iy81.a(new tsq(this, 28, (byte) 5));
        this.I = eqq.o(this, 32);
    }
}
