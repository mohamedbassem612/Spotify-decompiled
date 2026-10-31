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
public final class Ack extends h implements AckOrBuilder {
    public static final int ACK_TYPE_FIELD_NUMBER = 1;
    private static final Ack DEFAULT_INSTANCE;
    public static final int INITIATOR_USERNAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int ackType_;
    private String initiatorUsername_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Ack$1, reason: invalid class name */
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
        Ack ack = new Ack();
        DEFAULT_INSTANCE = ack;
        h.registerDefaultInstance(Ack.class, ack);
    }

    private Ack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckType() {
        this.ackType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitiatorUsername() {
        this.initiatorUsername_ = getDefaultInstance().getInitiatorUsername();
    }

    public static Ack getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Ack parseDelimitedFrom(InputStream inputStream) {
        return (Ack) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ack parseFrom(ByteBuffer byteBuffer) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckType(AckType ackType) {
        this.ackType_ = ackType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckTypeValue(int i) {
        this.ackType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsername(String str) {
        str.getClass();
        this.initiatorUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.initiatorUsername_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"ackType_", "initiatorUsername_"});
        }
        if (iOrdinal == 3) {
            return new Ack();
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
        synchronized (Ack.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
    public AckType getAckType() {
        AckType ackTypeForNumber = AckType.forNumber(this.ackType_);
        return ackTypeForNumber == null ? AckType.UNRECOGNIZED : ackTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
    public int getAckTypeValue() {
        return this.ackType_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
    public String getInitiatorUsername() {
        return this.initiatorUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
    public phc getInitiatorUsernameBytes() {
        return phc.i(this.initiatorUsername_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AckOrBuilder {
        private Builder() {
            super(Ack.DEFAULT_INSTANCE);
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
            ((Ack) ((g) this).instance).clearAckType();
            return this;
        }

        public Builder clearInitiatorUsername() {
            copyOnWrite();
            ((Ack) ((g) this).instance).clearInitiatorUsername();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
        public AckType getAckType() {
            return ((Ack) ((g) this).instance).getAckType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
        public int getAckTypeValue() {
            return ((Ack) ((g) this).instance).getAckTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
        public String getInitiatorUsername() {
            return ((Ack) ((g) this).instance).getInitiatorUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AckOrBuilder
        public phc getInitiatorUsernameBytes() {
            return ((Ack) ((g) this).instance).getInitiatorUsernameBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m2mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAckType(AckType ackType) {
            copyOnWrite();
            ((Ack) ((g) this).instance).setAckType(ackType);
            return this;
        }

        public Builder setAckTypeValue(int i) {
            copyOnWrite();
            ((Ack) ((g) this).instance).setAckTypeValue(i);
            return this;
        }

        public Builder setInitiatorUsername(String str) {
            copyOnWrite();
            ((Ack) ((g) this).instance).setInitiatorUsername(str);
            return this;
        }

        public Builder setInitiatorUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((Ack) ((g) this).instance).setInitiatorUsernameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m3mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m0clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m4mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(Ack ack) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ack);
    }

    public static Ack parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Ack) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Ack parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Ack parseFrom(phc phcVar) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Ack parseFrom(phc phcVar, uz00 uz00Var) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Ack parseFrom(byte[] bArr) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ack parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Ack parseFrom(InputStream inputStream) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ack parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Ack parseFrom(lwg lwgVar) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Ack parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Ack) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
