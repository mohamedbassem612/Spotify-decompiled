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
public final class GroupDetail extends h implements GroupDetailOrBuilder {
    private static final GroupDetail DEFAULT_INSTANCE;
    public static final int MEMBER_USERNAME_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private h290 memberUsername_ = h.emptyProtobufList();
    private String name_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.GroupDetail$1, reason: invalid class name */
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
        GroupDetail groupDetail = new GroupDetail();
        DEFAULT_INSTANCE = groupDetail;
        h.registerDefaultInstance(GroupDetail.class, groupDetail);
    }

    private GroupDetail() {
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
    public void clearMemberUsername() {
        this.memberUsername_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureMemberUsernameIsMutable() {
        i9 i9Var = this.memberUsername_;
        if (i9Var.a) {
            return;
        }
        this.memberUsername_ = h.mutableCopy(i9Var);
    }

    public static GroupDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GroupDetail parseDelimitedFrom(InputStream inputStream) {
        return (GroupDetail) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GroupDetail parseFrom(ByteBuffer byteBuffer) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.name_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002Ț\u0003Ȉ", new Object[]{"memberUsername_", "name_"});
        }
        if (iOrdinal == 3) {
            return new GroupDetail();
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
        synchronized (GroupDetail.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public String getMemberUsername(int i) {
        return (String) this.memberUsername_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public phc getMemberUsernameBytes(int i) {
        return phc.i((String) this.memberUsername_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public int getMemberUsernameCount() {
        return this.memberUsername_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public List<String> getMemberUsernameList() {
        return this.memberUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GroupDetailOrBuilder {
        private Builder() {
            super(GroupDetail.DEFAULT_INSTANCE);
        }

        public Builder addAllMemberUsername(Iterable<String> iterable) {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).addAllMemberUsername(iterable);
            return this;
        }

        public Builder addMemberUsername(String str) {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).addMemberUsername(str);
            return this;
        }

        public Builder addMemberUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).addMemberUsernameBytes(phcVar);
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

        public Builder clearMemberUsername() {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).clearMemberUsername();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).clearName();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public String getMemberUsername(int i) {
            return ((GroupDetail) ((g) this).instance).getMemberUsername(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public phc getMemberUsernameBytes(int i) {
            return ((GroupDetail) ((g) this).instance).getMemberUsernameBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public int getMemberUsernameCount() {
            return ((GroupDetail) ((g) this).instance).getMemberUsernameCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public List<String> getMemberUsernameList() {
            return Collections.unmodifiableList(((GroupDetail) ((g) this).instance).getMemberUsernameList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public String getName() {
            return ((GroupDetail) ((g) this).instance).getName();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupDetailOrBuilder
        public phc getNameBytes() {
            return ((GroupDetail) ((g) this).instance).getNameBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m350mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setMemberUsername(int i, String str) {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).setMemberUsername(i, str);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((GroupDetail) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m349clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m351mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m348clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m352mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GroupDetail groupDetail) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(groupDetail);
    }

    public static GroupDetail parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GroupDetail) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GroupDetail parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GroupDetail parseFrom(phc phcVar) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GroupDetail parseFrom(phc phcVar, uz00 uz00Var) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GroupDetail parseFrom(byte[] bArr) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GroupDetail parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GroupDetail parseFrom(InputStream inputStream) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GroupDetail parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GroupDetail parseFrom(lwg lwgVar) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GroupDetail parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GroupDetail) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
