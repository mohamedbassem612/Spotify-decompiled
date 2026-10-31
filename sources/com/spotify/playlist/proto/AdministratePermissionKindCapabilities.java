package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dw0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AdministratePermissionKindCapabilities extends h implements v2j0 {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final AdministratePermissionKindCapabilities DEFAULT_INSTANCE;
    public static final int GRANT_FIELD_NUMBER = 6;
    public static final int MEMBER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private AdministratePermissionCapabilities base_;
    private int bitField0_;
    private AdministratePermissionCapabilities grant_;
    private AdministratePermissionCapabilities member_;

    static {
        AdministratePermissionKindCapabilities administratePermissionKindCapabilities = new AdministratePermissionKindCapabilities();
        DEFAULT_INSTANCE = administratePermissionKindCapabilities;
        h.registerDefaultInstance(AdministratePermissionKindCapabilities.class, administratePermissionKindCapabilities);
    }

    private AdministratePermissionKindCapabilities() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "base_", "member_", "grant_"});
        }
        if (iOrdinal == 3) {
            return new AdministratePermissionKindCapabilities();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (AdministratePermissionKindCapabilities.class) {
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
