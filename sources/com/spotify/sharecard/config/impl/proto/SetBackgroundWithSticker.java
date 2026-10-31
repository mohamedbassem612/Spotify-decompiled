package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pj61;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SetBackgroundWithSticker extends h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final SetBackgroundWithSticker DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STICKER_FIELD_NUMBER = 2;
    private SetBackground background_;
    private int bitField0_;
    private SetImage sticker_;

    static {
        SetBackgroundWithSticker setBackgroundWithSticker = new SetBackgroundWithSticker();
        DEFAULT_INSTANCE = setBackgroundWithSticker;
        h.registerDefaultInstance(SetBackgroundWithSticker.class, setBackgroundWithSticker);
    }

    private SetBackgroundWithSticker() {
    }

    public static pj61 n() {
        return (pj61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "background_", "sticker_"});
        }
        if (iOrdinal == 3) {
            return new SetBackgroundWithSticker();
        }
        if (iOrdinal == 4) {
            return new pj61(DEFAULT_INSTANCE);
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
        synchronized (SetBackgroundWithSticker.class) {
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

    public final void o(SetBackground setBackground) {
        setBackground.getClass();
        this.background_ = setBackground;
        this.bitField0_ |= 1;
    }

    public final void p(SetImage setImage) {
        setImage.getClass();
        this.sticker_ = setImage;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
