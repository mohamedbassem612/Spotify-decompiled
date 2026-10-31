package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Cta extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int COLORS_FIELD_NUMBER = 3;
    private static final Cta DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private Action action_;
    private int bitField0_;
    private Colors colors_;
    private String label_ = "";
    private String accessibilityText_ = "";
    private String ubiId_ = "";

    static {
        Cta cta = new Cta();
        DEFAULT_INSTANCE = cta;
        h.registerDefaultInstance(Cta.class, cta);
    }

    private Cta() {
    }

    public static Cta p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001d\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003dለ\u0004", new Object[]{"bitField0_", "label_", "accessibilityText_", "colors_", "action_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new Cta();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Cta.class) {
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
        Action action = this.action_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Colors o() {
        Colors colors = this.colors_;
        return colors == null ? Colors.o() : colors;
    }

    public final String q() {
        return this.label_;
    }

    public final String r() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
