package p;

import android.icu.text.NumberFormat;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qsj extends hab0 implements bv30 {
    public static final qsj N0;
    public static final qsj O0;
    public static final qsj P0;
    public static final qsj Q0;
    public static final qsj R0;
    public static final qsj S0;
    public static final qsj T0;
    public static final qsj U0;
    public static final qsj X;
    public static final qsj Y;
    public static final qsj Z;
    public static final qsj b;
    public static final qsj c;
    public static final qsj d;
    public static final qsj e;
    public static final qsj f;
    public static final qsj g;
    public static final qsj h;
    public static final qsj i;
    public static final qsj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new qsj(i2, (byte) 0);
        c = new qsj(i2, (byte) 1);
        d = new qsj(i2, (byte) 2);
        e = new qsj(i2, (byte) 3);
        f = new qsj(i2, (byte) 4);
        g = new qsj(i2, (byte) 5);
        h = new qsj(i2, (byte) 6);
        i = new qsj(i2, (byte) 7);
        t = new qsj(i2, (byte) 8);
        X = new qsj(i2, (byte) 9);
        Y = new qsj(i2, (byte) 10);
        Z = new qsj(i2, (byte) 11);
        N0 = new qsj(i2, (byte) 12);
        O0 = new qsj(i2, (byte) 13);
        P0 = new qsj(i2, (byte) 14);
        Q0 = new qsj(i2, (byte) 15);
        R0 = new qsj(i2, (byte) 16);
        S0 = new qsj(i2, (byte) 17);
        T0 = new qsj(i2, (byte) 18);
        U0 = new qsj(i2, (byte) 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsj(maa maaVar, byte b2) {
        super(5);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ud2 ud2Var = (ud2) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        uqo uqoVar = ud2Var.a;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, nim0.a);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        String strK = null;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String strB = tro1.B(uqoVar, x340Var, 0);
        if5 if5VarO = tro1.o(uqoVar);
        String strO0 = cwl1.o0(x340Var, 2131961723);
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z || objT == m4cVar) {
            objT = new k52(iu30Var, (byte) 12);
            x340Var3.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        boolean z2 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var3.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new ib2(iu30Var, (byte) 3);
            x340Var3.s0(objT2);
        }
        uyn1.e(strB, if5VarO, true, gbxVar, (iu30) objT2, (qim0) null, (if5) null, ud2Var.d, x340Var, 448, 96);
        x340Var3.i0(-534350673);
        Integer num = ud2Var.b;
        if (num != null) {
            int iIntValue2 = num.intValue();
            int iOrdinal = ud2Var.c.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                } else if (iIntValue2 >= 18) {
                    strK = x0d.k(x340Var3, 1885084921, 2131961721, x340Var3, false);
                } else if (iIntValue2 >= 16) {
                    x340Var3.i0(1885088574);
                    strK = cwl1.n0(2131961720, new Object[]{num}, x340Var3);
                    x340Var3.r(false);
                } else if (iIntValue2 < 16) {
                    strK = x0d.k(x340Var3, 1885091898, 2131961722, x340Var3, false);
                } else {
                    x340Var3.i0(-1691600274);
                    x340Var3.r(false);
                }
            } else if (iIntValue2 >= 18) {
                strK = x0d.k(x340Var3, 1885098298, 2131961718, x340Var3, false);
            } else if (iIntValue2 >= 16) {
                x340Var3.i0(1885101983);
                strK = cwl1.n0(2131961717, new Object[]{num}, x340Var3);
                x340Var3.r(false);
            } else if (iIntValue2 < 16) {
                strK = x0d.k(x340Var3, 1885105339, 2131961719, x340Var3, false);
            } else {
                x340Var3.i0(-1691182642);
                x340Var3.r(false);
            }
        }
        x340Var3.r(false);
        if (strK == null) {
            x340Var3.i0(2029790144);
            x340Var3.r(false);
        } else {
            x340Var3.i0(2029790145);
            cso1.s(new if5((Integer) null, strK, (b2i) null, (hf5) null, 13), (qim0) null, ud2Var.d, jlx.c, x340Var, 8 | (jlx.d << 9), 2);
            x340Var3.r(false);
        }
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strU;
        String strU2;
        ez6 ez6Var = (ez6) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        Integer num = ez6Var.d;
        Integer num2 = ez6Var.e;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(new Locale(upn1.m()));
        j2i j2iVarR = null;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        if (num == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1953718701);
            x340Var2.r(false);
            strU = null;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1953718700);
            int iIntValue = num.intValue();
            strU = cwl1.U(2131820911, iIntValue, new Object[]{numberInstance.format(Integer.valueOf(iIntValue))}, x340Var3);
            x340Var3.r(false);
        }
        if (num2 == null) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-1953481210);
            x340Var4.r(false);
            strU2 = null;
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(-1953481209);
            int iIntValue2 = num2.intValue();
            strU2 = cwl1.U(2131820912, iIntValue2, new Object[]{numberInstance.format(Integer.valueOf(iIntValue2))}, x340Var5);
            x340Var5.r(false);
        }
        String strY0 = o7h.y0(f46.i0(new String[]{strU, strU2}), " • ", (String) null, (String) null, (iu30) null, 62);
        if (strY0.length() <= 0) {
            strY0 = null;
        }
        qim0 qim0VarN = anm1.N("artist-view-header-row", nim0.a);
        x340 x340Var6 = x340Var;
        Object objT = x340Var6.T();
        if (objT == fkj0.X) {
            objT = fz6.t;
            x340Var6.s0(objT);
        }
        qim0 qim0VarB = s161.b(qim0VarN, true, (iu30) objT);
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(x340Var6).g;
        zov0 zov0Var2 = cbx.b(x340Var6).g;
        uvx uvxVar = new uvx(1, null, 4, null, null, new tvx(0.0f, 16.0f, 0.0f), null, 2, new p3v(64.0f), 90);
        if (strY0 != null) {
            x340Var6.i0(-396037661);
            j2iVarR = apo.r(1527873463, new p3(strY0, (byte) 20), x340Var6);
            x340Var6.r(false);
        } else {
            x340Var6.i0(-395823049);
            x340Var6.r(false);
        }
        jto1.b(qim0VarB, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(2037719279, new gz6(ez6Var, (byte) 0), x340Var6), (xu30) null, j2iVarR, (xu30) null, (xu30) null, (xu30) null, apo.r(1525017226, new gz6(ez6Var, (byte) 1), x340Var6), x340Var6, 805306432, 196608, 30204);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        oza ozaVar = (oza) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = ozaVar.b;
        x340 x340Var = (b0k) obj4;
        long j = ((u7h) x340Var.k(gaa1.a)).a;
        String str2 = ozaVar.c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        uwr uwrVar = cbx.a;
        phx phxVar = new phx(2, ((yex) zex.a.d).d, str3, (String) null, str);
        String strN0 = cwl1.n0(2131962689, new Object[]{str}, x340Var);
        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
        boolean zF = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.f(j);
        Object objT = x340Var.T();
        if (zF || objT == m4cVar) {
            objT = new sza(iu30Var, j, (byte) 0);
            x340Var.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strN0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strN0), function0);
        cr31 cr31Var = er31.a;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = vq9.U0;
            x340Var.s0(objT2);
        }
        kgx kgxVar = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
        vzq0.a.getClass();
        cwl1.b(qim0VarD, (tl3) null, cr31Var, kgxVar, uzq0.b, (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(1733166710, new gaa(phxVar, (byte) 10), x340Var), x340Var, 0, 48, 1250);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        qix rixVar;
        nix nixVar;
        w7b w7bVar = (w7b) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        i7g0 i7g0Var = w7bVar.b;
        int i2 = (iIntValue & 48) == 0 ? (x340Var.g(w7bVar) ? 32 : 16) | iIntValue : iIntValue;
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            x340Var2.i0(-1227853404);
            List<i7g0> list = w7bVar.a;
            ArrayList arrayList = new ArrayList();
            for (i7g0 i7g0Var2 : list) {
                int iOrdinal = i7g0Var2.ordinal();
                if (iOrdinal == 0) {
                    x340Var2.i0(162388182);
                    x340Var2.r(false);
                    nixVar = null;
                } else if (iOrdinal == 1) {
                    x340Var2.i0(-1518779975);
                    nixVar = new nix("ARTIST", y7b.e(i7g0Var2, x340Var2), null, null, 12);
                    x340Var2.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var2, -1518783976, false);
                    }
                    x340Var2.i0(-1518775240);
                    nixVar = new nix("TRACK", y7b.e(i7g0Var2, x340Var2), null, null, 12);
                    x340Var2.r(false);
                }
                if (nixVar != null) {
                    arrayList.add(nixVar);
                }
            }
            x340Var2.r(false);
            c9 c9VarF = mqo1.F(arrayList);
            if (i7g0Var == i7g0.a) {
                x340Var2.i0(591415062);
                x340Var2.r(false);
                rixVar = qix.a;
            } else {
                x340Var2.i0(591475450);
                rixVar = new rix(new nix(i7g0Var.name(), y7b.e(i7g0Var, x340Var2), null, null, 12));
                x340Var2.r(false);
            }
            tix tixVar = new tix(c9VarF, rixVar, false, 60);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new c5a(iu30Var, (byte) 8);
                x340Var2.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            pro1.f(tixVar, iu30Var2, (qim0) null, uyn1.h(1, 0.0f, 12.0f), x340Var2, 0, 20);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:241:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:244:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:247:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:249:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:251:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:253:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:255:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:258:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:260:0x0607  */
    /* JADX WARN: Code duplicated, block: B:261:0x0609  */
    /* JADX WARN: Code duplicated, block: B:263:0x060d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0611  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        String str;
        int i3;
        List list;
        ljw0 ljw0Var;
        ko7 ko7Var;
        mq70 mq70Var;
        up70 up70VarA;
        String strK;
        String strK2;
        int i4;
        max maxVar;
        byte b2 = this.a;
        vp70 vp70Var = vp70.c;
        int i5 = 2;
        nim0 nim0Var = nim0.a;
        Object obj6 = null;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        boolean z2 = true;
        switch (b2) {
            case 0:
                aom1 aom1Var = (aom1) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                x340 x340Var = (b0k) obj4;
                boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(aom1Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new gmj((byte) 4, (Object) aom1Var, iu30Var);
                    x340Var.s0(objT);
                }
                zpn1.h(aom1Var, (Function0) objT, (qim0) null, x340Var, (iIntValue >> 3) & 14);
                return rih1Var;
            case 1:
                qom1 qom1Var = (qom1) obj2;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if (qom1Var instanceof oom1) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(188461161);
                    bqn1.t((oom1) qom1Var, (qim0) null, x340Var3, (iIntValue2 >> 3) & 14);
                    x340Var3.r(false);
                } else {
                    if (!(qom1Var instanceof pom1)) {
                        throw p3d1.k(x340Var2, 188459897, false);
                    }
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(1547387349);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                lbt0 lbt0Var = (lbt0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
                z = (((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                x340 x340Var6 = x340Var5;
                Object objT2 = x340Var6.T();
                if (z || objT2 == fkj0.X) {
                    objT2 = new k4j(iu30Var2, (byte) 29);
                    x340Var6.s0(objT2);
                }
                jyo1.d(lbt0Var, qim0VarX, (iu30) objT2, x340Var6, (iIntValue3 >> 3) & 14);
                return rih1Var;
            case 3:
                lbt0 lbt0Var2 = (lbt0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var7.g(iu30Var3)) && (iIntValue4 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var8 = x340Var7;
                Object objT3 = x340Var8.T();
                if (z2 || objT3 == fkj0.X) {
                    objT3 = new usj(iu30Var3, (byte) 0);
                    x340Var8.s0(objT3);
                }
                kyo1.d(lbt0Var2, (qim0) null, (iu30) objT3, x340Var8, (iIntValue4 >> 3) & 14);
                return rih1Var;
            case 4:
                rtm1 rtm1Var = (rtm1) obj2;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= x340Var9.g(rtm1Var) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 1041) != 1040)) {
                    ujo1.b(rtm1Var, u291.d(nim0Var, 1.0f), x340Var10, ((iIntValue5 >> 3) & 14) | 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                vtm1 vtm1Var = (vtm1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 48) == 0) {
                    i2 = iIntValue6 | ((iIntValue6 & 64) == 0 ? x340Var11.g(vtm1Var) : x340Var11.i(vtm1Var) ? 32 : 16);
                } else {
                    i2 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i2 |= x340Var11.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    boolean z3 = vtm1Var.b;
                    lex lexVarZ = yoo1.z(x340Var12);
                    nex nexVar = new nex(4);
                    boolean z4 = vtm1Var.c;
                    String strA = vtm1Var.a.a();
                    zzq0 zzq0Var = yoo1.z(x340Var12).a;
                    qim0 qim0VarN = anm1.N("your_library_filter_chip_element_checked_" + vtm1Var.b + "_attach_to_previous_chip_" + vtm1Var.c, nim0Var);
                    z = (i2 & 896) == 256;
                    Object objT4 = x340Var12.T();
                    if (z || objT4 == fkj0.X) {
                        objT4 = new usj(iu30Var4, (byte) 1);
                        x340Var12.s0(objT4);
                    }
                    poo1.g(z3, (iu30) objT4, nexVar, lexVarZ, qim0VarN, 0, (qex) null, strA, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, z4, zzq0Var, apo.r(2005475001, new boj(vtm1Var, (byte) 1), x340Var12), x340Var12, 0, 196608, 8032);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarH = l6o1.H(u291.d(nim0Var2, 1.0f), l6o1.C(0, 0, 1, x340Var13), false, 14);
                uwr uwrVar = cbx.a;
                qim0 qim0VarN2 = anm1.N("your_updates_empty_state", uyn1.x(qim0VarH, cbx.b(x340Var13).e.b));
                x340 x340Var14 = x340Var13;
                Object objT5 = x340Var14.T();
                m4c m4cVar = fkj0.X;
                if (objT5 == m4cVar) {
                    objT5 = cjj.h;
                    x340Var14.s0(objT5);
                }
                qim0 qim0VarB = s161.b(qim0VarN2, true, (iu30) objT5);
                mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var14, 0);
                int iHashCode = Long.hashCode(x340Var14.T);
                xos0 xos0VarM = x340Var14.m();
                qim0 qim0VarE = zr7.E(x340Var14, qim0VarB);
                hzj.A.getClass();
                if (x340Var14.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(hmb0.t1);
                } else {
                    x340Var14.v0();
                }
                nko1.H(mbhVarA, x340Var14, y580.O0);
                nko1.H(xos0VarM, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE, x340Var14, y580.Y);
                ilx ilxVar = ilx.c;
                zov0 zov0Var = cbx.b(x340Var14).g;
                w0h1.a(ilxVar, isl.a, u291.r(nim0Var2, 40.0f), 0L, 0L, false, x340Var14, ilx.d | 48, 56);
                String strO0 = cwl1.o0(x340Var14, 2131964182);
                cvx cvxVar = cbx.b(x340Var14).b;
                uwo1.e(strO0, uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(x340Var14).e, cbx.a(x340Var14).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2016);
                String strO1 = cwl1.o0(x340Var14, 2131964178);
                cvx cvxVar2 = cbx.b(x340Var14).b;
                uwo1.e(strO1, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var14).j, cbx.a(x340Var14).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2016);
                int i6 = (iIntValue7 & 896) ^ 384;
                boolean z5 = (i6 > 256 && x340Var14.g(iu30Var5)) || (iIntValue7 & 384) == 256;
                Object objT6 = x340Var14.T();
                if (z5 || objT6 == m4cVar) {
                    objT6 = new erj(iu30Var5, (byte) 5);
                    x340Var14.s0(objT6);
                }
                Function0 function0 = (Function0) objT6;
                boolean z6 = (i6 > 256 && x340Var14.g(iu30Var5)) || (iIntValue7 & 384) == 256;
                Object objT7 = x340Var14.T();
                if (z6 || objT7 == m4cVar) {
                    objT7 = new erj(iu30Var5, (byte) 6);
                    x340Var14.s0(objT7);
                }
                grn1.d(function0, (Function0) objT7, (qim0) null, x340Var14, 0);
                x340Var14.r(true);
                return rih1Var;
            case 7:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var15).b;
                qim0 qim0VarN3 = anm1.N("your_updates_loading_error", uyn1.x(qim0VarF, 16.0f));
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var16 = x340Var15;
                int iHashCode2 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM2 = x340Var16.m();
                qim0 qim0VarE2 = zr7.E(x340Var15, qim0VarN3);
                hzj.A.getClass();
                x340 x340Var17 = x340Var15;
                if (x340Var17.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var17.m0();
                if (x340Var17.S) {
                    x340Var17.l(hmb0.t1);
                } else {
                    x340Var17.v0();
                }
                nko1.H(gfh0VarC, x340Var15, y580.O0);
                nko1.H(xos0VarM2, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE2, x340Var15, y580.Y);
                z = (((iIntValue8 & 896) ^ 384) > 256 && x340Var17.g(iu30Var6)) || (iIntValue8 & 384) == 256;
                Object objT8 = x340Var17.T();
                if (z || objT8 == fkj0.X) {
                    objT8 = new usj(iu30Var6, (byte) 2);
                    x340Var17.s0(objT8);
                }
                uwo1.d(wmo1.y(2131964184, 2131964185, "your_updates_loading_error_row_message_tag", (zma1) null, (iu30) objT8, x340Var15, 8), cbx.a(x340Var15).b.b, (qim0) null, cbx.d(x340Var15).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var15, 0, 0, 4084);
                x340Var17.r(true);
                return rih1Var;
            case 8:
                ksw kswVar = (ksw) obj;
                n2n1 n2n1Var = (n2n1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                int i7 = (iIntValue9 & 896) ^ 384;
                boolean z7 = (i7 > 256 && x340Var18.g(iu30Var7)) || (iIntValue9 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT9 = x340Var19.T();
                if (z7 || objT9 == m4cVar2) {
                    objT9 = new erj(iu30Var7, (byte) 7);
                    x340Var19.s0(objT9);
                }
                aym.f(kswVar, 0, (Function0) objT9, x340Var19, iIntValue9 & 14, 1);
                kjo0 kjo0Var = n2n1Var.b;
                boolean z8 = (i7 > 256 && x340Var19.g(iu30Var7)) || (iIntValue9 & 384) == 256;
                Object objT10 = x340Var19.T();
                if (z8 || objT10 == m4cVar2) {
                    objT10 = new erj(iu30Var7, (byte) 8);
                    x340Var19.s0(objT10);
                }
                Function0 function1 = (Function0) objT10;
                boolean z9 = (i7 > 256 && x340Var19.g(iu30Var7)) || (iIntValue9 & 384) == 256;
                Object objT11 = x340Var19.T();
                if (z9 || objT11 == m4cVar2) {
                    objT11 = new erj(iu30Var7, (byte) 9);
                    x340Var19.s0(objT11);
                }
                Function0 function2 = (Function0) objT11;
                z = (i7 > 256 && x340Var19.g(iu30Var7)) || (iIntValue9 & 384) == 256;
                Object objT12 = x340Var19.T();
                if (z || objT12 == m4cVar2) {
                    objT12 = new erj(iu30Var7, (byte) 10);
                    x340Var19.s0(objT12);
                }
                irn1.G(kjo0Var, function1, function2, (Function0) objT12, anm1.N("your_updates_notification_row", nim0Var), x340Var19, 0);
                return rih1Var;
            case 9:
                return new wnb1((jo70) obj, (xkk1) obj2, (hll) obj3, (hzy) obj4, (iix0) null, (h2v) null, (zoy0) null, (w281) obj5, 368);
            case 10:
                return new wnb1((jo70) obj, (xkk1) obj2, (hll) obj3, (hzy) obj4, (iix0) null, (h2v) obj5, (zoy0) null, (w281) null, 464);
            case 11:
                return new wnb1((jo70) obj, (xkk1) obj2, (hll) obj3, (hzy) null, (iix0) obj4, (h2v) obj5, (zoy0) null, (w281) null, 456);
            case 12:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                pjw0 pjw0Var = (pjw0) obj3;
                hll hllVar = (hll) obj4;
                qtt0 qtt0Var = (qtt0) obj5;
                String str2 = jo70Var.a;
                String str3 = jo70Var.b;
                String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, zy00.c, 30);
                Iterator it = p7h.M(new vp70[]{vp70Var, vp70.b, vp70.d, vp70.e}).iterator();
                do {
                    if (it.hasNext()) {
                        up70 up70VarA2 = xkk1Var.a.a((vp70) it.next());
                        str = up70VarA2 != null ? up70VarA2.a.a : null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str4 = str;
                    if (pjw0Var != null) {
                        ljw0Var = pjw0Var.b;
                        if (ljw0Var instanceof ljw0) {
                            obj6 = ljw0Var.a.a.a.a;
                        } else {
                            if (ljw0Var instanceof mjw0) {
                                eg.o();
                                return null;
                            }
                            ko7Var = ((mjw0) ljw0Var).a.c;
                            if (ko7Var != null) {
                                obj6 = ko7Var.a.a.a;
                            }
                        }
                    }
                    String str5 = obj6;
                    if (hllVar != null) {
                        list = hllVar.b;
                        if (!list.contains(ell.d)) {
                            if (list.contains(ell.b)) {
                                i5 = 1;
                            } else {
                                i5 = 3;
                            }
                        }
                        i3 = i5;
                    } else {
                        i3 = 3;
                    }
                    if (qtt0Var == null) {
                        qtt0Var = qtt0.a;
                    }
                    return new rky(str2, str3, strY0, str4, str5, i3, qtt0Var);
                } while (str == null);
                if (str == null) {
                    str = "";
                }
                String str6 = str;
                if (pjw0Var != null) {
                    ljw0Var = pjw0Var.b;
                    if (ljw0Var instanceof ljw0) {
                        obj6 = ljw0Var.a.a.a.a;
                    } else {
                        if (ljw0Var instanceof mjw0) {
                            eg.o();
                            return null;
                        }
                        ko7Var = ((mjw0) ljw0Var).a.c;
                        if (ko7Var != null) {
                            obj6 = ko7Var.a.a.a;
                        }
                    }
                }
                String str7 = obj6;
                if (hllVar != null) {
                    list = hllVar.b;
                    if (!list.contains(ell.d)) {
                        if (list.contains(ell.b)) {
                            i5 = 1;
                        } else {
                            i5 = 3;
                        }
                    }
                    i3 = i5;
                } else {
                    i3 = 3;
                }
                if (qtt0Var == null) {
                    qtt0Var = qtt0.a;
                }
                return new rky(str2, str3, strY0, str6, str7, i3, qtt0Var);
            case 13:
                return new hlg0((jo70) obj, (k1r) obj2, (jo70) obj3, (xkk1) obj4, (z6a1) obj5, null);
            case 14:
                return new y5i0((d7u0) obj, (xkk1) obj2, (prl) obj3, (hll) obj4, (be60) obj5);
            case 15:
                return new hei0((nbw0) obj, (yo60) obj2, (jo70) obj3, (prl) obj4, (xkk1) obj5);
            case 16:
                jo70 jo70Var2 = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                k1r k1rVar = (k1r) obj3;
                k1r k1rVar2 = (k1r) obj4;
                k1r k1rVar3 = (k1r) obj5;
                i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                hll hllVar2 = (hll) (i1rVar != null ? i1rVar.a : null);
                i1r i1rVar2 = k1rVar2 instanceof i1r ? (i1r) k1rVar2 : null;
                qfd qfdVar = (qfd) (i1rVar2 != null ? i1rVar2.a : null);
                i1r i1rVar3 = k1rVar3 instanceof i1r ? (i1r) k1rVar3 : null;
                boolean zK = yto.k((String) (i1rVar3 != null ? i1rVar3.a : null), false);
                List listM = p7h.M(new k1r[]{k1rVar, k1rVar2, k1rVar3});
                if (!(listM instanceof Collection) || !listM.isEmpty()) {
                    Iterator it2 = listM.iterator();
                    while (it2.hasNext()) {
                        if (((k1r) it2.next()) instanceof j1r) {
                            z = true;
                        }
                    }
                }
                return new zxr0(jo70Var2, xkk1Var2, hllVar2, qfdVar, zK, z);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                jo70 jo70Var3 = (jo70) obj;
                xkk1 xkk1Var3 = (xkk1) obj2;
                z1g1 z1g1Var = (z1g1) obj3;
                pjw0 pjw0Var2 = (pjw0) obj4;
                vnb1 vnb1Var = (vnb1) obj5;
                njw0 njw0Var = pjw0Var2 != null ? pjw0Var2.b : null;
                String str8 = jo70Var3.a;
                String strY1 = o7h.y0(jo70Var3.d, ", ", (String) null, (String) null, ej11.U0, 30);
                String str9 = (xkk1Var3 == null || (mq70Var = xkk1Var3.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a;
                boolean z10 = z1g1Var != null ? z1g1Var.f : false;
                boolean zC = z1g1Var != null ? poz0.C(z1g1Var) : false;
                if (njw0Var instanceof ljw0) {
                    String str10 = ((ljw0) njw0Var).a.a.a.a;
                    if (str10.length() != 0) {
                        obj6 = str10;
                    }
                }
                return new zl11("", str8, strY1, str9, obj6, z10, zC, false, vnb1Var != null ? vnb1Var.a : false);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                xkk1 xkk1Var4 = (xkk1) obj;
                jo70 jo70Var4 = (jo70) obj2;
                return new y910((List) obj3, (List) obj4, (List) obj5, xkk1Var4 != null ? t890.i(xkk1Var4) : null, jo70Var4 != null ? jo70Var4.a : null, (String) null, false);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new inh1((jo70) obj, (xkk1) obj2, (zoy0) obj3, (iam) obj4, (zd3) obj5);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj5).intValue();
                qim0 qim0VarV = u291.v(nim0Var, 60.0f);
                cr31 cr31VarB = er31.b(60.0f);
                x340 x340Var20 = (b0k) obj4;
                Object objT13 = x340Var20.T();
                if (objT13 == fkj0.X) {
                    objT13 = ft.e;
                    x340Var20.s0(objT13);
                }
                wu.b("", (qim0) null, cwl1.l0(qim0VarV, 0L, new mu(cr31VarB, (iu30) objT13), 13), false, (gbx) null, false, x2i.a, x340Var20, 1572870, 58);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ex exVar = (ex) obj2;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= x340Var21.g(exVar) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue10 & 1, (iIntValue10 & 1041) != 1040)) {
                    String strO2 = cwl1.o0(x340Var22, 2131951727);
                    int i8 = exVar.a;
                    boolean z11 = exVar.b;
                    int iC = l1d.C(i8);
                    if (iC == 0) {
                        x340Var22.i0(1735541405);
                        strK = z11 ? x0d.k(x340Var22, 1735571723, 2131951725, x340Var22, false) : x0d.k(x340Var22, 1735675697, 2131951724, x340Var22, false);
                        x340Var22.r(false);
                    } else if (iC == 1) {
                        strK = x0d.k(x340Var22, -1606586154, 2131951723, x340Var22, false);
                    } else if (iC == 2) {
                        strK = x0d.k(x340Var22, -1606574093, 2131951722, x340Var22, false);
                    } else {
                        if (iC != 3) {
                            throw p3d1.k(x340Var22, -1606587234, false);
                        }
                        strK = x0d.k(x340Var22, -1606571213, 2131951726, x340Var22, false);
                    }
                    yxo1.a(strO2, strK, (qim0) null, false, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 22:
                gx gxVar = (gx) obj2;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= x340Var23.g(gxVar) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue11 & 1, (iIntValue11 & 1041) != 1040)) {
                    String strO3 = cwl1.o0(x340Var24, 2131958463);
                    int i9 = gxVar.a;
                    boolean z12 = gxVar.b;
                    int iC2 = l1d.C(i9);
                    if (iC2 == 0) {
                        strK2 = x0d.k(x340Var24, 1689640319, 2131958460, x340Var24, false);
                    } else if (iC2 == 1) {
                        x340Var24.i0(839352668);
                        strK2 = z12 ? x0d.k(x340Var24, 839376290, 2131958462, x340Var24, false) : x0d.k(x340Var24, 839479272, 2131958461, x340Var24, false);
                        x340Var24.r(false);
                    } else {
                        if (iC2 != 2) {
                            throw p3d1.k(x340Var24, 1689638696, false);
                        }
                        strK2 = x0d.k(x340Var24, 1689652764, 2131958459, x340Var24, false);
                    }
                    cto1.h(strO3, strK2, (qim0) null, false, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 23:
                z71 z71Var = (z71) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                if ((iIntValue12 & 48) == 0) {
                    i4 = iIntValue12 | (x340Var25.g(z71Var) ? 32 : 16);
                } else {
                    i4 = iIntValue12;
                }
                if ((iIntValue12 & 384) == 0) {
                    i4 |= x340Var25.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    String strO4 = cwl1.o0(x340Var26, 2131958092);
                    String str11 = z71Var.c;
                    String strO5 = cwl1.o0(x340Var26, 2131958091);
                    boolean z13 = z71Var.b;
                    String strK3 = z71Var.c;
                    if (z13) {
                        x340Var26.i0(-752974351);
                        x340Var26.r(false);
                        maxVar = jax.a;
                    } else {
                        x340Var26.i0(-752931385);
                        if (strK3 == null) {
                            strK3 = x0d.k(x340Var26, 252808463, 2131958099, x340Var26, false);
                        } else {
                            x340Var26.i0(252807750);
                            x340Var26.r(false);
                        }
                        max haxVar = new hax(strK3);
                        x340Var26.r(false);
                        maxVar = haxVar;
                    }
                    qim0 qim0VarN4 = anm1.N("add-account-row", nim0Var);
                    z = (i4 & 896) == 256;
                    Object objT14 = x340Var26.T();
                    if (z || objT14 == fkj0.X) {
                        objT14 = new cr0(iu30Var8, (byte) 1);
                        x340Var26.s0(objT14);
                    }
                    gxo1.a(strO4, strO5, qim0VarN4, str11, maxVar, (Function0) objT14, x340Var26, 384, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return a(obj, obj2, obj3, obj4, obj5);
            case 25:
                return d(obj, obj2, obj3, obj4, obj5);
            case 26:
                return e(obj, obj2, obj3, obj4, obj5);
            case 27:
                return f(obj, obj2, obj3, obj4, obj5);
            case 28:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                String strO6 = cwl1.o0(x340Var27, 2131953009);
                String strO7 = cwl1.o0(x340Var27, 2131953010);
                boolean z14 = (((iIntValue13 & 896) ^ 384) > 256 && x340Var27.g(iu30Var9)) || (iIntValue13 & 384) == 256;
                x340 x340Var28 = x340Var27;
                Object objT15 = x340Var28.T();
                if (z14 || objT15 == fkj0.X) {
                    objT15 = new gob(iu30Var9, (byte) 1);
                    x340Var28.s0(objT15);
                }
                ryn1.h(0, strO6, strO7, x340Var28, uyn1.z(16.0f, 0.0f, 2, bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) objT15, 15)));
                return rih1Var;
            default:
                qhe qheVar = (qhe) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                x340 x340Var30 = x340Var29;
                x340Var30.i0(-1865792138);
                z47.j(qheVar instanceof phe, x340Var30, 0);
                x340Var30.r(false);
                if (qheVar instanceof phe) {
                    x340 x340Var31 = x340Var29;
                    x340Var31.i0(-1865676477);
                    if ((((iIntValue14 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var10)) && (iIntValue14 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT16 = x340Var31.T();
                    if (z2 || objT16 == fkj0.X) {
                        objT16 = new gob(iu30Var10, (byte) 12);
                        x340Var31.s0(objT16);
                    }
                    jmo1.a(0, (Function0) objT16, x340Var31, (qim0) null);
                    x340Var31.r(false);
                } else {
                    x340 x340Var32 = x340Var29;
                    x340Var32.i0(-1865609207);
                    x340Var32.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
