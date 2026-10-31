package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zib0 extends hab0 implements iu30 {
    public static final zib0 N0;
    public static final zib0 O0;
    public static final zib0 P0;
    public static final zib0 Q0;
    public static final zib0 R0;
    public static final zib0 S0;
    public static final zib0 T0;
    public static final zib0 U0;
    public static final zib0 V0;
    public static final zib0 W0;
    public static final zib0 X;
    public static final zib0 X0;
    public static final zib0 Y;
    public static final zib0 Y0;
    public static final zib0 Z;
    public static final zib0 Z0;
    public static final zib0 a1;
    public static final zib0 b;
    public static final zib0 b1;
    public static final zib0 c;
    public static final zib0 c1;
    public static final zib0 d;
    public static final zib0 d1;
    public static final zib0 e;
    public static final zib0 e1;
    public static final zib0 f;
    public static final zib0 g;
    public static final zib0 h;
    public static final zib0 i;
    public static final zib0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zib0(i2, (byte) 0);
        c = new zib0(i2, (byte) 1);
        d = new zib0(i2, (byte) 2);
        e = new zib0(i2, (byte) 3);
        f = new zib0(i2, (byte) 4);
        g = new zib0(i2, (byte) 5);
        h = new zib0(i2, (byte) 6);
        i = new zib0(i2, (byte) 7);
        t = new zib0(i2, (byte) 8);
        X = new zib0(i2, (byte) 9);
        Y = new zib0(i2, (byte) 10);
        Z = new zib0(i2, (byte) 11);
        N0 = new zib0(i2, (byte) 12);
        O0 = new zib0(i2, (byte) 13);
        P0 = new zib0(i2, (byte) 14);
        Q0 = new zib0(i2, (byte) 15);
        R0 = new zib0(i2, (byte) 16);
        S0 = new zib0(i2, (byte) 17);
        T0 = new zib0(i2, (byte) 18);
        U0 = new zib0(i2, (byte) 19);
        V0 = new zib0(i2, (byte) 20);
        W0 = new zib0(i2, (byte) 21);
        X0 = new zib0(i2, (byte) 22);
        Y0 = new zib0(i2, (byte) 23);
        Z0 = new zib0(i2, (byte) 24);
        a1 = new zib0(i2, (byte) 25);
        b1 = new zib0(i2, (byte) 26);
        c1 = new zib0(i2, (byte) 27);
        d1 = new zib0(i2, (byte) 28);
        e1 = new zib0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zib0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((wib0) obj).a.a;
            case 1:
                return ((wib0) obj).b;
            case 2:
                return ((wib0) obj).a.a;
            case 3:
                return Boolean.valueOf((obj instanceof pjw0) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 5:
                return Boolean.valueOf((obj instanceof ro7) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 7:
                return Boolean.valueOf((obj instanceof ro7) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            case 9:
                return Boolean.valueOf(obj instanceof jo70);
            case 10:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 11:
                return Boolean.valueOf(obj instanceof xkk1);
            case 12:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 13:
                return Boolean.valueOf(obj instanceof vnb1);
            case 14:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 15:
                return rih1Var;
            case 16:
                Logger.l((Throwable) obj, "No credits from confirmGeneration endpoint", new Object[0]);
                return rwk.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj).intValue();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                List list = (List) obj;
                pob0 pob0Var = new pob0(((Number) list.get(2)).floatValue() >= 0.0f ? (int) ((Number) list.get(2)).floatValue() : 0, 1.0f, 1.0f);
                if (((Number) list.get(0)).floatValue() != 0.0f || ((Number) list.get(1)).floatValue() != 0.0f) {
                    pob0Var.g = c97.b(((Number) list.get(0)).floatValue());
                    pob0Var.h = c97.b(((Number) list.get(1)).floatValue());
                    pob0Var.f.setValue(Boolean.TRUE);
                }
                pob0Var.e(((Number) list.get(2)).floatValue() >= 0.0f ? new qz20((int) ((Number) list.get(2)).floatValue()) : rz20.a);
                pob0Var.k.t(((Number) list.get(3)).floatValue());
                return pob0Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.c((e261) obj);
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new p0l0((i3l0) obj);
            case 25:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((p0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 26:
                return rih1Var;
            case 27:
                return oxb0.a;
            case 28:
                List list2 = (List) obj;
                return new vxb0(((ji0) o7h.q0(list2)).b, list2);
            default:
                return new r0l0((i3l0) obj);
        }
    }
}
