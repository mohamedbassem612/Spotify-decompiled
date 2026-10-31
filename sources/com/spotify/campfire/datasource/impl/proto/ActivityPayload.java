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
public final class ActivityPayload extends h implements ActivityPayloadOrBuilder {
    public static final int ACK_FIELD_NUMBER = 3;
    private static final ActivityPayload DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 1;
    public static final int RECEIPT_FIELD_NUMBER = 2;
    private int capCase_ = 0;
    private Object cap_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ActivityPayload$1, reason: invalid class name */
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
        ActivityPayload activityPayload = new ActivityPayload();
        DEFAULT_INSTANCE = activityPayload;
        h.registerDefaultInstance(ActivityPayload.class, activityPayload);
    }

    private ActivityPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAck() {
        if (this.capCase_ == 3) {
            this.capCase_ = 0;
            this.cap_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCap() {
        this.capCase_ = 0;
        this.cap_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReaction() {
        if (this.capCase_ == 1) {
            this.capCase_ = 0;
            this.cap_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceipt() {
        if (this.capCase_ == 2) {
            this.capCase_ = 0;
            this.cap_ = null;
        }
    }

    public static ActivityPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAck(Ack ack) {
        ack.getClass();
        if (this.capCase_ != 3 || this.cap_ == Ack.getDefaultInstance()) {
            this.cap_ = ack;
        } else {
            this.cap_ = ((Ack.Builder) Ack.newBuilder((Ack) this.cap_).mergeFrom(ack)).buildPartial();
        }
        this.capCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReaction(Reaction reaction) {
        reaction.getClass();
        if (this.capCase_ != 1 || this.cap_ == Reaction.getDefaultInstance()) {
            this.cap_ = reaction;
        } else {
            this.cap_ = ((Reaction.Builder) Reaction.newBuilder((Reaction) this.cap_).mergeFrom(reaction)).buildPartial();
        }
        this.capCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReceipt(Receipt receipt) {
        receipt.getClass();
        if (this.capCase_ != 2 || this.cap_ == Receipt.getDefaultInstance()) {
            this.cap_ = receipt;
        } else {
            this.cap_ = ((Receipt.Builder) Receipt.newBuilder((Receipt) this.cap_).mergeFrom(receipt)).buildPartial();
        }
        this.capCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityPayload parseDelimitedFrom(InputStream inputStream) {
        return (ActivityPayload) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityPayload parseFrom(ByteBuffer byteBuffer) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAck(Ack ack) {
        ack.getClass();
        this.cap_ = ack;
        this.capCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReaction(Reaction reaction) {
        reaction.getClass();
        this.cap_ = reaction;
        this.capCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceipt(Receipt receipt) {
        receipt.getClass();
        this.cap_ = receipt;
        this.capCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"cap_", "capCase_", Reaction.class, Receipt.class, Ack.class});
        }
        if (iOrdinal == 3) {
            return new ActivityPayload();
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
        synchronized (ActivityPayload.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public Ack getAck() {
        return this.capCase_ == 3 ? (Ack) this.cap_ : Ack.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public CapCase getCapCase() {
        return CapCase.forNumber(this.capCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public Reaction getReaction() {
        return this.capCase_ == 1 ? (Reaction) this.cap_ : Reaction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public Receipt getReceipt() {
        return this.capCase_ == 2 ? (Receipt) this.cap_ : Receipt.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public boolean hasAck() {
        return this.capCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public boolean hasReaction() {
        return this.capCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public boolean hasReceipt() {
        return this.capCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ActivityPayloadOrBuilder {
        private Builder() {
            super(ActivityPayload.DEFAULT_INSTANCE);
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

        public Builder clearAck() {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).clearAck();
            return this;
        }

        public Builder clearCap() {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).clearCap();
            return this;
        }

        public Builder clearReaction() {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).clearReaction();
            return this;
        }

        public Builder clearReceipt() {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).clearReceipt();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public Ack getAck() {
            return ((ActivityPayload) ((g) this).instance).getAck();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public CapCase getCapCase() {
            return ((ActivityPayload) ((g) this).instance).getCapCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public Reaction getReaction() {
            return ((ActivityPayload) ((g) this).instance).getReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public Receipt getReceipt() {
            return ((ActivityPayload) ((g) this).instance).getReceipt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public boolean hasAck() {
            return ((ActivityPayload) ((g) this).instance).hasAck();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public boolean hasReaction() {
            return ((ActivityPayload) ((g) this).instance).hasReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public boolean hasReceipt() {
            return ((ActivityPayload) ((g) this).instance).hasReceipt();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAck(Ack ack) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).mergeAck(ack);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m9mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeReaction(Reaction reaction) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).mergeReaction(reaction);
            return this;
        }

        public Builder mergeReceipt(Receipt receipt) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).mergeReceipt(receipt);
            return this;
        }

        public Builder setAck(Ack.Builder builder) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).setAck((Ack) builder.build());
            return this;
        }

        public Builder setReaction(Reaction.Builder builder) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).setReaction((Reaction) builder.build());
            return this;
        }

        public Builder setReceipt(Receipt.Builder builder) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).setReceipt((Receipt) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m8clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m10mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m7clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m11mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAck(Ack ack) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).setAck(ack);
            return this;
        }

        public Builder setReaction(Reaction reaction) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).setReaction(reaction);
            return this;
        }

        public Builder setReceipt(Receipt receipt) {
            copyOnWrite();
            ((ActivityPayload) ((g) this).instance).setReceipt(receipt);
            return this;
        }
    }

    public enum CapCase {
        REACTION(1),
        RECEIPT(2),
        ACK(3),
        CAP_NOT_SET(0);

        private final int value;

        CapCase(int i) {
            this.value = i;
        }

        public static CapCase forNumber(int i) {
            if (i == 0) {
                return CAP_NOT_SET;
            }
            if (i == 1) {
                return REACTION;
            }
            if (i == 2) {
                return RECEIPT;
            }
            if (i != 3) {
                return null;
            }
            return ACK;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CapCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ActivityPayload activityPayload) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(activityPayload);
    }

    public static ActivityPayload parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ActivityPayload) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ActivityPayload parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ActivityPayload parseFrom(phc phcVar) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ActivityPayload parseFrom(phc phcVar, uz00 uz00Var) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ActivityPayload parseFrom(byte[] bArr) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityPayload parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ActivityPayload parseFrom(InputStream inputStream) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityPayload parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ActivityPayload parseFrom(lwg lwgVar) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ActivityPayload parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ActivityPayload) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
