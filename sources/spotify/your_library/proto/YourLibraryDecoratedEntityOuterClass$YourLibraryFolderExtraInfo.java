package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo extends h implements v2j0 {
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_FOLDERS_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_PLAYLISTS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 4;
    private int numberOfFolders_;
    private int numberOfPlaylists_;
    private String rowId_ = "";
    private h290 entity_ = h.emptyProtobufList();

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\u001b", new Object[]{"numberOfPlaylists_", "numberOfFolders_", "rowId_", "entity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.numberOfFolders_;
    }

    public final int p() {
        return this.numberOfPlaylists_;
    }

    public final String q() {
        return this.rowId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
