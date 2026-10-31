package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class soi extends hab0 implements bv30 {
    public static final soi N0;
    public static final soi O0;
    public static final soi P0;
    public static final soi Q0;
    public static final soi R0;
    public static final soi S0;
    public static final soi T0;
    public static final soi U0;
    public static final soi V0;
    public static final soi W0;
    public static final soi X;
    public static final soi X0;
    public static final soi Y;
    public static final soi Y0;
    public static final soi Z;
    public static final soi Z0;
    public static final soi a1;
    public static final soi b;
    public static final soi b1;
    public static final soi c;
    public static final soi c1;
    public static final soi d;
    public static final soi d1;
    public static final soi e;
    public static final soi e1;
    public static final soi f;
    public static final soi g;
    public static final soi h;
    public static final soi i;
    public static final soi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new soi(i2, (byte) 0);
        c = new soi(i2, (byte) 1);
        d = new soi(i2, (byte) 2);
        e = new soi(i2, (byte) 3);
        f = new soi(i2, (byte) 4);
        g = new soi(i2, (byte) 5);
        h = new soi(i2, (byte) 6);
        i = new soi(i2, (byte) 7);
        t = new soi(i2, (byte) 8);
        X = new soi(i2, (byte) 9);
        Y = new soi(i2, (byte) 10);
        Z = new soi(i2, (byte) 11);
        N0 = new soi(i2, (byte) 12);
        O0 = new soi(i2, (byte) 13);
        P0 = new soi(i2, (byte) 14);
        Q0 = new soi(i2, (byte) 15);
        R0 = new soi(i2, (byte) 16);
        S0 = new soi(i2, (byte) 17);
        T0 = new soi(i2, (byte) 18);
        U0 = new soi(i2, (byte) 19);
        V0 = new soi(i2, (byte) 20);
        W0 = new soi(i2, (byte) 21);
        X0 = new soi(i2, (byte) 22);
        Y0 = new soi(i2, (byte) 23);
        Z0 = new soi(i2, (byte) 24);
        a1 = new soi(i2, (byte) 25);
        b1 = new soi(i2, (byte) 26);
        c1 = new soi(i2, (byte) 27);
        d1 = new soi(i2, (byte) 28);
        e1 = new soi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ soi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        String strK;
        int i3;
        nex oexVar;
        us30 us30Var = (us30) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = us30Var.f;
        boolean z = us30Var.b;
        boolean z2 = us30Var.e;
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(us30Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            if (z2 && z && str != null) {
                x340Var2.i0(-1420439913);
                strK = cwl1.n0(2131957847, new Object[]{str}, x340Var2);
                x340Var2.r(false);
            } else {
                strK = x0d.k(x340Var2, -1420257788, 2131957846, x340Var2, false);
            }
            if (z) {
                i3 = z2 ? 2131957848 : 2131957850;
            } else {
                i3 = 2131957849;
            }
            String strO0 = cwl1.o0(x340Var2, i3);
            nim0 nim0Var = nim0.a;
            if (z2) {
                x340Var2.i0(-1419728525);
                if (z) {
                    x340Var2.i0(1478224192);
                    x340Var2.r(false);
                    oexVar = new nex(6);
                } else {
                    x340Var2.i0(1478226815);
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = qpi.h;
                        x340Var2.s0(objT);
                    }
                    oexVar = new oex(0, (vu30) null, (vu30) objT, (vu30) null, 11);
                    x340Var2.r(false);
                }
                nex nexVar = oexVar;
                boolean z3 = (i2 & 896) == 256;
                Object objT2 = x340Var2.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new roi(iu30Var, (byte) 9);
                    x340Var2.s0(objT2);
                }
                gbx gbxVar = new gbx(new y50(strO0), (Function0) objT2);
                lex lexVarZ = yoo1.z(x340Var2);
                qim0 qim0VarN = anm1.N("#LyricsFullscreenTranslateButtonTag", nim0Var);
                boolean zG = x340Var2.g(strK);
                Object objT3 = x340Var2.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = new irf(strK, (byte) 19);
                    x340Var2.s0(objT3);
                }
                poo1.e(gbxVar, nexVar, lexVarZ, s161.b(qim0VarN, false, (iu30) objT3), 0, (String) null, (max) null, xpi.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-21130195, new wpi(us30Var, (byte) 0), x340Var2), x340Var2, 12582912, 3072, 8048);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1418720033);
                boolean z4 = (i2 & 896) == 256;
                Object objT4 = x340Var2.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new roi(iu30Var, (byte) 10);
                    x340Var2.s0(objT4);
                }
                gbx gbxVar2 = new gbx(new y50(strO0), (Function0) objT4);
                ldx ldxVar = ldx.c;
                qim0 qim0VarB = u291.B(anm1.N("#LyricsFullscreenTranslateButtonTag", nim0Var), een.h, 2);
                boolean zG2 = x340Var2.g(strK);
                Object objT5 = x340Var2.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new irf(strK, (byte) 20);
                    x340Var2.s0(objT5);
                }
                foo1.c(gbxVar2, ldxVar, s161.b(qim0VarB, false, (iu30) objT5), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1859472550, new wpi(us30Var, (byte) 1), x340Var2), x340Var2, 48, 48, 2040);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        xs30 xs30Var = (xs30) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(xs30Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            String strO0 = cwl1.o0(x340Var2, 2131957852);
            String strO1 = cwl1.o0(x340Var2, xs30Var.b ? 2131957854 : 2131957853);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new roi(iu30Var, (byte) 11);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(new y50(strO1), (Function0) objT);
            ldx ldxVar = ldx.c;
            qim0 qim0VarB = u291.B(anm1.N("#LyricsFullscreenVocalRemovalButtonTag", nim0.a), een.h, 2);
            boolean zG = x340Var2.g(strO0);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new irf(strO0, (byte) 21);
                x340Var2.s0(objT2);
            }
            foo1.c(gbxVar, ldxVar, s161.b(qim0VarB, false, (iu30) objT2), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(645425799, new l8i(xs30Var, (byte) 13), x340Var2), x340Var2, 48, 48, 2040);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        at30 at30Var = (at30) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        xlk1 xlk1Var = at30Var.b;
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(at30Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            xlk1 xlk1Var2 = xlk1.b;
            String strO0 = cwl1.o0(x340Var2, xlk1Var == xlk1Var2 ? 2131957855 : 2131957857);
            String strO1 = cwl1.o0(x340Var2, xlk1Var == xlk1Var2 ? 2131957856 : 2131957858);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new roi(iu30Var, (byte) 12);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(new y50(strO1), (Function0) objT);
            ldx ldxVar = ldx.c;
            qim0 qim0VarB = u291.B(anm1.N("#LyricsFullscreenVocalRemovalVolumeButtonTag", nim0.a), een.h, 2);
            boolean zG = x340Var2.g(strO0);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new irf(strO0, (byte) 22);
                x340Var2.s0(objT2);
            }
            foo1.c(gbxVar, ldxVar, s161.b(qim0VarB, false, (iu30) objT2), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-512635635, new l8i(at30Var, (byte) 14), x340Var2), x340Var2, 48, 48, 2040);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g040 g040Var = (g040) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new roi(iu30Var, (byte) 13);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z2 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        byte b2 = 14;
        if (z2 || objT2 == m4cVar) {
            objT2 = new roi(iu30Var, b2);
            x340Var2.s0(objT2);
        }
        lyg.f(g040Var, function0, (Function0) objT2, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mf40 mf40Var = (mf40) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strO0 = cwl1.o0(x340Var, 2131958271);
        gdx gdxVarS = yla.s(x340Var);
        ldx ldxVar = ldx.c;
        boolean z = true;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.g(mf40Var)) && (iIntValue & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new dfi((Object) iu30Var, (Object) mf40Var, (byte) 9);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        uwr uwrVar = cbx.a;
        foo1.c(gbxVar, ldxVar, d1u.E(1.0f, cbx.a(x340Var2).a.b.a(), nim0.a, er31.a), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1952128098, new pji(strO0, (byte) 3), x340Var2), x340Var2, 0, 48, 2008);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strK;
        hax haxVar;
        ng40 ng40Var = (ng40) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        int iOrdinal = ng40Var.a.ordinal();
        boolean z = true;
        if (iOrdinal == 0) {
            x340 x340Var2 = x340Var;
            strK = x0d.k(x340Var2, -444995708, 2131953868, x340Var2, false);
        } else {
            if (iOrdinal != 1) {
                throw p3d1.k(x340Var, -444998092, false);
            }
            x340 x340Var3 = x340Var;
            strK = x0d.k(x340Var3, -444992024, 2131953869, x340Var3, false);
        }
        String str = strK;
        krx krxVar = krx.c;
        String strO0 = cwl1.o0(x340Var, 2131953867);
        boolean z2 = ng40Var.b;
        if (z2) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-909473584);
            haxVar = new hax(cwl1.o0(x340Var4, 2131956215));
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(-909370230);
            x340Var5.r(false);
            haxVar = jax.a;
        }
        hax haxVar2 = haxVar;
        qim0 qim0VarN = anm1.N("artifact-page-generation-mode-button", nim0.a);
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        x340 x340Var6 = x340Var;
        Object objT = x340Var6.T();
        if (z || objT == fkj0.X) {
            objT = new roi(iu30Var, (byte) 16);
            x340Var6.s0(objT);
        }
        hqn1.h(krxVar, str, strO0, (Function0) objT, qim0VarN, 0L, false, z2, haxVar2, (vu30) null, x340Var6, krx.d, 608);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strN0;
        ur40 ur40Var = (ur40) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = ur40Var.b;
        if (str == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(119960002);
            x340Var2.r(false);
            strN0 = null;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(119960003);
            strN0 = cwl1.n0(2131956228, new Object[]{str}, x340Var3);
            x340Var3.r(false);
        }
        x340 x340Var4 = x340Var;
        boolean zG = x340Var4.g(ur40Var.a);
        Object objT = x340Var4.T();
        if (zG || objT == fkj0.X) {
            objT = v8r.q(new mmr0(Integer.valueOf(ur40Var.c), Integer.valueOf(ur40Var.d)));
            x340Var4.s0(objT);
        }
        w2g0.c(null, null, apo.r(491001675, new nzd(objT, (Object) ur40Var, (Object) strN0, (byte) 5), x340Var4), x340Var4, 3072, 7);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        int i4 = ((ly40) obj2).a;
        int iC = l1d.C(i4);
        if (iC == 0 || iC == 1) {
            i2 = 2131961856;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            i2 = 2131961858;
        }
        String strO0 = cwl1.o0(x340Var, i2);
        int iC2 = l1d.C(i4);
        if (iC2 == 0 || iC2 == 1) {
            i3 = 2131961855;
        } else {
            if (iC2 != 2) {
                eg.o();
                return null;
            }
            i3 = 2131961857;
        }
        String strO1 = cwl1.o0(x340Var, i3);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new roi(iu30Var, (byte) 17);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO1)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO1), function0);
        int iC3 = l1d.C(i4);
        if (iC3 == 0) {
            x340Var2.i0(1640370189);
            w361.c(strO0, strO1, gbxVar, x340Var2, 0);
            x340Var2.r(false);
        } else if (iC3 == 1) {
            x340Var2.i0(1640372852);
            w361.b(strO0, strO1, gbxVar, x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (iC3 != 2) {
                throw p3d1.k(x340Var2, 1640369014, false);
            }
            x340Var2.i0(1640375890);
            w361.d(strO0, strO1, gbxVar, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        aa50 aa50Var = (aa50) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(aa50Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarF = u291.f(uyn1.x(nim0.a, 16.0f), 1.0f);
            long j = cbx.a(x340Var2).d.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarF2 = dug.f(qim0VarF, j, er31.b(8.0f));
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = ovh.e1;
                x340Var2.s0(objT);
            }
            qim0 qim0VarN = anm1.N("graduation_request_banner_test_tag", s161.b(qim0VarX, true, (iu30) objT));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            gfx.b(4, apo.r(1425751905, new l2i(aa50Var, iu30Var, (byte) 9), x340Var2), x340Var2, 54);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        z950 z950Var = (z950) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(z950Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarF = u291.f(uyn1.x(nim0.a, 16.0f), 1.0f);
            long j = cbx.a(x340Var2).d.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarF2 = dug.f(qim0VarF, j, er31.b(8.0f));
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = oqi.b;
                x340Var2.s0(objT);
            }
            qim0 qim0VarN = anm1.N("graduation_request_banner_test_tag", s161.b(qim0VarX, true, (iu30) objT));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            gfx.h(13, apo.r(-773519576, new l2i(z950Var, iu30Var, (byte) 10), x340Var2), x340Var2, 54);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strN0 = cwl1.n0(2131958109, new Object[]{((ea50) obj2).b}, x340Var);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new roi(iu30Var, (byte) 20);
            x340Var2.s0(objT);
        }
        vxo1.a(0, strN0, (Function0) objT, x340Var2, (qim0) null);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strN0;
        yf yfVar;
        qim0 qim0VarR;
        yf yfVar2;
        qim0 qim0VarR2;
        jax haxVar;
        byte b2 = this.a;
        byte b3 = 15;
        byte b4 = 8;
        byte b5 = 7;
        qim0 qim0Var = nim0.a;
        byte b6 = 3;
        j2i j2iVarR = null;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                y920 y920Var = (y920) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                q620 q620Var = y920Var.a;
                int i2 = (iIntValue & 48) == 0 ? iIntValue | (x340Var.g(y920Var) ? 32 : 16) : iIntValue;
                if ((iIntValue & 384) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    boolean zBooleanValue = ((Boolean) x340Var2.k(ixm1.a)).booleanValue();
                    if (zBooleanValue) {
                        x340Var2.i0(541708313);
                        strN0 = cwl1.n0(2131964008, new Object[]{q620Var.b}, x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(541824315);
                        x340Var2.r(false);
                        strN0 = q620Var.b;
                    }
                    boolean zH = x340Var2.h(zBooleanValue) | ((i2 & 896) == 256);
                    Object objT = x340Var2.T();
                    if (zH || objT == fkj0.X) {
                        objT = new z20(iu30Var, zBooleanValue, (byte) 9);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (ihc1.y0(strN0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(strN0), function0);
                    lex lexVarZ = yoo1.z(x340Var2);
                    pex pexVar = pex.b;
                    if (y920Var.c) {
                        x340Var2.i0(542133447);
                        j2iVarR = apo.r(-1668094349, new l2i(y920Var, iu30Var, (byte) 8), x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(542788880);
                        x340Var2.r(false);
                    }
                    poo1.e(gbxVar, pexVar, lexVarZ, (qim0) null, 0, (String) null, (max) null, (vu30) null, j2iVarR, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1774227117, new l8i(y920Var, (byte) 12), x340Var2), x340Var2, 0, 3072, 7928);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ge20 ge20Var = (ge20) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                String str = ge20Var.b;
                fe20 fe20Var = ge20Var.a;
                yf20 yf20Var = fe20Var.a;
                x340 x340Var3 = (b0k) obj4;
                boolean zG = x340Var3.g(fe20Var);
                Object objT2 = x340Var3.T();
                if (zG || objT2 == m4cVar) {
                    c380<wf20> c380Var = yf20Var.b;
                    ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                    for (wf20 wf20Var : c380Var) {
                        String str2 = wf20Var.a;
                        String str3 = wf20Var.b;
                        arrayList.add(new nix(str2, str3, (c9) null, str3, 4));
                    }
                    objT2 = mqo1.F(arrayList);
                    x340Var3.s0(objT2);
                }
                c9 c9Var = (c9) objT2;
                boolean zG2 = x340Var3.g(str);
                Object objT3 = x340Var3.T();
                if (zG2 || objT3 == m4cVar) {
                    Iterator it = yf20Var.b.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                        } else if (!u890.j(((wf20) it.next()).a, str)) {
                            i3++;
                        }
                    }
                    objT3 = i3 == -1 ? qix.a : new rix((nix) c9Var.get(i3));
                    x340Var3.s0(objT3);
                }
                tix tixVar = new tix(c9Var, (six) objT3, false, 60);
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z = false;
                }
                boolean zI = x340Var3.i(c9Var) | z;
                Object objT4 = x340Var3.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new puh(iu30Var2, c9Var, (byte) 10);
                    x340Var3.s0(objT4);
                }
                pro1.f(tixVar, (iu30) objT4, (qim0) null, (vzq0) null, x340Var3, 0, 28);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                fq7.g(((kg20) obj2).a, (qim0) null, xay.d((ni20) null, (fra) null, 15).a(xay.e(3, (ni20) null)), xay.l(15, (ni20) null).a(xay.f(3, (ni20) null)), (String) null, apo.r(2044684091, new ip0((iu30) obj3, (byte) 14), b0kVar), b0kVar, 196608, 18);
                return rih1Var;
            case 3:
                ((Number) obj5).intValue();
                j2p1.e(((tk20) obj2).b, (qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case 4:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarY = uyn1.y(qim0VarF, cbx.b(x340Var4).b.b, cbx.b(x340Var4).b.c);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarY);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(hmb0.t1);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                uwo1.e(cwl1.o0(x340Var4, 2131960495), (qim0) null, cbx.d(x340Var4).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2026);
                cvx cvxVar = cbx.b(x340Var4).b;
                uwo1.e(eqq.n(qim0Var, 16.0f, x340Var4, 2131960494, x340Var4), (qim0) null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2018);
                op71.g(x340Var4, u291.h(qim0Var, cbx.b(x340Var4).b.a));
                int i4 = (iIntValue3 & 896) ^ 384;
                boolean z2 = (i4 > 256 && x340Var6.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT5 = x340Var6.T();
                if (z2 || objT5 == m4cVar2) {
                    objT5 = new roi(iu30Var3, (byte) 2);
                    x340Var6.s0(objT5);
                }
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT5), new idx(4), (qim0) null, (max) null, yla.r(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, epi.a, x340Var4, 0, 48, 2012);
                cvx cvxVar2 = cbx.b(x340Var4).b;
                op71.g(x340Var4, u291.h(qim0Var, 16.0f));
                boolean z3 = (i4 > 256 && x340Var6.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT6 = x340Var6.T();
                if (z3 || objT6 == m4cVar2) {
                    objT6 = new roi(iu30Var3, b6);
                    x340Var6.s0(objT6);
                }
                foo1.c(new gbx(z50Var, (Function0) objT6), ldx.c, (qim0) null, (max) null, yla.r(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, epi.b, x340Var4, 0, 48, 2012);
                x340Var6.r(true);
                return rih1Var;
            case 5:
                q330 q330Var = (w330) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                boolean z4 = q330Var instanceof q330;
                if (z4) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(1253877706);
                    q330 q330Var2 = q330Var;
                    p3v p3vVar = q330Var2.b;
                    if (p3vVar != null && (qim0VarR = u291.r(qim0Var, p3vVar.a)) != null) {
                        qim0Var = qim0VarR;
                    }
                    dm5.f(qim0Var, q330Var2.a, iu30Var4, x340Var8, iIntValue4 & 896);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(1254076571);
                    boolean z5 = q330Var instanceof s330;
                    if (z5) {
                        yfVar = ((s330) q330Var).a;
                    } else if (q330Var instanceof t330) {
                        yfVar = ((t330) q330Var).a;
                    } else {
                        if (!z4) {
                            eg.o();
                            return null;
                        }
                        yfVar = q330Var.a;
                    }
                    d7p1.c(z5, (qim0) null, yfVar, iu30Var4, x340Var9, (iIntValue4 << 3) & 7168);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 6:
                q330 q330Var3 = (w330) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                boolean z6 = q330Var3 instanceof q330;
                if (z6) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(675920842);
                    q330 q330Var4 = q330Var3;
                    p3v p3vVar2 = q330Var4.b;
                    if (p3vVar2 != null && (qim0VarR2 = u291.r(qim0Var, p3vVar2.a)) != null) {
                        qim0Var = qim0VarR2;
                    }
                    dm5.f(qim0Var, q330Var4.a, iu30Var5, x340Var11, iIntValue5 & 896);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(676120513);
                    boolean z7 = q330Var3 instanceof s330;
                    if (z7) {
                        yfVar2 = ((s330) q330Var3).a;
                    } else if (q330Var3 instanceof t330) {
                        yfVar2 = ((t330) q330Var3).a;
                    } else {
                        if (!z6) {
                            eg.o();
                            return null;
                        }
                        yfVar2 = q330Var3.a;
                    }
                    d7p1.c(z7, (qim0) null, yfVar2, iu30Var5, x340Var12, (iIntValue5 << 3) & 7168);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 7:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                ArrayList arrayList2 = ((v630) obj2).e;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new myz0(((w630) it2.next()).a));
                }
                c380 c380VarA = mqo1.A(arrayList3);
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var13.g(iu30Var6)) && (iIntValue6 & 384) != 256) {
                    z = false;
                }
                x340 x340Var14 = x340Var13;
                Object objT7 = x340Var14.T();
                if (z || objT7 == fkj0.X) {
                    objT7 = new cci(iu30Var6, (byte) 18);
                    x340Var14.s0(objT7);
                }
                epo1.q(48, x340Var14, (iu30) objT7, c380VarA, (qim0) null, false);
                return rih1Var;
            case 8:
                fb30 fb30Var = (fb30) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                int i5 = (iIntValue7 & 48) == 0 ? iIntValue7 | (x340Var15.g(fb30Var) ? 32 : 16) : iIntValue7;
                if ((iIntValue7 & 384) == 0) {
                    i5 |= x340Var15.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    i9p1.e(fb30Var, iu30Var7, x340Var16, (i5 >> 3) & 126);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 9:
                fc30 fc30Var = (fc30) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                boolean z8 = fc30Var.b;
                int i6 = z8 ? 2131959945 : 2131959944;
                int i7 = z8 ? 2131959943 : 2131959942;
                boolean z9 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var17.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                if ((((iIntValue8 & 112) ^ 48) <= 32 || !x340Var17.g(fc30Var)) && (iIntValue8 & 48) != 32) {
                    z = false;
                }
                boolean z10 = z9 | z;
                x340 x340Var18 = x340Var17;
                Object objT8 = x340Var18.T();
                if (z10 || objT8 == fkj0.X) {
                    objT8 = new dfi(iu30Var8, fc30Var, b5);
                    x340Var18.s0(objT8);
                }
                yoi1.c(2131959946, i6, i7, (Function0) objT8, x340Var18, 0);
                return rih1Var;
            case 10:
                v9p1.j((pc30) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 11:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 384) == 0) {
                    iIntValue9 |= x340Var19.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue9 & 1, (iIntValue9 & 1153) != 1152)) {
                    qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                    pm31 pm31Var = new pm31(0);
                    boolean z11 = (iIntValue9 & 896) == 256;
                    Object objT9 = x340Var20.T();
                    if (z11 || objT9 == fkj0.X) {
                        objT9 = new roi(iu30Var9, (byte) 4);
                        x340Var20.s0(objT9);
                    }
                    qim0 qim0VarX = bin.x(qim0VarF2, false, (String) null, pm31Var, (idn0) null, (Function0) objT9, 11);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var20.T);
                    xos0 xos0VarM2 = x340Var20.m();
                    qim0 qim0VarE2 = zr7.E(x340Var20, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var20.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var20.m0();
                    if (x340Var20.S) {
                        x340Var20.l(hmb0.t1);
                    } else {
                        x340Var20.v0();
                    }
                    nko1.H(gfh0VarC, x340Var20, y580.O0);
                    nko1.H(xos0VarM2, x340Var20, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var20, y580.R0);
                    nko1.F(x340Var20);
                    nko1.H(qim0VarE2, x340Var20, y580.Y);
                    String strO0 = cwl1.o0(x340Var20, 2131959737);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO0, (qim0) null, lee1.a(cbx.d(x340Var20).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119), cbx.a(x340Var20).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2034);
                    x340Var20.r(true);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 12:
                do30 do30Var = (do30) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                String str4 = do30Var.a;
                String str5 = do30Var.b;
                String str6 = do30Var.c;
                Integer num = do30Var.d;
                if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var21.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                    z = false;
                }
                x340 x340Var22 = x340Var21;
                Object objT10 = x340Var22.T();
                if (z || objT10 == fkj0.X) {
                    objT10 = new roi(iu30Var10, (byte) 5);
                    x340Var22.s0(objT10);
                }
                lm5.d(str4, str5, str6, num, (Function0) objT10, x340Var22, 0);
                return rih1Var;
            case 13:
                fq30 fq30Var = (fq30) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                int i8 = (iIntValue11 & 48) == 0 ? iIntValue11 | ((iIntValue11 & 64) == 0 ? x340Var23.g(fq30Var) : x340Var23.i(fq30Var) ? 32 : 16) : iIntValue11;
                if ((iIntValue11 & 384) == 0) {
                    i8 |= x340Var23.i(iu30Var11) ? 256 : 128;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i8 & 1, (i8 & 1169) != 1168)) {
                    qim0 qim0VarR3 = d7e.r(((ez61) ahl.a).a, u291.v(qim0Var, 220.0f), false);
                    cq30 cq30Var = fq30Var.b;
                    if (u890.j(cq30Var, dq30.a)) {
                        x340Var24.i0(1978100010);
                        dxo1.k(qim0VarR3, x340Var24, 0);
                        x340Var24.r(false);
                    } else if (u890.j(cq30Var, bq30.a)) {
                        x340Var24.i0(1978102055);
                        z = (i8 & 896) == 256;
                        Object objT11 = x340Var24.T();
                        if (z || objT11 == fkj0.X) {
                            objT11 = new roi(iu30Var11, (byte) 6);
                            x340Var24.s0(objT11);
                        }
                        rwo1.h(0, (Function0) objT11, x340Var24, qim0VarR3);
                        x340Var24.r(false);
                    } else {
                        if (!(cq30Var instanceof cq30)) {
                            throw p3d1.k(x340Var24, 1978098116, false);
                        }
                        x340Var24.i0(1978105395);
                        b2p1.t(cq30Var.a, qim0VarR3, (vu30) null, x340Var24, 0, 4);
                        x340Var24.r(false);
                    }
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 14:
                tr30 tr30Var = (tr30) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                yvg1 yvg1Var = tr30Var.b == s2p0.b ? new yvg1(zox.c, 2131959244, rr30.a) : new yvg1(inx.c, 2131959243, qr30.a);
                hux huxVar = (hux) yvg1Var.a;
                int iIntValue13 = ((Number) yvg1Var.b).intValue();
                sr30 sr30Var = (sr30) yvg1Var.c;
                String strO1 = cwl1.o0(x340Var25, iIntValue13);
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var25.g(iu30Var12)) && (iIntValue12 & 384) != 256) {
                    z = false;
                }
                x340 x340Var26 = x340Var25;
                boolean zI2 = x340Var26.i(sr30Var) | z;
                Object objT12 = x340Var26.T();
                if (zI2 || objT12 == fkj0.X) {
                    objT12 = new dfi(iu30Var12, sr30Var, b4);
                    x340Var26.s0(objT12);
                }
                gbx gbxVar2 = new gbx(new y50(strO1), (Function0) objT12);
                ldx ldxVar = ldx.c;
                gdx gdxVarA = yla.r(x340Var26).a();
                if (tr30Var.a) {
                    x340Var26.i0(1079957898);
                    x340Var26.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var26.i0(1079959446);
                    haxVar = new hax(cwl1.o0(x340Var26, 2131959267));
                    x340Var26.r(false);
                }
                wro1.h(gbxVar2, ldxVar, (qim0) null, haxVar, gdxVarA, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1448239475, new f90(huxVar, (byte) 7), x340Var26), x340Var26, 0, 6, 972);
                return rih1Var;
            case 15:
                qs30 qs30Var = (qs30) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                int i9 = (iIntValue14 & 48) == 0 ? (x340Var27.g(qs30Var) ? 32 : 16) | iIntValue14 : iIntValue14;
                if ((iIntValue14 & 384) == 0) {
                    i9 |= x340Var27.i(iu30Var13) ? 256 : 128;
                }
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(i9 & 1, (i9 & 1169) != 1168)) {
                    String strO2 = cwl1.o0(x340Var28, 2131957843);
                    String strO3 = cwl1.o0(x340Var28, 2131957844);
                    if (qs30Var.b) {
                        x340Var28.i0(-1544972241);
                        z = (i9 & 896) == 256;
                        Object objT13 = x340Var28.T();
                        if (z || objT13 == m4cVar3) {
                            objT13 = new roi(iu30Var13, b5);
                            x340Var28.s0(objT13);
                        }
                        gbx gbxVar3 = new gbx(new y50(strO3), (Function0) objT13);
                        Object objT14 = x340Var28.T();
                        if (objT14 == m4cVar3) {
                            objT14 = qpi.d;
                            x340Var28.s0(objT14);
                        }
                        oex oexVar = new oex(0, (vu30) null, (vu30) objT14, (vu30) null, 11);
                        lex lexVarZ2 = yoo1.z(x340Var28);
                        qim0 qim0VarN = anm1.N("#LyricsFullscreenShareButtonTag", qim0Var);
                        boolean zG3 = x340Var28.g(strO2);
                        Object objT15 = x340Var28.T();
                        if (zG3 || objT15 == m4cVar3) {
                            objT15 = new irf(strO2, (byte) 17);
                            x340Var28.s0(objT15);
                        }
                        poo1.e(gbxVar3, oexVar, lexVarZ2, s161.b(qim0VarN, false, (iu30) objT15), 0, (String) null, (max) null, vpi.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, vpi.b, x340Var28, 12582912, 3072, 8048);
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(-1544194482);
                        z = (i9 & 896) == 256;
                        Object objT16 = x340Var28.T();
                        if (z || objT16 == m4cVar3) {
                            objT16 = new roi(iu30Var13, b4);
                            x340Var28.s0(objT16);
                        }
                        gbx gbxVar4 = new gbx(new y50(strO3), (Function0) objT16);
                        ldx ldxVar2 = ldx.c;
                        qim0 qim0VarB = u291.B(anm1.N("#LyricsFullscreenShareButtonTag", qim0Var), een.h, 2);
                        boolean zG4 = x340Var28.g(strO2);
                        Object objT17 = x340Var28.T();
                        if (zG4 || objT17 == m4cVar3) {
                            objT17 = new irf(strO2, (byte) 18);
                            x340Var28.s0(objT17);
                        }
                        foo1.c(gbxVar4, ldxVar2, s161.b(qim0VarB, false, (iu30) objT17), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, vpi.c, x340Var28, 48, 48, 2040);
                        x340Var28.r(false);
                    }
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case 18:
                return e(obj, obj2, obj3, obj4, obj5);
            case 19:
                return f(obj, obj2, obj3, obj4, obj5);
            case 20:
                e9k.g((s140) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 21:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                boolean z12 = ((zd40) obj2).a;
                if ((((iIntValue15 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var14)) && (iIntValue15 & 384) != 256) {
                    z = false;
                }
                x340 x340Var30 = x340Var29;
                Object objT18 = x340Var30.T();
                if (z || objT18 == fkj0.X) {
                    objT18 = new roi(iu30Var14, b3);
                    x340Var30.s0(objT18);
                }
                gm50.e(0, (Function0) objT18, x340Var30, (qim0) null, z12);
                return rih1Var;
            case 22:
                return g(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 24:
                return i(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return j(obj, obj2, obj3, obj4, obj5);
            case 26:
                return k(obj, obj2, obj3, obj4, obj5);
            case 27:
                return m(obj, obj2, obj3, obj4, obj5);
            case 28:
                return n(obj, obj2, obj3, obj4, obj5);
            default:
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                if ((((iIntValue16 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var15)) && (iIntValue16 & 384) != 256) {
                    z = false;
                }
                x340 x340Var32 = x340Var31;
                Object objT19 = x340Var32.T();
                if (z || objT19 == fkj0.X) {
                    objT19 = new cci(iu30Var15, (byte) 19);
                    x340Var32.s0(objT19);
                }
                oon1.d(0, x340Var32, (iu30) objT19, (qim0) null);
                return rih1Var;
        }
    }
}
