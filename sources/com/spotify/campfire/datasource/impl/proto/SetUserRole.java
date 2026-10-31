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
public final class SetUserRole extends h implements SetUserRoleOrBuilder {
    private static final SetUserRole DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    public static final int MEMBER_USERNAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USER_ROLE_FIELD_NUMBER = 2;
    private String hierarchyId_ = "";
    private String memberUsername_ = "";
    private int userRole_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.SetUserRole$1, reason: invalid class name */
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
        SetUserRole setUserRole = new SetUserRole();
        DEFAULT_INSTANCE = setUserRole;
        h.registerDefaultInstance(SetUserRole.class, setUserRole);
    }

    private SetUserRole() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberUsername() {
        this.memberUsername_ = getDefaultInstance().getMemberUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserRole() {
        this.userRole_ = 0;
    }

    public static SetUserRole getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SetUserRole parseDelimitedFrom(InputStream inputStream) {
        return (SetUserRole) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetUserRole parseFrom(ByteBuffer byteBuffer) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMemberUsername(String str) {
        str.getClass();
        this.memberUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.memberUsername_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRole(HierarchyUserRole hierarchyUserRole) {
        this.userRole_ = hierarchyUserRole.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRoleValue(int i) {
        this.userRole_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"hierarchyId_", "userRole_", "memberUsername_"});
        }
        if (iOrdinal == 3) {
            return new SetUserRole();
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
        synchronized (SetUserRole.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public String getMemberUsername() {
        return this.memberUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public phc getMemberUsernameBytes() {
        return phc.i(this.memberUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public HierarchyUserRole getUserRole() {
        HierarchyUserRole hierarchyUserRoleForNumber = HierarchyUserRole.forNumber(this.userRole_);
        return hierarchyUserRoleForNumber == null ? HierarchyUserRole.UNRECOGNIZED : hierarchyUserRoleForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
    public int getUserRoleValue() {
        return this.userRole_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SetUserRoleOrBuilder {
        private Builder() {
            super(SetUserRole.DEFAULT_INSTANCE);
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

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).clearHierarchyId();
            return this;
        }

        public Builder clearMemberUsername() {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).clearMemberUsername();
            return this;
        }

        public Builder clearUserRole() {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).clearUserRole();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public String getHierarchyId() {
            return ((SetUserRole) ((g) this).instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public phc getHierarchyIdBytes() {
            return ((SetUserRole) ((g) this).instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public String getMemberUsername() {
            return ((SetUserRole) ((g) this).instance).getMemberUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public phc getMemberUsernameBytes() {
            return ((SetUserRole) ((g) this).instance).getMemberUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public HierarchyUserRole getUserRole() {
            return ((SetUserRole) ((g) this).instance).getUserRole();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetUserRoleOrBuilder
        public int getUserRoleValue() {
            return ((SetUserRole) ((g) this).instance).getUserRoleValue();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m704mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(phc phcVar) {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).setHierarchyIdBytes(phcVar);
            return this;
        }

        public Builder setMemberUsername(String str) {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).setMemberUsername(str);
            return this;
        }

        public Builder setMemberUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).setMemberUsernameBytes(phcVar);
            return this;
        }

        public Builder setUserRole(HierarchyUserRole hierarchyUserRole) {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).setUserRole(hierarchyUserRole);
            return this;
        }

        public Builder setUserRoleValue(int i) {
            copyOnWrite();
            ((SetUserRole) ((g) this).instance).setUserRoleValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m703clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m705mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m702clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m706mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(SetUserRole setUserRole) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(setUserRole);
    }

    public static SetUserRole parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetUserRole) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetUserRole parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SetUserRole parseFrom(phc phcVar) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SetUserRole parseFrom(phc phcVar, uz00 uz00Var) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SetUserRole parseFrom(byte[] bArr) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetUserRole parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SetUserRole parseFrom(InputStream inputStream) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetUserRole parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetUserRole parseFrom(lwg lwgVar) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SetUserRole parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SetUserRole) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
