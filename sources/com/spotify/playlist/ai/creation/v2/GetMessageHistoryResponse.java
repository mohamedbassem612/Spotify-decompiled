package com.spotify.playlist.ai.creation.v2;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
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
public final class GetMessageHistoryResponse extends h implements GetMessageHistoryResponseOrBuilder {
    private static final GetMessageHistoryResponse DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 messages_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponse$1, reason: invalid class name */
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
        GetMessageHistoryResponse getMessageHistoryResponse = new GetMessageHistoryResponse();
        DEFAULT_INSTANCE = getMessageHistoryResponse;
        h.registerDefaultInstance(GetMessageHistoryResponse.class, getMessageHistoryResponse);
    }

    private GetMessageHistoryResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessages(Iterable<? extends ChatMessage> iterable) {
        ensureMessagesIsMutable();
        s8.addAll(iterable, this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(chatMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = h.emptyProtobufList();
    }

    private void ensureMessagesIsMutable() {
        i9 i9Var = this.messages_;
        if (i9Var.a) {
            return;
        }
        this.messages_ = h.mutableCopy(i9Var);
    }

    public static GetMessageHistoryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetMessageHistoryResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetMessageHistoryResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageHistoryResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessages(int i) {
        ensureMessagesIsMutable();
        this.messages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(int i, ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.set(i, chatMessage);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"messages_", ChatMessage.class});
        }
        if (iOrdinal == 3) {
            return new GetMessageHistoryResponse();
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
        synchronized (GetMessageHistoryResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
    public final ChatMessage getMessages(int i) {
        return (ChatMessage) this.messages_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
    public final int getMessagesCount() {
        return this.messages_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
    public final List<ChatMessage> getMessagesList() {
        return this.messages_;
    }

    public final ChatMessageOrBuilder getMessagesOrBuilder(int i) {
        return (ChatMessageOrBuilder) this.messages_.get(i);
    }

    public final List<? extends ChatMessageOrBuilder> getMessagesOrBuilderList() {
        return this.messages_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetMessageHistoryResponseOrBuilder {
        private Builder() {
            super(GetMessageHistoryResponse.DEFAULT_INSTANCE);
        }

        public final Builder addAllMessages(Iterable<? extends ChatMessage> iterable) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).addAllMessages(iterable);
            return this;
        }

        public final Builder addMessages(ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).addMessages((ChatMessage) builder.build());
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

        public final Builder clearMessages() {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).clearMessages();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
        public final ChatMessage getMessages(int i) {
            return ((GetMessageHistoryResponse) ((g) this).instance).getMessages(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
        public final int getMessagesCount() {
            return ((GetMessageHistoryResponse) ((g) this).instance).getMessagesCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponseOrBuilder
        public final List<ChatMessage> getMessagesList() {
            return Collections.unmodifiableList(((GetMessageHistoryResponse) ((g) this).instance).getMessagesList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m475mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder removeMessages(int i) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).removeMessages(i);
            return this;
        }

        public final Builder setMessages(int i, ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).setMessages(i, (ChatMessage) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m474clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m476mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m473clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m477mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder addMessages(int i, ChatMessage chatMessage) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).addMessages(i, chatMessage);
            return this;
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public final Builder setMessages(int i, ChatMessage chatMessage) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).setMessages(i, chatMessage);
            return this;
        }

        public final Builder addMessages(ChatMessage chatMessage) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).addMessages(chatMessage);
            return this;
        }

        public final Builder addMessages(int i, ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetMessageHistoryResponse) ((g) this).instance).addMessages(i, (ChatMessage) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(GetMessageHistoryResponse getMessageHistoryResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getMessageHistoryResponse);
    }

    public static GetMessageHistoryResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetMessageHistoryResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetMessageHistoryResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetMessageHistoryResponse parseFrom(phc phcVar) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetMessageHistoryResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(int i, ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i, chatMessage);
    }

    public static GetMessageHistoryResponse parseFrom(byte[] bArr) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetMessageHistoryResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetMessageHistoryResponse parseFrom(InputStream inputStream) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageHistoryResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetMessageHistoryResponse parseFrom(lwg lwgVar) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetMessageHistoryResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetMessageHistoryResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
