package com.spotify.collection_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dx91;
import p.ex91;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SnoozeRequest extends h implements v2j0 {
    private static final SnoozeRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SNOOZE_CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int duration_;
    private String uri_ = "";
    private String snoozeContextUri_ = "";

    static {
        SnoozeRequest snoozeRequest = new SnoozeRequest();
        DEFAULT_INSTANCE = snoozeRequest;
        h.registerDefaultInstance(SnoozeRequest.class, snoozeRequest);
    }

    private SnoozeRequest() {
    }

    public static dx91 n() {
        return (dx91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"uri_", "snoozeContextUri_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new SnoozeRequest();
        }
        if (iOrdinal == 4) {
            return new dx91(DEFAULT_INSTANCE);
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
        synchronized (SnoozeRequest.class) {
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

    public final void o() {
        this.duration_ = ex91.SNOOZE_DURATION_30_DAYS.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.snoozeContextUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
