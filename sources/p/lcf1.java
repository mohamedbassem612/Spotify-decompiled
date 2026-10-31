package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lcf1 implements qj41 {
    public final /* synthetic */ byte a = 1;
    public final List b;
    public final boolean c;
    public final qk41 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final cv30 h;
    public final Object i;

    public lcf1(wj31 wj31Var, jfe jfeVar, ven0 ven0Var, qk41 qk41Var, List list, Map map, boolean z, Function0 function0) {
        this.e = jfeVar;
        this.f = ven0Var;
        this.d = qk41Var;
        this.b = list;
        this.g = map;
        this.c = z;
        this.h = function0;
        this.i = new ej31(wj31Var, qk41Var, list, map, new nsb1(this, (byte) 20));
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        b0k b0kVar2;
        x340 x340Var;
        x340 x340Var2;
        qim0 qim0VarC;
        boolean z;
        lcf1 lcf1Var = this;
        byte b = lcf1Var.a;
        Object obj = lcf1Var.i;
        switch (b) {
            case 0:
                boolean z2 = true;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-1791357527);
                int i3 = (i2 & 6) == 0 ? i2 | (b0kVar3.g(i2cVar) ? 4 : 2) : i2;
                if ((i2 & 48) == 0) {
                    i3 |= b0kVar3.e(i) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i3 |= (i2 & 512) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 256 : 128;
                }
                if ((i2 & 24576) == 0) {
                    i3 |= b0kVar3.i(lcf1Var) ? 16384 : 8192;
                }
                if (b0kVar3.Y(i3 & 1, (i3 & 8339) != 8338)) {
                    ej31 ej31Var = (ej31) obj;
                    if (!rk41Var.a && !lcf1Var.c) {
                        z2 = false;
                    }
                    int i4 = i3;
                    rk41 rk41Var2 = new rk41(z2, rk41Var.b, rk41Var.c);
                    Object objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = q9f1.e;
                        b0kVar3.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    int i5 = (i4 & 14) | 3072 | (i4 & 112) | 32768;
                    b0kVar2 = b0kVar3;
                    ej31Var.a(i2cVar, i, rk41Var2, function1, b0kVar2, i5);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lk0(lcf1Var, i2cVar, i, rk41Var, function0, i2, (byte) 21);
                }
                break;
            default:
                Float fValueOf = Float.valueOf(1.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                m4c m4cVar = fkj0.X;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-1096308696);
                int i6 = (i2 & 6) == 0 ? (x340Var3.g(i2cVar) ? 4 : 2) | i2 : i2;
                if ((i2 & 48) == 0) {
                    i6 |= x340Var3.e(i) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i6 |= (i2 & 512) == 0 ? x340Var3.g(rk41Var) : x340Var3.i(rk41Var) ? 256 : 128;
                }
                if ((i2 & 24576) == 0) {
                    i6 |= x340Var3.i(lcf1Var) ? 16384 : 8192;
                }
                if (x340Var3.Y(i6 & 1, (i6 & 8339) != 8338)) {
                    int iI0 = ((wat) x340Var3.k(t4k.h)).i0(i2cVar.c());
                    float f = iI0;
                    int iU = jch0.U(f * 0.75f);
                    boolean zE = x340Var3.e(iI0);
                    Object objT2 = x340Var3.T();
                    if (zE || objT2 == m4cVar) {
                        objT2 = bb00.h(0, x340Var3);
                    }
                    err0 err0Var = (hdn0) objT2;
                    int iS = err0Var.s();
                    int i7 = iI0 - iU;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    float fO = iI0 <= 0 ? 0.0f : yoi1.o(((i7 / 2) + iS) / f, 0.0f, 1.0f);
                    Integer numValueOf = Integer.valueOf(i);
                    Float fValueOf3 = Float.valueOf(fO);
                    boolean zG = x340Var3.g(err0Var) | x340Var3.i(lcf1Var) | x340Var3.d(fO);
                    Object objT3 = x340Var3.T();
                    tob1 tob1VarS = null;
                    if (zG || objT3 == m4cVar) {
                        objT3 = new kxx(err0Var, this, fO, (lnm) null, (byte) 5);
                        err0Var = err0Var;
                        lcf1Var = this;
                        x340Var3.s0(objT3);
                    }
                    qxd0.s(numValueOf, fValueOf3, (vu30) objT3, x340Var3);
                    x340Var3.f0(-1285643864, Integer.valueOf(i));
                    ilv.a.getClass();
                    pxg1 pxg1Var = new pxg1(700, 100, flv.g);
                    tzg1 tzg1Var = rno1.a;
                    ven0 ven0VarS = zod.S(new hsi1("telepathyTitleIn", fValueOf, fValueOf2, pxg1Var, tzg1Var), rk41Var.a, lcf1Var.c, (Function0) null, x340Var3, 8, 8);
                    x340Var3.r(false);
                    boolean z3 = (i6 & 112) == 32;
                    Object objT4 = x340Var3.T();
                    if (z3 || objT4 == m4cVar) {
                        objT4 = v8r.q((Object) null);
                        x340Var3.s0(objT4);
                    }
                    ven0 ven0Var = (ven0) objT4;
                    zc30 zc30Var = (zc30) ven0Var.getValue();
                    zc30 zc30Var2 = zc30.b;
                    if (zc30Var == null) {
                        x340Var3.i0(-1199183379);
                        x340Var3.r(false);
                        x340Var2 = x340Var3;
                    } else {
                        x340Var3.i0(-1199183378);
                        int i8 = zc30Var == zc30Var2 ? 4000 : 1500;
                        x340Var3.f0(-240360392, Integer.valueOf(i));
                        tob1VarS = zod.S(new hsi1("telepathyBodyIn", fValueOf, fValueOf2, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, i8, flv.d), tzg1Var), rk41Var.a, lcf1Var.c, (j4f1) obj, x340Var3, 8, 0);
                        x340Var2 = x340Var3;
                        x340Var2.r(false);
                        x340Var2.r(false);
                    }
                    boolean zG2 = x340Var2.g(tob1VarS);
                    Object objT5 = x340Var2.T();
                    if (zG2 || objT5 == m4cVar) {
                        objT5 = new bu2(tob1VarS, (byte) 29);
                        x340Var2.s0(objT5);
                    }
                    Function0 function2 = (Function0) objT5;
                    boolean zG3 = x340Var2.g(ven0Var) | x340Var2.g(function2);
                    Object objT6 = x340Var2.T();
                    if (zG3 || objT6 == m4cVar) {
                        objT6 = new swi0(ven0Var, function2, (byte) 18);
                        x340Var2.s0(objT6);
                    }
                    Function0 function3 = (Function0) objT6;
                    boolean zG4 = x340Var2.g(tob1VarS);
                    Object objT7 = x340Var2.T();
                    if (zG4 || objT7 == m4cVar) {
                        objT7 = yv91.a(new uuc1(function3, (byte) 29));
                        x340Var2.s0(objT7);
                    }
                    tob1 tob1Var = (tob1) objT7;
                    qim0 qim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    boolean zG5 = x340Var2.g(ven0VarS);
                    Object objT8 = x340Var2.T();
                    if (zG5 || objT8 == m4cVar) {
                        objT8 = new eyg1(ven0VarS, (byte) 6);
                        x340Var2.s0(objT8);
                    }
                    qim0 qim0VarC2 = i541.C(qim0VarF, (iu30) objT8);
                    qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                    boolean zG6 = x340Var2.g(tob1VarS);
                    Object objT9 = x340Var2.T();
                    if (zG6 || objT9 == m4cVar) {
                        objT9 = new eyg1(tob1VarS, (byte) 5);
                        x340Var2.s0(objT9);
                    }
                    qim0 qim0VarC3 = i541.C(qim0VarF2, (iu30) objT9);
                    if (((zc30) ven0Var.getValue()) == zc30Var2) {
                        x340Var2.i0(-1197068620);
                        boolean zG7 = x340Var2.g(function3);
                        Object objT10 = x340Var2.T();
                        if (zG7 || objT10 == m4cVar) {
                            z = false;
                            objT10 = new izg1(function3, (byte) 0);
                            x340Var2.s0(objT10);
                        } else {
                            z = false;
                        }
                        qim0VarC = i541.C(qim0Var, (iu30) objT10);
                        x340Var2.r(z);
                    } else {
                        x340Var2.i0(-1196902336);
                        x340Var2.r(false);
                        qim0VarC = qim0Var;
                    }
                    qim0 qim0VarA = i2cVar.a(u291.c(u291.f(qim0Var, 1.0f), 0.75f), een.h);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarU = qxy0.u(uyn1.z(cbx.b(x340Var2).b.b, 0.0f, 2, qim0VarA), (idn0) null, 3);
                    Object objT11 = x340Var2.T();
                    if (objT11 == m4cVar) {
                        objT11 = ppg1.e1;
                        x340Var2.s0(objT11);
                    }
                    qim0 qim0VarB = s161.b(qim0VarU, true, (iu30) objT11);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    float f2 = cbx.b(x340Var2).b.b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
                    boolean zG8 = x340Var2.g(ven0Var);
                    Object objT12 = x340Var2.T();
                    if (zG8 || objT12 == m4cVar) {
                        objT12 = new i2g1(ven0Var, (byte) 4);
                        x340Var2.s0(objT12);
                    }
                    iu30 iu30Var = (iu30) objT12;
                    boolean zG9 = x340Var2.g(err0Var);
                    Object objT13 = x340Var2.T();
                    if (zG9 || objT13 == m4cVar) {
                        objT13 = new k5r0(err0Var, (byte) 5);
                        x340Var2.s0(objT13);
                    }
                    lcf1 lcf1Var2 = lcf1Var;
                    lcf1Var = lcf1Var2;
                    x340 x340Var4 = x340Var2;
                    grn1.k(f2, function2, function3, zBooleanValue, iu30Var, (iu30) objT13, apo.r(-283675495, new gzg1(lcf1Var, qim0VarC2, (byte) 0), x340Var2), apo.r(1408233867, new um81(qim0VarC, lcf1Var2, rk41Var, i, (byte) 23), x340Var2), apo.r(72860138, new gzg1(lcf1Var, qim0VarC3, (byte) 1), x340Var2), qim0VarB, x340Var4, 805309440);
                    x340Var = x340Var4;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new lk0(lcf1Var, i2cVar, i, rk41Var, function0, i2, (byte) 24);
                }
                break;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        return this.d;
    }

    public lcf1(czg1 czg1Var, czg1 czg1Var2, wj31 wj31Var, List list, boolean z, hcf1 hcf1Var, j4f1 j4f1Var) {
        qk41 ok41Var;
        this.e = czg1Var;
        this.f = czg1Var2;
        this.g = wj31Var;
        this.b = list;
        this.c = z;
        this.h = hcf1Var;
        this.i = j4f1Var;
        if (z) {
            ok41Var = new ok41(2500);
        } else {
            ok41Var = pk41.a;
        }
        this.d = ok41Var;
    }
}
