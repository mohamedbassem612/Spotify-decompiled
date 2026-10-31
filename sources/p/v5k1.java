package p;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v5k1 implements jsw {
    public final zog a;
    public final long b;
    public final boolean c;

    public v5k1(zog zogVar, long j, boolean z) {
        this.a = zogVar;
        this.b = j;
        this.c = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(s5k1 s5k1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        s5k1 s5k1Var2;
        iu30 iu30Var2;
        Object s73Var;
        xwa xwaVar;
        wkt wktVar;
        boolean z;
        vwa vwaVar;
        xwa xwaVar2;
        xwa xwaVar3;
        long jLongValue;
        long j = s5k1Var.t;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-896650256);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(s5k1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1043) != 1042)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            vwa vwaVar2 = new vwa();
            xwa xwaVarF = fae1.F(b0kVar3);
            xwa xwaVarF2 = fae1.F(b0kVar3);
            xwa xwaVarF3 = fae1.F(b0kVar3);
            wkt wktVar2 = s5k1Var.O0;
            boolean z2 = (i2 & 14) == 4;
            int i3 = i2 & 112;
            boolean zG = z2 | (i3 == 32) | b0kVar3.g(xwaVarF) | b0kVar3.g(xwaVarF2) | b0kVar3.g(xwaVarF3);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                xwaVar = xwaVarF2;
                wktVar = wktVar2;
                z = false;
                vwaVar = vwaVar2;
                s73Var = new s73(s5k1Var, iu30Var, xwaVarF, vwaVar, xwaVar, xwaVarF3, (lnm) null, (byte) 4);
                s5k1Var2 = s5k1Var;
                b0kVar3.s0(s73Var);
            } else {
                xwaVar = xwaVarF2;
                wktVar = wktVar2;
                z = false;
                s5k1Var2 = s5k1Var;
                s73Var = objT2;
                vwaVar = vwaVar2;
            }
            qxd0.t(wktVar, b0kVar3, (vu30) s73Var);
            q5k1 q5k1Var = s5k1Var2.N0;
            boolean z3 = q5k1Var instanceof o5k1;
            jlw0 jlw0Var = null;
            if (z3) {
                b0kVar3.i0(-1705166578);
                wkt wktVar3 = ((o5k1) q5k1Var).c;
                if (wktVar3 != null) {
                    b0kVar3.i0(-1705036068);
                    String str = s5k1Var2.f;
                    boolean z4 = this.c;
                    String str2 = (!z4 || str.length() <= 0) ? null : str;
                    boolean zG2 = b0kVar3.g(wktVar3);
                    Object objT3 = b0kVar3.T();
                    if (zG2 || objT3 == m4cVar) {
                        xwa xwaVar4 = xwaVar;
                        vwa vwaVar3 = vwaVar;
                        z1 z1Var = new z1(c9nVar, iu30Var, wktVar3, xwaVar4, vwaVar3, str2, xwaVarF3);
                        izj1 izj1Var = new izj1(iu30Var, (byte) 5);
                        kx70 kx70Var = new kx70(c9nVar, iu30Var, wktVar3, s5k1Var, xwaVarF, vwaVar3, xwaVar4, (byte) 19);
                        iu30Var2 = iu30Var;
                        s5k1Var2 = s5k1Var;
                        xwaVar2 = xwaVar4;
                        xwaVar3 = xwaVarF;
                        zog zogVar = this.a;
                        objT3 = new yog(new d520((q8n) zogVar.c, (q8n) zogVar.d, (qo71) zogVar.e, (dmr) zogVar.f, (ltf1) zogVar.g, (yqg) zogVar.h, (drj0) zogVar.i, (byte) 22), z1Var, izj1Var, kx70Var, zogVar.a, zogVar.b);
                        b0kVar3.s0(objT3);
                    } else {
                        xwaVar2 = xwaVar;
                        xwaVar3 = xwaVarF;
                        iu30Var2 = iu30Var;
                    }
                    xpw xpwVar = (xpw) objT3;
                    vve1 vve1Var = s5k1Var2.Z;
                    Long lValueOf = vve1Var != null ? Long.valueOf(vve1Var.a) : null;
                    long j2 = this.b;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                        if (jLongValue - j > j2) {
                            jLongValue = j + j2;
                        }
                    } else {
                        jLongValue = j + j2;
                    }
                    String string = s5k1Var2.X.toString();
                    long j3 = s5k1Var2.t;
                    o571 o571VarA = wktVar3.a();
                    String str3 = s5k1Var2.a;
                    String strB = s5k1Var2.i.a.b.b();
                    String str4 = s5k1Var2.P0;
                    str4.getClass();
                    uog uogVar = new uog(string, j3, o571VarA, str3, jLongValue, strB, str4, str2, z4 != 0 ? s5k1Var2.g : null, Integer.valueOf((int) ((jLongValue - j) / 1000)), z4 ? s5k1Var2.Q0 : null);
                    b0kVar2 = b0kVar3;
                    otw.c(xpwVar, uogVar, (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                    z = false;
                    b0kVar2.r(false);
                } else {
                    b0kVar2 = b0kVar3;
                    z3 = z3;
                    xwaVar2 = xwaVar;
                    xwaVarF3 = xwaVarF3;
                    xwaVar3 = xwaVarF;
                    iu30Var2 = iu30Var;
                    b0kVar2.i0(-1702431758);
                    b0kVar2.r(z);
                }
                b0kVar2.r(z);
            } else {
                b0kVar2 = b0kVar3;
                z3 = z3;
                xwaVar2 = xwaVar;
                xwaVarF3 = xwaVarF3;
                xwaVar3 = xwaVarF;
                iu30Var2 = iu30Var;
                b0kVar2.i0(-1702425806);
                b0kVar2.r(z);
            }
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            if (q5k1Var instanceof p5k1) {
                b0kVar2.i0(1607654389);
                dxo1.k(qim0VarD, b0kVar2, 6);
                b0kVar2.r(z);
            } else if (z3) {
                b0kVar2.i0(-1702211410);
                o5k1 o5k1Var = (o5k1) q5k1Var;
                Uri uri = o5k1Var.a;
                if (uri == null) {
                    b0kVar2.i0(-1702083877);
                    b0kVar2.r(z);
                } else {
                    b0kVar2.i0(-1702083876);
                    jlw0 jlw0Var2 = new jlw0(uri.toString(), cwl1.o0(b0kVar2, 2131962266));
                    b0kVar2.r(z);
                    jlw0Var = jlw0Var2;
                }
                b0k b0kVar4 = b0kVar2;
                b2p1.s(new qij1(jlw0Var == null ? s5k1Var2.b : jlw0Var, s5k1Var2.c, s5k1Var2.d, s5k1Var2.e, s5k1Var2.f, s5k1Var2.g, s5k1Var2.h, o5k1Var.b), xwaVar3, xwaVar2, qim0VarD, xwaVarF3, b0kVar4, 3072, 0);
                b0kVar2 = b0kVar4;
                b0kVar2.r(false);
            } else {
                if (!(q5k1Var instanceof n5k1)) {
                    throw p3d1.k(b0kVar2, 1607653859, false);
                }
                b0kVar2.i0(1607690464);
                boolean z5 = i3 == 32;
                Object objT4 = b0kVar2.T();
                if (z5 || objT4 == m4cVar) {
                    objT4 = new izj1(iu30Var2, (byte) 4);
                    b0kVar2.s0(objT4);
                }
                rwo1.h(6, (Function0) objT4, b0kVar2, qim0VarD);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            s5k1Var2 = s5k1Var;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, s5k1Var2, iu30Var2, kswVar, (byte) 28);
        }
    }
}
