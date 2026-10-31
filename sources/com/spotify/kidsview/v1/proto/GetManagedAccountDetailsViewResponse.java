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
public final class GetManagedAccountDetailsViewResponse extends h implements GetManagedAccountDetailsViewResponseOrBuilder {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final GetManagedAccountDetailsViewResponse DEFAULT_INSTANCE;
    public static final int DELETE_ACTION_FIELD_NUMBER = 7;
    public static final int GRADUATION_BANNER_FIELD_NUMBER = 5;
    public static final int HAS_AUDIOBOOKS_AVAILABLE_FIELD_NUMBER = 8;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PENDING_REQUEST_COUNT_FIELD_NUMBER = 9;
    public static final int PLAN_MEMBERSHIP_FIELD_NUMBER = 6;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int accountType_;
    private int bitField0_;
    private String childId_ = "";
    private DeleteAction deleteAction_;
    private GraduationBanner graduationBanner_;
    private boolean hasAudiobooksAvailable_;
    private ParentalControls parentalControls_;
    private int pendingRequestCount_;
    private PlanMembership planMembership_;
    private ManagedAccountProfile profile_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponse$1, reason: invalid class name */
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
        GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse = new GetManagedAccountDetailsViewResponse();
        DEFAULT_INSTANCE = getManagedAccountDetailsViewResponse;
        h.registerDefaultInstance(GetManagedAccountDetailsViewResponse.class, getManagedAccountDetailsViewResponse);
    }

    private GetManagedAccountDetailsViewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountType() {
        this.accountType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildId() {
        this.childId_ = getDefaultInstance().getChildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteAction() {
        this.deleteAction_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGraduationBanner() {
        this.graduationBanner_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasAudiobooksAvailable() {
        this.hasAudiobooksAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentalControls() {
        this.parentalControls_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPendingRequestCount() {
        this.pendingRequestCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanMembership() {
        this.planMembership_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfile() {
        this.profile_ = null;
        this.bitField0_ &= -2;
    }

    public static GetManagedAccountDetailsViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteAction(DeleteAction deleteAction) {
        deleteAction.getClass();
        DeleteAction deleteAction2 = this.deleteAction_;
        if (deleteAction2 == null || deleteAction2 == DeleteAction.getDefaultInstance()) {
            this.deleteAction_ = deleteAction;
        } else {
            this.deleteAction_ = (DeleteAction) ((DeleteAction.Builder) DeleteAction.newBuilder(this.deleteAction_).mergeFrom(deleteAction)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGraduationBanner(GraduationBanner graduationBanner) {
        graduationBanner.getClass();
        GraduationBanner graduationBanner2 = this.graduationBanner_;
        if (graduationBanner2 == null || graduationBanner2 == GraduationBanner.getDefaultInstance()) {
            this.graduationBanner_ = graduationBanner;
        } else {
            this.graduationBanner_ = (GraduationBanner) ((GraduationBanner.Builder) GraduationBanner.newBuilder(this.graduationBanner_).mergeFrom(graduationBanner)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParentalControls(ParentalControls parentalControls) {
        parentalControls.getClass();
        ParentalControls parentalControls2 = this.parentalControls_;
        if (parentalControls2 == null || parentalControls2 == ParentalControls.getDefaultInstance()) {
            this.parentalControls_ = parentalControls;
        } else {
            this.parentalControls_ = (ParentalControls) ((ParentalControls.Builder) ParentalControls.newBuilder(this.parentalControls_).mergeFrom(parentalControls)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlanMembership(PlanMembership planMembership) {
        planMembership.getClass();
        PlanMembership planMembership2 = this.planMembership_;
        if (planMembership2 == null || planMembership2 == PlanMembership.getDefaultInstance()) {
            this.planMembership_ = planMembership;
        } else {
            this.planMembership_ = (PlanMembership) ((PlanMembership.Builder) PlanMembership.newBuilder(this.planMembership_).mergeFrom(planMembership)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProfile(ManagedAccountProfile managedAccountProfile) {
        managedAccountProfile.getClass();
        ManagedAccountProfile managedAccountProfile2 = this.profile_;
        if (managedAccountProfile2 == null || managedAccountProfile2 == ManagedAccountProfile.getDefaultInstance()) {
            this.profile_ = managedAccountProfile;
        } else {
            this.profile_ = (ManagedAccountProfile) ((ManagedAccountProfile.Builder) ManagedAccountProfile.newBuilder(this.profile_).mergeFrom(managedAccountProfile)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetManagedAccountDetailsViewResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetManagedAccountDetailsViewResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setChildId(String str) {
        str.getClass();
        this.childId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.childId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteAction(DeleteAction deleteAction) {
        deleteAction.getClass();
        this.deleteAction_ = deleteAction;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGraduationBanner(GraduationBanner graduationBanner) {
        graduationBanner.getClass();
        this.graduationBanner_ = graduationBanner;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasAudiobooksAvailable(boolean z) {
        this.hasAudiobooksAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentalControls(ParentalControls parentalControls) {
        parentalControls.getClass();
        this.parentalControls_ = parentalControls;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingRequestCount(int i) {
        this.pendingRequestCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanMembership(PlanMembership planMembership) {
        planMembership.getClass();
        this.planMembership_ = planMembership;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfile(ManagedAccountProfile managedAccountProfile) {
        managedAccountProfile.getClass();
        this.profile_ = managedAccountProfile;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\b\u0007\t\u000b", new Object[]{"bitField0_", "childId_", "profile_", "accountType_", "parentalControls_", "graduationBanner_", "planMembership_", "deleteAction_", "hasAudiobooksAvailable_", "pendingRequestCount_"});
        }
        if (iOrdinal == 3) {
            return new GetManagedAccountDetailsViewResponse();
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
        synchronized (GetManagedAccountDetailsViewResponse.class) {
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

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public int getAccountTypeValue() {
        return this.accountType_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public String getChildId() {
        return this.childId_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public phc getChildIdBytes() {
        return phc.i(this.childId_);
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public DeleteAction getDeleteAction() {
        DeleteAction deleteAction = this.deleteAction_;
        return deleteAction == null ? DeleteAction.getDefaultInstance() : deleteAction;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public GraduationBanner getGraduationBanner() {
        GraduationBanner graduationBanner = this.graduationBanner_;
        return graduationBanner == null ? GraduationBanner.getDefaultInstance() : graduationBanner;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean getHasAudiobooksAvailable() {
        return this.hasAudiobooksAvailable_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public ParentalControls getParentalControls() {
        ParentalControls parentalControls = this.parentalControls_;
        return parentalControls == null ? ParentalControls.getDefaultInstance() : parentalControls;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public int getPendingRequestCount() {
        return this.pendingRequestCount_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public PlanMembership getPlanMembership() {
        PlanMembership planMembership = this.planMembership_;
        return planMembership == null ? PlanMembership.getDefaultInstance() : planMembership;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public ManagedAccountProfile getProfile() {
        ManagedAccountProfile managedAccountProfile = this.profile_;
        return managedAccountProfile == null ? ManagedAccountProfile.getDefaultInstance() : managedAccountProfile;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasDeleteAction() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasGraduationBanner() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasParentalControls() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasPlanMembership() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasProfile() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetManagedAccountDetailsViewResponseOrBuilder {
        private Builder() {
            super(GetManagedAccountDetailsViewResponse.DEFAULT_INSTANCE);
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
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearAccountType();
            return this;
        }

        public Builder clearChildId() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearChildId();
            return this;
        }

        public Builder clearDeleteAction() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearDeleteAction();
            return this;
        }

        public Builder clearGraduationBanner() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearGraduationBanner();
            return this;
        }

        public Builder clearHasAudiobooksAvailable() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearHasAudiobooksAvailable();
            return this;
        }

        public Builder clearParentalControls() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearParentalControls();
            return this;
        }

        public Builder clearPendingRequestCount() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearPendingRequestCount();
            return this;
        }

        public Builder clearPlanMembership() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearPlanMembership();
            return this;
        }

        public Builder clearProfile() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).clearProfile();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public AccountType getAccountType() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getAccountType();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public int getAccountTypeValue() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getAccountTypeValue();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public String getChildId() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getChildId();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public phc getChildIdBytes() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getChildIdBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public DeleteAction getDeleteAction() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getDeleteAction();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public GraduationBanner getGraduationBanner() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getGraduationBanner();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean getHasAudiobooksAvailable() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getHasAudiobooksAvailable();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public ParentalControls getParentalControls() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getParentalControls();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public int getPendingRequestCount() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getPendingRequestCount();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public PlanMembership getPlanMembership() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getPlanMembership();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public ManagedAccountProfile getProfile() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).getProfile();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasDeleteAction() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).hasDeleteAction();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasGraduationBanner() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).hasGraduationBanner();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasParentalControls() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).hasParentalControls();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasPlanMembership() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).hasPlanMembership();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasProfile() {
            return ((GetManagedAccountDetailsViewResponse) ((g) this).instance).hasProfile();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeDeleteAction(DeleteAction deleteAction) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).mergeDeleteAction(deleteAction);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m103mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeGraduationBanner(GraduationBanner graduationBanner) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).mergeGraduationBanner(graduationBanner);
            return this;
        }

        public Builder mergeParentalControls(ParentalControls parentalControls) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).mergeParentalControls(parentalControls);
            return this;
        }

        public Builder mergePlanMembership(PlanMembership planMembership) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).mergePlanMembership(planMembership);
            return this;
        }

        public Builder mergeProfile(ManagedAccountProfile managedAccountProfile) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).mergeProfile(managedAccountProfile);
            return this;
        }

        public Builder setAccountType(AccountType accountType) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setAccountType(accountType);
            return this;
        }

        public Builder setAccountTypeValue(int i) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setAccountTypeValue(i);
            return this;
        }

        public Builder setChildId(String str) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setChildId(str);
            return this;
        }

        public Builder setChildIdBytes(phc phcVar) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setChildIdBytes(phcVar);
            return this;
        }

        public Builder setDeleteAction(DeleteAction.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setDeleteAction((DeleteAction) builder.build());
            return this;
        }

        public Builder setGraduationBanner(GraduationBanner.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setGraduationBanner((GraduationBanner) builder.build());
            return this;
        }

        public Builder setHasAudiobooksAvailable(boolean z) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setHasAudiobooksAvailable(z);
            return this;
        }

        public Builder setParentalControls(ParentalControls.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setParentalControls((ParentalControls) builder.build());
            return this;
        }

        public Builder setPendingRequestCount(int i) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setPendingRequestCount(i);
            return this;
        }

        public Builder setPlanMembership(PlanMembership.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setPlanMembership((PlanMembership) builder.build());
            return this;
        }

        public Builder setProfile(ManagedAccountProfile.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setProfile((ManagedAccountProfile) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m102clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m104mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m101clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m105mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setDeleteAction(DeleteAction deleteAction) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setDeleteAction(deleteAction);
            return this;
        }

        public Builder setGraduationBanner(GraduationBanner graduationBanner) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setGraduationBanner(graduationBanner);
            return this;
        }

        public Builder setParentalControls(ParentalControls parentalControls) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setParentalControls(parentalControls);
            return this;
        }

        public Builder setPlanMembership(PlanMembership planMembership) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setPlanMembership(planMembership);
            return this;
        }

        public Builder setProfile(ManagedAccountProfile managedAccountProfile) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) ((g) this).instance).setProfile(managedAccountProfile);
            return this;
        }
    }

    public static Builder newBuilder(GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getManagedAccountDetailsViewResponse);
    }

    public static GetManagedAccountDetailsViewResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetManagedAccountDetailsViewResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(phc phcVar) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(byte[] bArr) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(InputStream inputStream) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(lwg lwgVar) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetManagedAccountDetailsViewResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
