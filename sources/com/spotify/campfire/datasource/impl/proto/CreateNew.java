package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
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
public final class CreateNew extends h implements CreateNewOrBuilder {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    private static final CreateNew DEFAULT_INSTANCE;
    public static final int FRIEND_REQUEST_FIELD_NUMBER = 5;
    public static final int HIERARCHY_TYPE_FIELD_NUMBER = 1;
    public static final int MEMBER_USERNAME_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private boolean friendRequest_;
    private int hierarchyType_;
    private h290 memberUsername_ = h.emptyProtobufList();
    private String name_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CreateNew$1, reason: invalid class name */
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
        CreateNew createNew = new CreateNew();
        DEFAULT_INSTANCE = createNew;
        h.registerDefaultInstance(CreateNew.class, createNew);
    }

    private CreateNew() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemberUsername(Iterable<String> iterable) {
        ensureMemberUsernameIsMutable();
        s8.addAll(iterable, this.memberUsername_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemberUsername(String str) {
        str.getClass();
        ensureMemberUsernameIsMutable();
        this.memberUsername_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemberUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureMemberUsernameIsMutable();
        this.memberUsername_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateGroupOptions() {
        this.createGroupOptions_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFriendRequest() {
        this.bitField0_ &= -5;
        this.friendRequest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyType() {
        this.hierarchyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberUsername() {
        this.memberUsername_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureMemberUsernameIsMutable() {
        i9 i9Var = this.memberUsername_;
        if (i9Var.a) {
            return;
        }
        this.memberUsername_ = h.mutableCopy(i9Var);
    }

    public static CreateNew getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateNew parseDelimitedFrom(InputStream inputStream) {
        return (CreateNew) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateNew parseFrom(ByteBuffer byteBuffer) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        this.createGroupOptions_ = createGroupOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFriendRequest(boolean z) {
        this.bitField0_ |= 4;
        this.friendRequest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyType(HierarchyType hierarchyType) {
        this.hierarchyType_ = hierarchyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyTypeValue(int i) {
        this.hierarchyType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberUsername(int i, String str) {
        str.getClass();
        ensureMemberUsernameIsMutable();
        this.memberUsername_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.name_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002Ț\u0003ለ\u0000\u0004ဉ\u0001\u0005ဇ\u0002", new Object[]{"bitField0_", "hierarchyType_", "memberUsername_", "name_", "createGroupOptions_", "friendRequest_"});
        }
        if (iOrdinal == 3) {
            return new CreateNew();
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
        synchronized (CreateNew.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public boolean getFriendRequest() {
        return this.friendRequest_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public HierarchyType getHierarchyType() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.hierarchyType_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public int getHierarchyTypeValue() {
        return this.hierarchyType_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public String getMemberUsername(int i) {
        return (String) this.memberUsername_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public phc getMemberUsernameBytes(int i) {
        return phc.i((String) this.memberUsername_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public int getMemberUsernameCount() {
        return this.memberUsername_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public List<String> getMemberUsernameList() {
        return this.memberUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public boolean hasFriendRequest() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements CreateNewOrBuilder {
        private Builder() {
            super(CreateNew.DEFAULT_INSTANCE);
        }

        public Builder addAllMemberUsername(Iterable<String> iterable) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).addAllMemberUsername(iterable);
            return this;
        }

        public Builder addMemberUsername(String str) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).addMemberUsername(str);
            return this;
        }

        public Builder addMemberUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).addMemberUsernameBytes(phcVar);
            return this;
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
            ((CreateNew) ((g) this).instance).clearCreateGroupOptions();
            return this;
        }

        public Builder clearFriendRequest() {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).clearFriendRequest();
            return this;
        }

        public Builder clearHierarchyType() {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).clearHierarchyType();
            return this;
        }

        public Builder clearMemberUsername() {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).clearMemberUsername();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).clearName();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public CreateGroupOptions getCreateGroupOptions() {
            return ((CreateNew) ((g) this).instance).getCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public boolean getFriendRequest() {
            return ((CreateNew) ((g) this).instance).getFriendRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public HierarchyType getHierarchyType() {
            return ((CreateNew) ((g) this).instance).getHierarchyType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public int getHierarchyTypeValue() {
            return ((CreateNew) ((g) this).instance).getHierarchyTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public String getMemberUsername(int i) {
            return ((CreateNew) ((g) this).instance).getMemberUsername(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public phc getMemberUsernameBytes(int i) {
            return ((CreateNew) ((g) this).instance).getMemberUsernameBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public int getMemberUsernameCount() {
            return ((CreateNew) ((g) this).instance).getMemberUsernameCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public List<String> getMemberUsernameList() {
            return Collections.unmodifiableList(((CreateNew) ((g) this).instance).getMemberUsernameList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public String getName() {
            return ((CreateNew) ((g) this).instance).getName();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public phc getNameBytes() {
            return ((CreateNew) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public boolean hasCreateGroupOptions() {
            return ((CreateNew) ((g) this).instance).hasCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public boolean hasFriendRequest() {
            return ((CreateNew) ((g) this).instance).hasFriendRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateNewOrBuilder
        public boolean hasName() {
            return ((CreateNew) ((g) this).instance).hasName();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).mergeCreateGroupOptions(createGroupOptions);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m170mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setCreateGroupOptions(CreateGroupOptions.Builder builder) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setCreateGroupOptions((CreateGroupOptions) builder.build());
            return this;
        }

        public Builder setFriendRequest(boolean z) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setFriendRequest(z);
            return this;
        }

        public Builder setHierarchyType(HierarchyType hierarchyType) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setHierarchyType(hierarchyType);
            return this;
        }

        public Builder setHierarchyTypeValue(int i) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setHierarchyTypeValue(i);
            return this;
        }

        public Builder setMemberUsername(int i, String str) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setMemberUsername(i, str);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((CreateNew) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m169clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m171mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m168clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m172mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
            ((CreateNew) ((g) this).instance).setCreateGroupOptions(createGroupOptions);
            return this;
        }
    }

    public static Builder newBuilder(CreateNew createNew) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createNew);
    }

    public static CreateNew parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateNew) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateNew parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CreateNew parseFrom(phc phcVar) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CreateNew parseFrom(phc phcVar, uz00 uz00Var) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CreateNew parseFrom(byte[] bArr) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateNew parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CreateNew parseFrom(InputStream inputStream) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateNew parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateNew parseFrom(lwg lwgVar) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CreateNew parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CreateNew) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
