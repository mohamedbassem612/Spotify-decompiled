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
public final class HierarchyIdentifier extends h implements HierarchyIdentifierOrBuilder {
    private static final HierarchyIdentifier DEFAULT_INSTANCE;
    public static final int HIERARCHY_CLASS_FIELD_NUMBER = 2;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 3;
    private int hierarchyClass_;
    private String hierarchyId_ = "";
    private String uri_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyIdentifier$1, reason: invalid class name */
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
        HierarchyIdentifier hierarchyIdentifier = new HierarchyIdentifier();
        DEFAULT_INSTANCE = hierarchyIdentifier;
        h.registerDefaultInstance(HierarchyIdentifier.class, hierarchyIdentifier);
    }

    private HierarchyIdentifier() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyClass() {
        this.hierarchyClass_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static HierarchyIdentifier getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyIdentifier parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyIdentifier) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyIdentifier parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyClass(HierarchyClass hierarchyClass) {
        this.hierarchyClass_ = hierarchyClass.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyClassValue(int i) {
        this.hierarchyClass_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.uri_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"hierarchyId_", "hierarchyClass_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new HierarchyIdentifier();
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
        synchronized (HierarchyIdentifier.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public HierarchyClass getHierarchyClass() {
        HierarchyClass hierarchyClassForNumber = HierarchyClass.forNumber(this.hierarchyClass_);
        return hierarchyClassForNumber == null ? HierarchyClass.UNRECOGNIZED : hierarchyClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public int getHierarchyClassValue() {
        return this.hierarchyClass_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyIdentifierOrBuilder {
        private Builder() {
            super(HierarchyIdentifier.DEFAULT_INSTANCE);
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

        public Builder clearHierarchyClass() {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).clearHierarchyClass();
            return this;
        }

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).clearHierarchyId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).clearUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public HierarchyClass getHierarchyClass() {
            return ((HierarchyIdentifier) ((g) this).instance).getHierarchyClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public int getHierarchyClassValue() {
            return ((HierarchyIdentifier) ((g) this).instance).getHierarchyClassValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public String getHierarchyId() {
            return ((HierarchyIdentifier) ((g) this).instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public phc getHierarchyIdBytes() {
            return ((HierarchyIdentifier) ((g) this).instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public String getUri() {
            return ((HierarchyIdentifier) ((g) this).instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyIdentifierOrBuilder
        public phc getUriBytes() {
            return ((HierarchyIdentifier) ((g) this).instance).getUriBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m377mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setHierarchyClass(HierarchyClass hierarchyClass) {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).setHierarchyClass(hierarchyClass);
            return this;
        }

        public Builder setHierarchyClassValue(int i) {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).setHierarchyClassValue(i);
            return this;
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(phc phcVar) {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).setHierarchyIdBytes(phcVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((HierarchyIdentifier) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m376clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m378mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m375clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m379mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(HierarchyIdentifier hierarchyIdentifier) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyIdentifier);
    }

    public static HierarchyIdentifier parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyIdentifier) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyIdentifier parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyIdentifier parseFrom(phc phcVar) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyIdentifier parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static HierarchyIdentifier parseFrom(byte[] bArr) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyIdentifier parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyIdentifier parseFrom(InputStream inputStream) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyIdentifier parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyIdentifier parseFrom(lwg lwgVar) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyIdentifier parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyIdentifier) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
