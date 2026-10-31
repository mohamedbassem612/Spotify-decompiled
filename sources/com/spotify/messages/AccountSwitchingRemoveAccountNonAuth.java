package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class AccountSwitchingRemoveAccountNonAuth extends h implements v2j0 {
    private static final AccountSwitchingRemoveAccountNonAuth DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 2;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVED_ACCOUNT_TYPE_FIELD_NUMBER = 1;
    public static final int STORED_ACCOUNTS_SIZE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int storedAccountsSize_;
    private String removedAccountType_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";

    static {
        AccountSwitchingRemoveAccountNonAuth accountSwitchingRemoveAccountNonAuth = new AccountSwitchingRemoveAccountNonAuth();
        DEFAULT_INSTANCE = accountSwitchingRemoveAccountNonAuth;
        h.registerDefaultInstance(AccountSwitchingRemoveAccountNonAuth.class, accountSwitchingRemoveAccountNonAuth);
    }

    private AccountSwitchingRemoveAccountNonAuth() {
    }

    public static xv n() {
        return (xv) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"bitField0_", "removedAccountType_", "deviceId_", "deviceType_", "storedAccountsSize_"});
        }
        if (iOrdinal == 3) {
            return new AccountSwitchingRemoveAccountNonAuth();
        }
        if (iOrdinal == 4) {
            return new xv(DEFAULT_INSTANCE);
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
        synchronized (AccountSwitchingRemoveAccountNonAuth.class) {
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

    public final void o(String str) {
        this.bitField0_ |= 2;
        this.deviceId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.deviceType_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.removedAccountType_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 8;
        this.storedAccountsSize_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
