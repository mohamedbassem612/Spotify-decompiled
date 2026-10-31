package p;

import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.scrollsita.v1.Section;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hnj extends hab0 implements bv30 {
    public static final hnj N0;
    public static final hnj O0;
    public static final hnj P0;
    public static final hnj Q0;
    public static final hnj R0;
    public static final hnj S0;
    public static final hnj T0;
    public static final hnj U0;
    public static final hnj V0;
    public static final hnj W0;
    public static final hnj X;
    public static final hnj X0;
    public static final hnj Y;
    public static final hnj Y0;
    public static final hnj Z;
    public static final hnj Z0;
    public static final hnj a1;
    public static final hnj b;
    public static final hnj b1;
    public static final hnj c;
    public static final hnj c1;
    public static final hnj d;
    public static final hnj d1;
    public static final hnj e;
    public static final hnj e1;
    public static final hnj f;
    public static final hnj g;
    public static final hnj h;
    public static final hnj i;
    public static final hnj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new hnj(i2, (byte) 0);
        c = new hnj(i2, (byte) 1);
        d = new hnj(i2, (byte) 2);
        e = new hnj(i2, (byte) 3);
        f = new hnj(i2, (byte) 4);
        g = new hnj(i2, (byte) 5);
        h = new hnj(i2, (byte) 6);
        i = new hnj(i2, (byte) 7);
        t = new hnj(i2, (byte) 8);
        X = new hnj(i2, (byte) 9);
        Y = new hnj(i2, (byte) 10);
        Z = new hnj(i2, (byte) 11);
        N0 = new hnj(i2, (byte) 12);
        O0 = new hnj(i2, (byte) 13);
        P0 = new hnj(i2, (byte) 14);
        Q0 = new hnj(i2, (byte) 15);
        R0 = new hnj(i2, (byte) 16);
        S0 = new hnj(i2, (byte) 17);
        T0 = new hnj(i2, (byte) 18);
        U0 = new hnj(i2, (byte) 19);
        V0 = new hnj(i2, (byte) 20);
        W0 = new hnj(i2, (byte) 21);
        X0 = new hnj(i2, (byte) 22);
        Y0 = new hnj(i2, (byte) 23);
        Z0 = new hnj(i2, (byte) 24);
        a1 = new hnj(i2, (byte) 25);
        b1 = new hnj(i2, (byte) 26);
        c1 = new hnj(i2, (byte) 27);
        d1 = new hnj(i2, (byte) 28);
        e1 = new hnj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hnj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        yqh1 yqh1Var = (yqh1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String strB = tro1.B(yqh1Var.a, x340Var, 0);
        String strK = yqh1Var.b;
        if (strK == null) {
            x340 x340Var2 = x340Var;
            strK = x0d.k(x340Var2, -681479389, 2131961840, x340Var2, false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-681479854);
            x340Var3.r(false);
        }
        if5 if5Var = new if5(null, strK, null, null, 13);
        String strO0 = cwl1.o0(x340Var, 2131961838);
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var4 = x340Var;
        Object objT = x340Var4.T();
        if (z || objT == m4cVar) {
            objT = new uoj(iu30Var, (byte) 10);
            x340Var4.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        boolean z2 = (i2 > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var4.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new k4j(iu30Var, (byte) 24);
            x340Var4.s0(objT2);
        }
        uyn1.e(strB, if5Var, true, gbxVar, (iu30) objT2, (qim0) null, (if5) null, yqh1Var.c, x340Var4, 448, 96);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jth1 jth1Var = (jth1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = (iIntValue & 896) ^ 384;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(jth1Var) | ((i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new gmj(iu30Var, jth1Var, (byte) 2);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z || objT2 == m4cVar) {
            objT2 = new uoj(iu30Var, (byte) 11);
            x340Var2.s0(objT2);
        }
        ujo1.j(jth1Var, function0, (Function0) objT2, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        sru sruVar = (sru) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new k4j(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        boolean zI = x340Var2.i(sruVar);
        Object objT2 = x340Var2.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new mwh(sruVar, (byte) 8);
            x340Var2.s0(objT2);
        }
        dm5.a(iu30Var2, (qim0) null, (iu30) objT2, x340Var2, 0, 2);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mzh1 mzh1Var = (mzh1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = mzh1Var.a;
        String str2 = mzh1Var.b;
        String str3 = mzh1Var.c;
        String strO0 = cwl1.o0(x340Var, 2131956159);
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = true;
        boolean z2 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new uoj(iu30Var, (byte) 12);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if ((i2 <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        Object objT2 = x340Var2.T();
        if (z || objT2 == m4cVar) {
            objT2 = new uoj(iu30Var, (byte) 13);
            x340Var2.s0(objT2);
        }
        mym.b(str, str2, str3, strO0, null, null, function0, (Function0) objT2, x340Var2, 0, 48);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cei1 cei1Var = (cei1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = cei1Var.a;
        Uri uri = cei1Var.c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new uoj(iu30Var, (byte) 14);
            x340Var2.s0(objT);
        }
        zqo1.a(str, uri, (Function0) objT, (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xji1 xji1Var = (xji1) obj2;
        ((Number) obj5).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = cjj.g;
            x340Var.s0(objT);
        }
        jto1.b(s161.b(qim0VarF, true, (iu30) objT), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1597870532, new rpj(xji1Var, (byte) 0), x340Var), (xu30) null, (xu30) null, (xu30) null, apo.r(1744796224, new rpj(xji1Var, (byte) 1), x340Var), x340Var, 0, 196656, 30718);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        jax haxVar;
        nex oexVar;
        ldx idxVar;
        long j;
        ujx ujxVar;
        long j2;
        String strK;
        byte b2 = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                bye1 bye1Var = (bye1) obj2;
                x340 x340Var = (b0k) obj4;
                ((Number) obj5).intValue();
                flb0 flb0VarR = f5p1.r(bye1Var.c, x340Var);
                uwr uwrVar = cbx.a;
                FontFamily fontFamily = cbx.d(x340Var).h.a.f;
                String str = bye1Var.a;
                String str2 = bye1Var.b;
                boolean z2 = bye1Var.d;
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(str) | x340Var2.g(str2) | x340Var2.h(z2) | x340Var2.g(fontFamily);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    ye5 ye5Var = new ye5();
                    if (z2) {
                        int iO = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65535));
                        try {
                            ye5Var.g(str);
                            ye5Var.k(iO);
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    }
                    if (!ihc1.y0(str2)) {
                        if (z2) {
                            int iO2 = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65535));
                            try {
                                ye5Var.g(" • ");
                                ye5Var.k(iO2);
                            } catch (Throwable th2) {
                                ye5Var.k(iO2);
                                throw th2;
                            }
                        }
                        int iO3 = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65503));
                        try {
                            ye5Var.g(str2);
                            ye5Var.k(iO3);
                        } catch (Throwable th3) {
                            ye5Var.k(iO3);
                            throw th3;
                        }
                    }
                    objT = ye5Var.p();
                    x340Var2.s0(objT);
                }
                af5 af5Var = (af5) objT;
                boolean zY0 = ihc1.y0(af5Var);
                nim0 nim0Var2 = nim0.a;
                mod.b(t4k.n.a(flb0VarR), apo.r(1247637775, new gnj(o0c.d(zY0 ? u291.h(uyn1.x(nim0Var2, 0.0f), 0.0f) : uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 12.0f, 5), (ni20) null, 3), af5Var), x340Var2), x340Var2, 56);
                return rih1Var;
            case 1:
                o2f1 o2f1Var = (o2f1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                String str3 = o2f1Var.a;
                String str4 = o2f1Var.b;
                if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                    z = false;
                }
                x340 x340Var4 = x340Var3;
                Object objT2 = x340Var4.T();
                if (z || objT2 == fkj0.X) {
                    objT2 = new qkj(iu30Var, (byte) 23);
                    x340Var4.s0(objT2);
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                sqe.m(0, str3, str4, (Function0) objT2, x340Var4, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                return rih1Var;
            case 2:
                omf1 omf1Var = (omf1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 48) == 0) {
                    i2 = iIntValue2 | (x340Var5.g(omf1Var) ? 32 : 16);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var5.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    no80.i(omf1Var.a, omf1Var.b, iu30Var2, (qim0) null, cwl1.o0(x340Var6, 2131963330), x340Var6, i2 & 896);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                sjo0.h((asf1) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 4:
                e7g1 e7g1Var = (e7g1) obj2;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= x340Var7.g(e7g1Var) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue3 & 1, (iIntValue3 & 1041) != 1040)) {
                    j541.h(e7g1Var.a, e7g1Var.b, e7g1Var.c, e7g1Var.d, e7g1Var.e, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                xag1 xag1Var = (xag1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                if (xag1Var.b) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var9).b;
                    qim0 qim0VarN = anm1.N("transcript_link_button", uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                    if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var9.g(iu30Var3)) && (iIntValue4 & 384) != 256) {
                        z = false;
                    }
                    x340 x340Var10 = x340Var9;
                    Object objT3 = x340Var10.T();
                    if (z || objT3 == fkj0.X) {
                        objT3 = new qkj(iu30Var3, (byte) 24);
                        x340Var10.s0(objT3);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT3);
                    ldx ldxVar = ldx.c;
                    gdx gdxVarR = yla.r(x340Var10);
                    cvx cvxVar3 = cbx.b(x340Var10).b;
                    zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                    if (xag1Var.c) {
                        x340Var10.i0(-1168621084);
                        x340Var10.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var10.i0(-1168619544);
                        haxVar = new hax(cwl1.o0(x340Var10, 2131955578));
                        x340Var10.r(false);
                    }
                    foo1.c(gbxVar, ldxVar, qim0VarN, haxVar, gdxVarR, zzq0VarH, (idn0) null, (ga80) null, (vu30) null, ynj.a, ynj.b, x340Var10, 0, 54, 904);
                }
                return rih1Var;
            case 6:
                vmg1 vmg1Var = (vmg1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                if (vmg1Var.a) {
                    if (vmg1Var.b != null) {
                        x340 x340Var12 = x340Var11;
                        x340Var12.i0(599170517);
                        x340Var12.r(false);
                        oexVar = new nex(6);
                    } else {
                        x340 x340Var13 = x340Var11;
                        x340Var13.i0(599280071);
                        Object objT4 = x340Var13.T();
                        if (objT4 == m4cVar) {
                            objT4 = coj.b;
                            x340Var13.s0(objT4);
                        }
                        vu30 vu30Var = (vu30) objT4;
                        Object objT5 = x340Var13.T();
                        if (objT5 == m4cVar) {
                            objT5 = coj.c;
                            x340Var13.s0(objT5);
                        }
                        oexVar = new oex(18, vu30Var, (vu30) objT5, (vu30) null, 8);
                        x340Var13.r(false);
                    }
                    nex nexVar = oexVar;
                    x340 x340Var14 = x340Var11;
                    Object objT6 = x340Var14.T();
                    if (objT6 == m4cVar) {
                        objT6 = new qkj(iu30Var4, (byte) 25);
                        x340Var14.s0(objT6);
                    }
                    poo1.e(new gbx(z50Var, (Function0) objT6), nexVar, yoo1.z(x340Var14), anm1.N("TranslateChip", nim0Var), 0, (String) null, (max) null, doj.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(400767037, new boj(vmg1Var, (byte) 0), x340Var14), x340Var14, 12582912, 3072, 8048);
                }
                return rih1Var;
            case 7:
                lqg1 lqg1Var = (lqg1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                int i3 = (iIntValue5 & 896) ^ 384;
                boolean z3 = (i3 > 256 && x340Var15.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var16 = x340Var15;
                Object objT7 = x340Var16.T();
                if (z3 || objT7 == m4cVar2) {
                    objT7 = new v5a(iu30Var5, (lnm) null, (byte) 2);
                    x340Var16.s0(objT7);
                }
                qxd0.t(rih1Var, x340Var16, (vu30) objT7);
                int i4 = lqg1Var.a;
                if ((i3 <= 256 || !x340Var16.g(iu30Var5)) && (iIntValue5 & 384) != 256) {
                    z = false;
                }
                Object objT8 = x340Var16.T();
                if (z || objT8 == m4cVar2) {
                    objT8 = new qkj(iu30Var5, (byte) 26);
                    x340Var16.s0(objT8);
                }
                ton1.i(i4, 0, (Function0) objT8, x340Var16, (qim0) null);
                return rih1Var;
            case 8:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                int i5 = ((rwg1) obj2).b;
                int iC = l1d.C(i5);
                if (iC == 0) {
                    idxVar = new idx();
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    idxVar = ldx.c;
                }
                ldx ldxVar2 = idxVar;
                int iC2 = l1d.C(i5);
                if (iC2 == 0) {
                    x340 x340Var18 = x340Var17;
                    x340Var18.i0(-134112002);
                    x340Var18.r(false);
                    j = u7h.k;
                } else {
                    if (iC2 != 1) {
                        throw p3d1.k(x340Var17, -134113551, false);
                    }
                    x340 x340Var19 = x340Var17;
                    x340Var19.i0(-134110118);
                    uwr uwrVar4 = cbx.a;
                    j = cbx.a(x340Var19).b.b;
                    x340Var19.r(false);
                }
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var17.g(iu30Var6)) && (iIntValue6 & 384) != 256) {
                    z = false;
                }
                x340 x340Var20 = x340Var17;
                Object objT9 = x340Var20.T();
                if (z || objT9 == fkj0.X) {
                    objT9 = new qkj(iu30Var6, (byte) 27);
                    x340Var20.s0(objT9);
                }
                foo1.c(new gbx(z50Var, (Function0) objT9), ldxVar2, anm1.N("try_again_button", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1183466324, new sre((byte) 5, j), x340Var20), x340Var20, 0, 48, 2040);
                return rih1Var;
            case 9:
                ((Number) obj5).intValue();
                ((s480) obj2).b.invoke((b0k) obj4, 0);
                return rih1Var;
            case 10:
                jah1 jah1Var = (jah1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                jtc1 jtc1Var = jah1Var.d;
                qim0 qim0VarH = pqo.h(u291.f(nim0Var, 1.0f), !jah1Var.c);
                boolean z4 = jah1Var.c;
                boolean z5 = (((iIntValue7 & 896) ^ 384) > 256 && x340Var21.g(iu30Var7)) || (iIntValue7 & 384) == 256;
                x340 x340Var22 = x340Var21;
                Object objT10 = x340Var22.T();
                j06 j06Var = x340Var22.a;
                if (z5 || objT10 == fkj0.X) {
                    objT10 = new qkj(iu30Var7, (byte) 28);
                    x340Var22.s0(objT10);
                }
                qim0 qim0VarX = bin.x(qim0VarH, z4, (String) null, (pm31) null, (idn0) null, (Function0) objT10, 14);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var22).b;
                cvx cvxVar5 = cbx.b(x340Var22).b;
                qim0 qim0VarY = uyn1.y(qim0VarX, 16.0f, 8.0f);
                fra fraVar = een.N0;
                cvx cvxVar6 = cbx.b(x340Var22).b;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var22, 0);
                int iHashCode = Long.hashCode(x340Var22.T);
                xos0 xos0VarM = x340Var22.m();
                qim0 qim0VarE = zr7.E(x340Var22, qim0VarY);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                boolean z6 = x340Var22.S;
                n4k n4kVar = hmb0.t1;
                if (z6) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var22, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var22, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var22, lljVar3);
                nko1.F(x340Var22);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var22, lljVar4);
                zov0 zov0Var = cbx.b(x340Var22).g;
                qim0 qim0VarR = u291.r(nim0Var, 40.0f);
                cua cuaVar = cbx.b(x340Var22).f;
                qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarR, er31.b(2.0f)), cbx.a(x340Var22).a.b.a(), d4o1.a);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM2 = x340Var22.m();
                qim0 qim0VarE2 = zr7.E(x340Var22, qim0VarF2);
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(gfh0VarC, x340Var22, lljVar);
                nko1.H(xos0VarM2, x340Var22, lljVar2);
                x0d.q(iHashCode2, x340Var22, lljVar3, x340Var22);
                nko1.H(qim0VarE2, x340Var22, lljVar4);
                int i6 = jtc1Var.b;
                int i7 = i6 == 0 ? -1 : lah1.a[l1d.C(i6)];
                if (i7 == -1) {
                    ujxVar = ptx.c;
                } else if (i7 == 1) {
                    ujxVar = qjx.c;
                } else if (i7 == 2) {
                    ujxVar = tox.c;
                } else {
                    if (i7 != 3) {
                        eg.o();
                        return null;
                    }
                    ujxVar = ujx.c;
                }
                ujx ujxVar2 = ujxVar;
                zov0 zov0Var2 = cbx.b(x340Var22).g;
                qim0 qim0VarR2 = u291.r(nim0Var, 16.0f);
                rxe1 rxe1Var = jah1Var.b;
                u7h u7hVar = rxe1Var != null ? new u7h(z4p1.e(rxe1Var.c)) : null;
                if (u7hVar == null) {
                    x340Var22.i0(1093284084);
                    j2 = cbx.a(x340Var22).b.c;
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(1093281759);
                    x340Var22.r(false);
                    j2 = u7hVar.a;
                }
                long j3 = j2;
                isl islVar = isl.a;
                w0h1.a(ujxVar2, islVar, qim0VarR2, j3, 0L, false, x340Var22, 56, 48);
                x340Var22.r(true);
                uwo1.e(jtc1Var.a, new wnb0(1.0f, true), cbx.d(x340Var22).g, cbx.a(x340Var22).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(3), 0, (qx8) null, x340Var22, 0, 0, 1712);
                plx plxVar = plx.c;
                zov0 zov0Var3 = cbx.b(x340Var22).g;
                w0h1.a(plxVar, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var22).b.b, 0L, false, x340Var22, plx.d | 48, 48);
                x340Var22.r(true);
                return rih1Var;
            case 11:
                l4o1.i((tbh1) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 12:
                deh1 deh1Var = (deh1) obj2;
                ((Number) obj5).intValue();
                xfo1.d(0, deh1Var.a, deh1Var.b, (b0k) obj4, (qim0) null);
                return rih1Var;
            case 13:
                bgh1 bgh1Var = (bgh1) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                boolean z7 = bgh1Var.b;
                int i8 = z7 ? 2131959988 : 2131959989;
                int i9 = z7 ? 2131959987 : 2131959986;
                boolean z8 = ((((iIntValue8 & 896) ^ 384) > 256 && x340Var23.g(iu30Var8)) || (iIntValue8 & 384) == 256) | ((((iIntValue8 & 112) ^ 48) > 32 && x340Var23.g(bgh1Var)) || (iIntValue8 & 48) == 32);
                x340 x340Var24 = x340Var23;
                Object objT11 = x340Var24.T();
                if (z8 || objT11 == fkj0.X) {
                    objT11 = new gmj(iu30Var8, bgh1Var, (byte) 1);
                    x340Var24.s0(objT11);
                }
                yoi1.c(2131959990, i8, i9, (Function0) objT11, x340Var24, 0);
                return rih1Var;
            case 14:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                qim0 qim0VarX2 = uyn1.x(nim0Var, 16.0f);
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var25.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                    z = false;
                }
                x340 x340Var26 = x340Var25;
                Object objT12 = x340Var26.T();
                if (z || objT12 == fkj0.X) {
                    objT12 = new qkj(iu30Var9, (byte) 29);
                    x340Var26.s0(objT12);
                }
                mgo1.g(0, (Function0) objT12, x340Var26, qim0VarX2);
                return rih1Var;
            case 15:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                int i10 = (iIntValue10 & 896) ^ 384;
                boolean z9 = (i10 > 256 && x340Var27.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                x340 x340Var28 = x340Var27;
                Object objT13 = x340Var28.T();
                if (z9 || objT13 == m4cVar3) {
                    objT13 = new uoj(iu30Var10, (byte) 0);
                    x340Var28.s0(objT13);
                }
                Function0 function0 = (Function0) objT13;
                String strO0 = cwl1.o0(x340Var28, 2131963486);
                String strO1 = cwl1.o0(x340Var28, 2131963485);
                String strO2 = cwl1.o0(x340Var28, 2131963487);
                boolean z10 = (i10 > 256 && x340Var28.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                Object objT14 = x340Var28.T();
                if (z10 || objT14 == m4cVar3) {
                    objT14 = new uoj(iu30Var10, (byte) 1);
                    x340Var28.s0(objT14);
                }
                zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT14));
                String strO3 = cwl1.o0(x340Var28, 2131963484);
                if ((i10 <= 256 || !x340Var28.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                    z = false;
                }
                Object objT15 = x340Var28.T();
                if (z || objT15 == m4cVar3) {
                    objT15 = new uoj(iu30Var10, (byte) 2);
                    x340Var28.s0(objT15);
                }
                mqo1.d(function0, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT15)), x340Var28, 2359296, 6);
                return rih1Var;
            case 16:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var11)) && (iIntValue11 & 384) != 256) {
                    z = false;
                }
                x340 x340Var30 = x340Var29;
                Object objT16 = x340Var30.T();
                if (z || objT16 == fkj0.X) {
                    objT16 = new uoj(iu30Var11, (byte) 3);
                    x340Var30.s0(objT16);
                }
                mqo1.e((Function0) objT16, (i3u) null, (vu30) null, woj.a, woj.b, apo.r(1450219611, new v0j(iu30Var11, (byte) 12), x340Var30), apo.r(2098447068, new v0j(iu30Var11, (byte) 13), x340Var30), x340Var30, 1797120, 6);
                return rih1Var;
            case 17:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                zmh1 zmh1Var = ((cnh1) obj2).a;
                int i11 = (iIntValue12 & 896) ^ 384;
                boolean z11 = (i11 > 256 && x340Var31.g(iu30Var12)) || (iIntValue12 & 384) == 256;
                x340 x340Var32 = x340Var31;
                Object objT17 = x340Var32.T();
                if (z11 || objT17 == m4cVar4) {
                    objT17 = new uoj(iu30Var12, (byte) 6);
                    x340Var32.s0(objT17);
                }
                Function0 function1 = (Function0) objT17;
                if ((i11 <= 256 || !x340Var32.g(iu30Var12)) && (iIntValue12 & 384) != 256) {
                    z = false;
                }
                Object objT18 = x340Var32.T();
                if (z || objT18 == m4cVar4) {
                    objT18 = new uoj(iu30Var12, (byte) 7);
                    x340Var32.s0(objT18);
                }
                gio1.j(zmh1Var, function1, (Function0) objT18, x340Var32, 0);
                return rih1Var;
            case 18:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                zmh1 zmh1Var2 = ((hnh1) obj2).a;
                if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var33.g(iu30Var13)) && (iIntValue13 & 384) != 256) {
                    z = false;
                }
                x340 x340Var34 = x340Var33;
                Object objT19 = x340Var34.T();
                if (z || objT19 == fkj0.X) {
                    objT19 = new uoj(iu30Var13, (byte) 8);
                    x340Var34.s0(objT19);
                }
                sio1.o(zmh1Var2, (Function0) objT19, x340Var34, 0);
                return rih1Var;
            case 19:
                uph1 uph1Var = (uph1) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                if (uph1Var.b) {
                    x340 x340Var36 = x340Var35;
                    strK = x0d.k(x340Var36, -1747625748, 2131953877, x340Var36, false);
                } else {
                    x340 x340Var37 = x340Var35;
                    x340Var37.i0(-1747550170);
                    mvh1 mvh1Var = uph1Var.a;
                    if (mvh1Var instanceof hvh1) {
                        strK = x0d.k(x340Var37, -916759134, 2131953876, x340Var37, false);
                    } else if (mvh1Var instanceof kvh1) {
                        strK = x0d.k(x340Var37, -916756253, 2131953880, x340Var37, false);
                    } else if (mvh1Var instanceof ivh1) {
                        strK = x0d.k(x340Var37, -916753308, 2131953879, x340Var37, false);
                    } else {
                        if (!(mvh1Var instanceof jvh1)) {
                            throw p3d1.k(x340Var37, -916760552, false);
                        }
                        strK = x0d.k(x340Var37, -916750388, 2131953878, x340Var37, false);
                    }
                    x340Var37.r(false);
                }
                String str5 = strK;
                xrx xrxVar = xrx.c;
                String strO4 = cwl1.o0(x340Var35, 2131953875);
                if ((((iIntValue14 & 896) ^ 384) <= 256 || !x340Var35.g(iu30Var14)) && (iIntValue14 & 384) != 256) {
                    z = false;
                }
                x340 x340Var38 = x340Var35;
                Object objT20 = x340Var38.T();
                if (z || objT20 == fkj0.X) {
                    objT20 = new uoj(iu30Var14, (byte) 9);
                    x340Var38.s0(objT20);
                }
                hqn1.h(xrxVar, str5, strO4, (Function0) objT20, anm1.N("artifact-page-update-candence-button", nim0Var), 0L, false, false, (max) null, (vu30) null, x340Var38, xrx.d, 992);
                return rih1Var;
            case 20:
                return a(obj, obj2, obj3, obj4, obj5);
            case 21:
                return d(obj, obj2, obj3, obj4, obj5);
            case 22:
                ((Number) obj5).intValue();
                t1c.a(anm1.N("update_notification_undo_impression", u291.d(nim0Var, 1.0f)), (b0k) obj4, 0);
                return rih1Var;
            case 23:
                return e(obj, obj2, obj3, obj4, obj5);
            case 24:
                return f(obj, obj2, obj3, obj4, obj5);
            case 25:
                qmo1.l((p1i1) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 28:
                syo1.j((wxi1) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            default:
                tyo1.d((zxi1) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
        }
    }
}
