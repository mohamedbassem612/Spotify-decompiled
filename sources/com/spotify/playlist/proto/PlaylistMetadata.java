package com.spotify.playlist.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import java.util.List;
import p.bf40;
import p.epu0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistMetadata extends h implements v2j0 {
    public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 23;
    public static final int ALLOWS_FIELD_NUMBER = 18;
    public static final int BROWSABLE_OFFLINE_FIELD_NUMBER = 11;
    public static final int CAN_REPORT_ANNOTATION_ABUSE_FIELD_NUMBER = 16;
    public static final int COLLABORATIVE_FIELD_NUMBER = 5;
    private static final PlaylistMetadata DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 24;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int DESCRIPTION_FROM_ANNOTATE_FIELD_NUMBER = 12;
    public static final int EXTENSION_FIELD_NUMBER = 21;
    public static final int FOLLOWED_FIELD_NUMBER = 9;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 15;
    public static final int FORMAT_LIST_TYPE_FIELD_NUMBER = 14;
    public static final int IS_LOADED_FIELD_NUMBER = 17;
    public static final int LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER = 22;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int LOAD_STATE_FIELD_NUMBER = 19;
    public static final int MADE_FOR_FIELD_NUMBER = 20;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OWNED_BY_SELF_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PICTURES_FIELD_NUMBER = 8;
    public static final int PICTURE_FROM_ANNOTATE_FIELD_NUMBER = 13;
    public static final int PUBLISHED_FIELD_NUMBER = 10;
    public static final int SORT_ORDERS_FIELD_NUMBER = 26;
    public static final int TAG_DEFINITIONS_FIELD_NUMBER = 27;
    public static final int TOTAL_LENGTH_FIELD_NUMBER = 6;
    public static final int USER_CREATED_FIELD_NUMBER = 25;
    private Allows allows_;
    private int bitField0_;
    private boolean browsableOffline_;
    private boolean canReportAnnotationAbuse_;
    private boolean collaborative_;
    private boolean deletedByOwner_;
    private boolean descriptionFromAnnotate_;
    private boolean followed_;
    private boolean isLoaded_;
    private int lengthIgnoringTextFilter_;
    private User madeFor_;
    private boolean ownedBySelf_;
    private User owner_;
    private boolean pictureFromAnnotate_;
    private ImageGroup pictures_;
    private boolean published_;
    private int totalLength_;
    private boolean userCreated_;
    private String link_ = "";
    private String name_ = "";
    private String description_ = "";
    private String formatListType_ = "";
    private h290 formatListAttributes_ = h.emptyProtobufList();
    private String loadState_ = "";
    private h290 extension_ = h.emptyProtobufList();
    private String aiCurationReferenceId_ = "";
    private h290 sortOrders_ = h.emptyProtobufList();
    private h290 tagDefinitions_ = h.emptyProtobufList();

    static {
        PlaylistMetadata playlistMetadata = new PlaylistMetadata();
        DEFAULT_INSTANCE = playlistMetadata;
        h.registerDefaultInstance(PlaylistMetadata.class, playlistMetadata);
    }

    private PlaylistMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaylistMetadata r() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.published_;
    }

    public final int B() {
        return this.sortOrders_.size();
    }

    public final h290 C() {
        return this.sortOrders_;
    }

    public final int D() {
        return this.tagDefinitions_.size();
    }

    public final h290 E() {
        return this.tagDefinitions_;
    }

    public final int F() {
        return this.totalLength_;
    }

    public final boolean G() {
        return this.userCreated_;
    }

    public final boolean H() {
        return (this.bitField0_ & 262144) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 128) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\bဉ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဈ\r\u000f\u001b\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဉ\u0010\u0013ဈ\u0011\u0014ဉ\u0012\u0015\u001b\u0016ဋ\u0013\u0017ဈ\u0014\u0018ဇ\u0015\u0019ဇ\u0016\u001a\u001b\u001b\u001b", new Object[]{"bitField0_", "link_", "name_", "owner_", "ownedBySelf_", "collaborative_", "totalLength_", "description_", "pictures_", "followed_", "published_", "browsableOffline_", "descriptionFromAnnotate_", "pictureFromAnnotate_", "formatListType_", "formatListAttributes_", FormatListAttribute.class, "canReportAnnotationAbuse_", "isLoaded_", "allows_", "loadState_", "madeFor_", "extension_", Extension.class, "lengthIgnoringTextFilter_", "aiCurationReferenceId_", "deletedByOwner_", "userCreated_", "sortOrders_", ProvidedSortOrder.class, "tagDefinitions_", ProvidedTagDefinition.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistMetadata();
        }
        if (iOrdinal == 4) {
            return new epu0();
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
        synchronized (PlaylistMetadata.class) {
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

    public final boolean getCollaborative() {
        return this.collaborative_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getDeletedByOwner() {
        return this.deletedByOwner_;
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final boolean getFollowed() {
        return this.followed_;
    }

    public final int getFormatListAttributesCount() {
        return this.formatListAttributes_.size();
    }

    public final List getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.aiCurationReferenceId_;
    }

    public final boolean p() {
        return this.browsableOffline_;
    }

    public final boolean q() {
        return this.canReportAnnotationAbuse_;
    }

    public final String s() {
        return this.formatListType_;
    }

    public final boolean t() {
        return this.isLoaded_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        return this.lengthIgnoringTextFilter_;
    }

    public final User v() {
        User user = this.madeFor_;
        return user == null ? User.o() : user;
    }

    public final boolean w() {
        return this.ownedBySelf_;
    }

    public final User x() {
        User user = this.owner_;
        return user == null ? User.o() : user;
    }

    public final boolean y() {
        return this.pictureFromAnnotate_;
    }

    public final ImageGroup z() {
        ImageGroup imageGroup = this.pictures_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }
}
