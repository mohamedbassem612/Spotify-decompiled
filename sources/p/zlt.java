package p;

import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zlt extends hab0 implements iu30 {
    public static final zlt N0;
    public static final zlt O0;
    public static final zlt P0;
    public static final zlt Q0;
    public static final zlt R0;
    public static final zlt S0;
    public static final zlt T0;
    public static final zlt U0;
    public static final zlt V0;
    public static final zlt W0;
    public static final zlt X;
    public static final zlt X0;
    public static final zlt Y;
    public static final zlt Y0;
    public static final zlt Z;
    public static final zlt Z0;
    public static final zlt a1;
    public static final zlt b;
    public static final zlt b1;
    public static final zlt c;
    public static final zlt c1;
    public static final zlt d;
    public static final zlt d1;
    public static final zlt e;
    public static final zlt e1;
    public static final zlt f;
    public static final zlt g;
    public static final zlt h;
    public static final zlt i;
    public static final zlt t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zlt(i2, (byte) 0);
        c = new zlt(i2, (byte) 1);
        d = new zlt(i2, (byte) 2);
        e = new zlt(i2, (byte) 3);
        f = new zlt(i2, (byte) 4);
        g = new zlt(i2, (byte) 5);
        h = new zlt(i2, (byte) 6);
        i = new zlt(i2, (byte) 7);
        t = new zlt(i2, (byte) 8);
        X = new zlt(i2, (byte) 9);
        Y = new zlt(i2, (byte) 10);
        Z = new zlt(i2, (byte) 11);
        N0 = new zlt(i2, (byte) 12);
        O0 = new zlt(i2, (byte) 13);
        P0 = new zlt(i2, (byte) 14);
        Q0 = new zlt(i2, (byte) 15);
        R0 = new zlt(i2, (byte) 16);
        S0 = new zlt(i2, (byte) 17);
        T0 = new zlt(i2, (byte) 18);
        U0 = new zlt(i2, (byte) 19);
        V0 = new zlt(i2, (byte) 20);
        W0 = new zlt(i2, (byte) 21);
        X0 = new zlt(i2, (byte) 22);
        Y0 = new zlt(i2, (byte) 23);
        Z0 = new zlt(i2, (byte) 24);
        a1 = new zlt(i2, (byte) 25);
        b1 = new zlt(i2, (byte) 26);
        c1 = new zlt(i2, (byte) 27);
        d1 = new zlt(i2, (byte) 28);
        e1 = new zlt(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlt(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01b0  */
    public final Object invoke(Object obj) {
        f0u f0uVar;
        Long lD0;
        bb71 bb71Var;
        u771 u771Var;
        t771 t771Var;
        wa71 wa71Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                return Boolean.valueOf(obj instanceof gw81);
            case 3:
                if (obj != null) {
                    return (gw81) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.simplecardtrait.SimpleCardTrait");
                return null;
            case 4:
                zv70 zv70Var = (zv70) obj;
                String str2 = zv70Var.a;
                String str3 = zv70Var.b;
                String str4 = zv70Var.c;
                List list = zv70Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new tlt((String) it.next()));
                }
                return new sv70(str2, str3, str4, arrayList);
            case 5:
                bw70 bw70Var = (bw70) obj;
                return new hv70(bw70Var.a, new hvl1(bw70Var.b, 254, (String) null, (String) null, false, (String) null), bw70Var.c, false, (n1x) null, 112);
            case 6:
                return alk1.c(((bw70) obj).c);
            case 7:
                qox0 qox0Var = (qox0) obj;
                return new xnx0(qox0Var.a, qox0Var.b, (x360) null, fmt.a);
            case 8:
                hk51 hk51Var = (hk51) obj;
                return new bk51(hk51Var.a, hk51Var.b, hk51Var.c);
            case 9:
                return new dnt((wl71) obj);
            case 10:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 11:
                ((xas) obj).a(Y, qlt.g);
                return rih1Var;
            case 12:
                jcl1 jcl1Var = (jcl1) obj;
                return new j6l1(jcl1Var.a, jcl1Var.b, jcl1Var.d, new hvl1(jcl1Var.c, 254, (String) null, (String) null, false, (String) null));
            case 13:
                return ((ContextTrack) obj).uri();
            case 14:
                return new bqt(((aqt) obj).a, z6x.a);
            case 15:
                b261.d((e261) obj);
                return rih1Var;
            case 16:
                return "spotify:internal:permissions-location-request";
            case 17:
                return Boolean.valueOf(!((e2l) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(!((e2l) obj).v);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(!ihc1.y0(((e2l) obj).o));
            case 20:
                e2l e2lVar = (e2l) obj;
                String str5 = e2lVar.o;
                String str6 = e2lVar.n;
                String str7 = e2lVar.q;
                String strName = e2lVar.r.name();
                for (Object obj3 : f0u.T0) {
                    if (nhc1.S(((f0u) obj3).name(), strName, true)) {
                        obj2 = obj3;
                        f0uVar = (f0u) obj2;
                        if (f0uVar == null) {
                            f0uVar = f0u.a;
                        }
                        return new jql1(str5, str6, str7, f0uVar);
                    }
                }
                f0uVar = (f0u) obj2;
                if (f0uVar == null) {
                    f0uVar = f0u.a;
                }
                return new jql1(str5, str6, str7, f0uVar);
            case 21:
                return Boolean.valueOf(((rxt) obj).a);
            case 22:
                List listQ0 = ihc1.Q0((String) obj, new String[]{"\t"}, 0, 6);
                if ((listQ0.size() != 3 && listQ0.size() != 7) || (lD0 = nhc1.d0(10, (String) listQ0.get(0))) == null) {
                    return null;
                }
                long jLongValue = lD0.longValue();
                if (((CharSequence) listQ0.get(1)).length() == 0 || ((CharSequence) listQ0.get(2)).length() == 0) {
                    return null;
                }
                String str8 = (String) listQ0.get(1);
                String str9 = (String) listQ0.get(2);
                String str10 = (String) o7h.t0(3, listQ0);
                String str11 = (str10 == null || str10.length() <= 0) ? null : str10;
                String str12 = (String) o7h.t0(4, listQ0);
                String str13 = (str12 == null || str12.length() <= 0) ? null : str12;
                String str14 = (String) o7h.t0(5, listQ0);
                String str15 = (str14 == null || str14.length() <= 0) ? null : str14;
                String str16 = (String) o7h.t0(6, listQ0);
                return new dos0(str8, jLongValue, str9, str11, str13, str15, (str16 == null || str16.length() <= 0) ? null : str16);
            case 23:
                dos0 dos0Var = (dos0) obj;
                Long lValueOf = Long.valueOf(dos0Var.b);
                String str17 = dos0Var.a;
                String str18 = dos0Var.c;
                String str19 = dos0Var.d;
                String str20 = str19 == null ? "" : str19;
                String str21 = dos0Var.e;
                String str22 = str21 == null ? "" : str21;
                String str23 = dos0Var.f;
                String str24 = str23 == null ? "" : str23;
                String str25 = dos0Var.g;
                return o7h.y0(p7h.M(new Object[]{lValueOf, str17, str18, str20, str22, str24, str25 == null ? "" : str25}), "\t", (String) null, (String) null, (iu30) null, 62);
            case 24:
                return new czk0((i3l0) obj, 1);
            case 25:
                return ((czk0) obj).e();
            case 26:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 27:
                fl71 fl71Var = ((pl71) obj).f;
                fl71 fl71Var2 = fl71Var instanceof fl71 ? fl71Var : null;
                if (fl71Var2 != null && (bb71Var = (bb71) o7h.s0(fl71Var2.a)) != null && (u771Var = bb71Var.a) != null && (t771Var = u771Var.a) != null && (wa71Var = t771Var.a) != null) {
                    str = wa71Var.a;
                }
                return new s7u(str);
            case 28:
                diu diuVar = (diu) obj;
                biu biuVar = diuVar.c;
                String str26 = biuVar.b;
                return new ziu(false, str26 == null || str26.length() == 0 || biuVar.a.length() == 0, true, false, false, diuVar, -1);
            default:
                return ((lgu) obj).c;
        }
    }
}
