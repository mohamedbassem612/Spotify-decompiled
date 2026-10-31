package spotify.your_library.proto;

import com.google.protobuf.h;
import p.atm1;
import p.bf40;
import p.dnm1;
import p.itm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 11;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo DEFAULT_INSTANCE;
    public static final int GROUP_LABEL_FIELD_NUMBER = 5;
    public static final int HAS_CURATED_ITEMS_FIELD_NUMBER = 13;
    public static final int IMAGE_URI_FIELD_NUMBER = 6;
    public static final int LAST_PLAYED_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFLINE_AVAILABILITY_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PINNABLE_FIELD_NUMBER = 8;
    public static final int PINNED_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 3;
    private long addTime_;
    private boolean hasCuratedItems_;
    private long lastPlayed_;
    private int offlineAvailability_;
    private int pinnable_;
    private boolean pinned_;
    private String name_ = "";
    private String uri_ = "";
    private String groupLabel_ = "";
    private String imageUri_ = "";

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\r\n\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\b\f\t\f\u000b\u0002\f\u0002\r\u0007", new Object[]{"name_", "uri_", "groupLabel_", "imageUri_", "pinned_", "pinnable_", "offlineAvailability_", "addTime_", "lastPlayed_", "hasCuratedItems_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.groupLabel_;
    }

    public final boolean p() {
        return this.hasCuratedItems_;
    }

    public final String q() {
        return this.imageUri_;
    }

    public final long r() {
        return this.lastPlayed_;
    }

    public final atm1 s() {
        atm1 atm1Var;
        int i = this.offlineAvailability_;
        if (i == 0) {
            atm1Var = atm1.UNKNOWN;
        } else if (i == 1) {
            atm1Var = atm1.NO;
        } else if (i == 2) {
            atm1Var = atm1.YES;
        } else if (i != 3) {
            atm1Var = i != 4 ? null : atm1.WAITING;
        } else {
            atm1Var = atm1.DOWNLOADING;
        }
        return atm1Var == null ? atm1.UNRECOGNIZED : atm1Var;
    }

    public final itm1 t() {
        itm1 itm1Var;
        int i = this.pinnable_;
        if (i == 0) {
            itm1Var = itm1.YES;
        } else if (i != 1) {
            itm1Var = i != 2 ? null : itm1.NOT_VALID_TYPE;
        } else {
            itm1Var = itm1.NO_IN_FOLDER;
        }
        return itm1Var == null ? itm1.UNRECOGNIZED : itm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.pinned_;
    }
}
