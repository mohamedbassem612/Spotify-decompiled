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
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo extends h implements v2j0 {
    public static final int CREATOR_NAME_FIELD_NUMBER = 1;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo DEFAULT_INSTANCE;
    public static final int NUMBER_OF_DOWNLOADED_EPISODES_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 4;
    private String creatorName_ = "";
    private int numberOfDownloadedEpisodes_;
    private long publishDate_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001Ȉ\u0004\u0002\u0006\u0004", new Object[]{"creatorName_", "publishDate_", "numberOfDownloadedEpisodes_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo.class) {
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

    public final long getPublishDate() {
        return this.publishDate_;
    }

    public final String n() {
        return this.creatorName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        return this.numberOfDownloadedEpisodes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
