package p;

import android.view.Display;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mr90 extends hab0 implements iu30 {
    public static final mr90 N0;
    public static final mr90 O0;
    public static final mr90 P0;
    public static final mr90 Q0;
    public static final mr90 R0;
    public static final mr90 S0;
    public static final mr90 T0;
    public static final mr90 U0;
    public static final mr90 V0;
    public static final mr90 W0;
    public static final mr90 X;
    public static final mr90 X0;
    public static final mr90 Y;
    public static final mr90 Y0;
    public static final mr90 Z;
    public static final mr90 Z0;
    public static final mr90 a1;
    public static final mr90 b;
    public static final mr90 b1;
    public static final mr90 c;
    public static final mr90 c1;
    public static final mr90 d;
    public static final mr90 d1;
    public static final mr90 e;
    public static final mr90 e1;
    public static final mr90 f;
    public static final mr90 g;
    public static final mr90 h;
    public static final mr90 i;
    public static final mr90 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new mr90(i2, (byte) 0);
        c = new mr90(i2, (byte) 1);
        d = new mr90(i2, (byte) 2);
        e = new mr90(i2, (byte) 3);
        f = new mr90(i2, (byte) 4);
        g = new mr90(i2, (byte) 5);
        h = new mr90(i2, (byte) 6);
        i = new mr90(i2, (byte) 7);
        t = new mr90(i2, (byte) 8);
        X = new mr90(i2, (byte) 9);
        Y = new mr90(i2, (byte) 10);
        Z = new mr90(i2, (byte) 11);
        N0 = new mr90(i2, (byte) 12);
        O0 = new mr90(i2, (byte) 13);
        P0 = new mr90(i2, (byte) 14);
        Q0 = new mr90(i2, (byte) 15);
        R0 = new mr90(i2, (byte) 16);
        S0 = new mr90(i2, (byte) 17);
        T0 = new mr90(i2, (byte) 18);
        U0 = new mr90(i2, (byte) 19);
        V0 = new mr90(i2, (byte) 20);
        W0 = new mr90(i2, (byte) 21);
        X0 = new mr90(i2, (byte) 22);
        Y0 = new mr90(i2, (byte) 23);
        Z0 = new mr90(i2, (byte) 24);
        a1 = new mr90(i2, (byte) 25);
        b1 = new mr90(i2, (byte) 26);
        c1 = new mr90(i2, (byte) 27);
        d1 = new mr90(i2, (byte) 28);
        e1 = new mr90(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr90(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return ((eqc) obj).b(o390.e1);
            case 1:
                return st90.a;
            case 2:
                return rih1Var;
            case 3:
                return rih1Var;
            case 4:
                return qv90.a;
            case 5:
                return mw90.a;
            case 6:
                return kx90.a;
            case 7:
                return o0a0.a;
            case 8:
                return j5a0.a;
            case 9:
                Display display = ((View) obj).getDisplay();
                return Integer.valueOf(display != null ? display.getDisplayId() : 0);
            case 10:
                return new p9a0(l9a0.d, x9a0.d, u9a0.a, 0.0f, false);
            case 11:
                b261.f((e261) obj);
                return rih1Var;
            case 12:
                return jba0.a;
            case 13:
                return wca0.a;
            case 14:
                pwl0 pwl0Var = (pwl0) obj;
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), pwl0Var.a, pwl0Var.b.b, System.currentTimeMillis());
            case 15:
                return vda0.a;
            case 16:
                List list = (List) obj;
                return new Offset((((long) Float.floatToRawIntBits(((Number) list.get(1)).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(((Number) list.get(0)).floatValue())) << 32));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return bna0.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (cxc0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ina0();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((hna0) obj).a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new jna0((jo70) obj);
            case 22:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                l7e0 l7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                String str = j7e0Var != null ? j7e0Var.b : null;
                if (str == null) {
                    str = "";
                }
                return new hna0(str);
            case 25:
                return new tna0((sna0) obj, 3, false, false, false, false);
            case 26:
                return ((ho70) obj).a;
            case 27:
                return ((opa0) obj).a;
            case 28:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                return ((View) obj).getContext();
        }
    }
}
