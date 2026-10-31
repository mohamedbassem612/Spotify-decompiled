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
public final class ChatMessage extends h implements ChatMessageOrBuilder {
    private static final ChatMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 6;
    public static final int SENDER_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int SUBMIT_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int UPDATED_TIMESTAMP_FIELD_NUMBER = 4;
    private int bitField0_;
    private String messageId_ = "";
    private ChatMessagePreferences messagePreferences_;
    private Playlist playlist_;
    private int sender_;
    private Status status_;
    private long submitTimestamp_;
    private long updatedTimestamp_;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ChatMessage$1, reason: invalid class name */
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
        ChatMessage chatMessage = new ChatMessage();
        DEFAULT_INSTANCE = chatMessage;
        h.registerDefaultInstance(ChatMessage.class, chatMessage);
    }

    private ChatMessage() {
    }

    public static void C(int i, ChatMessage chatMessage) {
        chatMessage.sender_ = i;
    }

    public static void E(ChatMessage chatMessage, long j) {
        chatMessage.submitTimestamp_ = j;
    }

    public static void F(ChatMessage chatMessage, long j) {
        chatMessage.updatedTimestamp_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
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

    private void clearSender() {
        this.sender_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubmitTimestamp() {
        this.submitTimestamp_ = 0L;
    }

    private void clearUpdatedTimestamp() {
        this.updatedTimestamp_ = 0L;
    }

    public static ChatMessage getDefaultInstance() {
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

    public static ChatMessage parseDelimitedFrom(InputStream inputStream) {
        return (ChatMessage) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessage parseFrom(ByteBuffer byteBuffer) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(ChatMessage chatMessage) {
        chatMessage.sender_ = 0;
    }

    public static void s(ChatMessage chatMessage) {
        chatMessage.submitTimestamp_ = 0L;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSender(Sender sender) {
        this.sender_ = sender.getNumber();
    }

    private void setSenderValue(int i) {
        this.sender_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    private void setSubmitTimestamp(long j) {
        this.submitTimestamp_ = j;
    }

    private void setUpdatedTimestamp(long j) {
        this.updatedTimestamp_ = j;
    }

    public static void t(ChatMessage chatMessage) {
        chatMessage.updatedTimestamp_ = 0L;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0002\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"bitField0_", "messageId_", "sender_", "submitTimestamp_", "updatedTimestamp_", "status_", "playlist_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new ChatMessage();
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
        synchronized (ChatMessage.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final phc getMessageIdBytes() {
        return phc.i(this.messageId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final Playlist getPlaylist() {
        Playlist playlist = this.playlist_;
        return playlist == null ? Playlist.getDefaultInstance() : playlist;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final Sender getSender() {
        Sender senderForNumber = Sender.forNumber(this.sender_);
        return senderForNumber == null ? Sender.UNRECOGNIZED : senderForNumber;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final int getSenderValue() {
        return this.sender_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final long getSubmitTimestamp() {
        return this.submitTimestamp_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final long getUpdatedTimestamp() {
        return this.updatedTimestamp_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final boolean hasMessagePreferences() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final boolean hasPlaylist() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
    public final boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ChatMessageOrBuilder {
        private Builder() {
            super(ChatMessage.DEFAULT_INSTANCE);
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
            ((ChatMessage) ((g) this).instance).clearMessageId();
            return this;
        }

        public final Builder clearMessagePreferences() {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearPlaylist() {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).clearPlaylist();
            return this;
        }

        public final Builder clearSender() {
            copyOnWrite();
            ChatMessage.q((ChatMessage) ((g) this).instance);
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).clearStatus();
            return this;
        }

        public final Builder clearSubmitTimestamp() {
            copyOnWrite();
            ChatMessage.s((ChatMessage) ((g) this).instance);
            return this;
        }

        public final Builder clearUpdatedTimestamp() {
            copyOnWrite();
            ChatMessage.t((ChatMessage) ((g) this).instance);
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final String getMessageId() {
            return ((ChatMessage) ((g) this).instance).getMessageId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final phc getMessageIdBytes() {
            return ((ChatMessage) ((g) this).instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((ChatMessage) ((g) this).instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final Playlist getPlaylist() {
            return ((ChatMessage) ((g) this).instance).getPlaylist();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final Sender getSender() {
            return ((ChatMessage) ((g) this).instance).getSender();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final int getSenderValue() {
            return ((ChatMessage) ((g) this).instance).getSenderValue();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final Status getStatus() {
            return ((ChatMessage) ((g) this).instance).getStatus();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final long getSubmitTimestamp() {
            return ((ChatMessage) ((g) this).instance).getSubmitTimestamp();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final long getUpdatedTimestamp() {
            return ((ChatMessage) ((g) this).instance).getUpdatedTimestamp();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final boolean hasMessagePreferences() {
            return ((ChatMessage) ((g) this).instance).hasMessagePreferences();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final boolean hasPlaylist() {
            return ((ChatMessage) ((g) this).instance).hasPlaylist();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessageOrBuilder
        public final boolean hasStatus() {
            return ((ChatMessage) ((g) this).instance).hasStatus();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m445mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder mergePlaylist(Playlist playlist) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).mergePlaylist(playlist);
            return this;
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).mergeStatus(status);
            return this;
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(phc phcVar) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setMessageIdBytes(phcVar);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences.Builder builder) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setMessagePreferences((ChatMessagePreferences) builder.build());
            return this;
        }

        public final Builder setPlaylist(Playlist.Builder builder) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setPlaylist((Playlist) builder.build());
            return this;
        }

        public final Builder setSender(Sender sender) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setSender(sender);
            return this;
        }

        public final Builder setSenderValue(int i) {
            copyOnWrite();
            ChatMessage.C(i, (ChatMessage) ((g) this).instance);
            return this;
        }

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setStatus((Status) builder.build());
            return this;
        }

        public final Builder setSubmitTimestamp(long j) {
            copyOnWrite();
            ChatMessage.E((ChatMessage) ((g) this).instance, j);
            return this;
        }

        public final Builder setUpdatedTimestamp(long j) {
            copyOnWrite();
            ChatMessage.F((ChatMessage) ((g) this).instance, j);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m444clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m446mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m443clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m447mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
            ((ChatMessage) ((g) this).instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setPlaylist(Playlist playlist) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setPlaylist(playlist);
            return this;
        }

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((ChatMessage) ((g) this).instance).setStatus(status);
            return this;
        }
    }

    public static Builder newBuilder(ChatMessage chatMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatMessage);
    }

    public static ChatMessage parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatMessage) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatMessage parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ChatMessage parseFrom(phc phcVar) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ChatMessage parseFrom(phc phcVar, uz00 uz00Var) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ChatMessage parseFrom(byte[] bArr) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatMessage parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ChatMessage parseFrom(InputStream inputStream) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessage parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatMessage parseFrom(lwg lwgVar) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ChatMessage parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ChatMessage) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
