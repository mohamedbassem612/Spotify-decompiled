package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.h290;
import p.jf40;
import p.jtm1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo extends h implements v2j0 {
    public static final int CAN_ADD_FIELD_NUMBER = 9;
    public static final int CAN_VIEW_FIELD_NUMBER = 6;
    public static final int CREATOR_NAME_FIELD_NUMBER = 1;
    public static final int CREATOR_URI_FIELD_NUMBER = 8;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo DEFAULT_INSTANCE;
    public static final int FROM_FOLDER_FIELD_NUMBER = 14;
    public static final int IS_EMPTY_PREDEFINED_FIELD_NUMBER = 17;
    public static final int IS_LOADING_FIELD_NUMBER = 5;
    public static final int IS_PRIVATE_FIELD_NUMBER = 22;
    public static final int IS_PROMPT_PLAYLIST_FIELD_NUMBER = 20;
    public static final int IS_PUBLISHED_FIELD_NUMBER = 21;
    public static final int MADE_FOR_NAME_FIELD_NUMBER = 10;
    public static final int MADE_FOR_URI_FIELD_NUMBER = 11;
    public static final int MIXING_ACTIVE_FIELD_NUMBER = 16;
    public static final int NAME_PREFIX_FIELD_NUMBER = 15;
    public static final int NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER = 12;
    public static final int OWNED_BY_SELF_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_GENERATION_STATUS_FIELD_NUMBER = 18;
    public static final int PROMPT_IS_PERSONALIZED_FIELD_NUMBER = 19;
    public static final int ROW_ID_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean canAdd_;
    private boolean canView_;
    private YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo fromFolder_;
    private boolean isEmptyPredefined_;
    private boolean isLoading_;
    private boolean isPrivate_;
    private boolean isPromptPlaylist_;
    private boolean isPublished_;
    private boolean mixingActive_;
    private boolean ownedBySelf_;
    private int promptGenerationStatus_;
    private boolean promptIsPersonalized_;
    private String creatorName_ = "";
    private String creatorUri_ = "";
    private String rowId_ = "";
    private String madeForName_ = "";
    private String madeForUri_ = "";
    private h290 numberOfItemsPerLinkType_ = h.emptyProtobufList();
    private String namePrefix_ = "";

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final jtm1 A() {
        jtm1 jtm1Var;
        int i = this.promptGenerationStatus_;
        if (i == 0) {
            jtm1Var = jtm1.MESSAGE_STATUS_UNKNOWN;
        } else if (i == 1) {
            jtm1Var = jtm1.MESSAGE_STATUS_SUCCESS;
        } else if (i == 2) {
            jtm1Var = jtm1.MESSAGE_STATUS_QUEUED;
        } else if (i != 3) {
            jtm1Var = i != 4 ? null : jtm1.MESSAGE_STATUS_ERROR;
        } else {
            jtm1Var = jtm1.MESSAGE_STATUS_PROCESSING;
        }
        return jtm1Var == null ? jtm1.UNRECOGNIZED : jtm1Var;
    }

    public final String B() {
        return this.rowId_;
    }

    public final boolean C() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0001\u0000\u0001Ȉ\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0007\nȈ\u000bȈ\f\u001b\r\u0007\u000eဉ\u0000\u000fȈ\u0010\u0007\u0011\u0007\u0012\f\u0013\u0007\u0014\u0007\u0015\u0007\u0016\u0007", new Object[]{"bitField0_", "creatorName_", "isLoading_", "canView_", "rowId_", "creatorUri_", "canAdd_", "madeForName_", "madeForUri_", "numberOfItemsPerLinkType_", YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType.class, "ownedBySelf_", "fromFolder_", "namePrefix_", "mixingActive_", "isEmptyPredefined_", "promptGenerationStatus_", "promptIsPersonalized_", "isPromptPlaylist_", "isPublished_", "isPrivate_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.class) {
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

    public final boolean n() {
        return this.canView_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.creatorName_;
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo q() {
        YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo = this.fromFolder_;
        return yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo == null ? YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo.n() : yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistFolderInfo;
    }

    public final boolean r() {
        return this.isEmptyPredefined_;
    }

    public final boolean s() {
        return this.isLoading_;
    }

    public final boolean t() {
        return this.isPrivate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isPromptPlaylist_;
    }

    public final String v() {
        return this.madeForName_;
    }

    public final boolean w() {
        return this.mixingActive_;
    }

    public final String x() {
        return this.namePrefix_;
    }

    public final h290 y() {
        return this.numberOfItemsPerLinkType_;
    }

    public final boolean z() {
        return this.ownedBySelf_;
    }
}
