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
public final class SharedHierarchyEntry extends h implements SharedHierarchyEntryOrBuilder {
    private static final SharedHierarchyEntry DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private HierarchyIdentifier identifier_;
    private int type_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntry$1, reason: invalid class name */
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
        SharedHierarchyEntry sharedHierarchyEntry = new SharedHierarchyEntry();
        DEFAULT_INSTANCE = sharedHierarchyEntry;
        h.registerDefaultInstance(SharedHierarchyEntry.class, sharedHierarchyEntry);
    }

    private SharedHierarchyEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifier() {
        this.identifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static SharedHierarchyEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        HierarchyIdentifier hierarchyIdentifier2 = this.identifier_;
        if (hierarchyIdentifier2 == null || hierarchyIdentifier2 == HierarchyIdentifier.getDefaultInstance()) {
            this.identifier_ = hierarchyIdentifier;
        } else {
            this.identifier_ = (HierarchyIdentifier) ((HierarchyIdentifier.Builder) HierarchyIdentifier.newBuilder(this.identifier_).mergeFrom(hierarchyIdentifier)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SharedHierarchyEntry parseDelimitedFrom(InputStream inputStream) {
        return (SharedHierarchyEntry) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchyEntry parseFrom(ByteBuffer byteBuffer) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        this.identifier_ = hierarchyIdentifier;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(HierarchyType hierarchyType) {
        this.type_ = hierarchyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "identifier_", "type_"});
        }
        if (iOrdinal == 3) {
            return new SharedHierarchyEntry();
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
        synchronized (SharedHierarchyEntry.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public HierarchyIdentifier getIdentifier() {
        HierarchyIdentifier hierarchyIdentifier = this.identifier_;
        return hierarchyIdentifier == null ? HierarchyIdentifier.getDefaultInstance() : hierarchyIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public HierarchyType getType() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.type_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public boolean hasIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SharedHierarchyEntryOrBuilder {
        private Builder() {
            super(SharedHierarchyEntry.DEFAULT_INSTANCE);
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

        public Builder clearIdentifier() {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).clearIdentifier();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).clearType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public HierarchyIdentifier getIdentifier() {
            return ((SharedHierarchyEntry) ((g) this).instance).getIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public HierarchyType getType() {
            return ((SharedHierarchyEntry) ((g) this).instance).getType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public int getTypeValue() {
            return ((SharedHierarchyEntry) ((g) this).instance).getTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public boolean hasIdentifier() {
            return ((SharedHierarchyEntry) ((g) this).instance).hasIdentifier();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m715mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).mergeIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setIdentifier(HierarchyIdentifier.Builder builder) {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).setIdentifier((HierarchyIdentifier) builder.build());
            return this;
        }

        public Builder setType(HierarchyType hierarchyType) {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).setType(hierarchyType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).setTypeValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m714clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m716mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m713clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m717mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((SharedHierarchyEntry) ((g) this).instance).setIdentifier(hierarchyIdentifier);
            return this;
        }
    }

    public static Builder newBuilder(SharedHierarchyEntry sharedHierarchyEntry) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sharedHierarchyEntry);
    }

    public static SharedHierarchyEntry parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SharedHierarchyEntry) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SharedHierarchyEntry parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SharedHierarchyEntry parseFrom(phc phcVar) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SharedHierarchyEntry parseFrom(phc phcVar, uz00 uz00Var) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SharedHierarchyEntry parseFrom(byte[] bArr) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SharedHierarchyEntry parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SharedHierarchyEntry parseFrom(InputStream inputStream) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchyEntry parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SharedHierarchyEntry parseFrom(lwg lwgVar) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SharedHierarchyEntry parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SharedHierarchyEntry) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
