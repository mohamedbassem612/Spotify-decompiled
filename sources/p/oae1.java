package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oae1 {
    public final hrr0 a = v8r.q((Object) null);
    public af5 b;
    public final bw91 c;

    public oae1(af5 af5Var) {
        p5e1 p5e1Var = new p5e1((byte) 13);
        af5Var.getClass();
        ye5 ye5Var = new ye5(af5Var);
        ArrayList arrayList = ye5Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) p5e1Var.invoke(((xe5) arrayList.get(i)).a(os00.INVALID_ID));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ze5 ze5Var = (ze5) list.get(i2);
                arrayList3.add(new xe5(ze5Var.b, ze5Var.c, ze5Var.a, ze5Var.d));
            }
            r7h.W(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = ye5Var.p();
        this.c = new bw91();
    }

    public static ze5 c(ze5 ze5Var, y9e1 y9e1Var) {
        zrm0 zrm0Var = y9e1Var.b;
        int iC = zrm0Var.c(zrm0Var.f - 1, false);
        if (ze5Var.b < iC) {
            return ze5.a(ze5Var, (we5) null, 0, Math.min(ze5Var.c, iC), 11);
        }
        return null;
    }

    public final void a(b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1154651354);
        char c = 2;
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        boolean z2 = false;
        byte b = 29;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            f65 f65Var = (f65) x340Var.k(t4k.s);
            af5 af5Var = this.b;
            List listA = af5Var.a(af5Var.b.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                ze5 ze5Var = (ze5) listA.get(i3);
                int i4 = ze5Var.b;
                Object obj = ze5Var.a;
                if (i4 != ze5Var.c) {
                    x340Var.i0(725478935);
                    Object objT = x340Var.T();
                    Object obj2 = fkj0.X;
                    if (objT == obj2) {
                        objT = ktd.n(x340Var);
                    }
                    idn0 idn0Var = (idn0) objT;
                    qim0 qim0VarC = i541.C(nim0.a, new gub0(this, ze5Var, b));
                    Object objT2 = x340Var.T();
                    byte b2 = 14;
                    if (objT2 == obj2) {
                        objT2 = new p5e1((byte) 14);
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarD = nb51.D(s161.b(qim0VarC, z2, (iu30) objT2).then(new obe1(new h341(this, ze5Var, b2))), idn0Var);
                    fav0.a.getClass();
                    qim0 qim0VarP = t8p1.p(qim0VarD, d1o1.c);
                    boolean zI = x340Var.i(this) | x340Var.g(ze5Var) | x340Var.i(f65Var);
                    Object objT3 = x340Var.T();
                    if (zI || objT3 == obj2) {
                        objT3 = new qga0(this, ze5Var, f65Var);
                        x340Var.s0(objT3);
                    }
                    t1c.a(bin.y(qim0VarP, idn0Var, (ga80) null, false, (String) null, (pm31) null, (String) null, (Function0) null, (Function0) objT3, 508), x340Var, 0);
                    mjc0 mjc0Var = (mjc0) obj;
                    pae1 pae1VarB = mjc0Var.b();
                    if (pae1VarB == null || (pae1VarB.a == null && pae1VarB.b == null && pae1VarB.c == null && pae1VarB.d == null)) {
                        z = false;
                        x340Var.i0(728331710);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(726303039);
                        Object objT4 = x340Var.T();
                        if (objT4 == obj2) {
                            objT4 = new ykc0(idn0Var);
                            x340Var.s0(objT4);
                        }
                        ykc0 ykc0Var = (ykc0) objT4;
                        Object objT5 = x340Var.T();
                        if (objT5 == obj2) {
                            objT5 = new xba1(ykc0Var, (lnm) null, (byte) 27);
                            x340Var.s0(objT5);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT5);
                        err0 err0Var = ykc0Var.b;
                        err0 err0Var2 = ykc0Var.b;
                        Boolean boolValueOf = Boolean.valueOf((err0Var.s() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((err0Var2.s() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((err0Var2.s() & 4) != 0);
                        pae1 pae1VarB2 = mjc0Var.b();
                        zma1 zma1Var = pae1VarB2 != null ? pae1VarB2.a : null;
                        pae1 pae1VarB3 = mjc0Var.b();
                        zma1 zma1Var2 = pae1VarB3 != null ? pae1VarB3.b : null;
                        pae1 pae1VarB4 = mjc0Var.b();
                        zma1 zma1Var3 = pae1VarB4 != null ? pae1VarB4.c : null;
                        pae1 pae1VarB5 = mjc0Var.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, zma1Var, zma1Var2, zma1Var3, pae1VarB5 != null ? pae1VarB5.d : null};
                        boolean zI2 = x340Var.i(this) | x340Var.g(ze5Var);
                        Object objT6 = x340Var.T();
                        if (zI2 || objT6 == obj2) {
                            objT6 = new gub0(this, ze5Var, ykc0Var, (byte) 28);
                            x340Var.s0(objT6);
                        }
                        b(objArr, (iu30) objT6, x340Var, (i2 << 6) & 896);
                        z = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z);
                } else {
                    z = z2;
                    x340Var.i0(728345598);
                    x340Var.r(z);
                }
                i3++;
                z2 = z;
                c = c;
                b = 29;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9(this, i, (byte) 29);
        }
    }

    public final void b(Object[] objArr, final iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2083052099);
        int i2 = (i & 48) == 0 ? (x340Var.i(iu30Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? SemanticState.Hidden : SemanticState.Focused;
        }
        x340Var.f0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (x340Var.e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= x340Var.i(obj) ? 4 : 0;
        }
        x340Var.r(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        final byte b = 1;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            c8b1 c8b1Var = new c8b1(2);
            c8b1Var.a(iu30Var);
            c8b1Var.b(objArr);
            ArrayList arrayList = c8b1Var.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zI = x340Var.i(this) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new iu30(this) { // from class: p.afa
                    public final /* synthetic */ oae1 b;

                    {
                        this.b = this;
                    }

                    public final Object invoke(Object obj2) {
                        byte b2 = b;
                        iu30 iu30Var2 = iu30Var;
                        oae1 oae1Var = this.b;
                        switch (b2) {
                            case 0:
                                y9e1 y9e1Var = (y9e1) obj2;
                                if (oae1Var != null) {
                                    oae1Var.a.setValue(y9e1Var);
                                }
                                if (iu30Var2 != null) {
                                    iu30Var2.invoke(y9e1Var);
                                }
                                return rih1.a;
                            default:
                                oae1Var.c.add(iu30Var2);
                                return new w9d0(oae1Var, iu30Var2, (byte) 22);
                        }
                    }
                };
                x340Var.s0(objT);
            }
            qxd0.j(array, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05((Object) this, (Object) objArr, (cv30) iu30Var, i, (byte) 14);
        }
    }
}
