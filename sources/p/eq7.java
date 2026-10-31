package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eq7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr51 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq7(Context context, vr51 vr51Var, byte b) {
        super(2);
        this.a = b;
        this.c = context;
        this.b = vr51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        Object jlw0Var;
        mq70 mq70Var;
        up70 up70VarA;
        byte b = this.a;
        vr51 vr51Var = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                lq7 lq7Var = (lq7) obj2;
                String str = ((qq7) obj).a;
                if (!(lq7Var instanceof jq7)) {
                    if (lq7Var.equals(iq7.a)) {
                        return Next.h(new qq7(str, mq7.a));
                    }
                    if (lq7Var.equals(kq7.a)) {
                        return Next.i(new qq7(str, oq7.a), Collections.singleton(new gq7(new vp7(str))));
                    }
                    eg.o();
                    return null;
                }
                jq7 jq7Var = (jq7) lq7Var;
                hq7 hq7Var = jq7Var.a;
                String str2 = jq7Var.b;
                long j = jq7Var.c;
                String str3 = jq7Var.d;
                jo70 jo70Var = hq7Var.a;
                io70 io70Var = jo70Var.e;
                jlw0Var = io70Var != null ? io70Var.a : null;
                String str4 = jlw0Var == null ? "" : jlw0Var;
                wkk1 wkk1VarP = ucp1.p(hq7Var.b);
                String str5 = wkk1VarP.b;
                return Next.h(new qq7(str, new nq7(new jlw0(str5 != null ? str5 : "", ihc1.y0(str4) ? jo70Var.a : str4), wkk1VarP.d, str2, str4, new s171(uwo1.n(str3, vr51Var.f(j), context.getString(2131953538, vr51Var.f(j))), nox.c))));
            case 1:
                aq30 aq30Var = (aq30) obj2;
                String str6 = ((fq30) obj).a;
                if (!(aq30Var instanceof yp30)) {
                    if (aq30Var.equals(xp30.a)) {
                        return Next.h(new fq30(str6, bq30.a));
                    }
                    if (aq30Var.equals(zp30.a)) {
                        return Next.i(new fq30(str6, dq30.a), Collections.singleton(new vp30(new mp30(str6))));
                    }
                    eg.o();
                    return null;
                }
                yp30 yp30Var = (yp30) aq30Var;
                wp30 wp30Var = yp30Var.a;
                xkk1 xkk1Var = yp30Var.b;
                jo70 jo70Var2 = wp30Var.a;
                wkk1 wkk1VarP2 = ucp1.p(wp30Var.b);
                String str7 = xkk1Var != null ? ucp1.p(xkk1Var).b : null;
                io70 io70Var2 = jo70Var2.e;
                String str8 = jo70Var2.a;
                String str9 = io70Var2 != null ? io70Var2.a : null;
                String str10 = str9 == null ? "" : str9;
                long jH = jfv.h(wp30Var.c.a);
                String str11 = wkk1VarP2.a;
                jlw0Var = str11 != null ? new jlw0(str11, str8) : null;
                String str12 = (str7 == null && (str7 = wkk1VarP2.b) == null) ? "" : str7;
                if (!ihc1.y0(str10)) {
                    str8 = str10;
                }
                return Next.h(new fq30(str6, new cq30(new qij1(jlw0Var, new jlw0(str12, str8), wkk1VarP2.d, wkk1VarP2.c, jo70Var2.a, str10, new s171(uwo1.n(jo70Var2.b, vr51Var.f(jH), context.getString(2131955582, vr51Var.f(jH))), xtx.c), null))));
            case 2:
                a3e1 a3e1Var = (a3e1) obj;
                u2e1 u2e1Var = (u2e1) obj2;
                fee1 fee1Var = a3e1Var.f;
                if (u2e1Var instanceof o2e1) {
                    return Next.h(a3e1.a(a3e1Var, null, 0L, null, null, null, ((o2e1) u2e1Var).a, null, 24575));
                }
                if (u2e1Var instanceof n2e1) {
                    n2e1 n2e1Var = (n2e1) u2e1Var;
                    return Next.i(a3e1.a(a3e1Var, null, 0L, null, null, null, null, null, 24575), Collections.singleton(new j2e1(n2e1Var.a, n2e1Var.b, a3e1Var)));
                }
                if (u2e1Var instanceof r2e1) {
                    r2e1 r2e1Var = (r2e1) u2e1Var;
                    return Next.a(Collections.singleton(new k2e1(r2e1Var.a, r2e1Var.b)));
                }
                if (u2e1Var instanceof t2e1) {
                    t2e1 t2e1Var = (t2e1) u2e1Var;
                    String str13 = t2e1Var.a;
                    llg llgVar = t2e1Var.b;
                    a3e1 a3e1VarA = llgVar != null ? a3e1.a(a3e1Var, new w2e1(str13), llgVar.d, new eee1(new vve1(llgVar.e)), llgVar.b, t2e1Var.c, null, llgVar.a, 11211) : a3e1.a(a3e1Var, new w2e1(str13), 0L, null, null, null, null, null, 32763);
                    return Next.i(a3e1VarA, Collections.singleton(new m2e1(a3e1VarA.a, a3e1VarA.e, ((eee1) a3e1VarA.f).a)));
                }
                if (u2e1Var instanceof s2e1) {
                    return Next.i(a3e1.a(a3e1Var, v2e1.a, 0L, null, null, null, null, null, 32763), Collections.singleton(new h2e1(a3e1Var.a)));
                }
                boolean z = u2e1Var instanceof q2e1;
                x2e1 x2e1Var = x2e1.a;
                if (z) {
                    if (fee1Var instanceof eee1) {
                        return Next.i(a3e1.a(a3e1Var, x2e1Var, 0L, null, null, null, null, null, 32763), Collections.singleton(new i2e1(a3e1Var.d, a3e1Var.a, a3e1Var.e, ((eee1) fee1Var).a, null)));
                    }
                    hhg1.n("Failed requirement.");
                    return null;
                }
                if (!(u2e1Var instanceof p2e1)) {
                    eg.o();
                    return null;
                }
                if (!(fee1Var instanceof eee1)) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                e7i0 e7i0Var = ((p2e1) u2e1Var).a;
                String str14 = e7i0Var.a;
                long j2 = e7i0Var.c;
                long j3 = e7i0Var.d;
                return Next.i(a3e1.a(a3e1Var, x2e1Var, j2, new eee1(new vve1(j3)), null, new s171(context.getString(2131960180, vr51Var.f(j3 - j2)), otx.c), null, str14, 12235), f46.S0(new l2p1[]{new i2e1(a3e1Var.d, a3e1Var.a, j2, new vve1(j3), str14), new l2e1(context.getString(2131960177))}));
            case 3:
                kgj1 kgj1Var = (kgj1) obj2;
                String str15 = ((pgj1) obj).a;
                if (!(kgj1Var instanceof igj1)) {
                    if (kgj1Var.equals(hgj1.a)) {
                        return Next.h(new pgj1(str15, lgj1.a));
                    }
                    if (kgj1Var.equals(jgj1.a)) {
                        return Next.i(new pgj1(str15, ngj1.a), Collections.singleton(new fgj1(new ufj1(str15))));
                    }
                    eg.o();
                    return null;
                }
                igj1 igj1Var = (igj1) kgj1Var;
                dgj1 dgj1Var = igj1Var.a;
                ggj1 ggj1Var = igj1Var.b;
                long j4 = igj1Var.c;
                jo70 jo70Var3 = dgj1Var.a;
                jo70 jo70Var4 = ggj1Var.a;
                wkk1 wkk1VarP3 = ucp1.p(ggj1Var.b);
                xkk1 xkk1Var2 = dgj1Var.b;
                String str16 = (xkk1Var2 == null || (mq70Var = xkk1Var2.b) == null || (up70VarA = mq70Var.a(vp70.d)) == null) ? null : up70VarA.a.a;
                if (str16 == null) {
                    str16 = wkk1VarP3.a;
                }
                xkk1 xkk1Var3 = ggj1Var.c;
                String str17 = xkk1Var3 != null ? ucp1.p(xkk1Var3).b : null;
                jlw0 jlw0Var2 = str16 != null ? new jlw0(str16, jo70Var3.a) : null;
                if (str17 == null && (str17 = wkk1VarP3.b) == null) {
                    str17 = "";
                }
                io70 io70Var3 = jo70Var4.e;
                String str18 = io70Var3 != null ? io70Var3.a : null;
                if (str18 == null) {
                    str18 = "";
                }
                if (ihc1.y0(str18)) {
                    str18 = jo70Var4.a;
                }
                jlw0 jlw0Var3 = new jlw0(str17, str18);
                int i = wkk1VarP3.d;
                int i2 = wkk1VarP3.c;
                String str19 = jo70Var3.a;
                io70 io70Var4 = jo70Var4.e;
                jlw0Var = io70Var4 != null ? io70Var4.a : null;
                return Next.h(new pgj1(str15, new mgj1(new qij1(jlw0Var2, jlw0Var3, i, i2, str19, jlw0Var == null ? "" : jlw0Var, new s171(uwo1.n(jo70Var3.b, vr51Var.f(j4), context.getString(2131953538, vr51Var.f(j4))), nox.c), null))));
            default:
                s5k1 s5k1Var = (s5k1) obj;
                m5k1 m5k1Var = (m5k1) obj2;
                if (m5k1Var instanceof k5k1) {
                    return Next.h(s5k1.a(s5k1Var, null, null, 0L, null, null, ((k5k1) m5k1Var).a, null, 114687));
                }
                if (m5k1Var instanceof f5k1) {
                    f5k1 f5k1Var = (f5k1) m5k1Var;
                    return Next.i(s5k1.a(s5k1Var, null, null, 0L, null, null, null, null, 114687), Collections.singleton(new x4k1(f5k1Var.a, f5k1Var.b, f5k1Var.c, f5k1Var.d, s5k1Var)));
                }
                if (m5k1Var instanceof j5k1) {
                    j5k1 j5k1Var = (j5k1) m5k1Var;
                    return Next.i(s5k1Var, Collections.singleton(new v4k1(j5k1Var.b, j5k1Var.c, j5k1Var.d)));
                }
                if (m5k1Var instanceof g5k1) {
                    g5k1 g5k1Var = (g5k1) m5k1Var;
                    String str20 = g5k1Var.b;
                    Object obj3 = g5k1Var.a;
                    if (e331.a(obj3) != null) {
                        return Next.i(s5k1.a(s5k1Var, null, null, 0L, null, new o5k1(null, str20, null), null, null, 122879), Collections.singleton(new u4k1(s5k1Var.i)));
                    }
                    Uri uri = (Uri) obj3;
                    llg llgVar2 = g5k1Var.c;
                    s5k1 s5k1VarA = llgVar2 != null ? s5k1.a(s5k1Var, llgVar2.b, g5k1Var.d, llgVar2.d, new vve1(llgVar2.e), new o5k1(uri, str20, null), null, llgVar2.a, 85343) : s5k1.a(s5k1Var, null, null, 0L, null, new o5k1(uri, str20, null), null, null, 122879);
                    return Next.i(s5k1VarA, Collections.singleton(new a5k1(s5k1VarA.i, s5k1VarA.t, s5k1VarA.Z)));
                }
                boolean z2 = m5k1Var instanceof i5k1;
                p5k1 p5k1Var = p5k1.a;
                if (z2) {
                    return Next.i(s5k1.a(s5k1Var, null, null, 0L, null, p5k1Var, null, null, 122879), Collections.singleton(new w4k1(s5k1Var.i, s5k1Var.X, s5k1Var.t, s5k1Var.Y, null)));
                }
                if (m5k1Var instanceof l5k1) {
                    return Next.h(j6p1.t(s5k1Var, ((l5k1) m5k1Var).a));
                }
                if (m5k1Var instanceof h5k1) {
                    h5k1 h5k1Var = (h5k1) m5k1Var;
                    return Next.i(j6p1.t(s5k1Var, (wkt) null), Collections.singleton(new y4k1(s5k1Var, h5k1Var.a, h5k1Var.b, h5k1Var.c, h5k1Var.d)));
                }
                if (m5k1Var.equals(c5k1.a)) {
                    return Next.i(j6p1.t(s5k1Var, (wkt) null), Collections.singleton(t4k1.a));
                }
                if (m5k1Var instanceof d5k1) {
                    d5k1 d5k1Var = (d5k1) m5k1Var;
                    return Next.i(j6p1.t(s5k1Var, (wkt) null), Collections.singleton(new y4k1(s5k1Var, d5k1Var.b, new cnt(d5k1Var.a, false), d5k1Var.d, d5k1Var.c)));
                }
                if (!(m5k1Var instanceof e5k1)) {
                    eg.o();
                    return null;
                }
                e7i0 e7i0Var2 = ((e5k1) m5k1Var).a;
                String str21 = e7i0Var2.a;
                long j5 = e7i0Var2.c;
                long j6 = e7i0Var2.d;
                return Next.i(s5k1.a(s5k1Var, null, new s171(context.getString(2131960180, vr51Var.f(j6 - j5)), otx.c), j5, new vve1(j6), p5k1Var, null, str21, 85375), f46.S0(new b5k1[]{new w4k1(s5k1Var.i, s5k1Var.X, j5, s5k1Var.Y, str21), new z4k1(context.getString(2131960177))}));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq7(vr51 vr51Var, Context context, byte b) {
        super(2);
        this.a = b;
        this.b = vr51Var;
        this.c = context;
    }
}
