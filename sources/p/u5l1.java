package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u5l1 extends hab0 implements vu30 {
    public static final u5l1 N0;
    public static final u5l1 O0;
    public static final u5l1 P0;
    public static final u5l1 Q0;
    public static final u5l1 R0;
    public static final u5l1 S0;
    public static final u5l1 T0;
    public static final u5l1 U0;
    public static final u5l1 V0;
    public static final u5l1 W0;
    public static final u5l1 X;
    public static final u5l1 X0;
    public static final u5l1 Y;
    public static final u5l1 Y0;
    public static final u5l1 Z;
    public static final u5l1 Z0;
    public static final u5l1 a1;
    public static final u5l1 b;
    public static final u5l1 b1;
    public static final u5l1 c;
    public static final u5l1 c1;
    public static final u5l1 d;
    public static final u5l1 d1;
    public static final u5l1 e;
    public static final u5l1 e1;
    public static final u5l1 f;
    public static final u5l1 g;
    public static final u5l1 h;
    public static final u5l1 i;
    public static final u5l1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new u5l1(i2, (byte) 0);
        c = new u5l1(i2, (byte) 1);
        d = new u5l1(i2, (byte) 2);
        e = new u5l1(i2, (byte) 3);
        f = new u5l1(i2, (byte) 4);
        g = new u5l1(i2, (byte) 5);
        h = new u5l1(i2, (byte) 6);
        i = new u5l1(i2, (byte) 7);
        t = new u5l1(i2, (byte) 8);
        X = new u5l1(i2, (byte) 9);
        Y = new u5l1(i2, (byte) 10);
        Z = new u5l1(i2, (byte) 11);
        N0 = new u5l1(i2, (byte) 12);
        O0 = new u5l1(i2, (byte) 13);
        P0 = new u5l1(i2, (byte) 14);
        Q0 = new u5l1(i2, (byte) 15);
        R0 = new u5l1(i2, (byte) 16);
        S0 = new u5l1(i2, (byte) 17);
        T0 = new u5l1(i2, (byte) 18);
        U0 = new u5l1(i2, (byte) 19);
        V0 = new u5l1(i2, (byte) 20);
        W0 = new u5l1(i2, (byte) 21);
        X0 = new u5l1(i2, (byte) 22);
        Y0 = new u5l1(i2, (byte) 23);
        Z0 = new u5l1(i2, (byte) 24);
        a1 = new u5l1(i2, (byte) 25);
        b1 = new u5l1(i2, (byte) 26);
        c1 = new u5l1(i2, (byte) 27);
        d1 = new u5l1(i2, (byte) 28);
        e1 = new u5l1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5l1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        s7l1 s7l1Var;
        zal1 zal1Var;
        w7l1 w7l1Var;
        afx afxVar;
        kjj1 jjj1Var;
        long j;
        wsk wskVar;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new s5l1((f7l1) obj, (xkk1) obj2);
            case 1:
                j6l1 j6l1Var = (j6l1) obj;
                String str = j6l1Var.a;
                ArrayList<bbl1> arrayListO0 = o7h.o0((List) u890.k((k1r) obj2, (d0r) null, (n4r) null));
                ArrayList arrayList = new ArrayList();
                for (bbl1 bbl1Var : arrayListO0) {
                    abl1 abl1Var = bbl1Var.d;
                    if (abl1Var != null) {
                        String str2 = abl1Var.a;
                        int iC = l1d.C(abl1Var.b);
                        if (iC == 0) {
                            jjj1Var = new jjj1(abl1Var.c, abl1Var.d, str2);
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            jjj1Var = new kjj1(abl1Var.c, abl1Var.d, str2);
                        }
                        s7l1Var = new s7l1(jjj1Var, "watch-feed-destinations-video-card", true);
                    } else {
                        s7l1Var = null;
                    }
                    String str3 = (s7l1Var == null ? (zal1Var = bbl1Var.e) == null : (zal1Var = bbl1Var.c) == null) ? null : zal1Var.a;
                    Double d2 = bbl1Var.f;
                    Float fValueOf = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
                    if (s7l1Var != null) {
                        String str4 = bbl1Var.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str5 = str3;
                        zal1 zal1Var2 = bbl1Var.h;
                        t7l1 t7l1Var = new t7l1(new h8l1(str4, (String) null, (String) null, "", str5, (k4m) null, fValueOf, zal1Var2 != null ? zal1Var2.a : null, 228), s7l1Var);
                        String str6 = bbl1Var.a;
                        String str7 = j6l1Var.b;
                        yal1 yal1Var = bbl1Var.i;
                        w7l1Var = new w7l1(t7l1Var, str6, str7, str6, str6, (yal1Var == null || (afxVar = yal1Var.c) == null) ? null : new u7h(afxVar.b.b), 32);
                    } else {
                        w7l1Var = null;
                    }
                    if (w7l1Var != null) {
                        arrayList.add(w7l1Var);
                    }
                }
                return new k6l1(str, arrayList, j6l1Var.d);
            case 2:
                icx icxVar = ((afx) obj).a;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = icxVar.c;
                } else if (iOrdinal == 1) {
                    j = icxVar.e;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    j = icxVar.d;
                }
                return new u7h(j);
            case 3:
                return new u7h(((afx) obj).b.a);
            case 4:
                return ((ral1) obj).b;
            case 5:
                return ((r6l1) obj).b;
            case 6:
                return null;
            case 7:
                return ((l5l1) obj).b;
            case 8:
                return ((q6l1) obj).b;
            case 9:
                ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                return Boolean.TRUE;
            case 10:
                ((Number) obj2).intValue();
                return rih1Var;
            case 11:
                return (zgm0) obj;
            case 12:
                ft40 ft40Var = (ft40) obj2;
                return ft40Var instanceof q60 ? ft40Var : obj;
            case 13:
                return obj;
            case 14:
                ft40 ft40Var2 = (ft40) obj2;
                return ft40Var2 instanceof iql1 ? ft40Var2 : obj;
            case 15:
                ft40 ft40Var3 = (ft40) obj2;
                return ft40Var3 instanceof f660 ? ft40Var3 : obj;
            case 16:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                eg.o();
                return null;
            case 17:
                return rih1Var;
            case 18:
                return null;
            case 19:
                return new wxl1(((vxl1) obj).a, ((Boolean) obj2).booleanValue());
            case 20:
                pla1 pla1Var2 = (rla1) obj2;
                if (pla1Var2 instanceof pla1) {
                    return new h3r(new d3r(pla1Var2.a.toString()));
                }
                if (pla1Var2 instanceof qla1) {
                    return new j3r(((qla1) pla1Var2).a);
                }
                eg.o();
                return null;
            case 21:
                return new pyl1((qxc0) obj, ((Boolean) obj2).booleanValue());
            case 22:
                return (mq51) obj2;
            case 23:
                return (d5m1) obj2;
            case 24:
                return (s5m1) obj2;
            case 25:
                return new u7h(((afx) obj).a.b.a());
            case 26:
                ba10 ba10Var = (ba10) obj2;
                m8a m8aVar = ba10Var.a;
                String str8 = m8aVar.i;
                String str9 = m8aVar.h;
                String str10 = m8aVar.j;
                String str11 = m8aVar.k;
                try {
                    wskVar = new wsk(s6m1.a(str8), s6m1.a(str9), s6m1.a(str10), s6m1.a(str11));
                    break;
                } catch (Exception e2) {
                    StringBuilder sbN = gvg.n("\n      Failed to parse colors in WrappedBannerElement, using fallbacks.\n      Colors: bg=", str8, ", text=", str9, ",\n      ctaBg=");
                    sbN.append(str10);
                    sbN.append(", ctaText=");
                    sbN.append(str11);
                    sbN.append("\n    ");
                    Logger.l(e2, jhc1.J(sbN.toString()), new Object[0]);
                    wskVar = s6m1.a;
                }
                return new c7m1(m8aVar.a, m8aVar.b, ba10Var.b, ba10Var.c, ba10Var.d, ba10Var.e, ba10Var.f, ba10Var.g, wskVar.a, wskVar.b, m8aVar.c, m8aVar.l, wskVar.d, wskVar.c, ba10Var.h);
            case 27:
                return ((r6m1) obj).c;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return Next.j();
            default:
                return Next.j();
        }
    }
}
