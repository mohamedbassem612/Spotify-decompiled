package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CreateGroupRequest extends h implements CreateGroupRequestOrBuilder {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    private static final CreateGroupRequest DEFAULT_INSTANCE;
    public static final int MEMBER_USERNAME_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private h290 memberUsername_ = h.emptyProtobufList();
    private String name_ = "";

    static {
        CreateGroupRequest createGroupRequest = new CreateGroupRequest();
        DEFAULT_INSTANCE = createGroupRequest;
        h.registerDefaultInstance(CreateGroupRequest.class, createGroupRequest);
    }

    private CreateGroupRequest() {
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
    public void clearMemberUsername() {
        this.memberUsername_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureMemberUsernameIsMutable() {
        h290 h290Var = this.memberUsername_;
        if (((i9) h290Var).a) {
            return;
        }
        this.memberUsername_ = h.mutableCopy(h290Var);
    }

    public static CreateGroupRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        CreateGroupOptions createGroupOptions2 = this.createGroupOptions_;
        if (createGroupOptions2 == null || createGroupOptions2 == CreateGroupOptions.getDefaultInstance()) {
            this.createGroupOptions_ = createGroupOptions;
        } else {
            this.createGroupOptions_ = CreateGroupOptions.newBuilder(this.createGroupOptions_).mergeFrom(createGroupOptions).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateGroupRequest parseDelimitedFrom(InputStream inputStream) {
        return (CreateGroupRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupRequest parseFrom(ByteBuffer byteBuffer) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ț\u0003ለ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "memberUsername_", "name_", "createGroupOptions_"});
        }
        if (iOrdinal == 3) {
            return new CreateGroupRequest();
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
        synchronized (CreateGroupRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public String getMemberUsername(int i) {
        return (String) this.memberUsername_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public phc getMemberUsernameBytes(int i) {
        return phc.i((String) this.memberUsername_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public int getMemberUsernameCount() {
        return this.memberUsername_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public List<String> getMemberUsernameList() {
        return this.memberUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(CreateGroupRequest createGroupRequest) {
        return DEFAULT_INSTANCE.createBuilder(createGroupRequest);
    }

    public static CreateGroupRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateGroupRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateGroupRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CreateGroupRequest parseFrom(phc phcVar) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CreateGroupRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CreateGroupRequest parseFrom(byte[] bArr) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateGroupRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CreateGroupRequest parseFrom(InputStream inputStream) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateGroupRequest parseFrom(lwg lwgVar) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CreateGroupRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CreateGroupRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
