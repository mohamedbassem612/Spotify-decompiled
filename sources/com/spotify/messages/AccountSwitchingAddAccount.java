package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nv;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class AccountSwitchingAddAccount extends h implements v2j0 {
    public static final int ACCOUNT_AUTO_ADDED_FIELD_NUMBER = 6;
    public static final int ADDED_ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final AccountSwitchingAddAccount DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STORED_ACCOUNTS_SIZE_FIELD_NUMBER = 5;
    private boolean accountAutoAdded_;
    private int bitField0_;
    private int storedAccountsSize_;
    private String addedAccountType_ = "";
    private String interactionId_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";

    static {
        AccountSwitchingAddAccount accountSwitchingAddAccount = new AccountSwitchingAddAccount();
        DEFAULT_INSTANCE = accountSwitchingAddAccount;
        h.registerDefaultInstance(AccountSwitchingAddAccount.class, accountSwitchingAddAccount);
    }

    private AccountSwitchingAddAccount() {
    }

    public static nv n() {
        return (nv) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "addedAccountType_", "interactionId_", "deviceId_", "deviceType_", "storedAccountsSize_", "accountAutoAdded_"});
        }
        if (iOrdinal == 3) {
            return new AccountSwitchingAddAccount();
        }
        if (iOrdinal == 4) {
            return new nv(DEFAULT_INSTANCE);
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
        synchronized (AccountSwitchingAddAccount.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(boolean z) {
        this.bitField0_ |= 32;
        this.accountAutoAdded_ = z;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.addedAccountType_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.deviceId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.deviceType_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.interactionId_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 16;
        this.storedAccountsSize_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
