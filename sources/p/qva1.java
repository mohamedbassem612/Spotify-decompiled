package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qva1 extends hab0 implements iu30 {
    public static final qva1 N0;
    public static final qva1 O0;
    public static final qva1 P0;
    public static final qva1 Q0;
    public static final qva1 R0;
    public static final qva1 S0;
    public static final qva1 T0;
    public static final qva1 U0;
    public static final qva1 V0;
    public static final qva1 W0;
    public static final qva1 X;
    public static final qva1 X0;
    public static final qva1 Y;
    public static final qva1 Y0;
    public static final qva1 Z;
    public static final qva1 Z0;
    public static final qva1 a1;
    public static final qva1 b;
    public static final qva1 b1;
    public static final qva1 c;
    public static final qva1 c1;
    public static final qva1 d;
    public static final qva1 d1;
    public static final qva1 e;
    public static final qva1 e1;
    public static final qva1 f;
    public static final qva1 g;
    public static final qva1 h;
    public static final qva1 i;
    public static final qva1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qva1(i2, (byte) 0);
        c = new qva1(i2, (byte) 1);
        d = new qva1(i2, (byte) 2);
        e = new qva1(i2, (byte) 3);
        f = new qva1(i2, (byte) 4);
        g = new qva1(i2, (byte) 5);
        h = new qva1(i2, (byte) 6);
        i = new qva1(i2, (byte) 7);
        t = new qva1(i2, (byte) 8);
        X = new qva1(i2, (byte) 9);
        Y = new qva1(i2, (byte) 10);
        Z = new qva1(i2, (byte) 11);
        N0 = new qva1(i2, (byte) 12);
        O0 = new qva1(i2, (byte) 13);
        P0 = new qva1(i2, (byte) 14);
        Q0 = new qva1(i2, (byte) 15);
        R0 = new qva1(i2, (byte) 16);
        S0 = new qva1(i2, (byte) 17);
        T0 = new qva1(i2, (byte) 18);
        U0 = new qva1(i2, (byte) 19);
        V0 = new qva1(i2, (byte) 20);
        W0 = new qva1(i2, (byte) 21);
        X0 = new qva1(i2, (byte) 22);
        Y0 = new qva1(i2, (byte) 23);
        Z0 = new qva1(i2, (byte) 24);
        a1 = new qva1(i2, (byte) 25);
        b1 = new qva1(i2, (byte) 26);
        c1 = new qva1(i2, (byte) 27);
        d1 = new qva1(i2, (byte) 28);
        e1 = new qva1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qva1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                ro7 ro7Var = (ro7) obj;
                if (ro7Var == null) {
                    return null;
                }
                float f2 = (float) ro7Var.a;
                Float fValueOf = Float.valueOf(f2);
                if (f2 > 0.0f) {
                    return fValueOf;
                }
                return null;
            case 2:
                return Boolean.valueOf((obj instanceof ro7) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 4:
                return new vwa1(null, 1, false, false, null, fg91.b);
            case 5:
                String str = ((uwa1) obj).a;
                if (str != null) {
                    return new a2v(str, 1);
                }
                return null;
            case 6:
                return ((uwa1) obj).a;
            case 7:
                return ((uwa1) obj).a;
            case 8:
                return ((uwa1) obj).a;
            case 9:
                return Boolean.valueOf((obj instanceof h2v) || (obj instanceof rih1));
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 11:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 13:
                return Boolean.valueOf((obj instanceof ro7) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 15:
                return Boolean.valueOf((obj instanceof qtt0) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "type";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 22:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.b);
                return videoSurfaceView;
            case 23:
                return new jha1((mr20) obj, (byte) 2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b0b1 b0b1Var = (b0b1) obj;
                return new c0b1(30, b0b1Var.b, (String) null, !b0b1Var.c);
            case 25:
                return new l0b1(true);
            case 26:
                return rih1.a;
            case 27:
                return new y0b1(d1b1.a, (x0b1) obj);
            case 28:
                return Boolean.valueOf(!((Map) obj).isEmpty());
            default:
                return ((l3n1) obj).b();
        }
    }
}
