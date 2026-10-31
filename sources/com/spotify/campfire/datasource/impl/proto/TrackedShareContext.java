package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TrackedShareContext extends h implements TrackedShareContextOrBuilder {
    private static final TrackedShareContext DEFAULT_INSTANCE;
    public static final int LISTENING_ACTIVITY_FIELD_NUMBER = 1;
    public static final int LISTENING_STATS_INTERACTION_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_INVITATION_FIELD_NUMBER = 5;
    public static final int PLAYLIST_MESSAGE_FIELD_NUMBER = 4;
    public static final int PLAYLIST_REACTION_FIELD_NUMBER = 2;
    public static final int PLAYLIST_REPLY_FIELD_NUMBER = 3;
    private int typeCase_ = 0;
    private Object type_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.TrackedShareContext$1, reason: invalid class name */
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

    static {
        TrackedShareContext trackedShareContext = new TrackedShareContext();
        DEFAULT_INSTANCE = trackedShareContext;
        h.registerDefaultInstance(TrackedShareContext.class, trackedShareContext);
    }

    private TrackedShareContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListeningActivity() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListeningStatsInteraction() {
        if (this.typeCase_ == 7) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistInvitation() {
        if (this.typeCase_ == 5) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistMessage() {
        if (this.typeCase_ == 4) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistReaction() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistReply() {
        if (this.typeCase_ == 3) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    public static TrackedShareContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListeningActivity(ListeningActivity listeningActivity) {
        listeningActivity.getClass();
        if (this.typeCase_ != 1 || this.type_ == ListeningActivity.getDefaultInstance()) {
            this.type_ = listeningActivity;
        } else {
            this.type_ = ((ListeningActivity.Builder) ListeningActivity.newBuilder((ListeningActivity) this.type_).mergeFrom(listeningActivity)).buildPartial();
        }
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListeningStatsInteraction(ListeningStatsInteraction listeningStatsInteraction) {
        listeningStatsInteraction.getClass();
        if (this.typeCase_ != 7 || this.type_ == ListeningStatsInteraction.getDefaultInstance()) {
            this.type_ = listeningStatsInteraction;
        } else {
            this.type_ = ((ListeningStatsInteraction.Builder) ListeningStatsInteraction.newBuilder((ListeningStatsInteraction) this.type_).mergeFrom(listeningStatsInteraction)).buildPartial();
        }
        this.typeCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistInvitation(PlaylistInvitation playlistInvitation) {
        playlistInvitation.getClass();
        if (this.typeCase_ != 5 || this.type_ == PlaylistInvitation.getDefaultInstance()) {
            this.type_ = playlistInvitation;
        } else {
            this.type_ = ((PlaylistInvitation.Builder) PlaylistInvitation.newBuilder((PlaylistInvitation) this.type_).mergeFrom(playlistInvitation)).buildPartial();
        }
        this.typeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistMessage(PlaylistMessage playlistMessage) {
        playlistMessage.getClass();
        if (this.typeCase_ != 4 || this.type_ == PlaylistMessage.getDefaultInstance()) {
            this.type_ = playlistMessage;
        } else {
            this.type_ = ((PlaylistMessage.Builder) PlaylistMessage.newBuilder((PlaylistMessage) this.type_).mergeFrom(playlistMessage)).buildPartial();
        }
        this.typeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistReaction(PlaylistReaction playlistReaction) {
        playlistReaction.getClass();
        if (this.typeCase_ != 2 || this.type_ == PlaylistReaction.getDefaultInstance()) {
            this.type_ = playlistReaction;
        } else {
            this.type_ = ((PlaylistReaction.Builder) PlaylistReaction.newBuilder((PlaylistReaction) this.type_).mergeFrom(playlistReaction)).buildPartial();
        }
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistReply(PlaylistReply playlistReply) {
        playlistReply.getClass();
        if (this.typeCase_ != 3 || this.type_ == PlaylistReply.getDefaultInstance()) {
            this.type_ = playlistReply;
        } else {
            this.type_ = ((PlaylistReply.Builder) PlaylistReply.newBuilder((PlaylistReply) this.type_).mergeFrom(playlistReply)).buildPartial();
        }
        this.typeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackedShareContext parseDelimitedFrom(InputStream inputStream) {
        return (TrackedShareContext) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShareContext parseFrom(ByteBuffer byteBuffer) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListeningActivity(ListeningActivity listeningActivity) {
        listeningActivity.getClass();
        this.type_ = listeningActivity;
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListeningStatsInteraction(ListeningStatsInteraction listeningStatsInteraction) {
        listeningStatsInteraction.getClass();
        this.type_ = listeningStatsInteraction;
        this.typeCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistInvitation(PlaylistInvitation playlistInvitation) {
        playlistInvitation.getClass();
        this.type_ = playlistInvitation;
        this.typeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistMessage(PlaylistMessage playlistMessage) {
        playlistMessage.getClass();
        this.type_ = playlistMessage;
        this.typeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistReaction(PlaylistReaction playlistReaction) {
        playlistReaction.getClass();
        this.type_ = playlistReaction;
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistReply(PlaylistReply playlistReply) {
        playlistReply.getClass();
        this.type_ = playlistReply;
        this.typeCase_ = 3;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"type_", "typeCase_", ListeningActivity.class, PlaylistReaction.class, PlaylistReply.class, PlaylistMessage.class, PlaylistInvitation.class, ListeningStatsInteraction.class});
        }
        if (iOrdinal == 3) {
            return new TrackedShareContext();
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
        synchronized (TrackedShareContext.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public ListeningActivity getListeningActivity() {
        return this.typeCase_ == 1 ? (ListeningActivity) this.type_ : ListeningActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public ListeningStatsInteraction getListeningStatsInteraction() {
        return this.typeCase_ == 7 ? (ListeningStatsInteraction) this.type_ : ListeningStatsInteraction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistInvitation getPlaylistInvitation() {
        return this.typeCase_ == 5 ? (PlaylistInvitation) this.type_ : PlaylistInvitation.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistMessage getPlaylistMessage() {
        return this.typeCase_ == 4 ? (PlaylistMessage) this.type_ : PlaylistMessage.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistReaction getPlaylistReaction() {
        return this.typeCase_ == 2 ? (PlaylistReaction) this.type_ : PlaylistReaction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistReply getPlaylistReply() {
        return this.typeCase_ == 3 ? (PlaylistReply) this.type_ : PlaylistReply.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public TypeCase getTypeCase() {
        return TypeCase.forNumber(this.typeCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasListeningActivity() {
        return this.typeCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasListeningStatsInteraction() {
        return this.typeCase_ == 7;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistInvitation() {
        return this.typeCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistMessage() {
        return this.typeCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistReaction() {
        return this.typeCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistReply() {
        return this.typeCase_ == 3;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements TrackedShareContextOrBuilder {
        private Builder() {
            super(TrackedShareContext.DEFAULT_INSTANCE);
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearListeningActivity() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearListeningActivity();
            return this;
        }

        public Builder clearListeningStatsInteraction() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearListeningStatsInteraction();
            return this;
        }

        public Builder clearPlaylistInvitation() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearPlaylistInvitation();
            return this;
        }

        public Builder clearPlaylistMessage() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearPlaylistMessage();
            return this;
        }

        public Builder clearPlaylistReaction() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearPlaylistReaction();
            return this;
        }

        public Builder clearPlaylistReply() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearPlaylistReply();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).clearType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public ListeningActivity getListeningActivity() {
            return ((TrackedShareContext) ((g) this).instance).getListeningActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public ListeningStatsInteraction getListeningStatsInteraction() {
            return ((TrackedShareContext) ((g) this).instance).getListeningStatsInteraction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistInvitation getPlaylistInvitation() {
            return ((TrackedShareContext) ((g) this).instance).getPlaylistInvitation();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistMessage getPlaylistMessage() {
            return ((TrackedShareContext) ((g) this).instance).getPlaylistMessage();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistReaction getPlaylistReaction() {
            return ((TrackedShareContext) ((g) this).instance).getPlaylistReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistReply getPlaylistReply() {
            return ((TrackedShareContext) ((g) this).instance).getPlaylistReply();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public TypeCase getTypeCase() {
            return ((TrackedShareContext) ((g) this).instance).getTypeCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasListeningActivity() {
            return ((TrackedShareContext) ((g) this).instance).hasListeningActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasListeningStatsInteraction() {
            return ((TrackedShareContext) ((g) this).instance).hasListeningStatsInteraction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistInvitation() {
            return ((TrackedShareContext) ((g) this).instance).hasPlaylistInvitation();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistMessage() {
            return ((TrackedShareContext) ((g) this).instance).hasPlaylistMessage();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistReaction() {
            return ((TrackedShareContext) ((g) this).instance).hasPlaylistReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistReply() {
            return ((TrackedShareContext) ((g) this).instance).hasPlaylistReply();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m750mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeListeningActivity(ListeningActivity listeningActivity) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).mergeListeningActivity(listeningActivity);
            return this;
        }

        public Builder mergeListeningStatsInteraction(ListeningStatsInteraction listeningStatsInteraction) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).mergeListeningStatsInteraction(listeningStatsInteraction);
            return this;
        }

        public Builder mergePlaylistInvitation(PlaylistInvitation playlistInvitation) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).mergePlaylistInvitation(playlistInvitation);
            return this;
        }

        public Builder mergePlaylistMessage(PlaylistMessage playlistMessage) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).mergePlaylistMessage(playlistMessage);
            return this;
        }

        public Builder mergePlaylistReaction(PlaylistReaction playlistReaction) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).mergePlaylistReaction(playlistReaction);
            return this;
        }

        public Builder mergePlaylistReply(PlaylistReply playlistReply) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).mergePlaylistReply(playlistReply);
            return this;
        }

        public Builder setListeningActivity(ListeningActivity.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setListeningActivity((ListeningActivity) builder.build());
            return this;
        }

        public Builder setListeningStatsInteraction(ListeningStatsInteraction.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setListeningStatsInteraction((ListeningStatsInteraction) builder.build());
            return this;
        }

        public Builder setPlaylistInvitation(PlaylistInvitation.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistInvitation((PlaylistInvitation) builder.build());
            return this;
        }

        public Builder setPlaylistMessage(PlaylistMessage.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistMessage((PlaylistMessage) builder.build());
            return this;
        }

        public Builder setPlaylistReaction(PlaylistReaction.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistReaction((PlaylistReaction) builder.build());
            return this;
        }

        public Builder setPlaylistReply(PlaylistReply.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistReply((PlaylistReply) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m749clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m751mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m748clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m752mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setListeningActivity(ListeningActivity listeningActivity) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setListeningActivity(listeningActivity);
            return this;
        }

        public Builder setListeningStatsInteraction(ListeningStatsInteraction listeningStatsInteraction) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setListeningStatsInteraction(listeningStatsInteraction);
            return this;
        }

        public Builder setPlaylistInvitation(PlaylistInvitation playlistInvitation) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistInvitation(playlistInvitation);
            return this;
        }

        public Builder setPlaylistMessage(PlaylistMessage playlistMessage) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistMessage(playlistMessage);
            return this;
        }

        public Builder setPlaylistReaction(PlaylistReaction playlistReaction) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistReaction(playlistReaction);
            return this;
        }

        public Builder setPlaylistReply(PlaylistReply playlistReply) {
            copyOnWrite();
            ((TrackedShareContext) ((g) this).instance).setPlaylistReply(playlistReply);
            return this;
        }
    }

    public enum TypeCase {
        LISTENING_ACTIVITY(1),
        PLAYLIST_REACTION(2),
        PLAYLIST_REPLY(3),
        PLAYLIST_MESSAGE(4),
        PLAYLIST_INVITATION(5),
        LISTENING_STATS_INTERACTION(7),
        TYPE_NOT_SET(0);

        private final int value;

        TypeCase(int i) {
            this.value = i;
        }

        public static TypeCase forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            if (i == 1) {
                return LISTENING_ACTIVITY;
            }
            if (i == 2) {
                return PLAYLIST_REACTION;
            }
            if (i == 3) {
                return PLAYLIST_REPLY;
            }
            if (i == 4) {
                return PLAYLIST_MESSAGE;
            }
            if (i == 5) {
                return PLAYLIST_INVITATION;
            }
            if (i != 7) {
                return null;
            }
            return LISTENING_STATS_INTERACTION;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(TrackedShareContext trackedShareContext) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackedShareContext);
    }

    public static TrackedShareContext parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackedShareContext) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackedShareContext parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackedShareContext parseFrom(phc phcVar) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackedShareContext parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackedShareContext parseFrom(byte[] bArr) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackedShareContext parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackedShareContext parseFrom(InputStream inputStream) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShareContext parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackedShareContext parseFrom(lwg lwgVar) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackedShareContext parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackedShareContext) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
