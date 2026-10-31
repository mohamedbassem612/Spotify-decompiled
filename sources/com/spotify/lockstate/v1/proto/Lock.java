package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Lock extends h implements v2j0 {
    public static final int BACK_ACTION_FIELD_NUMBER = 3;
    private static final Lock DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 2;
    public static final int LOCK_TYPE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private Action backAction_;
    private int bitField0_;
    private LockLayout layout_;
    private String lockTypeId_ = "";

    static {
        Lock lock = new Lock();
        DEFAULT_INSTANCE = lock;
        h.registerDefaultInstance(Lock.class, lock);
    }

    private Lock() {
    }

    public static Lock o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "lockTypeId_", "layout_", "backAction_"});
        }
        if (iOrdinal == 3) {
            return new Lock();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (Lock.class) {
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

    public final Action n() {
        Action action = this.backAction_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LockLayout p() {
        LockLayout lockLayout = this.layout_;
        return lockLayout == null ? LockLayout.o() : lockLayout;
    }

    public final String q() {
        return this.lockTypeId_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
