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
public final class GetMessageResponse extends h implements GetMessageResponseOrBuilder {
    private static final GetMessageResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 4;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ChatMessagePreferences messagePreferences_;
    private Playlist playlist_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.GetMessageResponse$1, reason: invalid class name */
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
        GetMessageResponse getMessageResponse = new GetMessageResponse();
        DEFAULT_INSTANCE = getMessageResponse;
        h.registerDefaultInstance(GetMessageResponse.class, getMessageResponse);
    }

    private GetMessageResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePreferences() {
        this.messagePreferences_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylist() {
        this.playlist_ = null;
        this.bitField0_ &= -3;
    }

    private void clearRetryAfterMs() {
        this.retryAfterMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubmitTimestampMs() {
        this.submitTimestampMs_ = 0L;
    }

    public static GetMessageResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        ChatMessagePreferences chatMessagePreferences2 = this.messagePreferences_;
        if (chatMessagePreferences2 == null || chatMessagePreferences2 == ChatMessagePreferences.getDefaultInstance()) {
            this.messagePreferences_ = chatMessagePreferences;
        } else {
            this.messagePreferences_ = (ChatMessagePreferences) ((ChatMessagePreferences.Builder) ChatMessagePreferences.newBuilder(this.messagePreferences_).mergeFrom(chatMessagePreferences)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylist(Playlist playlist) {
        playlist.getClass();
        Playlist playlist2 = this.playlist_;
        if (playlist2 == null || playlist2 == Playlist.getDefaultInstance()) {
            this.playlist_ = playlist;
        } else {
            this.playlist_ = (Playlist) ((Playlist.Builder) Playlist.newBuilder(this.playlist_).mergeFrom(playlist)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.Builder) Status.newBuilder(this.status_).mergeFrom(status)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static void p(GetMessageResponse getMessageResponse) {
        getMessageResponse.retryAfterMs_ = 0;
    }

    public static GetMessageResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetMessageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void r(GetMessageResponse getMessageResponse) {
        getMessageResponse.submitTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        this.messagePreferences_ = chatMessagePreferences;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylist(Playlist playlist) {
        playlist.getClass();
        this.playlist_ = playlist;
        this.bitField0_ |= 2;
    }

    private void setRetryAfterMs(int i) {
        this.retryAfterMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    private void setSubmitTimestampMs(long j) {
        this.submitTimestampMs_ = j;
    }

    public static void x(GetMessageResponse getMessageResponse, int i) {
        getMessageResponse.retryAfterMs_ = i;
    }

    public static void z(GetMessageResponse getMessageResponse, long j) {
        getMessageResponse.submitTimestampMs_ = j;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0002\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "status_", "retryAfterMs_", "submitTimestampMs_", "playlist_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new GetMessageResponse();
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
        synchronized (GetMessageResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final Playlist getPlaylist() {
        Playlist playlist = this.playlist_;
        return playlist == null ? Playlist.getDefaultInstance() : playlist;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final int getRetryAfterMs() {
        return this.retryAfterMs_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final long getSubmitTimestampMs() {
        return this.submitTimestampMs_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final boolean hasMessagePreferences() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final boolean hasPlaylist() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
    public final boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetMessageResponseOrBuilder {
        private Builder() {
            super(GetMessageResponse.DEFAULT_INSTANCE);
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

        public final Builder clearMessagePreferences() {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearPlaylist() {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).clearPlaylist();
            return this;
        }

        public final Builder clearRetryAfterMs() {
            copyOnWrite();
            GetMessageResponse.p((GetMessageResponse) ((g) this).instance);
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).clearStatus();
            return this;
        }

        public final Builder clearSubmitTimestampMs() {
            copyOnWrite();
            GetMessageResponse.r((GetMessageResponse) ((g) this).instance);
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((GetMessageResponse) ((g) this).instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final Playlist getPlaylist() {
            return ((GetMessageResponse) ((g) this).instance).getPlaylist();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final int getRetryAfterMs() {
            return ((GetMessageResponse) ((g) this).instance).getRetryAfterMs();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final Status getStatus() {
            return ((GetMessageResponse) ((g) this).instance).getStatus();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final long getSubmitTimestampMs() {
            return ((GetMessageResponse) ((g) this).instance).getSubmitTimestampMs();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final boolean hasMessagePreferences() {
            return ((GetMessageResponse) ((g) this).instance).hasMessagePreferences();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final boolean hasPlaylist() {
            return ((GetMessageResponse) ((g) this).instance).hasPlaylist();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageResponseOrBuilder
        public final boolean hasStatus() {
            return ((GetMessageResponse) ((g) this).instance).hasStatus();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m485mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder mergePlaylist(Playlist playlist) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).mergePlaylist(playlist);
            return this;
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).mergeStatus(status);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences.Builder builder) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).setMessagePreferences((ChatMessagePreferences) builder.build());
            return this;
        }

        public final Builder setPlaylist(Playlist.Builder builder) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).setPlaylist((Playlist) builder.build());
            return this;
        }

        public final Builder setRetryAfterMs(int i) {
            copyOnWrite();
            GetMessageResponse.x((GetMessageResponse) ((g) this).instance, i);
            return this;
        }

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).setStatus((Status) builder.build());
            return this;
        }

        public final Builder setSubmitTimestampMs(long j) {
            copyOnWrite();
            GetMessageResponse.z((GetMessageResponse) ((g) this).instance, j);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m484clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m486mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m483clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m487mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setPlaylist(Playlist playlist) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).setPlaylist(playlist);
            return this;
        }

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((GetMessageResponse) ((g) this).instance).setStatus(status);
            return this;
        }
    }

    public static Builder newBuilder(GetMessageResponse getMessageResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getMessageResponse);
    }

    public static GetMessageResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetMessageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetMessageResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetMessageResponse parseFrom(phc phcVar) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetMessageResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetMessageResponse parseFrom(byte[] bArr) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetMessageResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetMessageResponse parseFrom(InputStream inputStream) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetMessageResponse parseFrom(lwg lwgVar) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetMessageResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetMessageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
