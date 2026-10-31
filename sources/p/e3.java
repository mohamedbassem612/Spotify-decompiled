package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.geometry.Offset;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e3 extends hab0 implements vu30 {
    public static final e3 N0;
    public static final e3 O0;
    public static final e3 P0;
    public static final e3 Q0;
    public static final e3 R0;
    public static final e3 S0;
    public static final e3 T0;
    public static final e3 U0;
    public static final e3 V0;
    public static final e3 W0;
    public static final e3 X;
    public static final e3 X0;
    public static final e3 Y;
    public static final e3 Y0;
    public static final e3 Z;
    public static final e3 Z0;
    public static final e3 a1;
    public static final e3 b;
    public static final e3 b1;
    public static final e3 c;
    public static final e3 c1;
    public static final e3 d;
    public static final e3 d1;
    public static final e3 e;
    public static final e3 e1;
    public static final e3 f;
    public static final e3 g;
    public static final e3 h;
    public static final e3 i;
    public static final e3 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new e3(i2, (byte) 0);
        c = new e3(i2, (byte) 1);
        d = new e3(i2, (byte) 2);
        e = new e3(i2, (byte) 3);
        f = new e3(i2, (byte) 4);
        g = new e3(i2, (byte) 5);
        h = new e3(i2, (byte) 6);
        i = new e3(i2, (byte) 7);
        t = new e3(i2, (byte) 8);
        X = new e3(i2, (byte) 9);
        Y = new e3(i2, (byte) 10);
        Z = new e3(i2, (byte) 11);
        N0 = new e3(i2, (byte) 12);
        O0 = new e3(i2, (byte) 13);
        P0 = new e3(i2, (byte) 14);
        Q0 = new e3(i2, (byte) 15);
        R0 = new e3(i2, (byte) 16);
        S0 = new e3(i2, (byte) 17);
        T0 = new e3(i2, (byte) 18);
        U0 = new e3(i2, (byte) 19);
        V0 = new e3(i2, (byte) 20);
        W0 = new e3(i2, (byte) 21);
        X0 = new e3(i2, (byte) 22);
        Y0 = new e3(i2, (byte) 23);
        Z0 = new e3(i2, (byte) 24);
        a1 = new e3(i2, (byte) 25);
        b1 = new e3(i2, (byte) 26);
        c1 = new e3(i2, (byte) 27);
        d1 = new e3(i2, (byte) 28);
        e1 = new e3(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0176  */
    /* JADX WARN: Code duplicated, block: B:82:0x0192  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        List list;
        String str;
        lax gaxVar;
        Boolean boolValueOf;
        bl0 bl0Var;
        bl0 bl0Var2;
        boolean z;
        byte b2 = this.a;
        lax gaxVar2 = iax.a;
        int i2 = 2;
        boolean z2 = false;
        Object objValueOf = null;
        switch (b2) {
            case 0:
                b3 b3Var = (b3) obj;
                z2 z2Var = (z2) obj2;
                return new c3(b3Var.a, b3Var.b, b3Var.c, z2Var.b, z2Var.a, z2Var.d, z2Var.e, z2Var.c);
            case 1:
                s3 s3Var = (s3) obj;
                return new t3(((r3) obj2).a, s3Var.a, s3Var.b);
            case 2:
                l4 l4Var = (l4) obj;
                m4 m4Var = (m4) obj2;
                m4 m4VarA = m4.a(m4Var, l4Var.a, l4Var.b, l4Var.c, null, null, null, 0, 0, null, 504);
                String str2 = l4Var.a;
                return !u890.j(str2, m4Var.a) ? Next.i(m4VarA, Collections.singleton(new f4(str2))) : Next.h(m4VarA);
            case 3:
                m4 m4Var2 = (m4) obj2;
                return First.c(m4.a(m4Var2, null, null, null, null, null, null, 0, 0, null, 255), Collections.singleton(new f4(m4Var2.a)));
            case 4:
                return new ir((hr) obj);
            case 5:
                return new hs(((Boolean) obj2).booleanValue());
            case 6:
                ls lsVar = (ls) obj;
                return new ms(lsVar.a, lsVar.b, ((Boolean) obj2).booleanValue());
            case 7:
                return (xs) obj2;
            case 8:
                Object objT = jhc1.t((Bundle) obj, "parcelable", xs.class);
                objT.getClass();
                return (Parcelable) objT;
            case 9:
                return new ju(((iu) obj).a, ((Boolean) obj2).booleanValue());
            case 10:
                zc0 zc0Var = (zc0) obj;
                ad0 ad0Var = (ad0) obj2;
                yc0 yc0Var = zc0Var.e;
                if (yc0Var == null || (list = yc0Var.c) == null) {
                    list = ad0Var.b;
                }
                return new ad0(ad0Var.a, list, zc0Var);
            case 11:
                id0 id0Var = (id0) obj;
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (!(pla1Var instanceof qla1)) {
                    eg.o();
                    return null;
                }
                mmr0 mmr0Var = (mmr0) ((qla1) pla1Var).a;
                PlayerState playerState = (PlayerState) mmr0Var.b;
                md0 md0Var = (md0) mmr0Var.a;
                if (!u890.j(md0Var != null ? md0Var.a() : null, id0Var.b)) {
                    i2 = 1;
                } else if (!playerState.isBuffering() && playerState.isPlaying() && !playerState.isPaused()) {
                    i2 = 3;
                }
                return new j3r(new hd0(i2));
            case 12:
                if0 if0Var = (if0) obj;
                lf0 lf0Var = (lf0) obj2;
                if (lf0Var.equals(kf0.a)) {
                    return null;
                }
                if (!(lf0Var instanceof jf0)) {
                    eg.o();
                    return null;
                }
                r6h1 r6h1Var = if0Var.c;
                char c2 = ((jf0) lf0Var).b ? (char) 1 : (char) 2;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-listening-activity-pulse-indicator";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                if (c2 == 1) {
                    str = "animated_pulse";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "static_ring";
                }
                x6h1VarI.b = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 13:
                mj0 mj0Var = (mj0) obj;
                return Next.i(new jk0(mj0Var), Collections.singleton(new bva(mj0Var.a.a)));
            case 14:
                return First.c((jk0) obj2, Collections.singleton(new bva(((mj0) obj).a.a)));
            case 15:
                pk0 pk0Var = (pk0) obj;
                ok0 ok0Var = (ok0) obj2;
                int i3 = pk0Var.a;
                String str3 = pk0Var.b;
                String str4 = pk0Var.c;
                List list2 = pk0Var.e;
                lax laxVar = ok0Var.c;
                Boolean bool = (Boolean) ok0Var.a.a();
                if (u890.j(bool, Boolean.TRUE)) {
                    gaxVar = gaxVar2;
                } else if (u890.j(bool, Boolean.FALSE)) {
                    gaxVar = new gax(2131951819, (String) null);
                } else {
                    if (bool != null) {
                        eg.o();
                        return null;
                    }
                    gaxVar = new gax(2131961689, (String) null);
                }
                ht61 ht61Var = ok0Var.b;
                lax gaxVar3 = new gax(2131961689, (String) null);
                if (!(ht61Var instanceof it61)) {
                    if (!(ht61Var instanceof ht61)) {
                        eg.o();
                        return null;
                    }
                    Integer num = ht61Var.a;
                    gaxVar2 = num != null ? new gax(Integer.valueOf(num.intValue()), (String) null) : gaxVar3;
                }
                return new rk0(i3, str3, str4, list2, jmo1.f(new lax[]{laxVar, gaxVar, gaxVar2}));
            case 16:
                tl0 tl0Var = (tl0) obj;
                sl0 sl0Var = (sl0) obj2;
                lax laxVar2 = tl0Var.d;
                ht61 ht61Var2 = sl0Var.a;
                lax gaxVar4 = new gax(2131961689, (String) null);
                if (!(ht61Var2 instanceof it61)) {
                    if (!(ht61Var2 instanceof ht61)) {
                        eg.o();
                        return null;
                    }
                    Integer num2 = ht61Var2.a;
                    gaxVar2 = num2 != null ? new gax(Integer.valueOf(num2.intValue()), (String) null) : gaxVar4;
                }
                lax laxVarF = jmo1.f(new lax[]{laxVar2, gaxVar2});
                int i4 = tl0Var.a;
                String str5 = tl0Var.b;
                String str6 = tl0Var.c;
                boolean z3 = laxVarF instanceof iax;
                sl0 sl0Var2 = z3 ? sl0Var : null;
                if (sl0Var2 != null) {
                    it61 it61Var = sl0Var2.a;
                    it61 it61Var2 = it61Var instanceof it61 ? it61Var : null;
                    if (it61Var2 == null || (bl0Var2 = (bl0) it61Var2.a) == null) {
                        boolValueOf = null;
                    } else {
                        int iC = l1d.C(i4);
                        if (iC == 0) {
                            int iOrdinal = bl0Var2.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    z = true;
                                } else if (iOrdinal != 2) {
                                    eg.o();
                                    return null;
                                }
                            }
                            z = false;
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            int iOrdinal2 = bl0Var2.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                z = true;
                            } else {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return null;
                                }
                                z = false;
                            }
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                } else {
                    boolValueOf = null;
                }
                if (!z3) {
                    sl0Var = null;
                }
                if (sl0Var != null && (bl0Var = sl0Var.b) != null) {
                    int iC2 = l1d.C(tl0Var.a);
                    if (iC2 == 0) {
                        int iOrdinal3 = bl0Var.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 == 1) {
                                z2 = true;
                            } else if (iOrdinal3 != 2) {
                                eg.o();
                                return null;
                            }
                        }
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return null;
                        }
                        int iOrdinal4 = bl0Var.ordinal();
                        if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                            z2 = true;
                        } else if (iOrdinal4 != 2) {
                            eg.o();
                            return null;
                        }
                    }
                    objValueOf = Boolean.valueOf(z2);
                }
                return new ul0(i4, str5, str6, boolValueOf, objValueOf, laxVarF);
            case 17:
                return (zq0) obj2;
            case 18:
                return (ept0) obj2;
            case 19:
                return (ept0) obj2;
            case 20:
                mmr0 mmr0Var2 = (mmr0) obj2;
                return new nw0((String) mmr0Var2.a, ((Restrictions) mmr0Var2.b).disallowSeekingReasons().isEmpty());
            case 21:
                mmr0 mmr0Var3 = (mmr0) obj2;
                return new nw0((String) mmr0Var3.a, ((Restrictions) mmr0Var3.b).disallowSeekingReasons().isEmpty());
            case 22:
                mmr0 mmr0Var4 = (mmr0) obj2;
                return new sw0((String) mmr0Var4.a, ((Restrictions) mmr0Var4.b).disallowSeekingReasons().isEmpty());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                mmr0 mmr0Var5 = (mmr0) obj2;
                return new sw0((String) mmr0Var5.a, ((Restrictions) mmr0Var5.b).disallowSeekingReasons().isEmpty());
            case 24:
                yvg1 yvg1Var = (yvg1) obj2;
                String str7 = (String) yvg1Var.a;
                Restrictions restrictions = (Restrictions) yvg1Var.b;
                return new t691(str7, restrictions.disallowSkippingPrevReasons().isEmpty() || restrictions.disallowSeekingReasons().isEmpty(), (fvf1) yvg1Var.c);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                yvg1 yvg1Var2 = (yvg1) obj2;
                String str8 = (String) yvg1Var2.a;
                Restrictions restrictions2 = (Restrictions) yvg1Var2.b;
                return new t691(str8, restrictions2.disallowSkippingPrevReasons().isEmpty() || restrictions2.disallowSeekingReasons().isEmpty(), (fvf1) yvg1Var2.c);
            case 26:
                String strF0 = l4o1.f0((ContextTrack) obj2);
                if (strF0 == null) {
                    strF0 = "";
                }
                return new lof1(112, strF0, gx0.g, false);
            case 27:
                return (ez0) obj2;
            case 28:
                long j = ((Offset) obj2).a;
                return rih1.a;
            default:
                return (lf1) obj;
        }
    }
}
