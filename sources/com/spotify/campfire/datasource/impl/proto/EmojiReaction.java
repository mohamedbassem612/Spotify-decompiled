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
public final class EmojiReaction extends h implements EmojiReactionOrBuilder {
    private static final EmojiReaction DEFAULT_INSTANCE;
    public static final int EMOJI_UTF8_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String emojiUtf8_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.EmojiReaction$1, reason: invalid class name */
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
        EmojiReaction emojiReaction = new EmojiReaction();
        DEFAULT_INSTANCE = emojiReaction;
        h.registerDefaultInstance(EmojiReaction.class, emojiReaction);
    }

    private EmojiReaction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiUtf8() {
        this.bitField0_ &= -2;
        this.emojiUtf8_ = getDefaultInstance().getEmojiUtf8();
    }

    public static EmojiReaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EmojiReaction parseDelimitedFrom(InputStream inputStream) {
        return (EmojiReaction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmojiReaction parseFrom(ByteBuffer byteBuffer) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiUtf8(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.emojiUtf8_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiUtf8Bytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.emojiUtf8_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "emojiUtf8_"});
        }
        if (iOrdinal == 3) {
            return new EmojiReaction();
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
        synchronized (EmojiReaction.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
    public String getEmojiUtf8() {
        return this.emojiUtf8_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
    public phc getEmojiUtf8Bytes() {
        return phc.i(this.emojiUtf8_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
    public boolean hasEmojiUtf8() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements EmojiReactionOrBuilder {
        private Builder() {
            super(EmojiReaction.DEFAULT_INSTANCE);
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

        public Builder clearEmojiUtf8() {
            copyOnWrite();
            ((EmojiReaction) ((g) this).instance).clearEmojiUtf8();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
        public String getEmojiUtf8() {
            return ((EmojiReaction) ((g) this).instance).getEmojiUtf8();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
        public phc getEmojiUtf8Bytes() {
            return ((EmojiReaction) ((g) this).instance).getEmojiUtf8Bytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EmojiReactionOrBuilder
        public boolean hasEmojiUtf8() {
            return ((EmojiReaction) ((g) this).instance).hasEmojiUtf8();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m226mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setEmojiUtf8(String str) {
            copyOnWrite();
            ((EmojiReaction) ((g) this).instance).setEmojiUtf8(str);
            return this;
        }

        public Builder setEmojiUtf8Bytes(phc phcVar) {
            copyOnWrite();
            ((EmojiReaction) ((g) this).instance).setEmojiUtf8Bytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m225clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m227mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m224clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m228mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
    }

    public static Builder newBuilder(EmojiReaction emojiReaction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(emojiReaction);
    }

    public static EmojiReaction parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EmojiReaction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EmojiReaction parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EmojiReaction parseFrom(phc phcVar) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EmojiReaction parseFrom(phc phcVar, uz00 uz00Var) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EmojiReaction parseFrom(byte[] bArr) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmojiReaction parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EmojiReaction parseFrom(InputStream inputStream) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmojiReaction parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EmojiReaction parseFrom(lwg lwgVar) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EmojiReaction parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EmojiReaction) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
