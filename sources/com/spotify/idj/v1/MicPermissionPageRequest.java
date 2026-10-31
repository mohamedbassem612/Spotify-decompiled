package com.spotify.idj.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ckl;
import p.frj0;
import p.jf40;
import p.jrj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class MicPermissionPageRequest extends h implements v2j0 {
    public static final int CONSUMER_FIELD_NUMBER = 3;
    private static final MicPermissionPageRequest DEFAULT_INSTANCE;
    public static final int MICPERMISSIONSTATE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private int consumer_;
    private int micPermissionState_;
    private boolean unused_;

    static {
        MicPermissionPageRequest micPermissionPageRequest = new MicPermissionPageRequest();
        DEFAULT_INSTANCE = micPermissionPageRequest;
        h.registerDefaultInstance(MicPermissionPageRequest.class, micPermissionPageRequest);
    }

    private MicPermissionPageRequest() {
    }

    public static frj0 n() {
        return (frj0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\f", new Object[]{"unused_", "micPermissionState_", "consumer_"});
        }
        if (iOrdinal == 3) {
            return new MicPermissionPageRequest();
        }
        if (iOrdinal == 4) {
            return new frj0(DEFAULT_INSTANCE);
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
        synchronized (MicPermissionPageRequest.class) {
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

    public final void o(ckl cklVar) {
        this.consumer_ = cklVar.getNumber();
    }

    public final void p(jrj0 jrj0Var) {
        this.micPermissionState_ = jrj0Var.getNumber();
    }

    public final void q() {
        this.unused_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
