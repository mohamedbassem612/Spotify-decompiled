package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.er80;
import p.hz00;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sku0;
import p.v2j0;
import p.ytw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistDecorationPolicy extends h implements v2j0 {
    public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 48;
    public static final int ALLOWS_FIELD_NUMBER = 35;
    public static final int AVAILABLE_CONCEPTS_FIELD_NUMBER = 52;
    public static final int AVAILABLE_LANGUAGES_FIELD_NUMBER = 56;
    public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 47;
    public static final int BASE_PERMISSION_FIELD_NUMBER = 41;
    public static final int BROWSABLE_OFFLINE_FIELD_NUMBER = 23;
    public static final int CAN_REPORT_ANNOTATION_ABUSE_FIELD_NUMBER = 16;
    public static final int COLLABORATING_USERS_FIELD_NUMBER = 40;
    public static final int COLLABORATIVE_FIELD_NUMBER = 6;
    public static final int CONTAINS_AUDIO_EPISODES_FIELD_NUMBER = 30;
    public static final int CONTAINS_EPISODES_FIELD_NUMBER = 29;
    public static final int CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER = 58;
    public static final int CONTAINS_SPOTIFY_TRACKS_FIELD_NUMBER = 27;
    public static final int CONTAINS_TRACKS_FIELD_NUMBER = 28;
    public static final int CONTENT_SIGNATURE_FIELD_NUMBER = 53;
    public static final int CREATED_AT_FIELD_NUMBER = 51;
    private static final PlaylistDecorationPolicy DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 54;
    public static final int DESCRIPTION_FIELD_NUMBER = 11;
    public static final int DESCRIPTION_FROM_ANNOTATE_FIELD_NUMBER = 14;
    public static final int DURATION_FIELD_NUMBER = 10;
    public static final int EXTENSION_FIELD_NUMBER = 43;
    public static final int FOLLOWED_FIELD_NUMBER = 17;
    public static final int FOLLOWERS_FIELD_NUMBER = 18;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 25;
    public static final int FORMAT_LIST_TYPE_FIELD_NUMBER = 24;
    public static final int HAS_EXPLICIT_CONTENT_FIELD_NUMBER = 26;
    public static final int IS_ON_DEMAND_IN_FREE_FIELD_NUMBER = 32;
    public static final int LAST_MODIFICATION_FIELD_NUMBER = 8;
    public static final int LENGTH_FIELD_NUMBER = 7;
    public static final int LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER = 45;
    public static final int LENSES_FIELD_NUMBER = 44;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int LOADED_FIELD_NUMBER = 5;
    public static final int LOAD_STATE_FIELD_NUMBER = 4;
    public static final int MADE_FOR_FIELD_NUMBER = 34;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 36;
    public static final int NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER = 46;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 37;
    public static final int OFFLINE_FIELD_NUMBER = 20;
    public static final int ONLY_CONTAINS_EXPLICIT_FIELD_NUMBER = 31;
    public static final int ON_DEMAND_IN_FREE_REASON_FIELD_NUMBER = 39;
    public static final int OWNED_BY_SELF_FIELD_NUMBER = 19;
    public static final int OWNER_FIELD_NUMBER = 33;
    private static volatile qzr0 PARSER = null;
    public static final int PICTURE_FIELD_NUMBER = 12;
    public static final int PICTURE_FROM_ANNOTATE_FIELD_NUMBER = 15;
    public static final int PLAYABLE_FIELD_NUMBER = 13;
    public static final int PREFER_LINEAR_PLAYBACK_FIELD_NUMBER = 38;
    public static final int PUBLISHED_FIELD_NUMBER = 22;
    public static final int ROW_ID_FIELD_NUMBER = 1;
    public static final int SORT_MANIFEST_FIELD_NUMBER = 57;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 21;
    public static final int TAG_MANIFEST_FIELD_NUMBER = 59;
    public static final int TOTAL_LENGTH_FIELD_NUMBER = 9;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 50;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 49;
    public static final int USER_CAPABILITIES_FIELD_NUMBER = 42;
    public static final int USER_CREATED_FIELD_NUMBER = 55;
    private static final c290 extension_converter_ = new ytw0((byte) 17);
    private boolean aiCurationReferenceId_;
    private PlaylistAllowsDecorationPolicy allows_;
    private AvailableConcepts availableConcepts_;
    private AvailableLanguages availableLanguages_;
    private boolean availableSignals_;
    private boolean basePermission_;
    private int bitField0_;
    private boolean browsableOffline_;
    private boolean canReportAnnotationAbuse_;
    private CollaboratingUsersDecorationPolicy collaboratingUsers_;
    private boolean collaborative_;
    private boolean containsAudioEpisodes_;
    private boolean containsEpisodes_;
    private boolean containsMusicVideos_;
    private boolean containsSpotifyTracks_;
    private boolean containsTracks_;
    private boolean contentSignature_;
    private boolean createdAt_;
    private boolean deletedByOwner_;
    private boolean descriptionFromAnnotate_;
    private boolean description_;
    private boolean duration_;
    private int extensionMemoizedSerializedSize;
    private b290 extension_ = h.emptyIntList();
    private boolean followed_;
    private boolean followers_;
    private boolean formatListAttributes_;
    private boolean formatListType_;
    private boolean hasExplicitContent_;
    private boolean isOnDemandInFree_;
    private boolean lastModification_;
    private boolean lengthIgnoringTextFilter_;
    private boolean length_;
    private boolean lenses_;
    private boolean link_;
    private boolean loadState_;
    private boolean loaded_;
    private UserDecorationPolicy madeFor_;
    private boolean name_;
    private boolean numberOfEpisodes_;
    private boolean numberOfItemsPerLinkType_;
    private boolean numberOfTracks_;
    private boolean offline_;
    private boolean onDemandInFreeReason_;
    private boolean onlyContainsExplicit_;
    private boolean ownedBySelf_;
    private UserDecorationPolicy owner_;
    private boolean pictureFromAnnotate_;
    private boolean picture_;
    private boolean playable_;
    private boolean preferLinearPlayback_;
    private boolean published_;
    private boolean rowId_;
    private boolean sortManifest_;
    private boolean syncProgress_;
    private boolean tagManifest_;
    private boolean totalLength_;
    private boolean unfilteredLength_;
    private boolean unrangedLength_;
    private boolean userCapabilities_;
    private boolean userCreated_;

    static {
        PlaylistDecorationPolicy playlistDecorationPolicy = new PlaylistDecorationPolicy();
        DEFAULT_INSTANCE = playlistDecorationPolicy;
        h.registerDefaultInstance(PlaylistDecorationPolicy.class, playlistDecorationPolicy);
    }

    private PlaylistDecorationPolicy() {
    }

    public static PlaylistDecorationPolicy o() {
        return DEFAULT_INSTANCE;
    }

    public static sku0 p() {
        return (sku0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A() {
        this.description_ = true;
    }

    public final void B() {
        this.duration_ = true;
    }

    public final void C() {
        this.followed_ = true;
    }

    public final void D() {
        this.followers_ = true;
    }

    public final void E() {
        this.formatListAttributes_ = true;
    }

    public final void F() {
        this.formatListType_ = true;
    }

    public final void G() {
        this.hasExplicitContent_ = true;
    }

    public final void H() {
        this.lastModification_ = true;
    }

    public final void I() {
        this.length_ = true;
    }

    public final void J() {
        this.lengthIgnoringTextFilter_ = true;
    }

    public final void K() {
        this.lenses_ = true;
    }

    public final void L() {
        this.link_ = true;
    }

    public final void M() {
        this.loaded_ = true;
    }

    public final void N(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.getClass();
        this.madeFor_ = userDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void O() {
        this.name_ = true;
    }

    public final void P() {
        this.numberOfItemsPerLinkType_ = true;
    }

    public final void Q() {
        this.offline_ = true;
    }

    public final void R() {
        this.onDemandInFreeReason_ = true;
    }

    public final void S() {
        this.onlyContainsExplicit_ = true;
    }

    public final void T() {
        this.ownedBySelf_ = true;
    }

    public final void U(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.getClass();
        this.owner_ = userDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void V() {
        this.picture_ = true;
    }

    public final void W() {
        this.pictureFromAnnotate_ = true;
    }

    public final void X() {
        this.playable_ = true;
    }

    public final void Y() {
        this.published_ = true;
    }

    public final void Z() {
        this.rowId_ = true;
    }

    public final void a0() {
        this.sortManifest_ = true;
    }

    public final void addExtension(hz00 hz00Var) {
        b290 b290VarMutableCopy = this.extension_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.extension_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(hz00Var.getNumber());
    }

    public final void b0() {
        this.syncProgress_ = true;
    }

    public final void c0() {
        this.tagManifest_ = true;
    }

    public final void d0() {
        this.totalLength_ = true;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000;\u0000\u0001\u0001;;\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0007\u0015\u0007\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0007\u001e\u0007\u001f\u0007 \u0007!ဉ\u0000\"ဉ\u0001#ဉ\u0002$\u0007%\u0007&\u0007'\u0007(ဉ\u0003)\u0007*\u0007+,,\u0007-\u0007.\u0007/\u00070\u00071\u00072\u00073\u00074ဉ\u00045\u00076\u00077\u00078ဉ\u00059\u0007:\u0007;\u0007", new Object[]{"bitField0_", "rowId_", "link_", "name_", "loadState_", "loaded_", "collaborative_", "length_", "lastModification_", "totalLength_", "duration_", "description_", "picture_", "playable_", "descriptionFromAnnotate_", "pictureFromAnnotate_", "canReportAnnotationAbuse_", "followed_", "followers_", "ownedBySelf_", "offline_", "syncProgress_", "published_", "browsableOffline_", "formatListType_", "formatListAttributes_", "hasExplicitContent_", "containsSpotifyTracks_", "containsTracks_", "containsEpisodes_", "containsAudioEpisodes_", "onlyContainsExplicit_", "isOnDemandInFree_", "owner_", "madeFor_", "allows_", "numberOfEpisodes_", "numberOfTracks_", "preferLinearPlayback_", "onDemandInFreeReason_", "collaboratingUsers_", "basePermission_", "userCapabilities_", "extension_", "lenses_", "lengthIgnoringTextFilter_", "numberOfItemsPerLinkType_", "availableSignals_", "aiCurationReferenceId_", "unrangedLength_", "unfilteredLength_", "createdAt_", "availableConcepts_", "contentSignature_", "deletedByOwner_", "userCreated_", "availableLanguages_", "sortManifest_", "containsMusicVideos_", "tagManifest_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new sku0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistDecorationPolicy.class) {
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

    public final void e0() {
        this.unfilteredLength_ = true;
    }

    public final void f0() {
        this.unrangedLength_ = true;
    }

    public final void g0() {
        this.userCapabilities_ = true;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void h0() {
        this.userCreated_ = true;
    }

    public final void n(ArrayList arrayList) {
        i9 i9Var = this.extension_;
        if (!i9Var.a) {
            this.extension_ = h.mutableCopy(i9Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.extension_.c(((Integer) it.next()).intValue());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q() {
        this.aiCurationReferenceId_ = true;
    }

    public final void r(AvailableConcepts availableConcepts) {
        availableConcepts.getClass();
        this.availableConcepts_ = availableConcepts;
        this.bitField0_ |= 16;
    }

    public final void s() {
        this.availableSignals_ = true;
    }

    public final void t() {
        this.basePermission_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.canReportAnnotationAbuse_ = true;
    }

    public final void v(CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        collaboratingUsersDecorationPolicy.getClass();
        this.collaboratingUsers_ = collaboratingUsersDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void w() {
        this.collaborative_ = true;
    }

    public final void x() {
        this.containsMusicVideos_ = true;
    }

    public final void y() {
        this.createdAt_ = true;
    }

    public final void z() {
        this.deletedByOwner_ = true;
    }
}
