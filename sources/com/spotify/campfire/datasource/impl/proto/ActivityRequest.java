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
public final class ActivityRequest extends h implements ActivityRequestOrBuilder {
    public static final int ACK_TYPE_FIELD_NUMBER = 3;
    private static final ActivityRequest DEFAULT_INSTANCE;
    public static final int EMOJI_REACTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_EMOTI_FIELD_NUMBER = 1;
    public static final int RECEIPT_TYPE_FIELD_NUMBER = 2;
    private int arCase_ = 0;
    private Object ar_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ActivityRequest$1, reason: invalid class name */
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
        ActivityRequest activityRequest = new ActivityRequest();
        DEFAULT_INSTANCE = activityRequest;
        h.registerDefaultInstance(ActivityRequest.class, activityRequest);
    }

    private ActivityRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckType() {
        if (this.arCase_ == 3) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAr() {
        this.arCase_ = 0;
        this.ar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiReaction() {
        if (this.arCase_ == 4) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReactionEmoti() {
        if (this.arCase_ == 1) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceiptType() {
        if (this.arCase_ == 2) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    public static ActivityRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmojiReaction(EmojiReaction emojiReaction) {
        emojiReaction.getClass();
        if (this.arCase_ != 4 || this.ar_ == EmojiReaction.getDefaultInstance()) {
            this.ar_ = emojiReaction;
        } else {
            this.ar_ = ((EmojiReaction.Builder) EmojiReaction.newBuilder((EmojiReaction) this.ar_).mergeFrom(emojiReaction)).buildPartial();
        }
        this.arCase_ = 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityRequest parseDelimitedFrom(InputStream inputStream) {
        return (ActivityRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityRequest parseFrom(ByteBuffer byteBuffer) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckType(AckType ackType) {
        this.ar_ = Integer.valueOf(ackType.getNumber());
        this.arCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckTypeValue(int i) {
        this.arCase_ = 3;
        this.ar_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiReaction(EmojiReaction emojiReaction) {
        emojiReaction.getClass();
        this.ar_ = emojiReaction;
        this.arCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmoti(ReactionEmoti reactionEmoti) {
        this.ar_ = Integer.valueOf(reactionEmoti.getNumber());
        this.arCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmotiValue(int i) {
        this.arCase_ = 1;
        this.ar_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptType(ReceiptType receiptType) {
        this.ar_ = Integer.valueOf(receiptType.getNumber());
        this.arCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptTypeValue(int i) {
        this.arCase_ = 2;
        this.ar_ = Integer.valueOf(i);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004<\u0000", new Object[]{"ar_", "arCase_", EmojiReaction.class});
        }
        if (iOrdinal == 3) {
            return new ActivityRequest();
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
        synchronized (ActivityRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public AckType getAckType() {
        if (this.arCase_ != 3) {
            return AckType.ACKTYPE_UNDEFINED;
        }
        AckType ackTypeForNumber = AckType.forNumber(((Integer) this.ar_).intValue());
        return ackTypeForNumber == null ? AckType.UNRECOGNIZED : ackTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public int getAckTypeValue() {
        if (this.arCase_ == 3) {
            return ((Integer) this.ar_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public ArCase getArCase() {
        return ArCase.forNumber(this.arCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public EmojiReaction getEmojiReaction() {
        return this.arCase_ == 4 ? (EmojiReaction) this.ar_ : EmojiReaction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public ReactionEmoti getReactionEmoti() {
        if (this.arCase_ != 1) {
            return ReactionEmoti.REACTION_EMOTI_UNSPECIFIED;
        }
        ReactionEmoti reactionEmotiForNumber = ReactionEmoti.forNumber(((Integer) this.ar_).intValue());
        return reactionEmotiForNumber == null ? ReactionEmoti.UNRECOGNIZED : reactionEmotiForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public int getReactionEmotiValue() {
        if (this.arCase_ == 1) {
            return ((Integer) this.ar_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public ReceiptType getReceiptType() {
        if (this.arCase_ != 2) {
            return ReceiptType.RECEIPT_TYPE_UNDEFINED;
        }
        ReceiptType receiptTypeForNumber = ReceiptType.forNumber(((Integer) this.ar_).intValue());
        return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public int getReceiptTypeValue() {
        if (this.arCase_ == 2) {
            return ((Integer) this.ar_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasAckType() {
        return this.arCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasEmojiReaction() {
        return this.arCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasReactionEmoti() {
        return this.arCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasReceiptType() {
        return this.arCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ActivityRequestOrBuilder {
        private Builder() {
            super(ActivityRequest.DEFAULT_INSTANCE);
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

        public Builder clearAckType() {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).clearAckType();
            return this;
        }

        public Builder clearAr() {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).clearAr();
            return this;
        }

        public Builder clearEmojiReaction() {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).clearEmojiReaction();
            return this;
        }

        public Builder clearReactionEmoti() {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).clearReactionEmoti();
            return this;
        }

        public Builder clearReceiptType() {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).clearReceiptType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public AckType getAckType() {
            return ((ActivityRequest) ((g) this).instance).getAckType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public int getAckTypeValue() {
            return ((ActivityRequest) ((g) this).instance).getAckTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public ArCase getArCase() {
            return ((ActivityRequest) ((g) this).instance).getArCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public EmojiReaction getEmojiReaction() {
            return ((ActivityRequest) ((g) this).instance).getEmojiReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public ReactionEmoti getReactionEmoti() {
            return ((ActivityRequest) ((g) this).instance).getReactionEmoti();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public int getReactionEmotiValue() {
            return ((ActivityRequest) ((g) this).instance).getReactionEmotiValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public ReceiptType getReceiptType() {
            return ((ActivityRequest) ((g) this).instance).getReceiptType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public int getReceiptTypeValue() {
            return ((ActivityRequest) ((g) this).instance).getReceiptTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasAckType() {
            return ((ActivityRequest) ((g) this).instance).hasAckType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasEmojiReaction() {
            return ((ActivityRequest) ((g) this).instance).hasEmojiReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasReactionEmoti() {
            return ((ActivityRequest) ((g) this).instance).hasReactionEmoti();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasReceiptType() {
            return ((ActivityRequest) ((g) this).instance).hasReceiptType();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeEmojiReaction(EmojiReaction emojiReaction) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).mergeEmojiReaction(emojiReaction);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m14mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAckType(AckType ackType) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setAckType(ackType);
            return this;
        }

        public Builder setAckTypeValue(int i) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setAckTypeValue(i);
            return this;
        }

        public Builder setEmojiReaction(EmojiReaction.Builder builder) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setEmojiReaction((EmojiReaction) builder.build());
            return this;
        }

        public Builder setReactionEmoti(ReactionEmoti reactionEmoti) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setReactionEmoti(reactionEmoti);
            return this;
        }

        public Builder setReactionEmotiValue(int i) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setReactionEmotiValue(i);
            return this;
        }

        public Builder setReceiptType(ReceiptType receiptType) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setReceiptType(receiptType);
            return this;
        }

        public Builder setReceiptTypeValue(int i) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setReceiptTypeValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m13clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m15mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m12clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m16mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setEmojiReaction(EmojiReaction emojiReaction) {
            copyOnWrite();
            ((ActivityRequest) ((g) this).instance).setEmojiReaction(emojiReaction);
            return this;
        }
    }

    public enum ArCase {
        REACTION_EMOTI(1),
        RECEIPT_TYPE(2),
        ACK_TYPE(3),
        EMOJI_REACTION(4),
        AR_NOT_SET(0);

        private final int value;

        ArCase(int i) {
            this.value = i;
        }

        public static ArCase forNumber(int i) {
            if (i == 0) {
                return AR_NOT_SET;
            }
            if (i == 1) {
                return REACTION_EMOTI;
            }
            if (i == 2) {
                return RECEIPT_TYPE;
            }
            if (i == 3) {
                return ACK_TYPE;
            }
            if (i != 4) {
                return null;
            }
            return EMOJI_REACTION;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ArCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ActivityRequest activityRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(activityRequest);
    }

    public static ActivityRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ActivityRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ActivityRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ActivityRequest parseFrom(phc phcVar) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ActivityRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ActivityRequest parseFrom(byte[] bArr) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ActivityRequest parseFrom(InputStream inputStream) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ActivityRequest parseFrom(lwg lwgVar) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ActivityRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ActivityRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
