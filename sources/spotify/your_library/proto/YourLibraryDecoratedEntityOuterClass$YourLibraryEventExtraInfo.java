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
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo extends h implements v2j0 {
    public static final int CITY_NAME_FIELD_NUMBER = 3;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo DEFAULT_INSTANCE;
    public static final int LOCATION_NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private long startTime_;
    private String locationName_ = "";
    private String cityName_ = "";

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ", new Object[]{"locationName_", "startTime_", "cityName_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo.class) {
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
        return this.cityName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.locationName_;
    }

    public final long q() {
        return this.startTime_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
