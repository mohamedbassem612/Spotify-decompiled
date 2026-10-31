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
public final class NodeClass extends h implements NodeClassOrBuilder {
    public static final int ACTIVITY_CLASS_FIELD_NUMBER = 3;
    public static final int CONTRIBUTION_CLASS_FIELD_NUMBER = 2;
    private static final NodeClass DEFAULT_INSTANCE;
    public static final int HIERARCHY_CLASS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int typeCase_ = 0;
    private Object type_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeClass$1, reason: invalid class name */
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
        NodeClass nodeClass = new NodeClass();
        DEFAULT_INSTANCE = nodeClass;
        h.registerDefaultInstance(NodeClass.class, nodeClass);
    }

    private NodeClass() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityClass() {
        if (this.typeCase_ == 3) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContributionClass() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyClass() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    public static NodeClass getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeClass parseDelimitedFrom(InputStream inputStream) {
        return (NodeClass) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeClass parseFrom(ByteBuffer byteBuffer) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityClass(ActivityClass activityClass) {
        this.type_ = Integer.valueOf(activityClass.getNumber());
        this.typeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityClassValue(int i) {
        this.typeCase_ = 3;
        this.type_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionClass(ContributionClass contributionClass) {
        this.type_ = Integer.valueOf(contributionClass.getNumber());
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionClassValue(int i) {
        this.typeCase_ = 2;
        this.type_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyClass(HierarchyClass hierarchyClass) {
        this.type_ = Integer.valueOf(hierarchyClass.getNumber());
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyClassValue(int i) {
        this.typeCase_ = 1;
        this.type_ = Integer.valueOf(i);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000", new Object[]{"type_", "typeCase_"});
        }
        if (iOrdinal == 3) {
            return new NodeClass();
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
        synchronized (NodeClass.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public ActivityClass getActivityClass() {
        if (this.typeCase_ != 3) {
            return ActivityClass.ACTIVITY_CLASS_UNSPECIFIED;
        }
        ActivityClass activityClassForNumber = ActivityClass.forNumber(((Integer) this.type_).intValue());
        return activityClassForNumber == null ? ActivityClass.UNRECOGNIZED : activityClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public int getActivityClassValue() {
        if (this.typeCase_ == 3) {
            return ((Integer) this.type_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public ContributionClass getContributionClass() {
        if (this.typeCase_ != 2) {
            return ContributionClass.CONTRIBUTION_CLASS_UNSPECIFIED;
        }
        ContributionClass contributionClassForNumber = ContributionClass.forNumber(((Integer) this.type_).intValue());
        return contributionClassForNumber == null ? ContributionClass.UNRECOGNIZED : contributionClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public int getContributionClassValue() {
        if (this.typeCase_ == 2) {
            return ((Integer) this.type_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public HierarchyClass getHierarchyClass() {
        if (this.typeCase_ != 1) {
            return HierarchyClass.HIERARCHY_CLASS_UNSPECIFIED;
        }
        HierarchyClass hierarchyClassForNumber = HierarchyClass.forNumber(((Integer) this.type_).intValue());
        return hierarchyClassForNumber == null ? HierarchyClass.UNRECOGNIZED : hierarchyClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public int getHierarchyClassValue() {
        if (this.typeCase_ == 1) {
            return ((Integer) this.type_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public TypeCase getTypeCase() {
        return TypeCase.forNumber(this.typeCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public boolean hasActivityClass() {
        return this.typeCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public boolean hasContributionClass() {
        return this.typeCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public boolean hasHierarchyClass() {
        return this.typeCase_ == 1;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements NodeClassOrBuilder {
        private Builder() {
            super(NodeClass.DEFAULT_INSTANCE);
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

        public Builder clearActivityClass() {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).clearActivityClass();
            return this;
        }

        public Builder clearContributionClass() {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).clearContributionClass();
            return this;
        }

        public Builder clearHierarchyClass() {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).clearHierarchyClass();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).clearType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public ActivityClass getActivityClass() {
            return ((NodeClass) ((g) this).instance).getActivityClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public int getActivityClassValue() {
            return ((NodeClass) ((g) this).instance).getActivityClassValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public ContributionClass getContributionClass() {
            return ((NodeClass) ((g) this).instance).getContributionClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public int getContributionClassValue() {
            return ((NodeClass) ((g) this).instance).getContributionClassValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public HierarchyClass getHierarchyClass() {
            return ((NodeClass) ((g) this).instance).getHierarchyClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public int getHierarchyClassValue() {
            return ((NodeClass) ((g) this).instance).getHierarchyClassValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public TypeCase getTypeCase() {
            return ((NodeClass) ((g) this).instance).getTypeCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public boolean hasActivityClass() {
            return ((NodeClass) ((g) this).instance).hasActivityClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public boolean hasContributionClass() {
            return ((NodeClass) ((g) this).instance).hasContributionClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public boolean hasHierarchyClass() {
            return ((NodeClass) ((g) this).instance).hasHierarchyClass();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m534mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setActivityClass(ActivityClass activityClass) {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).setActivityClass(activityClass);
            return this;
        }

        public Builder setActivityClassValue(int i) {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).setActivityClassValue(i);
            return this;
        }

        public Builder setContributionClass(ContributionClass contributionClass) {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).setContributionClass(contributionClass);
            return this;
        }

        public Builder setContributionClassValue(int i) {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).setContributionClassValue(i);
            return this;
        }

        public Builder setHierarchyClass(HierarchyClass hierarchyClass) {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).setHierarchyClass(hierarchyClass);
            return this;
        }

        public Builder setHierarchyClassValue(int i) {
            copyOnWrite();
            ((NodeClass) ((g) this).instance).setHierarchyClassValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m533clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m535mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m532clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m536mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public enum TypeCase {
        HIERARCHY_CLASS(1),
        CONTRIBUTION_CLASS(2),
        ACTIVITY_CLASS(3),
        TYPE_NOT_SET(0);

        private final int value;

        TypeCase(int i) {
            this.value = i;
        }

        public static TypeCase forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            if (i == 1) {
                return HIERARCHY_CLASS;
            }
            if (i == 2) {
                return CONTRIBUTION_CLASS;
            }
            if (i != 3) {
                return null;
            }
            return ACTIVITY_CLASS;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(NodeClass nodeClass) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeClass);
    }

    public static NodeClass parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (NodeClass) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static NodeClass parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static NodeClass parseFrom(phc phcVar) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static NodeClass parseFrom(phc phcVar, uz00 uz00Var) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static NodeClass parseFrom(byte[] bArr) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeClass parseFrom(byte[] bArr, uz00 uz00Var) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static NodeClass parseFrom(InputStream inputStream) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeClass parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static NodeClass parseFrom(lwg lwgVar) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static NodeClass parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (NodeClass) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
