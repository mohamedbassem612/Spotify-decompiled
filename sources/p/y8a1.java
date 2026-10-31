package p;

import com.spotify.scrollsita.v1.Section;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y8a1 extends hab0 implements iu30 {
    public static final y8a1 N0;
    public static final y8a1 O0;
    public static final y8a1 P0;
    public static final y8a1 Q0;
    public static final y8a1 R0;
    public static final y8a1 S0;
    public static final y8a1 T0;
    public static final y8a1 U0;
    public static final y8a1 V0;
    public static final y8a1 W0;
    public static final y8a1 X;
    public static final y8a1 X0;
    public static final y8a1 Y;
    public static final y8a1 Y0;
    public static final y8a1 Z;
    public static final y8a1 Z0;
    public static final y8a1 a1;
    public static final y8a1 b;
    public static final y8a1 b1;
    public static final y8a1 c;
    public static final y8a1 c1;
    public static final y8a1 d;
    public static final y8a1 d1;
    public static final y8a1 e;
    public static final y8a1 e1;
    public static final y8a1 f;
    public static final y8a1 g;
    public static final y8a1 h;
    public static final y8a1 i;
    public static final y8a1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new y8a1(i2, (byte) 0);
        c = new y8a1(i2, (byte) 1);
        d = new y8a1(i2, (byte) 2);
        e = new y8a1(i2, (byte) 3);
        f = new y8a1(i2, (byte) 4);
        g = new y8a1(i2, (byte) 5);
        h = new y8a1(i2, (byte) 6);
        i = new y8a1(i2, (byte) 7);
        t = new y8a1(i2, (byte) 8);
        X = new y8a1(i2, (byte) 9);
        Y = new y8a1(i2, (byte) 10);
        Z = new y8a1(i2, (byte) 11);
        N0 = new y8a1(i2, (byte) 12);
        O0 = new y8a1(i2, (byte) 13);
        P0 = new y8a1(i2, (byte) 14);
        Q0 = new y8a1(i2, (byte) 15);
        R0 = new y8a1(i2, (byte) 16);
        S0 = new y8a1(i2, (byte) 17);
        T0 = new y8a1(i2, (byte) 18);
        U0 = new y8a1(i2, (byte) 19);
        V0 = new y8a1(i2, (byte) 20);
        W0 = new y8a1(i2, (byte) 21);
        X0 = new y8a1(i2, (byte) 22);
        Y0 = new y8a1(i2, (byte) 23);
        Z0 = new y8a1(i2, (byte) 24);
        a1 = new y8a1(i2, (byte) 25);
        b1 = new y8a1(i2, (byte) 26);
        c1 = new y8a1(i2, (byte) 27);
        d1 = new y8a1(i2, (byte) 28);
        e1 = new y8a1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8a1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof List);
            case 1:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof List);
            case 3:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof List);
            case 5:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof List);
            case 7:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof List);
            case 9:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof List);
            case 11:
                return Boolean.valueOf(obj instanceof qxc0);
            case 12:
                return (k1r) obj;
            case 13:
                return new qvc0(l1d.m("spotify:list:track-samples:", blo1.v(((w8a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 14:
                return new qvc0(l1d.m("spotify:list:track-covers:", blo1.v(((w8a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 15:
                return new qvc0(l1d.m("spotify:list:track-sampled-in:", blo1.v(((w8a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 16:
                return ((w8a1) obj).a;
            case 17:
                return ((w8a1) obj).a;
            case 18:
                return new qvc0(l1d.m("spotify:list:track-samples:", blo1.v(((w8a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 19:
                return new qvc0(l1d.m("spotify:list:track-covers:", blo1.v(((w8a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 20:
                return new qvc0(l1d.m("spotify:list:track-sampled-in:", blo1.v(((w8a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 21:
                return new rxc0(l1d.m("spotify:list:track-covers:", blo1.v(((w8a1) obj).a)));
            case 22:
                return ((w8a1) obj).a;
            case 23:
                return ((w8a1) obj).a;
            case 24:
                lic1 lic1Var = (lic1) obj;
                return new hyf1(lic1Var.a, null, null, pxd0.T(lic1Var.b), "bd5fe6dbdcdc425dae990a4243dc906c", 6);
            case 25:
                iic1 iic1Var = (iic1) obj;
                return new hyf1(iic1Var.a, null, null, pxd0.T(iic1Var.b), "bd5fe6dbdcdc425dae990a4243dc906c", 6);
            case 26:
                lic1 lic1Var2 = (lic1) obj;
                return new hyf1(lic1Var2.a, null, null, pxd0.T(lic1Var2.b), "32f6065c794d4e22b56a19575da09931", 6);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return w7x.a;
            case 28:
                ayo0 ayo0Var = (ayo0) obj;
                return new l7a1(ayo0Var.a, ayo0Var.b);
            default:
                ayo0 ayo0Var2 = (ayo0) obj;
                return new l7a1(ayo0Var2.a, ayo0Var2.b);
        }
    }
}
