package p;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sv8 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv8(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                sv8 sv8Var = new sv8((d520) obj6, (String) obj5, (lnm) obj4, (byte) 0);
                sv8Var.b = (qxc0) obj;
                sv8Var.c = (wuj0) obj2;
                sv8Var.d = (ibk0) obj3;
                return sv8Var.invokeSuspend(rih1Var);
            case 1:
                sv8 sv8Var2 = new sv8((jz5) obj6, (fwi0) obj5, (lnm) obj4, (byte) 1);
                sv8Var2.b = (vxs0) obj;
                sv8Var2.c = (List) obj2;
                sv8Var2.d = (List) obj3;
                return sv8Var2.invokeSuspend(rih1Var);
            case 2:
                sv8 sv8Var3 = new sv8((vqv) this.d, (bw91) obj6, (ss50) obj5, (lnm) obj4, (byte) 2);
                sv8Var3.b = (qtb0) obj2;
                sv8Var3.c = (qtb0) obj3;
                sv8Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                sv8 sv8Var4 = new sv8((q880) obj6, (dj41) obj5, (lnm) obj4, (byte) 3);
                sv8Var4.b = (n880) obj;
                sv8Var4.c = (k880) obj2;
                sv8Var4.d = (tqw) obj3;
                sv8Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                sv8 sv8Var5 = new sv8((ts90) obj6, (String) obj5, (lnm) obj4, (byte) 4);
                sv8Var5.b = (m4o0) obj;
                sv8Var5.c = (Boolean) obj2;
                sv8Var5.d = (xo90) obj3;
                return sv8Var5.invokeSuspend(rih1Var);
            case 5:
                sv8 sv8Var6 = new sv8((z6k0) obj6, (l6k0) obj5, (lnm) obj4, (byte) 5);
                sv8Var6.b = (ly50) obj;
                sv8Var6.c = (cxc0) obj2;
                sv8Var6.d = (ibk0) obj3;
                return sv8Var6.invokeSuspend(rih1Var);
            case 6:
                sv8 sv8Var7 = new sv8((y0q0) obj6, (p0q0) obj5, (lnm) obj4, (byte) 6);
                sv8Var7.b = (u0q0) obj;
                sv8Var7.c = (ast0) obj2;
                sv8Var7.d = (Set) obj3;
                return sv8Var7.invokeSuspend(rih1Var);
            case 7:
                sv8 sv8Var8 = new sv8((osq0) this.d, (ven0) obj6, (ven0) obj5, (lnm) obj4, (byte) 7);
                sv8Var8.b = (fsq0) obj2;
                sv8Var8.c = (tqw) obj3;
                sv8Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                sv8 sv8Var9 = new sv8((jh41) this.d, (hh41) obj6, (tob1) obj5, (lnm) obj4, (byte) 8);
                sv8Var9.b = (fh41) obj2;
                sv8Var9.c = (tqw) obj3;
                sv8Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                sv8 sv8Var10 = new sv8((dea1) obj6, (iea1) obj5, (lnm) obj4, (byte) 9);
                sv8Var10.b = (k1r) obj;
                sv8Var10.c = (k1r) obj2;
                sv8Var10.d = (k1r) obj3;
                return sv8Var10.invokeSuspend(rih1Var);
            case 10:
                sv8 sv8Var11 = new sv8((nl9) obj6, (iu30) obj5, (lnm) obj4, (byte) 10);
                sv8Var11.b = (j1c1) obj;
                sv8Var11.c = (h1c1) obj2;
                sv8Var11.d = (tqw) obj3;
                sv8Var11.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                sv8 sv8Var12 = new sv8((lo60) obj6, (vgm) obj5, (lnm) obj4, (byte) 11);
                sv8Var12.b = (o6j1) obj;
                sv8Var12.c = (j6j1) obj2;
                sv8Var12.d = (tqw) obj3;
                sv8Var12.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x038e  */
    /* JADX WARN: Code duplicated, block: B:157:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:182:0x0431  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        k1c1 k1c1VarY;
        ou80 ou80Var;
        String str;
        ou80 ou80Var2;
        String str2;
        byte b = this.a;
        boolean z2 = false;
        String str3 = "";
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                qxc0 qxc0Var = (qxc0) this.b;
                wuj0 wuj0Var = (wuj0) this.c;
                ibk0 ibk0Var = (ibk0) this.d;
                hm5.M(obj);
                if (qxc0Var == null) {
                    return sqe.a;
                }
                List list = qxc0Var.N0;
                d520 d520Var = (d520) obj2;
                Map map = qxc0Var.X;
                boolean z3 = qxc0Var.t.c;
                ((npm1) d520Var.f).getClass();
                if ((!((String) obj3).equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") || ((rxj0) d520Var.d).R) && ibk0Var.equals(ebk0.a) && !z3) {
                    ((z6k0) d520Var.e).getClass();
                    if (z6k0.b(map)) {
                        z = false;
                    } else {
                        if (wuj0Var != null ? wuj0Var.a : false) {
                            List list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ll81 ll81Var = (ll81) it.next();
                                        if (u890.j(ll81Var.a, "mix-opt-out") || u890.j(ll81Var.a, "mix-remove-opt-out")) {
                                        }
                                    } else if (Boolean.parseBoolean((String) map.get("is_video_first"))) {
                                        z = true;
                                    }
                                    z = false;
                                }
                            } else if (Boolean.parseBoolean((String) map.get("is_video_first"))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (u890.j(((ll81) it2.next()).a, "mix-auto-toggle-off")) {
                            z2 = true;
                        }
                    }
                }
                boolean z4 = qxc0Var.h;
                pxc0 pxc0Var = qxc0Var.c;
                return new cw8(z, z2, j0p1.u(pxc0Var != null ? pxc0Var.a : null, z4));
            case 1:
                vxs0 vxs0Var = (vxs0) this.b;
                List list4 = (List) this.c;
                List list5 = (List) this.d;
                hm5.M(obj);
                if (vxs0Var == vxs0.a) {
                    list5.getClass();
                    List list6 = list5;
                    fwi0 fwi0Var = (fwi0) obj3;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            if (((zdz0) it3.next()).a == fwi0Var) {
                                list4.getClass();
                                jz5 jz5Var = (jz5) obj2;
                                l0l l0lVarB = y2o1.B(jz5Var.a, list4, jz5Var.b, jz5Var.c);
                                z2 = (l0lVarB != null ? l0lVarB.getState() : 0) != 7;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                qtb0 qtb0Var = (qtb0) this.b;
                qtb0 qtb0Var2 = (qtb0) this.c;
                hm5.M(obj);
                vqv vqvVar = (vqv) this.d;
                bw91 bw91Var = (bw91) obj2;
                int i = qtb0Var.a;
                int i2 = qtb0Var2.a;
                vqvVar.getClass();
                bw91Var.add(i2, bw91Var.remove(i));
                ((ss50) obj3).a(27);
                return rih1Var;
            case 3:
                q880 q880Var = (q880) obj2;
                cir0 cir0Var = q880Var.b;
                n880 n880Var = (n880) this.b;
                i880 i880Var = (k880) this.c;
                tqw tqwVar = (tqw) this.d;
                hm5.M(obj);
                if (i880Var instanceof i880) {
                    o3r o3rVar = q880.Z;
                    String strF = q880Var.f(i880Var, n880Var);
                    if (strF == null) {
                        return rih1Var;
                    }
                    cir0Var.g().d(strF, tqwVar != null ? n3o1.y(tqwVar) : null, (Bundle) null);
                    return rih1Var;
                }
                if (i880Var instanceof h880) {
                    q7r0 q7r0VarG = cir0Var.g();
                    h880 h880Var = (h880) i880Var;
                    r880 r880Var = q880Var.a;
                    q7r0VarG.d(dj20.d(16, r880Var.a, zjy.r(h880Var.a), h880Var.b, r880Var.c), tqwVar != null ? n3o1.y(tqwVar) : null, (Bundle) null);
                    return rih1Var;
                }
                if (i880Var instanceof j880) {
                    dj41 dj41Var = (dj41) obj3;
                    dj41Var.l.C(((j880) i880Var).a);
                    dj41Var.o = true;
                    if (dj41Var.n == null) {
                        return rih1Var;
                    }
                    dj41Var.f();
                    return rih1Var;
                }
                if (!u890.j(i880Var, g880.a)) {
                    eg.o();
                    return null;
                }
                q7r0 q7r0VarG2 = cir0Var.g();
                k1c1VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                if (k1c1VarY != null && (ou80Var = ((tv80) k1c1VarY).a) != null && (str = ou80Var.a) != null) {
                    str3 = str;
                }
                q7r0VarG2.c(str3);
                return rih1Var;
            case 4:
                m4o0 m4o0Var = (m4o0) this.b;
                Boolean bool = (Boolean) this.c;
                xo90 xo90Var = (xo90) this.d;
                hm5.M(obj);
                bool.getClass();
                String str4 = (String) obj3;
                return (u890.j(m4o0Var, l4o0.a) || Build.VERSION.SDK_INT < 31) ? new ms90(str4, xo90Var) : new ns90(m4o0Var, bool.booleanValue(), str4, xo90Var);
            case 5:
                ly50 ly50Var = (ly50) this.b;
                cxc0 cxc0Var = (cxc0) this.c;
                ibk0 ibk0Var2 = (ibk0) this.d;
                hm5.M(obj);
                if (ibk0Var2.b() && z6k0.b(cxc0Var.f.q)) {
                    return ly50.a(ly50Var, null, false, false, 0, false, new px50(((l6k0) obj3).a.getResources().getDimensionPixelSize(2131166130), p7h.M(new Float[]{new Float(0.0f), new Float(0.1f), new Float(1.0f)})), null, 223);
                }
                return null;
            case 6:
                u0q0 u0q0Var = (u0q0) this.b;
                ast0 ast0Var = (ast0) this.c;
                Set set = (Set) this.d;
                hm5.M(obj);
                return ((y0q0) obj2).f((p0q0) obj3, u0q0Var, ast0Var, set);
            case 7:
                fsq0 fsq0Var = (fsq0) this.b;
                tqw tqwVar2 = (tqw) this.c;
                hm5.M(obj);
                if (fsq0Var instanceof esq0) {
                    ((ven0) obj2).setValue(((esq0) fsq0Var).a);
                    return rih1Var;
                }
                if (!u890.j(fsq0Var, csq0.a)) {
                    if (u890.j(fsq0Var, dsq0.a)) {
                        ((ven0) obj3).setValue(Boolean.FALSE);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                q7r0 q7r0VarG3 = ((osq0) this.d).b.g();
                k1c1VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                if (k1c1VarY != null && (ou80Var2 = ((tv80) k1c1VarY).a) != null && (str2 = ou80Var2.a) != null) {
                    str3 = str2;
                }
                q7r0VarG3.c(str3);
                return rih1Var;
            case 8:
                fh41 fh41Var = (fh41) this.b;
                tqw tqwVar3 = (tqw) this.c;
                hm5.M(obj);
                if (!u890.j(fh41Var, fh41.a)) {
                    eg.o();
                    return null;
                }
                if (!(((gh41) ((tob1) obj3).getValue()).a instanceof gix0)) {
                    return rih1Var;
                }
                ((jh41) this.d).b.d("spotify:page-match:outbound-scan:".concat(((hh41) obj2).a), tqwVar3 != null ? n3o1.y(tqwVar3) : null, (Bundle) null);
                return rih1Var;
            case 9:
                k1r k1rVar = (k1r) this.b;
                k1r k1rVar2 = (k1r) this.c;
                k1r k1rVar3 = (k1r) this.d;
                hm5.M(obj);
                return new fea1(((dea1) obj2).a, hqq0.k0(k1rVar, hqq0.e0(k1rVar2), h9a1.R0), (qtt0) u890.G(k1rVar3));
            case 10:
                nl9 nl9Var = (nl9) obj2;
                iu30 iu30Var = (iu30) obj3;
                j1c1 j1c1Var = (j1c1) this.b;
                g1c1 g1c1Var = (h1c1) this.c;
                tqw tqwVar4 = (tqw) this.d;
                hm5.M(obj);
                if (g1c1Var instanceof g1c1) {
                    k1c1 k1c1Var = g1c1Var.a;
                    k1c1VarY = k1c1Var.c ? null : k1c1Var;
                    if (k1c1VarY == null) {
                        return rih1Var;
                    }
                    iu30Var.invoke(j1c1.a(j1c1Var, (List) null, (String) null, (lax) null, k1c1VarY.a, 15));
                    return rih1Var;
                }
                if (g1c1Var instanceof f1c1) {
                    ((i9i1) nl9Var.g).b(((f1c1) g1c1Var).a);
                    return rih1Var;
                }
                if ((g1c1Var instanceof e1c1) || (g1c1Var instanceof c1c1)) {
                    iu30Var.invoke(j1c1.a(j1c1Var, (List) null, (String) null, (lax) null, (String) null, 15));
                    return rih1Var;
                }
                if (g1c1Var instanceof d1c1) {
                    ((uv61) nl9Var.t).a(j1c1Var.c, ((d1c1) g1c1Var).a, tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                o6j1 o6j1Var = (o6j1) this.b;
                j6j1 j6j1Var = (j6j1) this.c;
                tqw tqwVar5 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(j6j1Var, f6j1.a)) {
                    String str5 = o6j1Var.n;
                    String str6 = o6j1Var.p;
                    if (str6.length() != 0) {
                        char c = ihc1.i0(str5, '?') ? '&' : '?';
                        str5 = str5 + c + Uri.encode("entrypointIdentifier") + "=" + Uri.encode(str6);
                    }
                    hqn1.q((lo60) obj2, str5, tqwVar5, (Bundle) null);
                } else if (u890.j(j6j1Var, g6j1.a)) {
                    wcm wcmVarD = d6j1.d(o6j1Var);
                    String str7 = wcmVarD.a;
                    tqwVar5.getClass();
                    vgm.b((vgm) obj3, str7, (String) null, n3o1.y(tqwVar5), (tgm) wcmVarD.f.invoke(), 2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv8(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }
}
