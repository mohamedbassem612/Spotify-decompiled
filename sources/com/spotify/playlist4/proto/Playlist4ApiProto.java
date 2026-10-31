package com.spotify.playlist4.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.lens.model.proto.LensModelProto$Lens;
import com.spotify.lens.model.proto.LensModelProto$LensState;
import com.spotify.list_collection.save_source.proto.SaveSource;
import com.spotify.playlist.proto.Capabilities;
import com.spotify.playlist_signal.model.proto.SignalModelProto$Signal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.ald;
import p.b290;
import p.b3c0;
import p.bf40;
import p.bhn0;
import p.c290;
import p.c3c0;
import p.d290;
import p.d3c0;
import p.dng0;
import p.e290;
import p.epd1;
import p.fpd1;
import p.h290;
import p.hhc;
import p.i9;
import p.jf40;
import p.kul1;
import p.lja1;
import p.lwg;
import p.mja1;
import p.oc41;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.t4f0;
import p.uz00;
import p.v190;
import p.v2j0;
import p.vl81;
import p.wl81;
import p.y190;
import p.ytl1;
import p.z190;
import spotify.list.v1.model.attributes.Sorts$SortManifest;
import spotify.list.v1.model.attributes.Sorts$SortValues;
import spotify.list.v1.model.attributes.TagsOuterClass$TagManifest;
import spotify.list.v1.model.attributes.TagsOuterClass$Tags;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Playlist4ApiProto {

    /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface AddOrBuilder extends v2j0 {
        Item getAddAfterItem();

        Item getAddBeforeItem();

        boolean getAddFirst();

        boolean getAddLast();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getFromIndex();

        Item getItems(int i);

        int getItemsCount();

        List<Item> getItemsList();

        boolean hasAddAfterItem();

        boolean hasAddBeforeItem();

        boolean hasAddFirst();

        boolean hasAddLast();

        boolean hasFromIndex();

        /* synthetic */ boolean isInitialized();
    }

    public interface AppliedLensesOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        LensModelProto$LensState getStates(int i);

        int getStatesCount();

        List<LensModelProto$LensState> getStatesList();

        /* synthetic */ boolean isInitialized();
    }

    public interface AvailableSignalsOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        SignalModelProto$Signal getSignals(int i);

        int getSignalsCount();

        List<SignalModelProto$Signal> getSignalsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface ChangeInfoOrBuilder extends v2j0 {
        boolean getAdmin();

        boolean getCompressed();

        CreationInfo getCreationInfo();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        boolean getMerge();

        boolean getMigration();

        boolean getRedo();

        long getServerTimestamp();

        SourceInfo getSource();

        int getSplitId();

        long getTimestamp();

        boolean getUndo();

        String getUser();

        phc getUserBytes();

        boolean hasAdmin();

        boolean hasCompressed();

        boolean hasCreationInfo();

        boolean hasMerge();

        boolean hasMigration();

        boolean hasRedo();

        boolean hasServerTimestamp();

        boolean hasSource();

        boolean hasSplitId();

        boolean hasTimestamp();

        boolean hasUndo();

        boolean hasUser();

        /* synthetic */ boolean isInitialized();
    }

    public interface CreateListReplyOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        phc getRevision();

        String getUri();

        phc getUriBytes();

        boolean hasRevision();

        boolean hasUri();

        /* synthetic */ boolean isInitialized();
    }

    public interface CreationInfoOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        CreationInfo.OriginType getOriginType();

        String getOriginUri();

        phc getOriginUriBytes();

        boolean hasOriginType();

        boolean hasOriginUri();

        /* synthetic */ boolean isInitialized();
    }

    public interface DeltaOrBuilder extends v2j0 {
        phc getBaseVersion();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        ChangeInfo getInfo();

        Op getOps(int i);

        int getOpsCount();

        List<Op> getOpsList();

        boolean hasBaseVersion();

        boolean hasInfo();

        /* synthetic */ boolean isInitialized();
    }

    public interface DiffOrBuilder extends v2j0 {
        AvailableSignals getAvailableSignals();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        phc getFromRevision();

        Op getOps(int i);

        int getOpsCount();

        List<Op> getOpsList();

        phc getToRevision();

        boolean hasAvailableSignals();

        boolean hasFromRevision();

        boolean hasToRevision();

        /* synthetic */ boolean isInitialized();
    }

    public interface FormatListAttributeOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getKey();

        phc getKeyBytes();

        String getValue();

        phc getValueBytes();

        boolean hasKey();

        boolean hasValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface ItemAttributesOrBuilder extends v2j0 {
        String getAddedBy();

        phc getAddedByBytes();

        SignalModelProto$Signal getAvailableSignals(int i);

        int getAvailableSignalsCount();

        List<SignalModelProto$Signal> getAvailableSignalsList();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        FormatListAttribute getFormatAttributes(int i);

        int getFormatAttributesCount();

        List<FormatListAttribute> getFormatAttributesList();

        phc getItemId();

        boolean getPublic();

        RecommendationInfo getRecommendationInfo();

        SaveSource getSaveSource();

        long getSeenAt();

        phc getSequenceChildTemplate();

        Sorts$SortValues getSortValues();

        LensModelProto$Lens getSourceLens();

        TagsOuterClass$Tags getTags();

        long getTimestamp();

        boolean hasAddedBy();

        boolean hasItemId();

        boolean hasPublic();

        boolean hasRecommendationInfo();

        boolean hasSaveSource();

        boolean hasSeenAt();

        boolean hasSequenceChildTemplate();

        boolean hasSortValues();

        boolean hasSourceLens();

        boolean hasTags();

        boolean hasTimestamp();

        /* synthetic */ boolean isInitialized();
    }

    public interface ItemAttributesPartialStateOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        ItemAttributeKind getNoValue(int i);

        int getNoValueCount();

        List<ItemAttributeKind> getNoValueList();

        ItemAttributes getValues();

        boolean hasValues();

        /* synthetic */ boolean isInitialized();
    }

    public interface ItemOrBuilder extends v2j0 {
        ItemAttributes getAttributes();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getUri();

        phc getUriBytes();

        boolean hasAttributes();

        boolean hasUri();

        /* synthetic */ boolean isInitialized();
    }

    public interface ListAttributesOrBuilder extends v2j0 {
        phc getAiCurationReferenceId();

        String getClientId();

        phc getClientIdBytes();

        boolean getCollaborative();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        boolean getDeletedByOwner();

        String getDescription();

        phc getDescriptionBytes();

        String getFormat();

        FormatListAttribute getFormatAttributes(int i);

        int getFormatAttributesCount();

        List<FormatListAttribute> getFormatAttributesList();

        phc getFormatBytes();

        boolean getIsUserCreated();

        ItemIdAlgorithm getItemIdAlgorithm();

        String getName();

        phc getNameBytes();

        phc getPicture();

        PictureSize getPictureSize(int i);

        int getPictureSizeCount();

        List<PictureSize> getPictureSizeList();

        String getPl3Version();

        phc getPl3VersionBytes();

        boolean getRecoverable();

        phc getSequenceContextTemplate();

        Sorts$SortManifest getSortManifest();

        TagsOuterClass$TagManifest getTagManifest();

        boolean hasAiCurationReferenceId();

        boolean hasClientId();

        boolean hasCollaborative();

        boolean hasDeletedByOwner();

        boolean hasDescription();

        boolean hasFormat();

        boolean hasIsUserCreated();

        boolean hasItemIdAlgorithm();

        boolean hasName();

        boolean hasPicture();

        boolean hasPl3Version();

        boolean hasRecoverable();

        boolean hasSequenceContextTemplate();

        boolean hasSortManifest();

        boolean hasTagManifest();

        /* synthetic */ boolean isInitialized();
    }

    public interface ListAttributesPartialStateOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        ListAttributeKind getNoValue(int i);

        int getNoValueCount();

        List<ListAttributeKind> getNoValueList();

        ListAttributes getValues();

        boolean hasValues();

        /* synthetic */ boolean isInitialized();
    }

    public interface ListChangesOrBuilder extends v2j0 {
        phc getBaseRevision();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        Delta getDeltas(int i);

        int getDeltasCount();

        List<Delta> getDeltasList();

        long getNonces(int i);

        int getNoncesCount();

        List<Long> getNoncesList();

        boolean getWantResultingRevisions();

        boolean getWantSyncResult();

        boolean hasBaseRevision();

        boolean hasWantResultingRevisions();

        boolean hasWantSyncResult();

        /* synthetic */ boolean isInitialized();
    }

    public interface ListItemsOrBuilder extends v2j0 {
        SignalModelProto$Signal getAvailableSignals(int i);

        int getAvailableSignalsCount();

        List<SignalModelProto$Signal> getAvailableSignalsList();

        @Deprecated
        String getContinuationToken();

        @Deprecated
        phc getContinuationTokenBytes();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        Item getItems(int i);

        int getItemsCount();

        List<Item> getItemsList();

        Item getLensRemovedItems(int i);

        int getLensRemovedItemsCount();

        List<Item> getLensRemovedItemsList();

        MetaItem getMetaItems(int i);

        int getMetaItemsCount();

        List<MetaItem> getMetaItemsList();

        int getPos();

        boolean getTruncated();

        @Deprecated
        boolean hasContinuationToken();

        boolean hasPos();

        boolean hasTruncated();

        /* synthetic */ boolean isInitialized();
    }

    public interface ListSignalsOrBuilder extends v2j0 {
        phc getBaseRevision();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        SignalModelProto$Signal getEmittedSignals(int i);

        int getEmittedSignalsCount();

        List<SignalModelProto$Signal> getEmittedSignalsList();

        boolean getWantContentOnError();

        boolean hasBaseRevision();

        boolean hasWantContentOnError();

        /* synthetic */ boolean isInitialized();
    }

    public interface ListUpdateRequestOrBuilder extends v2j0 {
        ListAttributes getAttributes();

        phc getBaseRevision();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        ChangeInfo getInfo();

        Item getItems(int i);

        int getItemsCount();

        List<Item> getItemsList();

        boolean hasAttributes();

        boolean hasBaseRevision();

        boolean hasInfo();

        /* synthetic */ boolean isInitialized();
    }

    public interface MetaItemOrBuilder extends v2j0 {
        boolean getAbuseReportingEnabled();

        ListAttributes getAttributes();

        Capabilities getCapabilities();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        GeoblockBlockingType getGeoblock(int i);

        int getGeoblockCount();

        List<GeoblockBlockingType> getGeoblockList();

        int getLength();

        String getOwnerUsername();

        phc getOwnerUsernameBytes();

        phc getRevision();

        int getStatusCode();

        long getTimestamp();

        boolean hasAbuseReportingEnabled();

        boolean hasAttributes();

        boolean hasCapabilities();

        boolean hasLength();

        boolean hasOwnerUsername();

        boolean hasRevision();

        boolean hasStatusCode();

        boolean hasTimestamp();

        /* synthetic */ boolean isInitialized();
    }

    public interface MovOrBuilder extends v2j0 {
        Item getAddAfterItem();

        Item getAddBeforeItem();

        boolean getAddFirst();

        boolean getAddLast();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getFromIndex();

        Item getItems(int i);

        int getItemsCount();

        List<Item> getItemsList();

        int getLength();

        int getToIndex();

        boolean hasAddAfterItem();

        boolean hasAddBeforeItem();

        boolean hasAddFirst();

        boolean hasAddLast();

        boolean hasFromIndex();

        boolean hasLength();

        boolean hasToIndex();

        /* synthetic */ boolean isInitialized();
    }

    public interface OpListOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        Op getOps(int i);

        int getOpsCount();

        List<Op> getOpsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface OpOrBuilder extends v2j0 {
        Add getAdd();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        Op.Kind getKind();

        Mov getMov();

        Rem getRem();

        UpdateItemAttributes getUpdateItemAttributes();

        UpdateItemUris getUpdateItemUris();

        UpdateListAttributes getUpdateListAttributes();

        boolean hasAdd();

        boolean hasKind();

        boolean hasMov();

        boolean hasRem();

        boolean hasUpdateItemAttributes();

        boolean hasUpdateItemUris();

        boolean hasUpdateListAttributes();

        /* synthetic */ boolean isInitialized();
    }

    public interface PaginatedUnfollowedListItemsOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        UnfollowedListItem getItems(int i);

        int getItemsCount();

        List<UnfollowedListItem> getItemsList();

        int getLimit();

        int getNextPageIndex();

        int getOffset();

        int getPreviousPageIndex();

        int getTotalPages();

        boolean hasLimit();

        boolean hasNextPageIndex();

        boolean hasOffset();

        boolean hasPreviousPageIndex();

        boolean hasTotalPages();

        /* synthetic */ boolean isInitialized();
    }

    public interface PartnerInfoOrBuilder extends v2j0 {
        boolean containsData(String str);

        @Deprecated
        Map<String, String> getData();

        int getDataCount();

        Map<String, String> getDataMap();

        String getDataOrDefault(String str, String str2);

        String getDataOrThrow(String str);

        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface PictureSizeOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getTargetName();

        phc getTargetNameBytes();

        String getUrl();

        phc getUrlBytes();

        boolean hasTargetName();

        boolean hasUrl();

        /* synthetic */ boolean isInitialized();
    }

    public interface PlaylistUriResolverResponseOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        ResolvedPersonalizedPlaylist getResolvedPlaylists(int i);

        int getResolvedPlaylistsCount();

        List<ResolvedPersonalizedPlaylist> getResolvedPlaylistsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface PlaylistV1UriReplyOrBuilder extends v2j0 {
        boolean containsV2UriToV1Uri(String str);

        /* synthetic */ s2j0 getDefaultInstanceForType();

        @Deprecated
        Map<String, String> getV2UriToV1Uri();

        int getV2UriToV1UriCount();

        Map<String, String> getV2UriToV1UriMap();

        String getV2UriToV1UriOrDefault(String str, String str2);

        String getV2UriToV1UriOrThrow(String str);

        /* synthetic */ boolean isInitialized();
    }

    public interface PlaylistV1UriRequestOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getV2Uris(int i);

        phc getV2UrisBytes(int i);

        int getV2UrisCount();

        List<String> getV2UrisList();

        /* synthetic */ boolean isInitialized();
    }

    public interface RecommendationInfoOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        boolean getIsRecommendation();

        boolean hasIsRecommendation();

        /* synthetic */ boolean isInitialized();
    }

    public interface RegisterPlaylistImageRequestOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getUploadToken();

        phc getUploadTokenBytes();

        boolean hasUploadToken();

        /* synthetic */ boolean isInitialized();
    }

    public interface RegisterPlaylistImageResponseOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        phc getPicture();

        boolean hasPicture();

        /* synthetic */ boolean isInitialized();
    }

    public interface RemOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getFromIndex();

        Item getItems(int i);

        boolean getItemsAsKey();

        int getItemsCount();

        List<Item> getItemsList();

        int getLength();

        boolean hasFromIndex();

        boolean hasItemsAsKey();

        boolean hasLength();

        /* synthetic */ boolean isInitialized();
    }

    public interface ResolvedPersonalizedPlaylistOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getTag();

        phc getTagBytes();

        String getUri();

        phc getUriBytes();

        boolean hasTag();

        boolean hasUri();

        /* synthetic */ boolean isInitialized();
    }

    public interface SelectedListContentOrBuilder extends v2j0 {
        boolean getAbuseReportingEnabled();

        AppliedLenses getAppliedLenses();

        ListAttributes getAttributes();

        Capabilities getCapabilities();

        boolean getChangesRequireResync();

        ListItems getContents();

        long getCreatedAt();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        Diff getDiff();

        GeoblockBlockingType getGeoblock(int i);

        int getGeoblockCount();

        List<GeoblockBlockingType> getGeoblockList();

        boolean getIsUserCreated();

        int getLength();

        boolean getMultipleHeads();

        long getNonces(int i);

        int getNoncesCount();

        List<Long> getNoncesList();

        String getOwnerUsername();

        phc getOwnerUsernameBytes();

        phc getResultingRevisions(int i);

        int getResultingRevisionsCount();

        List<phc> getResultingRevisionsList();

        phc getRevision();

        SignalResult getSignalResults();

        Diff getSyncResult();

        long getTimestamp();

        boolean getUpToDate();

        boolean hasAbuseReportingEnabled();

        boolean hasAppliedLenses();

        boolean hasAttributes();

        boolean hasCapabilities();

        boolean hasChangesRequireResync();

        boolean hasContents();

        boolean hasCreatedAt();

        boolean hasDiff();

        boolean hasIsUserCreated();

        boolean hasLength();

        boolean hasMultipleHeads();

        boolean hasOwnerUsername();

        boolean hasRevision();

        boolean hasSignalResults();

        boolean hasSyncResult();

        boolean hasTimestamp();

        boolean hasUpToDate();

        /* synthetic */ boolean isInitialized();
    }

    public interface SignalResultOrBuilder extends v2j0 {
        boolean containsSignalStatuses(String str);

        /* synthetic */ s2j0 getDefaultInstanceForType();

        @Deprecated
        Map<String, SignalStatus> getSignalStatuses();

        int getSignalStatusesCount();

        Map<String, SignalStatus> getSignalStatusesMap();

        SignalStatus getSignalStatusesOrDefault(String str, SignalStatus signalStatus);

        SignalStatus getSignalStatusesOrThrow(String str);

        /* synthetic */ boolean isInitialized();
    }

    public interface SignalStatusOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getStatusCode();

        String getStatusDetails();

        phc getStatusDetailsBytes();

        phc getStatusPayload();

        boolean hasStatusCode();

        boolean hasStatusDetails();

        boolean hasStatusPayload();

        /* synthetic */ boolean isInitialized();
    }

    public interface SourceInfoOrBuilder extends v2j0 {
        String getApp();

        phc getAppBytes();

        SourceInfo.Client getClient();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        PartnerInfo getPartnerInfo();

        String getServerDomain();

        phc getServerDomainBytes();

        String getSource();

        phc getSourceBytes();

        String getVersion();

        phc getVersionBytes();

        boolean hasApp();

        boolean hasClient();

        boolean hasPartnerInfo();

        boolean hasServerDomain();

        boolean hasSource();

        boolean hasVersion();

        /* synthetic */ boolean isInitialized();
    }

    public interface UnfollowedListItemOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        long getDeletedAt();

        int getLength();

        String getName();

        phc getNameBytes();

        boolean getRecoverable();

        String getUri();

        phc getUriBytes();

        boolean hasDeletedAt();

        boolean hasLength();

        boolean hasName();

        boolean hasRecoverable();

        boolean hasUri();

        /* synthetic */ boolean isInitialized();
    }

    public interface UpdateItemAttributesOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getIndex();

        Item getItem();

        ItemAttributesPartialState getNewAttributes();

        ItemAttributesPartialState getOldAttributes();

        boolean hasIndex();

        boolean hasItem();

        boolean hasNewAttributes();

        boolean hasOldAttributes();

        /* synthetic */ boolean isInitialized();
    }

    public interface UpdateItemUrisOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        UriReplacement getUriReplacements(int i);

        int getUriReplacementsCount();

        List<UriReplacement> getUriReplacementsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface UpdateListAttributesOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        ListAttributesPartialState getNewAttributes();

        ListAttributesPartialState getOldAttributes();

        boolean hasNewAttributes();

        boolean hasOldAttributes();

        /* synthetic */ boolean isInitialized();
    }

    public interface UriReplacementOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getIndex();

        Item getItem();

        String getNewUri();

        phc getNewUriBytes();

        boolean hasIndex();

        boolean hasItem();

        boolean hasNewUri();

        /* synthetic */ boolean isInitialized();
    }

    private Playlist4ApiProto() {
    }

    public static final class CreationInfo extends h implements CreationInfoOrBuilder {
        private static final CreationInfo DEFAULT_INSTANCE;
        public static final int ORIGIN_TYPE_FIELD_NUMBER = 1;
        public static final int ORIGIN_URI_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private int originType_;
        private String originUri_ = "";

        static {
            CreationInfo creationInfo = new CreationInfo();
            DEFAULT_INSTANCE = creationInfo;
            h.registerDefaultInstance(CreationInfo.class, creationInfo);
        }

        private CreationInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOriginType() {
            this.bitField0_ &= -2;
            this.originType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOriginUri() {
            this.bitField0_ &= -3;
            this.originUri_ = DEFAULT_INSTANCE.originUri_;
        }

        public static CreationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreationInfo parseDelimitedFrom(InputStream inputStream) {
            return (CreationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreationInfo parseFrom(ByteBuffer byteBuffer) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginType(OriginType originType) {
            this.originType_ = originType.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginUri(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.originUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginUriBytes(phc phcVar) {
            this.originUri_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                OriginType originType = OriginType.ORIGIN_TYPE_UNSPECIFIED;
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "originType_", OriginType.OriginTypeVerifier.INSTANCE, "originUri_"});
            }
            if (iOrdinal == 3) {
                return new CreationInfo();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (CreationInfo.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
        public final OriginType getOriginType() {
            OriginType originTypeForNumber = OriginType.forNumber(this.originType_);
            return originTypeForNumber == null ? OriginType.ORIGIN_TYPE_UNSPECIFIED : originTypeForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
        public final String getOriginUri() {
            return this.originUri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
        public final phc getOriginUriBytes() {
            return phc.i(this.originUri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
        public final boolean hasOriginType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
        public final boolean hasOriginUri() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public enum OriginType implements v190 {
            ORIGIN_TYPE_UNSPECIFIED(0),
            ORIGIN_TYPE_FRESH(1),
            ORIGIN_TYPE_CLONED(2),
            ORIGIN_TYPE_AGENTIC(3);

            public static final int ORIGIN_TYPE_AGENTIC_VALUE = 3;
            public static final int ORIGIN_TYPE_CLONED_VALUE = 2;
            public static final int ORIGIN_TYPE_FRESH_VALUE = 1;
            public static final int ORIGIN_TYPE_UNSPECIFIED_VALUE = 0;
            private static final y190 internalValueMap = new AnonymousClass1();
            private final int value;

            public static final class OriginTypeVerifier implements z190 {
                static final z190 INSTANCE = new OriginTypeVerifier();

                private OriginTypeVerifier() {
                }

                public final boolean isInRange(int i) {
                    return OriginType.forNumber(i) != null;
                }
            }

            OriginType(int i) {
                this.value = i;
            }

            public static OriginType forNumber(int i) {
                if (i == 0) {
                    return ORIGIN_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return ORIGIN_TYPE_FRESH;
                }
                if (i == 2) {
                    return ORIGIN_TYPE_CLONED;
                }
                if (i != 3) {
                    return null;
                }
                return ORIGIN_TYPE_AGENTIC;
            }

            public static y190 internalGetValueMap() {
                return internalValueMap;
            }

            public static z190 internalGetVerifier() {
                return OriginTypeVerifier.INSTANCE;
            }

            public final int getNumber() {
                return this.value;
            }

            /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$CreationInfo$OriginType$1, reason: invalid class name */
            public class AnonymousClass1 implements y190 {
                public final OriginType findValueByNumber(int i) {
                    return OriginType.forNumber(i);
                }

                /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
                public final v190 m625findValueByNumber(int i) {
                    return OriginType.forNumber(i);
                }
            }

            @Deprecated
            public static OriginType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends g implements CreationInfoOrBuilder {
            private Builder() {
                super(CreationInfo.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearOriginType() {
                copyOnWrite();
                ((CreationInfo) ((g) this).instance).clearOriginType();
                return this;
            }

            public final Builder clearOriginUri() {
                copyOnWrite();
                ((CreationInfo) ((g) this).instance).clearOriginUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
            public final OriginType getOriginType() {
                return ((CreationInfo) ((g) this).instance).getOriginType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
            public final String getOriginUri() {
                return ((CreationInfo) ((g) this).instance).getOriginUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
            public final phc getOriginUriBytes() {
                return ((CreationInfo) ((g) this).instance).getOriginUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
            public final boolean hasOriginType() {
                return ((CreationInfo) ((g) this).instance).hasOriginType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreationInfoOrBuilder
            public final boolean hasOriginUri() {
                return ((CreationInfo) ((g) this).instance).hasOriginUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m622mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setOriginType(OriginType originType) {
                copyOnWrite();
                ((CreationInfo) ((g) this).instance).setOriginType(originType);
                return this;
            }

            public final Builder setOriginUri(String str) {
                copyOnWrite();
                ((CreationInfo) ((g) this).instance).setOriginUri(str);
                return this;
            }

            public final Builder setOriginUriBytes(phc phcVar) {
                copyOnWrite();
                ((CreationInfo) ((g) this).instance).setOriginUriBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m621clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m623mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m620clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m624mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(CreationInfo creationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(creationInfo);
        }

        public static CreationInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (CreationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static CreationInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static CreationInfo parseFrom(phc phcVar) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static CreationInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static CreationInfo parseFrom(byte[] bArr) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreationInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static CreationInfo parseFrom(InputStream inputStream) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreationInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static CreationInfo parseFrom(lwg lwgVar) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static CreationInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (CreationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Op extends h implements OpOrBuilder {
        public static final int ADD_FIELD_NUMBER = 2;
        private static final Op DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        public static final int MOV_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int REM_FIELD_NUMBER = 3;
        public static final int UPDATE_ITEM_ATTRIBUTES_FIELD_NUMBER = 5;
        public static final int UPDATE_ITEM_URIS_FIELD_NUMBER = 7;
        public static final int UPDATE_LIST_ATTRIBUTES_FIELD_NUMBER = 6;
        private Add add_;
        private int bitField0_;
        private int kind_;
        private byte memoizedIsInitialized = 2;
        private Mov mov_;
        private Rem rem_;
        private UpdateItemAttributes updateItemAttributes_;
        private UpdateItemUris updateItemUris_;
        private UpdateListAttributes updateListAttributes_;

        static {
            Op op = new Op();
            DEFAULT_INSTANCE = op;
            h.registerDefaultInstance(Op.class, op);
        }

        private Op() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdd() {
            this.add_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKind() {
            this.bitField0_ &= -2;
            this.kind_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMov() {
            this.mov_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRem() {
            this.rem_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateItemAttributes() {
            this.updateItemAttributes_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateItemUris() {
            this.updateItemUris_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateListAttributes() {
            this.updateListAttributes_ = null;
            this.bitField0_ &= -33;
        }

        public static Op getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdd(Add add) {
            add.getClass();
            Add add2 = this.add_;
            if (add2 == null || add2 == Add.getDefaultInstance()) {
                this.add_ = add;
            } else {
                this.add_ = (Add) ((Add.Builder) Add.newBuilder(this.add_).mergeFrom(add)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMov(Mov mov) {
            mov.getClass();
            Mov mov2 = this.mov_;
            if (mov2 == null || mov2 == Mov.getDefaultInstance()) {
                this.mov_ = mov;
            } else {
                this.mov_ = (Mov) ((Mov.Builder) Mov.newBuilder(this.mov_).mergeFrom(mov)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRem(Rem rem) {
            rem.getClass();
            Rem rem2 = this.rem_;
            if (rem2 == null || rem2 == Rem.getDefaultInstance()) {
                this.rem_ = rem;
            } else {
                this.rem_ = (Rem) ((Rem.Builder) Rem.newBuilder(this.rem_).mergeFrom(rem)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpdateItemAttributes(UpdateItemAttributes updateItemAttributes) {
            updateItemAttributes.getClass();
            UpdateItemAttributes updateItemAttributes2 = this.updateItemAttributes_;
            if (updateItemAttributes2 == null || updateItemAttributes2 == UpdateItemAttributes.getDefaultInstance()) {
                this.updateItemAttributes_ = updateItemAttributes;
            } else {
                this.updateItemAttributes_ = (UpdateItemAttributes) ((UpdateItemAttributes.Builder) UpdateItemAttributes.newBuilder(this.updateItemAttributes_).mergeFrom(updateItemAttributes)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpdateItemUris(UpdateItemUris updateItemUris) {
            updateItemUris.getClass();
            UpdateItemUris updateItemUris2 = this.updateItemUris_;
            if (updateItemUris2 == null || updateItemUris2 == UpdateItemUris.getDefaultInstance()) {
                this.updateItemUris_ = updateItemUris;
            } else {
                this.updateItemUris_ = (UpdateItemUris) ((UpdateItemUris.Builder) UpdateItemUris.newBuilder(this.updateItemUris_).mergeFrom(updateItemUris)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpdateListAttributes(UpdateListAttributes updateListAttributes) {
            updateListAttributes.getClass();
            UpdateListAttributes updateListAttributes2 = this.updateListAttributes_;
            if (updateListAttributes2 == null || updateListAttributes2 == UpdateListAttributes.getDefaultInstance()) {
                this.updateListAttributes_ = updateListAttributes;
            } else {
                this.updateListAttributes_ = (UpdateListAttributes) ((UpdateListAttributes.Builder) UpdateListAttributes.newBuilder(this.updateListAttributes_).mergeFrom(updateListAttributes)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Op parseDelimitedFrom(InputStream inputStream) {
            return (Op) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Op parseFrom(ByteBuffer byteBuffer) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdd(Add add) {
            add.getClass();
            this.add_ = add;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKind(Kind kind) {
            this.kind_ = kind.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMov(Mov mov) {
            mov.getClass();
            this.mov_ = mov;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRem(Rem rem) {
            rem.getClass();
            this.rem_ = rem;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateItemAttributes(UpdateItemAttributes updateItemAttributes) {
            updateItemAttributes.getClass();
            this.updateItemAttributes_ = updateItemAttributes;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateItemUris(UpdateItemUris updateItemUris) {
            updateItemUris.getClass();
            this.updateItemUris_ = updateItemUris;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateListAttributes(UpdateListAttributes updateListAttributes) {
            updateListAttributes.getClass();
            this.updateListAttributes_ = updateListAttributes;
            this.bitField0_ |= 32;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    Kind kind = Kind.KIND_UNKNOWN;
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᴌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"bitField0_", "kind_", Kind.KindVerifier.INSTANCE, "add_", "rem_", "mov_", "updateItemAttributes_", "updateListAttributes_", "updateItemUris_"});
                case 3:
                    return new Op();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Op.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final Add getAdd() {
            Add add = this.add_;
            return add == null ? Add.getDefaultInstance() : add;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final Kind getKind() {
            Kind kindForNumber = Kind.forNumber(this.kind_);
            return kindForNumber == null ? Kind.KIND_UNKNOWN : kindForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final Mov getMov() {
            Mov mov = this.mov_;
            return mov == null ? Mov.getDefaultInstance() : mov;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final Rem getRem() {
            Rem rem = this.rem_;
            return rem == null ? Rem.getDefaultInstance() : rem;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final UpdateItemAttributes getUpdateItemAttributes() {
            UpdateItemAttributes updateItemAttributes = this.updateItemAttributes_;
            return updateItemAttributes == null ? UpdateItemAttributes.getDefaultInstance() : updateItemAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final UpdateItemUris getUpdateItemUris() {
            UpdateItemUris updateItemUris = this.updateItemUris_;
            return updateItemUris == null ? UpdateItemUris.getDefaultInstance() : updateItemUris;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final UpdateListAttributes getUpdateListAttributes() {
            UpdateListAttributes updateListAttributes = this.updateListAttributes_;
            return updateListAttributes == null ? UpdateListAttributes.getDefaultInstance() : updateListAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasAdd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasKind() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasMov() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasRem() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasUpdateItemAttributes() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasUpdateItemUris() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
        public final boolean hasUpdateListAttributes() {
            return (this.bitField0_ & 32) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public enum Kind implements v190 {
            KIND_UNKNOWN(0),
            ADD(2),
            REM(3),
            MOV(4),
            UPDATE_ITEM_ATTRIBUTES(5),
            UPDATE_LIST_ATTRIBUTES(6),
            UPDATE_ITEM_URIS(7);

            public static final int ADD_VALUE = 2;
            public static final int KIND_UNKNOWN_VALUE = 0;
            public static final int MOV_VALUE = 4;
            public static final int REM_VALUE = 3;
            public static final int UPDATE_ITEM_ATTRIBUTES_VALUE = 5;
            public static final int UPDATE_ITEM_URIS_VALUE = 7;
            public static final int UPDATE_LIST_ATTRIBUTES_VALUE = 6;
            private static final y190 internalValueMap = new AnonymousClass1();
            private final int value;

            public static final class KindVerifier implements z190 {
                static final z190 INSTANCE = new KindVerifier();

                private KindVerifier() {
                }

                public final boolean isInRange(int i) {
                    return Kind.forNumber(i) != null;
                }
            }

            Kind(int i) {
                this.value = i;
            }

            public static Kind forNumber(int i) {
                if (i == 0) {
                    return KIND_UNKNOWN;
                }
                switch (i) {
                    case 2:
                        return ADD;
                    case 3:
                        return REM;
                    case 4:
                        return MOV;
                    case 5:
                        return UPDATE_ITEM_ATTRIBUTES;
                    case 6:
                        return UPDATE_LIST_ATTRIBUTES;
                    case 7:
                        return UPDATE_ITEM_URIS;
                    default:
                        return null;
                }
            }

            public static y190 internalGetValueMap() {
                return internalValueMap;
            }

            public static z190 internalGetVerifier() {
                return KindVerifier.INSTANCE;
            }

            public final int getNumber() {
                return this.value;
            }

            /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$Op$Kind$1, reason: invalid class name */
            public class AnonymousClass1 implements y190 {
                public final Kind findValueByNumber(int i) {
                    return Kind.forNumber(i);
                }

                /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
                public final v190 m708findValueByNumber(int i) {
                    return Kind.forNumber(i);
                }
            }

            @Deprecated
            public static Kind valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends g implements OpOrBuilder {
            private Builder() {
                super(Op.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAdd() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearAdd();
                return this;
            }

            public final Builder clearKind() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearKind();
                return this;
            }

            public final Builder clearMov() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearMov();
                return this;
            }

            public final Builder clearRem() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearRem();
                return this;
            }

            public final Builder clearUpdateItemAttributes() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearUpdateItemAttributes();
                return this;
            }

            public final Builder clearUpdateItemUris() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearUpdateItemUris();
                return this;
            }

            public final Builder clearUpdateListAttributes() {
                copyOnWrite();
                ((Op) ((g) this).instance).clearUpdateListAttributes();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final Add getAdd() {
                return ((Op) ((g) this).instance).getAdd();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final Kind getKind() {
                return ((Op) ((g) this).instance).getKind();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final Mov getMov() {
                return ((Op) ((g) this).instance).getMov();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final Rem getRem() {
                return ((Op) ((g) this).instance).getRem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final UpdateItemAttributes getUpdateItemAttributes() {
                return ((Op) ((g) this).instance).getUpdateItemAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final UpdateItemUris getUpdateItemUris() {
                return ((Op) ((g) this).instance).getUpdateItemUris();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final UpdateListAttributes getUpdateListAttributes() {
                return ((Op) ((g) this).instance).getUpdateListAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasAdd() {
                return ((Op) ((g) this).instance).hasAdd();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasKind() {
                return ((Op) ((g) this).instance).hasKind();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasMov() {
                return ((Op) ((g) this).instance).hasMov();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasRem() {
                return ((Op) ((g) this).instance).hasRem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasUpdateItemAttributes() {
                return ((Op) ((g) this).instance).hasUpdateItemAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasUpdateItemUris() {
                return ((Op) ((g) this).instance).hasUpdateItemUris();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpOrBuilder
            public final boolean hasUpdateListAttributes() {
                return ((Op) ((g) this).instance).hasUpdateListAttributes();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAdd(Add add) {
                copyOnWrite();
                ((Op) ((g) this).instance).mergeAdd(add);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m705mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeMov(Mov mov) {
                copyOnWrite();
                ((Op) ((g) this).instance).mergeMov(mov);
                return this;
            }

            public final Builder mergeRem(Rem rem) {
                copyOnWrite();
                ((Op) ((g) this).instance).mergeRem(rem);
                return this;
            }

            public final Builder mergeUpdateItemAttributes(UpdateItemAttributes updateItemAttributes) {
                copyOnWrite();
                ((Op) ((g) this).instance).mergeUpdateItemAttributes(updateItemAttributes);
                return this;
            }

            public final Builder mergeUpdateItemUris(UpdateItemUris updateItemUris) {
                copyOnWrite();
                ((Op) ((g) this).instance).mergeUpdateItemUris(updateItemUris);
                return this;
            }

            public final Builder mergeUpdateListAttributes(UpdateListAttributes updateListAttributes) {
                copyOnWrite();
                ((Op) ((g) this).instance).mergeUpdateListAttributes(updateListAttributes);
                return this;
            }

            public final Builder setAdd(Add.Builder builder) {
                copyOnWrite();
                ((Op) ((g) this).instance).setAdd((Add) builder.build());
                return this;
            }

            public final Builder setKind(Kind kind) {
                copyOnWrite();
                ((Op) ((g) this).instance).setKind(kind);
                return this;
            }

            public final Builder setMov(Mov.Builder builder) {
                copyOnWrite();
                ((Op) ((g) this).instance).setMov((Mov) builder.build());
                return this;
            }

            public final Builder setRem(Rem.Builder builder) {
                copyOnWrite();
                ((Op) ((g) this).instance).setRem((Rem) builder.build());
                return this;
            }

            public final Builder setUpdateItemAttributes(UpdateItemAttributes.Builder builder) {
                copyOnWrite();
                ((Op) ((g) this).instance).setUpdateItemAttributes((UpdateItemAttributes) builder.build());
                return this;
            }

            public final Builder setUpdateItemUris(UpdateItemUris.Builder builder) {
                copyOnWrite();
                ((Op) ((g) this).instance).setUpdateItemUris((UpdateItemUris) builder.build());
                return this;
            }

            public final Builder setUpdateListAttributes(UpdateListAttributes.Builder builder) {
                copyOnWrite();
                ((Op) ((g) this).instance).setUpdateListAttributes((UpdateListAttributes) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m704clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m706mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m703clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m707mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAdd(Add add) {
                copyOnWrite();
                ((Op) ((g) this).instance).setAdd(add);
                return this;
            }

            public final Builder setMov(Mov mov) {
                copyOnWrite();
                ((Op) ((g) this).instance).setMov(mov);
                return this;
            }

            public final Builder setRem(Rem rem) {
                copyOnWrite();
                ((Op) ((g) this).instance).setRem(rem);
                return this;
            }

            public final Builder setUpdateItemAttributes(UpdateItemAttributes updateItemAttributes) {
                copyOnWrite();
                ((Op) ((g) this).instance).setUpdateItemAttributes(updateItemAttributes);
                return this;
            }

            public final Builder setUpdateItemUris(UpdateItemUris updateItemUris) {
                copyOnWrite();
                ((Op) ((g) this).instance).setUpdateItemUris(updateItemUris);
                return this;
            }

            public final Builder setUpdateListAttributes(UpdateListAttributes updateListAttributes) {
                copyOnWrite();
                ((Op) ((g) this).instance).setUpdateListAttributes(updateListAttributes);
                return this;
            }
        }

        public static Builder newBuilder(Op op) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(op);
        }

        public static Op parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Op) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Op parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Op parseFrom(phc phcVar) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Op parseFrom(phc phcVar, uz00 uz00Var) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static Op parseFrom(byte[] bArr) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Op parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Op parseFrom(InputStream inputStream) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Op parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Op parseFrom(lwg lwgVar) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Op parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Op) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class SourceInfo extends h implements SourceInfoOrBuilder {
        public static final int APP_FIELD_NUMBER = 3;
        public static final int CLIENT_FIELD_NUMBER = 1;
        private static final SourceInfo DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PARTNER_INFO_FIELD_NUMBER = 7;
        public static final int SERVER_DOMAIN_FIELD_NUMBER = 6;
        public static final int SOURCE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 5;
        private int bitField0_;
        private int client_;
        private PartnerInfo partnerInfo_;
        private String app_ = "";
        private String source_ = "";
        private String version_ = "";
        private String serverDomain_ = "";

        static {
            SourceInfo sourceInfo = new SourceInfo();
            DEFAULT_INSTANCE = sourceInfo;
            h.registerDefaultInstance(SourceInfo.class, sourceInfo);
        }

        private SourceInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApp() {
            this.bitField0_ &= -3;
            this.app_ = DEFAULT_INSTANCE.app_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClient() {
            this.bitField0_ &= -2;
            this.client_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPartnerInfo() {
            this.partnerInfo_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerDomain() {
            this.bitField0_ &= -17;
            this.serverDomain_ = DEFAULT_INSTANCE.serverDomain_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.bitField0_ &= -5;
            this.source_ = DEFAULT_INSTANCE.source_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -9;
            this.version_ = DEFAULT_INSTANCE.version_;
        }

        public static SourceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePartnerInfo(PartnerInfo partnerInfo) {
            partnerInfo.getClass();
            PartnerInfo partnerInfo2 = this.partnerInfo_;
            if (partnerInfo2 == null || partnerInfo2 == PartnerInfo.getDefaultInstance()) {
                this.partnerInfo_ = partnerInfo;
            } else {
                this.partnerInfo_ = (PartnerInfo) ((PartnerInfo.Builder) PartnerInfo.newBuilder(this.partnerInfo_).mergeFrom(partnerInfo)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SourceInfo parseDelimitedFrom(InputStream inputStream) {
            return (SourceInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceInfo parseFrom(ByteBuffer byteBuffer) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApp(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.app_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppBytes(phc phcVar) {
            this.app_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClient(Client client) {
            this.client_ = client.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPartnerInfo(PartnerInfo partnerInfo) {
            partnerInfo.getClass();
            this.partnerInfo_ = partnerInfo;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerDomain(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.serverDomain_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerDomainBytes(phc phcVar) {
            this.serverDomain_ = phcVar.v();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(phc phcVar) {
            this.source_ = phcVar.v();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(phc phcVar) {
            this.version_ = phcVar.v();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                Client client = Client.CLIENT_UNKNOWN;
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "client_", Client.ClientVerifier.INSTANCE, "app_", "source_", "version_", "serverDomain_", "partnerInfo_"});
            }
            if (iOrdinal == 3) {
                return new SourceInfo();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (SourceInfo.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final String getApp() {
            return this.app_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final phc getAppBytes() {
            return phc.i(this.app_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final Client getClient() {
            Client clientForNumber = Client.forNumber(this.client_);
            return clientForNumber == null ? Client.CLIENT_UNKNOWN : clientForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final PartnerInfo getPartnerInfo() {
            PartnerInfo partnerInfo = this.partnerInfo_;
            return partnerInfo == null ? PartnerInfo.getDefaultInstance() : partnerInfo;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final String getServerDomain() {
            return this.serverDomain_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final phc getServerDomainBytes() {
            return phc.i(this.serverDomain_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final String getSource() {
            return this.source_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final phc getSourceBytes() {
            return phc.i(this.source_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final String getVersion() {
            return this.version_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final phc getVersionBytes() {
            return phc.i(this.version_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final boolean hasApp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final boolean hasClient() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final boolean hasPartnerInfo() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final boolean hasServerDomain() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final boolean hasSource() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
        public final boolean hasVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public enum Client implements v190 {
            CLIENT_UNKNOWN(0),
            NATIVE_HERMES(1),
            CLIENT(2),
            PYTHON(3),
            JAVA(4),
            WEBPLAYER(5),
            LIBSPOTIFY(6);

            public static final int CLIENT_UNKNOWN_VALUE = 0;
            public static final int CLIENT_VALUE = 2;
            public static final int JAVA_VALUE = 4;
            public static final int LIBSPOTIFY_VALUE = 6;
            public static final int NATIVE_HERMES_VALUE = 1;
            public static final int PYTHON_VALUE = 3;
            public static final int WEBPLAYER_VALUE = 5;
            private static final y190 internalValueMap = new AnonymousClass1();
            private final int value;

            public static final class ClientVerifier implements z190 {
                static final z190 INSTANCE = new ClientVerifier();

                private ClientVerifier() {
                }

                public final boolean isInRange(int i) {
                    return Client.forNumber(i) != null;
                }
            }

            Client(int i) {
                this.value = i;
            }

            public static Client forNumber(int i) {
                switch (i) {
                    case 0:
                        return CLIENT_UNKNOWN;
                    case 1:
                        return NATIVE_HERMES;
                    case 2:
                        return CLIENT;
                    case 3:
                        return PYTHON;
                    case 4:
                        return JAVA;
                    case 5:
                        return WEBPLAYER;
                    case 6:
                        return LIBSPOTIFY;
                    default:
                        return null;
                }
            }

            public static y190 internalGetValueMap() {
                return internalValueMap;
            }

            public static z190 internalGetVerifier() {
                return ClientVerifier.INSTANCE;
            }

            public final int getNumber() {
                return this.value;
            }

            /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$SourceInfo$Client$1, reason: invalid class name */
            public class AnonymousClass1 implements y190 {
                public final Client findValueByNumber(int i) {
                    return Client.forNumber(i);
                }

                /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
                public final v190 m790findValueByNumber(int i) {
                    return Client.forNumber(i);
                }
            }

            @Deprecated
            public static Client valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends g implements SourceInfoOrBuilder {
            private Builder() {
                super(SourceInfo.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearApp() {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).clearApp();
                return this;
            }

            public final Builder clearClient() {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).clearClient();
                return this;
            }

            public final Builder clearPartnerInfo() {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).clearPartnerInfo();
                return this;
            }

            public final Builder clearServerDomain() {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).clearServerDomain();
                return this;
            }

            public final Builder clearSource() {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).clearSource();
                return this;
            }

            public final Builder clearVersion() {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).clearVersion();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final String getApp() {
                return ((SourceInfo) ((g) this).instance).getApp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final phc getAppBytes() {
                return ((SourceInfo) ((g) this).instance).getAppBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final Client getClient() {
                return ((SourceInfo) ((g) this).instance).getClient();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final PartnerInfo getPartnerInfo() {
                return ((SourceInfo) ((g) this).instance).getPartnerInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final String getServerDomain() {
                return ((SourceInfo) ((g) this).instance).getServerDomain();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final phc getServerDomainBytes() {
                return ((SourceInfo) ((g) this).instance).getServerDomainBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final String getSource() {
                return ((SourceInfo) ((g) this).instance).getSource();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final phc getSourceBytes() {
                return ((SourceInfo) ((g) this).instance).getSourceBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final String getVersion() {
                return ((SourceInfo) ((g) this).instance).getVersion();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final phc getVersionBytes() {
                return ((SourceInfo) ((g) this).instance).getVersionBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final boolean hasApp() {
                return ((SourceInfo) ((g) this).instance).hasApp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final boolean hasClient() {
                return ((SourceInfo) ((g) this).instance).hasClient();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final boolean hasPartnerInfo() {
                return ((SourceInfo) ((g) this).instance).hasPartnerInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final boolean hasServerDomain() {
                return ((SourceInfo) ((g) this).instance).hasServerDomain();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final boolean hasSource() {
                return ((SourceInfo) ((g) this).instance).hasSource();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SourceInfoOrBuilder
            public final boolean hasVersion() {
                return ((SourceInfo) ((g) this).instance).hasVersion();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m787mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergePartnerInfo(PartnerInfo partnerInfo) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).mergePartnerInfo(partnerInfo);
                return this;
            }

            public final Builder setApp(String str) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setApp(str);
                return this;
            }

            public final Builder setAppBytes(phc phcVar) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setAppBytes(phcVar);
                return this;
            }

            public final Builder setClient(Client client) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setClient(client);
                return this;
            }

            public final Builder setPartnerInfo(PartnerInfo.Builder builder) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setPartnerInfo((PartnerInfo) builder.build());
                return this;
            }

            public final Builder setServerDomain(String str) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setServerDomain(str);
                return this;
            }

            public final Builder setServerDomainBytes(phc phcVar) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setServerDomainBytes(phcVar);
                return this;
            }

            public final Builder setSource(String str) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setSource(str);
                return this;
            }

            public final Builder setSourceBytes(phc phcVar) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setSourceBytes(phcVar);
                return this;
            }

            public final Builder setVersion(String str) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setVersion(str);
                return this;
            }

            public final Builder setVersionBytes(phc phcVar) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setVersionBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m786clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m788mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m785clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m789mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setPartnerInfo(PartnerInfo partnerInfo) {
                copyOnWrite();
                ((SourceInfo) ((g) this).instance).setPartnerInfo(partnerInfo);
                return this;
            }
        }

        public static Builder newBuilder(SourceInfo sourceInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sourceInfo);
        }

        public static SourceInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (SourceInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SourceInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static SourceInfo parseFrom(phc phcVar) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static SourceInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static SourceInfo parseFrom(byte[] bArr) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SourceInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static SourceInfo parseFrom(InputStream inputStream) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SourceInfo parseFrom(lwg lwgVar) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static SourceInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (SourceInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Add extends h implements AddOrBuilder {
        public static final int ADD_AFTER_ITEM_FIELD_NUMBER = 7;
        public static final int ADD_BEFORE_ITEM_FIELD_NUMBER = 6;
        public static final int ADD_FIRST_FIELD_NUMBER = 5;
        public static final int ADD_LAST_FIELD_NUMBER = 4;
        private static final Add DEFAULT_INSTANCE;
        public static final int FROM_INDEX_FIELD_NUMBER = 1;
        public static final int ITEMS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private Item addAfterItem_;
        private Item addBeforeItem_;
        private boolean addFirst_;
        private boolean addLast_;
        private int bitField0_;
        private int fromIndex_;
        private byte memoizedIsInitialized = 2;
        private h290 items_ = h.emptyProtobufList();

        static {
            Add add = new Add();
            DEFAULT_INSTANCE = add;
            h.registerDefaultInstance(Add.class, add);
        }

        private Add() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends Item> iterable) {
            ensureItemsIsMutable();
            s8.addAll(iterable, this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddAfterItem() {
            this.addAfterItem_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddBeforeItem() {
            this.addBeforeItem_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddFirst() {
            this.bitField0_ &= -5;
            this.addFirst_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddLast() {
            this.bitField0_ &= -3;
            this.addLast_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromIndex() {
            this.bitField0_ &= -2;
            this.fromIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = h.emptyProtobufList();
        }

        private void ensureItemsIsMutable() {
            i9 i9Var = this.items_;
            if (i9Var.a) {
                return;
            }
            this.items_ = h.mutableCopy(i9Var);
        }

        public static Add getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddAfterItem(Item item) {
            item.getClass();
            Item item2 = this.addAfterItem_;
            if (item2 == null || item2 == Item.getDefaultInstance()) {
                this.addAfterItem_ = item;
            } else {
                this.addAfterItem_ = (Item) ((Item.Builder) Item.newBuilder(this.addAfterItem_).mergeFrom(item)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddBeforeItem(Item item) {
            item.getClass();
            Item item2 = this.addBeforeItem_;
            if (item2 == null || item2 == Item.getDefaultInstance()) {
                this.addBeforeItem_ = item;
            } else {
                this.addBeforeItem_ = (Item) ((Item.Builder) Item.newBuilder(this.addBeforeItem_).mergeFrom(item)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Add parseDelimitedFrom(InputStream inputStream) {
            return (Add) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Add parseFrom(ByteBuffer byteBuffer) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddAfterItem(Item item) {
            item.getClass();
            this.addAfterItem_ = item;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddBeforeItem(Item item) {
            item.getClass();
            this.addBeforeItem_ = item;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddFirst(boolean z) {
            this.bitField0_ |= 4;
            this.addFirst_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddLast(boolean z) {
            this.bitField0_ |= 2;
            this.addLast_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromIndex(int i) {
            this.bitField0_ |= 1;
            this.fromIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, item);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001င\u0000\u0002Л\u0004ဇ\u0001\u0005ဇ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004", new Object[]{"bitField0_", "fromIndex_", "items_", Item.class, "addLast_", "addFirst_", "addBeforeItem_", "addAfterItem_"});
                case 3:
                    return new Add();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Add.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final Item getAddAfterItem() {
            Item item = this.addAfterItem_;
            return item == null ? Item.getDefaultInstance() : item;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final Item getAddBeforeItem() {
            Item item = this.addBeforeItem_;
            return item == null ? Item.getDefaultInstance() : item;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean getAddFirst() {
            return this.addFirst_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean getAddLast() {
            return this.addLast_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final int getFromIndex() {
            return this.fromIndex_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final Item getItems(int i) {
            return (Item) this.items_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final List<Item> getItemsList() {
            return this.items_;
        }

        public final ItemOrBuilder getItemsOrBuilder(int i) {
            return (ItemOrBuilder) this.items_.get(i);
        }

        public final List<? extends ItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean hasAddAfterItem() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean hasAddBeforeItem() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean hasAddFirst() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean hasAddLast() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
        public final boolean hasFromIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements AddOrBuilder {
            private Builder() {
                super(Add.DEFAULT_INSTANCE);
            }

            public final Builder addAllItems(Iterable<? extends Item> iterable) {
                copyOnWrite();
                ((Add) ((g) this).instance).addAllItems(iterable);
                return this;
            }

            public final Builder addItems(Item.Builder builder) {
                copyOnWrite();
                ((Add) ((g) this).instance).addItems((Item) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAddAfterItem() {
                copyOnWrite();
                ((Add) ((g) this).instance).clearAddAfterItem();
                return this;
            }

            public final Builder clearAddBeforeItem() {
                copyOnWrite();
                ((Add) ((g) this).instance).clearAddBeforeItem();
                return this;
            }

            public final Builder clearAddFirst() {
                copyOnWrite();
                ((Add) ((g) this).instance).clearAddFirst();
                return this;
            }

            public final Builder clearAddLast() {
                copyOnWrite();
                ((Add) ((g) this).instance).clearAddLast();
                return this;
            }

            public final Builder clearFromIndex() {
                copyOnWrite();
                ((Add) ((g) this).instance).clearFromIndex();
                return this;
            }

            public final Builder clearItems() {
                copyOnWrite();
                ((Add) ((g) this).instance).clearItems();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final Item getAddAfterItem() {
                return ((Add) ((g) this).instance).getAddAfterItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final Item getAddBeforeItem() {
                return ((Add) ((g) this).instance).getAddBeforeItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean getAddFirst() {
                return ((Add) ((g) this).instance).getAddFirst();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean getAddLast() {
                return ((Add) ((g) this).instance).getAddLast();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final int getFromIndex() {
                return ((Add) ((g) this).instance).getFromIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final Item getItems(int i) {
                return ((Add) ((g) this).instance).getItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final int getItemsCount() {
                return ((Add) ((g) this).instance).getItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final List<Item> getItemsList() {
                return Collections.unmodifiableList(((Add) ((g) this).instance).getItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean hasAddAfterItem() {
                return ((Add) ((g) this).instance).hasAddAfterItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean hasAddBeforeItem() {
                return ((Add) ((g) this).instance).hasAddBeforeItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean hasAddFirst() {
                return ((Add) ((g) this).instance).hasAddFirst();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean hasAddLast() {
                return ((Add) ((g) this).instance).hasAddLast();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AddOrBuilder
            public final boolean hasFromIndex() {
                return ((Add) ((g) this).instance).hasFromIndex();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAddAfterItem(Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).mergeAddAfterItem(item);
                return this;
            }

            public final Builder mergeAddBeforeItem(Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).mergeAddBeforeItem(item);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m597mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeItems(int i) {
                copyOnWrite();
                ((Add) ((g) this).instance).removeItems(i);
                return this;
            }

            public final Builder setAddAfterItem(Item.Builder builder) {
                copyOnWrite();
                ((Add) ((g) this).instance).setAddAfterItem((Item) builder.build());
                return this;
            }

            public final Builder setAddBeforeItem(Item.Builder builder) {
                copyOnWrite();
                ((Add) ((g) this).instance).setAddBeforeItem((Item) builder.build());
                return this;
            }

            public final Builder setAddFirst(boolean z) {
                copyOnWrite();
                ((Add) ((g) this).instance).setAddFirst(z);
                return this;
            }

            public final Builder setAddLast(boolean z) {
                copyOnWrite();
                ((Add) ((g) this).instance).setAddLast(z);
                return this;
            }

            public final Builder setFromIndex(int i) {
                copyOnWrite();
                ((Add) ((g) this).instance).setFromIndex(i);
                return this;
            }

            public final Builder setItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((Add) ((g) this).instance).setItems(i, (Item) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m596clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m598mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m595clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m599mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addItems(int i, Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).addItems(i, item);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAddAfterItem(Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).setAddAfterItem(item);
                return this;
            }

            public final Builder setAddBeforeItem(Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).setAddBeforeItem(item);
                return this;
            }

            public final Builder setItems(int i, Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).setItems(i, item);
                return this;
            }

            public final Builder addItems(Item item) {
                copyOnWrite();
                ((Add) ((g) this).instance).addItems(item);
                return this;
            }

            public final Builder addItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((Add) ((g) this).instance).addItems(i, (Item) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Add add) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(add);
        }

        public static Add parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Add) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Add parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Add parseFrom(phc phcVar) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Add parseFrom(phc phcVar, uz00 uz00Var) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, item);
        }

        public static Add parseFrom(byte[] bArr) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Add parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Add parseFrom(InputStream inputStream) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Add parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Add parseFrom(lwg lwgVar) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Add parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Add) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class AppliedLenses extends h implements AppliedLensesOrBuilder {
        private static final AppliedLenses DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int STATES_FIELD_NUMBER = 1;
        private h290 states_ = h.emptyProtobufList();

        static {
            AppliedLenses appliedLenses = new AppliedLenses();
            DEFAULT_INSTANCE = appliedLenses;
            h.registerDefaultInstance(AppliedLenses.class, appliedLenses);
        }

        private AppliedLenses() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStates(Iterable<? extends LensModelProto$LensState> iterable) {
            ensureStatesIsMutable();
            s8.addAll(iterable, this.states_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStates(LensModelProto$LensState lensModelProto$LensState) {
            lensModelProto$LensState.getClass();
            ensureStatesIsMutable();
            this.states_.add(lensModelProto$LensState);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStates() {
            this.states_ = h.emptyProtobufList();
        }

        private void ensureStatesIsMutable() {
            i9 i9Var = this.states_;
            if (i9Var.a) {
                return;
            }
            this.states_ = h.mutableCopy(i9Var);
        }

        public static AppliedLenses getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AppliedLenses parseDelimitedFrom(InputStream inputStream) {
            return (AppliedLenses) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppliedLenses parseFrom(ByteBuffer byteBuffer) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeStates(int i) {
            ensureStatesIsMutable();
            this.states_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStates(int i, LensModelProto$LensState lensModelProto$LensState) {
            lensModelProto$LensState.getClass();
            ensureStatesIsMutable();
            this.states_.set(i, lensModelProto$LensState);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"states_", LensModelProto$LensState.class});
            }
            if (iOrdinal == 3) {
                return new AppliedLenses();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (AppliedLenses.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
        public final LensModelProto$LensState getStates(int i) {
            return (LensModelProto$LensState) this.states_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
        public final int getStatesCount() {
            return this.states_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
        public final List<LensModelProto$LensState> getStatesList() {
            return this.states_;
        }

        public final d3c0 getStatesOrBuilder(int i) {
            return (d3c0) this.states_.get(i);
        }

        public final List<? extends d3c0> getStatesOrBuilderList() {
            return this.states_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements AppliedLensesOrBuilder {
            private Builder() {
                super(AppliedLenses.DEFAULT_INSTANCE);
            }

            public final Builder addAllStates(Iterable<? extends LensModelProto$LensState> iterable) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).addAllStates(iterable);
                return this;
            }

            public final Builder addStates(c3c0 c3c0Var) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).addStates((LensModelProto$LensState) c3c0Var.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearStates() {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).clearStates();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
            public final LensModelProto$LensState getStates(int i) {
                return ((AppliedLenses) ((g) this).instance).getStates(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
            public final int getStatesCount() {
                return ((AppliedLenses) ((g) this).instance).getStatesCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AppliedLensesOrBuilder
            public final List<LensModelProto$LensState> getStatesList() {
                return Collections.unmodifiableList(((AppliedLenses) ((g) this).instance).getStatesList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m602mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeStates(int i) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).removeStates(i);
                return this;
            }

            public final Builder setStates(int i, c3c0 c3c0Var) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).setStates(i, (LensModelProto$LensState) c3c0Var.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m601clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m603mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m600clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m604mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addStates(int i, LensModelProto$LensState lensModelProto$LensState) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).addStates(i, lensModelProto$LensState);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setStates(int i, LensModelProto$LensState lensModelProto$LensState) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).setStates(i, lensModelProto$LensState);
                return this;
            }

            public final Builder addStates(LensModelProto$LensState lensModelProto$LensState) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).addStates(lensModelProto$LensState);
                return this;
            }

            public final Builder addStates(int i, c3c0 c3c0Var) {
                copyOnWrite();
                ((AppliedLenses) ((g) this).instance).addStates(i, (LensModelProto$LensState) c3c0Var.build());
                return this;
            }
        }

        public static Builder newBuilder(AppliedLenses appliedLenses) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(appliedLenses);
        }

        public static AppliedLenses parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (AppliedLenses) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static AppliedLenses parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static AppliedLenses parseFrom(phc phcVar) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static AppliedLenses parseFrom(phc phcVar, uz00 uz00Var) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStates(int i, LensModelProto$LensState lensModelProto$LensState) {
            lensModelProto$LensState.getClass();
            ensureStatesIsMutable();
            this.states_.add(i, lensModelProto$LensState);
        }

        public static AppliedLenses parseFrom(byte[] bArr) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppliedLenses parseFrom(byte[] bArr, uz00 uz00Var) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static AppliedLenses parseFrom(InputStream inputStream) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppliedLenses parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static AppliedLenses parseFrom(lwg lwgVar) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static AppliedLenses parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (AppliedLenses) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class AvailableSignals extends h implements AvailableSignalsOrBuilder {
        private static final AvailableSignals DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SIGNALS_FIELD_NUMBER = 1;
        private h290 signals_ = h.emptyProtobufList();

        static {
            AvailableSignals availableSignals = new AvailableSignals();
            DEFAULT_INSTANCE = availableSignals;
            h.registerDefaultInstance(AvailableSignals.class, availableSignals);
        }

        private AvailableSignals() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
            ensureSignalsIsMutable();
            s8.addAll(iterable, this.signals_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSignals(SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureSignalsIsMutable();
            this.signals_.add(signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignals() {
            this.signals_ = h.emptyProtobufList();
        }

        private void ensureSignalsIsMutable() {
            i9 i9Var = this.signals_;
            if (i9Var.a) {
                return;
            }
            this.signals_ = h.mutableCopy(i9Var);
        }

        public static AvailableSignals getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AvailableSignals parseDelimitedFrom(InputStream inputStream) {
            return (AvailableSignals) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvailableSignals parseFrom(ByteBuffer byteBuffer) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSignals(int i) {
            ensureSignalsIsMutable();
            this.signals_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureSignalsIsMutable();
            this.signals_.set(i, signalModelProto$Signal);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"signals_", SignalModelProto$Signal.class});
            }
            if (iOrdinal == 3) {
                return new AvailableSignals();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (AvailableSignals.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
        public final SignalModelProto$Signal getSignals(int i) {
            return (SignalModelProto$Signal) this.signals_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
        public final int getSignalsCount() {
            return this.signals_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
        public final List<SignalModelProto$Signal> getSignalsList() {
            return this.signals_;
        }

        public final wl81 getSignalsOrBuilder(int i) {
            return (wl81) this.signals_.get(i);
        }

        public final List<? extends wl81> getSignalsOrBuilderList() {
            return this.signals_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements AvailableSignalsOrBuilder {
            private Builder() {
                super(AvailableSignals.DEFAULT_INSTANCE);
            }

            public final Builder addAllSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).addAllSignals(iterable);
                return this;
            }

            public final Builder addSignals(vl81 vl81Var) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).addSignals((SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearSignals() {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).clearSignals();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
            public final SignalModelProto$Signal getSignals(int i) {
                return ((AvailableSignals) ((g) this).instance).getSignals(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
            public final int getSignalsCount() {
                return ((AvailableSignals) ((g) this).instance).getSignalsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.AvailableSignalsOrBuilder
            public final List<SignalModelProto$Signal> getSignalsList() {
                return Collections.unmodifiableList(((AvailableSignals) ((g) this).instance).getSignalsList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m607mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeSignals(int i) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).removeSignals(i);
                return this;
            }

            public final Builder setSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).setSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m606clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m608mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m605clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m609mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).addSignals(i, signalModelProto$Signal);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).setSignals(i, signalModelProto$Signal);
                return this;
            }

            public final Builder addSignals(SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).addSignals(signalModelProto$Signal);
                return this;
            }

            public final Builder addSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((AvailableSignals) ((g) this).instance).addSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }
        }

        public static Builder newBuilder(AvailableSignals availableSignals) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(availableSignals);
        }

        public static AvailableSignals parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (AvailableSignals) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static AvailableSignals parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static AvailableSignals parseFrom(phc phcVar) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static AvailableSignals parseFrom(phc phcVar, uz00 uz00Var) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureSignalsIsMutable();
            this.signals_.add(i, signalModelProto$Signal);
        }

        public static AvailableSignals parseFrom(byte[] bArr) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AvailableSignals parseFrom(byte[] bArr, uz00 uz00Var) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static AvailableSignals parseFrom(InputStream inputStream) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvailableSignals parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static AvailableSignals parseFrom(lwg lwgVar) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static AvailableSignals parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (AvailableSignals) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ChangeInfo extends h implements ChangeInfoOrBuilder {
        public static final int ADMIN_FIELD_NUMBER = 3;
        public static final int COMPRESSED_FIELD_NUMBER = 7;
        public static final int CREATION_INFO_FIELD_NUMBER = 12;
        private static final ChangeInfo DEFAULT_INSTANCE;
        public static final int MERGE_FIELD_NUMBER = 6;
        public static final int MIGRATION_FIELD_NUMBER = 8;
        private static volatile qzr0 PARSER = null;
        public static final int REDO_FIELD_NUMBER = 5;
        public static final int SERVER_TIMESTAMP_FIELD_NUMBER = 11;
        public static final int SOURCE_FIELD_NUMBER = 10;
        public static final int SPLIT_ID_FIELD_NUMBER = 9;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int UNDO_FIELD_NUMBER = 4;
        public static final int USER_FIELD_NUMBER = 1;
        private boolean admin_;
        private int bitField0_;
        private boolean compressed_;
        private CreationInfo creationInfo_;
        private boolean merge_;
        private boolean migration_;
        private boolean redo_;
        private long serverTimestamp_;
        private SourceInfo source_;
        private int splitId_;
        private long timestamp_;
        private boolean undo_;
        private String user_ = "";

        static {
            ChangeInfo changeInfo = new ChangeInfo();
            DEFAULT_INSTANCE = changeInfo;
            h.registerDefaultInstance(ChangeInfo.class, changeInfo);
        }

        private ChangeInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdmin() {
            this.bitField0_ &= -5;
            this.admin_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompressed() {
            this.bitField0_ &= -65;
            this.compressed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreationInfo() {
            this.creationInfo_ = null;
            this.bitField0_ &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMerge() {
            this.bitField0_ &= -33;
            this.merge_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMigration() {
            this.bitField0_ &= -129;
            this.migration_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedo() {
            this.bitField0_ &= -17;
            this.redo_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerTimestamp() {
            this.bitField0_ &= -1025;
            this.serverTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSplitId() {
            this.bitField0_ &= -257;
            this.splitId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.bitField0_ &= -3;
            this.timestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUndo() {
            this.bitField0_ &= -9;
            this.undo_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUser() {
            this.bitField0_ &= -2;
            this.user_ = DEFAULT_INSTANCE.user_;
        }

        public static ChangeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCreationInfo(CreationInfo creationInfo) {
            creationInfo.getClass();
            CreationInfo creationInfo2 = this.creationInfo_;
            if (creationInfo2 == null || creationInfo2 == CreationInfo.getDefaultInstance()) {
                this.creationInfo_ = creationInfo;
            } else {
                this.creationInfo_ = (CreationInfo) ((CreationInfo.Builder) CreationInfo.newBuilder(this.creationInfo_).mergeFrom(creationInfo)).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSource(SourceInfo sourceInfo) {
            sourceInfo.getClass();
            SourceInfo sourceInfo2 = this.source_;
            if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
                this.source_ = sourceInfo;
            } else {
                this.source_ = (SourceInfo) ((SourceInfo.Builder) SourceInfo.newBuilder(this.source_).mergeFrom(sourceInfo)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ChangeInfo parseDelimitedFrom(InputStream inputStream) {
            return (ChangeInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChangeInfo parseFrom(ByteBuffer byteBuffer) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdmin(boolean z) {
            this.bitField0_ |= 4;
            this.admin_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompressed(boolean z) {
            this.bitField0_ |= 64;
            this.compressed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreationInfo(CreationInfo creationInfo) {
            creationInfo.getClass();
            this.creationInfo_ = creationInfo;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMerge(boolean z) {
            this.bitField0_ |= 32;
            this.merge_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMigration(boolean z) {
            this.bitField0_ |= 128;
            this.migration_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedo(boolean z) {
            this.bitField0_ |= 16;
            this.redo_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerTimestamp(long j) {
            this.bitField0_ |= 1024;
            this.serverTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(SourceInfo sourceInfo) {
            sourceInfo.getClass();
            this.source_ = sourceInfo;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSplitId(int i) {
            this.bitField0_ |= 256;
            this.splitId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.bitField0_ |= 2;
            this.timestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUndo(boolean z) {
            this.bitField0_ |= 8;
            this.undo_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUser(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.user_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserBytes(phc phcVar) {
            this.user_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b\nဉ\t\u000bဂ\n\fဉ\u000b", new Object[]{"bitField0_", "user_", "timestamp_", "admin_", "undo_", "redo_", "merge_", "compressed_", "migration_", "splitId_", "source_", "serverTimestamp_", "creationInfo_"});
            }
            if (iOrdinal == 3) {
                return new ChangeInfo();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ChangeInfo.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean getAdmin() {
            return this.admin_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean getCompressed() {
            return this.compressed_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final CreationInfo getCreationInfo() {
            CreationInfo creationInfo = this.creationInfo_;
            return creationInfo == null ? CreationInfo.getDefaultInstance() : creationInfo;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean getMerge() {
            return this.merge_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean getMigration() {
            return this.migration_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean getRedo() {
            return this.redo_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final long getServerTimestamp() {
            return this.serverTimestamp_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final SourceInfo getSource() {
            SourceInfo sourceInfo = this.source_;
            return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final int getSplitId() {
            return this.splitId_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean getUndo() {
            return this.undo_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final String getUser() {
            return this.user_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final phc getUserBytes() {
            return phc.i(this.user_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasAdmin() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasCompressed() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasCreationInfo() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasMerge() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasMigration() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasRedo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasServerTimestamp() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasSource() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasSplitId() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasUndo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
        public final boolean hasUser() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ChangeInfoOrBuilder {
            private Builder() {
                super(ChangeInfo.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAdmin() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearAdmin();
                return this;
            }

            public final Builder clearCompressed() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearCompressed();
                return this;
            }

            public final Builder clearCreationInfo() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearCreationInfo();
                return this;
            }

            public final Builder clearMerge() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearMerge();
                return this;
            }

            public final Builder clearMigration() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearMigration();
                return this;
            }

            public final Builder clearRedo() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearRedo();
                return this;
            }

            public final Builder clearServerTimestamp() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearServerTimestamp();
                return this;
            }

            public final Builder clearSource() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearSource();
                return this;
            }

            public final Builder clearSplitId() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearSplitId();
                return this;
            }

            public final Builder clearTimestamp() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearTimestamp();
                return this;
            }

            public final Builder clearUndo() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearUndo();
                return this;
            }

            public final Builder clearUser() {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).clearUser();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean getAdmin() {
                return ((ChangeInfo) ((g) this).instance).getAdmin();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean getCompressed() {
                return ((ChangeInfo) ((g) this).instance).getCompressed();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final CreationInfo getCreationInfo() {
                return ((ChangeInfo) ((g) this).instance).getCreationInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean getMerge() {
                return ((ChangeInfo) ((g) this).instance).getMerge();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean getMigration() {
                return ((ChangeInfo) ((g) this).instance).getMigration();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean getRedo() {
                return ((ChangeInfo) ((g) this).instance).getRedo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final long getServerTimestamp() {
                return ((ChangeInfo) ((g) this).instance).getServerTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final SourceInfo getSource() {
                return ((ChangeInfo) ((g) this).instance).getSource();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final int getSplitId() {
                return ((ChangeInfo) ((g) this).instance).getSplitId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final long getTimestamp() {
                return ((ChangeInfo) ((g) this).instance).getTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean getUndo() {
                return ((ChangeInfo) ((g) this).instance).getUndo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final String getUser() {
                return ((ChangeInfo) ((g) this).instance).getUser();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final phc getUserBytes() {
                return ((ChangeInfo) ((g) this).instance).getUserBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasAdmin() {
                return ((ChangeInfo) ((g) this).instance).hasAdmin();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasCompressed() {
                return ((ChangeInfo) ((g) this).instance).hasCompressed();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasCreationInfo() {
                return ((ChangeInfo) ((g) this).instance).hasCreationInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasMerge() {
                return ((ChangeInfo) ((g) this).instance).hasMerge();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasMigration() {
                return ((ChangeInfo) ((g) this).instance).hasMigration();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasRedo() {
                return ((ChangeInfo) ((g) this).instance).hasRedo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasServerTimestamp() {
                return ((ChangeInfo) ((g) this).instance).hasServerTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasSource() {
                return ((ChangeInfo) ((g) this).instance).hasSource();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasSplitId() {
                return ((ChangeInfo) ((g) this).instance).hasSplitId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasTimestamp() {
                return ((ChangeInfo) ((g) this).instance).hasTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasUndo() {
                return ((ChangeInfo) ((g) this).instance).hasUndo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ChangeInfoOrBuilder
            public final boolean hasUser() {
                return ((ChangeInfo) ((g) this).instance).hasUser();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeCreationInfo(CreationInfo creationInfo) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).mergeCreationInfo(creationInfo);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m612mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeSource(SourceInfo sourceInfo) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).mergeSource(sourceInfo);
                return this;
            }

            public final Builder setAdmin(boolean z) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setAdmin(z);
                return this;
            }

            public final Builder setCompressed(boolean z) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setCompressed(z);
                return this;
            }

            public final Builder setCreationInfo(CreationInfo.Builder builder) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setCreationInfo((CreationInfo) builder.build());
                return this;
            }

            public final Builder setMerge(boolean z) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setMerge(z);
                return this;
            }

            public final Builder setMigration(boolean z) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setMigration(z);
                return this;
            }

            public final Builder setRedo(boolean z) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setRedo(z);
                return this;
            }

            public final Builder setServerTimestamp(long j) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setServerTimestamp(j);
                return this;
            }

            public final Builder setSource(SourceInfo.Builder builder) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setSource((SourceInfo) builder.build());
                return this;
            }

            public final Builder setSplitId(int i) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setSplitId(i);
                return this;
            }

            public final Builder setTimestamp(long j) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setTimestamp(j);
                return this;
            }

            public final Builder setUndo(boolean z) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setUndo(z);
                return this;
            }

            public final Builder setUser(String str) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setUser(str);
                return this;
            }

            public final Builder setUserBytes(phc phcVar) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setUserBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m611clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m613mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m610clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m614mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setCreationInfo(CreationInfo creationInfo) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setCreationInfo(creationInfo);
                return this;
            }

            public final Builder setSource(SourceInfo sourceInfo) {
                copyOnWrite();
                ((ChangeInfo) ((g) this).instance).setSource(sourceInfo);
                return this;
            }
        }

        public static Builder newBuilder(ChangeInfo changeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(changeInfo);
        }

        public static ChangeInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ChangeInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ChangeInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ChangeInfo parseFrom(phc phcVar) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ChangeInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ChangeInfo parseFrom(byte[] bArr) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChangeInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ChangeInfo parseFrom(InputStream inputStream) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChangeInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ChangeInfo parseFrom(lwg lwgVar) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ChangeInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ChangeInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class CreateListReply extends h implements CreateListReplyOrBuilder {
        private static final CreateListReply DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int REVISION_FIELD_NUMBER = 2;
        public static final int URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String uri_ = "";
        private phc revision_ = phc.b;

        static {
            CreateListReply createListReply = new CreateListReply();
            DEFAULT_INSTANCE = createListReply;
            h.registerDefaultInstance(CreateListReply.class, createListReply);
        }

        private CreateListReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevision() {
            this.bitField0_ &= -3;
            this.revision_ = DEFAULT_INSTANCE.revision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUri() {
            this.bitField0_ &= -2;
            this.uri_ = DEFAULT_INSTANCE.uri_;
        }

        public static CreateListReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateListReply parseDelimitedFrom(InputStream inputStream) {
            return (CreateListReply) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateListReply parseFrom(ByteBuffer byteBuffer) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 2;
            this.revision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUri(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriBytes(phc phcVar) {
            this.uri_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "uri_", "revision_"});
                case 3:
                    return new CreateListReply();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (CreateListReply.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
        public final phc getRevision() {
            return this.revision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
        public final String getUri() {
            return this.uri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
        public final phc getUriBytes() {
            return phc.i(this.uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
        public final boolean hasRevision() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
        public final boolean hasUri() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements CreateListReplyOrBuilder {
            private Builder() {
                super(CreateListReply.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearRevision() {
                copyOnWrite();
                ((CreateListReply) ((g) this).instance).clearRevision();
                return this;
            }

            public final Builder clearUri() {
                copyOnWrite();
                ((CreateListReply) ((g) this).instance).clearUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
            public final phc getRevision() {
                return ((CreateListReply) ((g) this).instance).getRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
            public final String getUri() {
                return ((CreateListReply) ((g) this).instance).getUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
            public final phc getUriBytes() {
                return ((CreateListReply) ((g) this).instance).getUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
            public final boolean hasRevision() {
                return ((CreateListReply) ((g) this).instance).hasRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.CreateListReplyOrBuilder
            public final boolean hasUri() {
                return ((CreateListReply) ((g) this).instance).hasUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m617mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setRevision(phc phcVar) {
                copyOnWrite();
                ((CreateListReply) ((g) this).instance).setRevision(phcVar);
                return this;
            }

            public final Builder setUri(String str) {
                copyOnWrite();
                ((CreateListReply) ((g) this).instance).setUri(str);
                return this;
            }

            public final Builder setUriBytes(phc phcVar) {
                copyOnWrite();
                ((CreateListReply) ((g) this).instance).setUriBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m616clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m618mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m615clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m619mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(CreateListReply createListReply) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(createListReply);
        }

        public static CreateListReply parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (CreateListReply) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static CreateListReply parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static CreateListReply parseFrom(phc phcVar) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static CreateListReply parseFrom(phc phcVar, uz00 uz00Var) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static CreateListReply parseFrom(byte[] bArr) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateListReply parseFrom(byte[] bArr, uz00 uz00Var) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static CreateListReply parseFrom(InputStream inputStream) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateListReply parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static CreateListReply parseFrom(lwg lwgVar) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static CreateListReply parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (CreateListReply) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Delta extends h implements DeltaOrBuilder {
        public static final int BASE_VERSION_FIELD_NUMBER = 1;
        private static final Delta DEFAULT_INSTANCE;
        public static final int INFO_FIELD_NUMBER = 4;
        public static final int OPS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private ChangeInfo info_;
        private byte memoizedIsInitialized = 2;
        private phc baseVersion_ = phc.b;
        private h290 ops_ = h.emptyProtobufList();

        static {
            Delta delta = new Delta();
            DEFAULT_INSTANCE = delta;
            h.registerDefaultInstance(Delta.class, delta);
        }

        private Delta() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOps(Iterable<? extends Op> iterable) {
            ensureOpsIsMutable();
            s8.addAll(iterable, this.ops_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBaseVersion() {
            this.bitField0_ &= -2;
            this.baseVersion_ = DEFAULT_INSTANCE.baseVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInfo() {
            this.info_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOps() {
            this.ops_ = h.emptyProtobufList();
        }

        private void ensureOpsIsMutable() {
            i9 i9Var = this.ops_;
            if (i9Var.a) {
                return;
            }
            this.ops_ = h.mutableCopy(i9Var);
        }

        public static Delta getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInfo(ChangeInfo changeInfo) {
            changeInfo.getClass();
            ChangeInfo changeInfo2 = this.info_;
            if (changeInfo2 == null || changeInfo2 == ChangeInfo.getDefaultInstance()) {
                this.info_ = changeInfo;
            } else {
                this.info_ = (ChangeInfo) ((ChangeInfo.Builder) ChangeInfo.newBuilder(this.info_).mergeFrom(changeInfo)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Delta parseDelimitedFrom(InputStream inputStream) {
            return (Delta) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Delta parseFrom(ByteBuffer byteBuffer) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOps(int i) {
            ensureOpsIsMutable();
            this.ops_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseVersion(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.baseVersion_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInfo(ChangeInfo changeInfo) {
            changeInfo.getClass();
            this.info_ = changeInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOps(int i, Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.set(i, op);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ည\u0000\u0002Л\u0004ဉ\u0001", new Object[]{"bitField0_", "baseVersion_", "ops_", Op.class, "info_"});
                case 3:
                    return new Delta();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Delta.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final phc getBaseVersion() {
            return this.baseVersion_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final ChangeInfo getInfo() {
            ChangeInfo changeInfo = this.info_;
            return changeInfo == null ? ChangeInfo.getDefaultInstance() : changeInfo;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final Op getOps(int i) {
            return (Op) this.ops_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final int getOpsCount() {
            return this.ops_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final List<Op> getOpsList() {
            return this.ops_;
        }

        public final OpOrBuilder getOpsOrBuilder(int i) {
            return (OpOrBuilder) this.ops_.get(i);
        }

        public final List<? extends OpOrBuilder> getOpsOrBuilderList() {
            return this.ops_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final boolean hasBaseVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
        public final boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements DeltaOrBuilder {
            private Builder() {
                super(Delta.DEFAULT_INSTANCE);
            }

            public final Builder addAllOps(Iterable<? extends Op> iterable) {
                copyOnWrite();
                ((Delta) ((g) this).instance).addAllOps(iterable);
                return this;
            }

            public final Builder addOps(Op.Builder builder) {
                copyOnWrite();
                ((Delta) ((g) this).instance).addOps((Op) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearBaseVersion() {
                copyOnWrite();
                ((Delta) ((g) this).instance).clearBaseVersion();
                return this;
            }

            public final Builder clearInfo() {
                copyOnWrite();
                ((Delta) ((g) this).instance).clearInfo();
                return this;
            }

            public final Builder clearOps() {
                copyOnWrite();
                ((Delta) ((g) this).instance).clearOps();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final phc getBaseVersion() {
                return ((Delta) ((g) this).instance).getBaseVersion();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final ChangeInfo getInfo() {
                return ((Delta) ((g) this).instance).getInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final Op getOps(int i) {
                return ((Delta) ((g) this).instance).getOps(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final int getOpsCount() {
                return ((Delta) ((g) this).instance).getOpsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final List<Op> getOpsList() {
                return Collections.unmodifiableList(((Delta) ((g) this).instance).getOpsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final boolean hasBaseVersion() {
                return ((Delta) ((g) this).instance).hasBaseVersion();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DeltaOrBuilder
            public final boolean hasInfo() {
                return ((Delta) ((g) this).instance).hasInfo();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m628mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeInfo(ChangeInfo changeInfo) {
                copyOnWrite();
                ((Delta) ((g) this).instance).mergeInfo(changeInfo);
                return this;
            }

            public final Builder removeOps(int i) {
                copyOnWrite();
                ((Delta) ((g) this).instance).removeOps(i);
                return this;
            }

            public final Builder setBaseVersion(phc phcVar) {
                copyOnWrite();
                ((Delta) ((g) this).instance).setBaseVersion(phcVar);
                return this;
            }

            public final Builder setInfo(ChangeInfo.Builder builder) {
                copyOnWrite();
                ((Delta) ((g) this).instance).setInfo((ChangeInfo) builder.build());
                return this;
            }

            public final Builder setOps(int i, Op.Builder builder) {
                copyOnWrite();
                ((Delta) ((g) this).instance).setOps(i, (Op) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m627clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m629mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m626clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m630mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addOps(int i, Op op) {
                copyOnWrite();
                ((Delta) ((g) this).instance).addOps(i, op);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setInfo(ChangeInfo changeInfo) {
                copyOnWrite();
                ((Delta) ((g) this).instance).setInfo(changeInfo);
                return this;
            }

            public final Builder setOps(int i, Op op) {
                copyOnWrite();
                ((Delta) ((g) this).instance).setOps(i, op);
                return this;
            }

            public final Builder addOps(Op op) {
                copyOnWrite();
                ((Delta) ((g) this).instance).addOps(op);
                return this;
            }

            public final Builder addOps(int i, Op.Builder builder) {
                copyOnWrite();
                ((Delta) ((g) this).instance).addOps(i, (Op) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Delta delta) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(delta);
        }

        public static Delta parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Delta) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Delta parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Delta parseFrom(phc phcVar) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Delta parseFrom(phc phcVar, uz00 uz00Var) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(int i, Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(i, op);
        }

        public static Delta parseFrom(byte[] bArr) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Delta parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Delta parseFrom(InputStream inputStream) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Delta parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Delta parseFrom(lwg lwgVar) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Delta parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Delta) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Diff extends h implements DiffOrBuilder {
        public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 4;
        private static final Diff DEFAULT_INSTANCE;
        public static final int FROM_REVISION_FIELD_NUMBER = 1;
        public static final int OPS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TO_REVISION_FIELD_NUMBER = 3;
        private AvailableSignals availableSignals_;
        private int bitField0_;
        private phc fromRevision_;
        private byte memoizedIsInitialized = 2;
        private h290 ops_;
        private phc toRevision_;

        static {
            Diff diff = new Diff();
            DEFAULT_INSTANCE = diff;
            h.registerDefaultInstance(Diff.class, diff);
        }

        private Diff() {
            hhc hhcVar = phc.b;
            this.fromRevision_ = hhcVar;
            this.ops_ = h.emptyProtobufList();
            this.toRevision_ = hhcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOps(Iterable<? extends Op> iterable) {
            ensureOpsIsMutable();
            s8.addAll(iterable, this.ops_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvailableSignals() {
            this.availableSignals_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromRevision() {
            this.bitField0_ &= -2;
            this.fromRevision_ = DEFAULT_INSTANCE.fromRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOps() {
            this.ops_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToRevision() {
            this.bitField0_ &= -3;
            this.toRevision_ = DEFAULT_INSTANCE.toRevision_;
        }

        private void ensureOpsIsMutable() {
            i9 i9Var = this.ops_;
            if (i9Var.a) {
                return;
            }
            this.ops_ = h.mutableCopy(i9Var);
        }

        public static Diff getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvailableSignals(AvailableSignals availableSignals) {
            availableSignals.getClass();
            AvailableSignals availableSignals2 = this.availableSignals_;
            if (availableSignals2 == null || availableSignals2 == AvailableSignals.getDefaultInstance()) {
                this.availableSignals_ = availableSignals;
            } else {
                this.availableSignals_ = (AvailableSignals) ((AvailableSignals.Builder) AvailableSignals.newBuilder(this.availableSignals_).mergeFrom(availableSignals)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Diff parseDelimitedFrom(InputStream inputStream) {
            return (Diff) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Diff parseFrom(ByteBuffer byteBuffer) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOps(int i) {
            ensureOpsIsMutable();
            this.ops_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvailableSignals(AvailableSignals availableSignals) {
            availableSignals.getClass();
            this.availableSignals_ = availableSignals;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.fromRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOps(int i, Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.set(i, op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 2;
            this.toRevision_ = phcVar;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᔊ\u0000\u0002Л\u0003ᔊ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "fromRevision_", "ops_", Op.class, "toRevision_", "availableSignals_"});
                case 3:
                    return new Diff();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Diff.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final AvailableSignals getAvailableSignals() {
            AvailableSignals availableSignals = this.availableSignals_;
            return availableSignals == null ? AvailableSignals.getDefaultInstance() : availableSignals;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final phc getFromRevision() {
            return this.fromRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final Op getOps(int i) {
            return (Op) this.ops_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final int getOpsCount() {
            return this.ops_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final List<Op> getOpsList() {
            return this.ops_;
        }

        public final OpOrBuilder getOpsOrBuilder(int i) {
            return (OpOrBuilder) this.ops_.get(i);
        }

        public final List<? extends OpOrBuilder> getOpsOrBuilderList() {
            return this.ops_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final phc getToRevision() {
            return this.toRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final boolean hasAvailableSignals() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final boolean hasFromRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
        public final boolean hasToRevision() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements DiffOrBuilder {
            private Builder() {
                super(Diff.DEFAULT_INSTANCE);
            }

            public final Builder addAllOps(Iterable<? extends Op> iterable) {
                copyOnWrite();
                ((Diff) ((g) this).instance).addAllOps(iterable);
                return this;
            }

            public final Builder addOps(Op.Builder builder) {
                copyOnWrite();
                ((Diff) ((g) this).instance).addOps((Op) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAvailableSignals() {
                copyOnWrite();
                ((Diff) ((g) this).instance).clearAvailableSignals();
                return this;
            }

            public final Builder clearFromRevision() {
                copyOnWrite();
                ((Diff) ((g) this).instance).clearFromRevision();
                return this;
            }

            public final Builder clearOps() {
                copyOnWrite();
                ((Diff) ((g) this).instance).clearOps();
                return this;
            }

            public final Builder clearToRevision() {
                copyOnWrite();
                ((Diff) ((g) this).instance).clearToRevision();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final AvailableSignals getAvailableSignals() {
                return ((Diff) ((g) this).instance).getAvailableSignals();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final phc getFromRevision() {
                return ((Diff) ((g) this).instance).getFromRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final Op getOps(int i) {
                return ((Diff) ((g) this).instance).getOps(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final int getOpsCount() {
                return ((Diff) ((g) this).instance).getOpsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final List<Op> getOpsList() {
                return Collections.unmodifiableList(((Diff) ((g) this).instance).getOpsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final phc getToRevision() {
                return ((Diff) ((g) this).instance).getToRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final boolean hasAvailableSignals() {
                return ((Diff) ((g) this).instance).hasAvailableSignals();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final boolean hasFromRevision() {
                return ((Diff) ((g) this).instance).hasFromRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.DiffOrBuilder
            public final boolean hasToRevision() {
                return ((Diff) ((g) this).instance).hasToRevision();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAvailableSignals(AvailableSignals availableSignals) {
                copyOnWrite();
                ((Diff) ((g) this).instance).mergeAvailableSignals(availableSignals);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m633mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeOps(int i) {
                copyOnWrite();
                ((Diff) ((g) this).instance).removeOps(i);
                return this;
            }

            public final Builder setAvailableSignals(AvailableSignals.Builder builder) {
                copyOnWrite();
                ((Diff) ((g) this).instance).setAvailableSignals((AvailableSignals) builder.build());
                return this;
            }

            public final Builder setFromRevision(phc phcVar) {
                copyOnWrite();
                ((Diff) ((g) this).instance).setFromRevision(phcVar);
                return this;
            }

            public final Builder setOps(int i, Op.Builder builder) {
                copyOnWrite();
                ((Diff) ((g) this).instance).setOps(i, (Op) builder.build());
                return this;
            }

            public final Builder setToRevision(phc phcVar) {
                copyOnWrite();
                ((Diff) ((g) this).instance).setToRevision(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m632clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m634mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m631clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m635mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addOps(int i, Op op) {
                copyOnWrite();
                ((Diff) ((g) this).instance).addOps(i, op);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAvailableSignals(AvailableSignals availableSignals) {
                copyOnWrite();
                ((Diff) ((g) this).instance).setAvailableSignals(availableSignals);
                return this;
            }

            public final Builder setOps(int i, Op op) {
                copyOnWrite();
                ((Diff) ((g) this).instance).setOps(i, op);
                return this;
            }

            public final Builder addOps(Op op) {
                copyOnWrite();
                ((Diff) ((g) this).instance).addOps(op);
                return this;
            }

            public final Builder addOps(int i, Op.Builder builder) {
                copyOnWrite();
                ((Diff) ((g) this).instance).addOps(i, (Op) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Diff diff) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(diff);
        }

        public static Diff parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Diff) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Diff parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Diff parseFrom(phc phcVar) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Diff parseFrom(phc phcVar, uz00 uz00Var) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(int i, Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(i, op);
        }

        public static Diff parseFrom(byte[] bArr) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Diff parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Diff parseFrom(InputStream inputStream) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Diff parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Diff parseFrom(lwg lwgVar) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Diff parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Diff) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class FormatListAttribute extends h implements FormatListAttributeOrBuilder {
        private static final FormatListAttribute DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String key_ = "";
        private String value_ = "";

        static {
            FormatListAttribute formatListAttribute = new FormatListAttribute();
            DEFAULT_INSTANCE = formatListAttribute;
            h.registerDefaultInstance(FormatListAttribute.class, formatListAttribute);
        }

        private FormatListAttribute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.bitField0_ &= -2;
            this.key_ = DEFAULT_INSTANCE.key_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -3;
            this.value_ = DEFAULT_INSTANCE.value_;
        }

        public static FormatListAttribute getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FormatListAttribute parseDelimitedFrom(InputStream inputStream) {
            return (FormatListAttribute) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FormatListAttribute parseFrom(ByteBuffer byteBuffer) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKey(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.key_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyBytes(phc phcVar) {
            this.key_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(phc phcVar) {
            this.value_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "key_", "value_"});
            }
            if (iOrdinal == 3) {
                return new FormatListAttribute();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (FormatListAttribute.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final String getKey() {
            return this.key_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final phc getKeyBytes() {
            return phc.i(this.key_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final String getValue() {
            return this.value_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final phc getValueBytes() {
            return phc.i(this.value_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
        public final boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements FormatListAttributeOrBuilder {
            private Builder() {
                super(FormatListAttribute.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearKey() {
                copyOnWrite();
                ((FormatListAttribute) ((g) this).instance).clearKey();
                return this;
            }

            public final Builder clearValue() {
                copyOnWrite();
                ((FormatListAttribute) ((g) this).instance).clearValue();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final String getKey() {
                return ((FormatListAttribute) ((g) this).instance).getKey();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final phc getKeyBytes() {
                return ((FormatListAttribute) ((g) this).instance).getKeyBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final String getValue() {
                return ((FormatListAttribute) ((g) this).instance).getValue();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final phc getValueBytes() {
                return ((FormatListAttribute) ((g) this).instance).getValueBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final boolean hasKey() {
                return ((FormatListAttribute) ((g) this).instance).hasKey();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.FormatListAttributeOrBuilder
            public final boolean hasValue() {
                return ((FormatListAttribute) ((g) this).instance).hasValue();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m638mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setKey(String str) {
                copyOnWrite();
                ((FormatListAttribute) ((g) this).instance).setKey(str);
                return this;
            }

            public final Builder setKeyBytes(phc phcVar) {
                copyOnWrite();
                ((FormatListAttribute) ((g) this).instance).setKeyBytes(phcVar);
                return this;
            }

            public final Builder setValue(String str) {
                copyOnWrite();
                ((FormatListAttribute) ((g) this).instance).setValue(str);
                return this;
            }

            public final Builder setValueBytes(phc phcVar) {
                copyOnWrite();
                ((FormatListAttribute) ((g) this).instance).setValueBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m637clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m639mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m636clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m640mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(FormatListAttribute formatListAttribute) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(formatListAttribute);
        }

        public static FormatListAttribute parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (FormatListAttribute) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static FormatListAttribute parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static FormatListAttribute parseFrom(phc phcVar) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static FormatListAttribute parseFrom(phc phcVar, uz00 uz00Var) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static FormatListAttribute parseFrom(byte[] bArr) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FormatListAttribute parseFrom(byte[] bArr, uz00 uz00Var) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static FormatListAttribute parseFrom(InputStream inputStream) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FormatListAttribute parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static FormatListAttribute parseFrom(lwg lwgVar) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static FormatListAttribute parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (FormatListAttribute) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public enum GeoblockBlockingType implements v190 {
        GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED(0),
        GEOBLOCK_BLOCKING_TYPE_TITLE(1),
        GEOBLOCK_BLOCKING_TYPE_DESCRIPTION(2),
        GEOBLOCK_BLOCKING_TYPE_IMAGE(3);

        public static final int GEOBLOCK_BLOCKING_TYPE_DESCRIPTION_VALUE = 2;
        public static final int GEOBLOCK_BLOCKING_TYPE_IMAGE_VALUE = 3;
        public static final int GEOBLOCK_BLOCKING_TYPE_TITLE_VALUE = 1;
        public static final int GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED_VALUE = 0;
        private static final y190 internalValueMap = new AnonymousClass1();
        private final int value;

        public static final class GeoblockBlockingTypeVerifier implements z190 {
            static final z190 INSTANCE = new GeoblockBlockingTypeVerifier();

            private GeoblockBlockingTypeVerifier() {
            }

            public final boolean isInRange(int i) {
                return GeoblockBlockingType.forNumber(i) != null;
            }
        }

        GeoblockBlockingType(int i) {
            this.value = i;
        }

        public static GeoblockBlockingType forNumber(int i) {
            if (i == 0) {
                return GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return GEOBLOCK_BLOCKING_TYPE_TITLE;
            }
            if (i == 2) {
                return GEOBLOCK_BLOCKING_TYPE_DESCRIPTION;
            }
            if (i != 3) {
                return null;
            }
            return GEOBLOCK_BLOCKING_TYPE_IMAGE;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return GeoblockBlockingTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$GeoblockBlockingType$1, reason: invalid class name */
        public class AnonymousClass1 implements y190 {
            public final GeoblockBlockingType findValueByNumber(int i) {
                return GeoblockBlockingType.forNumber(i);
            }

            /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
            public final v190 m641findValueByNumber(int i) {
                return GeoblockBlockingType.forNumber(i);
            }
        }

        @Deprecated
        public static GeoblockBlockingType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Item extends h implements ItemOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 2;
        private static final Item DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URI_FIELD_NUMBER = 1;
        private ItemAttributes attributes_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String uri_ = "";

        static {
            Item item = new Item();
            DEFAULT_INSTANCE = item;
            h.registerDefaultInstance(Item.class, item);
        }

        private Item() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUri() {
            this.bitField0_ &= -2;
            this.uri_ = DEFAULT_INSTANCE.uri_;
        }

        public static Item getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAttributes(ItemAttributes itemAttributes) {
            itemAttributes.getClass();
            ItemAttributes itemAttributes2 = this.attributes_;
            if (itemAttributes2 == null || itemAttributes2 == ItemAttributes.getDefaultInstance()) {
                this.attributes_ = itemAttributes;
            } else {
                this.attributes_ = (ItemAttributes) ((ItemAttributes.Builder) ItemAttributes.newBuilder(this.attributes_).mergeFrom(itemAttributes)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Item parseDelimitedFrom(InputStream inputStream) {
            return (Item) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Item parseFrom(ByteBuffer byteBuffer) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(ItemAttributes itemAttributes) {
            itemAttributes.getClass();
            this.attributes_ = itemAttributes;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUri(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriBytes(phc phcVar) {
            this.uri_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "uri_", "attributes_"});
                case 3:
                    return new Item();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Item.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
        public final ItemAttributes getAttributes() {
            ItemAttributes itemAttributes = this.attributes_;
            return itemAttributes == null ? ItemAttributes.getDefaultInstance() : itemAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
        public final String getUri() {
            return this.uri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
        public final phc getUriBytes() {
            return phc.i(this.uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
        public final boolean hasAttributes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
        public final boolean hasUri() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ItemOrBuilder {
            private Builder() {
                super(Item.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAttributes() {
                copyOnWrite();
                ((Item) ((g) this).instance).clearAttributes();
                return this;
            }

            public final Builder clearUri() {
                copyOnWrite();
                ((Item) ((g) this).instance).clearUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
            public final ItemAttributes getAttributes() {
                return ((Item) ((g) this).instance).getAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
            public final String getUri() {
                return ((Item) ((g) this).instance).getUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
            public final phc getUriBytes() {
                return ((Item) ((g) this).instance).getUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
            public final boolean hasAttributes() {
                return ((Item) ((g) this).instance).hasAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemOrBuilder
            public final boolean hasUri() {
                return ((Item) ((g) this).instance).hasUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAttributes(ItemAttributes itemAttributes) {
                copyOnWrite();
                ((Item) ((g) this).instance).mergeAttributes(itemAttributes);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m644mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setAttributes(ItemAttributes.Builder builder) {
                copyOnWrite();
                ((Item) ((g) this).instance).setAttributes((ItemAttributes) builder.build());
                return this;
            }

            public final Builder setUri(String str) {
                copyOnWrite();
                ((Item) ((g) this).instance).setUri(str);
                return this;
            }

            public final Builder setUriBytes(phc phcVar) {
                copyOnWrite();
                ((Item) ((g) this).instance).setUriBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m643clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m645mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m642clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m646mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAttributes(ItemAttributes itemAttributes) {
                copyOnWrite();
                ((Item) ((g) this).instance).setAttributes(itemAttributes);
                return this;
            }
        }

        public static Builder newBuilder(Item item) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(item);
        }

        public static Item parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Item) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Item parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Item parseFrom(phc phcVar) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Item parseFrom(phc phcVar, uz00 uz00Var) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static Item parseFrom(byte[] bArr) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Item parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Item parseFrom(InputStream inputStream) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Item parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Item parseFrom(lwg lwgVar) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Item parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Item) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public enum ItemAttributeKind implements v190 {
        ITEM_UNKNOWN(0),
        ITEM_ADDED_BY(1),
        ITEM_TIMESTAMP(2),
        ITEM_SEEN_AT(9),
        ITEM_PUBLIC(10),
        ITEM_FORMAT_ATTRIBUTES(11),
        ITEM_ID(12),
        ITEM_SOURCE_LENS(13),
        ITEM_AVAILABLE_SIGNALS(14),
        ITEM_RECOMMENDATION_INFO(15),
        ITEM_SEQUENCE_CHILD_TEMPLATE(16),
        ITEM_SAVE_SOURCE(17),
        ITEM_TAGS(18),
        ITEM_SORT_VALUES(19);

        public static final int ITEM_ADDED_BY_VALUE = 1;
        public static final int ITEM_AVAILABLE_SIGNALS_VALUE = 14;
        public static final int ITEM_FORMAT_ATTRIBUTES_VALUE = 11;
        public static final int ITEM_ID_VALUE = 12;
        public static final int ITEM_PUBLIC_VALUE = 10;
        public static final int ITEM_RECOMMENDATION_INFO_VALUE = 15;
        public static final int ITEM_SAVE_SOURCE_VALUE = 17;
        public static final int ITEM_SEEN_AT_VALUE = 9;
        public static final int ITEM_SEQUENCE_CHILD_TEMPLATE_VALUE = 16;
        public static final int ITEM_SORT_VALUES_VALUE = 19;
        public static final int ITEM_SOURCE_LENS_VALUE = 13;
        public static final int ITEM_TAGS_VALUE = 18;
        public static final int ITEM_TIMESTAMP_VALUE = 2;
        public static final int ITEM_UNKNOWN_VALUE = 0;
        private static final y190 internalValueMap = new AnonymousClass1();
        private final int value;

        public static final class ItemAttributeKindVerifier implements z190 {
            static final z190 INSTANCE = new ItemAttributeKindVerifier();

            private ItemAttributeKindVerifier() {
            }

            public final boolean isInRange(int i) {
                return ItemAttributeKind.forNumber(i) != null;
            }
        }

        ItemAttributeKind(int i) {
            this.value = i;
        }

        public static ItemAttributeKind forNumber(int i) {
            if (i == 0) {
                return ITEM_UNKNOWN;
            }
            if (i == 1) {
                return ITEM_ADDED_BY;
            }
            if (i == 2) {
                return ITEM_TIMESTAMP;
            }
            switch (i) {
                case 9:
                    return ITEM_SEEN_AT;
                case 10:
                    return ITEM_PUBLIC;
                case 11:
                    return ITEM_FORMAT_ATTRIBUTES;
                case 12:
                    return ITEM_ID;
                case 13:
                    return ITEM_SOURCE_LENS;
                case 14:
                    return ITEM_AVAILABLE_SIGNALS;
                case 15:
                    return ITEM_RECOMMENDATION_INFO;
                case 16:
                    return ITEM_SEQUENCE_CHILD_TEMPLATE;
                case 17:
                    return ITEM_SAVE_SOURCE;
                case 18:
                    return ITEM_TAGS;
                case 19:
                    return ITEM_SORT_VALUES;
                default:
                    return null;
            }
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return ItemAttributeKindVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$ItemAttributeKind$1, reason: invalid class name */
        public class AnonymousClass1 implements y190 {
            public final ItemAttributeKind findValueByNumber(int i) {
                return ItemAttributeKind.forNumber(i);
            }

            /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
            public final v190 m647findValueByNumber(int i) {
                return ItemAttributeKind.forNumber(i);
            }
        }

        @Deprecated
        public static ItemAttributeKind valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ItemAttributes extends h implements ItemAttributesOrBuilder {
        public static final int ADDED_BY_FIELD_NUMBER = 1;
        public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 14;
        private static final ItemAttributes DEFAULT_INSTANCE;
        public static final int FORMAT_ATTRIBUTES_FIELD_NUMBER = 11;
        public static final int ITEM_ID_FIELD_NUMBER = 12;
        private static volatile qzr0 PARSER = null;
        public static final int PUBLIC_FIELD_NUMBER = 10;
        public static final int RECOMMENDATION_INFO_FIELD_NUMBER = 15;
        public static final int SAVE_SOURCE_FIELD_NUMBER = 17;
        public static final int SEEN_AT_FIELD_NUMBER = 9;
        public static final int SEQUENCE_CHILD_TEMPLATE_FIELD_NUMBER = 16;
        public static final int SORT_VALUES_FIELD_NUMBER = 19;
        public static final int SOURCE_LENS_FIELD_NUMBER = 13;
        public static final int TAGS_FIELD_NUMBER = 18;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private h290 availableSignals_;
        private int bitField0_;
        private phc itemId_;
        private boolean public_;
        private RecommendationInfo recommendationInfo_;
        private SaveSource saveSource_;
        private long seenAt_;
        private phc sequenceChildTemplate_;
        private Sorts$SortValues sortValues_;
        private LensModelProto$Lens sourceLens_;
        private TagsOuterClass$Tags tags_;
        private long timestamp_;
        private String addedBy_ = "";
        private h290 formatAttributes_ = h.emptyProtobufList();

        static {
            ItemAttributes itemAttributes = new ItemAttributes();
            DEFAULT_INSTANCE = itemAttributes;
            h.registerDefaultInstance(ItemAttributes.class, itemAttributes);
        }

        private ItemAttributes() {
            hhc hhcVar = phc.b;
            this.itemId_ = hhcVar;
            this.availableSignals_ = h.emptyProtobufList();
            this.sequenceChildTemplate_ = hhcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAvailableSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
            ensureAvailableSignalsIsMutable();
            s8.addAll(iterable, this.availableSignals_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFormatAttributes(Iterable<? extends FormatListAttribute> iterable) {
            ensureFormatAttributesIsMutable();
            s8.addAll(iterable, this.formatAttributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvailableSignals(SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.add(signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormatAttributes(FormatListAttribute formatListAttribute) {
            formatListAttribute.getClass();
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.add(formatListAttribute);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddedBy() {
            this.bitField0_ &= -2;
            this.addedBy_ = DEFAULT_INSTANCE.addedBy_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvailableSignals() {
            this.availableSignals_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormatAttributes() {
            this.formatAttributes_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItemId() {
            this.bitField0_ &= -17;
            this.itemId_ = DEFAULT_INSTANCE.itemId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublic() {
            this.bitField0_ &= -9;
            this.public_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecommendationInfo() {
            this.recommendationInfo_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSaveSource() {
            this.saveSource_ = null;
            this.bitField0_ &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeenAt() {
            this.bitField0_ &= -5;
            this.seenAt_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSequenceChildTemplate() {
            this.bitField0_ &= -129;
            this.sequenceChildTemplate_ = DEFAULT_INSTANCE.sequenceChildTemplate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSortValues() {
            this.sortValues_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceLens() {
            this.sourceLens_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTags() {
            this.tags_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.bitField0_ &= -3;
            this.timestamp_ = 0L;
        }

        private void ensureAvailableSignalsIsMutable() {
            i9 i9Var = this.availableSignals_;
            if (i9Var.a) {
                return;
            }
            this.availableSignals_ = h.mutableCopy(i9Var);
        }

        private void ensureFormatAttributesIsMutable() {
            i9 i9Var = this.formatAttributes_;
            if (i9Var.a) {
                return;
            }
            this.formatAttributes_ = h.mutableCopy(i9Var);
        }

        public static ItemAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRecommendationInfo(RecommendationInfo recommendationInfo) {
            recommendationInfo.getClass();
            RecommendationInfo recommendationInfo2 = this.recommendationInfo_;
            if (recommendationInfo2 == null || recommendationInfo2 == RecommendationInfo.getDefaultInstance()) {
                this.recommendationInfo_ = recommendationInfo;
            } else {
                this.recommendationInfo_ = (RecommendationInfo) ((RecommendationInfo.Builder) RecommendationInfo.newBuilder(this.recommendationInfo_).mergeFrom(recommendationInfo)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSaveSource(SaveSource saveSource) {
            saveSource.getClass();
            SaveSource saveSource2 = this.saveSource_;
            if (saveSource2 == null || saveSource2 == SaveSource.n()) {
                this.saveSource_ = saveSource;
            } else {
                this.saveSource_ = SaveSource.q(this.saveSource_).mergeFrom(saveSource).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSortValues(Sorts$SortValues sorts$SortValues) {
            sorts$SortValues.getClass();
            Sorts$SortValues sorts$SortValues2 = this.sortValues_;
            if (sorts$SortValues2 == null || sorts$SortValues2 == Sorts$SortValues.n()) {
                this.sortValues_ = sorts$SortValues;
            } else {
                this.sortValues_ = (Sorts$SortValues) ((mja1) Sorts$SortValues.o(this.sortValues_).mergeFrom(sorts$SortValues)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSourceLens(LensModelProto$Lens lensModelProto$Lens) {
            lensModelProto$Lens.getClass();
            LensModelProto$Lens lensModelProto$Lens2 = this.sourceLens_;
            if (lensModelProto$Lens2 == null || lensModelProto$Lens2 == LensModelProto$Lens.n()) {
                this.sourceLens_ = lensModelProto$Lens;
            } else {
                this.sourceLens_ = (LensModelProto$Lens) ((b3c0) LensModelProto$Lens.o(this.sourceLens_).mergeFrom(lensModelProto$Lens)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTags(TagsOuterClass$Tags tagsOuterClass$Tags) {
            tagsOuterClass$Tags.getClass();
            TagsOuterClass$Tags tagsOuterClass$Tags2 = this.tags_;
            if (tagsOuterClass$Tags2 == null || tagsOuterClass$Tags2 == TagsOuterClass$Tags.n()) {
                this.tags_ = tagsOuterClass$Tags;
            } else {
                this.tags_ = (TagsOuterClass$Tags) ((fpd1) TagsOuterClass$Tags.o(this.tags_).mergeFrom(tagsOuterClass$Tags)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ItemAttributes parseDelimitedFrom(InputStream inputStream) {
            return (ItemAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAttributes parseFrom(ByteBuffer byteBuffer) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAvailableSignals(int i) {
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFormatAttributes(int i) {
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddedBy(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.addedBy_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddedByBytes(phc phcVar) {
            this.addedBy_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.set(i, signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormatAttributes(int i, FormatListAttribute formatListAttribute) {
            formatListAttribute.getClass();
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.set(i, formatListAttribute);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItemId(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 16;
            this.itemId_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublic(boolean z) {
            this.bitField0_ |= 8;
            this.public_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecommendationInfo(RecommendationInfo recommendationInfo) {
            recommendationInfo.getClass();
            this.recommendationInfo_ = recommendationInfo;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSaveSource(SaveSource saveSource) {
            saveSource.getClass();
            this.saveSource_ = saveSource;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeenAt(long j) {
            this.bitField0_ |= 4;
            this.seenAt_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSequenceChildTemplate(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 128;
            this.sequenceChildTemplate_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSortValues(Sorts$SortValues sorts$SortValues) {
            sorts$SortValues.getClass();
            this.sortValues_ = sorts$SortValues;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceLens(LensModelProto$Lens lensModelProto$Lens) {
            lensModelProto$Lens.getClass();
            this.sourceLens_ = lensModelProto$Lens;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTags(TagsOuterClass$Tags tagsOuterClass$Tags) {
            tagsOuterClass$Tags.getClass();
            this.tags_ = tagsOuterClass$Tags;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.bitField0_ |= 2;
            this.timestamp_ = j;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဂ\u0001\tဂ\u0002\nဇ\u0003\u000b\u001b\fည\u0004\rဉ\u0005\u000e\u001b\u000fဉ\u0006\u0010ည\u0007\u0011ဉ\b\u0012ဉ\t\u0013ဉ\n", new Object[]{"bitField0_", "addedBy_", "timestamp_", "seenAt_", "public_", "formatAttributes_", FormatListAttribute.class, "itemId_", "sourceLens_", "availableSignals_", SignalModelProto$Signal.class, "recommendationInfo_", "sequenceChildTemplate_", "saveSource_", "tags_", "sortValues_"});
            }
            if (iOrdinal == 3) {
                return new ItemAttributes();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ItemAttributes.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final String getAddedBy() {
            return this.addedBy_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final phc getAddedByBytes() {
            return phc.i(this.addedBy_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final SignalModelProto$Signal getAvailableSignals(int i) {
            return (SignalModelProto$Signal) this.availableSignals_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final int getAvailableSignalsCount() {
            return this.availableSignals_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final List<SignalModelProto$Signal> getAvailableSignalsList() {
            return this.availableSignals_;
        }

        public final wl81 getAvailableSignalsOrBuilder(int i) {
            return (wl81) this.availableSignals_.get(i);
        }

        public final List<? extends wl81> getAvailableSignalsOrBuilderList() {
            return this.availableSignals_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final FormatListAttribute getFormatAttributes(int i) {
            return (FormatListAttribute) this.formatAttributes_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final int getFormatAttributesCount() {
            return this.formatAttributes_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final List<FormatListAttribute> getFormatAttributesList() {
            return this.formatAttributes_;
        }

        public final FormatListAttributeOrBuilder getFormatAttributesOrBuilder(int i) {
            return (FormatListAttributeOrBuilder) this.formatAttributes_.get(i);
        }

        public final List<? extends FormatListAttributeOrBuilder> getFormatAttributesOrBuilderList() {
            return this.formatAttributes_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final phc getItemId() {
            return this.itemId_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean getPublic() {
            return this.public_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final RecommendationInfo getRecommendationInfo() {
            RecommendationInfo recommendationInfo = this.recommendationInfo_;
            return recommendationInfo == null ? RecommendationInfo.getDefaultInstance() : recommendationInfo;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final SaveSource getSaveSource() {
            SaveSource saveSource = this.saveSource_;
            return saveSource == null ? SaveSource.n() : saveSource;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final long getSeenAt() {
            return this.seenAt_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final phc getSequenceChildTemplate() {
            return this.sequenceChildTemplate_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final Sorts$SortValues getSortValues() {
            Sorts$SortValues sorts$SortValues = this.sortValues_;
            return sorts$SortValues == null ? Sorts$SortValues.n() : sorts$SortValues;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final LensModelProto$Lens getSourceLens() {
            LensModelProto$Lens lensModelProto$Lens = this.sourceLens_;
            return lensModelProto$Lens == null ? LensModelProto$Lens.n() : lensModelProto$Lens;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final TagsOuterClass$Tags getTags() {
            TagsOuterClass$Tags tagsOuterClass$Tags = this.tags_;
            return tagsOuterClass$Tags == null ? TagsOuterClass$Tags.n() : tagsOuterClass$Tags;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasAddedBy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasItemId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasPublic() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasRecommendationInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasSaveSource() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasSeenAt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasSequenceChildTemplate() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasSortValues() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasSourceLens() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasTags() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
        public final boolean hasTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ItemAttributesOrBuilder {
            private Builder() {
                super(ItemAttributes.DEFAULT_INSTANCE);
            }

            public final Builder addAllAvailableSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addAllAvailableSignals(iterable);
                return this;
            }

            public final Builder addAllFormatAttributes(Iterable<? extends FormatListAttribute> iterable) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addAllFormatAttributes(iterable);
                return this;
            }

            public final Builder addAvailableSignals(vl81 vl81Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addAvailableSignals((SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final Builder addFormatAttributes(FormatListAttribute.Builder builder) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addFormatAttributes((FormatListAttribute) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAddedBy() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearAddedBy();
                return this;
            }

            public final Builder clearAvailableSignals() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearAvailableSignals();
                return this;
            }

            public final Builder clearFormatAttributes() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearFormatAttributes();
                return this;
            }

            public final Builder clearItemId() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearItemId();
                return this;
            }

            public final Builder clearPublic() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearPublic();
                return this;
            }

            public final Builder clearRecommendationInfo() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearRecommendationInfo();
                return this;
            }

            public final Builder clearSaveSource() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearSaveSource();
                return this;
            }

            public final Builder clearSeenAt() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearSeenAt();
                return this;
            }

            public final Builder clearSequenceChildTemplate() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearSequenceChildTemplate();
                return this;
            }

            public final Builder clearSortValues() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearSortValues();
                return this;
            }

            public final Builder clearSourceLens() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearSourceLens();
                return this;
            }

            public final Builder clearTags() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearTags();
                return this;
            }

            public final Builder clearTimestamp() {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).clearTimestamp();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final String getAddedBy() {
                return ((ItemAttributes) ((g) this).instance).getAddedBy();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final phc getAddedByBytes() {
                return ((ItemAttributes) ((g) this).instance).getAddedByBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final SignalModelProto$Signal getAvailableSignals(int i) {
                return ((ItemAttributes) ((g) this).instance).getAvailableSignals(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final int getAvailableSignalsCount() {
                return ((ItemAttributes) ((g) this).instance).getAvailableSignalsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final List<SignalModelProto$Signal> getAvailableSignalsList() {
                return Collections.unmodifiableList(((ItemAttributes) ((g) this).instance).getAvailableSignalsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final FormatListAttribute getFormatAttributes(int i) {
                return ((ItemAttributes) ((g) this).instance).getFormatAttributes(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final int getFormatAttributesCount() {
                return ((ItemAttributes) ((g) this).instance).getFormatAttributesCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final List<FormatListAttribute> getFormatAttributesList() {
                return Collections.unmodifiableList(((ItemAttributes) ((g) this).instance).getFormatAttributesList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final phc getItemId() {
                return ((ItemAttributes) ((g) this).instance).getItemId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean getPublic() {
                return ((ItemAttributes) ((g) this).instance).getPublic();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final RecommendationInfo getRecommendationInfo() {
                return ((ItemAttributes) ((g) this).instance).getRecommendationInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final SaveSource getSaveSource() {
                return ((ItemAttributes) ((g) this).instance).getSaveSource();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final long getSeenAt() {
                return ((ItemAttributes) ((g) this).instance).getSeenAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final phc getSequenceChildTemplate() {
                return ((ItemAttributes) ((g) this).instance).getSequenceChildTemplate();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final Sorts$SortValues getSortValues() {
                return ((ItemAttributes) ((g) this).instance).getSortValues();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final LensModelProto$Lens getSourceLens() {
                return ((ItemAttributes) ((g) this).instance).getSourceLens();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final TagsOuterClass$Tags getTags() {
                return ((ItemAttributes) ((g) this).instance).getTags();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final long getTimestamp() {
                return ((ItemAttributes) ((g) this).instance).getTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasAddedBy() {
                return ((ItemAttributes) ((g) this).instance).hasAddedBy();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasItemId() {
                return ((ItemAttributes) ((g) this).instance).hasItemId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasPublic() {
                return ((ItemAttributes) ((g) this).instance).hasPublic();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasRecommendationInfo() {
                return ((ItemAttributes) ((g) this).instance).hasRecommendationInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasSaveSource() {
                return ((ItemAttributes) ((g) this).instance).hasSaveSource();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasSeenAt() {
                return ((ItemAttributes) ((g) this).instance).hasSeenAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasSequenceChildTemplate() {
                return ((ItemAttributes) ((g) this).instance).hasSequenceChildTemplate();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasSortValues() {
                return ((ItemAttributes) ((g) this).instance).hasSortValues();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasSourceLens() {
                return ((ItemAttributes) ((g) this).instance).hasSourceLens();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasTags() {
                return ((ItemAttributes) ((g) this).instance).hasTags();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesOrBuilder
            public final boolean hasTimestamp() {
                return ((ItemAttributes) ((g) this).instance).hasTimestamp();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m650mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeRecommendationInfo(RecommendationInfo recommendationInfo) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).mergeRecommendationInfo(recommendationInfo);
                return this;
            }

            public final Builder mergeSaveSource(SaveSource saveSource) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).mergeSaveSource(saveSource);
                return this;
            }

            public final Builder mergeSortValues(Sorts$SortValues sorts$SortValues) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).mergeSortValues(sorts$SortValues);
                return this;
            }

            public final Builder mergeSourceLens(LensModelProto$Lens lensModelProto$Lens) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).mergeSourceLens(lensModelProto$Lens);
                return this;
            }

            public final Builder mergeTags(TagsOuterClass$Tags tagsOuterClass$Tags) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).mergeTags(tagsOuterClass$Tags);
                return this;
            }

            public final Builder removeAvailableSignals(int i) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).removeAvailableSignals(i);
                return this;
            }

            public final Builder removeFormatAttributes(int i) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).removeFormatAttributes(i);
                return this;
            }

            public final Builder setAddedBy(String str) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setAddedBy(str);
                return this;
            }

            public final Builder setAddedByBytes(phc phcVar) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setAddedByBytes(phcVar);
                return this;
            }

            public final Builder setAvailableSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setAvailableSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final Builder setFormatAttributes(int i, FormatListAttribute.Builder builder) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setFormatAttributes(i, (FormatListAttribute) builder.build());
                return this;
            }

            public final Builder setItemId(phc phcVar) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setItemId(phcVar);
                return this;
            }

            public final Builder setPublic(boolean z) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setPublic(z);
                return this;
            }

            public final Builder setRecommendationInfo(RecommendationInfo.Builder builder) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setRecommendationInfo((RecommendationInfo) builder.build());
                return this;
            }

            public final Builder setSaveSource(oc41 oc41Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSaveSource(oc41Var.build());
                return this;
            }

            public final Builder setSeenAt(long j) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSeenAt(j);
                return this;
            }

            public final Builder setSequenceChildTemplate(phc phcVar) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSequenceChildTemplate(phcVar);
                return this;
            }

            public final Builder setSortValues(mja1 mja1Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSortValues((Sorts$SortValues) mja1Var.build());
                return this;
            }

            public final Builder setSourceLens(b3c0 b3c0Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSourceLens((LensModelProto$Lens) b3c0Var.build());
                return this;
            }

            public final Builder setTags(fpd1 fpd1Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setTags((TagsOuterClass$Tags) fpd1Var.build());
                return this;
            }

            public final Builder setTimestamp(long j) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setTimestamp(j);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m649clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m651mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m648clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m652mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addAvailableSignals(i, signalModelProto$Signal);
                return this;
            }

            public final Builder addFormatAttributes(int i, FormatListAttribute formatListAttribute) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addFormatAttributes(i, formatListAttribute);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setAvailableSignals(i, signalModelProto$Signal);
                return this;
            }

            public final Builder setFormatAttributes(int i, FormatListAttribute formatListAttribute) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setFormatAttributes(i, formatListAttribute);
                return this;
            }

            public final Builder setRecommendationInfo(RecommendationInfo recommendationInfo) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setRecommendationInfo(recommendationInfo);
                return this;
            }

            public final Builder setSaveSource(SaveSource saveSource) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSaveSource(saveSource);
                return this;
            }

            public final Builder setSortValues(Sorts$SortValues sorts$SortValues) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSortValues(sorts$SortValues);
                return this;
            }

            public final Builder setSourceLens(LensModelProto$Lens lensModelProto$Lens) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setSourceLens(lensModelProto$Lens);
                return this;
            }

            public final Builder setTags(TagsOuterClass$Tags tagsOuterClass$Tags) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).setTags(tagsOuterClass$Tags);
                return this;
            }

            public final Builder addAvailableSignals(SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addAvailableSignals(signalModelProto$Signal);
                return this;
            }

            public final Builder addFormatAttributes(FormatListAttribute formatListAttribute) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addFormatAttributes(formatListAttribute);
                return this;
            }

            public final Builder addAvailableSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addAvailableSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final Builder addFormatAttributes(int i, FormatListAttribute.Builder builder) {
                copyOnWrite();
                ((ItemAttributes) ((g) this).instance).addFormatAttributes(i, (FormatListAttribute) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ItemAttributes itemAttributes) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(itemAttributes);
        }

        public static ItemAttributes parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ItemAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ItemAttributes parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ItemAttributes parseFrom(phc phcVar) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ItemAttributes parseFrom(phc phcVar, uz00 uz00Var) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.add(i, signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormatAttributes(int i, FormatListAttribute formatListAttribute) {
            formatListAttribute.getClass();
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.add(i, formatListAttribute);
        }

        public static ItemAttributes parseFrom(byte[] bArr) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ItemAttributes parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ItemAttributes parseFrom(InputStream inputStream) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAttributes parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ItemAttributes parseFrom(lwg lwgVar) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ItemAttributes parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ItemAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ItemAttributesPartialState extends h implements ItemAttributesPartialStateOrBuilder {
        private static final ItemAttributesPartialState DEFAULT_INSTANCE;
        public static final int NO_VALUE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private static final c290 noValue_converter_ = new AnonymousClass1();
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private b290 noValue_ = h.emptyIntList();
        private ItemAttributes values_;

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$ItemAttributesPartialState$1, reason: invalid class name */
        public class AnonymousClass1 implements c290 {
            /* JADX INFO: renamed from: convert, reason: merged with bridge method [inline-methods] */
            public final ItemAttributeKind m653convert(int i) {
                ItemAttributeKind itemAttributeKindForNumber = ItemAttributeKind.forNumber(i);
                return itemAttributeKindForNumber == null ? ItemAttributeKind.ITEM_UNKNOWN : itemAttributeKindForNumber;
            }
        }

        static {
            ItemAttributesPartialState itemAttributesPartialState = new ItemAttributesPartialState();
            DEFAULT_INSTANCE = itemAttributesPartialState;
            h.registerDefaultInstance(ItemAttributesPartialState.class, itemAttributesPartialState);
        }

        private ItemAttributesPartialState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNoValue(Iterable<? extends ItemAttributeKind> iterable) {
            ensureNoValueIsMutable();
            for (ItemAttributeKind itemAttributeKind : iterable) {
                this.noValue_.c(itemAttributeKind.getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNoValue(ItemAttributeKind itemAttributeKind) {
            itemAttributeKind.getClass();
            ensureNoValueIsMutable();
            this.noValue_.c(itemAttributeKind.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoValue() {
            this.noValue_ = h.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValues() {
            this.values_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureNoValueIsMutable() {
            i9 i9Var = this.noValue_;
            if (i9Var.a) {
                return;
            }
            this.noValue_ = h.mutableCopy(i9Var);
        }

        public static ItemAttributesPartialState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValues(ItemAttributes itemAttributes) {
            itemAttributes.getClass();
            ItemAttributes itemAttributes2 = this.values_;
            if (itemAttributes2 == null || itemAttributes2 == ItemAttributes.getDefaultInstance()) {
                this.values_ = itemAttributes;
            } else {
                this.values_ = (ItemAttributes) ((ItemAttributes.Builder) ItemAttributes.newBuilder(this.values_).mergeFrom(itemAttributes)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ItemAttributesPartialState parseDelimitedFrom(InputStream inputStream) {
            return (ItemAttributesPartialState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAttributesPartialState parseFrom(ByteBuffer byteBuffer) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoValue(int i, ItemAttributeKind itemAttributeKind) {
            itemAttributeKind.getClass();
            ensureNoValueIsMutable();
            this.noValue_.i(i, itemAttributeKind.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValues(ItemAttributes itemAttributes) {
            itemAttributes.getClass();
            this.values_ = itemAttributes;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    ItemAttributeKind itemAttributeKind = ItemAttributeKind.ITEM_UNKNOWN;
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔉ\u0000\u0002ࠞ", new Object[]{"bitField0_", "values_", "noValue_", ItemAttributeKind.ItemAttributeKindVerifier.INSTANCE});
                case 3:
                    return new ItemAttributesPartialState();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (ItemAttributesPartialState.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
        public final ItemAttributeKind getNoValue(int i) {
            ItemAttributeKind itemAttributeKindForNumber = ItemAttributeKind.forNumber(this.noValue_.e(i));
            return itemAttributeKindForNumber == null ? ItemAttributeKind.ITEM_UNKNOWN : itemAttributeKindForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
        public final int getNoValueCount() {
            return this.noValue_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
        public final List<ItemAttributeKind> getNoValueList() {
            return new d290(this.noValue_, noValue_converter_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
        public final ItemAttributes getValues() {
            ItemAttributes itemAttributes = this.values_;
            return itemAttributes == null ? ItemAttributes.getDefaultInstance() : itemAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
        public final boolean hasValues() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ItemAttributesPartialStateOrBuilder {
            private Builder() {
                super(ItemAttributesPartialState.DEFAULT_INSTANCE);
            }

            public final Builder addAllNoValue(Iterable<? extends ItemAttributeKind> iterable) {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).addAllNoValue(iterable);
                return this;
            }

            public final Builder addNoValue(ItemAttributeKind itemAttributeKind) {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).addNoValue(itemAttributeKind);
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearNoValue() {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).clearNoValue();
                return this;
            }

            public final Builder clearValues() {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).clearValues();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
            public final ItemAttributeKind getNoValue(int i) {
                return ((ItemAttributesPartialState) ((g) this).instance).getNoValue(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
            public final int getNoValueCount() {
                return ((ItemAttributesPartialState) ((g) this).instance).getNoValueCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
            public final List<ItemAttributeKind> getNoValueList() {
                return ((ItemAttributesPartialState) ((g) this).instance).getNoValueList();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
            public final ItemAttributes getValues() {
                return ((ItemAttributesPartialState) ((g) this).instance).getValues();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ItemAttributesPartialStateOrBuilder
            public final boolean hasValues() {
                return ((ItemAttributesPartialState) ((g) this).instance).hasValues();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m656mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeValues(ItemAttributes itemAttributes) {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).mergeValues(itemAttributes);
                return this;
            }

            public final Builder setNoValue(int i, ItemAttributeKind itemAttributeKind) {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).setNoValue(i, itemAttributeKind);
                return this;
            }

            public final Builder setValues(ItemAttributes.Builder builder) {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).setValues((ItemAttributes) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m655clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m657mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m654clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m658mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setValues(ItemAttributes itemAttributes) {
                copyOnWrite();
                ((ItemAttributesPartialState) ((g) this).instance).setValues(itemAttributes);
                return this;
            }
        }

        public static Builder newBuilder(ItemAttributesPartialState itemAttributesPartialState) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(itemAttributesPartialState);
        }

        public static ItemAttributesPartialState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ItemAttributesPartialState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ItemAttributesPartialState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ItemAttributesPartialState parseFrom(phc phcVar) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ItemAttributesPartialState parseFrom(phc phcVar, uz00 uz00Var) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ItemAttributesPartialState parseFrom(byte[] bArr) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ItemAttributesPartialState parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ItemAttributesPartialState parseFrom(InputStream inputStream) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAttributesPartialState parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ItemAttributesPartialState parseFrom(lwg lwgVar) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ItemAttributesPartialState parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ItemAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public enum ItemIdAlgorithm implements v190 {
        ALGORITHM_UNSPECIFIED(0),
        ALGORITHM_TRUNCATED_SHA1(1);

        public static final int ALGORITHM_TRUNCATED_SHA1_VALUE = 1;
        public static final int ALGORITHM_UNSPECIFIED_VALUE = 0;
        private static final y190 internalValueMap = new AnonymousClass1();
        private final int value;

        public static final class ItemIdAlgorithmVerifier implements z190 {
            static final z190 INSTANCE = new ItemIdAlgorithmVerifier();

            private ItemIdAlgorithmVerifier() {
            }

            public final boolean isInRange(int i) {
                return ItemIdAlgorithm.forNumber(i) != null;
            }
        }

        ItemIdAlgorithm(int i) {
            this.value = i;
        }

        public static ItemIdAlgorithm forNumber(int i) {
            if (i == 0) {
                return ALGORITHM_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return ALGORITHM_TRUNCATED_SHA1;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return ItemIdAlgorithmVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$ItemIdAlgorithm$1, reason: invalid class name */
        public class AnonymousClass1 implements y190 {
            public final ItemIdAlgorithm findValueByNumber(int i) {
                return ItemIdAlgorithm.forNumber(i);
            }

            /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
            public final v190 m659findValueByNumber(int i) {
                return ItemIdAlgorithm.forNumber(i);
            }
        }

        @Deprecated
        public static ItemIdAlgorithm valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum ListAttributeKind implements v190 {
        LIST_UNKNOWN(0),
        LIST_NAME(1),
        LIST_DESCRIPTION(2),
        LIST_PICTURE(3),
        LIST_COLLABORATIVE(4),
        LIST_PL3_VERSION(5),
        LIST_DELETED_BY_OWNER(6),
        LIST_CLIENT_ID(10),
        LIST_FORMAT(11),
        LIST_FORMAT_ATTRIBUTES(12),
        LIST_PICTURE_SIZE(13),
        LIST_SEQUENCE_CONTEXT_TEMPLATE(14),
        LIST_AI_CURATION_REFERENCE_ID(15),
        LIST_ITEM_ID_ALGORITHM(16),
        LIST_RECOVERABLE(17),
        LIST_IS_USER_CREATED(18),
        LIST_TAG_MANIFEST(19),
        LIST_SORT_MANIFEST(20);

        public static final int LIST_AI_CURATION_REFERENCE_ID_VALUE = 15;
        public static final int LIST_CLIENT_ID_VALUE = 10;
        public static final int LIST_COLLABORATIVE_VALUE = 4;
        public static final int LIST_DELETED_BY_OWNER_VALUE = 6;
        public static final int LIST_DESCRIPTION_VALUE = 2;
        public static final int LIST_FORMAT_ATTRIBUTES_VALUE = 12;
        public static final int LIST_FORMAT_VALUE = 11;
        public static final int LIST_IS_USER_CREATED_VALUE = 18;
        public static final int LIST_ITEM_ID_ALGORITHM_VALUE = 16;
        public static final int LIST_NAME_VALUE = 1;
        public static final int LIST_PICTURE_SIZE_VALUE = 13;
        public static final int LIST_PICTURE_VALUE = 3;
        public static final int LIST_PL3_VERSION_VALUE = 5;
        public static final int LIST_RECOVERABLE_VALUE = 17;
        public static final int LIST_SEQUENCE_CONTEXT_TEMPLATE_VALUE = 14;
        public static final int LIST_SORT_MANIFEST_VALUE = 20;
        public static final int LIST_TAG_MANIFEST_VALUE = 19;
        public static final int LIST_UNKNOWN_VALUE = 0;
        private static final y190 internalValueMap = new AnonymousClass1();
        private final int value;

        public static final class ListAttributeKindVerifier implements z190 {
            static final z190 INSTANCE = new ListAttributeKindVerifier();

            private ListAttributeKindVerifier() {
            }

            public final boolean isInRange(int i) {
                return ListAttributeKind.forNumber(i) != null;
            }
        }

        ListAttributeKind(int i) {
            this.value = i;
        }

        public static ListAttributeKind forNumber(int i) {
            switch (i) {
                case 0:
                    return LIST_UNKNOWN;
                case 1:
                    return LIST_NAME;
                case 2:
                    return LIST_DESCRIPTION;
                case 3:
                    return LIST_PICTURE;
                case 4:
                    return LIST_COLLABORATIVE;
                case 5:
                    return LIST_PL3_VERSION;
                case 6:
                    return LIST_DELETED_BY_OWNER;
                case 7:
                case 8:
                case 9:
                default:
                    return null;
                case 10:
                    return LIST_CLIENT_ID;
                case 11:
                    return LIST_FORMAT;
                case 12:
                    return LIST_FORMAT_ATTRIBUTES;
                case 13:
                    return LIST_PICTURE_SIZE;
                case 14:
                    return LIST_SEQUENCE_CONTEXT_TEMPLATE;
                case 15:
                    return LIST_AI_CURATION_REFERENCE_ID;
                case 16:
                    return LIST_ITEM_ID_ALGORITHM;
                case 17:
                    return LIST_RECOVERABLE;
                case 18:
                    return LIST_IS_USER_CREATED;
                case 19:
                    return LIST_TAG_MANIFEST;
                case 20:
                    return LIST_SORT_MANIFEST;
            }
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return ListAttributeKindVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributeKind$1, reason: invalid class name */
        public class AnonymousClass1 implements y190 {
            public final ListAttributeKind findValueByNumber(int i) {
                return ListAttributeKind.forNumber(i);
            }

            /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
            public final v190 m660findValueByNumber(int i) {
                return ListAttributeKind.forNumber(i);
            }
        }

        @Deprecated
        public static ListAttributeKind valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ListAttributes extends h implements ListAttributesOrBuilder {
        public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 15;
        public static final int CLIENT_ID_FIELD_NUMBER = 10;
        public static final int COLLABORATIVE_FIELD_NUMBER = 4;
        private static final ListAttributes DEFAULT_INSTANCE;
        public static final int DELETED_BY_OWNER_FIELD_NUMBER = 6;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FORMAT_ATTRIBUTES_FIELD_NUMBER = 12;
        public static final int FORMAT_FIELD_NUMBER = 11;
        public static final int IS_USER_CREATED_FIELD_NUMBER = 18;
        public static final int ITEM_ID_ALGORITHM_FIELD_NUMBER = 16;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int PICTURE_FIELD_NUMBER = 3;
        public static final int PICTURE_SIZE_FIELD_NUMBER = 13;
        public static final int PL3_VERSION_FIELD_NUMBER = 5;
        public static final int RECOVERABLE_FIELD_NUMBER = 17;
        public static final int SEQUENCE_CONTEXT_TEMPLATE_FIELD_NUMBER = 14;
        public static final int SORT_MANIFEST_FIELD_NUMBER = 20;
        public static final int TAG_MANIFEST_FIELD_NUMBER = 19;
        private phc aiCurationReferenceId_;
        private int bitField0_;
        private String clientId_;
        private boolean collaborative_;
        private boolean deletedByOwner_;
        private h290 formatAttributes_;
        private String format_;
        private boolean isUserCreated_;
        private int itemIdAlgorithm_;
        private h290 pictureSize_;
        private phc picture_;
        private String pl3Version_;
        private boolean recoverable_;
        private phc sequenceContextTemplate_;
        private Sorts$SortManifest sortManifest_;
        private TagsOuterClass$TagManifest tagManifest_;
        private String name_ = "";
        private String description_ = "";

        static {
            ListAttributes listAttributes = new ListAttributes();
            DEFAULT_INSTANCE = listAttributes;
            h.registerDefaultInstance(ListAttributes.class, listAttributes);
        }

        private ListAttributes() {
            hhc hhcVar = phc.b;
            this.picture_ = hhcVar;
            this.pl3Version_ = "";
            this.clientId_ = "";
            this.format_ = "";
            this.formatAttributes_ = h.emptyProtobufList();
            this.pictureSize_ = h.emptyProtobufList();
            this.sequenceContextTemplate_ = hhcVar;
            this.aiCurationReferenceId_ = hhcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFormatAttributes(Iterable<? extends FormatListAttribute> iterable) {
            ensureFormatAttributesIsMutable();
            s8.addAll(iterable, this.formatAttributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPictureSize(Iterable<? extends PictureSize> iterable) {
            ensurePictureSizeIsMutable();
            s8.addAll(iterable, this.pictureSize_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormatAttributes(FormatListAttribute formatListAttribute) {
            formatListAttribute.getClass();
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.add(formatListAttribute);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPictureSize(PictureSize pictureSize) {
            pictureSize.getClass();
            ensurePictureSizeIsMutable();
            this.pictureSize_.add(pictureSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAiCurationReferenceId() {
            this.bitField0_ &= -513;
            this.aiCurationReferenceId_ = DEFAULT_INSTANCE.aiCurationReferenceId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.bitField0_ &= -65;
            this.clientId_ = DEFAULT_INSTANCE.clientId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollaborative() {
            this.bitField0_ &= -9;
            this.collaborative_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeletedByOwner() {
            this.bitField0_ &= -33;
            this.deletedByOwner_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.bitField0_ &= -3;
            this.description_ = DEFAULT_INSTANCE.description_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormat() {
            this.bitField0_ &= -129;
            this.format_ = DEFAULT_INSTANCE.format_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFormatAttributes() {
            this.formatAttributes_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsUserCreated() {
            this.bitField0_ &= -4097;
            this.isUserCreated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItemIdAlgorithm() {
            this.bitField0_ &= -1025;
            this.itemIdAlgorithm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = DEFAULT_INSTANCE.name_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicture() {
            this.bitField0_ &= -5;
            this.picture_ = DEFAULT_INSTANCE.picture_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPictureSize() {
            this.pictureSize_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPl3Version() {
            this.bitField0_ &= -17;
            this.pl3Version_ = DEFAULT_INSTANCE.pl3Version_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoverable() {
            this.bitField0_ &= -2049;
            this.recoverable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSequenceContextTemplate() {
            this.bitField0_ &= -257;
            this.sequenceContextTemplate_ = DEFAULT_INSTANCE.sequenceContextTemplate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSortManifest() {
            this.sortManifest_ = null;
            this.bitField0_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagManifest() {
            this.tagManifest_ = null;
            this.bitField0_ &= -8193;
        }

        private void ensureFormatAttributesIsMutable() {
            i9 i9Var = this.formatAttributes_;
            if (i9Var.a) {
                return;
            }
            this.formatAttributes_ = h.mutableCopy(i9Var);
        }

        private void ensurePictureSizeIsMutable() {
            i9 i9Var = this.pictureSize_;
            if (i9Var.a) {
                return;
            }
            this.pictureSize_ = h.mutableCopy(i9Var);
        }

        public static ListAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSortManifest(Sorts$SortManifest sorts$SortManifest) {
            sorts$SortManifest.getClass();
            Sorts$SortManifest sorts$SortManifest2 = this.sortManifest_;
            if (sorts$SortManifest2 == null || sorts$SortManifest2 == Sorts$SortManifest.n()) {
                this.sortManifest_ = sorts$SortManifest;
            } else {
                this.sortManifest_ = (Sorts$SortManifest) ((lja1) Sorts$SortManifest.o(this.sortManifest_).mergeFrom(sorts$SortManifest)).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTagManifest(TagsOuterClass$TagManifest tagsOuterClass$TagManifest) {
            tagsOuterClass$TagManifest.getClass();
            TagsOuterClass$TagManifest tagsOuterClass$TagManifest2 = this.tagManifest_;
            if (tagsOuterClass$TagManifest2 == null || tagsOuterClass$TagManifest2 == TagsOuterClass$TagManifest.n()) {
                this.tagManifest_ = tagsOuterClass$TagManifest;
            } else {
                this.tagManifest_ = (TagsOuterClass$TagManifest) ((epd1) TagsOuterClass$TagManifest.o(this.tagManifest_).mergeFrom(tagsOuterClass$TagManifest)).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListAttributes parseDelimitedFrom(InputStream inputStream) {
            return (ListAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListAttributes parseFrom(ByteBuffer byteBuffer) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFormatAttributes(int i) {
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePictureSize(int i) {
            ensurePictureSizeIsMutable();
            this.pictureSize_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAiCurationReferenceId(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 512;
            this.aiCurationReferenceId_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(phc phcVar) {
            this.clientId_ = phcVar.v();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollaborative(boolean z) {
            this.bitField0_ |= 8;
            this.collaborative_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeletedByOwner(boolean z) {
            this.bitField0_ |= 32;
            this.deletedByOwner_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(phc phcVar) {
            this.description_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormat(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.format_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormatAttributes(int i, FormatListAttribute formatListAttribute) {
            formatListAttribute.getClass();
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.set(i, formatListAttribute);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormatBytes(phc phcVar) {
            this.format_ = phcVar.v();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsUserCreated(boolean z) {
            this.bitField0_ |= 4096;
            this.isUserCreated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItemIdAlgorithm(ItemIdAlgorithm itemIdAlgorithm) {
            this.itemIdAlgorithm_ = itemIdAlgorithm.getNumber();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(phc phcVar) {
            this.name_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicture(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 4;
            this.picture_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureSize(int i, PictureSize pictureSize) {
            pictureSize.getClass();
            ensurePictureSizeIsMutable();
            this.pictureSize_.set(i, pictureSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPl3Version(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.pl3Version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPl3VersionBytes(phc phcVar) {
            this.pl3Version_ = phcVar.v();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverable(boolean z) {
            this.bitField0_ |= 2048;
            this.recoverable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSequenceContextTemplate(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 256;
            this.sequenceContextTemplate_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSortManifest(Sorts$SortManifest sorts$SortManifest) {
            sorts$SortManifest.getClass();
            this.sortManifest_ = sorts$SortManifest;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagManifest(TagsOuterClass$TagManifest tagsOuterClass$TagManifest) {
            tagsOuterClass$TagManifest.getClass();
            this.tagManifest_ = tagsOuterClass$TagManifest;
            this.bitField0_ |= 8192;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                ItemIdAlgorithm itemIdAlgorithm = ItemIdAlgorithm.ALGORITHM_UNSPECIFIED;
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0014\u0011\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\nဈ\u0006\u000bဈ\u0007\f\u001b\r\u001b\u000eည\b\u000fည\t\u0010᠌\n\u0011ဇ\u000b\u0012ဇ\f\u0013ဉ\r\u0014ဉ\u000e", new Object[]{"bitField0_", "name_", "description_", "picture_", "collaborative_", "pl3Version_", "deletedByOwner_", "clientId_", "format_", "formatAttributes_", FormatListAttribute.class, "pictureSize_", PictureSize.class, "sequenceContextTemplate_", "aiCurationReferenceId_", "itemIdAlgorithm_", ItemIdAlgorithm.ItemIdAlgorithmVerifier.INSTANCE, "recoverable_", "isUserCreated_", "tagManifest_", "sortManifest_"});
            }
            if (iOrdinal == 3) {
                return new ListAttributes();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ListAttributes.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getAiCurationReferenceId() {
            return this.aiCurationReferenceId_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final String getClientId() {
            return this.clientId_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getClientIdBytes() {
            return phc.i(this.clientId_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean getCollaborative() {
            return this.collaborative_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean getDeletedByOwner() {
            return this.deletedByOwner_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final String getDescription() {
            return this.description_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getDescriptionBytes() {
            return phc.i(this.description_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final String getFormat() {
            return this.format_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final FormatListAttribute getFormatAttributes(int i) {
            return (FormatListAttribute) this.formatAttributes_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final int getFormatAttributesCount() {
            return this.formatAttributes_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final List<FormatListAttribute> getFormatAttributesList() {
            return this.formatAttributes_;
        }

        public final FormatListAttributeOrBuilder getFormatAttributesOrBuilder(int i) {
            return (FormatListAttributeOrBuilder) this.formatAttributes_.get(i);
        }

        public final List<? extends FormatListAttributeOrBuilder> getFormatAttributesOrBuilderList() {
            return this.formatAttributes_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getFormatBytes() {
            return phc.i(this.format_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean getIsUserCreated() {
            return this.isUserCreated_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final ItemIdAlgorithm getItemIdAlgorithm() {
            ItemIdAlgorithm itemIdAlgorithmForNumber = ItemIdAlgorithm.forNumber(this.itemIdAlgorithm_);
            return itemIdAlgorithmForNumber == null ? ItemIdAlgorithm.ALGORITHM_UNSPECIFIED : itemIdAlgorithmForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final String getName() {
            return this.name_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getNameBytes() {
            return phc.i(this.name_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getPicture() {
            return this.picture_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final PictureSize getPictureSize(int i) {
            return (PictureSize) this.pictureSize_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final int getPictureSizeCount() {
            return this.pictureSize_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final List<PictureSize> getPictureSizeList() {
            return this.pictureSize_;
        }

        public final PictureSizeOrBuilder getPictureSizeOrBuilder(int i) {
            return (PictureSizeOrBuilder) this.pictureSize_.get(i);
        }

        public final List<? extends PictureSizeOrBuilder> getPictureSizeOrBuilderList() {
            return this.pictureSize_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final String getPl3Version() {
            return this.pl3Version_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getPl3VersionBytes() {
            return phc.i(this.pl3Version_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean getRecoverable() {
            return this.recoverable_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final phc getSequenceContextTemplate() {
            return this.sequenceContextTemplate_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final Sorts$SortManifest getSortManifest() {
            Sorts$SortManifest sorts$SortManifest = this.sortManifest_;
            return sorts$SortManifest == null ? Sorts$SortManifest.n() : sorts$SortManifest;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final TagsOuterClass$TagManifest getTagManifest() {
            TagsOuterClass$TagManifest tagsOuterClass$TagManifest = this.tagManifest_;
            return tagsOuterClass$TagManifest == null ? TagsOuterClass$TagManifest.n() : tagsOuterClass$TagManifest;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasAiCurationReferenceId() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasClientId() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasCollaborative() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasDeletedByOwner() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasDescription() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasFormat() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasIsUserCreated() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasItemIdAlgorithm() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasPicture() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasPl3Version() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasRecoverable() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasSequenceContextTemplate() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasSortManifest() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
        public final boolean hasTagManifest() {
            return (this.bitField0_ & 8192) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ListAttributesOrBuilder {
            private Builder() {
                super(ListAttributes.DEFAULT_INSTANCE);
            }

            public final Builder addAllFormatAttributes(Iterable<? extends FormatListAttribute> iterable) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addAllFormatAttributes(iterable);
                return this;
            }

            public final Builder addAllPictureSize(Iterable<? extends PictureSize> iterable) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addAllPictureSize(iterable);
                return this;
            }

            public final Builder addFormatAttributes(FormatListAttribute.Builder builder) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addFormatAttributes((FormatListAttribute) builder.build());
                return this;
            }

            public final Builder addPictureSize(PictureSize.Builder builder) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addPictureSize((PictureSize) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAiCurationReferenceId() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearAiCurationReferenceId();
                return this;
            }

            public final Builder clearClientId() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearClientId();
                return this;
            }

            public final Builder clearCollaborative() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearCollaborative();
                return this;
            }

            public final Builder clearDeletedByOwner() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearDeletedByOwner();
                return this;
            }

            public final Builder clearDescription() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearDescription();
                return this;
            }

            public final Builder clearFormat() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearFormat();
                return this;
            }

            public final Builder clearFormatAttributes() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearFormatAttributes();
                return this;
            }

            public final Builder clearIsUserCreated() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearIsUserCreated();
                return this;
            }

            public final Builder clearItemIdAlgorithm() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearItemIdAlgorithm();
                return this;
            }

            public final Builder clearName() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearName();
                return this;
            }

            public final Builder clearPicture() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearPicture();
                return this;
            }

            public final Builder clearPictureSize() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearPictureSize();
                return this;
            }

            public final Builder clearPl3Version() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearPl3Version();
                return this;
            }

            public final Builder clearRecoverable() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearRecoverable();
                return this;
            }

            public final Builder clearSequenceContextTemplate() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearSequenceContextTemplate();
                return this;
            }

            public final Builder clearSortManifest() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearSortManifest();
                return this;
            }

            public final Builder clearTagManifest() {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).clearTagManifest();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getAiCurationReferenceId() {
                return ((ListAttributes) ((g) this).instance).getAiCurationReferenceId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final String getClientId() {
                return ((ListAttributes) ((g) this).instance).getClientId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getClientIdBytes() {
                return ((ListAttributes) ((g) this).instance).getClientIdBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean getCollaborative() {
                return ((ListAttributes) ((g) this).instance).getCollaborative();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean getDeletedByOwner() {
                return ((ListAttributes) ((g) this).instance).getDeletedByOwner();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final String getDescription() {
                return ((ListAttributes) ((g) this).instance).getDescription();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getDescriptionBytes() {
                return ((ListAttributes) ((g) this).instance).getDescriptionBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final String getFormat() {
                return ((ListAttributes) ((g) this).instance).getFormat();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final FormatListAttribute getFormatAttributes(int i) {
                return ((ListAttributes) ((g) this).instance).getFormatAttributes(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final int getFormatAttributesCount() {
                return ((ListAttributes) ((g) this).instance).getFormatAttributesCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final List<FormatListAttribute> getFormatAttributesList() {
                return Collections.unmodifiableList(((ListAttributes) ((g) this).instance).getFormatAttributesList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getFormatBytes() {
                return ((ListAttributes) ((g) this).instance).getFormatBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean getIsUserCreated() {
                return ((ListAttributes) ((g) this).instance).getIsUserCreated();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final ItemIdAlgorithm getItemIdAlgorithm() {
                return ((ListAttributes) ((g) this).instance).getItemIdAlgorithm();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final String getName() {
                return ((ListAttributes) ((g) this).instance).getName();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getNameBytes() {
                return ((ListAttributes) ((g) this).instance).getNameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getPicture() {
                return ((ListAttributes) ((g) this).instance).getPicture();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final PictureSize getPictureSize(int i) {
                return ((ListAttributes) ((g) this).instance).getPictureSize(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final int getPictureSizeCount() {
                return ((ListAttributes) ((g) this).instance).getPictureSizeCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final List<PictureSize> getPictureSizeList() {
                return Collections.unmodifiableList(((ListAttributes) ((g) this).instance).getPictureSizeList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final String getPl3Version() {
                return ((ListAttributes) ((g) this).instance).getPl3Version();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getPl3VersionBytes() {
                return ((ListAttributes) ((g) this).instance).getPl3VersionBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean getRecoverable() {
                return ((ListAttributes) ((g) this).instance).getRecoverable();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final phc getSequenceContextTemplate() {
                return ((ListAttributes) ((g) this).instance).getSequenceContextTemplate();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final Sorts$SortManifest getSortManifest() {
                return ((ListAttributes) ((g) this).instance).getSortManifest();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final TagsOuterClass$TagManifest getTagManifest() {
                return ((ListAttributes) ((g) this).instance).getTagManifest();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasAiCurationReferenceId() {
                return ((ListAttributes) ((g) this).instance).hasAiCurationReferenceId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasClientId() {
                return ((ListAttributes) ((g) this).instance).hasClientId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasCollaborative() {
                return ((ListAttributes) ((g) this).instance).hasCollaborative();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasDeletedByOwner() {
                return ((ListAttributes) ((g) this).instance).hasDeletedByOwner();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasDescription() {
                return ((ListAttributes) ((g) this).instance).hasDescription();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasFormat() {
                return ((ListAttributes) ((g) this).instance).hasFormat();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasIsUserCreated() {
                return ((ListAttributes) ((g) this).instance).hasIsUserCreated();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasItemIdAlgorithm() {
                return ((ListAttributes) ((g) this).instance).hasItemIdAlgorithm();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasName() {
                return ((ListAttributes) ((g) this).instance).hasName();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasPicture() {
                return ((ListAttributes) ((g) this).instance).hasPicture();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasPl3Version() {
                return ((ListAttributes) ((g) this).instance).hasPl3Version();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasRecoverable() {
                return ((ListAttributes) ((g) this).instance).hasRecoverable();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasSequenceContextTemplate() {
                return ((ListAttributes) ((g) this).instance).hasSequenceContextTemplate();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasSortManifest() {
                return ((ListAttributes) ((g) this).instance).hasSortManifest();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesOrBuilder
            public final boolean hasTagManifest() {
                return ((ListAttributes) ((g) this).instance).hasTagManifest();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m663mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeSortManifest(Sorts$SortManifest sorts$SortManifest) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).mergeSortManifest(sorts$SortManifest);
                return this;
            }

            public final Builder mergeTagManifest(TagsOuterClass$TagManifest tagsOuterClass$TagManifest) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).mergeTagManifest(tagsOuterClass$TagManifest);
                return this;
            }

            public final Builder removeFormatAttributes(int i) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).removeFormatAttributes(i);
                return this;
            }

            public final Builder removePictureSize(int i) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).removePictureSize(i);
                return this;
            }

            public final Builder setAiCurationReferenceId(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setAiCurationReferenceId(phcVar);
                return this;
            }

            public final Builder setClientId(String str) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setClientId(str);
                return this;
            }

            public final Builder setClientIdBytes(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setClientIdBytes(phcVar);
                return this;
            }

            public final Builder setCollaborative(boolean z) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setCollaborative(z);
                return this;
            }

            public final Builder setDeletedByOwner(boolean z) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setDeletedByOwner(z);
                return this;
            }

            public final Builder setDescription(String str) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setDescription(str);
                return this;
            }

            public final Builder setDescriptionBytes(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setDescriptionBytes(phcVar);
                return this;
            }

            public final Builder setFormat(String str) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setFormat(str);
                return this;
            }

            public final Builder setFormatAttributes(int i, FormatListAttribute.Builder builder) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setFormatAttributes(i, (FormatListAttribute) builder.build());
                return this;
            }

            public final Builder setFormatBytes(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setFormatBytes(phcVar);
                return this;
            }

            public final Builder setIsUserCreated(boolean z) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setIsUserCreated(z);
                return this;
            }

            public final Builder setItemIdAlgorithm(ItemIdAlgorithm itemIdAlgorithm) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setItemIdAlgorithm(itemIdAlgorithm);
                return this;
            }

            public final Builder setName(String str) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setName(str);
                return this;
            }

            public final Builder setNameBytes(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setNameBytes(phcVar);
                return this;
            }

            public final Builder setPicture(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setPicture(phcVar);
                return this;
            }

            public final Builder setPictureSize(int i, PictureSize.Builder builder) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setPictureSize(i, (PictureSize) builder.build());
                return this;
            }

            public final Builder setPl3Version(String str) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setPl3Version(str);
                return this;
            }

            public final Builder setPl3VersionBytes(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setPl3VersionBytes(phcVar);
                return this;
            }

            public final Builder setRecoverable(boolean z) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setRecoverable(z);
                return this;
            }

            public final Builder setSequenceContextTemplate(phc phcVar) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setSequenceContextTemplate(phcVar);
                return this;
            }

            public final Builder setSortManifest(lja1 lja1Var) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setSortManifest((Sorts$SortManifest) lja1Var.build());
                return this;
            }

            public final Builder setTagManifest(epd1 epd1Var) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setTagManifest((TagsOuterClass$TagManifest) epd1Var.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m662clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m664mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m661clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m665mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addFormatAttributes(int i, FormatListAttribute formatListAttribute) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addFormatAttributes(i, formatListAttribute);
                return this;
            }

            public final Builder addPictureSize(int i, PictureSize pictureSize) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addPictureSize(i, pictureSize);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setFormatAttributes(int i, FormatListAttribute formatListAttribute) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setFormatAttributes(i, formatListAttribute);
                return this;
            }

            public final Builder setPictureSize(int i, PictureSize pictureSize) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setPictureSize(i, pictureSize);
                return this;
            }

            public final Builder setSortManifest(Sorts$SortManifest sorts$SortManifest) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setSortManifest(sorts$SortManifest);
                return this;
            }

            public final Builder setTagManifest(TagsOuterClass$TagManifest tagsOuterClass$TagManifest) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).setTagManifest(tagsOuterClass$TagManifest);
                return this;
            }

            public final Builder addFormatAttributes(FormatListAttribute formatListAttribute) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addFormatAttributes(formatListAttribute);
                return this;
            }

            public final Builder addPictureSize(PictureSize pictureSize) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addPictureSize(pictureSize);
                return this;
            }

            public final Builder addFormatAttributes(int i, FormatListAttribute.Builder builder) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addFormatAttributes(i, (FormatListAttribute) builder.build());
                return this;
            }

            public final Builder addPictureSize(int i, PictureSize.Builder builder) {
                copyOnWrite();
                ((ListAttributes) ((g) this).instance).addPictureSize(i, (PictureSize) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ListAttributes listAttributes) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(listAttributes);
        }

        public static ListAttributes parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListAttributes parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ListAttributes parseFrom(phc phcVar) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ListAttributes parseFrom(phc phcVar, uz00 uz00Var) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFormatAttributes(int i, FormatListAttribute formatListAttribute) {
            formatListAttribute.getClass();
            ensureFormatAttributesIsMutable();
            this.formatAttributes_.add(i, formatListAttribute);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPictureSize(int i, PictureSize pictureSize) {
            pictureSize.getClass();
            ensurePictureSizeIsMutable();
            this.pictureSize_.add(i, pictureSize);
        }

        public static ListAttributes parseFrom(byte[] bArr) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListAttributes parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ListAttributes parseFrom(InputStream inputStream) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListAttributes parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListAttributes parseFrom(lwg lwgVar) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ListAttributes parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ListAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ListAttributesPartialState extends h implements ListAttributesPartialStateOrBuilder {
        private static final ListAttributesPartialState DEFAULT_INSTANCE;
        public static final int NO_VALUE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private static final c290 noValue_converter_ = new AnonymousClass1();
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private b290 noValue_ = h.emptyIntList();
        private ListAttributes values_;

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributesPartialState$1, reason: invalid class name */
        public class AnonymousClass1 implements c290 {
            /* JADX INFO: renamed from: convert, reason: merged with bridge method [inline-methods] */
            public final ListAttributeKind m666convert(int i) {
                ListAttributeKind listAttributeKindForNumber = ListAttributeKind.forNumber(i);
                return listAttributeKindForNumber == null ? ListAttributeKind.LIST_UNKNOWN : listAttributeKindForNumber;
            }
        }

        static {
            ListAttributesPartialState listAttributesPartialState = new ListAttributesPartialState();
            DEFAULT_INSTANCE = listAttributesPartialState;
            h.registerDefaultInstance(ListAttributesPartialState.class, listAttributesPartialState);
        }

        private ListAttributesPartialState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNoValue(Iterable<? extends ListAttributeKind> iterable) {
            ensureNoValueIsMutable();
            for (ListAttributeKind listAttributeKind : iterable) {
                this.noValue_.c(listAttributeKind.getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNoValue(ListAttributeKind listAttributeKind) {
            listAttributeKind.getClass();
            ensureNoValueIsMutable();
            this.noValue_.c(listAttributeKind.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoValue() {
            this.noValue_ = h.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValues() {
            this.values_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureNoValueIsMutable() {
            i9 i9Var = this.noValue_;
            if (i9Var.a) {
                return;
            }
            this.noValue_ = h.mutableCopy(i9Var);
        }

        public static ListAttributesPartialState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValues(ListAttributes listAttributes) {
            listAttributes.getClass();
            ListAttributes listAttributes2 = this.values_;
            if (listAttributes2 == null || listAttributes2 == ListAttributes.getDefaultInstance()) {
                this.values_ = listAttributes;
            } else {
                this.values_ = (ListAttributes) ((ListAttributes.Builder) ListAttributes.newBuilder(this.values_).mergeFrom(listAttributes)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListAttributesPartialState parseDelimitedFrom(InputStream inputStream) {
            return (ListAttributesPartialState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListAttributesPartialState parseFrom(ByteBuffer byteBuffer) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoValue(int i, ListAttributeKind listAttributeKind) {
            listAttributeKind.getClass();
            ensureNoValueIsMutable();
            this.noValue_.i(i, listAttributeKind.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValues(ListAttributes listAttributes) {
            listAttributes.getClass();
            this.values_ = listAttributes;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    ListAttributeKind listAttributeKind = ListAttributeKind.LIST_UNKNOWN;
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔉ\u0000\u0002ࠞ", new Object[]{"bitField0_", "values_", "noValue_", ListAttributeKind.ListAttributeKindVerifier.INSTANCE});
                case 3:
                    return new ListAttributesPartialState();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (ListAttributesPartialState.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
        public final ListAttributeKind getNoValue(int i) {
            ListAttributeKind listAttributeKindForNumber = ListAttributeKind.forNumber(this.noValue_.e(i));
            return listAttributeKindForNumber == null ? ListAttributeKind.LIST_UNKNOWN : listAttributeKindForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
        public final int getNoValueCount() {
            return this.noValue_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
        public final List<ListAttributeKind> getNoValueList() {
            return new d290(this.noValue_, noValue_converter_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
        public final ListAttributes getValues() {
            ListAttributes listAttributes = this.values_;
            return listAttributes == null ? ListAttributes.getDefaultInstance() : listAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
        public final boolean hasValues() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ListAttributesPartialStateOrBuilder {
            private Builder() {
                super(ListAttributesPartialState.DEFAULT_INSTANCE);
            }

            public final Builder addAllNoValue(Iterable<? extends ListAttributeKind> iterable) {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).addAllNoValue(iterable);
                return this;
            }

            public final Builder addNoValue(ListAttributeKind listAttributeKind) {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).addNoValue(listAttributeKind);
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearNoValue() {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).clearNoValue();
                return this;
            }

            public final Builder clearValues() {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).clearValues();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
            public final ListAttributeKind getNoValue(int i) {
                return ((ListAttributesPartialState) ((g) this).instance).getNoValue(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
            public final int getNoValueCount() {
                return ((ListAttributesPartialState) ((g) this).instance).getNoValueCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
            public final List<ListAttributeKind> getNoValueList() {
                return ((ListAttributesPartialState) ((g) this).instance).getNoValueList();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
            public final ListAttributes getValues() {
                return ((ListAttributesPartialState) ((g) this).instance).getValues();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListAttributesPartialStateOrBuilder
            public final boolean hasValues() {
                return ((ListAttributesPartialState) ((g) this).instance).hasValues();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m669mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeValues(ListAttributes listAttributes) {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).mergeValues(listAttributes);
                return this;
            }

            public final Builder setNoValue(int i, ListAttributeKind listAttributeKind) {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).setNoValue(i, listAttributeKind);
                return this;
            }

            public final Builder setValues(ListAttributes.Builder builder) {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).setValues((ListAttributes) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m668clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m670mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m667clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m671mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setValues(ListAttributes listAttributes) {
                copyOnWrite();
                ((ListAttributesPartialState) ((g) this).instance).setValues(listAttributes);
                return this;
            }
        }

        public static Builder newBuilder(ListAttributesPartialState listAttributesPartialState) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(listAttributesPartialState);
        }

        public static ListAttributesPartialState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListAttributesPartialState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListAttributesPartialState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ListAttributesPartialState parseFrom(phc phcVar) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ListAttributesPartialState parseFrom(phc phcVar, uz00 uz00Var) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ListAttributesPartialState parseFrom(byte[] bArr) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListAttributesPartialState parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ListAttributesPartialState parseFrom(InputStream inputStream) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListAttributesPartialState parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListAttributesPartialState parseFrom(lwg lwgVar) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ListAttributesPartialState parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ListAttributesPartialState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ListChanges extends h implements ListChangesOrBuilder {
        public static final int BASE_REVISION_FIELD_NUMBER = 1;
        private static final ListChanges DEFAULT_INSTANCE;
        public static final int DELTAS_FIELD_NUMBER = 2;
        public static final int NONCES_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER = null;
        public static final int WANT_RESULTING_REVISIONS_FIELD_NUMBER = 3;
        public static final int WANT_SYNC_RESULT_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean wantResultingRevisions_;
        private boolean wantSyncResult_;
        private byte memoizedIsInitialized = 2;
        private phc baseRevision_ = phc.b;
        private h290 deltas_ = h.emptyProtobufList();
        private e290 nonces_ = h.emptyLongList();

        static {
            ListChanges listChanges = new ListChanges();
            DEFAULT_INSTANCE = listChanges;
            h.registerDefaultInstance(ListChanges.class, listChanges);
        }

        private ListChanges() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDeltas(Iterable<? extends Delta> iterable) {
            ensureDeltasIsMutable();
            s8.addAll(iterable, this.deltas_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNonces(Iterable<? extends Long> iterable) {
            ensureNoncesIsMutable();
            s8.addAll(iterable, this.nonces_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeltas(Delta delta) {
            delta.getClass();
            ensureDeltasIsMutable();
            this.deltas_.add(delta);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNonces(long j) {
            ensureNoncesIsMutable();
            this.nonces_.c(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBaseRevision() {
            this.bitField0_ &= -2;
            this.baseRevision_ = DEFAULT_INSTANCE.baseRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeltas() {
            this.deltas_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNonces() {
            this.nonces_ = h.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWantResultingRevisions() {
            this.bitField0_ &= -3;
            this.wantResultingRevisions_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWantSyncResult() {
            this.bitField0_ &= -5;
            this.wantSyncResult_ = false;
        }

        private void ensureDeltasIsMutable() {
            i9 i9Var = this.deltas_;
            if (i9Var.a) {
                return;
            }
            this.deltas_ = h.mutableCopy(i9Var);
        }

        private void ensureNoncesIsMutable() {
            i9 i9Var = this.nonces_;
            if (i9Var.a) {
                return;
            }
            this.nonces_ = h.mutableCopy(i9Var);
        }

        public static ListChanges getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListChanges parseDelimitedFrom(InputStream inputStream) {
            return (ListChanges) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListChanges parseFrom(ByteBuffer byteBuffer) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDeltas(int i) {
            ensureDeltasIsMutable();
            this.deltas_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.baseRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeltas(int i, Delta delta) {
            delta.getClass();
            ensureDeltasIsMutable();
            this.deltas_.set(i, delta);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNonces(int i, long j) {
            ensureNoncesIsMutable();
            t4f0 t4f0Var = this.nonces_;
            t4f0Var.b();
            t4f0Var.d(i);
            long[] jArr = t4f0Var.b;
            long j2 = jArr[i];
            jArr[i] = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWantResultingRevisions(boolean z) {
            this.bitField0_ |= 2;
            this.wantResultingRevisions_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWantSyncResult(boolean z) {
            this.bitField0_ |= 4;
            this.wantSyncResult_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0001\u0001ည\u0000\u0002Л\u0003ဇ\u0001\u0004ဇ\u0002\u0006\u0014", new Object[]{"bitField0_", "baseRevision_", "deltas_", Delta.class, "wantResultingRevisions_", "wantSyncResult_", "nonces_"});
                case 3:
                    return new ListChanges();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (ListChanges.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final phc getBaseRevision() {
            return this.baseRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final Delta getDeltas(int i) {
            return (Delta) this.deltas_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final int getDeltasCount() {
            return this.deltas_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final List<Delta> getDeltasList() {
            return this.deltas_;
        }

        public final DeltaOrBuilder getDeltasOrBuilder(int i) {
            return (DeltaOrBuilder) this.deltas_.get(i);
        }

        public final List<? extends DeltaOrBuilder> getDeltasOrBuilderList() {
            return this.deltas_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final long getNonces(int i) {
            return this.nonces_.e(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final int getNoncesCount() {
            return this.nonces_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final List<Long> getNoncesList() {
            return this.nonces_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final boolean getWantResultingRevisions() {
            return this.wantResultingRevisions_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final boolean getWantSyncResult() {
            return this.wantSyncResult_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final boolean hasBaseRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final boolean hasWantResultingRevisions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
        public final boolean hasWantSyncResult() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ListChangesOrBuilder {
            private Builder() {
                super(ListChanges.DEFAULT_INSTANCE);
            }

            public final Builder addAllDeltas(Iterable<? extends Delta> iterable) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addAllDeltas(iterable);
                return this;
            }

            public final Builder addAllNonces(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addAllNonces(iterable);
                return this;
            }

            public final Builder addDeltas(Delta.Builder builder) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addDeltas((Delta) builder.build());
                return this;
            }

            public final Builder addNonces(long j) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addNonces(j);
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearBaseRevision() {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).clearBaseRevision();
                return this;
            }

            public final Builder clearDeltas() {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).clearDeltas();
                return this;
            }

            public final Builder clearNonces() {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).clearNonces();
                return this;
            }

            public final Builder clearWantResultingRevisions() {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).clearWantResultingRevisions();
                return this;
            }

            public final Builder clearWantSyncResult() {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).clearWantSyncResult();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final phc getBaseRevision() {
                return ((ListChanges) ((g) this).instance).getBaseRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final Delta getDeltas(int i) {
                return ((ListChanges) ((g) this).instance).getDeltas(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final int getDeltasCount() {
                return ((ListChanges) ((g) this).instance).getDeltasCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final List<Delta> getDeltasList() {
                return Collections.unmodifiableList(((ListChanges) ((g) this).instance).getDeltasList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final long getNonces(int i) {
                return ((ListChanges) ((g) this).instance).getNonces(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final int getNoncesCount() {
                return ((ListChanges) ((g) this).instance).getNoncesCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final List<Long> getNoncesList() {
                return Collections.unmodifiableList(((ListChanges) ((g) this).instance).getNoncesList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final boolean getWantResultingRevisions() {
                return ((ListChanges) ((g) this).instance).getWantResultingRevisions();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final boolean getWantSyncResult() {
                return ((ListChanges) ((g) this).instance).getWantSyncResult();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final boolean hasBaseRevision() {
                return ((ListChanges) ((g) this).instance).hasBaseRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final boolean hasWantResultingRevisions() {
                return ((ListChanges) ((g) this).instance).hasWantResultingRevisions();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListChangesOrBuilder
            public final boolean hasWantSyncResult() {
                return ((ListChanges) ((g) this).instance).hasWantSyncResult();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m674mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeDeltas(int i) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).removeDeltas(i);
                return this;
            }

            public final Builder setBaseRevision(phc phcVar) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).setBaseRevision(phcVar);
                return this;
            }

            public final Builder setDeltas(int i, Delta.Builder builder) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).setDeltas(i, (Delta) builder.build());
                return this;
            }

            public final Builder setNonces(int i, long j) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).setNonces(i, j);
                return this;
            }

            public final Builder setWantResultingRevisions(boolean z) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).setWantResultingRevisions(z);
                return this;
            }

            public final Builder setWantSyncResult(boolean z) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).setWantSyncResult(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m673clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m675mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m672clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m676mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addDeltas(int i, Delta delta) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addDeltas(i, delta);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setDeltas(int i, Delta delta) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).setDeltas(i, delta);
                return this;
            }

            public final Builder addDeltas(Delta delta) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addDeltas(delta);
                return this;
            }

            public final Builder addDeltas(int i, Delta.Builder builder) {
                copyOnWrite();
                ((ListChanges) ((g) this).instance).addDeltas(i, (Delta) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ListChanges listChanges) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(listChanges);
        }

        public static ListChanges parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListChanges) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListChanges parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ListChanges parseFrom(phc phcVar) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ListChanges parseFrom(phc phcVar, uz00 uz00Var) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeltas(int i, Delta delta) {
            delta.getClass();
            ensureDeltasIsMutable();
            this.deltas_.add(i, delta);
        }

        public static ListChanges parseFrom(byte[] bArr) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListChanges parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ListChanges parseFrom(InputStream inputStream) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListChanges parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListChanges parseFrom(lwg lwgVar) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ListChanges parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ListChanges) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ListItems extends h implements ListItemsOrBuilder {
        public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 5;
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 6;
        private static final ListItems DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 3;
        public static final int LENS_REMOVED_ITEMS_FIELD_NUMBER = 7;
        public static final int META_ITEMS_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int TRUNCATED_FIELD_NUMBER = 2;
        private int bitField0_;
        private int pos_;
        private boolean truncated_;
        private byte memoizedIsInitialized = 2;
        private h290 items_ = h.emptyProtobufList();
        private h290 metaItems_ = h.emptyProtobufList();
        private h290 availableSignals_ = h.emptyProtobufList();
        private String continuationToken_ = "";
        private h290 lensRemovedItems_ = h.emptyProtobufList();

        static {
            ListItems listItems = new ListItems();
            DEFAULT_INSTANCE = listItems;
            h.registerDefaultInstance(ListItems.class, listItems);
        }

        private ListItems() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAvailableSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
            ensureAvailableSignalsIsMutable();
            s8.addAll(iterable, this.availableSignals_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends Item> iterable) {
            ensureItemsIsMutable();
            s8.addAll(iterable, this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLensRemovedItems(Iterable<? extends Item> iterable) {
            ensureLensRemovedItemsIsMutable();
            s8.addAll(iterable, this.lensRemovedItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetaItems(Iterable<? extends MetaItem> iterable) {
            ensureMetaItemsIsMutable();
            s8.addAll(iterable, this.metaItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvailableSignals(SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.add(signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLensRemovedItems(Item item) {
            item.getClass();
            ensureLensRemovedItemsIsMutable();
            this.lensRemovedItems_.add(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetaItems(MetaItem metaItem) {
            metaItem.getClass();
            ensureMetaItemsIsMutable();
            this.metaItems_.add(metaItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvailableSignals() {
            this.availableSignals_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContinuationToken() {
            this.bitField0_ &= -5;
            this.continuationToken_ = DEFAULT_INSTANCE.continuationToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLensRemovedItems() {
            this.lensRemovedItems_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetaItems() {
            this.metaItems_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTruncated() {
            this.bitField0_ &= -3;
            this.truncated_ = false;
        }

        private void ensureAvailableSignalsIsMutable() {
            i9 i9Var = this.availableSignals_;
            if (i9Var.a) {
                return;
            }
            this.availableSignals_ = h.mutableCopy(i9Var);
        }

        private void ensureItemsIsMutable() {
            i9 i9Var = this.items_;
            if (i9Var.a) {
                return;
            }
            this.items_ = h.mutableCopy(i9Var);
        }

        private void ensureLensRemovedItemsIsMutable() {
            i9 i9Var = this.lensRemovedItems_;
            if (i9Var.a) {
                return;
            }
            this.lensRemovedItems_ = h.mutableCopy(i9Var);
        }

        private void ensureMetaItemsIsMutable() {
            i9 i9Var = this.metaItems_;
            if (i9Var.a) {
                return;
            }
            this.metaItems_ = h.mutableCopy(i9Var);
        }

        public static ListItems getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListItems parseDelimitedFrom(InputStream inputStream) {
            return (ListItems) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListItems parseFrom(ByteBuffer byteBuffer) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAvailableSignals(int i) {
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLensRemovedItems(int i) {
            ensureLensRemovedItemsIsMutable();
            this.lensRemovedItems_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMetaItems(int i) {
            ensureMetaItemsIsMutable();
            this.metaItems_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.set(i, signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContinuationToken(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.continuationToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContinuationTokenBytes(phc phcVar) {
            this.continuationToken_ = phcVar.v();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLensRemovedItems(int i, Item item) {
            item.getClass();
            ensureLensRemovedItemsIsMutable();
            this.lensRemovedItems_.set(i, item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetaItems(int i, MetaItem metaItem) {
            metaItem.getClass();
            ensureMetaItemsIsMutable();
            this.metaItems_.set(i, metaItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPos(int i) {
            this.bitField0_ |= 1;
            this.pos_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTruncated(boolean z) {
            this.bitField0_ |= 2;
            this.truncated_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0004\u0001ᔄ\u0000\u0002ᔇ\u0001\u0003Л\u0004\u001b\u0005\u001b\u0006ဈ\u0002\u0007Л", new Object[]{"bitField0_", "pos_", "truncated_", "items_", Item.class, "metaItems_", MetaItem.class, "availableSignals_", SignalModelProto$Signal.class, "continuationToken_", "lensRemovedItems_", Item.class});
                case 3:
                    return new ListItems();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (ListItems.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final SignalModelProto$Signal getAvailableSignals(int i) {
            return (SignalModelProto$Signal) this.availableSignals_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final int getAvailableSignalsCount() {
            return this.availableSignals_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final List<SignalModelProto$Signal> getAvailableSignalsList() {
            return this.availableSignals_;
        }

        public final wl81 getAvailableSignalsOrBuilder(int i) {
            return (wl81) this.availableSignals_.get(i);
        }

        public final List<? extends wl81> getAvailableSignalsOrBuilderList() {
            return this.availableSignals_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        @Deprecated
        public final String getContinuationToken() {
            return this.continuationToken_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        @Deprecated
        public final phc getContinuationTokenBytes() {
            return phc.i(this.continuationToken_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final Item getItems(int i) {
            return (Item) this.items_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final List<Item> getItemsList() {
            return this.items_;
        }

        public final ItemOrBuilder getItemsOrBuilder(int i) {
            return (ItemOrBuilder) this.items_.get(i);
        }

        public final List<? extends ItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final Item getLensRemovedItems(int i) {
            return (Item) this.lensRemovedItems_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final int getLensRemovedItemsCount() {
            return this.lensRemovedItems_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final List<Item> getLensRemovedItemsList() {
            return this.lensRemovedItems_;
        }

        public final ItemOrBuilder getLensRemovedItemsOrBuilder(int i) {
            return (ItemOrBuilder) this.lensRemovedItems_.get(i);
        }

        public final List<? extends ItemOrBuilder> getLensRemovedItemsOrBuilderList() {
            return this.lensRemovedItems_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final MetaItem getMetaItems(int i) {
            return (MetaItem) this.metaItems_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final int getMetaItemsCount() {
            return this.metaItems_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final List<MetaItem> getMetaItemsList() {
            return this.metaItems_;
        }

        public final MetaItemOrBuilder getMetaItemsOrBuilder(int i) {
            return (MetaItemOrBuilder) this.metaItems_.get(i);
        }

        public final List<? extends MetaItemOrBuilder> getMetaItemsOrBuilderList() {
            return this.metaItems_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final int getPos() {
            return this.pos_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final boolean getTruncated() {
            return this.truncated_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        @Deprecated
        public final boolean hasContinuationToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
        public final boolean hasTruncated() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ListItemsOrBuilder {
            private Builder() {
                super(ListItems.DEFAULT_INSTANCE);
            }

            public final Builder addAllAvailableSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAllAvailableSignals(iterable);
                return this;
            }

            public final Builder addAllItems(Iterable<? extends Item> iterable) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAllItems(iterable);
                return this;
            }

            public final Builder addAllLensRemovedItems(Iterable<? extends Item> iterable) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAllLensRemovedItems(iterable);
                return this;
            }

            public final Builder addAllMetaItems(Iterable<? extends MetaItem> iterable) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAllMetaItems(iterable);
                return this;
            }

            public final Builder addAvailableSignals(vl81 vl81Var) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAvailableSignals((SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final Builder addItems(Item.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addItems((Item) builder.build());
                return this;
            }

            public final Builder addLensRemovedItems(Item.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addLensRemovedItems((Item) builder.build());
                return this;
            }

            public final Builder addMetaItems(MetaItem.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addMetaItems((MetaItem) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAvailableSignals() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearAvailableSignals();
                return this;
            }

            @Deprecated
            public final Builder clearContinuationToken() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearContinuationToken();
                return this;
            }

            public final Builder clearItems() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearItems();
                return this;
            }

            public final Builder clearLensRemovedItems() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearLensRemovedItems();
                return this;
            }

            public final Builder clearMetaItems() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearMetaItems();
                return this;
            }

            public final Builder clearPos() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearPos();
                return this;
            }

            public final Builder clearTruncated() {
                copyOnWrite();
                ((ListItems) ((g) this).instance).clearTruncated();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final SignalModelProto$Signal getAvailableSignals(int i) {
                return ((ListItems) ((g) this).instance).getAvailableSignals(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final int getAvailableSignalsCount() {
                return ((ListItems) ((g) this).instance).getAvailableSignalsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final List<SignalModelProto$Signal> getAvailableSignalsList() {
                return Collections.unmodifiableList(((ListItems) ((g) this).instance).getAvailableSignalsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            @Deprecated
            public final String getContinuationToken() {
                return ((ListItems) ((g) this).instance).getContinuationToken();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            @Deprecated
            public final phc getContinuationTokenBytes() {
                return ((ListItems) ((g) this).instance).getContinuationTokenBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final Item getItems(int i) {
                return ((ListItems) ((g) this).instance).getItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final int getItemsCount() {
                return ((ListItems) ((g) this).instance).getItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final List<Item> getItemsList() {
                return Collections.unmodifiableList(((ListItems) ((g) this).instance).getItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final Item getLensRemovedItems(int i) {
                return ((ListItems) ((g) this).instance).getLensRemovedItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final int getLensRemovedItemsCount() {
                return ((ListItems) ((g) this).instance).getLensRemovedItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final List<Item> getLensRemovedItemsList() {
                return Collections.unmodifiableList(((ListItems) ((g) this).instance).getLensRemovedItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final MetaItem getMetaItems(int i) {
                return ((ListItems) ((g) this).instance).getMetaItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final int getMetaItemsCount() {
                return ((ListItems) ((g) this).instance).getMetaItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final List<MetaItem> getMetaItemsList() {
                return Collections.unmodifiableList(((ListItems) ((g) this).instance).getMetaItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final int getPos() {
                return ((ListItems) ((g) this).instance).getPos();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final boolean getTruncated() {
                return ((ListItems) ((g) this).instance).getTruncated();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            @Deprecated
            public final boolean hasContinuationToken() {
                return ((ListItems) ((g) this).instance).hasContinuationToken();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final boolean hasPos() {
                return ((ListItems) ((g) this).instance).hasPos();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListItemsOrBuilder
            public final boolean hasTruncated() {
                return ((ListItems) ((g) this).instance).hasTruncated();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m679mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeAvailableSignals(int i) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).removeAvailableSignals(i);
                return this;
            }

            public final Builder removeItems(int i) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).removeItems(i);
                return this;
            }

            public final Builder removeLensRemovedItems(int i) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).removeLensRemovedItems(i);
                return this;
            }

            public final Builder removeMetaItems(int i) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).removeMetaItems(i);
                return this;
            }

            public final Builder setAvailableSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setAvailableSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            @Deprecated
            public final Builder setContinuationToken(String str) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setContinuationToken(str);
                return this;
            }

            @Deprecated
            public final Builder setContinuationTokenBytes(phc phcVar) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setContinuationTokenBytes(phcVar);
                return this;
            }

            public final Builder setItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setItems(i, (Item) builder.build());
                return this;
            }

            public final Builder setLensRemovedItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setLensRemovedItems(i, (Item) builder.build());
                return this;
            }

            public final Builder setMetaItems(int i, MetaItem.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setMetaItems(i, (MetaItem) builder.build());
                return this;
            }

            public final Builder setPos(int i) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setPos(i);
                return this;
            }

            public final Builder setTruncated(boolean z) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setTruncated(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m678clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m680mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m677clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m681mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAvailableSignals(i, signalModelProto$Signal);
                return this;
            }

            public final Builder addItems(int i, Item item) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addItems(i, item);
                return this;
            }

            public final Builder addLensRemovedItems(int i, Item item) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addLensRemovedItems(i, item);
                return this;
            }

            public final Builder addMetaItems(int i, MetaItem metaItem) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addMetaItems(i, metaItem);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setAvailableSignals(i, signalModelProto$Signal);
                return this;
            }

            public final Builder setItems(int i, Item item) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setItems(i, item);
                return this;
            }

            public final Builder setLensRemovedItems(int i, Item item) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setLensRemovedItems(i, item);
                return this;
            }

            public final Builder setMetaItems(int i, MetaItem metaItem) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).setMetaItems(i, metaItem);
                return this;
            }

            public final Builder addAvailableSignals(SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAvailableSignals(signalModelProto$Signal);
                return this;
            }

            public final Builder addItems(Item item) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addItems(item);
                return this;
            }

            public final Builder addLensRemovedItems(Item item) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addLensRemovedItems(item);
                return this;
            }

            public final Builder addMetaItems(MetaItem metaItem) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addMetaItems(metaItem);
                return this;
            }

            public final Builder addAvailableSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addAvailableSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final Builder addItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addItems(i, (Item) builder.build());
                return this;
            }

            public final Builder addLensRemovedItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addLensRemovedItems(i, (Item) builder.build());
                return this;
            }

            public final Builder addMetaItems(int i, MetaItem.Builder builder) {
                copyOnWrite();
                ((ListItems) ((g) this).instance).addMetaItems(i, (MetaItem) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ListItems listItems) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(listItems);
        }

        public static ListItems parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListItems) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListItems parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ListItems parseFrom(phc phcVar) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ListItems parseFrom(phc phcVar, uz00 uz00Var) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvailableSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureAvailableSignalsIsMutable();
            this.availableSignals_.add(i, signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLensRemovedItems(int i, Item item) {
            item.getClass();
            ensureLensRemovedItemsIsMutable();
            this.lensRemovedItems_.add(i, item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetaItems(int i, MetaItem metaItem) {
            metaItem.getClass();
            ensureMetaItemsIsMutable();
            this.metaItems_.add(i, metaItem);
        }

        public static ListItems parseFrom(byte[] bArr) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListItems parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ListItems parseFrom(InputStream inputStream) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListItems parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListItems parseFrom(lwg lwgVar) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ListItems parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ListItems) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ListSignals extends h implements ListSignalsOrBuilder {
        public static final int BASE_REVISION_FIELD_NUMBER = 1;
        private static final ListSignals DEFAULT_INSTANCE;
        public static final int EMITTED_SIGNALS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int WANT_CONTENT_ON_ERROR_FIELD_NUMBER = 3;
        private int bitField0_;
        private boolean wantContentOnError_;
        private phc baseRevision_ = phc.b;
        private h290 emittedSignals_ = h.emptyProtobufList();

        static {
            ListSignals listSignals = new ListSignals();
            DEFAULT_INSTANCE = listSignals;
            h.registerDefaultInstance(ListSignals.class, listSignals);
        }

        private ListSignals() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEmittedSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
            ensureEmittedSignalsIsMutable();
            s8.addAll(iterable, this.emittedSignals_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEmittedSignals(SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureEmittedSignalsIsMutable();
            this.emittedSignals_.add(signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBaseRevision() {
            this.bitField0_ &= -2;
            this.baseRevision_ = DEFAULT_INSTANCE.baseRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEmittedSignals() {
            this.emittedSignals_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWantContentOnError() {
            this.bitField0_ &= -3;
            this.wantContentOnError_ = false;
        }

        private void ensureEmittedSignalsIsMutable() {
            i9 i9Var = this.emittedSignals_;
            if (i9Var.a) {
                return;
            }
            this.emittedSignals_ = h.mutableCopy(i9Var);
        }

        public static ListSignals getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListSignals parseDelimitedFrom(InputStream inputStream) {
            return (ListSignals) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListSignals parseFrom(ByteBuffer byteBuffer) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEmittedSignals(int i) {
            ensureEmittedSignalsIsMutable();
            this.emittedSignals_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.baseRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmittedSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureEmittedSignalsIsMutable();
            this.emittedSignals_.set(i, signalModelProto$Signal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWantContentOnError(boolean z) {
            this.bitField0_ |= 2;
            this.wantContentOnError_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"bitField0_", "baseRevision_", "emittedSignals_", SignalModelProto$Signal.class, "wantContentOnError_"});
            }
            if (iOrdinal == 3) {
                return new ListSignals();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ListSignals.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final phc getBaseRevision() {
            return this.baseRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final SignalModelProto$Signal getEmittedSignals(int i) {
            return (SignalModelProto$Signal) this.emittedSignals_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final int getEmittedSignalsCount() {
            return this.emittedSignals_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final List<SignalModelProto$Signal> getEmittedSignalsList() {
            return this.emittedSignals_;
        }

        public final wl81 getEmittedSignalsOrBuilder(int i) {
            return (wl81) this.emittedSignals_.get(i);
        }

        public final List<? extends wl81> getEmittedSignalsOrBuilderList() {
            return this.emittedSignals_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final boolean getWantContentOnError() {
            return this.wantContentOnError_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final boolean hasBaseRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
        public final boolean hasWantContentOnError() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ListSignalsOrBuilder {
            private Builder() {
                super(ListSignals.DEFAULT_INSTANCE);
            }

            public final Builder addAllEmittedSignals(Iterable<? extends SignalModelProto$Signal> iterable) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).addAllEmittedSignals(iterable);
                return this;
            }

            public final Builder addEmittedSignals(vl81 vl81Var) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).addEmittedSignals((SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearBaseRevision() {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).clearBaseRevision();
                return this;
            }

            public final Builder clearEmittedSignals() {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).clearEmittedSignals();
                return this;
            }

            public final Builder clearWantContentOnError() {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).clearWantContentOnError();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final phc getBaseRevision() {
                return ((ListSignals) ((g) this).instance).getBaseRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final SignalModelProto$Signal getEmittedSignals(int i) {
                return ((ListSignals) ((g) this).instance).getEmittedSignals(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final int getEmittedSignalsCount() {
                return ((ListSignals) ((g) this).instance).getEmittedSignalsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final List<SignalModelProto$Signal> getEmittedSignalsList() {
                return Collections.unmodifiableList(((ListSignals) ((g) this).instance).getEmittedSignalsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final boolean getWantContentOnError() {
                return ((ListSignals) ((g) this).instance).getWantContentOnError();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final boolean hasBaseRevision() {
                return ((ListSignals) ((g) this).instance).hasBaseRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListSignalsOrBuilder
            public final boolean hasWantContentOnError() {
                return ((ListSignals) ((g) this).instance).hasWantContentOnError();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m684mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeEmittedSignals(int i) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).removeEmittedSignals(i);
                return this;
            }

            public final Builder setBaseRevision(phc phcVar) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).setBaseRevision(phcVar);
                return this;
            }

            public final Builder setEmittedSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).setEmittedSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }

            public final Builder setWantContentOnError(boolean z) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).setWantContentOnError(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m683clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m685mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m682clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m686mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addEmittedSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).addEmittedSignals(i, signalModelProto$Signal);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setEmittedSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).setEmittedSignals(i, signalModelProto$Signal);
                return this;
            }

            public final Builder addEmittedSignals(SignalModelProto$Signal signalModelProto$Signal) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).addEmittedSignals(signalModelProto$Signal);
                return this;
            }

            public final Builder addEmittedSignals(int i, vl81 vl81Var) {
                copyOnWrite();
                ((ListSignals) ((g) this).instance).addEmittedSignals(i, (SignalModelProto$Signal) vl81Var.build());
                return this;
            }
        }

        public static Builder newBuilder(ListSignals listSignals) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(listSignals);
        }

        public static ListSignals parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListSignals) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListSignals parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ListSignals parseFrom(phc phcVar) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ListSignals parseFrom(phc phcVar, uz00 uz00Var) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEmittedSignals(int i, SignalModelProto$Signal signalModelProto$Signal) {
            signalModelProto$Signal.getClass();
            ensureEmittedSignalsIsMutable();
            this.emittedSignals_.add(i, signalModelProto$Signal);
        }

        public static ListSignals parseFrom(byte[] bArr) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListSignals parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ListSignals parseFrom(InputStream inputStream) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListSignals parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListSignals parseFrom(lwg lwgVar) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ListSignals parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ListSignals) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ListUpdateRequest extends h implements ListUpdateRequestOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 2;
        public static final int BASE_REVISION_FIELD_NUMBER = 1;
        private static final ListUpdateRequest DEFAULT_INSTANCE;
        public static final int INFO_FIELD_NUMBER = 4;
        public static final int ITEMS_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private ListAttributes attributes_;
        private int bitField0_;
        private ChangeInfo info_;
        private byte memoizedIsInitialized = 2;
        private phc baseRevision_ = phc.b;
        private h290 items_ = h.emptyProtobufList();

        static {
            ListUpdateRequest listUpdateRequest = new ListUpdateRequest();
            DEFAULT_INSTANCE = listUpdateRequest;
            h.registerDefaultInstance(ListUpdateRequest.class, listUpdateRequest);
        }

        private ListUpdateRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends Item> iterable) {
            ensureItemsIsMutable();
            s8.addAll(iterable, this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBaseRevision() {
            this.bitField0_ &= -2;
            this.baseRevision_ = DEFAULT_INSTANCE.baseRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInfo() {
            this.info_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = h.emptyProtobufList();
        }

        private void ensureItemsIsMutable() {
            i9 i9Var = this.items_;
            if (i9Var.a) {
                return;
            }
            this.items_ = h.mutableCopy(i9Var);
        }

        public static ListUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAttributes(ListAttributes listAttributes) {
            listAttributes.getClass();
            ListAttributes listAttributes2 = this.attributes_;
            if (listAttributes2 == null || listAttributes2 == ListAttributes.getDefaultInstance()) {
                this.attributes_ = listAttributes;
            } else {
                this.attributes_ = (ListAttributes) ((ListAttributes.Builder) ListAttributes.newBuilder(this.attributes_).mergeFrom(listAttributes)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInfo(ChangeInfo changeInfo) {
            changeInfo.getClass();
            ChangeInfo changeInfo2 = this.info_;
            if (changeInfo2 == null || changeInfo2 == ChangeInfo.getDefaultInstance()) {
                this.info_ = changeInfo;
            } else {
                this.info_ = (ChangeInfo) ((ChangeInfo.Builder) ChangeInfo.newBuilder(this.info_).mergeFrom(changeInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListUpdateRequest parseDelimitedFrom(InputStream inputStream) {
            return (ListUpdateRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListUpdateRequest parseFrom(ByteBuffer byteBuffer) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(ListAttributes listAttributes) {
            listAttributes.getClass();
            this.attributes_ = listAttributes;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.baseRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInfo(ChangeInfo changeInfo) {
            changeInfo.getClass();
            this.info_ = changeInfo;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, item);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ည\u0000\u0002ဉ\u0001\u0003Л\u0004ဉ\u0002", new Object[]{"bitField0_", "baseRevision_", "attributes_", "items_", Item.class, "info_"});
                case 3:
                    return new ListUpdateRequest();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (ListUpdateRequest.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final ListAttributes getAttributes() {
            ListAttributes listAttributes = this.attributes_;
            return listAttributes == null ? ListAttributes.getDefaultInstance() : listAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final phc getBaseRevision() {
            return this.baseRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final ChangeInfo getInfo() {
            ChangeInfo changeInfo = this.info_;
            return changeInfo == null ? ChangeInfo.getDefaultInstance() : changeInfo;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final Item getItems(int i) {
            return (Item) this.items_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final List<Item> getItemsList() {
            return this.items_;
        }

        public final ItemOrBuilder getItemsOrBuilder(int i) {
            return (ItemOrBuilder) this.items_.get(i);
        }

        public final List<? extends ItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final boolean hasAttributes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final boolean hasBaseRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
        public final boolean hasInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ListUpdateRequestOrBuilder {
            private Builder() {
                super(ListUpdateRequest.DEFAULT_INSTANCE);
            }

            public final Builder addAllItems(Iterable<? extends Item> iterable) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).addAllItems(iterable);
                return this;
            }

            public final Builder addItems(Item.Builder builder) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).addItems((Item) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAttributes() {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).clearAttributes();
                return this;
            }

            public final Builder clearBaseRevision() {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).clearBaseRevision();
                return this;
            }

            public final Builder clearInfo() {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).clearInfo();
                return this;
            }

            public final Builder clearItems() {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).clearItems();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final ListAttributes getAttributes() {
                return ((ListUpdateRequest) ((g) this).instance).getAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final phc getBaseRevision() {
                return ((ListUpdateRequest) ((g) this).instance).getBaseRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final ChangeInfo getInfo() {
                return ((ListUpdateRequest) ((g) this).instance).getInfo();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final Item getItems(int i) {
                return ((ListUpdateRequest) ((g) this).instance).getItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final int getItemsCount() {
                return ((ListUpdateRequest) ((g) this).instance).getItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final List<Item> getItemsList() {
                return Collections.unmodifiableList(((ListUpdateRequest) ((g) this).instance).getItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final boolean hasAttributes() {
                return ((ListUpdateRequest) ((g) this).instance).hasAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final boolean hasBaseRevision() {
                return ((ListUpdateRequest) ((g) this).instance).hasBaseRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ListUpdateRequestOrBuilder
            public final boolean hasInfo() {
                return ((ListUpdateRequest) ((g) this).instance).hasInfo();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAttributes(ListAttributes listAttributes) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).mergeAttributes(listAttributes);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m689mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeInfo(ChangeInfo changeInfo) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).mergeInfo(changeInfo);
                return this;
            }

            public final Builder removeItems(int i) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).removeItems(i);
                return this;
            }

            public final Builder setAttributes(ListAttributes.Builder builder) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setAttributes((ListAttributes) builder.build());
                return this;
            }

            public final Builder setBaseRevision(phc phcVar) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setBaseRevision(phcVar);
                return this;
            }

            public final Builder setInfo(ChangeInfo.Builder builder) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setInfo((ChangeInfo) builder.build());
                return this;
            }

            public final Builder setItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setItems(i, (Item) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m688clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m690mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m687clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m691mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addItems(int i, Item item) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).addItems(i, item);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAttributes(ListAttributes listAttributes) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setAttributes(listAttributes);
                return this;
            }

            public final Builder setInfo(ChangeInfo changeInfo) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setInfo(changeInfo);
                return this;
            }

            public final Builder setItems(int i, Item item) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).setItems(i, item);
                return this;
            }

            public final Builder addItems(Item item) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).addItems(item);
                return this;
            }

            public final Builder addItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((ListUpdateRequest) ((g) this).instance).addItems(i, (Item) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ListUpdateRequest listUpdateRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(listUpdateRequest);
        }

        public static ListUpdateRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListUpdateRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListUpdateRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ListUpdateRequest parseFrom(phc phcVar) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ListUpdateRequest parseFrom(phc phcVar, uz00 uz00Var) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, item);
        }

        public static ListUpdateRequest parseFrom(byte[] bArr) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListUpdateRequest parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ListUpdateRequest parseFrom(InputStream inputStream) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListUpdateRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ListUpdateRequest parseFrom(lwg lwgVar) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ListUpdateRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ListUpdateRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class MetaItem extends h implements MetaItemOrBuilder {
        public static final int ABUSE_REPORTING_ENABLED_FIELD_NUMBER = 6;
        public static final int ATTRIBUTES_FIELD_NUMBER = 2;
        public static final int CAPABILITIES_FIELD_NUMBER = 7;
        private static final MetaItem DEFAULT_INSTANCE;
        public static final int GEOBLOCK_FIELD_NUMBER = 8;
        public static final int LENGTH_FIELD_NUMBER = 3;
        public static final int OWNER_USERNAME_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int REVISION_FIELD_NUMBER = 1;
        public static final int STATUS_CODE_FIELD_NUMBER = 9;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private static final c290 geoblock_converter_ = new AnonymousClass1();
        private boolean abuseReportingEnabled_;
        private ListAttributes attributes_;
        private int bitField0_;
        private Capabilities capabilities_;
        private int length_;
        private int statusCode_;
        private long timestamp_;
        private phc revision_ = phc.b;
        private String ownerUsername_ = "";
        private b290 geoblock_ = h.emptyIntList();

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$MetaItem$1, reason: invalid class name */
        public class AnonymousClass1 implements c290 {
            /* JADX INFO: renamed from: convert, reason: merged with bridge method [inline-methods] */
            public final GeoblockBlockingType m692convert(int i) {
                GeoblockBlockingType geoblockBlockingTypeForNumber = GeoblockBlockingType.forNumber(i);
                return geoblockBlockingTypeForNumber == null ? GeoblockBlockingType.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED : geoblockBlockingTypeForNumber;
            }
        }

        static {
            MetaItem metaItem = new MetaItem();
            DEFAULT_INSTANCE = metaItem;
            h.registerDefaultInstance(MetaItem.class, metaItem);
        }

        private MetaItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGeoblock(Iterable<? extends GeoblockBlockingType> iterable) {
            ensureGeoblockIsMutable();
            for (GeoblockBlockingType geoblockBlockingType : iterable) {
                this.geoblock_.c(geoblockBlockingType.getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeoblock(GeoblockBlockingType geoblockBlockingType) {
            geoblockBlockingType.getClass();
            ensureGeoblockIsMutable();
            this.geoblock_.c(geoblockBlockingType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbuseReportingEnabled() {
            this.bitField0_ &= -33;
            this.abuseReportingEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeoblock() {
            this.geoblock_ = h.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            this.bitField0_ &= -5;
            this.length_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUsername() {
            this.bitField0_ &= -17;
            this.ownerUsername_ = DEFAULT_INSTANCE.ownerUsername_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevision() {
            this.bitField0_ &= -2;
            this.revision_ = DEFAULT_INSTANCE.revision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusCode() {
            this.bitField0_ &= -129;
            this.statusCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.bitField0_ &= -9;
            this.timestamp_ = 0L;
        }

        private void ensureGeoblockIsMutable() {
            i9 i9Var = this.geoblock_;
            if (i9Var.a) {
                return;
            }
            this.geoblock_ = h.mutableCopy(i9Var);
        }

        public static MetaItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAttributes(ListAttributes listAttributes) {
            listAttributes.getClass();
            ListAttributes listAttributes2 = this.attributes_;
            if (listAttributes2 == null || listAttributes2 == ListAttributes.getDefaultInstance()) {
                this.attributes_ = listAttributes;
            } else {
                this.attributes_ = (ListAttributes) ((ListAttributes.Builder) ListAttributes.newBuilder(this.attributes_).mergeFrom(listAttributes)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCapabilities(Capabilities capabilities) {
            capabilities.getClass();
            Capabilities capabilities2 = this.capabilities_;
            if (capabilities2 == null || capabilities2 == Capabilities.z()) {
                this.capabilities_ = capabilities;
            } else {
                this.capabilities_ = ((ald) Capabilities.C(this.capabilities_).mergeFrom(capabilities)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MetaItem parseDelimitedFrom(InputStream inputStream) {
            return (MetaItem) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetaItem parseFrom(ByteBuffer byteBuffer) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbuseReportingEnabled(boolean z) {
            this.bitField0_ |= 32;
            this.abuseReportingEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(ListAttributes listAttributes) {
            listAttributes.getClass();
            this.attributes_ = listAttributes;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCapabilities(Capabilities capabilities) {
            capabilities.getClass();
            this.capabilities_ = capabilities;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeoblock(int i, GeoblockBlockingType geoblockBlockingType) {
            geoblockBlockingType.getClass();
            ensureGeoblockIsMutable();
            this.geoblock_.i(i, geoblockBlockingType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(int i) {
            this.bitField0_ |= 4;
            this.length_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUsername(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.ownerUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUsernameBytes(phc phcVar) {
            this.ownerUsername_ = phcVar.v();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.revision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusCode(int i) {
            this.bitField0_ |= 128;
            this.statusCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.bitField0_ |= 8;
            this.timestamp_ = j;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                GeoblockBlockingType geoblockBlockingType = GeoblockBlockingType.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED;
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဉ\u0006\bࠞ\tဏ\u0007", new Object[]{"bitField0_", "revision_", "attributes_", "length_", "timestamp_", "ownerUsername_", "abuseReportingEnabled_", "capabilities_", "geoblock_", GeoblockBlockingType.GeoblockBlockingTypeVerifier.INSTANCE, "statusCode_"});
            }
            if (iOrdinal == 3) {
                return new MetaItem();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (MetaItem.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean getAbuseReportingEnabled() {
            return this.abuseReportingEnabled_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final ListAttributes getAttributes() {
            ListAttributes listAttributes = this.attributes_;
            return listAttributes == null ? ListAttributes.getDefaultInstance() : listAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.z() : capabilities;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final GeoblockBlockingType getGeoblock(int i) {
            GeoblockBlockingType geoblockBlockingTypeForNumber = GeoblockBlockingType.forNumber(this.geoblock_.e(i));
            return geoblockBlockingTypeForNumber == null ? GeoblockBlockingType.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED : geoblockBlockingTypeForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final int getGeoblockCount() {
            return this.geoblock_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final List<GeoblockBlockingType> getGeoblockList() {
            return new d290(this.geoblock_, geoblock_converter_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final int getLength() {
            return this.length_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final String getOwnerUsername() {
            return this.ownerUsername_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final phc getOwnerUsernameBytes() {
            return phc.i(this.ownerUsername_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final phc getRevision() {
            return this.revision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final int getStatusCode() {
            return this.statusCode_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasAbuseReportingEnabled() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasAttributes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasCapabilities() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasLength() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasOwnerUsername() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasStatusCode() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
        public final boolean hasTimestamp() {
            return (this.bitField0_ & 8) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements MetaItemOrBuilder {
            private Builder() {
                super(MetaItem.DEFAULT_INSTANCE);
            }

            public final Builder addAllGeoblock(Iterable<? extends GeoblockBlockingType> iterable) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).addAllGeoblock(iterable);
                return this;
            }

            public final Builder addGeoblock(GeoblockBlockingType geoblockBlockingType) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).addGeoblock(geoblockBlockingType);
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAbuseReportingEnabled() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearAbuseReportingEnabled();
                return this;
            }

            public final Builder clearAttributes() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearAttributes();
                return this;
            }

            public final Builder clearCapabilities() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearCapabilities();
                return this;
            }

            public final Builder clearGeoblock() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearGeoblock();
                return this;
            }

            public final Builder clearLength() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearLength();
                return this;
            }

            public final Builder clearOwnerUsername() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearOwnerUsername();
                return this;
            }

            public final Builder clearRevision() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearRevision();
                return this;
            }

            public final Builder clearStatusCode() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearStatusCode();
                return this;
            }

            public final Builder clearTimestamp() {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).clearTimestamp();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean getAbuseReportingEnabled() {
                return ((MetaItem) ((g) this).instance).getAbuseReportingEnabled();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final ListAttributes getAttributes() {
                return ((MetaItem) ((g) this).instance).getAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final Capabilities getCapabilities() {
                return ((MetaItem) ((g) this).instance).getCapabilities();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final GeoblockBlockingType getGeoblock(int i) {
                return ((MetaItem) ((g) this).instance).getGeoblock(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final int getGeoblockCount() {
                return ((MetaItem) ((g) this).instance).getGeoblockCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final List<GeoblockBlockingType> getGeoblockList() {
                return ((MetaItem) ((g) this).instance).getGeoblockList();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final int getLength() {
                return ((MetaItem) ((g) this).instance).getLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final String getOwnerUsername() {
                return ((MetaItem) ((g) this).instance).getOwnerUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final phc getOwnerUsernameBytes() {
                return ((MetaItem) ((g) this).instance).getOwnerUsernameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final phc getRevision() {
                return ((MetaItem) ((g) this).instance).getRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final int getStatusCode() {
                return ((MetaItem) ((g) this).instance).getStatusCode();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final long getTimestamp() {
                return ((MetaItem) ((g) this).instance).getTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasAbuseReportingEnabled() {
                return ((MetaItem) ((g) this).instance).hasAbuseReportingEnabled();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasAttributes() {
                return ((MetaItem) ((g) this).instance).hasAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasCapabilities() {
                return ((MetaItem) ((g) this).instance).hasCapabilities();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasLength() {
                return ((MetaItem) ((g) this).instance).hasLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasOwnerUsername() {
                return ((MetaItem) ((g) this).instance).hasOwnerUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasRevision() {
                return ((MetaItem) ((g) this).instance).hasRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasStatusCode() {
                return ((MetaItem) ((g) this).instance).hasStatusCode();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MetaItemOrBuilder
            public final boolean hasTimestamp() {
                return ((MetaItem) ((g) this).instance).hasTimestamp();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAttributes(ListAttributes listAttributes) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).mergeAttributes(listAttributes);
                return this;
            }

            public final Builder mergeCapabilities(Capabilities capabilities) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).mergeCapabilities(capabilities);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m695mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setAbuseReportingEnabled(boolean z) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setAbuseReportingEnabled(z);
                return this;
            }

            public final Builder setAttributes(ListAttributes.Builder builder) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setAttributes((ListAttributes) builder.build());
                return this;
            }

            public final Builder setCapabilities(ald aldVar) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setCapabilities(aldVar.build());
                return this;
            }

            public final Builder setGeoblock(int i, GeoblockBlockingType geoblockBlockingType) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setGeoblock(i, geoblockBlockingType);
                return this;
            }

            public final Builder setLength(int i) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setLength(i);
                return this;
            }

            public final Builder setOwnerUsername(String str) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setOwnerUsername(str);
                return this;
            }

            public final Builder setOwnerUsernameBytes(phc phcVar) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setOwnerUsernameBytes(phcVar);
                return this;
            }

            public final Builder setRevision(phc phcVar) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setRevision(phcVar);
                return this;
            }

            public final Builder setStatusCode(int i) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setStatusCode(i);
                return this;
            }

            public final Builder setTimestamp(long j) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setTimestamp(j);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m694clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m696mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m693clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m697mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAttributes(ListAttributes listAttributes) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setAttributes(listAttributes);
                return this;
            }

            public final Builder setCapabilities(Capabilities capabilities) {
                copyOnWrite();
                ((MetaItem) ((g) this).instance).setCapabilities(capabilities);
                return this;
            }
        }

        public static Builder newBuilder(MetaItem metaItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(metaItem);
        }

        public static MetaItem parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (MetaItem) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static MetaItem parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static MetaItem parseFrom(phc phcVar) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static MetaItem parseFrom(phc phcVar, uz00 uz00Var) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static MetaItem parseFrom(byte[] bArr) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetaItem parseFrom(byte[] bArr, uz00 uz00Var) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static MetaItem parseFrom(InputStream inputStream) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetaItem parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static MetaItem parseFrom(lwg lwgVar) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static MetaItem parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (MetaItem) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Mov extends h implements MovOrBuilder {
        public static final int ADD_AFTER_ITEM_FIELD_NUMBER = 6;
        public static final int ADD_BEFORE_ITEM_FIELD_NUMBER = 5;
        public static final int ADD_FIRST_FIELD_NUMBER = 7;
        public static final int ADD_LAST_FIELD_NUMBER = 8;
        private static final Mov DEFAULT_INSTANCE;
        public static final int FROM_INDEX_FIELD_NUMBER = 1;
        public static final int ITEMS_FIELD_NUMBER = 4;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TO_INDEX_FIELD_NUMBER = 3;
        private Item addAfterItem_;
        private Item addBeforeItem_;
        private boolean addFirst_;
        private boolean addLast_;
        private int bitField0_;
        private int fromIndex_;
        private int length_;
        private int toIndex_;
        private byte memoizedIsInitialized = 2;
        private h290 items_ = h.emptyProtobufList();

        static {
            Mov mov = new Mov();
            DEFAULT_INSTANCE = mov;
            h.registerDefaultInstance(Mov.class, mov);
        }

        private Mov() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends Item> iterable) {
            ensureItemsIsMutable();
            s8.addAll(iterable, this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddAfterItem() {
            this.addAfterItem_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddBeforeItem() {
            this.addBeforeItem_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddFirst() {
            this.bitField0_ &= -33;
            this.addFirst_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddLast() {
            this.bitField0_ &= -65;
            this.addLast_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromIndex() {
            this.bitField0_ &= -2;
            this.fromIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            this.bitField0_ &= -3;
            this.length_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToIndex() {
            this.bitField0_ &= -5;
            this.toIndex_ = 0;
        }

        private void ensureItemsIsMutable() {
            i9 i9Var = this.items_;
            if (i9Var.a) {
                return;
            }
            this.items_ = h.mutableCopy(i9Var);
        }

        public static Mov getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddAfterItem(Item item) {
            item.getClass();
            Item item2 = this.addAfterItem_;
            if (item2 == null || item2 == Item.getDefaultInstance()) {
                this.addAfterItem_ = item;
            } else {
                this.addAfterItem_ = (Item) ((Item.Builder) Item.newBuilder(this.addAfterItem_).mergeFrom(item)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddBeforeItem(Item item) {
            item.getClass();
            Item item2 = this.addBeforeItem_;
            if (item2 == null || item2 == Item.getDefaultInstance()) {
                this.addBeforeItem_ = item;
            } else {
                this.addBeforeItem_ = (Item) ((Item.Builder) Item.newBuilder(this.addBeforeItem_).mergeFrom(item)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Mov parseDelimitedFrom(InputStream inputStream) {
            return (Mov) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mov parseFrom(ByteBuffer byteBuffer) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddAfterItem(Item item) {
            item.getClass();
            this.addAfterItem_ = item;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddBeforeItem(Item item) {
            item.getClass();
            this.addBeforeItem_ = item;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddFirst(boolean z) {
            this.bitField0_ |= 32;
            this.addFirst_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddLast(boolean z) {
            this.bitField0_ |= 64;
            this.addLast_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromIndex(int i) {
            this.bitField0_ |= 1;
            this.fromIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(int i) {
            this.bitField0_ |= 2;
            this.length_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToIndex(int i) {
            this.bitField0_ |= 4;
            this.toIndex_ = i;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0003\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"bitField0_", "fromIndex_", "length_", "toIndex_", "items_", Item.class, "addBeforeItem_", "addAfterItem_", "addFirst_", "addLast_"});
                case 3:
                    return new Mov();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Mov.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final Item getAddAfterItem() {
            Item item = this.addAfterItem_;
            return item == null ? Item.getDefaultInstance() : item;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final Item getAddBeforeItem() {
            Item item = this.addBeforeItem_;
            return item == null ? Item.getDefaultInstance() : item;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean getAddFirst() {
            return this.addFirst_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean getAddLast() {
            return this.addLast_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final int getFromIndex() {
            return this.fromIndex_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final Item getItems(int i) {
            return (Item) this.items_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final List<Item> getItemsList() {
            return this.items_;
        }

        public final ItemOrBuilder getItemsOrBuilder(int i) {
            return (ItemOrBuilder) this.items_.get(i);
        }

        public final List<? extends ItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final int getLength() {
            return this.length_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final int getToIndex() {
            return this.toIndex_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasAddAfterItem() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasAddBeforeItem() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasAddFirst() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasAddLast() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasFromIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasLength() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
        public final boolean hasToIndex() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements MovOrBuilder {
            private Builder() {
                super(Mov.DEFAULT_INSTANCE);
            }

            public final Builder addAllItems(Iterable<? extends Item> iterable) {
                copyOnWrite();
                ((Mov) ((g) this).instance).addAllItems(iterable);
                return this;
            }

            public final Builder addItems(Item.Builder builder) {
                copyOnWrite();
                ((Mov) ((g) this).instance).addItems((Item) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAddAfterItem() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearAddAfterItem();
                return this;
            }

            public final Builder clearAddBeforeItem() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearAddBeforeItem();
                return this;
            }

            public final Builder clearAddFirst() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearAddFirst();
                return this;
            }

            public final Builder clearAddLast() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearAddLast();
                return this;
            }

            public final Builder clearFromIndex() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearFromIndex();
                return this;
            }

            public final Builder clearItems() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearItems();
                return this;
            }

            public final Builder clearLength() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearLength();
                return this;
            }

            public final Builder clearToIndex() {
                copyOnWrite();
                ((Mov) ((g) this).instance).clearToIndex();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final Item getAddAfterItem() {
                return ((Mov) ((g) this).instance).getAddAfterItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final Item getAddBeforeItem() {
                return ((Mov) ((g) this).instance).getAddBeforeItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean getAddFirst() {
                return ((Mov) ((g) this).instance).getAddFirst();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean getAddLast() {
                return ((Mov) ((g) this).instance).getAddLast();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final int getFromIndex() {
                return ((Mov) ((g) this).instance).getFromIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final Item getItems(int i) {
                return ((Mov) ((g) this).instance).getItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final int getItemsCount() {
                return ((Mov) ((g) this).instance).getItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final List<Item> getItemsList() {
                return Collections.unmodifiableList(((Mov) ((g) this).instance).getItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final int getLength() {
                return ((Mov) ((g) this).instance).getLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final int getToIndex() {
                return ((Mov) ((g) this).instance).getToIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasAddAfterItem() {
                return ((Mov) ((g) this).instance).hasAddAfterItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasAddBeforeItem() {
                return ((Mov) ((g) this).instance).hasAddBeforeItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasAddFirst() {
                return ((Mov) ((g) this).instance).hasAddFirst();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasAddLast() {
                return ((Mov) ((g) this).instance).hasAddLast();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasFromIndex() {
                return ((Mov) ((g) this).instance).hasFromIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasLength() {
                return ((Mov) ((g) this).instance).hasLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.MovOrBuilder
            public final boolean hasToIndex() {
                return ((Mov) ((g) this).instance).hasToIndex();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAddAfterItem(Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).mergeAddAfterItem(item);
                return this;
            }

            public final Builder mergeAddBeforeItem(Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).mergeAddBeforeItem(item);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m700mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeItems(int i) {
                copyOnWrite();
                ((Mov) ((g) this).instance).removeItems(i);
                return this;
            }

            public final Builder setAddAfterItem(Item.Builder builder) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setAddAfterItem((Item) builder.build());
                return this;
            }

            public final Builder setAddBeforeItem(Item.Builder builder) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setAddBeforeItem((Item) builder.build());
                return this;
            }

            public final Builder setAddFirst(boolean z) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setAddFirst(z);
                return this;
            }

            public final Builder setAddLast(boolean z) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setAddLast(z);
                return this;
            }

            public final Builder setFromIndex(int i) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setFromIndex(i);
                return this;
            }

            public final Builder setItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setItems(i, (Item) builder.build());
                return this;
            }

            public final Builder setLength(int i) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setLength(i);
                return this;
            }

            public final Builder setToIndex(int i) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setToIndex(i);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m699clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m701mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m698clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m702mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addItems(int i, Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).addItems(i, item);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAddAfterItem(Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setAddAfterItem(item);
                return this;
            }

            public final Builder setAddBeforeItem(Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setAddBeforeItem(item);
                return this;
            }

            public final Builder setItems(int i, Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).setItems(i, item);
                return this;
            }

            public final Builder addItems(Item item) {
                copyOnWrite();
                ((Mov) ((g) this).instance).addItems(item);
                return this;
            }

            public final Builder addItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((Mov) ((g) this).instance).addItems(i, (Item) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Mov mov) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mov);
        }

        public static Mov parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Mov) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Mov parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Mov parseFrom(phc phcVar) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Mov parseFrom(phc phcVar, uz00 uz00Var) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, item);
        }

        public static Mov parseFrom(byte[] bArr) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Mov parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Mov parseFrom(InputStream inputStream) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mov parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Mov parseFrom(lwg lwgVar) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Mov parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Mov) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class OpList extends h implements OpListOrBuilder {
        private static final OpList DEFAULT_INSTANCE;
        public static final int OPS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private byte memoizedIsInitialized = 2;
        private h290 ops_ = h.emptyProtobufList();

        static {
            OpList opList = new OpList();
            DEFAULT_INSTANCE = opList;
            h.registerDefaultInstance(OpList.class, opList);
        }

        private OpList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOps(Iterable<? extends Op> iterable) {
            ensureOpsIsMutable();
            s8.addAll(iterable, this.ops_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOps() {
            this.ops_ = h.emptyProtobufList();
        }

        private void ensureOpsIsMutable() {
            i9 i9Var = this.ops_;
            if (i9Var.a) {
                return;
            }
            this.ops_ = h.mutableCopy(i9Var);
        }

        public static OpList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OpList parseDelimitedFrom(InputStream inputStream) {
            return (OpList) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpList parseFrom(ByteBuffer byteBuffer) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOps(int i) {
            ensureOpsIsMutable();
            this.ops_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOps(int i, Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.set(i, op);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"ops_", Op.class});
                case 3:
                    return new OpList();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (OpList.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
        public final Op getOps(int i) {
            return (Op) this.ops_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
        public final int getOpsCount() {
            return this.ops_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
        public final List<Op> getOpsList() {
            return this.ops_;
        }

        public final OpOrBuilder getOpsOrBuilder(int i) {
            return (OpOrBuilder) this.ops_.get(i);
        }

        public final List<? extends OpOrBuilder> getOpsOrBuilderList() {
            return this.ops_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements OpListOrBuilder {
            private Builder() {
                super(OpList.DEFAULT_INSTANCE);
            }

            public final Builder addAllOps(Iterable<? extends Op> iterable) {
                copyOnWrite();
                ((OpList) ((g) this).instance).addAllOps(iterable);
                return this;
            }

            public final Builder addOps(Op.Builder builder) {
                copyOnWrite();
                ((OpList) ((g) this).instance).addOps((Op) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearOps() {
                copyOnWrite();
                ((OpList) ((g) this).instance).clearOps();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
            public final Op getOps(int i) {
                return ((OpList) ((g) this).instance).getOps(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
            public final int getOpsCount() {
                return ((OpList) ((g) this).instance).getOpsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.OpListOrBuilder
            public final List<Op> getOpsList() {
                return Collections.unmodifiableList(((OpList) ((g) this).instance).getOpsList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m711mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeOps(int i) {
                copyOnWrite();
                ((OpList) ((g) this).instance).removeOps(i);
                return this;
            }

            public final Builder setOps(int i, Op.Builder builder) {
                copyOnWrite();
                ((OpList) ((g) this).instance).setOps(i, (Op) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m710clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m712mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m709clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m713mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addOps(int i, Op op) {
                copyOnWrite();
                ((OpList) ((g) this).instance).addOps(i, op);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setOps(int i, Op op) {
                copyOnWrite();
                ((OpList) ((g) this).instance).setOps(i, op);
                return this;
            }

            public final Builder addOps(Op op) {
                copyOnWrite();
                ((OpList) ((g) this).instance).addOps(op);
                return this;
            }

            public final Builder addOps(int i, Op.Builder builder) {
                copyOnWrite();
                ((OpList) ((g) this).instance).addOps(i, (Op) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(OpList opList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(opList);
        }

        public static OpList parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (OpList) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static OpList parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static OpList parseFrom(phc phcVar) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static OpList parseFrom(phc phcVar, uz00 uz00Var) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(int i, Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(i, op);
        }

        public static OpList parseFrom(byte[] bArr) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpList parseFrom(byte[] bArr, uz00 uz00Var) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static OpList parseFrom(InputStream inputStream) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpList parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static OpList parseFrom(lwg lwgVar) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static OpList parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (OpList) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PaginatedUnfollowedListItems extends h implements PaginatedUnfollowedListItemsOrBuilder {
        private static final PaginatedUnfollowedListItems DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 6;
        public static final int LIMIT_FIELD_NUMBER = 1;
        public static final int NEXTPAGEINDEX_FIELD_NUMBER = 3;
        public static final int OFFSET_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int PREVIOUSPAGEINDEX_FIELD_NUMBER = 4;
        public static final int TOTALPAGES_FIELD_NUMBER = 5;
        private int bitField0_;
        private h290 items_ = h.emptyProtobufList();
        private int limit_;
        private int nextPageIndex_;
        private int offset_;
        private int previousPageIndex_;
        private int totalPages_;

        static {
            PaginatedUnfollowedListItems paginatedUnfollowedListItems = new PaginatedUnfollowedListItems();
            DEFAULT_INSTANCE = paginatedUnfollowedListItems;
            h.registerDefaultInstance(PaginatedUnfollowedListItems.class, paginatedUnfollowedListItems);
        }

        private PaginatedUnfollowedListItems() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends UnfollowedListItem> iterable) {
            ensureItemsIsMutable();
            s8.addAll(iterable, this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(UnfollowedListItem unfollowedListItem) {
            unfollowedListItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(unfollowedListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimit() {
            this.bitField0_ &= -2;
            this.limit_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextPageIndex() {
            this.bitField0_ &= -5;
            this.nextPageIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOffset() {
            this.bitField0_ &= -3;
            this.offset_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreviousPageIndex() {
            this.bitField0_ &= -9;
            this.previousPageIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalPages() {
            this.bitField0_ &= -17;
            this.totalPages_ = 0;
        }

        private void ensureItemsIsMutable() {
            i9 i9Var = this.items_;
            if (i9Var.a) {
                return;
            }
            this.items_ = h.mutableCopy(i9Var);
        }

        public static PaginatedUnfollowedListItems getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PaginatedUnfollowedListItems parseDelimitedFrom(InputStream inputStream) {
            return (PaginatedUnfollowedListItems) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaginatedUnfollowedListItems parseFrom(ByteBuffer byteBuffer) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i, UnfollowedListItem unfollowedListItem) {
            unfollowedListItem.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, unfollowedListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimit(int i) {
            this.bitField0_ |= 1;
            this.limit_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextPageIndex(int i) {
            this.bitField0_ |= 4;
            this.nextPageIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffset(int i) {
            this.bitField0_ |= 2;
            this.offset_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviousPageIndex(int i) {
            this.bitField0_ |= 8;
            this.previousPageIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalPages(int i) {
            this.bitField0_ |= 16;
            this.totalPages_ = i;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b", new Object[]{"bitField0_", "limit_", "offset_", "nextPageIndex_", "previousPageIndex_", "totalPages_", "items_", UnfollowedListItem.class});
            }
            if (iOrdinal == 3) {
                return new PaginatedUnfollowedListItems();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (PaginatedUnfollowedListItems.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final UnfollowedListItem getItems(int i) {
            return (UnfollowedListItem) this.items_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final List<UnfollowedListItem> getItemsList() {
            return this.items_;
        }

        public final UnfollowedListItemOrBuilder getItemsOrBuilder(int i) {
            return (UnfollowedListItemOrBuilder) this.items_.get(i);
        }

        public final List<? extends UnfollowedListItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final int getLimit() {
            return this.limit_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final int getNextPageIndex() {
            return this.nextPageIndex_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final int getOffset() {
            return this.offset_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final int getPreviousPageIndex() {
            return this.previousPageIndex_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final int getTotalPages() {
            return this.totalPages_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final boolean hasLimit() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final boolean hasNextPageIndex() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final boolean hasOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final boolean hasPreviousPageIndex() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
        public final boolean hasTotalPages() {
            return (this.bitField0_ & 16) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PaginatedUnfollowedListItemsOrBuilder {
            private Builder() {
                super(PaginatedUnfollowedListItems.DEFAULT_INSTANCE);
            }

            public final Builder addAllItems(Iterable<? extends UnfollowedListItem> iterable) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).addAllItems(iterable);
                return this;
            }

            public final Builder addItems(UnfollowedListItem.Builder builder) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).addItems((UnfollowedListItem) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearItems() {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).clearItems();
                return this;
            }

            public final Builder clearLimit() {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).clearLimit();
                return this;
            }

            public final Builder clearNextPageIndex() {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).clearNextPageIndex();
                return this;
            }

            public final Builder clearOffset() {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).clearOffset();
                return this;
            }

            public final Builder clearPreviousPageIndex() {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).clearPreviousPageIndex();
                return this;
            }

            public final Builder clearTotalPages() {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).clearTotalPages();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final UnfollowedListItem getItems(int i) {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final int getItemsCount() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final List<UnfollowedListItem> getItemsList() {
                return Collections.unmodifiableList(((PaginatedUnfollowedListItems) ((g) this).instance).getItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final int getLimit() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getLimit();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final int getNextPageIndex() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getNextPageIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final int getOffset() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getOffset();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final int getPreviousPageIndex() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getPreviousPageIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final int getTotalPages() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).getTotalPages();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final boolean hasLimit() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).hasLimit();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final boolean hasNextPageIndex() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).hasNextPageIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final boolean hasOffset() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).hasOffset();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final boolean hasPreviousPageIndex() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).hasPreviousPageIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PaginatedUnfollowedListItemsOrBuilder
            public final boolean hasTotalPages() {
                return ((PaginatedUnfollowedListItems) ((g) this).instance).hasTotalPages();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m716mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeItems(int i) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).removeItems(i);
                return this;
            }

            public final Builder setItems(int i, UnfollowedListItem.Builder builder) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setItems(i, (UnfollowedListItem) builder.build());
                return this;
            }

            public final Builder setLimit(int i) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setLimit(i);
                return this;
            }

            public final Builder setNextPageIndex(int i) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setNextPageIndex(i);
                return this;
            }

            public final Builder setOffset(int i) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setOffset(i);
                return this;
            }

            public final Builder setPreviousPageIndex(int i) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setPreviousPageIndex(i);
                return this;
            }

            public final Builder setTotalPages(int i) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setTotalPages(i);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m715clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m717mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m714clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m718mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addItems(int i, UnfollowedListItem unfollowedListItem) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).addItems(i, unfollowedListItem);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setItems(int i, UnfollowedListItem unfollowedListItem) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).setItems(i, unfollowedListItem);
                return this;
            }

            public final Builder addItems(UnfollowedListItem unfollowedListItem) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).addItems(unfollowedListItem);
                return this;
            }

            public final Builder addItems(int i, UnfollowedListItem.Builder builder) {
                copyOnWrite();
                ((PaginatedUnfollowedListItems) ((g) this).instance).addItems(i, (UnfollowedListItem) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(PaginatedUnfollowedListItems paginatedUnfollowedListItems) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(paginatedUnfollowedListItems);
        }

        public static PaginatedUnfollowedListItems parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PaginatedUnfollowedListItems) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PaginatedUnfollowedListItems parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PaginatedUnfollowedListItems parseFrom(phc phcVar) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PaginatedUnfollowedListItems parseFrom(phc phcVar, uz00 uz00Var) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i, UnfollowedListItem unfollowedListItem) {
            unfollowedListItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, unfollowedListItem);
        }

        public static PaginatedUnfollowedListItems parseFrom(byte[] bArr) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaginatedUnfollowedListItems parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PaginatedUnfollowedListItems parseFrom(InputStream inputStream) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaginatedUnfollowedListItems parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PaginatedUnfollowedListItems parseFrom(lwg lwgVar) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PaginatedUnfollowedListItems parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PaginatedUnfollowedListItems) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PartnerInfo extends h implements PartnerInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final PartnerInfo DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private qng0 data_ = qng0.b;

        public static final class DataDefaultEntryHolder {
            static final dng0 defaultEntry;

            static {
                ytl1 ytl1Var = kul1.g;
                defaultEntry = new dng0(ytl1Var, "", ytl1Var, "");
            }

            private DataDefaultEntryHolder() {
            }
        }

        static {
            PartnerInfo partnerInfo = new PartnerInfo();
            DEFAULT_INSTANCE = partnerInfo;
            h.registerDefaultInstance(PartnerInfo.class, partnerInfo);
        }

        private PartnerInfo() {
        }

        public static PartnerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, String> getMutableDataMap() {
            return internalGetMutableData();
        }

        private qng0 internalGetData() {
            return this.data_;
        }

        private qng0 internalGetMutableData() {
            qng0 qng0Var = this.data_;
            if (qng0Var.a) {
                return qng0Var;
            }
            qng0 qng0VarH = qng0Var.h();
            this.data_ = qng0VarH;
            return qng0VarH;
        }

        public static qng0 n(PartnerInfo partnerInfo) {
            return partnerInfo.internalGetMutableData();
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PartnerInfo parseDelimitedFrom(InputStream inputStream) {
            return (PartnerInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PartnerInfo parseFrom(ByteBuffer byteBuffer) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        public final boolean containsData(String str) {
            str.getClass();
            return this.data_.containsKey(str);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"data_", DataDefaultEntryHolder.defaultEntry});
            }
            if (iOrdinal == 3) {
                return new PartnerInfo();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (PartnerInfo.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        @Deprecated
        public final Map<String, String> getData() {
            return Collections.unmodifiableMap(this.data_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        public final int getDataCount() {
            return this.data_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        public final Map<String, String> getDataMap() {
            return Collections.unmodifiableMap(this.data_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        public final String getDataOrDefault(String str, String str2) {
            str.getClass();
            qng0 qng0Var = this.data_;
            return qng0Var.containsKey(str) ? (String) qng0Var.get(str) : str2;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        public final String getDataOrThrow(String str) {
            str.getClass();
            qng0 qng0Var = this.data_;
            if (qng0Var.containsKey(str)) {
                return (String) qng0Var.get(str);
            }
            bhn0.q();
            return null;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PartnerInfoOrBuilder {
            private Builder() {
                super(PartnerInfo.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearData() {
                copyOnWrite();
                PartnerInfo.n((PartnerInfo) ((g) this).instance).clear();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            public final boolean containsData(String str) {
                str.getClass();
                return ((PartnerInfo) ((g) this).instance).getDataMap().containsKey(str);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            @Deprecated
            public final Map<String, String> getData() {
                return getDataMap();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            public final int getDataCount() {
                return ((PartnerInfo) ((g) this).instance).getDataMap().size();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            public final Map<String, String> getDataMap() {
                return Collections.unmodifiableMap(((PartnerInfo) ((g) this).instance).getDataMap());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            public final String getDataOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> dataMap = ((PartnerInfo) ((g) this).instance).getDataMap();
                return dataMap.containsKey(str) ? dataMap.get(str) : str2;
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            public final String getDataOrThrow(String str) {
                str.getClass();
                Map<String, String> dataMap = ((PartnerInfo) ((g) this).instance).getDataMap();
                if (dataMap.containsKey(str)) {
                    return dataMap.get(str);
                }
                bhn0.q();
                return null;
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PartnerInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m721mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder putAllData(Map<String, String> map) {
                copyOnWrite();
                PartnerInfo.n((PartnerInfo) ((g) this).instance).putAll(map);
                return this;
            }

            public final Builder putData(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                PartnerInfo.n((PartnerInfo) ((g) this).instance).put(str, str2);
                return this;
            }

            public final Builder removeData(String str) {
                str.getClass();
                copyOnWrite();
                PartnerInfo.n((PartnerInfo) ((g) this).instance).remove(str);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m720clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m722mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m719clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m723mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(PartnerInfo partnerInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(partnerInfo);
        }

        public static PartnerInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PartnerInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PartnerInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PartnerInfo parseFrom(phc phcVar) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PartnerInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static PartnerInfo parseFrom(byte[] bArr) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PartnerInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PartnerInfo parseFrom(InputStream inputStream) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PartnerInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PartnerInfo parseFrom(lwg lwgVar) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PartnerInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PartnerInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PictureSize extends h implements PictureSizeOrBuilder {
        private static final PictureSize DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TARGET_NAME_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        private int bitField0_;
        private String targetName_ = "";
        private String url_ = "";

        static {
            PictureSize pictureSize = new PictureSize();
            DEFAULT_INSTANCE = pictureSize;
            h.registerDefaultInstance(PictureSize.class, pictureSize);
        }

        private PictureSize() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetName() {
            this.bitField0_ &= -2;
            this.targetName_ = DEFAULT_INSTANCE.targetName_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = DEFAULT_INSTANCE.url_;
        }

        public static PictureSize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PictureSize parseDelimitedFrom(InputStream inputStream) {
            return (PictureSize) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PictureSize parseFrom(ByteBuffer byteBuffer) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.targetName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetNameBytes(phc phcVar) {
            this.targetName_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(phc phcVar) {
            this.url_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "targetName_", "url_"});
            }
            if (iOrdinal == 3) {
                return new PictureSize();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (PictureSize.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final String getTargetName() {
            return this.targetName_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final phc getTargetNameBytes() {
            return phc.i(this.targetName_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final String getUrl() {
            return this.url_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final phc getUrlBytes() {
            return phc.i(this.url_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final boolean hasTargetName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
        public final boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PictureSizeOrBuilder {
            private Builder() {
                super(PictureSize.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearTargetName() {
                copyOnWrite();
                ((PictureSize) ((g) this).instance).clearTargetName();
                return this;
            }

            public final Builder clearUrl() {
                copyOnWrite();
                ((PictureSize) ((g) this).instance).clearUrl();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final String getTargetName() {
                return ((PictureSize) ((g) this).instance).getTargetName();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final phc getTargetNameBytes() {
                return ((PictureSize) ((g) this).instance).getTargetNameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final String getUrl() {
                return ((PictureSize) ((g) this).instance).getUrl();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final phc getUrlBytes() {
                return ((PictureSize) ((g) this).instance).getUrlBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final boolean hasTargetName() {
                return ((PictureSize) ((g) this).instance).hasTargetName();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PictureSizeOrBuilder
            public final boolean hasUrl() {
                return ((PictureSize) ((g) this).instance).hasUrl();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m726mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setTargetName(String str) {
                copyOnWrite();
                ((PictureSize) ((g) this).instance).setTargetName(str);
                return this;
            }

            public final Builder setTargetNameBytes(phc phcVar) {
                copyOnWrite();
                ((PictureSize) ((g) this).instance).setTargetNameBytes(phcVar);
                return this;
            }

            public final Builder setUrl(String str) {
                copyOnWrite();
                ((PictureSize) ((g) this).instance).setUrl(str);
                return this;
            }

            public final Builder setUrlBytes(phc phcVar) {
                copyOnWrite();
                ((PictureSize) ((g) this).instance).setUrlBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m725clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m727mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m724clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m728mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(PictureSize pictureSize) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(pictureSize);
        }

        public static PictureSize parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PictureSize) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PictureSize parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PictureSize parseFrom(phc phcVar) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PictureSize parseFrom(phc phcVar, uz00 uz00Var) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static PictureSize parseFrom(byte[] bArr) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PictureSize parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PictureSize parseFrom(InputStream inputStream) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PictureSize parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PictureSize parseFrom(lwg lwgVar) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PictureSize parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PictureSize) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PlaylistUriResolverResponse extends h implements PlaylistUriResolverResponseOrBuilder {
        private static final PlaylistUriResolverResponse DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RESOLVED_PLAYLISTS_FIELD_NUMBER = 1;
        private h290 resolvedPlaylists_ = h.emptyProtobufList();

        static {
            PlaylistUriResolverResponse playlistUriResolverResponse = new PlaylistUriResolverResponse();
            DEFAULT_INSTANCE = playlistUriResolverResponse;
            h.registerDefaultInstance(PlaylistUriResolverResponse.class, playlistUriResolverResponse);
        }

        private PlaylistUriResolverResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResolvedPlaylists(Iterable<? extends ResolvedPersonalizedPlaylist> iterable) {
            ensureResolvedPlaylistsIsMutable();
            s8.addAll(iterable, this.resolvedPlaylists_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolvedPlaylists(ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
            resolvedPersonalizedPlaylist.getClass();
            ensureResolvedPlaylistsIsMutable();
            this.resolvedPlaylists_.add(resolvedPersonalizedPlaylist);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResolvedPlaylists() {
            this.resolvedPlaylists_ = h.emptyProtobufList();
        }

        private void ensureResolvedPlaylistsIsMutable() {
            i9 i9Var = this.resolvedPlaylists_;
            if (i9Var.a) {
                return;
            }
            this.resolvedPlaylists_ = h.mutableCopy(i9Var);
        }

        public static PlaylistUriResolverResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaylistUriResolverResponse parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistUriResolverResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistUriResolverResponse parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResolvedPlaylists(int i) {
            ensureResolvedPlaylistsIsMutable();
            this.resolvedPlaylists_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResolvedPlaylists(int i, ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
            resolvedPersonalizedPlaylist.getClass();
            ensureResolvedPlaylistsIsMutable();
            this.resolvedPlaylists_.set(i, resolvedPersonalizedPlaylist);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"resolvedPlaylists_", ResolvedPersonalizedPlaylist.class});
            }
            if (iOrdinal == 3) {
                return new PlaylistUriResolverResponse();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (PlaylistUriResolverResponse.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
        public final ResolvedPersonalizedPlaylist getResolvedPlaylists(int i) {
            return (ResolvedPersonalizedPlaylist) this.resolvedPlaylists_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
        public final int getResolvedPlaylistsCount() {
            return this.resolvedPlaylists_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
        public final List<ResolvedPersonalizedPlaylist> getResolvedPlaylistsList() {
            return this.resolvedPlaylists_;
        }

        public final ResolvedPersonalizedPlaylistOrBuilder getResolvedPlaylistsOrBuilder(int i) {
            return (ResolvedPersonalizedPlaylistOrBuilder) this.resolvedPlaylists_.get(i);
        }

        public final List<? extends ResolvedPersonalizedPlaylistOrBuilder> getResolvedPlaylistsOrBuilderList() {
            return this.resolvedPlaylists_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaylistUriResolverResponseOrBuilder {
            private Builder() {
                super(PlaylistUriResolverResponse.DEFAULT_INSTANCE);
            }

            public final Builder addAllResolvedPlaylists(Iterable<? extends ResolvedPersonalizedPlaylist> iterable) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).addAllResolvedPlaylists(iterable);
                return this;
            }

            public final Builder addResolvedPlaylists(ResolvedPersonalizedPlaylist.Builder builder) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).addResolvedPlaylists((ResolvedPersonalizedPlaylist) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearResolvedPlaylists() {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).clearResolvedPlaylists();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
            public final ResolvedPersonalizedPlaylist getResolvedPlaylists(int i) {
                return ((PlaylistUriResolverResponse) ((g) this).instance).getResolvedPlaylists(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
            public final int getResolvedPlaylistsCount() {
                return ((PlaylistUriResolverResponse) ((g) this).instance).getResolvedPlaylistsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistUriResolverResponseOrBuilder
            public final List<ResolvedPersonalizedPlaylist> getResolvedPlaylistsList() {
                return Collections.unmodifiableList(((PlaylistUriResolverResponse) ((g) this).instance).getResolvedPlaylistsList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m731mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeResolvedPlaylists(int i) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).removeResolvedPlaylists(i);
                return this;
            }

            public final Builder setResolvedPlaylists(int i, ResolvedPersonalizedPlaylist.Builder builder) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).setResolvedPlaylists(i, (ResolvedPersonalizedPlaylist) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m730clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m732mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m729clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m733mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addResolvedPlaylists(int i, ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).addResolvedPlaylists(i, resolvedPersonalizedPlaylist);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setResolvedPlaylists(int i, ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).setResolvedPlaylists(i, resolvedPersonalizedPlaylist);
                return this;
            }

            public final Builder addResolvedPlaylists(ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).addResolvedPlaylists(resolvedPersonalizedPlaylist);
                return this;
            }

            public final Builder addResolvedPlaylists(int i, ResolvedPersonalizedPlaylist.Builder builder) {
                copyOnWrite();
                ((PlaylistUriResolverResponse) ((g) this).instance).addResolvedPlaylists(i, (ResolvedPersonalizedPlaylist) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(PlaylistUriResolverResponse playlistUriResolverResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistUriResolverResponse);
        }

        public static PlaylistUriResolverResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistUriResolverResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistUriResolverResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PlaylistUriResolverResponse parseFrom(phc phcVar) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PlaylistUriResolverResponse parseFrom(phc phcVar, uz00 uz00Var) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResolvedPlaylists(int i, ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
            resolvedPersonalizedPlaylist.getClass();
            ensureResolvedPlaylistsIsMutable();
            this.resolvedPlaylists_.add(i, resolvedPersonalizedPlaylist);
        }

        public static PlaylistUriResolverResponse parseFrom(byte[] bArr) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistUriResolverResponse parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PlaylistUriResolverResponse parseFrom(InputStream inputStream) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistUriResolverResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistUriResolverResponse parseFrom(lwg lwgVar) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PlaylistUriResolverResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PlaylistUriResolverResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PlaylistV1UriReply extends h implements PlaylistV1UriReplyOrBuilder {
        private static final PlaylistV1UriReply DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int V2_URI_TO_V1_URI_FIELD_NUMBER = 1;
        private qng0 v2UriToV1Uri_ = qng0.b;

        public static final class V2UriToV1UriDefaultEntryHolder {
            static final dng0 defaultEntry;

            static {
                ytl1 ytl1Var = kul1.g;
                defaultEntry = new dng0(ytl1Var, "", ytl1Var, "");
            }

            private V2UriToV1UriDefaultEntryHolder() {
            }
        }

        static {
            PlaylistV1UriReply playlistV1UriReply = new PlaylistV1UriReply();
            DEFAULT_INSTANCE = playlistV1UriReply;
            h.registerDefaultInstance(PlaylistV1UriReply.class, playlistV1UriReply);
        }

        private PlaylistV1UriReply() {
        }

        public static PlaylistV1UriReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, String> getMutableV2UriToV1UriMap() {
            return internalGetMutableV2UriToV1Uri();
        }

        private qng0 internalGetMutableV2UriToV1Uri() {
            qng0 qng0Var = this.v2UriToV1Uri_;
            if (qng0Var.a) {
                return qng0Var;
            }
            qng0 qng0VarH = qng0Var.h();
            this.v2UriToV1Uri_ = qng0VarH;
            return qng0VarH;
        }

        private qng0 internalGetV2UriToV1Uri() {
            return this.v2UriToV1Uri_;
        }

        public static qng0 n(PlaylistV1UriReply playlistV1UriReply) {
            return playlistV1UriReply.internalGetMutableV2UriToV1Uri();
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaylistV1UriReply parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistV1UriReply) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistV1UriReply parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        public final boolean containsV2UriToV1Uri(String str) {
            str.getClass();
            return this.v2UriToV1Uri_.containsKey(str);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"v2UriToV1Uri_", V2UriToV1UriDefaultEntryHolder.defaultEntry});
            }
            if (iOrdinal == 3) {
                return new PlaylistV1UriReply();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (PlaylistV1UriReply.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        @Deprecated
        public final Map<String, String> getV2UriToV1Uri() {
            return Collections.unmodifiableMap(this.v2UriToV1Uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        public final int getV2UriToV1UriCount() {
            return this.v2UriToV1Uri_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        public final Map<String, String> getV2UriToV1UriMap() {
            return Collections.unmodifiableMap(this.v2UriToV1Uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        public final String getV2UriToV1UriOrDefault(String str, String str2) {
            str.getClass();
            qng0 qng0Var = this.v2UriToV1Uri_;
            return qng0Var.containsKey(str) ? (String) qng0Var.get(str) : str2;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
        public final String getV2UriToV1UriOrThrow(String str) {
            str.getClass();
            qng0 qng0Var = this.v2UriToV1Uri_;
            if (qng0Var.containsKey(str)) {
                return (String) qng0Var.get(str);
            }
            bhn0.q();
            return null;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaylistV1UriReplyOrBuilder {
            private Builder() {
                super(PlaylistV1UriReply.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearV2UriToV1Uri() {
                copyOnWrite();
                PlaylistV1UriReply.n((PlaylistV1UriReply) ((g) this).instance).clear();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            public final boolean containsV2UriToV1Uri(String str) {
                str.getClass();
                return ((PlaylistV1UriReply) ((g) this).instance).getV2UriToV1UriMap().containsKey(str);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            @Deprecated
            public final Map<String, String> getV2UriToV1Uri() {
                return getV2UriToV1UriMap();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            public final int getV2UriToV1UriCount() {
                return ((PlaylistV1UriReply) ((g) this).instance).getV2UriToV1UriMap().size();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            public final Map<String, String> getV2UriToV1UriMap() {
                return Collections.unmodifiableMap(((PlaylistV1UriReply) ((g) this).instance).getV2UriToV1UriMap());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            public final String getV2UriToV1UriOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> v2UriToV1UriMap = ((PlaylistV1UriReply) ((g) this).instance).getV2UriToV1UriMap();
                return v2UriToV1UriMap.containsKey(str) ? v2UriToV1UriMap.get(str) : str2;
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriReplyOrBuilder
            public final String getV2UriToV1UriOrThrow(String str) {
                str.getClass();
                Map<String, String> v2UriToV1UriMap = ((PlaylistV1UriReply) ((g) this).instance).getV2UriToV1UriMap();
                if (v2UriToV1UriMap.containsKey(str)) {
                    return v2UriToV1UriMap.get(str);
                }
                bhn0.q();
                return null;
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m736mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder putAllV2UriToV1Uri(Map<String, String> map) {
                copyOnWrite();
                PlaylistV1UriReply.n((PlaylistV1UriReply) ((g) this).instance).putAll(map);
                return this;
            }

            public final Builder putV2UriToV1Uri(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                PlaylistV1UriReply.n((PlaylistV1UriReply) ((g) this).instance).put(str, str2);
                return this;
            }

            public final Builder removeV2UriToV1Uri(String str) {
                str.getClass();
                copyOnWrite();
                PlaylistV1UriReply.n((PlaylistV1UriReply) ((g) this).instance).remove(str);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m735clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m737mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m734clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m738mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(PlaylistV1UriReply playlistV1UriReply) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistV1UriReply);
        }

        public static PlaylistV1UriReply parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistV1UriReply) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistV1UriReply parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PlaylistV1UriReply parseFrom(phc phcVar) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PlaylistV1UriReply parseFrom(phc phcVar, uz00 uz00Var) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static PlaylistV1UriReply parseFrom(byte[] bArr) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistV1UriReply parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PlaylistV1UriReply parseFrom(InputStream inputStream) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistV1UriReply parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistV1UriReply parseFrom(lwg lwgVar) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PlaylistV1UriReply parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PlaylistV1UriReply) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PlaylistV1UriRequest extends h implements PlaylistV1UriRequestOrBuilder {
        private static final PlaylistV1UriRequest DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int V2_URIS_FIELD_NUMBER = 1;
        private h290 v2Uris_ = h.emptyProtobufList();

        static {
            PlaylistV1UriRequest playlistV1UriRequest = new PlaylistV1UriRequest();
            DEFAULT_INSTANCE = playlistV1UriRequest;
            h.registerDefaultInstance(PlaylistV1UriRequest.class, playlistV1UriRequest);
        }

        private PlaylistV1UriRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllV2Uris(Iterable<String> iterable) {
            ensureV2UrisIsMutable();
            s8.addAll(iterable, this.v2Uris_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addV2Uris(String str) {
            str.getClass();
            ensureV2UrisIsMutable();
            this.v2Uris_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addV2UrisBytes(phc phcVar) {
            ensureV2UrisIsMutable();
            this.v2Uris_.add(phcVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearV2Uris() {
            this.v2Uris_ = h.emptyProtobufList();
        }

        private void ensureV2UrisIsMutable() {
            i9 i9Var = this.v2Uris_;
            if (i9Var.a) {
                return;
            }
            this.v2Uris_ = h.mutableCopy(i9Var);
        }

        public static PlaylistV1UriRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaylistV1UriRequest parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistV1UriRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistV1UriRequest parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setV2Uris(int i, String str) {
            str.getClass();
            ensureV2UrisIsMutable();
            this.v2Uris_.set(i, str);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"v2Uris_"});
            }
            if (iOrdinal == 3) {
                return new PlaylistV1UriRequest();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (PlaylistV1UriRequest.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
        public final String getV2Uris(int i) {
            return (String) this.v2Uris_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
        public final phc getV2UrisBytes(int i) {
            return phc.i((String) this.v2Uris_.get(i));
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
        public final int getV2UrisCount() {
            return this.v2Uris_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
        public final List<String> getV2UrisList() {
            return this.v2Uris_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaylistV1UriRequestOrBuilder {
            private Builder() {
                super(PlaylistV1UriRequest.DEFAULT_INSTANCE);
            }

            public final Builder addAllV2Uris(Iterable<String> iterable) {
                copyOnWrite();
                ((PlaylistV1UriRequest) ((g) this).instance).addAllV2Uris(iterable);
                return this;
            }

            public final Builder addV2Uris(String str) {
                copyOnWrite();
                ((PlaylistV1UriRequest) ((g) this).instance).addV2Uris(str);
                return this;
            }

            public final Builder addV2UrisBytes(phc phcVar) {
                copyOnWrite();
                ((PlaylistV1UriRequest) ((g) this).instance).addV2UrisBytes(phcVar);
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearV2Uris() {
                copyOnWrite();
                ((PlaylistV1UriRequest) ((g) this).instance).clearV2Uris();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
            public final String getV2Uris(int i) {
                return ((PlaylistV1UriRequest) ((g) this).instance).getV2Uris(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
            public final phc getV2UrisBytes(int i) {
                return ((PlaylistV1UriRequest) ((g) this).instance).getV2UrisBytes(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
            public final int getV2UrisCount() {
                return ((PlaylistV1UriRequest) ((g) this).instance).getV2UrisCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.PlaylistV1UriRequestOrBuilder
            public final List<String> getV2UrisList() {
                return Collections.unmodifiableList(((PlaylistV1UriRequest) ((g) this).instance).getV2UrisList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m741mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setV2Uris(int i, String str) {
                copyOnWrite();
                ((PlaylistV1UriRequest) ((g) this).instance).setV2Uris(i, str);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m740clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m742mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m739clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m743mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(PlaylistV1UriRequest playlistV1UriRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistV1UriRequest);
        }

        public static PlaylistV1UriRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistV1UriRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistV1UriRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PlaylistV1UriRequest parseFrom(phc phcVar) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PlaylistV1UriRequest parseFrom(phc phcVar, uz00 uz00Var) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static PlaylistV1UriRequest parseFrom(byte[] bArr) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistV1UriRequest parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PlaylistV1UriRequest parseFrom(InputStream inputStream) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistV1UriRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistV1UriRequest parseFrom(lwg lwgVar) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PlaylistV1UriRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PlaylistV1UriRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class RecommendationInfo extends h implements RecommendationInfoOrBuilder {
        private static final RecommendationInfo DEFAULT_INSTANCE;
        public static final int IS_RECOMMENDATION_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private boolean isRecommendation_;

        static {
            RecommendationInfo recommendationInfo = new RecommendationInfo();
            DEFAULT_INSTANCE = recommendationInfo;
            h.registerDefaultInstance(RecommendationInfo.class, recommendationInfo);
        }

        private RecommendationInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsRecommendation() {
            this.bitField0_ &= -2;
            this.isRecommendation_ = false;
        }

        public static RecommendationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RecommendationInfo parseDelimitedFrom(InputStream inputStream) {
            return (RecommendationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecommendationInfo parseFrom(ByteBuffer byteBuffer) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsRecommendation(boolean z) {
            this.bitField0_ |= 1;
            this.isRecommendation_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isRecommendation_"});
            }
            if (iOrdinal == 3) {
                return new RecommendationInfo();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (RecommendationInfo.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RecommendationInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RecommendationInfoOrBuilder
        public final boolean getIsRecommendation() {
            return this.isRecommendation_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RecommendationInfoOrBuilder
        public final boolean hasIsRecommendation() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RecommendationInfoOrBuilder {
            private Builder() {
                super(RecommendationInfo.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearIsRecommendation() {
                copyOnWrite();
                ((RecommendationInfo) ((g) this).instance).clearIsRecommendation();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RecommendationInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RecommendationInfoOrBuilder
            public final boolean getIsRecommendation() {
                return ((RecommendationInfo) ((g) this).instance).getIsRecommendation();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RecommendationInfoOrBuilder
            public final boolean hasIsRecommendation() {
                return ((RecommendationInfo) ((g) this).instance).hasIsRecommendation();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m746mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setIsRecommendation(boolean z) {
                copyOnWrite();
                ((RecommendationInfo) ((g) this).instance).setIsRecommendation(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m745clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m747mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m744clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m748mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(RecommendationInfo recommendationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(recommendationInfo);
        }

        public static RecommendationInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (RecommendationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RecommendationInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static RecommendationInfo parseFrom(phc phcVar) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static RecommendationInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static RecommendationInfo parseFrom(byte[] bArr) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecommendationInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static RecommendationInfo parseFrom(InputStream inputStream) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecommendationInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RecommendationInfo parseFrom(lwg lwgVar) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static RecommendationInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (RecommendationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class RegisterPlaylistImageRequest extends h implements RegisterPlaylistImageRequestOrBuilder {
        private static final RegisterPlaylistImageRequest DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int UPLOAD_TOKEN_FIELD_NUMBER = 1;
        private int bitField0_;
        private String uploadToken_ = "";

        static {
            RegisterPlaylistImageRequest registerPlaylistImageRequest = new RegisterPlaylistImageRequest();
            DEFAULT_INSTANCE = registerPlaylistImageRequest;
            h.registerDefaultInstance(RegisterPlaylistImageRequest.class, registerPlaylistImageRequest);
        }

        private RegisterPlaylistImageRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadToken() {
            this.bitField0_ &= -2;
            this.uploadToken_ = DEFAULT_INSTANCE.uploadToken_;
        }

        public static RegisterPlaylistImageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RegisterPlaylistImageRequest parseDelimitedFrom(InputStream inputStream) {
            return (RegisterPlaylistImageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterPlaylistImageRequest parseFrom(ByteBuffer byteBuffer) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadToken(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uploadToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadTokenBytes(phc phcVar) {
            this.uploadToken_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "uploadToken_"});
            }
            if (iOrdinal == 3) {
                return new RegisterPlaylistImageRequest();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (RegisterPlaylistImageRequest.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
        public final String getUploadToken() {
            return this.uploadToken_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
        public final phc getUploadTokenBytes() {
            return phc.i(this.uploadToken_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
        public final boolean hasUploadToken() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RegisterPlaylistImageRequestOrBuilder {
            private Builder() {
                super(RegisterPlaylistImageRequest.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearUploadToken() {
                copyOnWrite();
                ((RegisterPlaylistImageRequest) ((g) this).instance).clearUploadToken();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
            public final String getUploadToken() {
                return ((RegisterPlaylistImageRequest) ((g) this).instance).getUploadToken();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
            public final phc getUploadTokenBytes() {
                return ((RegisterPlaylistImageRequest) ((g) this).instance).getUploadTokenBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageRequestOrBuilder
            public final boolean hasUploadToken() {
                return ((RegisterPlaylistImageRequest) ((g) this).instance).hasUploadToken();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m751mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setUploadToken(String str) {
                copyOnWrite();
                ((RegisterPlaylistImageRequest) ((g) this).instance).setUploadToken(str);
                return this;
            }

            public final Builder setUploadTokenBytes(phc phcVar) {
                copyOnWrite();
                ((RegisterPlaylistImageRequest) ((g) this).instance).setUploadTokenBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m750clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m752mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m749clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m753mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(RegisterPlaylistImageRequest registerPlaylistImageRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(registerPlaylistImageRequest);
        }

        public static RegisterPlaylistImageRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (RegisterPlaylistImageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RegisterPlaylistImageRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static RegisterPlaylistImageRequest parseFrom(phc phcVar) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static RegisterPlaylistImageRequest parseFrom(phc phcVar, uz00 uz00Var) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static RegisterPlaylistImageRequest parseFrom(byte[] bArr) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RegisterPlaylistImageRequest parseFrom(byte[] bArr, uz00 uz00Var) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static RegisterPlaylistImageRequest parseFrom(InputStream inputStream) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterPlaylistImageRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RegisterPlaylistImageRequest parseFrom(lwg lwgVar) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static RegisterPlaylistImageRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (RegisterPlaylistImageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class RegisterPlaylistImageResponse extends h implements RegisterPlaylistImageResponseOrBuilder {
        private static final RegisterPlaylistImageResponse DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PICTURE_FIELD_NUMBER = 1;
        private int bitField0_;
        private phc picture_ = phc.b;

        static {
            RegisterPlaylistImageResponse registerPlaylistImageResponse = new RegisterPlaylistImageResponse();
            DEFAULT_INSTANCE = registerPlaylistImageResponse;
            h.registerDefaultInstance(RegisterPlaylistImageResponse.class, registerPlaylistImageResponse);
        }

        private RegisterPlaylistImageResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicture() {
            this.bitField0_ &= -2;
            this.picture_ = DEFAULT_INSTANCE.picture_;
        }

        public static RegisterPlaylistImageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RegisterPlaylistImageResponse parseDelimitedFrom(InputStream inputStream) {
            return (RegisterPlaylistImageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterPlaylistImageResponse parseFrom(ByteBuffer byteBuffer) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicture(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.picture_ = phcVar;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "picture_"});
            }
            if (iOrdinal == 3) {
                return new RegisterPlaylistImageResponse();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (RegisterPlaylistImageResponse.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageResponseOrBuilder
        public final phc getPicture() {
            return this.picture_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageResponseOrBuilder
        public final boolean hasPicture() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RegisterPlaylistImageResponseOrBuilder {
            private Builder() {
                super(RegisterPlaylistImageResponse.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearPicture() {
                copyOnWrite();
                ((RegisterPlaylistImageResponse) ((g) this).instance).clearPicture();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageResponseOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageResponseOrBuilder
            public final phc getPicture() {
                return ((RegisterPlaylistImageResponse) ((g) this).instance).getPicture();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RegisterPlaylistImageResponseOrBuilder
            public final boolean hasPicture() {
                return ((RegisterPlaylistImageResponse) ((g) this).instance).hasPicture();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m756mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setPicture(phc phcVar) {
                copyOnWrite();
                ((RegisterPlaylistImageResponse) ((g) this).instance).setPicture(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m755clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m757mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m754clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m758mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(RegisterPlaylistImageResponse registerPlaylistImageResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(registerPlaylistImageResponse);
        }

        public static RegisterPlaylistImageResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (RegisterPlaylistImageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RegisterPlaylistImageResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static RegisterPlaylistImageResponse parseFrom(phc phcVar) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static RegisterPlaylistImageResponse parseFrom(phc phcVar, uz00 uz00Var) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static RegisterPlaylistImageResponse parseFrom(byte[] bArr) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RegisterPlaylistImageResponse parseFrom(byte[] bArr, uz00 uz00Var) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static RegisterPlaylistImageResponse parseFrom(InputStream inputStream) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterPlaylistImageResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RegisterPlaylistImageResponse parseFrom(lwg lwgVar) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static RegisterPlaylistImageResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (RegisterPlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Rem extends h implements RemOrBuilder {
        private static final Rem DEFAULT_INSTANCE;
        public static final int FROM_INDEX_FIELD_NUMBER = 1;
        public static final int ITEMS_AS_KEY_FIELD_NUMBER = 7;
        public static final int ITEMS_FIELD_NUMBER = 3;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private int fromIndex_;
        private boolean itemsAsKey_;
        private int length_;
        private byte memoizedIsInitialized = 2;
        private h290 items_ = h.emptyProtobufList();

        static {
            Rem rem = new Rem();
            DEFAULT_INSTANCE = rem;
            h.registerDefaultInstance(Rem.class, rem);
        }

        private Rem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends Item> iterable) {
            ensureItemsIsMutable();
            s8.addAll(iterable, this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromIndex() {
            this.bitField0_ &= -2;
            this.fromIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItemsAsKey() {
            this.bitField0_ &= -5;
            this.itemsAsKey_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            this.bitField0_ &= -3;
            this.length_ = 0;
        }

        private void ensureItemsIsMutable() {
            i9 i9Var = this.items_;
            if (i9Var.a) {
                return;
            }
            this.items_ = h.mutableCopy(i9Var);
        }

        public static Rem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Rem parseDelimitedFrom(InputStream inputStream) {
            return (Rem) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rem parseFrom(ByteBuffer byteBuffer) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromIndex(int i) {
            this.bitField0_ |= 1;
            this.fromIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItemsAsKey(boolean z) {
            this.bitField0_ |= 4;
            this.itemsAsKey_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(int i) {
            this.bitField0_ |= 2;
            this.length_ = i;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0001\u0001င\u0000\u0002င\u0001\u0003Л\u0007ဇ\u0002", new Object[]{"bitField0_", "fromIndex_", "length_", "items_", Item.class, "itemsAsKey_"});
                case 3:
                    return new Rem();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (Rem.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final int getFromIndex() {
            return this.fromIndex_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final Item getItems(int i) {
            return (Item) this.items_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final boolean getItemsAsKey() {
            return this.itemsAsKey_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final List<Item> getItemsList() {
            return this.items_;
        }

        public final ItemOrBuilder getItemsOrBuilder(int i) {
            return (ItemOrBuilder) this.items_.get(i);
        }

        public final List<? extends ItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final int getLength() {
            return this.length_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final boolean hasFromIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final boolean hasItemsAsKey() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
        public final boolean hasLength() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RemOrBuilder {
            private Builder() {
                super(Rem.DEFAULT_INSTANCE);
            }

            public final Builder addAllItems(Iterable<? extends Item> iterable) {
                copyOnWrite();
                ((Rem) ((g) this).instance).addAllItems(iterable);
                return this;
            }

            public final Builder addItems(Item.Builder builder) {
                copyOnWrite();
                ((Rem) ((g) this).instance).addItems((Item) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearFromIndex() {
                copyOnWrite();
                ((Rem) ((g) this).instance).clearFromIndex();
                return this;
            }

            public final Builder clearItems() {
                copyOnWrite();
                ((Rem) ((g) this).instance).clearItems();
                return this;
            }

            public final Builder clearItemsAsKey() {
                copyOnWrite();
                ((Rem) ((g) this).instance).clearItemsAsKey();
                return this;
            }

            public final Builder clearLength() {
                copyOnWrite();
                ((Rem) ((g) this).instance).clearLength();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final int getFromIndex() {
                return ((Rem) ((g) this).instance).getFromIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final Item getItems(int i) {
                return ((Rem) ((g) this).instance).getItems(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final boolean getItemsAsKey() {
                return ((Rem) ((g) this).instance).getItemsAsKey();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final int getItemsCount() {
                return ((Rem) ((g) this).instance).getItemsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final List<Item> getItemsList() {
                return Collections.unmodifiableList(((Rem) ((g) this).instance).getItemsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final int getLength() {
                return ((Rem) ((g) this).instance).getLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final boolean hasFromIndex() {
                return ((Rem) ((g) this).instance).hasFromIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final boolean hasItemsAsKey() {
                return ((Rem) ((g) this).instance).hasItemsAsKey();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.RemOrBuilder
            public final boolean hasLength() {
                return ((Rem) ((g) this).instance).hasLength();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m761mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeItems(int i) {
                copyOnWrite();
                ((Rem) ((g) this).instance).removeItems(i);
                return this;
            }

            public final Builder setFromIndex(int i) {
                copyOnWrite();
                ((Rem) ((g) this).instance).setFromIndex(i);
                return this;
            }

            public final Builder setItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((Rem) ((g) this).instance).setItems(i, (Item) builder.build());
                return this;
            }

            public final Builder setItemsAsKey(boolean z) {
                copyOnWrite();
                ((Rem) ((g) this).instance).setItemsAsKey(z);
                return this;
            }

            public final Builder setLength(int i) {
                copyOnWrite();
                ((Rem) ((g) this).instance).setLength(i);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m760clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m762mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m759clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m763mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addItems(int i, Item item) {
                copyOnWrite();
                ((Rem) ((g) this).instance).addItems(i, item);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setItems(int i, Item item) {
                copyOnWrite();
                ((Rem) ((g) this).instance).setItems(i, item);
                return this;
            }

            public final Builder addItems(Item item) {
                copyOnWrite();
                ((Rem) ((g) this).instance).addItems(item);
                return this;
            }

            public final Builder addItems(int i, Item.Builder builder) {
                copyOnWrite();
                ((Rem) ((g) this).instance).addItems(i, (Item) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Rem rem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(rem);
        }

        public static Rem parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Rem) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Rem parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Rem parseFrom(phc phcVar) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Rem parseFrom(phc phcVar, uz00 uz00Var) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i, Item item) {
            item.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, item);
        }

        public static Rem parseFrom(byte[] bArr) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rem parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Rem parseFrom(InputStream inputStream) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rem parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Rem parseFrom(lwg lwgVar) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Rem parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Rem) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ResolvedPersonalizedPlaylist extends h implements ResolvedPersonalizedPlaylistOrBuilder {
        private static final ResolvedPersonalizedPlaylist DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TAG_FIELD_NUMBER = 2;
        public static final int URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private String uri_ = "";
        private String tag_ = "";

        static {
            ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist = new ResolvedPersonalizedPlaylist();
            DEFAULT_INSTANCE = resolvedPersonalizedPlaylist;
            h.registerDefaultInstance(ResolvedPersonalizedPlaylist.class, resolvedPersonalizedPlaylist);
        }

        private ResolvedPersonalizedPlaylist() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.bitField0_ &= -3;
            this.tag_ = DEFAULT_INSTANCE.tag_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUri() {
            this.bitField0_ &= -2;
            this.uri_ = DEFAULT_INSTANCE.uri_;
        }

        public static ResolvedPersonalizedPlaylist getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ResolvedPersonalizedPlaylist parseDelimitedFrom(InputStream inputStream) {
            return (ResolvedPersonalizedPlaylist) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(ByteBuffer byteBuffer) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.tag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagBytes(phc phcVar) {
            this.tag_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUri(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriBytes(phc phcVar) {
            this.uri_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "uri_", "tag_"});
            }
            if (iOrdinal == 3) {
                return new ResolvedPersonalizedPlaylist();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (ResolvedPersonalizedPlaylist.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final String getTag() {
            return this.tag_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final phc getTagBytes() {
            return phc.i(this.tag_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final String getUri() {
            return this.uri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final phc getUriBytes() {
            return phc.i(this.uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final boolean hasTag() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
        public final boolean hasUri() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ResolvedPersonalizedPlaylistOrBuilder {
            private Builder() {
                super(ResolvedPersonalizedPlaylist.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearTag() {
                copyOnWrite();
                ((ResolvedPersonalizedPlaylist) ((g) this).instance).clearTag();
                return this;
            }

            public final Builder clearUri() {
                copyOnWrite();
                ((ResolvedPersonalizedPlaylist) ((g) this).instance).clearUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final String getTag() {
                return ((ResolvedPersonalizedPlaylist) ((g) this).instance).getTag();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final phc getTagBytes() {
                return ((ResolvedPersonalizedPlaylist) ((g) this).instance).getTagBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final String getUri() {
                return ((ResolvedPersonalizedPlaylist) ((g) this).instance).getUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final phc getUriBytes() {
                return ((ResolvedPersonalizedPlaylist) ((g) this).instance).getUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final boolean hasTag() {
                return ((ResolvedPersonalizedPlaylist) ((g) this).instance).hasTag();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.ResolvedPersonalizedPlaylistOrBuilder
            public final boolean hasUri() {
                return ((ResolvedPersonalizedPlaylist) ((g) this).instance).hasUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m766mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setTag(String str) {
                copyOnWrite();
                ((ResolvedPersonalizedPlaylist) ((g) this).instance).setTag(str);
                return this;
            }

            public final Builder setTagBytes(phc phcVar) {
                copyOnWrite();
                ((ResolvedPersonalizedPlaylist) ((g) this).instance).setTagBytes(phcVar);
                return this;
            }

            public final Builder setUri(String str) {
                copyOnWrite();
                ((ResolvedPersonalizedPlaylist) ((g) this).instance).setUri(str);
                return this;
            }

            public final Builder setUriBytes(phc phcVar) {
                copyOnWrite();
                ((ResolvedPersonalizedPlaylist) ((g) this).instance).setUriBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m765clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m767mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m764clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m768mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(resolvedPersonalizedPlaylist);
        }

        public static ResolvedPersonalizedPlaylist parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ResolvedPersonalizedPlaylist) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(phc phcVar) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(phc phcVar, uz00 uz00Var) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(byte[] bArr) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(InputStream inputStream) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(lwg lwgVar) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ResolvedPersonalizedPlaylist parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ResolvedPersonalizedPlaylist) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class SelectedListContent extends h implements SelectedListContentOrBuilder {
        public static final int ABUSE_REPORTING_ENABLED_FIELD_NUMBER = 17;
        public static final int APPLIED_LENSES_FIELD_NUMBER = 22;
        public static final int ATTRIBUTES_FIELD_NUMBER = 3;
        public static final int CAPABILITIES_FIELD_NUMBER = 18;
        public static final int CHANGES_REQUIRE_RESYNC_FIELD_NUMBER = 20;
        public static final int CONTENTS_FIELD_NUMBER = 5;
        public static final int CREATED_AT_FIELD_NUMBER = 21;
        private static final SelectedListContent DEFAULT_INSTANCE;
        public static final int DIFF_FIELD_NUMBER = 6;
        public static final int GEOBLOCK_FIELD_NUMBER = 19;
        public static final int IS_USER_CREATED_FIELD_NUMBER = 23;
        public static final int LENGTH_FIELD_NUMBER = 2;
        public static final int MULTIPLE_HEADS_FIELD_NUMBER = 9;
        public static final int NONCES_FIELD_NUMBER = 14;
        public static final int OWNER_USERNAME_FIELD_NUMBER = 16;
        private static volatile qzr0 PARSER = null;
        public static final int RESULTING_REVISIONS_FIELD_NUMBER = 8;
        public static final int REVISION_FIELD_NUMBER = 1;
        public static final int SIGNAL_RESULTS_FIELD_NUMBER = 24;
        public static final int SYNC_RESULT_FIELD_NUMBER = 7;
        public static final int TIMESTAMP_FIELD_NUMBER = 15;
        public static final int UP_TO_DATE_FIELD_NUMBER = 10;
        private static final c290 geoblock_converter_ = new AnonymousClass1();
        private boolean abuseReportingEnabled_;
        private AppliedLenses appliedLenses_;
        private ListAttributes attributes_;
        private int bitField0_;
        private Capabilities capabilities_;
        private boolean changesRequireResync_;
        private ListItems contents_;
        private long createdAt_;
        private Diff diff_;
        private boolean isUserCreated_;
        private int length_;
        private boolean multipleHeads_;
        private SignalResult signalResults_;
        private Diff syncResult_;
        private long timestamp_;
        private boolean upToDate_;
        private byte memoizedIsInitialized = 2;
        private phc revision_ = phc.b;
        private h290 resultingRevisions_ = h.emptyProtobufList();
        private e290 nonces_ = h.emptyLongList();
        private String ownerUsername_ = "";
        private b290 geoblock_ = h.emptyIntList();

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4ApiProto$SelectedListContent$1, reason: invalid class name */
        public class AnonymousClass1 implements c290 {
            /* JADX INFO: renamed from: convert, reason: merged with bridge method [inline-methods] */
            public final GeoblockBlockingType m769convert(int i) {
                GeoblockBlockingType geoblockBlockingTypeForNumber = GeoblockBlockingType.forNumber(i);
                return geoblockBlockingTypeForNumber == null ? GeoblockBlockingType.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED : geoblockBlockingTypeForNumber;
            }
        }

        static {
            SelectedListContent selectedListContent = new SelectedListContent();
            DEFAULT_INSTANCE = selectedListContent;
            h.registerDefaultInstance(SelectedListContent.class, selectedListContent);
        }

        private SelectedListContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGeoblock(Iterable<? extends GeoblockBlockingType> iterable) {
            ensureGeoblockIsMutable();
            for (GeoblockBlockingType geoblockBlockingType : iterable) {
                this.geoblock_.c(geoblockBlockingType.getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNonces(Iterable<? extends Long> iterable) {
            ensureNoncesIsMutable();
            s8.addAll(iterable, this.nonces_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResultingRevisions(Iterable<? extends phc> iterable) {
            ensureResultingRevisionsIsMutable();
            s8.addAll(iterable, this.resultingRevisions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeoblock(GeoblockBlockingType geoblockBlockingType) {
            geoblockBlockingType.getClass();
            ensureGeoblockIsMutable();
            this.geoblock_.c(geoblockBlockingType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNonces(long j) {
            ensureNoncesIsMutable();
            this.nonces_.c(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResultingRevisions(phc phcVar) {
            phcVar.getClass();
            ensureResultingRevisionsIsMutable();
            this.resultingRevisions_.add(phcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbuseReportingEnabled() {
            this.bitField0_ &= -1025;
            this.abuseReportingEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppliedLenses() {
            this.appliedLenses_ = null;
            this.bitField0_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = null;
            this.bitField0_ &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChangesRequireResync() {
            this.bitField0_ &= -4097;
            this.changesRequireResync_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContents() {
            this.contents_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreatedAt() {
            this.bitField0_ &= -8193;
            this.createdAt_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiff() {
            this.diff_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeoblock() {
            this.geoblock_ = h.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsUserCreated() {
            this.bitField0_ &= -32769;
            this.isUserCreated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            this.bitField0_ &= -3;
            this.length_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultipleHeads() {
            this.bitField0_ &= -65;
            this.multipleHeads_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNonces() {
            this.nonces_ = h.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUsername() {
            this.bitField0_ &= -513;
            this.ownerUsername_ = DEFAULT_INSTANCE.ownerUsername_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultingRevisions() {
            this.resultingRevisions_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevision() {
            this.bitField0_ &= -2;
            this.revision_ = DEFAULT_INSTANCE.revision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignalResults() {
            this.signalResults_ = null;
            this.bitField0_ &= -65537;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncResult() {
            this.syncResult_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.bitField0_ &= -257;
            this.timestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpToDate() {
            this.bitField0_ &= -129;
            this.upToDate_ = false;
        }

        private void ensureGeoblockIsMutable() {
            i9 i9Var = this.geoblock_;
            if (i9Var.a) {
                return;
            }
            this.geoblock_ = h.mutableCopy(i9Var);
        }

        private void ensureNoncesIsMutable() {
            i9 i9Var = this.nonces_;
            if (i9Var.a) {
                return;
            }
            this.nonces_ = h.mutableCopy(i9Var);
        }

        private void ensureResultingRevisionsIsMutable() {
            i9 i9Var = this.resultingRevisions_;
            if (i9Var.a) {
                return;
            }
            this.resultingRevisions_ = h.mutableCopy(i9Var);
        }

        public static SelectedListContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppliedLenses(AppliedLenses appliedLenses) {
            appliedLenses.getClass();
            AppliedLenses appliedLenses2 = this.appliedLenses_;
            if (appliedLenses2 == null || appliedLenses2 == AppliedLenses.getDefaultInstance()) {
                this.appliedLenses_ = appliedLenses;
            } else {
                this.appliedLenses_ = (AppliedLenses) ((AppliedLenses.Builder) AppliedLenses.newBuilder(this.appliedLenses_).mergeFrom(appliedLenses)).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAttributes(ListAttributes listAttributes) {
            listAttributes.getClass();
            ListAttributes listAttributes2 = this.attributes_;
            if (listAttributes2 == null || listAttributes2 == ListAttributes.getDefaultInstance()) {
                this.attributes_ = listAttributes;
            } else {
                this.attributes_ = (ListAttributes) ((ListAttributes.Builder) ListAttributes.newBuilder(this.attributes_).mergeFrom(listAttributes)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCapabilities(Capabilities capabilities) {
            capabilities.getClass();
            Capabilities capabilities2 = this.capabilities_;
            if (capabilities2 == null || capabilities2 == Capabilities.z()) {
                this.capabilities_ = capabilities;
            } else {
                this.capabilities_ = ((ald) Capabilities.C(this.capabilities_).mergeFrom(capabilities)).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeContents(ListItems listItems) {
            listItems.getClass();
            ListItems listItems2 = this.contents_;
            if (listItems2 == null || listItems2 == ListItems.getDefaultInstance()) {
                this.contents_ = listItems;
            } else {
                this.contents_ = (ListItems) ((ListItems.Builder) ListItems.newBuilder(this.contents_).mergeFrom(listItems)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiff(Diff diff) {
            diff.getClass();
            Diff diff2 = this.diff_;
            if (diff2 == null || diff2 == Diff.getDefaultInstance()) {
                this.diff_ = diff;
            } else {
                this.diff_ = (Diff) ((Diff.Builder) Diff.newBuilder(this.diff_).mergeFrom(diff)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSignalResults(SignalResult signalResult) {
            signalResult.getClass();
            SignalResult signalResult2 = this.signalResults_;
            if (signalResult2 == null || signalResult2 == SignalResult.getDefaultInstance()) {
                this.signalResults_ = signalResult;
            } else {
                this.signalResults_ = (SignalResult) ((SignalResult.Builder) SignalResult.newBuilder(this.signalResults_).mergeFrom(signalResult)).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSyncResult(Diff diff) {
            diff.getClass();
            Diff diff2 = this.syncResult_;
            if (diff2 == null || diff2 == Diff.getDefaultInstance()) {
                this.syncResult_ = diff;
            } else {
                this.syncResult_ = (Diff) ((Diff.Builder) Diff.newBuilder(this.syncResult_).mergeFrom(diff)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SelectedListContent parseDelimitedFrom(InputStream inputStream) {
            return (SelectedListContent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SelectedListContent parseFrom(ByteBuffer byteBuffer) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbuseReportingEnabled(boolean z) {
            this.bitField0_ |= 1024;
            this.abuseReportingEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppliedLenses(AppliedLenses appliedLenses) {
            appliedLenses.getClass();
            this.appliedLenses_ = appliedLenses;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(ListAttributes listAttributes) {
            listAttributes.getClass();
            this.attributes_ = listAttributes;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCapabilities(Capabilities capabilities) {
            capabilities.getClass();
            this.capabilities_ = capabilities;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChangesRequireResync(boolean z) {
            this.bitField0_ |= 4096;
            this.changesRequireResync_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContents(ListItems listItems) {
            listItems.getClass();
            this.contents_ = listItems;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreatedAt(long j) {
            this.bitField0_ |= 8192;
            this.createdAt_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiff(Diff diff) {
            diff.getClass();
            this.diff_ = diff;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeoblock(int i, GeoblockBlockingType geoblockBlockingType) {
            geoblockBlockingType.getClass();
            ensureGeoblockIsMutable();
            this.geoblock_.i(i, geoblockBlockingType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsUserCreated(boolean z) {
            this.bitField0_ |= 32768;
            this.isUserCreated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(int i) {
            this.bitField0_ |= 2;
            this.length_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultipleHeads(boolean z) {
            this.bitField0_ |= 64;
            this.multipleHeads_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNonces(int i, long j) {
            ensureNoncesIsMutable();
            t4f0 t4f0Var = this.nonces_;
            t4f0Var.b();
            t4f0Var.d(i);
            long[] jArr = t4f0Var.b;
            long j2 = jArr[i];
            jArr[i] = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUsername(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.ownerUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUsernameBytes(phc phcVar) {
            this.ownerUsername_ = phcVar.v();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultingRevisions(int i, phc phcVar) {
            phcVar.getClass();
            ensureResultingRevisionsIsMutable();
            this.resultingRevisions_.set(i, phcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.revision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignalResults(SignalResult signalResult) {
            signalResult.getClass();
            this.signalResults_ = signalResult;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncResult(Diff diff) {
            diff.getClass();
            this.syncResult_ = diff;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.bitField0_ |= 256;
            this.timestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpToDate(boolean z) {
            this.bitField0_ |= 128;
            this.upToDate_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    GeoblockBlockingType geoblockBlockingType = GeoblockBlockingType.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED;
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0003\u0003\u0001ည\u0000\u0002င\u0001\u0003ဉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\b\u001c\tဇ\u0006\nဇ\u0007\u000e\u0014\u000fဂ\b\u0010ဈ\t\u0011ဇ\n\u0012ဉ\u000b\u0013ࠞ\u0014ဇ\f\u0015ဂ\r\u0016ဉ\u000e\u0017ဇ\u000f\u0018ဉ\u0010", new Object[]{"bitField0_", "revision_", "length_", "attributes_", "contents_", "diff_", "syncResult_", "resultingRevisions_", "multipleHeads_", "upToDate_", "nonces_", "timestamp_", "ownerUsername_", "abuseReportingEnabled_", "capabilities_", "geoblock_", GeoblockBlockingType.GeoblockBlockingTypeVerifier.INSTANCE, "changesRequireResync_", "createdAt_", "appliedLenses_", "isUserCreated_", "signalResults_"});
                case 3:
                    return new SelectedListContent();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (SelectedListContent.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean getAbuseReportingEnabled() {
            return this.abuseReportingEnabled_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final AppliedLenses getAppliedLenses() {
            AppliedLenses appliedLenses = this.appliedLenses_;
            return appliedLenses == null ? AppliedLenses.getDefaultInstance() : appliedLenses;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final ListAttributes getAttributes() {
            ListAttributes listAttributes = this.attributes_;
            return listAttributes == null ? ListAttributes.getDefaultInstance() : listAttributes;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.z() : capabilities;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean getChangesRequireResync() {
            return this.changesRequireResync_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final ListItems getContents() {
            ListItems listItems = this.contents_;
            return listItems == null ? ListItems.getDefaultInstance() : listItems;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final long getCreatedAt() {
            return this.createdAt_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final Diff getDiff() {
            Diff diff = this.diff_;
            return diff == null ? Diff.getDefaultInstance() : diff;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final GeoblockBlockingType getGeoblock(int i) {
            GeoblockBlockingType geoblockBlockingTypeForNumber = GeoblockBlockingType.forNumber(this.geoblock_.e(i));
            return geoblockBlockingTypeForNumber == null ? GeoblockBlockingType.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED : geoblockBlockingTypeForNumber;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final int getGeoblockCount() {
            return this.geoblock_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final List<GeoblockBlockingType> getGeoblockList() {
            return new d290(this.geoblock_, geoblock_converter_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean getIsUserCreated() {
            return this.isUserCreated_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final int getLength() {
            return this.length_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean getMultipleHeads() {
            return this.multipleHeads_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final long getNonces(int i) {
            return this.nonces_.e(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final int getNoncesCount() {
            return this.nonces_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final List<Long> getNoncesList() {
            return this.nonces_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final String getOwnerUsername() {
            return this.ownerUsername_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final phc getOwnerUsernameBytes() {
            return phc.i(this.ownerUsername_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final phc getResultingRevisions(int i) {
            return (phc) this.resultingRevisions_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final int getResultingRevisionsCount() {
            return this.resultingRevisions_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final List<phc> getResultingRevisionsList() {
            return this.resultingRevisions_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final phc getRevision() {
            return this.revision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final SignalResult getSignalResults() {
            SignalResult signalResult = this.signalResults_;
            return signalResult == null ? SignalResult.getDefaultInstance() : signalResult;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final Diff getSyncResult() {
            Diff diff = this.syncResult_;
            return diff == null ? Diff.getDefaultInstance() : diff;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean getUpToDate() {
            return this.upToDate_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasAbuseReportingEnabled() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasAppliedLenses() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasAttributes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasCapabilities() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasChangesRequireResync() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasContents() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasCreatedAt() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasDiff() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasIsUserCreated() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasLength() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasMultipleHeads() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasOwnerUsername() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasSignalResults() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasSyncResult() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasTimestamp() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
        public final boolean hasUpToDate() {
            return (this.bitField0_ & 128) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements SelectedListContentOrBuilder {
            private Builder() {
                super(SelectedListContent.DEFAULT_INSTANCE);
            }

            public final Builder addAllGeoblock(Iterable<? extends GeoblockBlockingType> iterable) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).addAllGeoblock(iterable);
                return this;
            }

            public final Builder addAllNonces(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).addAllNonces(iterable);
                return this;
            }

            public final Builder addAllResultingRevisions(Iterable<? extends phc> iterable) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).addAllResultingRevisions(iterable);
                return this;
            }

            public final Builder addGeoblock(GeoblockBlockingType geoblockBlockingType) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).addGeoblock(geoblockBlockingType);
                return this;
            }

            public final Builder addNonces(long j) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).addNonces(j);
                return this;
            }

            public final Builder addResultingRevisions(phc phcVar) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).addResultingRevisions(phcVar);
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearAbuseReportingEnabled() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearAbuseReportingEnabled();
                return this;
            }

            public final Builder clearAppliedLenses() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearAppliedLenses();
                return this;
            }

            public final Builder clearAttributes() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearAttributes();
                return this;
            }

            public final Builder clearCapabilities() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearCapabilities();
                return this;
            }

            public final Builder clearChangesRequireResync() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearChangesRequireResync();
                return this;
            }

            public final Builder clearContents() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearContents();
                return this;
            }

            public final Builder clearCreatedAt() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearCreatedAt();
                return this;
            }

            public final Builder clearDiff() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearDiff();
                return this;
            }

            public final Builder clearGeoblock() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearGeoblock();
                return this;
            }

            public final Builder clearIsUserCreated() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearIsUserCreated();
                return this;
            }

            public final Builder clearLength() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearLength();
                return this;
            }

            public final Builder clearMultipleHeads() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearMultipleHeads();
                return this;
            }

            public final Builder clearNonces() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearNonces();
                return this;
            }

            public final Builder clearOwnerUsername() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearOwnerUsername();
                return this;
            }

            public final Builder clearResultingRevisions() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearResultingRevisions();
                return this;
            }

            public final Builder clearRevision() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearRevision();
                return this;
            }

            public final Builder clearSignalResults() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearSignalResults();
                return this;
            }

            public final Builder clearSyncResult() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearSyncResult();
                return this;
            }

            public final Builder clearTimestamp() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearTimestamp();
                return this;
            }

            public final Builder clearUpToDate() {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).clearUpToDate();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean getAbuseReportingEnabled() {
                return ((SelectedListContent) ((g) this).instance).getAbuseReportingEnabled();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final AppliedLenses getAppliedLenses() {
                return ((SelectedListContent) ((g) this).instance).getAppliedLenses();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final ListAttributes getAttributes() {
                return ((SelectedListContent) ((g) this).instance).getAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final Capabilities getCapabilities() {
                return ((SelectedListContent) ((g) this).instance).getCapabilities();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean getChangesRequireResync() {
                return ((SelectedListContent) ((g) this).instance).getChangesRequireResync();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final ListItems getContents() {
                return ((SelectedListContent) ((g) this).instance).getContents();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final long getCreatedAt() {
                return ((SelectedListContent) ((g) this).instance).getCreatedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final Diff getDiff() {
                return ((SelectedListContent) ((g) this).instance).getDiff();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final GeoblockBlockingType getGeoblock(int i) {
                return ((SelectedListContent) ((g) this).instance).getGeoblock(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final int getGeoblockCount() {
                return ((SelectedListContent) ((g) this).instance).getGeoblockCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final List<GeoblockBlockingType> getGeoblockList() {
                return ((SelectedListContent) ((g) this).instance).getGeoblockList();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean getIsUserCreated() {
                return ((SelectedListContent) ((g) this).instance).getIsUserCreated();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final int getLength() {
                return ((SelectedListContent) ((g) this).instance).getLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean getMultipleHeads() {
                return ((SelectedListContent) ((g) this).instance).getMultipleHeads();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final long getNonces(int i) {
                return ((SelectedListContent) ((g) this).instance).getNonces(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final int getNoncesCount() {
                return ((SelectedListContent) ((g) this).instance).getNoncesCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final List<Long> getNoncesList() {
                return Collections.unmodifiableList(((SelectedListContent) ((g) this).instance).getNoncesList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final String getOwnerUsername() {
                return ((SelectedListContent) ((g) this).instance).getOwnerUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final phc getOwnerUsernameBytes() {
                return ((SelectedListContent) ((g) this).instance).getOwnerUsernameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final phc getResultingRevisions(int i) {
                return ((SelectedListContent) ((g) this).instance).getResultingRevisions(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final int getResultingRevisionsCount() {
                return ((SelectedListContent) ((g) this).instance).getResultingRevisionsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final List<phc> getResultingRevisionsList() {
                return Collections.unmodifiableList(((SelectedListContent) ((g) this).instance).getResultingRevisionsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final phc getRevision() {
                return ((SelectedListContent) ((g) this).instance).getRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final SignalResult getSignalResults() {
                return ((SelectedListContent) ((g) this).instance).getSignalResults();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final Diff getSyncResult() {
                return ((SelectedListContent) ((g) this).instance).getSyncResult();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final long getTimestamp() {
                return ((SelectedListContent) ((g) this).instance).getTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean getUpToDate() {
                return ((SelectedListContent) ((g) this).instance).getUpToDate();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasAbuseReportingEnabled() {
                return ((SelectedListContent) ((g) this).instance).hasAbuseReportingEnabled();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasAppliedLenses() {
                return ((SelectedListContent) ((g) this).instance).hasAppliedLenses();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasAttributes() {
                return ((SelectedListContent) ((g) this).instance).hasAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasCapabilities() {
                return ((SelectedListContent) ((g) this).instance).hasCapabilities();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasChangesRequireResync() {
                return ((SelectedListContent) ((g) this).instance).hasChangesRequireResync();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasContents() {
                return ((SelectedListContent) ((g) this).instance).hasContents();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasCreatedAt() {
                return ((SelectedListContent) ((g) this).instance).hasCreatedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasDiff() {
                return ((SelectedListContent) ((g) this).instance).hasDiff();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasIsUserCreated() {
                return ((SelectedListContent) ((g) this).instance).hasIsUserCreated();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasLength() {
                return ((SelectedListContent) ((g) this).instance).hasLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasMultipleHeads() {
                return ((SelectedListContent) ((g) this).instance).hasMultipleHeads();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasOwnerUsername() {
                return ((SelectedListContent) ((g) this).instance).hasOwnerUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasRevision() {
                return ((SelectedListContent) ((g) this).instance).hasRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasSignalResults() {
                return ((SelectedListContent) ((g) this).instance).hasSignalResults();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasSyncResult() {
                return ((SelectedListContent) ((g) this).instance).hasSyncResult();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasTimestamp() {
                return ((SelectedListContent) ((g) this).instance).hasTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SelectedListContentOrBuilder
            public final boolean hasUpToDate() {
                return ((SelectedListContent) ((g) this).instance).hasUpToDate();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public final Builder mergeAppliedLenses(AppliedLenses appliedLenses) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeAppliedLenses(appliedLenses);
                return this;
            }

            public final Builder mergeAttributes(ListAttributes listAttributes) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeAttributes(listAttributes);
                return this;
            }

            public final Builder mergeCapabilities(Capabilities capabilities) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeCapabilities(capabilities);
                return this;
            }

            public final Builder mergeContents(ListItems listItems) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeContents(listItems);
                return this;
            }

            public final Builder mergeDiff(Diff diff) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeDiff(diff);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m772mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeSignalResults(SignalResult signalResult) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeSignalResults(signalResult);
                return this;
            }

            public final Builder mergeSyncResult(Diff diff) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).mergeSyncResult(diff);
                return this;
            }

            public final Builder setAbuseReportingEnabled(boolean z) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setAbuseReportingEnabled(z);
                return this;
            }

            public final Builder setAppliedLenses(AppliedLenses.Builder builder) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setAppliedLenses((AppliedLenses) builder.build());
                return this;
            }

            public final Builder setAttributes(ListAttributes.Builder builder) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setAttributes((ListAttributes) builder.build());
                return this;
            }

            public final Builder setCapabilities(ald aldVar) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setCapabilities(aldVar.build());
                return this;
            }

            public final Builder setChangesRequireResync(boolean z) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setChangesRequireResync(z);
                return this;
            }

            public final Builder setContents(ListItems.Builder builder) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setContents((ListItems) builder.build());
                return this;
            }

            public final Builder setCreatedAt(long j) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setCreatedAt(j);
                return this;
            }

            public final Builder setDiff(Diff.Builder builder) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setDiff((Diff) builder.build());
                return this;
            }

            public final Builder setGeoblock(int i, GeoblockBlockingType geoblockBlockingType) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setGeoblock(i, geoblockBlockingType);
                return this;
            }

            public final Builder setIsUserCreated(boolean z) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setIsUserCreated(z);
                return this;
            }

            public final Builder setLength(int i) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setLength(i);
                return this;
            }

            public final Builder setMultipleHeads(boolean z) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setMultipleHeads(z);
                return this;
            }

            public final Builder setNonces(int i, long j) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setNonces(i, j);
                return this;
            }

            public final Builder setOwnerUsername(String str) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setOwnerUsername(str);
                return this;
            }

            public final Builder setOwnerUsernameBytes(phc phcVar) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setOwnerUsernameBytes(phcVar);
                return this;
            }

            public final Builder setResultingRevisions(int i, phc phcVar) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setResultingRevisions(i, phcVar);
                return this;
            }

            public final Builder setRevision(phc phcVar) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setRevision(phcVar);
                return this;
            }

            public final Builder setSignalResults(SignalResult.Builder builder) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setSignalResults((SignalResult) builder.build());
                return this;
            }

            public final Builder setSyncResult(Diff.Builder builder) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setSyncResult((Diff) builder.build());
                return this;
            }

            public final Builder setTimestamp(long j) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setTimestamp(j);
                return this;
            }

            public final Builder setUpToDate(boolean z) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setUpToDate(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m771clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m773mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m770clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m774mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setAppliedLenses(AppliedLenses appliedLenses) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setAppliedLenses(appliedLenses);
                return this;
            }

            public final Builder setAttributes(ListAttributes listAttributes) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setAttributes(listAttributes);
                return this;
            }

            public final Builder setCapabilities(Capabilities capabilities) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setCapabilities(capabilities);
                return this;
            }

            public final Builder setContents(ListItems listItems) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setContents(listItems);
                return this;
            }

            public final Builder setDiff(Diff diff) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setDiff(diff);
                return this;
            }

            public final Builder setSignalResults(SignalResult signalResult) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setSignalResults(signalResult);
                return this;
            }

            public final Builder setSyncResult(Diff diff) {
                copyOnWrite();
                ((SelectedListContent) ((g) this).instance).setSyncResult(diff);
                return this;
            }
        }

        public static Builder newBuilder(SelectedListContent selectedListContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(selectedListContent);
        }

        public static SelectedListContent parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (SelectedListContent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SelectedListContent parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static SelectedListContent parseFrom(phc phcVar) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static SelectedListContent parseFrom(phc phcVar, uz00 uz00Var) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static SelectedListContent parseFrom(byte[] bArr) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SelectedListContent parseFrom(byte[] bArr, uz00 uz00Var) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static SelectedListContent parseFrom(InputStream inputStream) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SelectedListContent parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SelectedListContent parseFrom(lwg lwgVar) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static SelectedListContent parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (SelectedListContent) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class SignalResult extends h implements SignalResultOrBuilder {
        private static final SignalResult DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SIGNAL_STATUSES_FIELD_NUMBER = 1;
        private qng0 signalStatuses_ = qng0.b;

        public static final class SignalStatusesDefaultEntryHolder {
            static final dng0 defaultEntry = new dng0(kul1.g, "", kul1.i, SignalStatus.getDefaultInstance());

            private SignalStatusesDefaultEntryHolder() {
            }
        }

        static {
            SignalResult signalResult = new SignalResult();
            DEFAULT_INSTANCE = signalResult;
            h.registerDefaultInstance(SignalResult.class, signalResult);
        }

        private SignalResult() {
        }

        public static SignalResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, SignalStatus> getMutableSignalStatusesMap() {
            return internalGetMutableSignalStatuses();
        }

        private qng0 internalGetMutableSignalStatuses() {
            qng0 qng0Var = this.signalStatuses_;
            if (qng0Var.a) {
                return qng0Var;
            }
            qng0 qng0VarH = qng0Var.h();
            this.signalStatuses_ = qng0VarH;
            return qng0VarH;
        }

        private qng0 internalGetSignalStatuses() {
            return this.signalStatuses_;
        }

        public static qng0 n(SignalResult signalResult) {
            return signalResult.internalGetMutableSignalStatuses();
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SignalResult parseDelimitedFrom(InputStream inputStream) {
            return (SignalResult) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SignalResult parseFrom(ByteBuffer byteBuffer) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        public final boolean containsSignalStatuses(String str) {
            str.getClass();
            return this.signalStatuses_.containsKey(str);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"signalStatuses_", SignalStatusesDefaultEntryHolder.defaultEntry});
            }
            if (iOrdinal == 3) {
                return new SignalResult();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (SignalResult.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        @Deprecated
        public final Map<String, SignalStatus> getSignalStatuses() {
            return Collections.unmodifiableMap(this.signalStatuses_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        public final int getSignalStatusesCount() {
            return this.signalStatuses_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        public final Map<String, SignalStatus> getSignalStatusesMap() {
            return Collections.unmodifiableMap(this.signalStatuses_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        public final SignalStatus getSignalStatusesOrDefault(String str, SignalStatus signalStatus) {
            str.getClass();
            qng0 qng0Var = this.signalStatuses_;
            return qng0Var.containsKey(str) ? (SignalStatus) qng0Var.get(str) : signalStatus;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
        public final SignalStatus getSignalStatusesOrThrow(String str) {
            str.getClass();
            qng0 qng0Var = this.signalStatuses_;
            if (qng0Var.containsKey(str)) {
                return (SignalStatus) qng0Var.get(str);
            }
            bhn0.q();
            return null;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements SignalResultOrBuilder {
            private Builder() {
                super(SignalResult.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearSignalStatuses() {
                copyOnWrite();
                SignalResult.n((SignalResult) ((g) this).instance).clear();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            public final boolean containsSignalStatuses(String str) {
                str.getClass();
                return ((SignalResult) ((g) this).instance).getSignalStatusesMap().containsKey(str);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            @Deprecated
            public final Map<String, SignalStatus> getSignalStatuses() {
                return getSignalStatusesMap();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            public final int getSignalStatusesCount() {
                return ((SignalResult) ((g) this).instance).getSignalStatusesMap().size();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            public final Map<String, SignalStatus> getSignalStatusesMap() {
                return Collections.unmodifiableMap(((SignalResult) ((g) this).instance).getSignalStatusesMap());
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            public final SignalStatus getSignalStatusesOrDefault(String str, SignalStatus signalStatus) {
                str.getClass();
                Map<String, SignalStatus> signalStatusesMap = ((SignalResult) ((g) this).instance).getSignalStatusesMap();
                return signalStatusesMap.containsKey(str) ? signalStatusesMap.get(str) : signalStatus;
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalResultOrBuilder
            public final SignalStatus getSignalStatusesOrThrow(String str) {
                str.getClass();
                Map<String, SignalStatus> signalStatusesMap = ((SignalResult) ((g) this).instance).getSignalStatusesMap();
                if (signalStatusesMap.containsKey(str)) {
                    return signalStatusesMap.get(str);
                }
                bhn0.q();
                return null;
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m777mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder putAllSignalStatuses(Map<String, SignalStatus> map) {
                copyOnWrite();
                SignalResult.n((SignalResult) ((g) this).instance).putAll(map);
                return this;
            }

            public final Builder putSignalStatuses(String str, SignalStatus signalStatus) {
                str.getClass();
                signalStatus.getClass();
                copyOnWrite();
                SignalResult.n((SignalResult) ((g) this).instance).put(str, signalStatus);
                return this;
            }

            public final Builder removeSignalStatuses(String str) {
                str.getClass();
                copyOnWrite();
                SignalResult.n((SignalResult) ((g) this).instance).remove(str);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m776clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m778mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m775clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m779mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(SignalResult signalResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signalResult);
        }

        public static SignalResult parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (SignalResult) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SignalResult parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static SignalResult parseFrom(phc phcVar) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static SignalResult parseFrom(phc phcVar, uz00 uz00Var) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static SignalResult parseFrom(byte[] bArr) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SignalResult parseFrom(byte[] bArr, uz00 uz00Var) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static SignalResult parseFrom(InputStream inputStream) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SignalResult parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SignalResult parseFrom(lwg lwgVar) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static SignalResult parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (SignalResult) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class SignalStatus extends h implements SignalStatusOrBuilder {
        private static final SignalStatus DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int STATUS_CODE_FIELD_NUMBER = 1;
        public static final int STATUS_DETAILS_FIELD_NUMBER = 2;
        public static final int STATUS_PAYLOAD_FIELD_NUMBER = 3;
        private int bitField0_;
        private int statusCode_;
        private String statusDetails_ = "";
        private phc statusPayload_ = phc.b;

        static {
            SignalStatus signalStatus = new SignalStatus();
            DEFAULT_INSTANCE = signalStatus;
            h.registerDefaultInstance(SignalStatus.class, signalStatus);
        }

        private SignalStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusCode() {
            this.bitField0_ &= -2;
            this.statusCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusDetails() {
            this.bitField0_ &= -3;
            this.statusDetails_ = DEFAULT_INSTANCE.statusDetails_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPayload() {
            this.bitField0_ &= -5;
            this.statusPayload_ = DEFAULT_INSTANCE.statusPayload_;
        }

        public static SignalStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SignalStatus parseDelimitedFrom(InputStream inputStream) {
            return (SignalStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SignalStatus parseFrom(ByteBuffer byteBuffer) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusCode(int i) {
            this.bitField0_ |= 1;
            this.statusCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusDetails(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.statusDetails_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusDetailsBytes(phc phcVar) {
            this.statusDetails_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPayload(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 4;
            this.statusPayload_ = phcVar;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "statusCode_", "statusDetails_", "statusPayload_"});
            }
            if (iOrdinal == 3) {
                return new SignalStatus();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (SignalStatus.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final int getStatusCode() {
            return this.statusCode_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final String getStatusDetails() {
            return this.statusDetails_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final phc getStatusDetailsBytes() {
            return phc.i(this.statusDetails_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final phc getStatusPayload() {
            return this.statusPayload_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final boolean hasStatusCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final boolean hasStatusDetails() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
        public final boolean hasStatusPayload() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements SignalStatusOrBuilder {
            private Builder() {
                super(SignalStatus.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearStatusCode() {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).clearStatusCode();
                return this;
            }

            public final Builder clearStatusDetails() {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).clearStatusDetails();
                return this;
            }

            public final Builder clearStatusPayload() {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).clearStatusPayload();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final int getStatusCode() {
                return ((SignalStatus) ((g) this).instance).getStatusCode();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final String getStatusDetails() {
                return ((SignalStatus) ((g) this).instance).getStatusDetails();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final phc getStatusDetailsBytes() {
                return ((SignalStatus) ((g) this).instance).getStatusDetailsBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final phc getStatusPayload() {
                return ((SignalStatus) ((g) this).instance).getStatusPayload();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final boolean hasStatusCode() {
                return ((SignalStatus) ((g) this).instance).hasStatusCode();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final boolean hasStatusDetails() {
                return ((SignalStatus) ((g) this).instance).hasStatusDetails();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.SignalStatusOrBuilder
            public final boolean hasStatusPayload() {
                return ((SignalStatus) ((g) this).instance).hasStatusPayload();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m782mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setStatusCode(int i) {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).setStatusCode(i);
                return this;
            }

            public final Builder setStatusDetails(String str) {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).setStatusDetails(str);
                return this;
            }

            public final Builder setStatusDetailsBytes(phc phcVar) {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).setStatusDetailsBytes(phcVar);
                return this;
            }

            public final Builder setStatusPayload(phc phcVar) {
                copyOnWrite();
                ((SignalStatus) ((g) this).instance).setStatusPayload(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m781clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m783mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m780clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m784mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(SignalStatus signalStatus) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signalStatus);
        }

        public static SignalStatus parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (SignalStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SignalStatus parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static SignalStatus parseFrom(phc phcVar) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static SignalStatus parseFrom(phc phcVar, uz00 uz00Var) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static SignalStatus parseFrom(byte[] bArr) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SignalStatus parseFrom(byte[] bArr, uz00 uz00Var) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static SignalStatus parseFrom(InputStream inputStream) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SignalStatus parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SignalStatus parseFrom(lwg lwgVar) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static SignalStatus parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (SignalStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UnfollowedListItem extends h implements UnfollowedListItemOrBuilder {
        private static final UnfollowedListItem DEFAULT_INSTANCE;
        public static final int DELETED_AT_FIELD_NUMBER = 4;
        public static final int LENGTH_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int RECOVERABLE_FIELD_NUMBER = 2;
        public static final int URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private long deletedAt_;
        private int length_;
        private boolean recoverable_;
        private String uri_ = "";
        private String name_ = "";

        static {
            UnfollowedListItem unfollowedListItem = new UnfollowedListItem();
            DEFAULT_INSTANCE = unfollowedListItem;
            h.registerDefaultInstance(UnfollowedListItem.class, unfollowedListItem);
        }

        private UnfollowedListItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeletedAt() {
            this.bitField0_ &= -9;
            this.deletedAt_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            this.bitField0_ &= -17;
            this.length_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -5;
            this.name_ = DEFAULT_INSTANCE.name_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoverable() {
            this.bitField0_ &= -3;
            this.recoverable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUri() {
            this.bitField0_ &= -2;
            this.uri_ = DEFAULT_INSTANCE.uri_;
        }

        public static UnfollowedListItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnfollowedListItem parseDelimitedFrom(InputStream inputStream) {
            return (UnfollowedListItem) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnfollowedListItem parseFrom(ByteBuffer byteBuffer) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeletedAt(long j) {
            this.bitField0_ |= 8;
            this.deletedAt_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(int i) {
            this.bitField0_ |= 16;
            this.length_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(phc phcVar) {
            this.name_ = phcVar.v();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverable(boolean z) {
            this.bitField0_ |= 2;
            this.recoverable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUri(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriBytes(phc phcVar) {
            this.uri_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"bitField0_", "uri_", "recoverable_", "name_", "deletedAt_", "length_"});
            }
            if (iOrdinal == 3) {
                return new UnfollowedListItem();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (UnfollowedListItem.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final long getDeletedAt() {
            return this.deletedAt_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final int getLength() {
            return this.length_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final String getName() {
            return this.name_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final phc getNameBytes() {
            return phc.i(this.name_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final boolean getRecoverable() {
            return this.recoverable_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final String getUri() {
            return this.uri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final phc getUriBytes() {
            return phc.i(this.uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final boolean hasDeletedAt() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final boolean hasLength() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final boolean hasName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final boolean hasRecoverable() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
        public final boolean hasUri() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UnfollowedListItemOrBuilder {
            private Builder() {
                super(UnfollowedListItem.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearDeletedAt() {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).clearDeletedAt();
                return this;
            }

            public final Builder clearLength() {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).clearLength();
                return this;
            }

            public final Builder clearName() {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).clearName();
                return this;
            }

            public final Builder clearRecoverable() {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).clearRecoverable();
                return this;
            }

            public final Builder clearUri() {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).clearUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final long getDeletedAt() {
                return ((UnfollowedListItem) ((g) this).instance).getDeletedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final int getLength() {
                return ((UnfollowedListItem) ((g) this).instance).getLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final String getName() {
                return ((UnfollowedListItem) ((g) this).instance).getName();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final phc getNameBytes() {
                return ((UnfollowedListItem) ((g) this).instance).getNameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final boolean getRecoverable() {
                return ((UnfollowedListItem) ((g) this).instance).getRecoverable();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final String getUri() {
                return ((UnfollowedListItem) ((g) this).instance).getUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final phc getUriBytes() {
                return ((UnfollowedListItem) ((g) this).instance).getUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final boolean hasDeletedAt() {
                return ((UnfollowedListItem) ((g) this).instance).hasDeletedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final boolean hasLength() {
                return ((UnfollowedListItem) ((g) this).instance).hasLength();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final boolean hasName() {
                return ((UnfollowedListItem) ((g) this).instance).hasName();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final boolean hasRecoverable() {
                return ((UnfollowedListItem) ((g) this).instance).hasRecoverable();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UnfollowedListItemOrBuilder
            public final boolean hasUri() {
                return ((UnfollowedListItem) ((g) this).instance).hasUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m793mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setDeletedAt(long j) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setDeletedAt(j);
                return this;
            }

            public final Builder setLength(int i) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setLength(i);
                return this;
            }

            public final Builder setName(String str) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setName(str);
                return this;
            }

            public final Builder setNameBytes(phc phcVar) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setNameBytes(phcVar);
                return this;
            }

            public final Builder setRecoverable(boolean z) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setRecoverable(z);
                return this;
            }

            public final Builder setUri(String str) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setUri(str);
                return this;
            }

            public final Builder setUriBytes(phc phcVar) {
                copyOnWrite();
                ((UnfollowedListItem) ((g) this).instance).setUriBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m792clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m794mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m791clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m795mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(UnfollowedListItem unfollowedListItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unfollowedListItem);
        }

        public static UnfollowedListItem parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UnfollowedListItem) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UnfollowedListItem parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UnfollowedListItem parseFrom(phc phcVar) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UnfollowedListItem parseFrom(phc phcVar, uz00 uz00Var) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UnfollowedListItem parseFrom(byte[] bArr) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnfollowedListItem parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UnfollowedListItem parseFrom(InputStream inputStream) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnfollowedListItem parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UnfollowedListItem parseFrom(lwg lwgVar) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UnfollowedListItem parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UnfollowedListItem) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UpdateItemAttributes extends h implements UpdateItemAttributesOrBuilder {
        private static final UpdateItemAttributes DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int ITEM_FIELD_NUMBER = 4;
        public static final int NEW_ATTRIBUTES_FIELD_NUMBER = 2;
        public static final int OLD_ATTRIBUTES_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private int index_;
        private Item item_;
        private byte memoizedIsInitialized = 2;
        private ItemAttributesPartialState newAttributes_;
        private ItemAttributesPartialState oldAttributes_;

        static {
            UpdateItemAttributes updateItemAttributes = new UpdateItemAttributes();
            DEFAULT_INSTANCE = updateItemAttributes;
            h.registerDefaultInstance(UpdateItemAttributes.class, updateItemAttributes);
        }

        private UpdateItemAttributes() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItem() {
            this.item_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewAttributes() {
            this.newAttributes_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOldAttributes() {
            this.oldAttributes_ = null;
            this.bitField0_ &= -5;
        }

        public static UpdateItemAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeItem(Item item) {
            item.getClass();
            Item item2 = this.item_;
            if (item2 == null || item2 == Item.getDefaultInstance()) {
                this.item_ = item;
            } else {
                this.item_ = (Item) ((Item.Builder) Item.newBuilder(this.item_).mergeFrom(item)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNewAttributes(ItemAttributesPartialState itemAttributesPartialState) {
            itemAttributesPartialState.getClass();
            ItemAttributesPartialState itemAttributesPartialState2 = this.newAttributes_;
            if (itemAttributesPartialState2 == null || itemAttributesPartialState2 == ItemAttributesPartialState.getDefaultInstance()) {
                this.newAttributes_ = itemAttributesPartialState;
            } else {
                this.newAttributes_ = (ItemAttributesPartialState) ((ItemAttributesPartialState.Builder) ItemAttributesPartialState.newBuilder(this.newAttributes_).mergeFrom(itemAttributesPartialState)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOldAttributes(ItemAttributesPartialState itemAttributesPartialState) {
            itemAttributesPartialState.getClass();
            ItemAttributesPartialState itemAttributesPartialState2 = this.oldAttributes_;
            if (itemAttributesPartialState2 == null || itemAttributesPartialState2 == ItemAttributesPartialState.getDefaultInstance()) {
                this.oldAttributes_ = itemAttributesPartialState;
            } else {
                this.oldAttributes_ = (ItemAttributesPartialState) ((ItemAttributesPartialState.Builder) ItemAttributesPartialState.newBuilder(this.oldAttributes_).mergeFrom(itemAttributesPartialState)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateItemAttributes parseDelimitedFrom(InputStream inputStream) {
            return (UpdateItemAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateItemAttributes parseFrom(ByteBuffer byteBuffer) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.bitField0_ |= 1;
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItem(Item item) {
            item.getClass();
            this.item_ = item;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewAttributes(ItemAttributesPartialState itemAttributesPartialState) {
            itemAttributesPartialState.getClass();
            this.newAttributes_ = itemAttributesPartialState;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOldAttributes(ItemAttributesPartialState itemAttributesPartialState) {
            itemAttributesPartialState.getClass();
            this.oldAttributes_ = itemAttributesPartialState;
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001င\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"bitField0_", "index_", "newAttributes_", "oldAttributes_", "item_"});
                case 3:
                    return new UpdateItemAttributes();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (UpdateItemAttributes.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final int getIndex() {
            return this.index_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final Item getItem() {
            Item item = this.item_;
            return item == null ? Item.getDefaultInstance() : item;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final ItemAttributesPartialState getNewAttributes() {
            ItemAttributesPartialState itemAttributesPartialState = this.newAttributes_;
            return itemAttributesPartialState == null ? ItemAttributesPartialState.getDefaultInstance() : itemAttributesPartialState;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final ItemAttributesPartialState getOldAttributes() {
            ItemAttributesPartialState itemAttributesPartialState = this.oldAttributes_;
            return itemAttributesPartialState == null ? ItemAttributesPartialState.getDefaultInstance() : itemAttributesPartialState;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final boolean hasItem() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final boolean hasNewAttributes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
        public final boolean hasOldAttributes() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UpdateItemAttributesOrBuilder {
            private Builder() {
                super(UpdateItemAttributes.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearIndex() {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).clearIndex();
                return this;
            }

            public final Builder clearItem() {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).clearItem();
                return this;
            }

            public final Builder clearNewAttributes() {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).clearNewAttributes();
                return this;
            }

            public final Builder clearOldAttributes() {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).clearOldAttributes();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final int getIndex() {
                return ((UpdateItemAttributes) ((g) this).instance).getIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final Item getItem() {
                return ((UpdateItemAttributes) ((g) this).instance).getItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final ItemAttributesPartialState getNewAttributes() {
                return ((UpdateItemAttributes) ((g) this).instance).getNewAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final ItemAttributesPartialState getOldAttributes() {
                return ((UpdateItemAttributes) ((g) this).instance).getOldAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final boolean hasIndex() {
                return ((UpdateItemAttributes) ((g) this).instance).hasIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final boolean hasItem() {
                return ((UpdateItemAttributes) ((g) this).instance).hasItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final boolean hasNewAttributes() {
                return ((UpdateItemAttributes) ((g) this).instance).hasNewAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemAttributesOrBuilder
            public final boolean hasOldAttributes() {
                return ((UpdateItemAttributes) ((g) this).instance).hasOldAttributes();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m798mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeItem(Item item) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).mergeItem(item);
                return this;
            }

            public final Builder mergeNewAttributes(ItemAttributesPartialState itemAttributesPartialState) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).mergeNewAttributes(itemAttributesPartialState);
                return this;
            }

            public final Builder mergeOldAttributes(ItemAttributesPartialState itemAttributesPartialState) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).mergeOldAttributes(itemAttributesPartialState);
                return this;
            }

            public final Builder setIndex(int i) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setIndex(i);
                return this;
            }

            public final Builder setItem(Item.Builder builder) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setItem((Item) builder.build());
                return this;
            }

            public final Builder setNewAttributes(ItemAttributesPartialState.Builder builder) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setNewAttributes((ItemAttributesPartialState) builder.build());
                return this;
            }

            public final Builder setOldAttributes(ItemAttributesPartialState.Builder builder) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setOldAttributes((ItemAttributesPartialState) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m797clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m799mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m796clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m800mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setItem(Item item) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setItem(item);
                return this;
            }

            public final Builder setNewAttributes(ItemAttributesPartialState itemAttributesPartialState) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setNewAttributes(itemAttributesPartialState);
                return this;
            }

            public final Builder setOldAttributes(ItemAttributesPartialState itemAttributesPartialState) {
                copyOnWrite();
                ((UpdateItemAttributes) ((g) this).instance).setOldAttributes(itemAttributesPartialState);
                return this;
            }
        }

        public static Builder newBuilder(UpdateItemAttributes updateItemAttributes) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(updateItemAttributes);
        }

        public static UpdateItemAttributes parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UpdateItemAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UpdateItemAttributes parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UpdateItemAttributes parseFrom(phc phcVar) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UpdateItemAttributes parseFrom(phc phcVar, uz00 uz00Var) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UpdateItemAttributes parseFrom(byte[] bArr) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateItemAttributes parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UpdateItemAttributes parseFrom(InputStream inputStream) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateItemAttributes parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UpdateItemAttributes parseFrom(lwg lwgVar) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UpdateItemAttributes parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UpdateItemAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UpdateItemUris extends h implements UpdateItemUrisOrBuilder {
        private static final UpdateItemUris DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URI_REPLACEMENTS_FIELD_NUMBER = 1;
        private byte memoizedIsInitialized = 2;
        private h290 uriReplacements_ = h.emptyProtobufList();

        static {
            UpdateItemUris updateItemUris = new UpdateItemUris();
            DEFAULT_INSTANCE = updateItemUris;
            h.registerDefaultInstance(UpdateItemUris.class, updateItemUris);
        }

        private UpdateItemUris() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUriReplacements(Iterable<? extends UriReplacement> iterable) {
            ensureUriReplacementsIsMutable();
            s8.addAll(iterable, this.uriReplacements_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUriReplacements(UriReplacement uriReplacement) {
            uriReplacement.getClass();
            ensureUriReplacementsIsMutable();
            this.uriReplacements_.add(uriReplacement);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUriReplacements() {
            this.uriReplacements_ = h.emptyProtobufList();
        }

        private void ensureUriReplacementsIsMutable() {
            i9 i9Var = this.uriReplacements_;
            if (i9Var.a) {
                return;
            }
            this.uriReplacements_ = h.mutableCopy(i9Var);
        }

        public static UpdateItemUris getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateItemUris parseDelimitedFrom(InputStream inputStream) {
            return (UpdateItemUris) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateItemUris parseFrom(ByteBuffer byteBuffer) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUriReplacements(int i) {
            ensureUriReplacementsIsMutable();
            this.uriReplacements_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriReplacements(int i, UriReplacement uriReplacement) {
            uriReplacement.getClass();
            ensureUriReplacementsIsMutable();
            this.uriReplacements_.set(i, uriReplacement);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"uriReplacements_", UriReplacement.class});
                case 3:
                    return new UpdateItemUris();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (UpdateItemUris.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
        public final UriReplacement getUriReplacements(int i) {
            return (UriReplacement) this.uriReplacements_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
        public final int getUriReplacementsCount() {
            return this.uriReplacements_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
        public final List<UriReplacement> getUriReplacementsList() {
            return this.uriReplacements_;
        }

        public final UriReplacementOrBuilder getUriReplacementsOrBuilder(int i) {
            return (UriReplacementOrBuilder) this.uriReplacements_.get(i);
        }

        public final List<? extends UriReplacementOrBuilder> getUriReplacementsOrBuilderList() {
            return this.uriReplacements_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UpdateItemUrisOrBuilder {
            private Builder() {
                super(UpdateItemUris.DEFAULT_INSTANCE);
            }

            public final Builder addAllUriReplacements(Iterable<? extends UriReplacement> iterable) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).addAllUriReplacements(iterable);
                return this;
            }

            public final Builder addUriReplacements(UriReplacement.Builder builder) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).addUriReplacements((UriReplacement) builder.build());
                return this;
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearUriReplacements() {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).clearUriReplacements();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
            public final UriReplacement getUriReplacements(int i) {
                return ((UpdateItemUris) ((g) this).instance).getUriReplacements(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
            public final int getUriReplacementsCount() {
                return ((UpdateItemUris) ((g) this).instance).getUriReplacementsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateItemUrisOrBuilder
            public final List<UriReplacement> getUriReplacementsList() {
                return Collections.unmodifiableList(((UpdateItemUris) ((g) this).instance).getUriReplacementsList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m803mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeUriReplacements(int i) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).removeUriReplacements(i);
                return this;
            }

            public final Builder setUriReplacements(int i, UriReplacement.Builder builder) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).setUriReplacements(i, (UriReplacement) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m802clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m804mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m801clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m805mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final Builder addUriReplacements(int i, UriReplacement uriReplacement) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).addUriReplacements(i, uriReplacement);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setUriReplacements(int i, UriReplacement uriReplacement) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).setUriReplacements(i, uriReplacement);
                return this;
            }

            public final Builder addUriReplacements(UriReplacement uriReplacement) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).addUriReplacements(uriReplacement);
                return this;
            }

            public final Builder addUriReplacements(int i, UriReplacement.Builder builder) {
                copyOnWrite();
                ((UpdateItemUris) ((g) this).instance).addUriReplacements(i, (UriReplacement) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(UpdateItemUris updateItemUris) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(updateItemUris);
        }

        public static UpdateItemUris parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UpdateItemUris) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UpdateItemUris parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UpdateItemUris parseFrom(phc phcVar) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UpdateItemUris parseFrom(phc phcVar, uz00 uz00Var) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUriReplacements(int i, UriReplacement uriReplacement) {
            uriReplacement.getClass();
            ensureUriReplacementsIsMutable();
            this.uriReplacements_.add(i, uriReplacement);
        }

        public static UpdateItemUris parseFrom(byte[] bArr) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateItemUris parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UpdateItemUris parseFrom(InputStream inputStream) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateItemUris parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UpdateItemUris parseFrom(lwg lwgVar) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UpdateItemUris parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UpdateItemUris) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UpdateListAttributes extends h implements UpdateListAttributesOrBuilder {
        private static final UpdateListAttributes DEFAULT_INSTANCE;
        public static final int NEW_ATTRIBUTES_FIELD_NUMBER = 1;
        public static final int OLD_ATTRIBUTES_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private ListAttributesPartialState newAttributes_;
        private ListAttributesPartialState oldAttributes_;

        static {
            UpdateListAttributes updateListAttributes = new UpdateListAttributes();
            DEFAULT_INSTANCE = updateListAttributes;
            h.registerDefaultInstance(UpdateListAttributes.class, updateListAttributes);
        }

        private UpdateListAttributes() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewAttributes() {
            this.newAttributes_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOldAttributes() {
            this.oldAttributes_ = null;
            this.bitField0_ &= -3;
        }

        public static UpdateListAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNewAttributes(ListAttributesPartialState listAttributesPartialState) {
            listAttributesPartialState.getClass();
            ListAttributesPartialState listAttributesPartialState2 = this.newAttributes_;
            if (listAttributesPartialState2 == null || listAttributesPartialState2 == ListAttributesPartialState.getDefaultInstance()) {
                this.newAttributes_ = listAttributesPartialState;
            } else {
                this.newAttributes_ = (ListAttributesPartialState) ((ListAttributesPartialState.Builder) ListAttributesPartialState.newBuilder(this.newAttributes_).mergeFrom(listAttributesPartialState)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOldAttributes(ListAttributesPartialState listAttributesPartialState) {
            listAttributesPartialState.getClass();
            ListAttributesPartialState listAttributesPartialState2 = this.oldAttributes_;
            if (listAttributesPartialState2 == null || listAttributesPartialState2 == ListAttributesPartialState.getDefaultInstance()) {
                this.oldAttributes_ = listAttributesPartialState;
            } else {
                this.oldAttributes_ = (ListAttributesPartialState) ((ListAttributesPartialState.Builder) ListAttributesPartialState.newBuilder(this.oldAttributes_).mergeFrom(listAttributesPartialState)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateListAttributes parseDelimitedFrom(InputStream inputStream) {
            return (UpdateListAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateListAttributes parseFrom(ByteBuffer byteBuffer) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewAttributes(ListAttributesPartialState listAttributesPartialState) {
            listAttributesPartialState.getClass();
            this.newAttributes_ = listAttributesPartialState;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOldAttributes(ListAttributesPartialState listAttributesPartialState) {
            listAttributesPartialState.getClass();
            this.oldAttributes_ = listAttributesPartialState;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "newAttributes_", "oldAttributes_"});
                case 3:
                    return new UpdateListAttributes();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (UpdateListAttributes.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
        public final ListAttributesPartialState getNewAttributes() {
            ListAttributesPartialState listAttributesPartialState = this.newAttributes_;
            return listAttributesPartialState == null ? ListAttributesPartialState.getDefaultInstance() : listAttributesPartialState;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
        public final ListAttributesPartialState getOldAttributes() {
            ListAttributesPartialState listAttributesPartialState = this.oldAttributes_;
            return listAttributesPartialState == null ? ListAttributesPartialState.getDefaultInstance() : listAttributesPartialState;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
        public final boolean hasNewAttributes() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
        public final boolean hasOldAttributes() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UpdateListAttributesOrBuilder {
            private Builder() {
                super(UpdateListAttributes.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearNewAttributes() {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).clearNewAttributes();
                return this;
            }

            public final Builder clearOldAttributes() {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).clearOldAttributes();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
            public final ListAttributesPartialState getNewAttributes() {
                return ((UpdateListAttributes) ((g) this).instance).getNewAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
            public final ListAttributesPartialState getOldAttributes() {
                return ((UpdateListAttributes) ((g) this).instance).getOldAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
            public final boolean hasNewAttributes() {
                return ((UpdateListAttributes) ((g) this).instance).hasNewAttributes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UpdateListAttributesOrBuilder
            public final boolean hasOldAttributes() {
                return ((UpdateListAttributes) ((g) this).instance).hasOldAttributes();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m808mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeNewAttributes(ListAttributesPartialState listAttributesPartialState) {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).mergeNewAttributes(listAttributesPartialState);
                return this;
            }

            public final Builder mergeOldAttributes(ListAttributesPartialState listAttributesPartialState) {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).mergeOldAttributes(listAttributesPartialState);
                return this;
            }

            public final Builder setNewAttributes(ListAttributesPartialState.Builder builder) {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).setNewAttributes((ListAttributesPartialState) builder.build());
                return this;
            }

            public final Builder setOldAttributes(ListAttributesPartialState.Builder builder) {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).setOldAttributes((ListAttributesPartialState) builder.build());
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m807clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m809mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m806clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m810mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setNewAttributes(ListAttributesPartialState listAttributesPartialState) {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).setNewAttributes(listAttributesPartialState);
                return this;
            }

            public final Builder setOldAttributes(ListAttributesPartialState listAttributesPartialState) {
                copyOnWrite();
                ((UpdateListAttributes) ((g) this).instance).setOldAttributes(listAttributesPartialState);
                return this;
            }
        }

        public static Builder newBuilder(UpdateListAttributes updateListAttributes) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(updateListAttributes);
        }

        public static UpdateListAttributes parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UpdateListAttributes) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UpdateListAttributes parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UpdateListAttributes parseFrom(phc phcVar) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UpdateListAttributes parseFrom(phc phcVar, uz00 uz00Var) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UpdateListAttributes parseFrom(byte[] bArr) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateListAttributes parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UpdateListAttributes parseFrom(InputStream inputStream) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateListAttributes parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UpdateListAttributes parseFrom(lwg lwgVar) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UpdateListAttributes parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UpdateListAttributes) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UriReplacement extends h implements UriReplacementOrBuilder {
        private static final UriReplacement DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int ITEM_FIELD_NUMBER = 2;
        public static final int NEW_URI_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private int index_;
        private Item item_;
        private byte memoizedIsInitialized = 2;
        private String newUri_ = "";

        static {
            UriReplacement uriReplacement = new UriReplacement();
            DEFAULT_INSTANCE = uriReplacement;
            h.registerDefaultInstance(UriReplacement.class, uriReplacement);
        }

        private UriReplacement() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItem() {
            this.item_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewUri() {
            this.bitField0_ &= -5;
            this.newUri_ = DEFAULT_INSTANCE.newUri_;
        }

        public static UriReplacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeItem(Item item) {
            item.getClass();
            Item item2 = this.item_;
            if (item2 == null || item2 == Item.getDefaultInstance()) {
                this.item_ = item;
            } else {
                this.item_ = (Item) ((Item.Builder) Item.newBuilder(this.item_).mergeFrom(item)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UriReplacement parseDelimitedFrom(InputStream inputStream) {
            return (UriReplacement) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UriReplacement parseFrom(ByteBuffer byteBuffer) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.bitField0_ |= 1;
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItem(Item item) {
            item.getClass();
            this.item_ = item;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewUri(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.newUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewUriBytes(phc phcVar) {
            this.newUri_ = phcVar.v();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "index_", "item_", "newUri_"});
                case 3:
                    return new UriReplacement();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (UriReplacement.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final int getIndex() {
            return this.index_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final Item getItem() {
            Item item = this.item_;
            return item == null ? Item.getDefaultInstance() : item;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final String getNewUri() {
            return this.newUri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final phc getNewUriBytes() {
            return phc.i(this.newUri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final boolean hasItem() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
        public final boolean hasNewUri() {
            return (this.bitField0_ & 4) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UriReplacementOrBuilder {
            private Builder() {
                super(UriReplacement.DEFAULT_INSTANCE);
            }

            public final /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public final /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public final Builder clearIndex() {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).clearIndex();
                return this;
            }

            public final Builder clearItem() {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).clearItem();
                return this;
            }

            public final Builder clearNewUri() {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).clearNewUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final int getIndex() {
                return ((UriReplacement) ((g) this).instance).getIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final Item getItem() {
                return ((UriReplacement) ((g) this).instance).getItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final String getNewUri() {
                return ((UriReplacement) ((g) this).instance).getNewUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final phc getNewUriBytes() {
                return ((UriReplacement) ((g) this).instance).getNewUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final boolean hasIndex() {
                return ((UriReplacement) ((g) this).instance).hasIndex();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final boolean hasItem() {
                return ((UriReplacement) ((g) this).instance).hasItem();
            }

            @Override // com.spotify.playlist4.proto.Playlist4ApiProto.UriReplacementOrBuilder
            public final boolean hasNewUri() {
                return ((UriReplacement) ((g) this).instance).hasNewUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m813mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeItem(Item item) {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).mergeItem(item);
                return this;
            }

            public final Builder setIndex(int i) {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).setIndex(i);
                return this;
            }

            public final Builder setItem(Item.Builder builder) {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).setItem((Item) builder.build());
                return this;
            }

            public final Builder setNewUri(String str) {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).setNewUri(str);
                return this;
            }

            public final Builder setNewUriBytes(phc phcVar) {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).setNewUriBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m812clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m814mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m811clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m815mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setItem(Item item) {
                copyOnWrite();
                ((UriReplacement) ((g) this).instance).setItem(item);
                return this;
            }
        }

        public static Builder newBuilder(UriReplacement uriReplacement) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(uriReplacement);
        }

        public static UriReplacement parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UriReplacement) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UriReplacement parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UriReplacement parseFrom(phc phcVar) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UriReplacement parseFrom(phc phcVar, uz00 uz00Var) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UriReplacement parseFrom(byte[] bArr) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UriReplacement parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UriReplacement parseFrom(InputStream inputStream) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UriReplacement parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UriReplacement parseFrom(lwg lwgVar) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UriReplacement parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UriReplacement) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static void registerAllExtensions(uz00 uz00Var) {
    }
}
