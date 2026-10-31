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
public final class AddContributionForGroup extends h implements AddContributionForGroupOrBuilder {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    public static final int CREATE_NEW_HIERARCHY_FIELD_NUMBER = 3;
    private static final AddContributionForGroup DEFAULT_INSTANCE;
    public static final int GROUP_DETAIL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private boolean createNewHierarchy_;
    private GroupDetail groupDetail_;
    private ContributionPayload payload_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddContributionForGroup$1, reason: invalid class name */
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
        AddContributionForGroup addContributionForGroup = new AddContributionForGroup();
        DEFAULT_INSTANCE = addContributionForGroup;
        h.registerDefaultInstance(AddContributionForGroup.class, addContributionForGroup);
    }

    private AddContributionForGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateGroupOptions() {
        this.createGroupOptions_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateNewHierarchy() {
        this.createNewHierarchy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupDetail() {
        this.groupDetail_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
        this.bitField0_ &= -3;
    }

    public static AddContributionForGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        CreateGroupOptions createGroupOptions2 = this.createGroupOptions_;
        if (createGroupOptions2 == null || createGroupOptions2 == CreateGroupOptions.getDefaultInstance()) {
            this.createGroupOptions_ = createGroupOptions;
        } else {
            this.createGroupOptions_ = (CreateGroupOptions) ((CreateGroupOptions.Builder) CreateGroupOptions.newBuilder(this.createGroupOptions_).mergeFrom(createGroupOptions)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroupDetail(GroupDetail groupDetail) {
        groupDetail.getClass();
        GroupDetail groupDetail2 = this.groupDetail_;
        if (groupDetail2 == null || groupDetail2 == GroupDetail.getDefaultInstance()) {
            this.groupDetail_ = groupDetail;
        } else {
            this.groupDetail_ = (GroupDetail) ((GroupDetail.Builder) GroupDetail.newBuilder(this.groupDetail_).mergeFrom(groupDetail)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        ContributionPayload contributionPayload2 = this.payload_;
        if (contributionPayload2 == null || contributionPayload2 == ContributionPayload.getDefaultInstance()) {
            this.payload_ = contributionPayload;
        } else {
            this.payload_ = (ContributionPayload) ((ContributionPayload.Builder) ContributionPayload.newBuilder(this.payload_).mergeFrom(contributionPayload)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddContributionForGroup parseDelimitedFrom(InputStream inputStream) {
        return (AddContributionForGroup) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContributionForGroup parseFrom(ByteBuffer byteBuffer) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        this.createGroupOptions_ = createGroupOptions;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateNewHierarchy(boolean z) {
        this.createNewHierarchy_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupDetail(GroupDetail groupDetail) {
        groupDetail.getClass();
        this.groupDetail_ = groupDetail;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        this.payload_ = contributionPayload;
        this.bitField0_ |= 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004ဉ\u0002", new Object[]{"bitField0_", "groupDetail_", "payload_", "createNewHierarchy_", "createGroupOptions_"});
        }
        if (iOrdinal == 3) {
            return new AddContributionForGroup();
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
        synchronized (AddContributionForGroup.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    @Deprecated
    public boolean getCreateNewHierarchy() {
        return this.createNewHierarchy_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public GroupDetail getGroupDetail() {
        GroupDetail groupDetail = this.groupDetail_;
        return groupDetail == null ? GroupDetail.getDefaultInstance() : groupDetail;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public ContributionPayload getPayload() {
        ContributionPayload contributionPayload = this.payload_;
        return contributionPayload == null ? ContributionPayload.getDefaultInstance() : contributionPayload;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public boolean hasGroupDetail() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public boolean hasPayload() {
        return (this.bitField0_ & 2) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AddContributionForGroupOrBuilder {
        private Builder() {
            super(AddContributionForGroup.DEFAULT_INSTANCE);
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

        public Builder clearCreateGroupOptions() {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).clearCreateGroupOptions();
            return this;
        }

        @Deprecated
        public Builder clearCreateNewHierarchy() {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).clearCreateNewHierarchy();
            return this;
        }

        public Builder clearGroupDetail() {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).clearGroupDetail();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).clearPayload();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public CreateGroupOptions getCreateGroupOptions() {
            return ((AddContributionForGroup) ((g) this).instance).getCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        @Deprecated
        public boolean getCreateNewHierarchy() {
            return ((AddContributionForGroup) ((g) this).instance).getCreateNewHierarchy();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public GroupDetail getGroupDetail() {
            return ((AddContributionForGroup) ((g) this).instance).getGroupDetail();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public ContributionPayload getPayload() {
            return ((AddContributionForGroup) ((g) this).instance).getPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public boolean hasCreateGroupOptions() {
            return ((AddContributionForGroup) ((g) this).instance).hasCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public boolean hasGroupDetail() {
            return ((AddContributionForGroup) ((g) this).instance).hasGroupDetail();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public boolean hasPayload() {
            return ((AddContributionForGroup) ((g) this).instance).hasPayload();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).mergeCreateGroupOptions(createGroupOptions);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m29mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeGroupDetail(GroupDetail groupDetail) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).mergeGroupDetail(groupDetail);
            return this;
        }

        public Builder mergePayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).mergePayload(contributionPayload);
            return this;
        }

        public Builder setCreateGroupOptions(CreateGroupOptions.Builder builder) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setCreateGroupOptions((CreateGroupOptions) builder.build());
            return this;
        }

        @Deprecated
        public Builder setCreateNewHierarchy(boolean z) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setCreateNewHierarchy(z);
            return this;
        }

        public Builder setGroupDetail(GroupDetail.Builder builder) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setGroupDetail((GroupDetail) builder.build());
            return this;
        }

        public Builder setPayload(ContributionPayload.Builder builder) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setPayload((ContributionPayload) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m28clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m30mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m27clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m31mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setCreateGroupOptions(createGroupOptions);
            return this;
        }

        public Builder setGroupDetail(GroupDetail groupDetail) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setGroupDetail(groupDetail);
            return this;
        }

        public Builder setPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((AddContributionForGroup) ((g) this).instance).setPayload(contributionPayload);
            return this;
        }
    }

    public static Builder newBuilder(AddContributionForGroup addContributionForGroup) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addContributionForGroup);
    }

    public static AddContributionForGroup parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddContributionForGroup) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddContributionForGroup parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AddContributionForGroup parseFrom(phc phcVar) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AddContributionForGroup parseFrom(phc phcVar, uz00 uz00Var) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AddContributionForGroup parseFrom(byte[] bArr) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddContributionForGroup parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AddContributionForGroup parseFrom(InputStream inputStream) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContributionForGroup parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddContributionForGroup parseFrom(lwg lwgVar) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AddContributionForGroup parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AddContributionForGroup) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
