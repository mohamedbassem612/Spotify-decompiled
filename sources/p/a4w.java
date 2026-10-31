package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a4w extends hab0 implements iu30 {
    public static final a4w N0;
    public static final a4w O0;
    public static final a4w P0;
    public static final a4w Q0;
    public static final a4w R0;
    public static final a4w S0;
    public static final a4w T0;
    public static final a4w U0;
    public static final a4w V0;
    public static final a4w W0;
    public static final a4w X;
    public static final a4w X0;
    public static final a4w Y;
    public static final a4w Y0;
    public static final a4w Z;
    public static final a4w Z0;
    public static final a4w a1;
    public static final a4w b;
    public static final a4w b1;
    public static final a4w c;
    public static final a4w c1;
    public static final a4w d;
    public static final a4w d1;
    public static final a4w e;
    public static final a4w e1;
    public static final a4w f;
    public static final a4w g;
    public static final a4w h;
    public static final a4w i;
    public static final a4w t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new a4w(i2, (byte) 0);
        c = new a4w(i2, (byte) 1);
        d = new a4w(i2, (byte) 2);
        e = new a4w(i2, (byte) 3);
        f = new a4w(i2, (byte) 4);
        g = new a4w(i2, (byte) 5);
        h = new a4w(i2, (byte) 6);
        i = new a4w(i2, (byte) 7);
        t = new a4w(i2, (byte) 8);
        X = new a4w(i2, (byte) 9);
        Y = new a4w(i2, (byte) 10);
        Z = new a4w(i2, (byte) 11);
        N0 = new a4w(i2, (byte) 12);
        O0 = new a4w(i2, (byte) 13);
        P0 = new a4w(i2, (byte) 14);
        Q0 = new a4w(i2, (byte) 15);
        R0 = new a4w(i2, (byte) 16);
        S0 = new a4w(i2, (byte) 17);
        T0 = new a4w(i2, (byte) 18);
        U0 = new a4w(i2, (byte) 19);
        V0 = new a4w(i2, (byte) 20);
        W0 = new a4w(i2, (byte) 21);
        X0 = new a4w(i2, (byte) 22);
        Y0 = new a4w(i2, (byte) 23);
        Z0 = new a4w(i2, (byte) 24);
        a1 = new a4w(i2, (byte) 25);
        b1 = new a4w(i2, (byte) 26);
        c1 = new a4w(i2, (byte) 27);
        d1 = new a4w(i2, (byte) 28);
        e1 = new a4w(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4w(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                b261.d((e261) obj);
                return rih1.a;
            case 1:
                return Double.valueOf(((Number) obj).doubleValue());
            case 2:
                return u4w.a;
            case 3:
                return new qvc0(((r4w) obj).a, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 4:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new uv11(((pvc0) it.next()).c, "", (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252));
                }
                return arrayList;
            case 5:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 7:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 9:
                return Boolean.valueOf(obj instanceof List);
            case 10:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 11:
                return ((uv11) obj).a;
            case 12:
                return ((uv11) obj).a;
            case 13:
                return new e5w("", null, null, null);
            case 14:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 16:
                return (String) obj;
            case 17:
                return (xkk1) obj;
            case 18:
                return n5w.a;
            case 19:
                return new qvc0(((k5w) obj).a, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 20:
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new uv11(((pvc0) it2.next()).c, "", (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252));
                }
                return arrayList2;
            case 21:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 27:
                return Boolean.valueOf(obj instanceof List);
            case 28:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            default:
                return ((uv11) obj).a;
        }
    }
}
