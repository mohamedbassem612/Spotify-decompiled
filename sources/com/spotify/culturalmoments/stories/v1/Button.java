package com.spotify.culturalmoments.stories.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Button extends h implements v2j0 {
    public static final int BACKGROUND_TINT_FIELD_NUMBER = 3;
    private static final Button DEFAULT_INSTANCE;
    public static final int LABEL_COLOR_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String label_ = "";
    private String labelColor_ = "";
    private String backgroundTint_ = "";

    static {
        Button button = new Button();
        DEFAULT_INSTANCE = button;
        h.registerDefaultInstance(Button.class, button);
    }

    private Button() {
    }

    public static Button o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"label_", "labelColor_", "backgroundTint_"});
        }
        if (iOrdinal == 3) {
            return new Button();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (Button.class) {
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

    public final String n() {
        return this.backgroundTint_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.label_;
    }

    public final String q() {
        return this.labelColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
