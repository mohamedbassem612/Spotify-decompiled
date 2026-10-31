package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class god0 extends hab0 implements iu30 {
    public static final god0 N0;
    public static final god0 O0;
    public static final god0 P0;
    public static final god0 Q0;
    public static final god0 R0;
    public static final god0 S0;
    public static final god0 T0;
    public static final god0 U0;
    public static final god0 V0;
    public static final god0 W0;
    public static final god0 X;
    public static final god0 X0;
    public static final god0 Y;
    public static final god0 Y0;
    public static final god0 Z;
    public static final god0 Z0;
    public static final god0 a1;
    public static final god0 b;
    public static final god0 b1;
    public static final god0 c;
    public static final god0 c1;
    public static final god0 d;
    public static final god0 d1;
    public static final god0 e;
    public static final god0 e1;
    public static final god0 f;
    public static final god0 g;
    public static final god0 h;
    public static final god0 i;
    public static final god0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new god0(i2, (byte) 0);
        c = new god0(i2, (byte) 1);
        d = new god0(i2, (byte) 2);
        e = new god0(i2, (byte) 3);
        f = new god0(i2, (byte) 4);
        g = new god0(i2, (byte) 5);
        h = new god0(i2, (byte) 6);
        i = new god0(i2, (byte) 7);
        t = new god0(i2, (byte) 8);
        X = new god0(i2, (byte) 9);
        Y = new god0(i2, (byte) 10);
        Z = new god0(i2, (byte) 11);
        N0 = new god0(i2, (byte) 12);
        O0 = new god0(i2, (byte) 13);
        P0 = new god0(i2, (byte) 14);
        Q0 = new god0(i2, (byte) 15);
        R0 = new god0(i2, (byte) 16);
        S0 = new god0(i2, (byte) 17);
        T0 = new god0(i2, (byte) 18);
        U0 = new god0(i2, (byte) 19);
        V0 = new god0(i2, (byte) 20);
        W0 = new god0(i2, (byte) 21);
        X0 = new god0(i2, (byte) 22);
        Y0 = new god0(i2, (byte) 23);
        Z0 = new god0(i2, (byte) 24);
        a1 = new god0(i2, (byte) 25);
        b1 = new god0(i2, (byte) 26);
        c1 = new god0(i2, (byte) 27);
        d1 = new god0(i2, (byte) 28);
        e1 = new god0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ god0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new t0l0((i3l0) obj);
            case 1:
                return ((t0l0) obj).a("spotify:live-legal-disclosure");
            case 2:
                return new huz(new npd0(), (byte) 10);
            case 3:
                return new npd0();
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return new rpd0(0L, 0L);
            case 9:
                return new spd0(0L, 0L);
            case 10:
                return new ugc1("");
            case 11:
                return new ugc1(poo1.A((PlayerState) obj));
            case 12:
                return poo1.z((PlayerState) obj);
            case 13:
                return new rud0(((kxo0) obj).a);
            case 14:
                return Collections.singleton(((kxo0) obj).a);
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (String) ((mmr0) obj).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (String) ((mmr0) obj).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (String) ((mmr0) obj).a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (String) ((mmr0) obj).b;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (String) ((mmr0) obj).a;
            case 22:
                return (String) ((mmr0) obj).b;
            case 23:
                if (!(obj instanceof uia) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uia) obj;
            case 25:
                if (!(obj instanceof uia) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uia) obj;
            case 27:
                if (!(obj instanceof ro7) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ro7) obj;
            default:
                if (!(obj instanceof ro7) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
