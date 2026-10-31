package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SetManagedAccountSettingsResponse extends h implements v2j0 {
    public static final int ACCOUNT_CONTROLS_FIELD_NUMBER = 1;
    private static final SetManagedAccountSettingsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private AccountControls accountControls_;
    private int bitField0_;

    static {
        SetManagedAccountSettingsResponse setManagedAccountSettingsResponse = new SetManagedAccountSettingsResponse();
        DEFAULT_INSTANCE = setManagedAccountSettingsResponse;
        h.registerDefaultInstance(SetManagedAccountSettingsResponse.class, setManagedAccountSettingsResponse);
    }

    private SetManagedAccountSettingsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "accountControls_"});
        }
        if (iOrdinal == 3) {
            return new SetManagedAccountSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (SetManagedAccountSettingsResponse.class) {
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

    public final AccountControls n() {
        AccountControls accountControls = this.accountControls_;
        return accountControls == null ? AccountControls.s() : accountControls;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
