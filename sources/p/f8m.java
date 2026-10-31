package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.martini.martinidata.model.Mode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f8m {
    public final pe a;
    public final kly0 b;
    public final lwp c;
    public final mwp d;
    public final uk51 e;
    public final xy61 f;
    public final mr4 g;
    public final lik1 h;
    public final rzq i;
    public final idd1 j = new idd1(new j3m(this, (byte) 1));
    public final LinkedHashMap k = new LinkedHashMap();
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public f8m(pe peVar, jly0 jly0Var, lwp lwpVar, mwp mwpVar, uk51 uk51Var, xy61 xy61Var, mr4 mr4Var, lik1 lik1Var, rzq rzqVar) {
        this.a = peVar;
        this.b = jly0Var;
        this.c = lwpVar;
        this.d = mwpVar;
        this.e = uk51Var;
        this.f = xy61Var;
        this.g = mr4Var;
        this.h = lik1Var;
        this.i = rzqVar;
        this.l = peVar.b(5);
        this.m = mr4Var.b() != lr4.b;
        this.n = mr4Var.b() == lr4.c;
    }

    public static final boolean o(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final void p(ven0 ven0Var) {
        ven0Var.setValue(Boolean.FALSE);
    }

    public final void a(k7m k7mVar, kes kesVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1743258784);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(k7mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(kesVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = k7mVar instanceof i7m;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var.i0(-1321943267);
                if (((i7m) k7mVar).a.size() > 1) {
                    x340Var.i0(-1321873300);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarN = anm1.N("content_story_card_carousel_dots", uyn1.y(qim0Var3, 10.0f, 8.0f));
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    float f = cbx.b(x340Var).b.b;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    w0o1.c(kesVar, qim0VarN, 8.0f, f, cbx.a(x340Var).b.a, cbx.a(x340Var).b.b, x340Var, (i3 >> 3) & 14);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1321267870);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(-1321261918);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, k7mVar, kesVar, qim0Var2, (byte) 13);
        }
    }

    public final void b(b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1968226411);
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = (x340Var.i(nim0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            yto1.e(1, 48, 0, x340Var, anm1.N("content_story_card_loading_indicator", eqr0.C(fj30.F(nim0Var, 0.6f, 0.6f), -18.0f, 12.0f)));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(this, i);
        }
    }

    public final void c(h7m h7mVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1275312036);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(iu30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (q7m) this.b.get();
                x340Var.s0(objT);
            }
            q7m q7mVar = (q7m) objT;
            qim0 qim0VarN = anm1.N("content_story_card_error_container", u291.d(nim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            q7mVar.getClass();
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new jzk(iu30Var, (byte) 15);
                x340Var.s0(objT2);
            }
            otw.c(q7mVar, new p7m((Function0) objT2), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, h7mVar, iu30Var, i);
        }
    }

    public final void d(i7m i7mVar, kes kesVar, boolean z, Function0 function0, vu30 vu30Var, int i, String str, boolean z2, qim0 qim0Var, boolean z3, float f, boolean z4, Function0 function1, b0k b0kVar, int i2, int i3, int i4) {
        i7m i7mVar2;
        int i5;
        Function0 function2;
        vu30 vu30Var2;
        int i6;
        b0k b0kVar2;
        float f2;
        zzq0 zzq0Var;
        float f3;
        boolean z5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(560884158);
        if ((i2 & 6) == 0) {
            i7mVar2 = i7mVar;
            i5 = (b0kVar3.i(i7mVar2) ? 4 : 2) | i2;
        } else {
            i7mVar2 = i7mVar;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= b0kVar3.i(kesVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function2 = function0;
            i5 |= b0kVar3.i(function2) ? 2048 : 1024;
        } else {
            function2 = function0;
        }
        if ((i2 & 24576) == 0) {
            vu30Var2 = vu30Var;
            i5 |= b0kVar3.i(vu30Var2) ? 16384 : 8192;
        } else {
            vu30Var2 = vu30Var;
        }
        if ((i2 & 196608) == 0) {
            i5 |= b0kVar3.e(i) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= b0kVar3.g(str) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= b0kVar3.h(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= b0kVar3.i(qim0Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= b0kVar3.h(z3) ? 536870912 : 268435456;
        }
        int i7 = i5;
        int i8 = i4 & 512;
        if (i8 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (b0kVar3.d(f) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= b0kVar3.h(z4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= b0kVar3.i(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            float f4 = i8 != 0 ? 1.0f : f;
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = yv91.a(new z7m(kesVar, (byte) 0));
                b0kVar3.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = bb00.h(-1, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == obj) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == obj) {
                objT5 = new y7m();
                b0kVar3.s0(objT5);
            }
            ak20 ak20Var = (y7m) objT5;
            if (!z3 || ((Boolean) ven0Var.getValue()).booleanValue()) {
                tob1Var = tob1Var;
                ven0Var2 = ven0Var2;
                b0kVar3.i0(1878974980);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1878286904);
                if (this.m) {
                    b0kVar3.i0(1878303582);
                    boolean z6 = i >= 100 && z2;
                    Boolean boolValueOf = Boolean.valueOf(z6);
                    boolean zH = b0kVar3.h(z6) | b0kVar3.i(ven0Var);
                    Object objT6 = b0kVar3.T();
                    if (zH || objT6 == obj) {
                        objT6 = new hj6(z6, ven0Var, (lnm) null, (byte) 2);
                        b0kVar3.s0(objT6);
                    }
                    qxd0.t(boolValueOf, b0kVar3, (vu30) objT6);
                    z5 = false;
                    b0kVar3.r(false);
                } else {
                    ven0Var2 = ven0Var2;
                    b0kVar3.i0(1878603848);
                    boolean z7 = !z && i >= 50 && z2;
                    Boolean boolValueOf2 = Boolean.valueOf(z7);
                    boolean zH2 = b0kVar3.h(z7) | b0kVar3.i(ven0Var);
                    Object objT7 = b0kVar3.T();
                    if (zH2 || objT7 == obj) {
                        objT7 = new wsh(z7, ven0Var, (lnm) null, (byte) 1);
                        b0kVar3.s0(objT7);
                    }
                    qxd0.t(boolValueOf2, b0kVar3, (vu30) objT7);
                    z5 = false;
                    b0kVar3.r(false);
                }
                b0kVar3.r(z5);
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            if (z3) {
                b0kVar3.i0(2138826649);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                zzq0Var = uyn1.h(2, 16.0f, 0.0f);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(2138828945);
                b0kVar3.r(false);
                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            }
            zzq0 zzq0Var2 = zzq0Var;
            ak20 ak20Var2 = z3 ? ak20Var : ak20.S0;
            if (z3) {
                b0kVar3.i0(2138834082);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f3 = 16.0f;
            } else {
                b0kVar3.i0(2138834464);
                b0kVar3.r(false);
                f3 = 0.0f;
            }
            Function0 function3 = function2;
            b0kVar2 = b0kVar3;
            w0h1.c(kesVar, qim0VarF, zzq0Var2, ak20Var2, 0, f3, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-1638396033, new v7m(i7mVar2, hdn0Var, function3, tob1Var, z, z3, this, i, z2, ven0Var2, ven0Var, str, vu30Var2, function1, f4, z4), b0kVar2), b0kVar2, ((i7 >> 3) & 14) | 24576, 16320);
            f2 = f4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f2 = f;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new w7m(this, i7mVar, kesVar, z, function0, vu30Var, i, str, z2, qim0Var, z3, f2, z4, function1, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01b1  */
    public final void e(k7m k7mVar, iu30 iu30Var, kes kesVar, boolean z, Function0 function0, vu30 vu30Var, int i, String str, boolean z2, qim0 qim0Var, boolean z3, boolean z4, b0k b0kVar, int i2) {
        k7m k7mVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z5;
        boolean z6;
        qim0 qim0VarS;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1172614882);
        int i3 = i2 | (x340Var.i(k7mVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(kesVar) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(vu30Var) ? 131072 : 65536) | (x340Var.e(i) ? 1048576 : 524288) | (x340Var.g(str) ? 8388608 : 4194304) | (x340Var.h(z2) ? 67108864 : 33554432) | 805306368;
        int i4 = (x340Var.h(z3) ? 4 : 2) | (x340Var.h(z4) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = Boolean.valueOf(k7mVar instanceof j7m);
                x340Var.s0(objT);
            }
            boolean z7 = ((Boolean) objT).booleanValue() && (k7mVar instanceof i7m);
            boolean z8 = k7mVar instanceof h7m;
            qim0 qim0Var4 = nim0.a;
            if (z8) {
                x340Var.i0(1601488034);
                c((h7m) k7mVar, iu30Var, x340Var, (i3 & 126) | 384 | ((i4 << 3) & 7168));
                x340Var.r(false);
                qim0Var3 = qim0Var4;
                k7mVar2 = k7mVar;
            } else if (k7mVar instanceof i7m) {
                x340Var.i0(-1893325573);
                if (z2) {
                    x340Var.i0(-1893344111);
                    Object objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = c97.b(0.0f);
                        x340Var.s0(objT2);
                    }
                    o95 o95Var = (o95) objT2;
                    Object objT3 = x340Var.T();
                    if (objT3 == obj) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT3);
                    }
                    ven0 ven0Var = (ven0) objT3;
                    boolean z9 = i >= (this.m ? 20 : 50);
                    Boolean boolValueOf = Boolean.valueOf(z9);
                    boolean zH = x340Var.h(z9) | x340Var.i(o95Var) | x340Var.i(ven0Var);
                    Object objT4 = x340Var.T();
                    if (zH || objT4 == obj) {
                        objT4 = new s7m(z9, o95Var, ven0Var, (lnm) null);
                        x340Var.s0(objT4);
                    }
                    qxd0.t(boolValueOf, x340Var, (vu30) objT4);
                    i7m i7mVar = (i7m) k7mVar;
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    if (z3) {
                        qim0VarS = qim0Var4;
                    } else {
                        float fFloatValue = ((Number) o95Var.e()).floatValue();
                        int i5 = g8m.b;
                        if (fFloatValue >= 1.0f) {
                            qim0VarS = qim0Var4;
                        } else {
                            qim0VarS = exd0.s(i541.C(qim0Var4, z4m.R0), new jc5((byte) 14, fFloatValue));
                        }
                    }
                    float fFloatValue2 = z3 ? ((Number) o95Var.e()).floatValue() : 1.0f;
                    z5 = (i3 & 112) == 32;
                    Object objT5 = x340Var.T();
                    if (z5 || objT5 == obj) {
                        objT5 = new jzk(iu30Var, (byte) 12);
                        x340Var.s0(objT5);
                    }
                    int i6 = i3 >> 3;
                    qim0Var3 = qim0Var4;
                    d(i7mVar, kesVar, z, function0, vu30Var, i, str, zBooleanValue, qim0VarS, z3, fFloatValue2, z4, (Function0) objT5, x340Var, (i3 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | ((i4 << 27) & 1879048192), (i4 & 112) | ((i4 << 3) & 7168), 0);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    qim0Var3 = qim0Var4;
                    x340Var.i0(-1891675784);
                    if (z7 && this.l) {
                        x340Var.i0(-1891605910);
                        Object objT6 = x340Var.T();
                        if (objT6 == obj) {
                            objT6 = c97.b(0.0f);
                            x340Var.s0(objT6);
                        }
                        o95 o95Var2 = (o95) objT6;
                        Object objT7 = x340Var.T();
                        if (objT7 == obj) {
                            objT7 = c13.l(!z3, x340Var);
                        }
                        ven0 ven0Var2 = (ven0) objT7;
                        boolean zI = x340Var.i(o95Var2) | ((i4 & 14) == 4) | x340Var.i(ven0Var2);
                        Object objT8 = x340Var.T();
                        if (zI || objT8 == obj) {
                            objT8 = new s7m(o95Var2, z3, ven0Var2, (lnm) null);
                            x340Var.s0(objT8);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT8);
                        i7m i7mVar2 = (i7m) k7mVar;
                        boolean zBooleanValue2 = ((Boolean) ven0Var2.getValue()).booleanValue();
                        qim0 qim0VarK = d9y0.k(qim0Var3, ((Number) o95Var2.e()).floatValue());
                        z5 = (i3 & 112) == 32;
                        Object objT9 = x340Var.T();
                        if (z5 || objT9 == obj) {
                            objT9 = new jzk(iu30Var, (byte) 13);
                            x340Var.s0(objT9);
                        }
                        Function0 function1 = (Function0) objT9;
                        int i7 = i3 & 14;
                        int i8 = i3 >> 3;
                        qim0Var3 = qim0Var3;
                        d(i7mVar2, kesVar, z, function0, vu30Var, i, str, zBooleanValue2, qim0VarK, z3, 0.0f, z4, function1, x340Var, i7 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | ((i4 << 27) & 1879048192), (i4 & 112) | ((i4 << 3) & 7168), 512);
                        x340Var.r(false);
                        z6 = false;
                    } else {
                        x340Var.i0(-1890670888);
                        i7m i7mVar3 = (i7m) k7mVar;
                        z5 = (i3 & 112) == 32;
                        Object objT10 = x340Var.T();
                        if (z5 || objT10 == obj) {
                            objT10 = new jzk(iu30Var, (byte) 14);
                            x340Var.s0(objT10);
                        }
                        Function0 function2 = (Function0) objT10;
                        int i9 = (i3 & 14) | 12582912;
                        int i10 = i3 >> 3;
                        d(i7mVar3, kesVar, z, function0, vu30Var, i, str, true, qim0Var3, z3, 0.0f, z4, function2, x340Var, i9 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | 100663296 | ((i4 << 27) & 1879048192), (i4 & 112) | ((i4 << 3) & 7168), 512);
                        z6 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z6);
                }
                x340Var.r(z6);
                k7mVar2 = k7mVar;
            } else {
                qim0Var3 = qim0Var4;
                k7mVar2 = k7mVar;
                if (!u890.j(k7mVar2, j7m.a)) {
                    throw p3d1.k(x340Var, 1601490412, false);
                }
                x340Var.i0(1601596147);
                b(x340Var, 48 | (i4 & 896));
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            k7mVar2 = k7mVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x7m(this, k7mVar2, iu30Var, kesVar, z, function0, vu30Var, i, str, z2, qim0Var2, z3, z4, i2);
        }
    }

    public final void f(l7c1 l7c1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1579717189);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(l7c1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("content_story_card_disclaimer", d9y0.k(u291.f(qim0Var, 1.0f), ((Number) z95.b(l7c1Var != null ? 1.0f : 0.0f, (fe5) null, (String) null, (iu30) null, x340Var, 0, 30).getValue()).floatValue()));
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-45392401);
            ye5 ye5Var = new ye5();
            x340Var.i0(-45391448);
            uwr uwrVar = cbx.a;
            int iO = ye5Var.o(zma1.a(cbx.d(x340Var).j.a, cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534));
            try {
                ye5Var.g(cwl1.o0(x340Var, 2131958219));
                ye5Var.g(" ");
                ye5Var.k(iO);
                x340Var.r(false);
                af5 af5VarP = ye5Var.p();
                x340Var.r(false);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarA = nim0.a;
                qim0 qim0VarB = uyn1.B(qim0VarA, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                if (l7c1Var != null) {
                    x340Var.i0(-1406725314);
                    boolean zI = x340Var.i(af5VarP);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new v7l(af5VarP, (byte) 10);
                        x340Var.s0(objT);
                    }
                    qim0VarA = s161.a(qim0VarA, (iu30) objT);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1406613311);
                    x340Var.r(false);
                }
                uwo1.f(af5VarP, qim0VarB.then(qim0VarA), (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 2, true, new cjc0(2), 1, ox8.a, (cqs0) null, x340Var, 818110464, 0, 2060);
                x340Var = x340Var;
                x340Var.r(true);
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, l7c1Var, qim0Var, i, (byte) 9);
        }
    }

    public final void g(mr10 mr10Var, String str, String str2, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, l7c1 l7c1Var, b0k b0kVar, int i) {
        int i2;
        String str3;
        boolean z3;
        boolean z4;
        iu30 iu30Var2;
        int i3;
        boolean z5;
        dlv dlvVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2000663858);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(mr10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= x340Var.g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i2 |= x340Var.h(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((1572864 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 1048576 : 524288;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(l7c1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.i(this) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 38347923) != 38347922)) {
            fra fraVar = een.N0;
            qim0 qim0VarN = anm1.N("content_story_card_feedback_footer", qim0Var);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (l7c1Var != null) {
                x340Var.i0(279885881);
                i3 = 0;
                z5 = true;
                dlvVar = null;
                otw.c(mr10Var, new fr10(str3, (String) null, z3, (Mode) null, (String) null, false, 122), (qim0) null, (ipb1) null, x340Var, i4 & 14, 12);
                int i5 = i4 >> 18;
                l(str, l7c1Var, x340Var, ((i4 >> 3) & 14) | (i5 & 112) | (i5 & 896));
                x340Var.r(false);
            } else {
                i3 = 0;
                z5 = true;
                dlvVar = null;
                x340Var.i0(280123248);
                x340Var.r(false);
            }
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z5));
            fq7.f(z4, (qim0) null, xay.e(2, irn1.o0(150, i3, dlvVar, 6)), xay.f(2, irn1.o0(150, i3, dlvVar, 6)), (String) null, apo.r(-1161016054, new k8(iu30Var2, l7c1Var, this, str, (byte) 20), x340Var), x340Var, 1572870 | ((i4 >> 12) & 112), 18);
            x340Var = x340Var;
            x340Var.r(z5);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yo7(this, mr10Var, str, str2, qim0Var, z, z2, iu30Var, l7c1Var, i, (byte) 1);
        }
    }

    public final void h(kes kesVar, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(421174829);
        int i2 = i | (x340Var.i(kesVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            m((i2 >> 9) & 112, 1, x340Var, null);
            if (kesVar.l() > 1) {
                x340Var.i0(1729685189);
                k(kesVar, iu30Var, function0, null, x340Var, i2 & 58366);
                x340Var.r(false);
            } else {
                x340Var.i0(1729765913);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 10, i, this, kesVar, iu30Var, function0, qim0Var);
        }
    }

    public final void i(m7m m7mVar, kes kesVar, qim0 qim0Var, b0k b0kVar, int i) {
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1126811755);
        int i2 = (x340Var.i(m7mVar) ? 4 : 2) | i | (x340Var.i(kesVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            if (kesVar.l() > 4) {
                x340Var.i0(534350641);
                f = cbx.b(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(534351597);
                x340Var.r(false);
                f = 0.0f;
            }
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 16.0f + f, 0.0f, 11);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            m((i2 >> 6) & 112, 1, x340Var, null);
            if (kesVar.l() > 1) {
                x340Var.i0(281169119);
                a(m7mVar.b, kesVar, null, x340Var, i2 & 7280);
                x340Var.r(false);
            } else {
                x340Var.i0(281226779);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a8m(i, this, m7mVar, kesVar, qim0Var, (byte) 0);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final void j(mr10 mr10Var, int i, int i2, String str, String str2, qim0 qim0Var, boolean z, l7c1 l7c1Var, b0k b0kVar, int i3) {
        int i4;
        boolean z2;
        float f;
        ?? r5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(194358035);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.i(mr10Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= x340Var.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= x340Var.i(l7c1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= x340Var.i(this) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            fra fraVar = een.N0;
            qim0 qim0VarN = anm1.N("content_story_card_page_indicator_footer", u291.f(qim0Var, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (l7c1Var != null) {
                x340Var.i0(-716912100);
                z2 = false;
                f = 1.0f;
                r5 = 1;
                otw.c(mr10Var, new fr10(str, (String) null, z, (Mode) null, (String) null, false, 122), (qim0) null, (ipb1) null, x340Var, i4 & 14, 12);
                int i5 = (i4 >> 12) & 14;
                int i6 = i4 >> 18;
                l(str2, l7c1Var, x340Var, (i6 & 896) | i5 | (i6 & 112));
                x340Var.r(false);
            } else {
                z2 = false;
                f = 1.0f;
                r5 = 1;
                x340Var.i0(-716674733);
                x340Var.r(false);
            }
            kk0.s(f, (boolean) r5, x340Var);
            if (i2 > r5) {
                x340Var.i0(-716559785);
                String strN0 = cwl1.n0(2131958214, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, x340Var);
                uwr uwrVar = cbx.a;
                uwo1.e(strN0, anm1.N("content_story_card_page_indicator", uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11)), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(z2);
            } else {
                x340Var.i0(-716248173);
                x340Var.r(z2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b8m(this, mr10Var, i, i2, str, str2, qim0Var, z, l7c1Var, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(kes kesVar, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        qim0 qim0Var2;
        max haxVar;
        int i3;
        kl1 kl1Var = ((jkr0) kesVar).d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-461156020);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kesVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        int i4 = i2 | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131958215);
            int i5 = i4 & 896;
            int i6 = i4 & 112;
            boolean zI = (i6 == 32) | (i5 == 256) | x340Var.i(c9nVar) | x340Var.i(kesVar);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                d8m d8mVar = new d8m(function1, iu30Var, c9nVar, kesVar, (byte) 0);
                x340Var.s0(d8mVar);
                objT2 = d8mVar;
            }
            Function0 function2 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function2);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            int iS = ((err0) kl1Var.c).s();
            max maxVar = jax.a;
            if (iS > 0) {
                x340Var.i0(-1229767260);
                x340Var.r(false);
                haxVar = maxVar;
            } else {
                x340Var.i0(-1229711367);
                haxVar = new hax(cwl1.o0(x340Var, 2131958216));
                x340Var.r(false);
            }
            wro1.h(gbxVar, ldxVar, anm1.N("content_story_card_previous_button", qim0Var3), haxVar, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, ofi.a, x340Var, 0, 6, 968);
            String strO1 = cwl1.o0(x340Var, 2131958212);
            boolean zI2 = (i6 == 32) | (i5 == 256) | x340Var.i(c9nVar) | x340Var.i(kesVar);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                i3 = 1;
                d8m d8mVar2 = new d8m(function0, iu30Var, c9nVar, kesVar, (byte) 1);
                x340Var.s0(d8mVar2);
                objT3 = d8mVar2;
            } else {
                i3 = 1;
            }
            Function0 function3 = (Function0) objT3;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(strO1), function3);
            gdx gdxVarS2 = yla.s(x340Var);
            if (((err0) kl1Var.c).s() < kesVar.l() - i3) {
                x340Var.i0(-1228693916);
                x340Var.r(false);
            } else {
                x340Var.i0(-1228638147);
                max haxVar2 = new hax(cwl1.o0(x340Var, 2131958213));
                x340Var.r(false);
                maxVar = haxVar2;
            }
            wro1.h(gbxVar2, ldxVar, anm1.N("content_story_card_next_button", qim0Var3), maxVar, gdxVarS2, (vzq0) null, false, (idn0) null, (ga80) null, ofi.b, x340Var, 0, 6, 968);
            x340Var = x340Var;
            x340Var.r(i3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 25, i, this, kesVar, iu30Var, function0, qim0Var2);
        }
    }

    public final void l(String str, l7c1 l7c1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2017457123);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(l7c1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (this.g.w()) {
            x340Var.i0(1707301680);
            String str2 = l7c1Var.b;
            c380 c380Var = l7c1Var.d;
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((dka1) it.next()).a);
            }
            otw.c(this.f, new ny61(str, Collections.singletonList(new f5(str2, arrayList))), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        } else {
            x340Var.i0(1707690885);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, str, l7c1Var, i, (byte) 10);
        }
    }

    public final void m(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1740907716);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var.i(qim0Var2) ? 4 : 2);
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0Var4 = i4 != 0 ? nim0.a : qim0Var2;
            qim0 qim0VarN = anm1.N("content_story_card_title", qim0Var4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(cwl1.o0(x340Var, 2131958220), (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            p9p1.b((qim0) null, 0, 0, x340Var, 0, 7);
            x340Var.r(true);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, qim0Var3, i, i2, (byte) 8);
        }
    }

    public final void n(m7m m7mVar, iu30 iu30Var, int i, b0k b0kVar, int i2) {
        m7m m7mVar2;
        float f;
        c380 c380Var;
        Object hffVar;
        Function0 function0;
        ven0 ven0Var;
        kes kesVar;
        qim0 qim0Var;
        float f2;
        kes kesVar2;
        x340 x340Var;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z2;
        f8m f8mVar = this;
        m4c m4cVar = fkj0.X;
        k7m k7mVar = m7mVar.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1046245431);
        j06 j06Var = x340Var2.a;
        int i3 = i2 | (x340Var2.i(m7mVar) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.e(i) ? 256 : 128) | (x340Var2.i(f8mVar) ? 16384 : 8192);
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            boolean z3 = f8mVar.m;
            qim0 qim0VarH = u291.h(qim0VarF, z3 ? 440.0f : 400.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarH, ((yex) zex.a.d).c, er31.b(16.0f));
            mr4 mr4Var = f8mVar.g;
            if (z3 || !mr4Var.p()) {
                x340Var2.i0(419531067);
                cvx cvxVar = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 16.0f;
            } else {
                x340Var2.i0(419529497);
                x340Var2.r(false);
                f = 0.0f;
            }
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 0.0f, f, 0.0f, 16.0f, 5);
            mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z4 = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z4) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            vu30 vu30Var = y580.O0;
            nko1.H(mbhVarA, x340Var2, vu30Var);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar3);
            boolean zG = x340Var2.g(k7mVar);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                i7m i7mVar = k7mVar instanceof i7m ? (i7m) k7mVar : null;
                if (i7mVar == null || (c380Var = i7mVar.a) == null) {
                    c380Var = z6x.a;
                }
                objT = c380Var;
                x340Var2.s0(objT);
            }
            List list = (List) objT;
            boolean z5 = z3 && list.size() > 1;
            boolean zI = x340Var2.i(list);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d4e(list, (byte) 8);
                x340Var2.s0(objT2);
            }
            vu30 vu30Var2 = vu30Var;
            kes kesVarB = lkr0.b(0, (Function0) objT2, x340Var2, 0, 3);
            kl1 kl1Var = ((jkr0) kesVarB).d;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            boolean zI2 = x340Var2.i(kesVarB) | x340Var2.i(ven0Var2) | ((i3 & 112) == 32);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                function0 = function1;
                ven0Var = ven0Var2;
                hffVar = new hff(kesVarB, iu30Var, ven0Var, (lnm) null, (byte) 22);
                kesVar = kesVarB;
                x340Var2.s0(hffVar);
            } else {
                function0 = function1;
                ven0Var = ven0Var2;
                hffVar = objT4;
                kesVar = kesVarB;
            }
            qxd0.t(kesVar, x340Var2, (vu30) hffVar);
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(b7x.a);
                x340Var2.s0(objT6);
            }
            ven0 ven0Var4 = (ven0) objT6;
            boolean zE = x340Var2.e(((err0) kl1Var.c).s()) | x340Var2.g(list);
            llj lljVar4 = lljVar2;
            Object objT7 = x340Var2.T();
            if (zE || objT7 == m4cVar) {
                objT7 = yv91.a(new gmj(list, kesVar, (byte) 26));
                x340Var2.s0(objT7);
            }
            tob1 tob1Var = (tob1) objT7;
            boolean zE2 = x340Var2.e(((err0) kl1Var.c).s()) | x340Var2.g((Map) ven0Var4.getValue());
            Object objT8 = x340Var2.T();
            if (zE2 || objT8 == m4cVar) {
                objT8 = yv91.a(new vm1(z5, kesVar, ven0Var4, (byte) 6));
                x340Var2.s0(objT8);
            }
            tob1 tob1Var2 = (tob1) objT8;
            if (z5) {
                x340Var2.i0(1527978195);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                f8mVar.m((i3 >> 9) & 112, 0, x340Var2, uyn1.z(16.0f, 0.0f, 2, qim0Var2));
                x340Var2.r(false);
                x340Var = x340Var2;
                mr4Var = mr4Var;
                kesVar2 = kesVar;
                lljVar4 = lljVar4;
                f3 = 1.0f;
                qim0Var = qim0Var2;
                f2 = 16.0f;
                z = false;
                vu30Var2 = vu30Var2;
            } else {
                if (mr4Var.p()) {
                    x340Var2.i0(1528200713);
                    boolean zI3 = x340Var2.i(ven0Var);
                    Object objT9 = x340Var2.T();
                    if (zI3 || objT9 == m4cVar) {
                        objT9 = new hnf(ven0Var, (byte) 12);
                        x340Var2.s0(objT9);
                    }
                    Function0 function2 = (Function0) objT9;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    if (kesVar.l() > 1) {
                        x340Var2.i0(-89238571);
                        cvx cvxVar5 = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                        f4 = 6.0f;
                    } else {
                        x340Var2.i0(-89236687);
                        cvx cvxVar6 = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                        f4 = 16.0f;
                    }
                    cvx cvxVar7 = cbx.b(x340Var2).b;
                    kes kesVar3 = kesVar;
                    qim0Var = qim0Var2;
                    f2 = 16.0f;
                    f8mVar.h(kesVar3, iu30Var, function2, uyn1.B(qim0Var, 16.0f, f4, 0.0f, 6.0f, 4), x340Var2, i3 & 57456);
                    x340Var2.r(false);
                    f8mVar = this;
                    z = false;
                    kesVar2 = kesVar3;
                    x340Var = x340Var2;
                } else {
                    kes kesVar4 = kesVar;
                    qim0Var = qim0Var2;
                    f2 = 16.0f;
                    x340Var2.i0(1528758589);
                    cvx cvxVar8 = cbx.b(x340Var2).b;
                    f8mVar = this;
                    kesVar2 = kesVar4;
                    f8mVar.i(m7mVar, kesVar2, uyn1.z(16.0f, 0.0f, 2, qim0Var), x340Var2, (i3 & 14) | ((i3 >> 3) & 7168));
                    x340Var = x340Var2;
                    z = false;
                    x340Var.r(false);
                }
                f3 = 1.0f;
            }
            qim0 qim0VarH2 = kx40.h(f3, u291.d(qim0Var, f3), true);
            if (z5) {
                x340Var.i0(-89218667);
                cvx cvxVar9 = cbx.b(x340Var).b;
                x340Var.r(z);
                f5 = 8.0f;
            } else if (mr4Var.p()) {
                x340Var.i0(-89216433);
                x340Var.r(z);
                f5 = 0.0f;
            } else {
                x340Var.i0(-89214639);
                cvx cvxVar10 = cbx.b(x340Var).b;
                x340Var.r(z);
                f5 = f2;
            }
            if (z5) {
                x340Var.i0(-89212497);
                x340Var.r(z);
                f6 = 0.0f;
            } else {
                x340Var.i0(-89211375);
                cvx cvxVar11 = cbx.b(x340Var).b;
                x340Var.r(z);
                f6 = f2;
            }
            if (z5) {
                x340Var.i0(-89209873);
                x340Var.r(z);
                f7 = 0.0f;
            } else {
                x340Var.i0(-89208751);
                cvx cvxVar12 = cbx.b(x340Var).b;
                x340Var.r(z);
                f7 = f2;
            }
            qim0 qim0VarN = anm1.N("content_story_card_content_container", uyn1.B(qim0VarH2, f6, f5, f7, 0.0f, 8));
            gfh0 gfh0VarC = t1c.c(een.d, z);
            boolean z6 = z5;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, vu30Var2);
            nko1.H(xos0VarM2, x340Var, lljVar);
            x0d.q(iHashCode2, x340Var, lljVar4, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar3);
            ely0 ely0VarA = ef.a.a(f8mVar.a);
            x340 x340Var3 = x340Var;
            lv1 lv1Var = new lv1(this, m7mVar, iu30Var, kesVar2, ven0Var3, ven0Var4, i, z6);
            m7mVar2 = m7mVar;
            mod.b(ely0VarA, apo.r(-551256461, lv1Var, x340Var3), x340Var3, 56);
            x340Var3.r(true);
            if (z6) {
                z2 = true;
                x340Var2 = x340Var3;
                x340Var2.i0(1531127733);
                x340Var2.r(false);
            } else {
                x340Var3.i0(1530510523);
                mr10 mr10Var = (mr10) this.j.getValue();
                String str = m7mVar2.a;
                l7c1 l7c1Var = (l7c1) tob1Var.getValue();
                String str2 = l7c1Var != null ? l7c1Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
                l7c1 l7c1Var2 = (l7c1) tob1Var.getValue();
                cvx cvxVar13 = cbx.b(x340Var3).b;
                cvx cvxVar14 = cbx.b(x340Var3).b;
                z2 = true;
                g(mr10Var, str, str2, uyn1.B(qim0Var, 8.0f, 0.0f, 16.0f, 0.0f, 10), k7mVar instanceof i7m, zBooleanValue, iu30Var, l7c1Var2, x340Var3, ((i3 << 15) & 3670016) | ((i3 << 12) & 234881024));
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            l7c1 l7c1Var3 = (l7c1) tob1Var.getValue();
            cvx cvxVar15 = cbx.b(x340Var2).b;
            f(l7c1Var3, uyn1.z(16.0f, 0.0f, 2, qim0Var), x340Var2, (i3 >> 6) & 896);
            x340Var2.r(z2);
        } else {
            m7mVar2 = m7mVar;
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, m7mVar2, iu30Var, i, i2);
        }
    }
}
