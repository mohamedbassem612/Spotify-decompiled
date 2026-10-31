package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjj0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PermissionGrantDescription extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CLAIM_FAIL_REASON_FIELD_NUMBER = 2;
    private static final PermissionGrantDescription DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 5;
    public static final int IS_EFFECTIVE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_GRANT_OPTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Capabilities capabilities_;
    private int claimFailReason_;
    private h290 details_ = h.emptyProtobufList();
    private boolean isEffective_;
    private PermissionGrantOptions permissionGrantOptions_;

    static {
        PermissionGrantDescription permissionGrantDescription = new PermissionGrantDescription();
        DEFAULT_INSTANCE = permissionGrantDescription;
        h.registerDefaultInstance(PermissionGrantDescription.class, permissionGrantDescription);
    }

    private PermissionGrantDescription() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"bitField0_", "permissionGrantOptions_", "claimFailReason_", cjj0.k, "isEffective_", "capabilities_", "details_", PermissionGrantDetails.class});
        }
        if (iOrdinal == 3) {
            return new PermissionGrantDescription();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (PermissionGrantDescription.class) {
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

    public final Capabilities getCapabilities() {
        Capabilities capabilities = this.capabilities_;
        return capabilities == null ? Capabilities.z() : capabilities;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasCapabilities() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean n() {
        return this.isEffective_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PermissionGrantOptions o() {
        PermissionGrantOptions permissionGrantOptions = this.permissionGrantOptions_;
        return permissionGrantOptions == null ? PermissionGrantOptions.o() : permissionGrantOptions;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
