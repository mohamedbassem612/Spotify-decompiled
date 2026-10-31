package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dw0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AdministratePermissionCapabilities extends h implements v2j0 {
    public static final int CAN_REMOVE_FIELD_NUMBER = 2;
    public static final int CAN_REMOVE_OWN_FIELD_NUMBER = 3;
    public static final int CAN_SET_FIELD_NUMBER = 1;
    private static final AdministratePermissionCapabilities DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean canRemoveOwn_;
    private boolean canRemove_;
    private boolean canSet_;

    static {
        AdministratePermissionCapabilities administratePermissionCapabilities = new AdministratePermissionCapabilities();
        DEFAULT_INSTANCE = administratePermissionCapabilities;
        h.registerDefaultInstance(AdministratePermissionCapabilities.class, administratePermissionCapabilities);
    }

    private AdministratePermissionCapabilities() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "canSet_", "canRemove_", "canRemoveOwn_"});
        }
        if (iOrdinal == 3) {
            return new AdministratePermissionCapabilities();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (AdministratePermissionCapabilities.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
