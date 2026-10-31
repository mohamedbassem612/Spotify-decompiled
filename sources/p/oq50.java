package p;

import android.graphics.Color;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oq50 extends hab0 implements vu30 {
    public static final oq50 N0;
    public static final oq50 O0;
    public static final oq50 P0;
    public static final oq50 Q0;
    public static final oq50 R0;
    public static final oq50 S0;
    public static final oq50 T0;
    public static final oq50 U0;
    public static final oq50 V0;
    public static final oq50 W0;
    public static final oq50 X;
    public static final oq50 X0;
    public static final oq50 Y;
    public static final oq50 Y0;
    public static final oq50 Z;
    public static final oq50 Z0;
    public static final oq50 a1;
    public static final oq50 b;
    public static final oq50 b1;
    public static final oq50 c;
    public static final oq50 c1;
    public static final oq50 d;
    public static final oq50 d1;
    public static final oq50 e;
    public static final oq50 e1;
    public static final oq50 f;
    public static final oq50 g;
    public static final oq50 h;
    public static final oq50 i;
    public static final oq50 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new oq50(i2, (byte) 0);
        c = new oq50(i2, (byte) 1);
        d = new oq50(i2, (byte) 2);
        e = new oq50(i2, (byte) 3);
        f = new oq50(i2, (byte) 4);
        g = new oq50(i2, (byte) 5);
        h = new oq50(i2, (byte) 6);
        i = new oq50(i2, (byte) 7);
        t = new oq50(i2, (byte) 8);
        X = new oq50(i2, (byte) 9);
        Y = new oq50(i2, (byte) 10);
        Z = new oq50(i2, (byte) 11);
        N0 = new oq50(i2, (byte) 12);
        O0 = new oq50(i2, (byte) 13);
        P0 = new oq50(i2, (byte) 14);
        Q0 = new oq50(i2, (byte) 15);
        R0 = new oq50(i2, (byte) 16);
        S0 = new oq50(i2, (byte) 17);
        T0 = new oq50(i2, (byte) 18);
        U0 = new oq50(i2, (byte) 19);
        V0 = new oq50(i2, (byte) 20);
        W0 = new oq50(i2, (byte) 21);
        X0 = new oq50(i2, (byte) 22);
        Y0 = new oq50(i2, (byte) 23);
        Z0 = new oq50(i2, (byte) 24);
        a1 = new oq50(i2, (byte) 25);
        b1 = new oq50(i2, (byte) 26);
        c1 = new oq50(i2, (byte) 27);
        d1 = new oq50(i2, (byte) 28);
        e1 = new oq50(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq50(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jo70 jo70Var;
        f7l1 f7l1Var;
        String str;
        rz50 rz50Var;
        rz50 rz50Var2;
        goj0 goj0VarA;
        xkk1 xkk1Var;
        rz50 rz50Var3;
        mq70 mq70Var;
        up70 up70VarA;
        long j;
        byte b2 = this.a;
        vp70 vp70Var = vp70.d;
        rz50 rz50Var4 = "";
        boolean z = false;
        rz50 rz50VarC = null;
        switch (b2) {
            case 0:
                mq50 mq50Var = (mq50) obj;
                i1r i1rVar = (k1r) obj2;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null && (jo70Var = (jo70) i1rVar2.a) != null) {
                    rz50VarC = jzn1.C(jo70Var);
                }
                if (rz50VarC == null) {
                    rz50VarC = z6x.a;
                }
                return new nq50(rz50VarC, mq50Var.a);
            case 1:
                f7l1 f7l1Var2 = (f7l1) obj;
                rz50 rz50Var5 = f7l1Var2 != null ? f7l1Var2.a : null;
                rz50VarC = rz50Var5 instanceof y6l1 ? (y6l1) rz50Var5 : null;
                return rz50VarC != null ? new b7e0("artist_page:entity_explorer", rz50VarC) : c7e0.a;
            case 2:
                String str2 = (String) obj;
                i1r i1rVar3 = (k1r) obj2;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar4 != null && (f7l1Var = (f7l1) i1rVar4.a) != null) {
                    rz50VarC = f7l1Var.a;
                }
                return new ka10(str2, rz50VarC instanceof y6l1);
            case 3:
                h3j1 h3j1Var = (h3j1) obj;
                yv50 yv50Var = (yv50) obj2;
                a7q0 a7q0Var = yv50Var.a;
                uxn uxnVar = yv50Var.b;
                pn30 pn30Var = yv50Var.c;
                return new xv50(h3j1Var.a, yv50Var.d && p2o1.D(h3j1Var, a7q0Var, uxnVar, pn30Var), h0p1.s(h3j1Var, a7q0Var, uxnVar), h0p1.t(pn30Var), h0p1.r(h3j1Var, uxnVar));
            case 4:
                uz50 uz50Var = (uz50) obj2;
                String str3 = ((sz50) obj).a;
                jo70 jo70Var2 = uz50Var.a;
                if (jo70Var2 == null || (str = jo70Var2.a) == null) {
                    str = "";
                }
                xkk1 xkk1Var2 = uz50Var.b;
                if (xkk1Var2 != null) {
                    mq70 mq70Var2 = xkk1Var2.a;
                    up70 up70VarA2 = mq70Var2.a(vp70Var);
                    if (up70VarA2 != null && (rz50Var = up70VarA2.a.a) != null) {
                        rz50Var4 = rz50Var;
                    }
                    pp70 pp70Var = mq70Var2.b;
                    u7h u7hVar = pp70Var != null ? new u7h(pp70Var.b.a.c) : null;
                    rz50VarC = new rz50(u7hVar != null ? Integer.valueOf(Color.parseColor(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(z4p1.G(u7hVar.a))}, 1)))) : null, rz50Var4);
                }
                return new tz50(str3, str, rz50VarC);
            case 5:
                return new uz50((jo70) obj, (xkk1) obj2);
            case 6:
                j060 j060Var = (j060) obj;
                h060 h060Var = (h060) obj2;
                String str4 = j060Var.a;
                String str5 = j060Var.b;
                hoj0 hoj0VarC = h060Var.a.c(xkk1.class, str4);
                if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (xkk1Var = (xkk1) goj0VarA.a) == null) {
                    rz50Var2 = null;
                } else {
                    mq70 mq70Var3 = xkk1Var.a;
                    up70 up70VarA3 = mq70Var3.a(vp70Var);
                    if (up70VarA3 != null && (rz50Var3 = up70VarA3.a.a) != null) {
                        rz50Var4 = rz50Var3;
                    }
                    pp70 pp70Var2 = mq70Var3.b;
                    u7h u7hVar2 = pp70Var2 != null ? new u7h(pp70Var2.b.a.c) : null;
                    rz50Var2 = new rz50(u7hVar2 != null ? Integer.valueOf(Color.parseColor(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(z4p1.G(u7hVar2.a))}, 1)))) : null, rz50Var4);
                }
                return new n060(str4, str5, rz50Var2, j060Var.c, h060Var.b);
            case 7:
                return (o060) obj2;
            case 8:
                return Boolean.valueOf(((z360) obj).equals((z360) obj2));
            case 9:
                return null;
            case 10:
                return zso1.c0(((wer0) obj).c, (op80) obj2);
            case 11:
                String str6 = (String) obj;
                return ((Number) obj2).intValue() == 0 ? new jh5(jd0.y, str6) : new jh5(jd0.D, new ouc0(str6));
            case 12:
                ms31 ms31Var = (ms31) obj2;
                j3r j3rVarA = ms31Var.a(1);
                if (j3rVarA instanceof i3r) {
                    return i3r.a;
                }
                if (!(j3rVarA instanceof j3r)) {
                    if (j3rVarA instanceof h3r) {
                        return ms31Var.a(0);
                    }
                    eg.o();
                    return null;
                }
                Set<jrc0> set = (Set) j3rVarA.a;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (jrc0 jrc0Var : set) {
                        if (!u890.j(jrc0Var, sqc0.a) && !u890.j(jrc0Var, uqc0.a) && !u890.j(jrc0Var, wqc0.a) && !u890.j(jrc0Var, xqc0.a) && !u890.j(jrc0Var, yqc0.a) && !u890.j(jrc0Var, tqc0.a)) {
                            if (jrc0Var instanceof jrc0) {
                                if (!ihc1.y0(jrc0Var.a)) {
                                }
                            } else if (!u890.j(jrc0Var, pqc0.a) && !u890.j(jrc0Var, vqc0.a) && !u890.j(jrc0Var, zqc0.a) && !u890.j(jrc0Var, brc0.a) && !u890.j(jrc0Var, crc0.a) && !u890.j(jrc0Var, drc0.a) && !u890.j(jrc0Var, erc0.a) && !u890.j(jrc0Var, frc0.a) && !u890.j(jrc0Var, grc0.a) && !u890.j(jrc0Var, krc0.a) && !u890.j(jrc0Var, lrc0.a) && !u890.j(jrc0Var, mrc0.a) && !u890.j(jrc0Var, nrc0.a) && !(jrc0Var instanceof qqc0) && !(jrc0Var instanceof arc0) && !(jrc0Var instanceof hrc0) && !(jrc0Var instanceof irc0)) {
                                eg.o();
                                return null;
                            }
                            return new j3r(cm90.d);
                        }
                    }
                }
                return ms31Var.a(0);
            case 13:
                return new ab60((srt0) obj2, (sa60) obj);
            case 14:
                return Next.h(new nb60((mb60) obj, ((nb60) obj2).b));
            case 15:
                return First.b(new nb60((mb60) obj, ((nb60) obj2).b));
            case 16:
                o910 o910Var = (o910) obj2;
                return new rd60((qd60) obj, o910Var.a, o910Var.b);
            case 17:
                te60 te60Var = (te60) obj;
                i1r i1rVar5 = (k1r) obj2;
                if (!(i1rVar5 instanceof i1r)) {
                    return epo1.I(te60Var);
                }
                qe60 qe60Var = (qe60) i1rVar5.a;
                gw81 gw81Var = qe60Var.a;
                String str7 = gw81Var.d;
                xkk1 xkk1Var3 = qe60Var.b;
                o3r o3rVar = se60.a;
                if (xkk1Var3 != null && (mq70Var = xkk1Var3.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    rz50VarC = up70VarA.a.a;
                }
                rz50Var4 = rz50VarC != null ? rz50VarC : "";
                Set set2 = s4b1.f;
                return new me60(te60Var.a, str7, te60Var.b, new cu70(new j47(uic.g(str7, blc0.u1) ? new l07(new g07(rz50Var4), false) : new e17(new g07(rz50Var4, yz6.d)), x47.a), gw81Var.b, gw81Var.c, gw81Var.h, str7, te60Var.c, se60.a(qe60Var), 272));
            case 18:
                return Next.h((zh60) obj2);
            case 19:
                return First.c((zh60) obj2, Collections.singleton(ji60.a));
            case 20:
                return new u7h(so60.b);
            case 21:
                long jT = ((afx) obj).d.b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        jT = z4p1.t(jT, so60.c);
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(jT);
            case 22:
                return new u7h(((afx) obj).b.a);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    j = u7h.j;
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    j = u7h.j;
                } else {
                    j = so60.c;
                }
                return new u7h(j);
            case 24:
                return new u7h(((afx) obj).b.a);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new u7h(so60.b);
            case 26:
                return Integer.valueOf(((Number) obj).intValue());
            case 27:
                pp90 pp90Var = (pp90) obj;
                pp90 pp90Var2 = (pp90) obj2;
                if (u890.j(pp90Var.a, pp90Var2.a) && u890.j(pp90Var.d.a, pp90Var2.d.a)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 28:
                return (dw60) obj2;
            default:
                return (ww60) obj2;
        }
    }
}
