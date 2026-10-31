package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbn0 extends hab0 implements iu30 {
    public static final sbn0 N0;
    public static final sbn0 O0;
    public static final sbn0 P0;
    public static final sbn0 Q0;
    public static final sbn0 R0;
    public static final sbn0 S0;
    public static final sbn0 T0;
    public static final sbn0 U0;
    public static final sbn0 V0;
    public static final sbn0 W0;
    public static final sbn0 X;
    public static final sbn0 X0;
    public static final sbn0 Y;
    public static final sbn0 Y0;
    public static final sbn0 Z;
    public static final sbn0 Z0;
    public static final sbn0 a1;
    public static final sbn0 b;
    public static final sbn0 b1;
    public static final sbn0 c;
    public static final sbn0 c1;
    public static final sbn0 d;
    public static final sbn0 d1;
    public static final sbn0 e;
    public static final sbn0 e1;
    public static final sbn0 f;
    public static final sbn0 g;
    public static final sbn0 h;
    public static final sbn0 i;
    public static final sbn0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new sbn0(i2, (byte) 0);
        c = new sbn0(i2, (byte) 1);
        d = new sbn0(i2, (byte) 2);
        e = new sbn0(i2, (byte) 3);
        f = new sbn0(i2, (byte) 4);
        g = new sbn0(i2, (byte) 5);
        h = new sbn0(i2, (byte) 6);
        i = new sbn0(i2, (byte) 7);
        t = new sbn0(i2, (byte) 8);
        X = new sbn0(i2, (byte) 9);
        Y = new sbn0(i2, (byte) 10);
        Z = new sbn0(i2, (byte) 11);
        N0 = new sbn0(i2, (byte) 12);
        O0 = new sbn0(i2, (byte) 13);
        P0 = new sbn0(i2, (byte) 14);
        Q0 = new sbn0(i2, (byte) 15);
        R0 = new sbn0(i2, (byte) 16);
        S0 = new sbn0(i2, (byte) 17);
        T0 = new sbn0(i2, (byte) 18);
        U0 = new sbn0(i2, (byte) 19);
        V0 = new sbn0(i2, (byte) 20);
        W0 = new sbn0(i2, (byte) 21);
        X0 = new sbn0(i2, (byte) 22);
        Y0 = new sbn0(i2, (byte) 23);
        Z0 = new sbn0(i2, (byte) 24);
        a1 = new sbn0(i2, (byte) 25);
        b1 = new sbn0(i2, (byte) 26);
        c1 = new sbn0(i2, (byte) 27);
        d1 = new sbn0(i2, (byte) 28);
        e1 = new sbn0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbn0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof pjw0);
            case 2:
                if (obj != null) {
                    return (pjw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.previewplaybacktrait.PreviewPlaybackTrait");
                return null;
            case 3:
                return rih1Var;
            case 4:
                return new r6k0((mr20) obj, (byte) 13);
            case 5:
                return "music-video-disabled";
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                return "  " + ((mnv0) entry.getKey()).a + " = " + entry.getValue();
            case 7:
                return new yfn0(true, false, false);
            case 8:
                return new d1l0((i3l0) obj);
            case 9:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((d1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 10:
                String str = ((fgn0) obj).a;
                Set set = pcf.a;
                return "spotify:chat-mute:".concat(str);
            case 11:
                b261.c((e261) obj);
                return rih1Var;
            case 12:
                return mno1.h(new mmr0[]{new mmr0("MyAllowlistingRequestsModel", (bin0) obj)});
            case 13:
                return new gcm((String) obj, nik1.Y5.a, (ucm) null, (Function0) null, 28);
            case 14:
                return ((xkn0) obj).a;
            case 15:
                Context context = (Context) obj;
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 16:
                vnn0 vnn0Var = (vnn0) obj;
                don0 don0Var = vnn0Var.b;
                if (don0Var == null || don0Var.Z != vnn0Var.h) {
                    return null;
                }
                return don0Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vnn0 vnn0Var2 = (vnn0) obj;
                don0 don0Var2 = vnn0Var2.b;
                if (don0Var2 == null || don0Var2.Z != vnn0Var2.h) {
                    return null;
                }
                return don0Var2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(((vnn0) obj).h);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((vnn0) obj).b;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                don0 don0Var3 = (vnn0) obj;
                if (!(don0Var3 instanceof don0)) {
                    return null;
                }
                don0 don0Var4 = don0Var3;
                return don0Var4.p(don0Var4.Z, don0Var4, false);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return xay.e(2, irn1.o0(700, 0, (dlv) null, 6));
            case 22:
                return xay.f(2, irn1.o0(700, 0, (dlv) null, 6));
            case 23:
                return ((hnn0) obj).f;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return xay.e(2, irn1.o0(700, 0, (dlv) null, 6));
            case 25:
                return xay.f(2, irn1.o0(700, 0, (dlv) null, 6));
            case 26:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 27:
                Object tag = ((View) obj).getTag(2131430113);
                if (tag instanceof WeakReference) {
                    return (gon0) ((WeakReference) tag).get();
                }
                if (tag instanceof gon0) {
                    return (gon0) tag;
                }
                return null;
            case 28:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }
}
