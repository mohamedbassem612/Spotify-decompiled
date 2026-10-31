package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.jf40;
import p.ktm1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo extends h implements v2j0 {
    public static final int ALBUM_TYPE_FIELD_NUMBER = 4;
    public static final int ARTIST_NAME_FIELD_NUMBER = 1;
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int albumType_;
    private String artistName_ = "";
    private String artistUri_ = "";
    private int type_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"artistName_", "artistUri_", "type_", "albumType_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryPreReleaseExtraInfo.class) {
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
        return this.artistName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ktm1 p() {
        ktm1 ktm1Var;
        int i = this.type_;
        if (i != 0) {
            ktm1Var = i != 1 ? null : ktm1.BOOK;
        } else {
            ktm1Var = ktm1.ALBUM;
        }
        return ktm1Var == null ? ktm1.UNRECOGNIZED : ktm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
