package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import com.spotify.kidsview.v1.proto.AccountType;
import com.spotify.kidsview.v1.proto.DeleteAction;
import com.spotify.kidsview.v1.proto.GraduationBanner;
import com.spotify.kidsview.v1.proto.ManagedAccountProfile;
import com.spotify.kidsview.v1.proto.PlanMembership;
import p.bf40;
import p.h290;
import p.ho40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetManagedAccountDetailsViewResponse extends h implements v2j0 {
    public static final int ACCOUNT_CONTROLS_FIELD_NUMBER = 7;
    public static final int ACCOUNT_FIELD_NUMBER = 2;
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    public static final int ADD_ONS_FIELD_NUMBER = 13;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 4;
    private static final GetManagedAccountDetailsViewResponse DEFAULT_INSTANCE;
    public static final int DELETE_ACTION_FIELD_NUMBER = 9;
    public static final int EDIT_NAME_ACTION_FIELD_NUMBER = 12;
    public static final int GRADUATION_BANNER_FIELD_NUMBER = 11;
    public static final int LOGIN_OPTIONS_ACTION_FIELD_NUMBER = 5;
    public static final int MANAGE_AUDIOBOOK_LISTENING_ACTION_FIELD_NUMBER = 14;
    public static final int MANAGE_CONTENT_ACTION_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PENDING_REQUEST_COUNT_FIELD_NUMBER = 15;
    public static final int PLAN_MEMBERSHIP_FIELD_NUMBER = 8;
    public static final int PROFILE_FIELD_NUMBER = 3;
    public static final int STOP_MANAGING_ACTION_FIELD_NUMBER = 10;
    private AccountControls accountControls_;
    private int accountType_;
    private ManagedAccountIdentifier account_;
    private h290 addOns_ = h.emptyProtobufList();
    private int bitField0_;
    private DateOfBirth dateOfBirth_;
    private DeleteAction deleteAction_;
    private EditNameAction editNameAction_;
    private GraduationBanner graduationBanner_;
    private LoginOptionsAction loginOptionsAction_;
    private ManageAudiobookListeningAction manageAudiobookListeningAction_;
    private ManageContentAction manageContentAction_;
    private int pendingRequestCount_;
    private PlanMembership planMembership_;
    private ManagedAccountProfile profile_;
    private StopManagingAction stopManagingAction_;

    static {
        GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse = new GetManagedAccountDetailsViewResponse();
        DEFAULT_INSTANCE = getManagedAccountDetailsViewResponse;
        h.registerDefaultInstance(GetManagedAccountDetailsViewResponse.class, getManagedAccountDetailsViewResponse);
    }

    private GetManagedAccountDetailsViewResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u0005\r\u001b\u000eဉ\u000b\u000f\u000b", new Object[]{"bitField0_", "accountType_", "account_", "profile_", "dateOfBirth_", "loginOptionsAction_", "manageContentAction_", "accountControls_", "planMembership_", "deleteAction_", "stopManagingAction_", "graduationBanner_", "editNameAction_", "addOns_", AddOn.class, "manageAudiobookListeningAction_", "pendingRequestCount_"});
        }
        if (iOrdinal == 3) {
            return new GetManagedAccountDetailsViewResponse();
        }
        if (iOrdinal == 4) {
            return new ho40(DEFAULT_INSTANCE);
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

    public final AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final DeleteAction getDeleteAction() {
        DeleteAction deleteAction = this.deleteAction_;
        return deleteAction == null ? DeleteAction.getDefaultInstance() : deleteAction;
    }

    public final GraduationBanner getGraduationBanner() {
        GraduationBanner graduationBanner = this.graduationBanner_;
        return graduationBanner == null ? GraduationBanner.getDefaultInstance() : graduationBanner;
    }

    public final int getPendingRequestCount() {
        return this.pendingRequestCount_;
    }

    public final PlanMembership getPlanMembership() {
        PlanMembership planMembership = this.planMembership_;
        return planMembership == null ? PlanMembership.getDefaultInstance() : planMembership;
    }

    public final ManagedAccountProfile getProfile() {
        ManagedAccountProfile managedAccountProfile = this.profile_;
        return managedAccountProfile == null ? ManagedAccountProfile.getDefaultInstance() : managedAccountProfile;
    }

    public final boolean hasDateOfBirth() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasDeleteAction() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasGraduationBanner() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean hasPlanMembership() {
        return (this.bitField0_ & 128) != 0;
    }

    public final ManagedAccountIdentifier n() {
        ManagedAccountIdentifier managedAccountIdentifier = this.account_;
        return managedAccountIdentifier == null ? ManagedAccountIdentifier.n() : managedAccountIdentifier;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AccountControls o() {
        AccountControls accountControls = this.accountControls_;
        return accountControls == null ? AccountControls.s() : accountControls;
    }

    public final h290 p() {
        return this.addOns_;
    }

    public final DateOfBirth q() {
        DateOfBirth dateOfBirth = this.dateOfBirth_;
        return dateOfBirth == null ? DateOfBirth.o() : dateOfBirth;
    }

    public final ManageContentAction r() {
        ManageContentAction manageContentAction = this.manageContentAction_;
        return manageContentAction == null ? ManageContentAction.n() : manageContentAction;
    }

    public final StopManagingAction s() {
        StopManagingAction stopManagingAction = this.stopManagingAction_;
        return stopManagingAction == null ? StopManagingAction.n() : stopManagingAction;
    }

    public final boolean t() {
        return (this.bitField0_ & 64) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 512) != 0;
    }
}
