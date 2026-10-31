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
public final class Group extends h implements GroupOrBuilder {
    private static final Group DEFAULT_INSTANCE;
    public static final int GROUP_MEMBER_FIELD_NUMBER = 2;
    public static final int INVITE_TOKEN_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String name_ = "";
    private h290 groupMember_ = h.emptyProtobufList();
    private h290 inviteToken_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Group$1, reason: invalid class name */
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
        Group group = new Group();
        DEFAULT_INSTANCE = group;
        h.registerDefaultInstance(Group.class, group);
    }

    private Group() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGroupMember(Iterable<? extends GroupMember> iterable) {
        ensureGroupMemberIsMutable();
        s8.addAll(iterable, this.groupMember_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInviteToken(Iterable<? extends InviteToken> iterable) {
        ensureInviteTokenIsMutable();
        s8.addAll(iterable, this.inviteToken_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroupMember(GroupMember groupMember) {
        groupMember.getClass();
        ensureGroupMemberIsMutable();
        this.groupMember_.add(groupMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInviteToken(InviteToken inviteToken) {
        inviteToken.getClass();
        ensureInviteTokenIsMutable();
        this.inviteToken_.add(inviteToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupMember() {
        this.groupMember_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInviteToken() {
        this.inviteToken_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureGroupMemberIsMutable() {
        i9 i9Var = this.groupMember_;
        if (i9Var.a) {
            return;
        }
        this.groupMember_ = h.mutableCopy(i9Var);
    }

    private void ensureInviteTokenIsMutable() {
        i9 i9Var = this.inviteToken_;
        if (i9Var.a) {
            return;
        }
        this.inviteToken_ = h.mutableCopy(i9Var);
    }

    public static Group getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Group parseDelimitedFrom(InputStream inputStream) {
        return (Group) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Group parseFrom(ByteBuffer byteBuffer) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGroupMember(int i) {
        ensureGroupMemberIsMutable();
        this.groupMember_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInviteToken(int i) {
        ensureInviteTokenIsMutable();
        this.inviteToken_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupMember(int i, GroupMember groupMember) {
        groupMember.getClass();
        ensureGroupMemberIsMutable();
        this.groupMember_.set(i, groupMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInviteToken(int i, InviteToken inviteToken) {
        inviteToken.getClass();
        ensureInviteTokenIsMutable();
        this.inviteToken_.set(i, inviteToken);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ለ\u0000\u0002\u001b\u0003\u001b", new Object[]{"bitField0_", "name_", "groupMember_", GroupMember.class, "inviteToken_", InviteToken.class});
        }
        if (iOrdinal == 3) {
            return new Group();
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
        synchronized (Group.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public GroupMember getGroupMember(int i) {
        return (GroupMember) this.groupMember_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public int getGroupMemberCount() {
        return this.groupMember_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public List<GroupMember> getGroupMemberList() {
        return this.groupMember_;
    }

    public GroupMemberOrBuilder getGroupMemberOrBuilder(int i) {
        return (GroupMemberOrBuilder) this.groupMember_.get(i);
    }

    public List<? extends GroupMemberOrBuilder> getGroupMemberOrBuilderList() {
        return this.groupMember_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public InviteToken getInviteToken(int i) {
        return (InviteToken) this.inviteToken_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public int getInviteTokenCount() {
        return this.inviteToken_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public List<InviteToken> getInviteTokenList() {
        return this.inviteToken_;
    }

    public InviteTokenOrBuilder getInviteTokenOrBuilder(int i) {
        return (InviteTokenOrBuilder) this.inviteToken_.get(i);
    }

    public List<? extends InviteTokenOrBuilder> getInviteTokenOrBuilderList() {
        return this.inviteToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GroupOrBuilder {
        private Builder() {
            super(Group.DEFAULT_INSTANCE);
        }

        public Builder addAllGroupMember(Iterable<? extends GroupMember> iterable) {
            copyOnWrite();
            ((Group) ((g) this).instance).addAllGroupMember(iterable);
            return this;
        }

        public Builder addAllInviteToken(Iterable<? extends InviteToken> iterable) {
            copyOnWrite();
            ((Group) ((g) this).instance).addAllInviteToken(iterable);
            return this;
        }

        public Builder addGroupMember(GroupMember.Builder builder) {
            copyOnWrite();
            ((Group) ((g) this).instance).addGroupMember((GroupMember) builder.build());
            return this;
        }

        public Builder addInviteToken(InviteToken.Builder builder) {
            copyOnWrite();
            ((Group) ((g) this).instance).addInviteToken((InviteToken) builder.build());
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

        public Builder clearGroupMember() {
            copyOnWrite();
            ((Group) ((g) this).instance).clearGroupMember();
            return this;
        }

        public Builder clearInviteToken() {
            copyOnWrite();
            ((Group) ((g) this).instance).clearInviteToken();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Group) ((g) this).instance).clearName();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public GroupMember getGroupMember(int i) {
            return ((Group) ((g) this).instance).getGroupMember(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public int getGroupMemberCount() {
            return ((Group) ((g) this).instance).getGroupMemberCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public List<GroupMember> getGroupMemberList() {
            return Collections.unmodifiableList(((Group) ((g) this).instance).getGroupMemberList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public InviteToken getInviteToken(int i) {
            return ((Group) ((g) this).instance).getInviteToken(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public int getInviteTokenCount() {
            return ((Group) ((g) this).instance).getInviteTokenCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public List<InviteToken> getInviteTokenList() {
            return Collections.unmodifiableList(((Group) ((g) this).instance).getInviteTokenList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public String getName() {
            return ((Group) ((g) this).instance).getName();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public phc getNameBytes() {
            return ((Group) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public boolean hasName() {
            return ((Group) ((g) this).instance).hasName();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m345mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeGroupMember(int i) {
            copyOnWrite();
            ((Group) ((g) this).instance).removeGroupMember(i);
            return this;
        }

        public Builder removeInviteToken(int i) {
            copyOnWrite();
            ((Group) ((g) this).instance).removeInviteToken(i);
            return this;
        }

        public Builder setGroupMember(int i, GroupMember.Builder builder) {
            copyOnWrite();
            ((Group) ((g) this).instance).setGroupMember(i, (GroupMember) builder.build());
            return this;
        }

        public Builder setInviteToken(int i, InviteToken.Builder builder) {
            copyOnWrite();
            ((Group) ((g) this).instance).setInviteToken(i, (InviteToken) builder.build());
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Group) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((Group) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m344clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m346mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m343clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m347mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addGroupMember(int i, GroupMember groupMember) {
            copyOnWrite();
            ((Group) ((g) this).instance).addGroupMember(i, groupMember);
            return this;
        }

        public Builder addInviteToken(int i, InviteToken inviteToken) {
            copyOnWrite();
            ((Group) ((g) this).instance).addInviteToken(i, inviteToken);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setGroupMember(int i, GroupMember groupMember) {
            copyOnWrite();
            ((Group) ((g) this).instance).setGroupMember(i, groupMember);
            return this;
        }

        public Builder setInviteToken(int i, InviteToken inviteToken) {
            copyOnWrite();
            ((Group) ((g) this).instance).setInviteToken(i, inviteToken);
            return this;
        }

        public Builder addGroupMember(GroupMember groupMember) {
            copyOnWrite();
            ((Group) ((g) this).instance).addGroupMember(groupMember);
            return this;
        }

        public Builder addInviteToken(InviteToken inviteToken) {
            copyOnWrite();
            ((Group) ((g) this).instance).addInviteToken(inviteToken);
            return this;
        }

        public Builder addGroupMember(int i, GroupMember.Builder builder) {
            copyOnWrite();
            ((Group) ((g) this).instance).addGroupMember(i, (GroupMember) builder.build());
            return this;
        }

        public Builder addInviteToken(int i, InviteToken.Builder builder) {
            copyOnWrite();
            ((Group) ((g) this).instance).addInviteToken(i, (InviteToken) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Group group) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(group);
    }

    public static Group parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Group) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Group parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Group parseFrom(phc phcVar) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Group parseFrom(phc phcVar, uz00 uz00Var) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroupMember(int i, GroupMember groupMember) {
        groupMember.getClass();
        ensureGroupMemberIsMutable();
        this.groupMember_.add(i, groupMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInviteToken(int i, InviteToken inviteToken) {
        inviteToken.getClass();
        ensureInviteTokenIsMutable();
        this.inviteToken_.add(i, inviteToken);
    }

    public static Group parseFrom(byte[] bArr) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Group parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Group parseFrom(InputStream inputStream) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Group parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Group parseFrom(lwg lwgVar) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Group parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Group) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
