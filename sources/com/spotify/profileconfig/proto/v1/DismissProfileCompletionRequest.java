package com.spotify.profileconfig.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bfu;
import p.d0x0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tfu;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class DismissProfileCompletionRequest extends h implements v2j0 {
    public static final int CURRENTSCREEN_FIELD_NUMBER = 1;
    private static final DismissProfileCompletionRequest DEFAULT_INSTANCE;
    public static final int DISMISSALTRIGGER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int currentScreen_;
    private int dismissalTrigger_;

    static {
        DismissProfileCompletionRequest dismissProfileCompletionRequest = new DismissProfileCompletionRequest();
        DEFAULT_INSTANCE = dismissProfileCompletionRequest;
        h.registerDefaultInstance(DismissProfileCompletionRequest.class, dismissProfileCompletionRequest);
    }

    private DismissProfileCompletionRequest() {
    }

    public static bfu o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"currentScreen_", "dismissalTrigger_"});
        }
        if (iOrdinal == 3) {
            return new DismissProfileCompletionRequest();
        }
        if (iOrdinal == 4) {
            return new bfu();
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
        synchronized (DismissProfileCompletionRequest.class) {
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

    public final void p(d0x0 d0x0Var) {
        this.currentScreen_ = d0x0Var.getNumber();
    }

    public final void q(tfu tfuVar) {
        this.dismissalTrigger_ = tfuVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
