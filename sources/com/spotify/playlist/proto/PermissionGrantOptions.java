package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uls0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PermissionGrantOptions extends h implements v2j0 {
    private static final PermissionGrantOptions DEFAULT_INSTANCE;
    public static final int MAX_USAGES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 1;
    public static final int TTL_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long maxUsages_;
    private Permission permission_;
    private long ttlMs_;

    static {
        PermissionGrantOptions permissionGrantOptions = new PermissionGrantOptions();
        DEFAULT_INSTANCE = permissionGrantOptions;
        h.registerDefaultInstance(PermissionGrantOptions.class, permissionGrantOptions);
    }

    private PermissionGrantOptions() {
    }

    public static PermissionGrantOptions o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static uls0 s() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "permission_", "ttlMs_", "maxUsages_"});
        }
        if (iOrdinal == 3) {
            return new PermissionGrantOptions();
        }
        if (iOrdinal == 4) {
            return new uls0();
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
        synchronized (PermissionGrantOptions.class) {
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

    public final Permission p() {
        Permission permission = this.permission_;
        return permission == null ? Permission.o() : permission;
    }

    public final long q() {
        return this.ttlMs_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void t(Permission permission) {
        permission.getClass();
        this.permission_ = permission;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.bitField0_ |= 2;
        this.ttlMs_ = 604800000L;
    }
}
