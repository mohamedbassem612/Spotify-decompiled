package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PermissionGrantDetails extends h implements v2j0 {
    public static final int AUDIT_FIELD_NUMBER = 2;
    private static final PermissionGrantDetails DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_LEVEL_DOWNGRADED_FIELD_NUMBER = 1;
    private Audit audit_;
    private int bitField0_;
    private boolean permissionLevelDowngraded_;

    static {
        PermissionGrantDetails permissionGrantDetails = new PermissionGrantDetails();
        DEFAULT_INSTANCE = permissionGrantDetails;
        h.registerDefaultInstance(PermissionGrantDetails.class, permissionGrantDetails);
    }

    private PermissionGrantDetails() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "permissionLevelDowngraded_", "audit_"});
        }
        if (iOrdinal == 3) {
            return new PermissionGrantDetails();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (PermissionGrantDetails.class) {
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
