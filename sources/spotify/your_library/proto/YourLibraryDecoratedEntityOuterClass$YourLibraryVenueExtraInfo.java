package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo extends h implements v2j0 {
    public static final int ADDRESS_NAME_FIELD_NUMBER = 1;
    public static final int CITY_NAME_FIELD_NUMBER = 2;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String addressName_ = "";
    private String cityName_ = "";

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"addressName_", "cityName_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 21);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String n() {
        return this.addressName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.cityName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
