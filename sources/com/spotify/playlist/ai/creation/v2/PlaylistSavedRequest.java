package com.spotify.playlist.ai.creation.v2;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistSavedRequest extends h implements PlaylistSavedRequestOrBuilder {
    private static final PlaylistSavedRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 2;
    private String messageId_ = "";
    private String playlistUri_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.PlaylistSavedRequest$1, reason: invalid class name */
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
        PlaylistSavedRequest playlistSavedRequest = new PlaylistSavedRequest();
        DEFAULT_INSTANCE = playlistSavedRequest;
        h.registerDefaultInstance(PlaylistSavedRequest.class, playlistSavedRequest);
    }

    private PlaylistSavedRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistUri() {
        this.playlistUri_ = DEFAULT_INSTANCE.playlistUri_;
    }

    public static PlaylistSavedRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaylistSavedRequest parseDelimitedFrom(InputStream inputStream) {
        return (PlaylistSavedRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistSavedRequest parseFrom(ByteBuffer byteBuffer) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.messageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.messageId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistUri(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.playlistUri_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageId_", "playlistUri_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistSavedRequest();
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
        synchronized (PlaylistSavedRequest.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
    public final phc getMessageIdBytes() {
        return phc.i(this.messageId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
    public final phc getPlaylistUriBytes() {
        return phc.i(this.playlistUri_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements PlaylistSavedRequestOrBuilder {
        private Builder() {
            super(PlaylistSavedRequest.DEFAULT_INSTANCE);
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

        public final Builder clearMessageId() {
            copyOnWrite();
            ((PlaylistSavedRequest) ((g) this).instance).clearMessageId();
            return this;
        }

        public final Builder clearPlaylistUri() {
            copyOnWrite();
            ((PlaylistSavedRequest) ((g) this).instance).clearPlaylistUri();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
        public final String getMessageId() {
            return ((PlaylistSavedRequest) ((g) this).instance).getMessageId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
        public final phc getMessageIdBytes() {
            return ((PlaylistSavedRequest) ((g) this).instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
        public final String getPlaylistUri() {
            return ((PlaylistSavedRequest) ((g) this).instance).getPlaylistUri();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedRequestOrBuilder
        public final phc getPlaylistUriBytes() {
            return ((PlaylistSavedRequest) ((g) this).instance).getPlaylistUriBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m540mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((PlaylistSavedRequest) ((g) this).instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(phc phcVar) {
            copyOnWrite();
            ((PlaylistSavedRequest) ((g) this).instance).setMessageIdBytes(phcVar);
            return this;
        }

        public final Builder setPlaylistUri(String str) {
            copyOnWrite();
            ((PlaylistSavedRequest) ((g) this).instance).setPlaylistUri(str);
            return this;
        }

        public final Builder setPlaylistUriBytes(phc phcVar) {
            copyOnWrite();
            ((PlaylistSavedRequest) ((g) this).instance).setPlaylistUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m539clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m541mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m538clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m542mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(PlaylistSavedRequest playlistSavedRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(playlistSavedRequest);
    }

    public static PlaylistSavedRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlaylistSavedRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlaylistSavedRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static PlaylistSavedRequest parseFrom(phc phcVar) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static PlaylistSavedRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static PlaylistSavedRequest parseFrom(byte[] bArr) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistSavedRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static PlaylistSavedRequest parseFrom(InputStream inputStream) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistSavedRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlaylistSavedRequest parseFrom(lwg lwgVar) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static PlaylistSavedRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (PlaylistSavedRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
