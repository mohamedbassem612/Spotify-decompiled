package com.spotify.profileprivacy.proto.v1;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetProfilePrivacyRequest extends h implements GetProfilePrivacyRequestOrBuilder {
    private static final GetProfilePrivacyRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private int userCase_ = 0;
    private Object user_;

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest$1, reason: invalid class name */
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
        GetProfilePrivacyRequest getProfilePrivacyRequest = new GetProfilePrivacyRequest();
        DEFAULT_INSTANCE = getProfilePrivacyRequest;
        h.registerDefaultInstance(GetProfilePrivacyRequest.class, getProfilePrivacyRequest);
    }

    private GetProfilePrivacyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        this.userCase_ = 0;
        this.user_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        if (this.userCase_ == 2) {
            this.userCase_ = 0;
            this.user_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        if (this.userCase_ == 1) {
            this.userCase_ = 0;
            this.user_ = null;
        }
    }

    public static GetProfilePrivacyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetProfilePrivacyRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetProfilePrivacyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetProfilePrivacyRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        str.getClass();
        this.userCase_ = 2;
        this.user_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.user_ = phcVar.v();
        this.userCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.userCase_ = 1;
        this.user_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.user_ = phcVar.v();
        this.userCase_ = 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"user_", "userCase_"});
        }
        if (iOrdinal == 3) {
            return new GetProfilePrivacyRequest();
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
        synchronized (GetProfilePrivacyRequest.class) {
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

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public UserCase getUserCase() {
        return UserCase.forNumber(this.userCase_);
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public String getUserId() {
        return this.userCase_ == 2 ? (String) this.user_ : "";
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public phc getUserIdBytes() {
        return phc.i(this.userCase_ == 2 ? (String) this.user_ : "");
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public String getUsername() {
        return this.userCase_ == 1 ? (String) this.user_ : "";
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public phc getUsernameBytes() {
        return phc.i(this.userCase_ == 1 ? (String) this.user_ : "");
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public boolean hasUserId() {
        return this.userCase_ == 2;
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
    public boolean hasUsername() {
        return this.userCase_ == 1;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetProfilePrivacyRequestOrBuilder {
        private Builder() {
            super(GetProfilePrivacyRequest.DEFAULT_INSTANCE);
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

        public Builder clearUser() {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).clearUser();
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).clearUserId();
            return this;
        }

        public Builder clearUsername() {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).clearUsername();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public UserCase getUserCase() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).getUserCase();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public String getUserId() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).getUserId();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public phc getUserIdBytes() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).getUserIdBytes();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public String getUsername() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).getUsername();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public phc getUsernameBytes() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).getUsernameBytes();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public boolean hasUserId() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).hasUserId();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequestOrBuilder
        public boolean hasUsername() {
            return ((GetProfilePrivacyRequest) ((g) this).instance).hasUsername();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m924mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setUserId(String str) {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).setUserId(str);
            return this;
        }

        public Builder setUserIdBytes(phc phcVar) {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).setUserIdBytes(phcVar);
            return this;
        }

        public Builder setUsername(String str) {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).setUsername(str);
            return this;
        }

        public Builder setUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((GetProfilePrivacyRequest) ((g) this).instance).setUsernameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m923clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m925mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m922clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m926mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public enum UserCase {
        USERNAME(1),
        USER_ID(2),
        USER_NOT_SET(0);

        private final int value;

        UserCase(int i) {
            this.value = i;
        }

        public static UserCase forNumber(int i) {
            if (i == 0) {
                return USER_NOT_SET;
            }
            if (i == 1) {
                return USERNAME;
            }
            if (i != 2) {
                return null;
            }
            return USER_ID;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static UserCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(GetProfilePrivacyRequest getProfilePrivacyRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getProfilePrivacyRequest);
    }

    public static GetProfilePrivacyRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetProfilePrivacyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetProfilePrivacyRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetProfilePrivacyRequest parseFrom(phc phcVar) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetProfilePrivacyRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetProfilePrivacyRequest parseFrom(byte[] bArr) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetProfilePrivacyRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetProfilePrivacyRequest parseFrom(InputStream inputStream) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetProfilePrivacyRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetProfilePrivacyRequest parseFrom(lwg lwgVar) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetProfilePrivacyRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
