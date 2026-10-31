package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class naj extends hab0 implements bv30 {
    public static final naj N0;
    public static final naj O0;
    public static final naj P0;
    public static final naj Q0;
    public static final naj R0;
    public static final naj S0;
    public static final naj T0;
    public static final naj U0;
    public static final naj V0;
    public static final naj W0;
    public static final naj X;
    public static final naj X0;
    public static final naj Y;
    public static final naj Y0;
    public static final naj Z;
    public static final naj Z0;
    public static final naj a1;
    public static final naj b;
    public static final naj b1;
    public static final naj c;
    public static final naj c1;
    public static final naj d;
    public static final naj d1;
    public static final naj e;
    public static final naj e1;
    public static final naj f;
    public static final naj g;
    public static final naj h;
    public static final naj i;
    public static final naj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new naj(i2, (byte) 0);
        c = new naj(i2, (byte) 1);
        d = new naj(i2, (byte) 2);
        e = new naj(i2, (byte) 3);
        f = new naj(i2, (byte) 4);
        g = new naj(i2, (byte) 5);
        h = new naj(i2, (byte) 6);
        i = new naj(i2, (byte) 7);
        t = new naj(i2, (byte) 8);
        X = new naj(i2, (byte) 9);
        Y = new naj(i2, (byte) 10);
        Z = new naj(i2, (byte) 11);
        N0 = new naj(i2, (byte) 12);
        O0 = new naj(i2, (byte) 13);
        P0 = new naj(i2, (byte) 14);
        Q0 = new naj(i2, (byte) 15);
        R0 = new naj(i2, (byte) 16);
        S0 = new naj(i2, (byte) 17);
        T0 = new naj(i2, (byte) 18);
        U0 = new naj(i2, (byte) 19);
        V0 = new naj(i2, (byte) 20);
        W0 = new naj(i2, (byte) 21);
        X0 = new naj(i2, (byte) 22);
        Y0 = new naj(i2, (byte) 23);
        Z0 = new naj(i2, (byte) 24);
        a1 = new naj(i2, (byte) 25);
        b1 = new naj(i2, (byte) 26);
        c1 = new naj(i2, (byte) 27);
        d1 = new naj(i2, (byte) 28);
        e1 = new naj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ naj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        hax haxVar;
        c621 c621Var = (c621) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ldx ldxVar = ldx.c;
        gdx gdxVarS = yla.s(x340Var);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new n9j(iu30Var, (byte) 25);
            x340Var2.s0(objT);
        }
        gbx gbxVar = new gbx(z50.c, (Function0) objT);
        if (c621Var.c) {
            x340Var2.i0(1757093525);
            haxVar = new hax(cwl1.o0(x340Var2, 2131959649));
            x340Var2.r(false);
        } else {
            x340Var2.i0(1757245053);
            x340Var2.r(false);
            haxVar = jax.a;
        }
        wro1.h(gbxVar, ldxVar, anm1.N("parental_hub_entity_row_remove_button_trailing_action", nim0.a), haxVar, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, zcj.a, x340Var2, 0, 6, 968);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        e721 e721Var = (e721) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = e721Var.a;
        int iOrdinal = e721Var.b.ordinal();
        boolean z = true;
        if (iOrdinal == 0 || iOrdinal == 1) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1154030944);
            int i2 = (iIntValue & 896) ^ 384;
            boolean z2 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new n9j(iu30Var, (byte) 26);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if ((i2 <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new n9j(iu30Var, (byte) 27);
                x340Var2.s0(objT2);
            }
            z6p1.j(str, function0, (Function0) objT2, x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (iOrdinal != 2) {
                throw p3d1.k(x340Var, -1154032958, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1154022734);
            int i3 = (iIntValue & 896) ^ 384;
            boolean z3 = (i3 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT3 = x340Var3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new n9j(iu30Var, (byte) 28);
                x340Var3.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            if ((i3 <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT4 = x340Var3.T();
            if (z || objT4 == m4cVar) {
                objT4 = new n9j(iu30Var, (byte) 29);
                x340Var3.s0(objT4);
            }
            z6p1.n(str, function1, (Function0) objT4, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        oc21 oc21Var = (qc21) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        WeakHashMap weakHashMap = osl1.x;
        u85 u85Var = lhc.g(x340Var).g;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarO = td6.o(u85Var, 32, nim0Var);
        if (oc21Var instanceof pc21) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1062386996);
            gra graVar = een.h;
            qim0 qim0VarThen = u291.f(nim0Var, 1.0f).then(qim0VarO);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarW = uyn1.w(qim0VarThen, new zzq0(16.0f, 16.0f, 16.0f, 16.0f));
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            xto1.e((qim0) null, 0, 0L, 0L, x340Var2, 0, 15);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            if (!(oc21Var instanceof oc21)) {
                throw p3d1.k(x340Var, 1973932159, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1062688068);
            qim0 qim0VarThen2 = u291.f(nim0Var, 1.0f).then(qim0VarO);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var3).b;
            j7p1.f(oc21Var, uyn1.w(qim0VarThen2, new zzq0(16.0f, 16.0f, 16.0f, 16.0f)), iu30Var, x340Var3, (iIntValue & 896) | ((iIntValue >> 3) & 14));
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ge21 ge21Var = (ge21) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = ge21Var.a.b;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new hdj(iu30Var, (byte) 0);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(str)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        poo1.e(new gbx(new y50(str), function0), pex.b, yoo1.z(x340Var2), (qim0) null, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(1275719231, new l8i(ge21Var, (byte) 24), x340Var2), x340Var2, 0, 3072, 8184);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rf21 rf21Var = (rf21) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        dzo1 dzo1Var = rf21Var.c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new hdj(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        gbx gbxVar = new gbx(dzo1Var, (Function0) objT);
        idx idxVar = new idx();
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        cvx cvxVar2 = cbx.b(x340Var2).b;
        foo1.c(gbxVar, idxVar, (qim0) null, (max) null, (gdx) null, new zzq0(16.0f, 4.0f, 16.0f, 4.0f), (idn0) null, (ga80) null, apo.r(-192327836, new kdj(rf21Var, (byte) 0), x340Var2), (vu30) null, apo.r(258992563, new kdj(rf21Var, (byte) 1), x340Var2), x340Var2, 805306368, 48, 1468);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        lee1 lee1Var;
        boolean z;
        jax haxVar;
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                n9y0 n9y0Var = (n9y0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    i2 = iIntValue | ((iIntValue & 64) == 0 ? x340Var.g(n9y0Var) : x340Var.i(n9y0Var) ? 32 : 16);
                } else {
                    i2 = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    qim0 qim0VarR = d7e.r(dz61.d.a, u291.v(nim0Var, 192.0f), false);
                    m9y0 m9y0Var = n9y0Var.b;
                    if (u890.j(m9y0Var, l9y0.a)) {
                        x340Var2.i0(-433472193);
                        dxo1.k(qim0VarR, x340Var2, 0);
                        x340Var2.r(false);
                    } else if (u890.j(m9y0Var, j9y0.a)) {
                        x340Var2.i0(-433470148);
                        z2 = (i2 & 896) == 256;
                        Object objT = x340Var2.T();
                        if (z2 || objT == fkj0.X) {
                            objT = new n9j(iu30Var, (byte) 12);
                            x340Var2.s0(objT);
                        }
                        rwo1.h(0, (Function0) objT, x340Var2, qim0VarR);
                        x340Var2.r(false);
                    } else {
                        if (!(m9y0Var instanceof k9y0)) {
                            throw p3d1.k(x340Var2, -433474040, false);
                        }
                        x340Var2.i0(-433466761);
                        jzn1.j(((k9y0) m9y0Var).a, zr7.i(qim0VarR, gce0.a1), (xu30) null, (xu30) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                d4z0 d4z0Var = (d4z0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                h4z0 h4z0Var = d4z0Var.c;
                boolean z3 = d4z0Var.d;
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var4 = x340Var3;
                Object objT2 = x340Var4.T();
                if (z2 || objT2 == fkj0.X) {
                    objT2 = new n9j(iu30Var2, (byte) 13);
                    x340Var4.s0(objT2);
                }
                dio1.i(h4z0Var, z3, (Function0) objT2, x340Var4, 0);
                return rih1Var;
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                boolean z4 = ((((iIntValue3 & 112) ^ 48) > 32 && x340Var5.h(zBooleanValue)) || (iIntValue3 & 48) == 32) | ((((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var3)) || (iIntValue3 & 384) == 256);
                x340 x340Var6 = x340Var5;
                Object objT3 = x340Var6.T();
                if (z4 || objT3 == fkj0.X) {
                    objT3 = new z20(zBooleanValue, iu30Var3, (byte) 10);
                    x340Var6.s0(objT3);
                }
                xa4.e((iIntValue3 >> 3) & 14, (Function0) objT3, x340Var6, (qim0) null, zBooleanValue);
                return rih1Var;
            case 3:
                wmo1.g((fkz0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 4:
                uwr uwrVar = cbx.a;
                xlz0 xlz0Var = (xlz0) obj2;
                ((Number) obj5).intValue();
                x340 x340Var7 = (b0k) obj4;
                boolean zI = x340Var7.i(xlz0Var);
                Object objT4 = x340Var7.T();
                if (zI || objT4 == fkj0.X) {
                    objT4 = new hzb(xlz0Var, (lnm) null, (byte) 14);
                    x340Var7.s0(objT4);
                }
                qxd0.t(rih1Var, x340Var7, (vu30) objT4);
                if (xlz0Var.b) {
                    x340Var7.i0(-1968743131);
                    lee1Var = cbx.d(x340Var7).d;
                } else {
                    x340Var7.i0(-1968742012);
                    lee1Var = cbx.d(x340Var7).c;
                }
                x340Var7.r(false);
                qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), een.Z, 2);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var7, 0);
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarZ);
                hzj.A.getClass();
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(mbhVarA, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                eso1.e(Uri.parse("https://learning-public-assets-cdn.spotifycdn.com/quiz/quotes.png"), isl.a, u291.r(nim0Var, 34.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var7, 48, 0, 4088);
                uwo1.e(xlz0Var.a.a, u291.f(nim0Var, 1.0f), lee1Var, cbx.a(x340Var7).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2016);
                x340Var7.r(true);
                return rih1Var;
            case 5:
                jrz0 jrz0Var = (jrz0) obj2;
                rno1.b(mqo1.A(jrz0Var.b), jrz0Var.c, jrz0Var.d, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() << 3) & 7168);
                return rih1Var;
            case 6:
                ltz0 ltz0Var = (ltz0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                String str = ltz0Var.a;
                int i3 = ltz0Var.b;
                boolean z5 = ltz0Var.c;
                z = (((iIntValue4 & 896) ^ 384) > 256 && x340Var8.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT5 = x340Var9.T();
                if (z || objT5 == fkj0.X) {
                    objT5 = new k4j(iu30Var4, (byte) 9);
                    x340Var9.s0(objT5);
                }
                foo1.j(str, i3, z5, (iu30) objT5, (qim0) null, x340Var9, 0);
                return rih1Var;
            case 7:
                ioo1.s((duz0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 8:
                kuz0 kuz0Var = (kuz0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                boolean z6 = kuz0Var.a;
                boolean z7 = kuz0Var.b;
                int i4 = (iIntValue5 & 896) ^ 384;
                boolean z8 = (i4 > 256 && x340Var10.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var11 = x340Var10;
                Object objT6 = x340Var11.T();
                if (z8 || objT6 == m4cVar) {
                    objT6 = new n9j(iu30Var5, (byte) 14);
                    x340Var11.s0(objT6);
                }
                Function0 function0 = (Function0) objT6;
                z = (i4 > 256 && x340Var11.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT7 = x340Var11.T();
                if (z || objT7 == m4cVar) {
                    objT7 = new n9j(iu30Var5, (byte) 15);
                    x340Var11.s0(objT7);
                }
                poo1.n(0, function0, (Function0) objT7, x340Var11, z6, z7);
                return rih1Var;
            case 9:
                lyz0 lyz0Var = (lyz0) obj2;
                epo1.q(((Number) obj5).intValue() & 896, (b0k) obj4, (iu30) obj3, mqo1.A(lyz0Var.f), (qim0) null, lyz0Var.c);
                return rih1Var;
            case 10:
                upo1.k((j001) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 11:
                ta01 ta01Var = (ta01) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                boolean z9 = (((iIntValue6 & 896) ^ 384) > 256 && x340Var12.g(iu30Var6)) || (iIntValue6 & 384) == 256;
                x340 x340Var13 = x340Var12;
                Object objT8 = x340Var13.T();
                if (z9 || objT8 == fkj0.X) {
                    objT8 = new n9j(iu30Var6, (byte) 16);
                    x340Var13.s0(objT8);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT8);
                lex lexVarZ = yoo1.z(x340Var13);
                pex pexVar = pex.b;
                if (ta01Var.c) {
                    x340Var13.i0(170622080);
                    x340Var13.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var13.i0(170623622);
                    haxVar = new hax(cwl1.o0(x340Var13, 2131960887));
                    x340Var13.r(false);
                }
                jax jaxVar = haxVar;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var13).b;
                poo1.e(gbxVar, pexVar, lexVarZ, anm1.N("ereader_read_button", uyn1.z(0.0f, 8.0f, 1, nim0Var)), 0, (String) null, jaxVar, nbj.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, nbj.b, x340Var13, 12582912, 3072, 7984);
                return rih1Var;
            case 12:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                if (((fc01) obj2).a) {
                    x340 x340Var15 = x340Var14;
                    x340Var15.i0(804337215);
                    int i5 = (iIntValue7 & 896) ^ 384;
                    boolean z10 = (i5 > 256 && x340Var15.g(iu30Var7)) || (iIntValue7 & 384) == 256;
                    Object objT9 = x340Var15.T();
                    if (z10 || objT9 == m4cVar2) {
                        objT9 = new k4j(iu30Var7, (byte) 10);
                        x340Var15.s0(objT9);
                    }
                    iu30 iu30Var8 = (iu30) objT9;
                    if ((i5 <= 256 || !x340Var15.g(iu30Var7)) && (iIntValue7 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT10 = x340Var15.T();
                    if (z2 || objT10 == m4cVar2) {
                        objT10 = new n9j(iu30Var7, (byte) 17);
                        x340Var15.s0(objT10);
                    }
                    pro1.i(0, (Function0) objT10, x340Var15, iu30Var8);
                    x340Var15.r(false);
                } else {
                    x340 x340Var16 = x340Var14;
                    x340Var16.i0(804545752);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 13:
                ((Number) obj5).intValue();
                qro1.i(0, 1, ((ld01) obj2).a, (b0k) obj4, (qim0) null);
                return rih1Var;
            case 14:
                ge01 ge01Var = (ge01) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                if (ge01Var.a) {
                    x340 x340Var18 = x340Var17;
                    x340Var18.i0(182715486);
                    int i6 = ge01Var.b;
                    int i7 = ge01Var.c;
                    int i8 = (iIntValue8 & 896) ^ 384;
                    boolean z11 = (i8 > 256 && x340Var18.g(iu30Var9)) || (iIntValue8 & 384) == 256;
                    Object objT11 = x340Var18.T();
                    if (z11 || objT11 == m4cVar3) {
                        objT11 = new k4j(iu30Var9, (byte) 11);
                        x340Var18.s0(objT11);
                    }
                    iu30 iu30Var10 = (iu30) objT11;
                    boolean z12 = (i8 > 256 && x340Var18.g(iu30Var9)) || (iIntValue8 & 384) == 256;
                    Object objT12 = x340Var18.T();
                    if (z12 || objT12 == m4cVar3) {
                        objT12 = new k4j(iu30Var9, (byte) 12);
                        x340Var18.s0(objT12);
                    }
                    iu30 iu30Var11 = (iu30) objT12;
                    boolean z13 = (i8 > 256 && x340Var18.g(iu30Var9)) || (iIntValue8 & 384) == 256;
                    Object objT13 = x340Var18.T();
                    if (z13 || objT13 == m4cVar3) {
                        objT13 = new n9j(iu30Var9, (byte) 18);
                        x340Var18.s0(objT13);
                    }
                    Function0 function1 = (Function0) objT13;
                    boolean z14 = (i8 > 256 && x340Var18.g(iu30Var9)) || (iIntValue8 & 384) == 256;
                    Object objT14 = x340Var18.T();
                    if (z14 || objT14 == m4cVar3) {
                        objT14 = new n9j(iu30Var9, (byte) 19);
                        x340Var18.s0(objT14);
                    }
                    Function0 function2 = (Function0) objT14;
                    if ((i8 <= 256 || !x340Var18.g(iu30Var9)) && (iIntValue8 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT15 = x340Var18.T();
                    if (z2 || objT15 == m4cVar3) {
                        objT15 = new n9j(iu30Var9, (byte) 20);
                        x340Var18.s0(objT15);
                    }
                    zro1.j(i6, i7, iu30Var10, iu30Var11, function1, function2, (Function0) objT15, x340Var18, 0);
                    x340Var18.r(false);
                } else {
                    x340 x340Var19 = x340Var17;
                    x340Var19.i0(183167156);
                    x340Var19.r(false);
                }
                return rih1Var;
            case 15:
                pe01 pe01Var = (pe01) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                if (pe01Var.a) {
                    x340 x340Var21 = x340Var20;
                    x340Var21.i0(1225787892);
                    hc01 hc01Var = pe01Var.b;
                    fd01 fd01Var = pe01Var.c;
                    int i9 = pe01Var.d;
                    int i10 = (iIntValue9 & 896) ^ 384;
                    boolean z15 = (i10 > 256 && x340Var21.g(iu30Var12)) || (iIntValue9 & 384) == 256;
                    Object objT16 = x340Var21.T();
                    if (z15 || objT16 == m4cVar4) {
                        objT16 = new k4j(iu30Var12, (byte) 13);
                        x340Var21.s0(objT16);
                    }
                    iu30 iu30Var13 = (iu30) objT16;
                    boolean z16 = (i10 > 256 && x340Var21.g(iu30Var12)) || (iIntValue9 & 384) == 256;
                    Object objT17 = x340Var21.T();
                    if (z16 || objT17 == m4cVar4) {
                        objT17 = new k4j(iu30Var12, (byte) 14);
                        x340Var21.s0(objT17);
                    }
                    iu30 iu30Var14 = (iu30) objT17;
                    boolean z17 = (i10 > 256 && x340Var21.g(iu30Var12)) || (iIntValue9 & 384) == 256;
                    Object objT18 = x340Var21.T();
                    if (z17 || objT18 == m4cVar4) {
                        objT18 = new k4j(iu30Var12, (byte) 15);
                        x340Var21.s0(objT18);
                    }
                    iu30 iu30Var15 = (iu30) objT18;
                    boolean z18 = (i10 > 256 && x340Var21.g(iu30Var12)) || (iIntValue9 & 384) == 256;
                    Object objT19 = x340Var21.T();
                    if (z18 || objT19 == m4cVar4) {
                        objT19 = new n9j(iu30Var12, (byte) 21);
                        x340Var21.s0(objT19);
                    }
                    Function0 function3 = (Function0) objT19;
                    if ((i10 <= 256 || !x340Var21.g(iu30Var12)) && (iIntValue9 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT20 = x340Var21.T();
                    if (z2 || objT20 == m4cVar4) {
                        objT20 = new n9j(iu30Var12, (byte) 22);
                        x340Var21.s0(objT20);
                    }
                    cso1.q(hc01Var, fd01Var, i9, iu30Var13, iu30Var14, iu30Var15, function3, (Function0) objT20, x340Var21, 0);
                    x340Var21.r(false);
                } else {
                    x340 x340Var22 = x340Var20;
                    x340Var22.i0(1226279924);
                    x340Var22.r(false);
                }
                return rih1Var;
            case 16:
                luo1.j((dl01) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 17:
                et01 et01Var = (et01) obj2;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= x340Var23.g(et01Var) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue10 & 1, (iIntValue10 & 1041) != 1040)) {
                    qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 8.0f);
                    Object objT21 = x340Var24.T();
                    if (objT21 == fkj0.X) {
                        objT21 = oqi.U0;
                        x340Var24.s0(objT21);
                    }
                    qim0 qim0VarB = s161.b(qim0VarY, false, (iu30) objT21);
                    String str2 = et01Var.a;
                    zic0 zic0Var = new zic0(1);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str2, qim0VarB, cbx.d(x340Var24).e, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 0, false, zic0Var, 0, (qx8) null, x340Var24, 0, 0, 1776);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var25 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue11 & 1, (iIntValue11 & 1025) != 1024)) {
                    qim0 qim0VarZ2 = uyn1.z(0.0f, 32.0f, 1, u291.f(nim0Var, 1.0f));
                    jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var26, 6);
                    int iHashCode2 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM2 = x340Var26.m();
                    qim0 qim0VarE2 = zr7.E(x340Var26, qim0VarZ2);
                    hzj.A.getClass();
                    if (x340Var26.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(jw31VarA, x340Var26, y580.O0);
                    nko1.H(xos0VarM2, x340Var26, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var26, y580.R0);
                    nko1.F(x340Var26);
                    nko1.H(qim0VarE2, x340Var26, y580.Y);
                    uwr uwrVar4 = cbx.a;
                    xto1.e((qim0) null, 4, cbx.a(x340Var26).b.a, 0L, x340Var26, 48, 9);
                    x340Var26.r(true);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 19:
                nx01 nx01Var = (nx01) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                qim0 qim0VarN = anm1.N("standard_more_like_this_recommendation_" + nx01Var.c, u291.f(nim0Var, 1.0f));
                boolean z19 = (((iIntValue12 & 896) ^ 384) > 256 && x340Var27.g(iu30Var16)) || (iIntValue12 & 384) == 256;
                x340 x340Var28 = x340Var27;
                Object objT22 = x340Var28.T();
                if (z19 || objT22 == fkj0.X) {
                    objT22 = new n9j(iu30Var16, (byte) 23);
                    x340Var28.s0(objT22);
                }
                ioo1.c(qim0VarN, (pgx) null, (ydx) null, (hw61) null, (max) null, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT22), (gbx) null, apo.r(2141238798, new gcj(nx01Var, (byte) 0), x340Var28), (xu30) null, (xu30) null, apo.r(-760534768, new gcj(nx01Var, (byte) 1), x340Var28), (xu30) null, (xu30) null, (xu30) null, apo.r(-528605676, new gcj(nx01Var, (byte) 2), x340Var28), x340Var28, 805306368, 1573248, 60798);
                return rih1Var;
            case 20:
                m1p1.d((pey0) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 21:
                od11 od11Var = (od11) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                int iIntValue13 = ((Number) obj5).intValue();
                Object obj6 = fkj0.X;
                x340 x340Var29 = (b0k) obj4;
                tbr0 tbr0VarC = ((cir0) x340Var29.k(k2r0.a)).c();
                String str3 = od11Var.a;
                boolean zG = x340Var29.g(str3);
                Object objT23 = x340Var29.T();
                if (zG || objT23 == obj6) {
                    Set set = s4b1.f;
                    objT23 = Boolean.valueOf(uic.x(str3).c == blc0.Pg);
                    x340Var29.s0(objT23);
                }
                String strO0 = cwl1.o0(x340Var29, ((Boolean) objT23).booleanValue() ? 2131961000 : 2131961001);
                boolean zI2 = x340Var29.i(tbr0VarC);
                Object objT24 = x340Var29.T();
                if (zI2 || objT24 == obj6) {
                    objT24 = new vjh(tbr0VarC, (byte) 9);
                    x340Var29.s0(objT24);
                }
                Function0 function4 = (Function0) objT24;
                boolean zI3 = x340Var29.i(tbr0VarC) | ((((iIntValue13 & 896) ^ 384) > 256 && x340Var29.g(iu30Var17)) || (iIntValue13 & 384) == 256) | x340Var29.i(od11Var);
                Object objT25 = x340Var29.T();
                if (zI3 || objT25 == obj6) {
                    objT25 = new swc(iu30Var17, tbr0VarC, od11Var, (byte) 23);
                    x340Var29.s0(objT25);
                }
                g2p1.u(function4, (vu30) objT25, strO0, (qim0) null, x340Var29, 0);
                return rih1Var;
            case 22:
                ce11 ce11Var = (ce11) obj2;
                iu30 iu30Var18 = (iu30) obj3;
                x340 x340Var30 = (b0k) obj4;
                ((Number) obj5).intValue();
                gra graVar = een.h;
                qim0 qim0VarZ3 = uyn1.z(0.0f, 16.0f, 1, u291.f(nim0Var, 1.0f));
                gfh0 gfh0VarC = t1c.c(graVar, false);
                x340 x340Var31 = x340Var30;
                int iHashCode3 = Long.hashCode(x340Var31.T);
                xos0 xos0VarM3 = x340Var31.m();
                qim0 qim0VarE3 = zr7.E(x340Var30, qim0VarZ3);
                hzj.A.getClass();
                x340 x340Var32 = x340Var30;
                if (x340Var32.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var32.m0();
                if (x340Var32.S) {
                    x340Var32.l(n4kVar);
                } else {
                    x340Var32.v0();
                }
                nko1.H(gfh0VarC, x340Var30, y580.O0);
                nko1.H(xos0VarM3, x340Var30, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var30, y580.R0);
                nko1.F(x340Var30);
                nko1.H(qim0VarE3, x340Var30, y580.Y);
                nyx.a(2, (wux) null, apo.r(-1456987978, new l2i(iu30Var18, ce11Var, (byte) 16), x340Var30), x340Var30, 3078, 6);
                x340Var32.r(true);
                return rih1Var;
            case 23:
                i3p1.k(((sm11) obj2).c, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 112);
                return rih1Var;
            case 24:
                return a(obj, obj2, obj3, obj4, obj5);
            case 25:
                return d(obj, obj2, obj3, obj4, obj5);
            case 26:
                return e(obj, obj2, obj3, obj4, obj5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return f(obj, obj2, obj3, obj4, obj5);
            case 28:
                return g(obj, obj2, obj3, obj4, obj5);
            default:
                iu30 iu30Var19 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                z = (((iIntValue14 & 896) ^ 384) > 256 && x340Var33.g(iu30Var19)) || (iIntValue14 & 384) == 256;
                x340 x340Var34 = x340Var33;
                Object objT26 = x340Var34.T();
                if (z || objT26 == fkj0.X) {
                    objT26 = new hdj(iu30Var19, (byte) 2);
                    x340Var34.s0(objT26);
                }
                Function0 function5 = (Function0) objT26;
                if (ihc1.y0("Report Error")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50("Report Error"), function5), jdx.c, anm1.N("report_error", nim0Var), (max) null, yla.s(x340Var34), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, odj.a, x340Var34, 0, 48, 2008);
                return rih1Var;
        }
    }
}
