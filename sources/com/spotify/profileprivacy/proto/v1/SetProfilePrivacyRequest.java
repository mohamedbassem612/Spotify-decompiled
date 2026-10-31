package com.spotify.profileprivacy.proto.v1;

import com.google.protobuf.FieldMask;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.h220;
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
public final class SetProfilePrivacyRequest extends h implements SetProfilePrivacyRequestOrBuilder {
    public static final int ALLOW_FOLLOWS_FIELD_NUMBER = 4;
    private static final SetProfilePrivacyRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_FOLLOWS_FIELD_NUMBER = 5;
    public static final int SHOW_PUBLISHED_PLAYLISTS_FIELD_NUMBER = 6;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private boolean allowFollows_;
    private int bitField0_;
    private FieldMask mask_;
    private boolean showFollows_;
    private boolean showPublishedPlaylists_;
    private int userCase_ = 0;
    private Object user_;

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequest$1, reason: invalid class name */
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
        SetProfilePrivacyRequest setProfilePrivacyRequest = new SetProfilePrivacyRequest();
        DEFAULT_INSTANCE = setProfilePrivacyRequest;
        h.registerDefaultInstance(SetProfilePrivacyRequest.class, setProfilePrivacyRequest);
    }

    private SetProfilePrivacyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowFollows() {
        this.bitField0_ &= -3;
        this.allowFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowFollows() {
        this.bitField0_ &= -5;
        this.showFollows_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowPublishedPlaylists() {
        this.bitField0_ &= -9;
        this.showPublishedPlaylists_ = false;
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

    public static SetProfilePrivacyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(FieldMask fieldMask) {
        fieldMask.getClass();
        FieldMask fieldMask2 = this.mask_;
        if (fieldMask2 == null || fieldMask2 == FieldMask.p()) {
            this.mask_ = fieldMask;
        } else {
            this.mask_ = (FieldMask) ((h220) FieldMask.r(this.mask_).mergeFrom(fieldMask)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SetProfilePrivacyRequest parseDelimitedFrom(InputStream inputStream) {
        return (SetProfilePrivacyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetProfilePrivacyRequest parseFrom(ByteBuffer byteBuffer) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowFollows(boolean z) {
        this.bitField0_ |= 2;
        this.allowFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(FieldMask fieldMask) {
        fieldMask.getClass();
        this.mask_ = fieldMask;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowFollows(boolean z) {
        this.bitField0_ |= 4;
        this.showFollows_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowPublishedPlaylists(boolean z) {
        this.bitField0_ |= 8;
        this.showPublishedPlaylists_ = z;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"user_", "userCase_", "bitField0_", "mask_", "allowFollows_", "showFollows_", "showPublishedPlaylists_"});
        }
        if (iOrdinal == 3) {
            return new SetProfilePrivacyRequest();
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
        synchronized (SetProfilePrivacyRequest.class) {
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

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean getAllowFollows() {
        return this.allowFollows_;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public FieldMask getMask() {
        FieldMask fieldMask = this.mask_;
        return fieldMask == null ? FieldMask.p() : fieldMask;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean getShowFollows() {
        return this.showFollows_;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean getShowPublishedPlaylists() {
        return this.showPublishedPlaylists_;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public UserCase getUserCase() {
        return UserCase.forNumber(this.userCase_);
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public String getUserId() {
        return this.userCase_ == 2 ? (String) this.user_ : "";
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public phc getUserIdBytes() {
        return phc.i(this.userCase_ == 2 ? (String) this.user_ : "");
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public String getUsername() {
        return this.userCase_ == 1 ? (String) this.user_ : "";
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public phc getUsernameBytes() {
        return phc.i(this.userCase_ == 1 ? (String) this.user_ : "");
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasAllowFollows() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasShowFollows() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasShowPublishedPlaylists() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasUserId() {
        return this.userCase_ == 2;
    }

    @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
    public boolean hasUsername() {
        return this.userCase_ == 1;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SetProfilePrivacyRequestOrBuilder {
        private Builder() {
            super(SetProfilePrivacyRequest.DEFAULT_INSTANCE);
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

        public Builder clearAllowFollows() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearAllowFollows();
            return this;
        }

        public Builder clearMask() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearMask();
            return this;
        }

        public Builder clearShowFollows() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearShowFollows();
            return this;
        }

        public Builder clearShowPublishedPlaylists() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearShowPublishedPlaylists();
            return this;
        }

        public Builder clearUser() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearUser();
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearUserId();
            return this;
        }

        public Builder clearUsername() {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).clearUsername();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean getAllowFollows() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getAllowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public FieldMask getMask() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getMask();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean getShowFollows() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getShowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean getShowPublishedPlaylists() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getShowPublishedPlaylists();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public UserCase getUserCase() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getUserCase();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public String getUserId() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getUserId();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public phc getUserIdBytes() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getUserIdBytes();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public String getUsername() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getUsername();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public phc getUsernameBytes() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).getUsernameBytes();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasAllowFollows() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).hasAllowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasMask() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).hasMask();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasShowFollows() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).hasShowFollows();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasShowPublishedPlaylists() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).hasShowPublishedPlaylists();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasUserId() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).hasUserId();
        }

        @Override // com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequestOrBuilder
        public boolean hasUsername() {
            return ((SetProfilePrivacyRequest) ((g) this).instance).hasUsername();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m954mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeMask(FieldMask fieldMask) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).mergeMask(fieldMask);
            return this;
        }

        public Builder setAllowFollows(boolean z) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setAllowFollows(z);
            return this;
        }

        public Builder setMask(h220 h220Var) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setMask((FieldMask) h220Var.build());
            return this;
        }

        public Builder setShowFollows(boolean z) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setShowFollows(z);
            return this;
        }

        public Builder setShowPublishedPlaylists(boolean z) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setShowPublishedPlaylists(z);
            return this;
        }

        public Builder setUserId(String str) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setUserId(str);
            return this;
        }

        public Builder setUserIdBytes(phc phcVar) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setUserIdBytes(phcVar);
            return this;
        }

        public Builder setUsername(String str) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setUsername(str);
            return this;
        }

        public Builder setUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setUsernameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m953clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m955mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m952clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m956mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setMask(FieldMask fieldMask) {
            copyOnWrite();
            ((SetProfilePrivacyRequest) ((g) this).instance).setMask(fieldMask);
            return this;
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

    public static Builder newBuilder(SetProfilePrivacyRequest setProfilePrivacyRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(setProfilePrivacyRequest);
    }

    public static SetProfilePrivacyRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetProfilePrivacyRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetProfilePrivacyRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SetProfilePrivacyRequest parseFrom(phc phcVar) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SetProfilePrivacyRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SetProfilePrivacyRequest parseFrom(byte[] bArr) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetProfilePrivacyRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SetProfilePrivacyRequest parseFrom(InputStream inputStream) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetProfilePrivacyRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetProfilePrivacyRequest parseFrom(lwg lwgVar) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SetProfilePrivacyRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SetProfilePrivacyRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
