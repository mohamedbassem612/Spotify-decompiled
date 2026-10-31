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
public final class GetDeleteManagedAccountViewResponse extends h implements GetDeleteManagedAccountViewResponseOrBuilder {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final GetDeleteManagedAccountViewResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_DETAILS_FIELD_NUMBER = 2;
    private int accountType_;
    private int bitField0_;
    private DeletePlanDetails planDetails_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponse$1, reason: invalid class name */
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
        GetDeleteManagedAccountViewResponse getDeleteManagedAccountViewResponse = new GetDeleteManagedAccountViewResponse();
        DEFAULT_INSTANCE = getDeleteManagedAccountViewResponse;
        h.registerDefaultInstance(GetDeleteManagedAccountViewResponse.class, getDeleteManagedAccountViewResponse);
    }

    private GetDeleteManagedAccountViewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountType() {
        this.accountType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanDetails() {
        this.planDetails_ = null;
        this.bitField0_ &= -2;
    }

    public static GetDeleteManagedAccountViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlanDetails(DeletePlanDetails deletePlanDetails) {
        deletePlanDetails.getClass();
        DeletePlanDetails deletePlanDetails2 = this.planDetails_;
        if (deletePlanDetails2 == null || deletePlanDetails2 == DeletePlanDetails.getDefaultInstance()) {
            this.planDetails_ = deletePlanDetails;
        } else {
            this.planDetails_ = (DeletePlanDetails) ((DeletePlanDetails.Builder) DeletePlanDetails.newBuilder(this.planDetails_).mergeFrom(deletePlanDetails)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetDeleteManagedAccountViewResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetDeleteManagedAccountViewResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setPlanDetails(DeletePlanDetails deletePlanDetails) {
        deletePlanDetails.getClass();
        this.planDetails_ = deletePlanDetails;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "accountType_", "planDetails_"});
        }
        if (iOrdinal == 3) {
            return new GetDeleteManagedAccountViewResponse();
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
        synchronized (GetDeleteManagedAccountViewResponse.class) {
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

    @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public int getAccountTypeValue() {
        return this.accountType_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public DeletePlanDetails getPlanDetails() {
        DeletePlanDetails deletePlanDetails = this.planDetails_;
        return deletePlanDetails == null ? DeletePlanDetails.getDefaultInstance() : deletePlanDetails;
    }

    @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public boolean hasPlanDetails() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetDeleteManagedAccountViewResponseOrBuilder {
        private Builder() {
            super(GetDeleteManagedAccountViewResponse.DEFAULT_INSTANCE);
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
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).clearAccountType();
            return this;
        }

        public Builder clearPlanDetails() {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).clearPlanDetails();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public AccountType getAccountType() {
            return ((GetDeleteManagedAccountViewResponse) ((g) this).instance).getAccountType();
        }

        @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public int getAccountTypeValue() {
            return ((GetDeleteManagedAccountViewResponse) ((g) this).instance).getAccountTypeValue();
        }

        @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public DeletePlanDetails getPlanDetails() {
            return ((GetDeleteManagedAccountViewResponse) ((g) this).instance).getPlanDetails();
        }

        @Override // com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public boolean hasPlanDetails() {
            return ((GetDeleteManagedAccountViewResponse) ((g) this).instance).hasPlanDetails();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m93mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergePlanDetails(DeletePlanDetails deletePlanDetails) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).mergePlanDetails(deletePlanDetails);
            return this;
        }

        public Builder setAccountType(AccountType accountType) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).setAccountType(accountType);
            return this;
        }

        public Builder setAccountTypeValue(int i) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).setAccountTypeValue(i);
            return this;
        }

        public Builder setPlanDetails(DeletePlanDetails.Builder builder) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).setPlanDetails((DeletePlanDetails) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m92clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m94mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m91clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m95mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setPlanDetails(DeletePlanDetails deletePlanDetails) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) ((g) this).instance).setPlanDetails(deletePlanDetails);
            return this;
        }
    }

    public static Builder newBuilder(GetDeleteManagedAccountViewResponse getDeleteManagedAccountViewResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getDeleteManagedAccountViewResponse);
    }

    public static GetDeleteManagedAccountViewResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetDeleteManagedAccountViewResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(phc phcVar) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(byte[] bArr) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(InputStream inputStream) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(lwg lwgVar) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetDeleteManagedAccountViewResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
