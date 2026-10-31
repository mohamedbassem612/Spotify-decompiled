package com.spotify.quizaccessservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h780;
import p.i780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Inaccessible extends h implements v2j0 {
    private static final Inaccessible DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int reason_;
    private String message_ = "";
    private String title_ = "";

    static {
        Inaccessible inaccessible = new Inaccessible();
        DEFAULT_INSTANCE = inaccessible;
        h.registerDefaultInstance(Inaccessible.class, inaccessible);
    }

    private Inaccessible() {
    }

    public static Inaccessible n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003Ȉ", new Object[]{"bitField0_", "message_", "reason_", "title_"});
        }
        if (iOrdinal == 3) {
            return new Inaccessible();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (Inaccessible.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final i780 o() {
        i780 i780Var;
        int i = this.reason_;
        if (i != 0) {
            i780Var = i != 1 ? null : i780.REQUIRES_PREMIUM;
        } else {
            i780Var = i780.INACCESSIBLE_REASON_UNSPECIFIED;
        }
        return i780Var == null ? i780.UNRECOGNIZED : i780Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
