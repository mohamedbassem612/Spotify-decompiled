package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjj0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vls0;
import p.wks0;
import p.yls0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Permission extends h implements v2j0 {
    public static final int AUDIT_FIELD_NUMBER = 6;
    private static final Permission DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 2;
    public static final int PERMISSION_LEVEL_STATE_FIELD_NUMBER = 3;
    public static final int REVISION_FIELD_NUMBER = 1;
    private Audit audit_;
    private int bitField0_;
    private int permissionLevelState_;
    private int permissionLevel_;
    private phc revision_ = phc.b;

    static {
        Permission permission = new Permission();
        DEFAULT_INSTANCE = permission;
        h.registerDefaultInstance(Permission.class, permission);
    }

    private Permission() {
    }

    public static Permission o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static wks0 t() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001\u0003᠌\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "revision_", "permissionLevel_", cjj0.l, "permissionLevelState_", cjj0.m, "audit_"});
        }
        if (iOrdinal == 3) {
            return new Permission();
        }
        if (iOrdinal == 4) {
            return new wks0();
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
        synchronized (Permission.class) {
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

    public final phc getRevision() {
        return this.revision_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final vls0 p() {
        vls0 vls0VarA = vls0.a(this.permissionLevel_);
        return vls0VarA == null ? vls0.UNKNOWN : vls0VarA;
    }

    public final yls0 q() {
        yls0 yls0VarA = yls0.a(this.permissionLevelState_);
        return yls0VarA == null ? yls0.PERMISSION_LEVEL_STATE_UNSPECIFIED : yls0VarA;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final void setRevision(phc phcVar) {
        phcVar.getClass();
        this.bitField0_ |= 1;
        this.revision_ = phcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(vls0 vls0Var) {
        this.permissionLevel_ = vls0Var.a;
        this.bitField0_ |= 2;
    }

    public final void v() {
        this.permissionLevelState_ = 2;
        this.bitField0_ |= 4;
    }
}
