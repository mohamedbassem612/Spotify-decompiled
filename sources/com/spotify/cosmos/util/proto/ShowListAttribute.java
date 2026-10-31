package com.spotify.cosmos.util.proto;

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
public final class ShowListAttribute extends h implements ShowListAttributeOrBuilder {
    private static final ShowListAttribute DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String key_ = "";
    private String value_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ShowListAttribute$1, reason: invalid class name */
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
        ShowListAttribute showListAttribute = new ShowListAttribute();
        DEFAULT_INSTANCE = showListAttribute;
        h.registerDefaultInstance(ShowListAttribute.class, showListAttribute);
    }

    private ShowListAttribute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static ShowListAttribute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowListAttribute parseDelimitedFrom(InputStream inputStream) {
        return (ShowListAttribute) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowListAttribute parseFrom(ByteBuffer byteBuffer) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(phc phcVar) {
        this.key_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(phc phcVar) {
        this.value_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "key_", "value_"});
        }
        if (iOrdinal == 3) {
            return new ShowListAttribute();
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
        synchronized (ShowListAttribute.class) {
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

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public phc getKeyBytes() {
        return phc.i(this.key_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public phc getValueBytes() {
        return phc.i(this.value_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ShowListAttributeOrBuilder {
        private Builder() {
            super(ShowListAttribute.DEFAULT_INSTANCE);
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

        public Builder clearKey() {
            copyOnWrite();
            ((ShowListAttribute) ((g) this).instance).clearKey();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((ShowListAttribute) ((g) this).instance).clearValue();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public String getKey() {
            return ((ShowListAttribute) ((g) this).instance).getKey();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public phc getKeyBytes() {
            return ((ShowListAttribute) ((g) this).instance).getKeyBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public String getValue() {
            return ((ShowListAttribute) ((g) this).instance).getValue();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public phc getValueBytes() {
            return ((ShowListAttribute) ((g) this).instance).getValueBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public boolean hasKey() {
            return ((ShowListAttribute) ((g) this).instance).hasKey();
        }

        @Override // com.spotify.cosmos.util.proto.ShowListAttributeOrBuilder
        public boolean hasValue() {
            return ((ShowListAttribute) ((g) this).instance).hasValue();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1456mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((ShowListAttribute) ((g) this).instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(phc phcVar) {
            copyOnWrite();
            ((ShowListAttribute) ((g) this).instance).setKeyBytes(phcVar);
            return this;
        }

        public Builder setValue(String str) {
            copyOnWrite();
            ((ShowListAttribute) ((g) this).instance).setValue(str);
            return this;
        }

        public Builder setValueBytes(phc phcVar) {
            copyOnWrite();
            ((ShowListAttribute) ((g) this).instance).setValueBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1455clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1457mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1454clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1458mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ShowListAttribute showListAttribute) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showListAttribute);
    }

    public static ShowListAttribute parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowListAttribute) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowListAttribute parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowListAttribute parseFrom(phc phcVar) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowListAttribute parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ShowListAttribute parseFrom(byte[] bArr) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowListAttribute parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowListAttribute parseFrom(InputStream inputStream) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowListAttribute parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowListAttribute parseFrom(lwg lwgVar) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowListAttribute parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowListAttribute) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
