package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u0e0 extends hab0 implements iu30 {
    public static final u0e0 N0;
    public static final u0e0 O0;
    public static final u0e0 P0;
    public static final u0e0 Q0;
    public static final u0e0 R0;
    public static final u0e0 S0;
    public static final u0e0 T0;
    public static final u0e0 U0;
    public static final u0e0 V0;
    public static final u0e0 W0;
    public static final u0e0 X;
    public static final u0e0 X0;
    public static final u0e0 Y;
    public static final u0e0 Y0;
    public static final u0e0 Z;
    public static final u0e0 Z0;
    public static final u0e0 a1;
    public static final u0e0 b;
    public static final u0e0 b1;
    public static final u0e0 c;
    public static final u0e0 c1;
    public static final u0e0 d;
    public static final u0e0 d1;
    public static final u0e0 e;
    public static final u0e0 e1;
    public static final u0e0 f;
    public static final u0e0 g;
    public static final u0e0 h;
    public static final u0e0 i;
    public static final u0e0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new u0e0(i2, (byte) 0);
        c = new u0e0(i2, (byte) 1);
        d = new u0e0(i2, (byte) 2);
        e = new u0e0(i2, (byte) 3);
        f = new u0e0(i2, (byte) 4);
        g = new u0e0(i2, (byte) 5);
        h = new u0e0(i2, (byte) 6);
        i = new u0e0(i2, (byte) 7);
        t = new u0e0(i2, (byte) 8);
        X = new u0e0(i2, (byte) 9);
        Y = new u0e0(i2, (byte) 10);
        Z = new u0e0(i2, (byte) 11);
        N0 = new u0e0(i2, (byte) 12);
        O0 = new u0e0(i2, (byte) 13);
        P0 = new u0e0(i2, (byte) 14);
        Q0 = new u0e0(i2, (byte) 15);
        R0 = new u0e0(i2, (byte) 16);
        S0 = new u0e0(i2, (byte) 17);
        T0 = new u0e0(i2, (byte) 18);
        U0 = new u0e0(i2, (byte) 19);
        V0 = new u0e0(i2, (byte) 20);
        W0 = new u0e0(i2, (byte) 21);
        X0 = new u0e0(i2, (byte) 22);
        Y0 = new u0e0(i2, (byte) 23);
        Z0 = new u0e0(i2, (byte) 24);
        a1 = new u0e0(i2, (byte) 25);
        b1 = new u0e0(i2, (byte) 26);
        c1 = new u0e0(i2, (byte) 27);
        d1 = new u0e0(i2, (byte) 28);
        e1 = new u0e0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0e0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Context context = null;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 1:
                return Boolean.valueOf(obj instanceof hll);
            case 2:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 3:
                return Boolean.valueOf(obj instanceof hll);
            case 4:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 5:
                return (String) obj;
            case 6:
                return (String) obj;
            case 7:
                return (String) obj;
            case 8:
                if (!(obj instanceof uia) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uia) obj;
            case 10:
                if (!(obj instanceof ro7) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 12:
                return Boolean.valueOf(obj instanceof nig1);
            case 13:
                if (obj != null) {
                    return (nig1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.playlistmixing.kodiaktables.TransitionData");
                return null;
            case 14:
                return Boolean.valueOf(obj instanceof hll);
            case 15:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 16:
                return (hy31) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (nig1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (ga01) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (k8g1) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof k8g1);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 22:
                return rih1Var;
            case 23:
                rtb0.b((rtb0) obj, Integer.MAX_VALUE, (iu30) null, twi.a, 6);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((n161) obj).b(lgo1.b, "TEST_TAG_LOADING");
                return rih1Var;
            case 25:
                xos0 xos0Var = (xos0) obj;
                kiv kivVar = AndroidCompositionLocals_androidKt.b;
                xos0Var.getClass();
                for (Context baseContext = (Context) d7e.x(xos0Var, kivVar); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case 26:
                return rih1Var;
            case 27:
                return new oee0(((cxc0) obj).f.a);
            case 28:
                return new the0(((she0) obj).a);
            default:
                ((qtr) obj).b(new kr(5, (lnm) null, (byte) 27));
                return rih1Var;
        }
    }
}
