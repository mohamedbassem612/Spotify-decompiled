package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.gyc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SimpleCallToAction extends h implements v2j0 {
    public static final int CALL_TO_ACTION_TEXT_FIELD_NUMBER = 3;
    private static final SimpleCallToAction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    private String title_ = "";
    private String callToActionText_ = "";

    static {
        SimpleCallToAction simpleCallToAction = new SimpleCallToAction();
        DEFAULT_INSTANCE = simpleCallToAction;
        h.registerDefaultInstance(SimpleCallToAction.class, simpleCallToAction);
    }

    private SimpleCallToAction() {
    }

    public static SimpleCallToAction o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "title_", "callToActionText_"});
        }
        if (iOrdinal == 3) {
            return new SimpleCallToAction();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (SimpleCallToAction.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.callToActionText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final gyc p() {
        gyc gycVarA = gyc.a(this.type_);
        return gycVarA == null ? gyc.g : gycVarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
