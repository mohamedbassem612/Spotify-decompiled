package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ppg1 extends hab0 implements iu30 {
    public static final ppg1 N0;
    public static final ppg1 O0;
    public static final ppg1 P0;
    public static final ppg1 Q0;
    public static final ppg1 R0;
    public static final ppg1 S0;
    public static final ppg1 T0;
    public static final ppg1 U0;
    public static final ppg1 V0;
    public static final ppg1 W0;
    public static final ppg1 X;
    public static final ppg1 X0;
    public static final ppg1 Y;
    public static final ppg1 Y0;
    public static final ppg1 Z;
    public static final ppg1 Z0;
    public static final ppg1 a1;
    public static final ppg1 b;
    public static final ppg1 b1;
    public static final ppg1 c;
    public static final ppg1 c1;
    public static final ppg1 d;
    public static final ppg1 d1;
    public static final ppg1 e;
    public static final ppg1 e1;
    public static final ppg1 f;
    public static final ppg1 g;
    public static final ppg1 h;
    public static final ppg1 i;
    public static final ppg1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ppg1(i2, (byte) 0);
        c = new ppg1(i2, (byte) 1);
        d = new ppg1(i2, (byte) 2);
        e = new ppg1(i2, (byte) 3);
        f = new ppg1(i2, (byte) 4);
        g = new ppg1(i2, (byte) 5);
        h = new ppg1(i2, (byte) 6);
        i = new ppg1(i2, (byte) 7);
        t = new ppg1(i2, (byte) 8);
        X = new ppg1(i2, (byte) 9);
        Y = new ppg1(i2, (byte) 10);
        Z = new ppg1(i2, (byte) 11);
        N0 = new ppg1(i2, (byte) 12);
        O0 = new ppg1(i2, (byte) 13);
        P0 = new ppg1(i2, (byte) 14);
        Q0 = new ppg1(i2, (byte) 15);
        R0 = new ppg1(i2, (byte) 16);
        S0 = new ppg1(i2, (byte) 17);
        T0 = new ppg1(i2, (byte) 18);
        U0 = new ppg1(i2, (byte) 19);
        V0 = new ppg1(i2, (byte) 20);
        W0 = new ppg1(i2, (byte) 21);
        X0 = new ppg1(i2, (byte) 22);
        Y0 = new ppg1(i2, (byte) 23);
        Z0 = new ppg1(i2, (byte) 24);
        a1 = new ppg1(i2, (byte) 25);
        b1 = new ppg1(i2, (byte) 26);
        c1 = new ppg1(i2, (byte) 27);
        d1 = new ppg1(i2, (byte) 28);
        e1 = new ppg1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppg1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Map map;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof List);
            case 1:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 2:
                vhc1 vhc1Var = (vhc1) obj;
                thc1 thc1Var = vhc1Var instanceof thc1 ? (thc1) vhc1Var : null;
                return Boolean.valueOf((thc1Var == null || (map = thc1Var.j) == null || !map.containsKey("recsplanation")) ? false : true);
            case 3:
                DrawScope.d0((DrawScope) obj, u7h.b(u7h.b, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                pux0 pux0Var = ((pqg1) obj).a;
                return h5p1.s(new m441(new c9z0(pux0Var, null, (byte) 0)), new m441(new c9z0(pux0Var, null, (byte) 1)), new uop0(yoi1.g(((cjs) pux0Var.c).a()), (byte) 26), new ryu(4, null, (byte) 5));
            case 7:
                return new qqg1(false, gqg1.e, ((pqg1) obj).b);
            case 8:
                return Boolean.valueOf(obj instanceof vnb1);
            case 9:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 10:
                return (String) obj;
            case 11:
                return (vnb1) obj;
            case 12:
                return Boolean.valueOf(obj instanceof h2v);
            case 13:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
            case 14:
                return new a2v((String) obj, 1);
            case 15:
                return (h2v) obj;
            case 16:
                return Boolean.valueOf(obj instanceof vnb1);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof h2v);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new a2v((String) obj, 1);
            case 22:
                View view = (View) obj;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("spotify:internal:on-demand-trial:plan-overview"));
                intent.setPackage(view.getContext().getPackageName());
                view.getContext().startActivity(intent);
                return rih1Var;
            case 23:
                fxg1 fxg1Var = (fxg1) obj;
                return new gc90(fxg1Var.a, fxg1Var.b);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return qgo1.x((vnr0) obj).b;
            case 27:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(0.0f);
                kd31Var.i(2);
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                b261.t((e261) obj, 0);
                return rih1Var;
        }
    }
}
