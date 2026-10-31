package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sk61;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SetManagedAccountSettingsRequest extends h implements v2j0 {
    public static final int ACCOUNT_CONTROLS_FIELD_NUMBER = 2;
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private static final SetManagedAccountSettingsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private AccountControls accountControls_;
    private ManagedAccountIdentifier account_;
    private int bitField0_;

    static {
        SetManagedAccountSettingsRequest setManagedAccountSettingsRequest = new SetManagedAccountSettingsRequest();
        DEFAULT_INSTANCE = setManagedAccountSettingsRequest;
        h.registerDefaultInstance(SetManagedAccountSettingsRequest.class, setManagedAccountSettingsRequest);
    }

    private SetManagedAccountSettingsRequest() {
    }

    public static sk61 n() {
        return (sk61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "account_", "accountControls_"});
        }
        if (iOrdinal == 3) {
            return new SetManagedAccountSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new sk61(DEFAULT_INSTANCE);
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
        synchronized (SetManagedAccountSettingsRequest.class) {
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

    public final void o(ManagedAccountIdentifier managedAccountIdentifier) {
        managedAccountIdentifier.getClass();
        this.account_ = managedAccountIdentifier;
        this.bitField0_ |= 1;
    }

    public final void p(AccountControls accountControls) {
        this.accountControls_ = accountControls;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
