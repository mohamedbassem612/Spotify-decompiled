package com.spotify.accountswitching.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetAddAccountPageResponse extends h implements v2j0 {
    public static final int ACCOUNTS_FIELD_NUMBER = 1;
    public static final int CAN_HAVE_MANAGED_ACCOUNTS_FIELD_NUMBER = 2;
    private static final GetAddAccountPageResponse DEFAULT_INSTANCE;
    public static final int MAX_MANAGED_ACCOUNT_SIGN_UP_AGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int UI_HINTS_FIELD_NUMBER = 3;
    private h290 accounts_ = h.emptyProtobufList();
    private int bitField0_;
    private boolean canHaveManagedAccounts_;
    private int maxManagedAccountSignUpAge_;
    private UIHints uiHints_;

    static {
        GetAddAccountPageResponse getAddAccountPageResponse = new GetAddAccountPageResponse();
        DEFAULT_INSTANCE = getAddAccountPageResponse;
        h.registerDefaultInstance(GetAddAccountPageResponse.class, getAddAccountPageResponse);
    }

    private GetAddAccountPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003ဉ\u0000\u0004ဋ\u0001", new Object[]{"bitField0_", "accounts_", Account.class, "canHaveManagedAccounts_", "uiHints_", "maxManagedAccountSignUpAge_"});
        }
        if (iOrdinal == 3) {
            return new GetAddAccountPageResponse();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (GetAddAccountPageResponse.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final h290 n() {
        return this.accounts_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canHaveManagedAccounts_;
    }

    public final int p() {
        return this.maxManagedAccountSignUpAge_;
    }

    public final UIHints q() {
        UIHints uIHints = this.uiHints_;
        return uIHints == null ? UIHints.n() : uIHints;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
