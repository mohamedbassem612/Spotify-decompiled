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
public final class Hierarchy extends h implements HierarchyOrBuilder {
    private static final Hierarchy DEFAULT_INSTANCE;
    public static final int GROUP_FIELD_NUMBER = 5;
    public static final int HIERARCHY_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int HIERARCHY_METADATA_FIELD_NUMBER = 4;
    public static final int HIERARCHY_STATISTIC_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Group group_;
    private HierarchyIdentifier hierarchyIdentifier_;
    private HierarchyMetadata hierarchyMetadata_;
    private HierarchyStatistic hierarchyStatistic_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Hierarchy$1, reason: invalid class name */
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
        Hierarchy hierarchy = new Hierarchy();
        DEFAULT_INSTANCE = hierarchy;
        h.registerDefaultInstance(Hierarchy.class, hierarchy);
    }

    private Hierarchy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroup() {
        this.group_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyIdentifier() {
        this.hierarchyIdentifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyMetadata() {
        this.hierarchyMetadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyStatistic() {
        this.hierarchyStatistic_ = null;
        this.bitField0_ &= -3;
    }

    public static Hierarchy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroup(Group group) {
        group.getClass();
        Group group2 = this.group_;
        if (group2 == null || group2 == Group.getDefaultInstance()) {
            this.group_ = group;
        } else {
            this.group_ = (Group) ((Group.Builder) Group.newBuilder(this.group_).mergeFrom(group)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        HierarchyIdentifier hierarchyIdentifier2 = this.hierarchyIdentifier_;
        if (hierarchyIdentifier2 == null || hierarchyIdentifier2 == HierarchyIdentifier.getDefaultInstance()) {
            this.hierarchyIdentifier_ = hierarchyIdentifier;
        } else {
            this.hierarchyIdentifier_ = (HierarchyIdentifier) ((HierarchyIdentifier.Builder) HierarchyIdentifier.newBuilder(this.hierarchyIdentifier_).mergeFrom(hierarchyIdentifier)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
        hierarchyMetadata.getClass();
        HierarchyMetadata hierarchyMetadata2 = this.hierarchyMetadata_;
        if (hierarchyMetadata2 == null || hierarchyMetadata2 == HierarchyMetadata.getDefaultInstance()) {
            this.hierarchyMetadata_ = hierarchyMetadata;
        } else {
            this.hierarchyMetadata_ = (HierarchyMetadata) ((HierarchyMetadata.Builder) HierarchyMetadata.newBuilder(this.hierarchyMetadata_).mergeFrom(hierarchyMetadata)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
        hierarchyStatistic.getClass();
        HierarchyStatistic hierarchyStatistic2 = this.hierarchyStatistic_;
        if (hierarchyStatistic2 == null || hierarchyStatistic2 == HierarchyStatistic.getDefaultInstance()) {
            this.hierarchyStatistic_ = hierarchyStatistic;
        } else {
            this.hierarchyStatistic_ = (HierarchyStatistic) ((HierarchyStatistic.Builder) HierarchyStatistic.newBuilder(this.hierarchyStatistic_).mergeFrom(hierarchyStatistic)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Hierarchy parseDelimitedFrom(InputStream inputStream) {
        return (Hierarchy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Hierarchy parseFrom(ByteBuffer byteBuffer) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroup(Group group) {
        group.getClass();
        this.group_ = group;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        this.hierarchyIdentifier_ = hierarchyIdentifier;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
        hierarchyMetadata.getClass();
        this.hierarchyMetadata_ = hierarchyMetadata;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
        hierarchyStatistic.getClass();
        this.hierarchyStatistic_ = hierarchyStatistic;
        this.bitField0_ |= 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "hierarchyIdentifier_", "hierarchyStatistic_", "hierarchyMetadata_", "group_"});
        }
        if (iOrdinal == 3) {
            return new Hierarchy();
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
        synchronized (Hierarchy.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public Group getGroup() {
        Group group = this.group_;
        return group == null ? Group.getDefaultInstance() : group;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public HierarchyIdentifier getHierarchyIdentifier() {
        HierarchyIdentifier hierarchyIdentifier = this.hierarchyIdentifier_;
        return hierarchyIdentifier == null ? HierarchyIdentifier.getDefaultInstance() : hierarchyIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public HierarchyMetadata getHierarchyMetadata() {
        HierarchyMetadata hierarchyMetadata = this.hierarchyMetadata_;
        return hierarchyMetadata == null ? HierarchyMetadata.getDefaultInstance() : hierarchyMetadata;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public HierarchyStatistic getHierarchyStatistic() {
        HierarchyStatistic hierarchyStatistic = this.hierarchyStatistic_;
        return hierarchyStatistic == null ? HierarchyStatistic.getDefaultInstance() : hierarchyStatistic;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasGroup() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasHierarchyIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasHierarchyMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasHierarchyStatistic() {
        return (this.bitField0_ & 2) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyOrBuilder {
        private Builder() {
            super(Hierarchy.DEFAULT_INSTANCE);
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

        public Builder clearGroup() {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).clearGroup();
            return this;
        }

        public Builder clearHierarchyIdentifier() {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).clearHierarchyIdentifier();
            return this;
        }

        public Builder clearHierarchyMetadata() {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).clearHierarchyMetadata();
            return this;
        }

        public Builder clearHierarchyStatistic() {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).clearHierarchyStatistic();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public Group getGroup() {
            return ((Hierarchy) ((g) this).instance).getGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public HierarchyIdentifier getHierarchyIdentifier() {
            return ((Hierarchy) ((g) this).instance).getHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public HierarchyMetadata getHierarchyMetadata() {
            return ((Hierarchy) ((g) this).instance).getHierarchyMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public HierarchyStatistic getHierarchyStatistic() {
            return ((Hierarchy) ((g) this).instance).getHierarchyStatistic();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasGroup() {
            return ((Hierarchy) ((g) this).instance).hasGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasHierarchyIdentifier() {
            return ((Hierarchy) ((g) this).instance).hasHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasHierarchyMetadata() {
            return ((Hierarchy) ((g) this).instance).hasHierarchyMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasHierarchyStatistic() {
            return ((Hierarchy) ((g) this).instance).hasHierarchyStatistic();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m366mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeGroup(Group group) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).mergeGroup(group);
            return this;
        }

        public Builder mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).mergeHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder mergeHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).mergeHierarchyMetadata(hierarchyMetadata);
            return this;
        }

        public Builder mergeHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).mergeHierarchyStatistic(hierarchyStatistic);
            return this;
        }

        public Builder setGroup(Group.Builder builder) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setGroup((Group) builder.build());
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier.Builder builder) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setHierarchyIdentifier((HierarchyIdentifier) builder.build());
            return this;
        }

        public Builder setHierarchyMetadata(HierarchyMetadata.Builder builder) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setHierarchyMetadata((HierarchyMetadata) builder.build());
            return this;
        }

        public Builder setHierarchyStatistic(HierarchyStatistic.Builder builder) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setHierarchyStatistic((HierarchyStatistic) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m365clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m367mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m364clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m368mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setGroup(Group group) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setGroup(group);
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setHierarchyMetadata(hierarchyMetadata);
            return this;
        }

        public Builder setHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
            copyOnWrite();
            ((Hierarchy) ((g) this).instance).setHierarchyStatistic(hierarchyStatistic);
            return this;
        }
    }

    public static Builder newBuilder(Hierarchy hierarchy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchy);
    }

    public static Hierarchy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Hierarchy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Hierarchy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Hierarchy parseFrom(phc phcVar) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Hierarchy parseFrom(phc phcVar, uz00 uz00Var) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Hierarchy parseFrom(byte[] bArr) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Hierarchy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Hierarchy parseFrom(InputStream inputStream) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Hierarchy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Hierarchy parseFrom(lwg lwgVar) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Hierarchy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Hierarchy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
