package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wce0 extends hab0 implements Function0 {
    public static final wce0 N0;
    public static final wce0 O0;
    public static final wce0 P0;
    public static final wce0 Q0;
    public static final wce0 R0;
    public static final wce0 S0;
    public static final wce0 T0;
    public static final wce0 U0;
    public static final wce0 V0;
    public static final wce0 W0;
    public static final wce0 X;
    public static final wce0 X0;
    public static final wce0 Y;
    public static final wce0 Y0;
    public static final wce0 Z;
    public static final wce0 Z0;
    public static final wce0 a1;
    public static final wce0 b;
    public static final wce0 b1;
    public static final wce0 c;
    public static final wce0 c1;
    public static final wce0 d;
    public static final wce0 d1;
    public static final wce0 e;
    public static final wce0 e1;
    public static final wce0 f;
    public static final wce0 g;
    public static final wce0 h;
    public static final wce0 i;
    public static final wce0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new wce0(i2, (byte) 0);
        c = new wce0(i2, (byte) 1);
        d = new wce0(i2, (byte) 2);
        e = new wce0(i2, (byte) 3);
        f = new wce0(i2, (byte) 4);
        g = new wce0(i2, (byte) 5);
        h = new wce0(i2, (byte) 6);
        i = new wce0(i2, (byte) 7);
        t = new wce0(i2, (byte) 8);
        X = new wce0(i2, (byte) 9);
        Y = new wce0(i2, (byte) 10);
        Z = new wce0(i2, (byte) 11);
        N0 = new wce0(i2, (byte) 12);
        O0 = new wce0(i2, (byte) 13);
        P0 = new wce0(i2, (byte) 14);
        Q0 = new wce0(i2, (byte) 15);
        R0 = new wce0(i2, (byte) 16);
        S0 = new wce0(i2, (byte) 17);
        T0 = new wce0(i2, (byte) 18);
        U0 = new wce0(i2, (byte) 19);
        V0 = new wce0(i2, (byte) 20);
        W0 = new wce0(i2, (byte) 21);
        X0 = new wce0(i2, (byte) 22);
        Y0 = new wce0(i2, (byte) 23);
        Z0 = new wce0(i2, (byte) 24);
        a1 = new wce0(i2, (byte) 25);
        b1 = new wce0(i2, (byte) 26);
        c1 = new wce0(i2, (byte) 27);
        d1 = new wce0(i2, (byte) 28);
        e1 = new wce0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wce0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return null;
            case 1:
                throw new IllegalStateException("No BetamaxPlayerPool found in local composition");
            case 2:
                throw new IllegalStateException("No BetamaxCacheStorage found in local composition");
            case 3:
                throw new IllegalStateException("No CampfireProperties found in local composition");
            case 4:
                throw new IllegalStateException("No clock instance provided");
            case 5:
                throw new IllegalStateException("No clock instance provided");
            case 6:
                return poo1.s(0.0f, 14);
            case 7:
                return ztl.a;
            case 8:
                throw new IllegalStateException("DataPool is not provided.");
            case 9:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 10:
                return null;
            case 11:
                return new u7h(u7h.f);
            case 12:
                return qsw.a;
            case 13:
            case 14:
            case 15:
                return null;
            case 16:
                throw new IllegalStateException("No AdCarouselItemElement provided.");
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                throw new IllegalStateException("No ImageGalleryLogger provided.");
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                throw new IllegalStateException("No MediaContentElement provided.");
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                throw new IllegalStateException("No PlayButtonElement provided.");
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                throw new IllegalStateException("No ThumbnailElement provided.");
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                throw new IllegalStateException("No BetamaxCacheStorage found in local composition");
            case 22:
                throw new IllegalStateException("No BetamaxPlayerPool found in local composition");
            case 23:
                throw new IllegalStateException("No Clock found in local composition");
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                throw new IllegalStateException(("No " + rc11.a.b(ya71.class).r() + " found in local composition").toString());
            case 25:
                throw new IllegalStateException("No ViewModel factory map provided");
            case 26:
                throw new IllegalStateException("No LocalWrappedSizes provided.");
            case 27:
                return rih1Var;
            case 28:
                return Boolean.FALSE;
            default:
                return rih1Var;
        }
    }
}
