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
public final class HierarchyRequest extends h implements HierarchyRequestOrBuilder {
    public static final int ADD_MEMBERS_FIELD_NUMBER = 7;
    public static final int CREATE_NEW_FIELD_NUMBER = 8;
    private static final HierarchyRequest DEFAULT_INSTANCE;
    public static final int DELETE_CHANNEL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PARTICIPATION_STATUS_FIELD_NUMBER = 4;
    public static final int REMOVE_MEMBER_FIELD_NUMBER = 6;
    public static final int RENAME_GROUP_FIELD_NUMBER = 10;
    public static final int USER_ROLE_FIELD_NUMBER = 5;
    private int chrCase_ = 0;
    private Object chr_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyRequest$1, reason: invalid class name */
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
        HierarchyRequest hierarchyRequest = new HierarchyRequest();
        DEFAULT_INSTANCE = hierarchyRequest;
        h.registerDefaultInstance(HierarchyRequest.class, hierarchyRequest);
    }

    private HierarchyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddMembers() {
        if (this.chrCase_ == 7) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChr() {
        this.chrCase_ = 0;
        this.chr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateNew() {
        if (this.chrCase_ == 8) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteChannel() {
        if (this.chrCase_ == 3) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipationStatus() {
        if (this.chrCase_ == 4) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveMember() {
        if (this.chrCase_ == 6) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenameGroup() {
        if (this.chrCase_ == 10) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserRole() {
        if (this.chrCase_ == 5) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    public static HierarchyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        if (this.chrCase_ != 7 || this.chr_ == AddMembers.getDefaultInstance()) {
            this.chr_ = addMembers;
        } else {
            this.chr_ = ((AddMembers.Builder) AddMembers.newBuilder((AddMembers) this.chr_).mergeFrom(addMembers)).buildPartial();
        }
        this.chrCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateNew(CreateNew createNew) {
        createNew.getClass();
        if (this.chrCase_ != 8 || this.chr_ == CreateNew.getDefaultInstance()) {
            this.chr_ = createNew;
        } else {
            this.chr_ = ((CreateNew.Builder) CreateNew.newBuilder((CreateNew) this.chr_).mergeFrom(createNew)).buildPartial();
        }
        this.chrCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteChannel(DeleteChannel deleteChannel) {
        deleteChannel.getClass();
        if (this.chrCase_ != 3 || this.chr_ == DeleteChannel.getDefaultInstance()) {
            this.chr_ = deleteChannel;
        } else {
            this.chr_ = ((DeleteChannel.Builder) DeleteChannel.newBuilder((DeleteChannel) this.chr_).mergeFrom(deleteChannel)).buildPartial();
        }
        this.chrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipationStatus(SetParticipationStatus setParticipationStatus) {
        setParticipationStatus.getClass();
        if (this.chrCase_ != 4 || this.chr_ == SetParticipationStatus.getDefaultInstance()) {
            this.chr_ = setParticipationStatus;
        } else {
            this.chr_ = ((SetParticipationStatus.Builder) SetParticipationStatus.newBuilder((SetParticipationStatus) this.chr_).mergeFrom(setParticipationStatus)).buildPartial();
        }
        this.chrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveMember(RemoveMember removeMember) {
        removeMember.getClass();
        if (this.chrCase_ != 6 || this.chr_ == RemoveMember.getDefaultInstance()) {
            this.chr_ = removeMember;
        } else {
            this.chr_ = ((RemoveMember.Builder) RemoveMember.newBuilder((RemoveMember) this.chr_).mergeFrom(removeMember)).buildPartial();
        }
        this.chrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRenameGroup(RenameGroup renameGroup) {
        renameGroup.getClass();
        if (this.chrCase_ != 10 || this.chr_ == RenameGroup.getDefaultInstance()) {
            this.chr_ = renameGroup;
        } else {
            this.chr_ = ((RenameGroup.Builder) RenameGroup.newBuilder((RenameGroup) this.chr_).mergeFrom(renameGroup)).buildPartial();
        }
        this.chrCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserRole(SetUserRole setUserRole) {
        setUserRole.getClass();
        if (this.chrCase_ != 5 || this.chr_ == SetUserRole.getDefaultInstance()) {
            this.chr_ = setUserRole;
        } else {
            this.chr_ = ((SetUserRole.Builder) SetUserRole.newBuilder((SetUserRole) this.chr_).mergeFrom(setUserRole)).buildPartial();
        }
        this.chrCase_ = 5;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyRequest parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyRequest parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        this.chr_ = addMembers;
        this.chrCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateNew(CreateNew createNew) {
        createNew.getClass();
        this.chr_ = createNew;
        this.chrCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteChannel(DeleteChannel deleteChannel) {
        deleteChannel.getClass();
        this.chr_ = deleteChannel;
        this.chrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipationStatus(SetParticipationStatus setParticipationStatus) {
        setParticipationStatus.getClass();
        this.chr_ = setParticipationStatus;
        this.chrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveMember(RemoveMember removeMember) {
        removeMember.getClass();
        this.chr_ = removeMember;
        this.chrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenameGroup(RenameGroup renameGroup) {
        renameGroup.getClass();
        this.chr_ = renameGroup;
        this.chrCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRole(SetUserRole setUserRole) {
        setUserRole.getClass();
        this.chr_ = setUserRole;
        this.chrCase_ = 5;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0003\n\u0007\u0000\u0000\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000", new Object[]{"chr_", "chrCase_", DeleteChannel.class, SetParticipationStatus.class, SetUserRole.class, RemoveMember.class, AddMembers.class, CreateNew.class, RenameGroup.class});
        }
        if (iOrdinal == 3) {
            return new HierarchyRequest();
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
        synchronized (HierarchyRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public AddMembers getAddMembers() {
        return this.chrCase_ == 7 ? (AddMembers) this.chr_ : AddMembers.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public ChrCase getChrCase() {
        return ChrCase.forNumber(this.chrCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public CreateNew getCreateNew() {
        return this.chrCase_ == 8 ? (CreateNew) this.chr_ : CreateNew.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public DeleteChannel getDeleteChannel() {
        return this.chrCase_ == 3 ? (DeleteChannel) this.chr_ : DeleteChannel.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public SetParticipationStatus getParticipationStatus() {
        return this.chrCase_ == 4 ? (SetParticipationStatus) this.chr_ : SetParticipationStatus.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public RemoveMember getRemoveMember() {
        return this.chrCase_ == 6 ? (RemoveMember) this.chr_ : RemoveMember.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public RenameGroup getRenameGroup() {
        return this.chrCase_ == 10 ? (RenameGroup) this.chr_ : RenameGroup.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public SetUserRole getUserRole() {
        return this.chrCase_ == 5 ? (SetUserRole) this.chr_ : SetUserRole.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasAddMembers() {
        return this.chrCase_ == 7;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasCreateNew() {
        return this.chrCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasDeleteChannel() {
        return this.chrCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasParticipationStatus() {
        return this.chrCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasRemoveMember() {
        return this.chrCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasRenameGroup() {
        return this.chrCase_ == 10;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasUserRole() {
        return this.chrCase_ == 5;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyRequestOrBuilder {
        private Builder() {
            super(HierarchyRequest.DEFAULT_INSTANCE);
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

        public Builder clearAddMembers() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearAddMembers();
            return this;
        }

        public Builder clearChr() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearChr();
            return this;
        }

        public Builder clearCreateNew() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearCreateNew();
            return this;
        }

        public Builder clearDeleteChannel() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearDeleteChannel();
            return this;
        }

        public Builder clearParticipationStatus() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearParticipationStatus();
            return this;
        }

        public Builder clearRemoveMember() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearRemoveMember();
            return this;
        }

        public Builder clearRenameGroup() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearRenameGroup();
            return this;
        }

        public Builder clearUserRole() {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).clearUserRole();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public AddMembers getAddMembers() {
            return ((HierarchyRequest) ((g) this).instance).getAddMembers();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public ChrCase getChrCase() {
            return ((HierarchyRequest) ((g) this).instance).getChrCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public CreateNew getCreateNew() {
            return ((HierarchyRequest) ((g) this).instance).getCreateNew();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public DeleteChannel getDeleteChannel() {
            return ((HierarchyRequest) ((g) this).instance).getDeleteChannel();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public SetParticipationStatus getParticipationStatus() {
            return ((HierarchyRequest) ((g) this).instance).getParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public RemoveMember getRemoveMember() {
            return ((HierarchyRequest) ((g) this).instance).getRemoveMember();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public RenameGroup getRenameGroup() {
            return ((HierarchyRequest) ((g) this).instance).getRenameGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public SetUserRole getUserRole() {
            return ((HierarchyRequest) ((g) this).instance).getUserRole();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasAddMembers() {
            return ((HierarchyRequest) ((g) this).instance).hasAddMembers();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasCreateNew() {
            return ((HierarchyRequest) ((g) this).instance).hasCreateNew();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasDeleteChannel() {
            return ((HierarchyRequest) ((g) this).instance).hasDeleteChannel();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasParticipationStatus() {
            return ((HierarchyRequest) ((g) this).instance).hasParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasRemoveMember() {
            return ((HierarchyRequest) ((g) this).instance).hasRemoveMember();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasRenameGroup() {
            return ((HierarchyRequest) ((g) this).instance).hasRenameGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasUserRole() {
            return ((HierarchyRequest) ((g) this).instance).hasUserRole();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAddMembers(AddMembers addMembers) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeAddMembers(addMembers);
            return this;
        }

        public Builder mergeCreateNew(CreateNew createNew) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeCreateNew(createNew);
            return this;
        }

        public Builder mergeDeleteChannel(DeleteChannel deleteChannel) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeDeleteChannel(deleteChannel);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m408mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeParticipationStatus(SetParticipationStatus setParticipationStatus) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeParticipationStatus(setParticipationStatus);
            return this;
        }

        public Builder mergeRemoveMember(RemoveMember removeMember) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeRemoveMember(removeMember);
            return this;
        }

        public Builder mergeRenameGroup(RenameGroup renameGroup) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeRenameGroup(renameGroup);
            return this;
        }

        public Builder mergeUserRole(SetUserRole setUserRole) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).mergeUserRole(setUserRole);
            return this;
        }

        public Builder setAddMembers(AddMembers.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setAddMembers((AddMembers) builder.build());
            return this;
        }

        public Builder setCreateNew(CreateNew.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setCreateNew((CreateNew) builder.build());
            return this;
        }

        public Builder setDeleteChannel(DeleteChannel.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setDeleteChannel((DeleteChannel) builder.build());
            return this;
        }

        public Builder setParticipationStatus(SetParticipationStatus.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setParticipationStatus((SetParticipationStatus) builder.build());
            return this;
        }

        public Builder setRemoveMember(RemoveMember.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setRemoveMember((RemoveMember) builder.build());
            return this;
        }

        public Builder setRenameGroup(RenameGroup.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setRenameGroup((RenameGroup) builder.build());
            return this;
        }

        public Builder setUserRole(SetUserRole.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setUserRole((SetUserRole) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m407clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m409mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m406clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m410mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAddMembers(AddMembers addMembers) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setAddMembers(addMembers);
            return this;
        }

        public Builder setCreateNew(CreateNew createNew) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setCreateNew(createNew);
            return this;
        }

        public Builder setDeleteChannel(DeleteChannel deleteChannel) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setDeleteChannel(deleteChannel);
            return this;
        }

        public Builder setParticipationStatus(SetParticipationStatus setParticipationStatus) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setParticipationStatus(setParticipationStatus);
            return this;
        }

        public Builder setRemoveMember(RemoveMember removeMember) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setRemoveMember(removeMember);
            return this;
        }

        public Builder setRenameGroup(RenameGroup renameGroup) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setRenameGroup(renameGroup);
            return this;
        }

        public Builder setUserRole(SetUserRole setUserRole) {
            copyOnWrite();
            ((HierarchyRequest) ((g) this).instance).setUserRole(setUserRole);
            return this;
        }
    }

    public enum ChrCase {
        DELETE_CHANNEL(3),
        PARTICIPATION_STATUS(4),
        USER_ROLE(5),
        REMOVE_MEMBER(6),
        ADD_MEMBERS(7),
        CREATE_NEW(8),
        RENAME_GROUP(10),
        CHR_NOT_SET(0);

        private final int value;

        ChrCase(int i) {
            this.value = i;
        }

        public static ChrCase forNumber(int i) {
            if (i == 0) {
                return CHR_NOT_SET;
            }
            if (i == 10) {
                return RENAME_GROUP;
            }
            switch (i) {
                case 3:
                    return DELETE_CHANNEL;
                case 4:
                    return PARTICIPATION_STATUS;
                case 5:
                    return USER_ROLE;
                case 6:
                    return REMOVE_MEMBER;
                case 7:
                    return ADD_MEMBERS;
                case 8:
                    return CREATE_NEW;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ChrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(HierarchyRequest hierarchyRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyRequest);
    }

    public static HierarchyRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyRequest parseFrom(phc phcVar) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static HierarchyRequest parseFrom(byte[] bArr) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyRequest parseFrom(InputStream inputStream) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyRequest parseFrom(lwg lwgVar) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
