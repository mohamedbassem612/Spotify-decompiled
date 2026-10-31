package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ManagedAccount extends h implements ManagedAccountOrBuilder {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 8;
    public static final int COLOR_FIELD_NUMBER = 6;
    private static final ManagedAccount DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 7;
    public static final int MANAGED_ACCOUNT_ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PENDING_REQUEST_COUNT_FIELD_NUMBER = 9;
    private int accountType_;
    private int bitField0_;
    private int color_;
    private int pendingRequestCount_;
    private String managedAccountId_ = "";
    private String name_ = "";
    private String imageUrl_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.ManagedAccount$1, reason: invalid class name */
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
        ManagedAccount managedAccount = new ManagedAccount();
        DEFAULT_INSTANCE = managedAccount;
        h.registerDefaultInstance(ManagedAccount.class, managedAccount);
    }

    private ManagedAccount() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountType() {
        this.accountType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.bitField0_ &= -2;
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -3;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManagedAccountId() {
        this.managedAccountId_ = getDefaultInstance().getManagedAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPendingRequestCount() {
        this.pendingRequestCount_ = 0;
    }

    public static ManagedAccount getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ManagedAccount parseDelimitedFrom(InputStream inputStream) {
        return (ManagedAccount) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ManagedAccount parseFrom(ByteBuffer byteBuffer) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountType(AccountType accountType) {
        this.accountType_ = accountType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountTypeValue(int i) {
        this.accountType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i) {
        this.bitField0_ |= 1;
        this.color_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.imageUrl_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManagedAccountId(String str) {
        str.getClass();
        this.managedAccountId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManagedAccountIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.managedAccountId_ = phcVar.v();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingRequestCount(int i) {
        this.pendingRequestCount_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0006င\u0000\u0007ለ\u0001\b\f\t\u000b", new Object[]{"bitField0_", "managedAccountId_", "name_", "color_", "imageUrl_", "accountType_", "pendingRequestCount_"});
        }
        if (iOrdinal == 3) {
            return new ManagedAccount();
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
        synchronized (ManagedAccount.class) {
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

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public int getAccountTypeValue() {
        return this.accountType_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public int getColor() {
        return this.color_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public phc getImageUrlBytes() {
        return phc.i(this.imageUrl_);
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public String getManagedAccountId() {
        return this.managedAccountId_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public phc getManagedAccountIdBytes() {
        return phc.i(this.managedAccountId_);
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public int getPendingRequestCount() {
        return this.pendingRequestCount_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public boolean hasColor() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
    public boolean hasImageUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ManagedAccountOrBuilder {
        private Builder() {
            super(ManagedAccount.DEFAULT_INSTANCE);
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

        public Builder clearAccountType() {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).clearAccountType();
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).clearColor();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).clearImageUrl();
            return this;
        }

        public Builder clearManagedAccountId() {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).clearManagedAccountId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearPendingRequestCount() {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).clearPendingRequestCount();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public AccountType getAccountType() {
            return ((ManagedAccount) ((g) this).instance).getAccountType();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public int getAccountTypeValue() {
            return ((ManagedAccount) ((g) this).instance).getAccountTypeValue();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public int getColor() {
            return ((ManagedAccount) ((g) this).instance).getColor();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public String getImageUrl() {
            return ((ManagedAccount) ((g) this).instance).getImageUrl();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public phc getImageUrlBytes() {
            return ((ManagedAccount) ((g) this).instance).getImageUrlBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public String getManagedAccountId() {
            return ((ManagedAccount) ((g) this).instance).getManagedAccountId();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public phc getManagedAccountIdBytes() {
            return ((ManagedAccount) ((g) this).instance).getManagedAccountIdBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public String getName() {
            return ((ManagedAccount) ((g) this).instance).getName();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public phc getNameBytes() {
            return ((ManagedAccount) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public int getPendingRequestCount() {
            return ((ManagedAccount) ((g) this).instance).getPendingRequestCount();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public boolean hasColor() {
            return ((ManagedAccount) ((g) this).instance).hasColor();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountOrBuilder
        public boolean hasImageUrl() {
            return ((ManagedAccount) ((g) this).instance).hasImageUrl();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m118mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAccountType(AccountType accountType) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setAccountType(accountType);
            return this;
        }

        public Builder setAccountTypeValue(int i) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setAccountTypeValue(i);
            return this;
        }

        public Builder setColor(int i) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setColor(i);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(phc phcVar) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setImageUrlBytes(phcVar);
            return this;
        }

        public Builder setManagedAccountId(String str) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setManagedAccountId(str);
            return this;
        }

        public Builder setManagedAccountIdBytes(phc phcVar) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setManagedAccountIdBytes(phcVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        public Builder setPendingRequestCount(int i) {
            copyOnWrite();
            ((ManagedAccount) ((g) this).instance).setPendingRequestCount(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m117clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m119mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m116clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m120mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ManagedAccount managedAccount) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(managedAccount);
    }

    public static ManagedAccount parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ManagedAccount) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ManagedAccount parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ManagedAccount parseFrom(phc phcVar) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ManagedAccount parseFrom(phc phcVar, uz00 uz00Var) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ManagedAccount parseFrom(byte[] bArr) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ManagedAccount parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ManagedAccount parseFrom(InputStream inputStream) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ManagedAccount parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ManagedAccount parseFrom(lwg lwgVar) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ManagedAccount parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ManagedAccount) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
