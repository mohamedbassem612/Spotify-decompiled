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
public final class ChatEvent extends h implements ChatEventOrBuilder {
    private static final ChatEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ChatEventType eventType_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ChatEvent$1, reason: invalid class name */
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
        ChatEvent chatEvent = new ChatEvent();
        DEFAULT_INSTANCE = chatEvent;
        h.registerDefaultInstance(ChatEvent.class, chatEvent);
    }

    private ChatEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        this.eventType_ = null;
        this.bitField0_ &= -2;
    }

    public static ChatEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventType(ChatEventType chatEventType) {
        chatEventType.getClass();
        ChatEventType chatEventType2 = this.eventType_;
        if (chatEventType2 == null || chatEventType2 == ChatEventType.getDefaultInstance()) {
            this.eventType_ = chatEventType;
        } else {
            this.eventType_ = (ChatEventType) ((ChatEventType.Builder) ChatEventType.newBuilder(this.eventType_).mergeFrom(chatEventType)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatEvent parseDelimitedFrom(InputStream inputStream) {
        return (ChatEvent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatEvent parseFrom(ByteBuffer byteBuffer) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(ChatEventType chatEventType) {
        chatEventType.getClass();
        this.eventType_ = chatEventType;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "eventType_"});
        }
        if (iOrdinal == 3) {
            return new ChatEvent();
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
        synchronized (ChatEvent.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventOrBuilder
    public ChatEventType getEventType() {
        ChatEventType chatEventType = this.eventType_;
        return chatEventType == null ? ChatEventType.getDefaultInstance() : chatEventType;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventOrBuilder
    public boolean hasEventType() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ChatEventOrBuilder {
        private Builder() {
            super(ChatEvent.DEFAULT_INSTANCE);
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

        public Builder clearEventType() {
            copyOnWrite();
            ((ChatEvent) ((g) this).instance).clearEventType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventOrBuilder
        public ChatEventType getEventType() {
            return ((ChatEvent) ((g) this).instance).getEventType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventOrBuilder
        public boolean hasEventType() {
            return ((ChatEvent) ((g) this).instance).hasEventType();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeEventType(ChatEventType chatEventType) {
            copyOnWrite();
            ((ChatEvent) ((g) this).instance).mergeEventType(chatEventType);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m84mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setEventType(ChatEventType.Builder builder) {
            copyOnWrite();
            ((ChatEvent) ((g) this).instance).setEventType((ChatEventType) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m83clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m85mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m82clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m86mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setEventType(ChatEventType chatEventType) {
            copyOnWrite();
            ((ChatEvent) ((g) this).instance).setEventType(chatEventType);
            return this;
        }
    }

    public static Builder newBuilder(ChatEvent chatEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatEvent);
    }

    public static ChatEvent parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatEvent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatEvent parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ChatEvent parseFrom(phc phcVar) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ChatEvent parseFrom(phc phcVar, uz00 uz00Var) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ChatEvent parseFrom(byte[] bArr) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatEvent parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ChatEvent parseFrom(InputStream inputStream) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatEvent parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatEvent parseFrom(lwg lwgVar) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ChatEvent parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ChatEvent) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
