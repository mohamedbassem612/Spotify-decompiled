package com.spotify.playlist4.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.hhg1;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v190;
import p.v2j0;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistSyncReasonProto {

    /* JADX INFO: renamed from: com.spotify.playlist4.proto.PlaylistSyncReasonProto$1, reason: invalid class name */
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

    public interface PlaylistSyncReasonOrBuilder extends v2j0 {
        PlaylistSyncCaller getCaller();

        int getCallerValue();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        boolean getPrioritized();

        /* synthetic */ boolean isInitialized();
    }

    private PlaylistSyncReasonProto() {
    }

    public enum PlaylistSyncCaller implements v190 {
        UNKNOWN(0),
        ESPERANTO(1),
        REMOTE(2),
        ROOTLIST(3),
        OFFLINE(4),
        RELOGIN(5),
        RECENTLY_PLAYED(6),
        PERMISSIONS(7),
        PLAYBACK(8),
        LOCAL_CHANGES(9),
        TEST(10),
        FULL_RESET(11),
        SYNC_POLICY(12),
        USER_INTERACTION(13),
        REVERSE_INDEX_BUILDER(14),
        SIGNAL(15),
        APPLY_LENSES(16),
        YOUR_LIBRARY_TAGS(17),
        PLAYER_CONTEXT_UPDATE(18),
        CURATION_STATE(19),
        EPISODE_LIST_LOADER(20),
        AUDIOBOOK_SEQUENCE_PROVIDER(21),
        COLLECTION_DECORATE_REQUEST(22),
        COLLECTION_GET_UNPLAYED_EPISODES_REQUEST(23),
        COLLECTION_SHOW_OFFLINE_CONTROLLER(24),
        EPISODE_PUBLISH_DATE_INDEX_WRITE_HOOK(25),
        PODCAST_PAYWALLS(26),
        SHOW_ACCESS_SUBSCRIBER(27),
        SHOW_CONTEXT_LOADER(28),
        SHOW_COSMOS_DECORATE_REQUEST(29),
        SHOW_COSMOS_MARK_AS_PLAYED(30),
        SHOW_COSMOS_SHOW_REQUEST(31),
        YOUR_LIBRARY_CLEANUP_SUGGESTIONS_HACK(32),
        YOUR_EPISODES_LOCAL_STATE_UPDATER(33),
        TAG_PLAYLIST_GENERATOR(34),
        YOUR_LIBRARY(35),
        RESUMPTION_PROGRESS(36),
        SAVED_ALBUMS(37),
        DSA_STATE_CHANGE(38),
        SHOW_RESUME_EPISODE_PROVIDER(39),
        AUTOPLAY_LENS_OBSERVER(40),
        LIST_PLAYER_DECORATOR(41),
        LIST_PLAYER_PLAY_REQUEST_ADAPTER(42),
        PREDEFINED_LISTS(43),
        JAM_LENS_MANAGER(44),
        LIST_PLAYER_QUEUED_ITEMS_FILTER(45),
        LIST_PLAYER_REC_POOL_FILTER(46),
        VOLATILE_CONTEXT(47),
        MULTIGET_ADDITIONAL_RESPONSE(48),
        TRACK_LIST_FACTORY(49),
        LIST_PLAYER_KEEP_PLAYING_FILTER(50),
        LIST_CLIENT(51),
        INTERACTIVE_PLAY_SOURCE(52),
        LIST_PLAYER_RESOLVED_LIST(53),
        UNRECOGNIZED(-1);

        public static final int APPLY_LENSES_VALUE = 16;
        public static final int AUDIOBOOK_SEQUENCE_PROVIDER_VALUE = 21;
        public static final int AUTOPLAY_LENS_OBSERVER_VALUE = 40;
        public static final int COLLECTION_DECORATE_REQUEST_VALUE = 22;
        public static final int COLLECTION_GET_UNPLAYED_EPISODES_REQUEST_VALUE = 23;
        public static final int COLLECTION_SHOW_OFFLINE_CONTROLLER_VALUE = 24;
        public static final int CURATION_STATE_VALUE = 19;
        public static final int DSA_STATE_CHANGE_VALUE = 38;
        public static final int EPISODE_LIST_LOADER_VALUE = 20;
        public static final int EPISODE_PUBLISH_DATE_INDEX_WRITE_HOOK_VALUE = 25;
        public static final int ESPERANTO_VALUE = 1;
        public static final int FULL_RESET_VALUE = 11;
        public static final int INTERACTIVE_PLAY_SOURCE_VALUE = 52;
        public static final int JAM_LENS_MANAGER_VALUE = 44;
        public static final int LIST_CLIENT_VALUE = 51;
        public static final int LIST_PLAYER_DECORATOR_VALUE = 41;
        public static final int LIST_PLAYER_KEEP_PLAYING_FILTER_VALUE = 50;
        public static final int LIST_PLAYER_PLAY_REQUEST_ADAPTER_VALUE = 42;
        public static final int LIST_PLAYER_QUEUED_ITEMS_FILTER_VALUE = 45;
        public static final int LIST_PLAYER_REC_POOL_FILTER_VALUE = 46;
        public static final int LIST_PLAYER_RESOLVED_LIST_VALUE = 53;
        public static final int LOCAL_CHANGES_VALUE = 9;
        public static final int MULTIGET_ADDITIONAL_RESPONSE_VALUE = 48;
        public static final int OFFLINE_VALUE = 4;
        public static final int PERMISSIONS_VALUE = 7;
        public static final int PLAYBACK_VALUE = 8;
        public static final int PLAYER_CONTEXT_UPDATE_VALUE = 18;
        public static final int PODCAST_PAYWALLS_VALUE = 26;
        public static final int PREDEFINED_LISTS_VALUE = 43;
        public static final int RECENTLY_PLAYED_VALUE = 6;
        public static final int RELOGIN_VALUE = 5;
        public static final int REMOTE_VALUE = 2;
        public static final int RESUMPTION_PROGRESS_VALUE = 36;
        public static final int REVERSE_INDEX_BUILDER_VALUE = 14;
        public static final int ROOTLIST_VALUE = 3;
        public static final int SAVED_ALBUMS_VALUE = 37;
        public static final int SHOW_ACCESS_SUBSCRIBER_VALUE = 27;
        public static final int SHOW_CONTEXT_LOADER_VALUE = 28;
        public static final int SHOW_COSMOS_DECORATE_REQUEST_VALUE = 29;
        public static final int SHOW_COSMOS_MARK_AS_PLAYED_VALUE = 30;
        public static final int SHOW_COSMOS_SHOW_REQUEST_VALUE = 31;
        public static final int SHOW_RESUME_EPISODE_PROVIDER_VALUE = 39;
        public static final int SIGNAL_VALUE = 15;
        public static final int SYNC_POLICY_VALUE = 12;
        public static final int TAG_PLAYLIST_GENERATOR_VALUE = 34;
        public static final int TEST_VALUE = 10;
        public static final int TRACK_LIST_FACTORY_VALUE = 49;
        public static final int UNKNOWN_VALUE = 0;
        public static final int USER_INTERACTION_VALUE = 13;
        public static final int VOLATILE_CONTEXT_VALUE = 47;
        public static final int YOUR_EPISODES_LOCAL_STATE_UPDATER_VALUE = 33;
        public static final int YOUR_LIBRARY_CLEANUP_SUGGESTIONS_HACK_VALUE = 32;
        public static final int YOUR_LIBRARY_TAGS_VALUE = 17;
        public static final int YOUR_LIBRARY_VALUE = 35;
        private static final y190 internalValueMap = new AnonymousClass1();
        private final int value;

        public static final class PlaylistSyncCallerVerifier implements z190 {
            static final z190 INSTANCE = new PlaylistSyncCallerVerifier();

            private PlaylistSyncCallerVerifier() {
            }

            public final boolean isInRange(int i) {
                return PlaylistSyncCaller.forNumber(i) != null;
            }
        }

        PlaylistSyncCaller(int i) {
            this.value = i;
        }

        public static PlaylistSyncCaller forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ESPERANTO;
                case 2:
                    return REMOTE;
                case 3:
                    return ROOTLIST;
                case 4:
                    return OFFLINE;
                case 5:
                    return RELOGIN;
                case 6:
                    return RECENTLY_PLAYED;
                case 7:
                    return PERMISSIONS;
                case 8:
                    return PLAYBACK;
                case 9:
                    return LOCAL_CHANGES;
                case 10:
                    return TEST;
                case 11:
                    return FULL_RESET;
                case 12:
                    return SYNC_POLICY;
                case 13:
                    return USER_INTERACTION;
                case 14:
                    return REVERSE_INDEX_BUILDER;
                case 15:
                    return SIGNAL;
                case 16:
                    return APPLY_LENSES;
                case 17:
                    return YOUR_LIBRARY_TAGS;
                case 18:
                    return PLAYER_CONTEXT_UPDATE;
                case 19:
                    return CURATION_STATE;
                case 20:
                    return EPISODE_LIST_LOADER;
                case 21:
                    return AUDIOBOOK_SEQUENCE_PROVIDER;
                case 22:
                    return COLLECTION_DECORATE_REQUEST;
                case 23:
                    return COLLECTION_GET_UNPLAYED_EPISODES_REQUEST;
                case 24:
                    return COLLECTION_SHOW_OFFLINE_CONTROLLER;
                case 25:
                    return EPISODE_PUBLISH_DATE_INDEX_WRITE_HOOK;
                case 26:
                    return PODCAST_PAYWALLS;
                case 27:
                    return SHOW_ACCESS_SUBSCRIBER;
                case 28:
                    return SHOW_CONTEXT_LOADER;
                case 29:
                    return SHOW_COSMOS_DECORATE_REQUEST;
                case 30:
                    return SHOW_COSMOS_MARK_AS_PLAYED;
                case SHOW_COSMOS_SHOW_REQUEST_VALUE:
                    return SHOW_COSMOS_SHOW_REQUEST;
                case 32:
                    return YOUR_LIBRARY_CLEANUP_SUGGESTIONS_HACK;
                case 33:
                    return YOUR_EPISODES_LOCAL_STATE_UPDATER;
                case 34:
                    return TAG_PLAYLIST_GENERATOR;
                case 35:
                    return YOUR_LIBRARY;
                case 36:
                    return RESUMPTION_PROGRESS;
                case SAVED_ALBUMS_VALUE:
                    return SAVED_ALBUMS;
                case DSA_STATE_CHANGE_VALUE:
                    return DSA_STATE_CHANGE;
                case SHOW_RESUME_EPISODE_PROVIDER_VALUE:
                    return SHOW_RESUME_EPISODE_PROVIDER;
                case AUTOPLAY_LENS_OBSERVER_VALUE:
                    return AUTOPLAY_LENS_OBSERVER;
                case LIST_PLAYER_DECORATOR_VALUE:
                    return LIST_PLAYER_DECORATOR;
                case LIST_PLAYER_PLAY_REQUEST_ADAPTER_VALUE:
                    return LIST_PLAYER_PLAY_REQUEST_ADAPTER;
                case PREDEFINED_LISTS_VALUE:
                    return PREDEFINED_LISTS;
                case JAM_LENS_MANAGER_VALUE:
                    return JAM_LENS_MANAGER;
                case LIST_PLAYER_QUEUED_ITEMS_FILTER_VALUE:
                    return LIST_PLAYER_QUEUED_ITEMS_FILTER;
                case LIST_PLAYER_REC_POOL_FILTER_VALUE:
                    return LIST_PLAYER_REC_POOL_FILTER;
                case VOLATILE_CONTEXT_VALUE:
                    return VOLATILE_CONTEXT;
                case MULTIGET_ADDITIONAL_RESPONSE_VALUE:
                    return MULTIGET_ADDITIONAL_RESPONSE;
                case TRACK_LIST_FACTORY_VALUE:
                    return TRACK_LIST_FACTORY;
                case LIST_PLAYER_KEEP_PLAYING_FILTER_VALUE:
                    return LIST_PLAYER_KEEP_PLAYING_FILTER;
                case LIST_CLIENT_VALUE:
                    return LIST_CLIENT;
                case INTERACTIVE_PLAY_SOURCE_VALUE:
                    return INTERACTIVE_PLAY_SOURCE;
                case LIST_PLAYER_RESOLVED_LIST_VALUE:
                    return LIST_PLAYER_RESOLVED_LIST;
                default:
                    return null;
            }
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return PlaylistSyncCallerVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            hhg1.n("Can't get the number of an unknown enum value.");
            return 0;
        }

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.PlaylistSyncReasonProto$PlaylistSyncCaller$1, reason: invalid class name */
        public class AnonymousClass1 implements y190 {
            public final PlaylistSyncCaller findValueByNumber(int i) {
                return PlaylistSyncCaller.forNumber(i);
            }

            /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
            public final v190 m846findValueByNumber(int i) {
                return PlaylistSyncCaller.forNumber(i);
            }
        }

        @Deprecated
        public static PlaylistSyncCaller valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class PlaylistSyncReason extends h implements PlaylistSyncReasonOrBuilder {
        public static final int CALLER_FIELD_NUMBER = 1;
        private static final PlaylistSyncReason DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PRIORITIZED_FIELD_NUMBER = 2;
        private int caller_;
        private boolean prioritized_;

        static {
            PlaylistSyncReason playlistSyncReason = new PlaylistSyncReason();
            DEFAULT_INSTANCE = playlistSyncReason;
            h.registerDefaultInstance(PlaylistSyncReason.class, playlistSyncReason);
        }

        private PlaylistSyncReason() {
        }

        private void clearCaller() {
            this.caller_ = 0;
        }

        private void clearPrioritized() {
            this.prioritized_ = false;
        }

        public static PlaylistSyncReason getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static void n(PlaylistSyncReason playlistSyncReason) {
            playlistSyncReason.caller_ = 0;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static void o(PlaylistSyncReason playlistSyncReason) {
            playlistSyncReason.prioritized_ = false;
        }

        public static PlaylistSyncReason parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistSyncReason) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistSyncReason parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static void q(PlaylistSyncReason playlistSyncReason, int i) {
            playlistSyncReason.caller_ = i;
        }

        public static void r(PlaylistSyncReason playlistSyncReason, boolean z) {
            playlistSyncReason.prioritized_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaller(PlaylistSyncCaller playlistSyncCaller) {
            this.caller_ = playlistSyncCaller.getNumber();
        }

        private void setCallerValue(int i) {
            this.caller_ = i;
        }

        private void setPrioritized(boolean z) {
            this.prioritized_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"caller_", "prioritized_"});
            }
            if (iOrdinal == 3) {
                return new PlaylistSyncReason();
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
            synchronized (PlaylistSyncReason.class) {
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

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final PlaylistSyncCaller getCaller() {
            PlaylistSyncCaller playlistSyncCallerForNumber = PlaylistSyncCaller.forNumber(this.caller_);
            return playlistSyncCallerForNumber == null ? PlaylistSyncCaller.UNRECOGNIZED : playlistSyncCallerForNumber;
        }

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final int getCallerValue() {
            return this.caller_;
        }

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final boolean getPrioritized() {
            return this.prioritized_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaylistSyncReasonOrBuilder {
            private Builder() {
                super(PlaylistSyncReason.DEFAULT_INSTANCE);
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

            public final Builder clearCaller() {
                copyOnWrite();
                PlaylistSyncReason.n((PlaylistSyncReason) ((g) this).instance);
                return this;
            }

            public final Builder clearPrioritized() {
                copyOnWrite();
                PlaylistSyncReason.o((PlaylistSyncReason) ((g) this).instance);
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final PlaylistSyncCaller getCaller() {
                return ((PlaylistSyncReason) ((g) this).instance).getCaller();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final int getCallerValue() {
                return ((PlaylistSyncReason) ((g) this).instance).getCallerValue();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final boolean getPrioritized() {
                return ((PlaylistSyncReason) ((g) this).instance).getPrioritized();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m849mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setCaller(PlaylistSyncCaller playlistSyncCaller) {
                copyOnWrite();
                ((PlaylistSyncReason) ((g) this).instance).setCaller(playlistSyncCaller);
                return this;
            }

            public final Builder setCallerValue(int i) {
                copyOnWrite();
                PlaylistSyncReason.q((PlaylistSyncReason) ((g) this).instance, i);
                return this;
            }

            public final Builder setPrioritized(boolean z) {
                copyOnWrite();
                PlaylistSyncReason.r((PlaylistSyncReason) ((g) this).instance, z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m848clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m850mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m847clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m851mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(PlaylistSyncReason playlistSyncReason) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistSyncReason);
        }

        public static PlaylistSyncReason parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistSyncReason) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistSyncReason parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PlaylistSyncReason parseFrom(phc phcVar) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PlaylistSyncReason parseFrom(phc phcVar, uz00 uz00Var) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static PlaylistSyncReason parseFrom(byte[] bArr) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistSyncReason parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PlaylistSyncReason parseFrom(InputStream inputStream) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistSyncReason parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistSyncReason parseFrom(lwg lwgVar) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PlaylistSyncReason parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PlaylistSyncReason) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static void registerAllExtensions(uz00 uz00Var) {
    }
}
