package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d4r extends hab0 implements iu30 {
    public static final d4r N0;
    public static final d4r O0;
    public static final d4r P0;
    public static final d4r Q0;
    public static final d4r R0;
    public static final d4r S0;
    public static final d4r T0;
    public static final d4r U0;
    public static final d4r V0;
    public static final d4r W0;
    public static final d4r X;
    public static final d4r X0;
    public static final d4r Y;
    public static final d4r Y0;
    public static final d4r Z;
    public static final d4r Z0;
    public static final d4r a1;
    public static final d4r b;
    public static final d4r b1;
    public static final d4r c;
    public static final d4r c1;
    public static final d4r d;
    public static final d4r d1;
    public static final d4r e;
    public static final d4r e1;
    public static final d4r f;
    public static final d4r g;
    public static final d4r h;
    public static final d4r i;
    public static final d4r t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new d4r(i2, (byte) 0);
        c = new d4r(i2, (byte) 1);
        d = new d4r(i2, (byte) 2);
        e = new d4r(i2, (byte) 3);
        f = new d4r(i2, (byte) 4);
        g = new d4r(i2, (byte) 5);
        h = new d4r(i2, (byte) 6);
        i = new d4r(i2, (byte) 7);
        t = new d4r(i2, (byte) 8);
        X = new d4r(i2, (byte) 9);
        Y = new d4r(i2, (byte) 10);
        Z = new d4r(i2, (byte) 11);
        N0 = new d4r(i2, (byte) 12);
        O0 = new d4r(i2, (byte) 13);
        P0 = new d4r(i2, (byte) 14);
        Q0 = new d4r(i2, (byte) 15);
        R0 = new d4r(i2, (byte) 16);
        S0 = new d4r(i2, (byte) 17);
        T0 = new d4r(i2, (byte) 18);
        U0 = new d4r(i2, (byte) 19);
        V0 = new d4r(i2, (byte) 20);
        W0 = new d4r(i2, (byte) 21);
        X0 = new d4r(i2, (byte) 22);
        Y0 = new d4r(i2, (byte) 23);
        Z0 = new d4r(i2, (byte) 24);
        a1 = new d4r(i2, (byte) 25);
        b1 = new d4r(i2, (byte) 26);
        c1 = new d4r(i2, (byte) 27);
        d1 = new d4r(i2, (byte) 28);
        e1 = new d4r(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4r(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        mq70 mq70Var;
        byte b2 = this.a;
        List list = z6x.a;
        boolean z = true;
        String str2 = null;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 1:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 3:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 5:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case 7:
                if (!(obj instanceof l1z) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return (String) obj;
            case 9:
                return (String) obj;
            case 10:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 12:
                if (!(obj instanceof l1z) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
            case 14:
                return ((uv11) obj).a;
            case 15:
                return ((uv11) obj).a;
            case 16:
                return ((uv11) obj).a;
            case 17:
                return ((uv11) obj).a;
            case 18:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof jo70) {
                        arrayList.add(obj2);
                    }
                }
                jo70 jo70Var = (jo70) o7h.s0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof xkk1) {
                        arrayList2.add(obj3);
                    }
                }
                xkk1 xkk1Var = (xkk1) o7h.s0(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof hll) {
                        arrayList3.add(obj4);
                    }
                }
                hll hllVar = (hll) o7h.s0(arrayList3);
                if (jo70Var == null) {
                    return r6g1.a;
                }
                io70 io70Var = jo70Var.e;
                if (io70Var == null || (str = io70Var.a) == null) {
                    str = "";
                }
                xn70 xn70Var = new xn70(str, (String) null, 4, (String) null);
                String str3 = jo70Var.a;
                List list3 = hllVar != null ? hllVar.b : null;
                if (list3 != null) {
                    list = list3;
                }
                c380 c380VarA = mqo1.A(list);
                if (xkk1Var != null && (mq70Var = xkk1Var.b) != null) {
                    o3r o3rVar = e4r.a;
                    up70 up70VarA = mq70Var.a(vp70.b);
                    if (up70VarA != null) {
                        str2 = up70VarA.a.a;
                    }
                }
                return new q6g1(xn70Var, new bv11(str3, (String) null, (Long) null, (Long) null, (u380) null, 0, false, c380VarA, (h540) null, (vno1) null, (c380) null, new sz6(str2, u37.a), false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67106686));
            case 19:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 21:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 27:
                return j82.C();
            case 28:
                return list;
            default:
                b261.c((e261) obj);
                return rih1.a;
        }
    }
}
