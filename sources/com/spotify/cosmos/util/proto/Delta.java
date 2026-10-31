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
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Delta extends h implements DeltaOrBuilder {
    private static final Delta DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 2;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int index_;
    private int length_;
    private byte memoizedIsInitialized = 2;
    private int type_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.Delta$1, reason: invalid class name */
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
        Delta delta = new Delta();
        DEFAULT_INSTANCE = delta;
        h.registerDefaultInstance(Delta.class, delta);
    }

    private Delta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -3;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.bitField0_ &= -5;
        this.length_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static Delta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Delta parseDelimitedFrom(InputStream inputStream) {
        return (Delta) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Delta parseFrom(ByteBuffer byteBuffer) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.bitField0_ |= 2;
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(int i) {
        this.bitField0_ |= 4;
        this.length_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int i = 0;
        switch (jf40Var.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "type_", Type.internalGetVerifier(), "index_", "length_"});
            case 3:
                return new Delta();
            case 4:
                return new Builder(i);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qzr0 qzr0Var = PARSER;
                if (qzr0Var != null) {
                    return qzr0Var;
                }
                synchronized (Delta.class) {
                    try {
                        bf40Var = PARSER;
                        if (bf40Var == null) {
                            bf40Var = new bf40(DEFAULT_INSTANCE);
                            PARSER = bf40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bf40Var;
            default:
                throw null;
        }
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public int getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.DELETE : typeForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public boolean hasIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public boolean hasLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DeltaOrBuilder {
        private Builder() {
            super(Delta.DEFAULT_INSTANCE);
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

        public Builder clearIndex() {
            copyOnWrite();
            ((Delta) ((g) this).instance).clearIndex();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((Delta) ((g) this).instance).clearLength();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Delta) ((g) this).instance).clearType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public int getIndex() {
            return ((Delta) ((g) this).instance).getIndex();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public int getLength() {
            return ((Delta) ((g) this).instance).getLength();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public Type getType() {
            return ((Delta) ((g) this).instance).getType();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public boolean hasIndex() {
            return ((Delta) ((g) this).instance).hasIndex();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public boolean hasLength() {
            return ((Delta) ((g) this).instance).hasLength();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public boolean hasType() {
            return ((Delta) ((g) this).instance).hasType();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1415mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((Delta) ((g) this).instance).setIndex(i);
            return this;
        }

        public Builder setLength(int i) {
            copyOnWrite();
            ((Delta) ((g) this).instance).setLength(i);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((Delta) ((g) this).instance).setType(type);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1414clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1416mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1413clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1417mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public enum Type implements v190 {
        DELETE(0),
        INSERT(1);

        public static final int DELETE_VALUE = 0;
        public static final int INSERT_VALUE = 1;
        private static final y190 internalValueMap = new y190() { // from class: com.spotify.cosmos.util.proto.Delta.Type.1
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public Type m1418findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        private final int value;

        public static final class TypeVerifier implements z190 {
            static final z190 INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            public boolean isInRange(int i) {
                return Type.forNumber(i) != null;
            }
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return DELETE;
            }
            if (i != 1) {
                return null;
            }
            return INSERT;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(Delta delta) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(delta);
    }

    public static Delta parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Delta) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Delta parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Delta parseFrom(phc phcVar) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Delta parseFrom(phc phcVar, uz00 uz00Var) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Delta parseFrom(byte[] bArr) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Delta parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Delta parseFrom(InputStream inputStream) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Delta parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Delta parseFrom(lwg lwgVar) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Delta parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Delta) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
