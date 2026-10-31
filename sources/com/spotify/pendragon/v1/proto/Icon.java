package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ql70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Icon extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final Icon DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String color_ = "";
    private int name_;

    static {
        Icon icon = new Icon();
        DEFAULT_INSTANCE = icon;
        h.registerDefaultInstance(Icon.class, icon);
    }

    private Icon() {
    }

    public static Icon p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"name_", "color_"});
        }
        if (iOrdinal == 3) {
            return new Icon();
        }
        if (iOrdinal == 4) {
            return new y070((byte) 10);
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
        synchronized (Icon.class) {
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

    public final String o() {
        return this.color_;
    }

    public final ql70 q() {
        ql70 ql70Var;
        switch (this.name_) {
            case 0:
                ql70Var = ql70.ICON_UNKNOWN;
                break;
            case 1:
                ql70Var = ql70.SHUFFLE;
                break;
            case 2:
                ql70Var = ql70.SPOTIFYLOGO;
                break;
            case 3:
                ql70Var = ql70.X;
                break;
            case 4:
                ql70Var = ql70.EXCLAMATIONCIRCLE;
                break;
            case 5:
                ql70Var = ql70.CHEVRONRIGHT;
                break;
            case 6:
                ql70Var = ql70.FOLLOWACTIVE;
                break;
            case 7:
                ql70Var = ql70.DEVICETV;
                break;
            case 8:
                ql70Var = ql70.DEVICESPEAKER;
                break;
            case 9:
                ql70Var = ql70.EXTERNALLINK;
                break;
            default:
                ql70Var = null;
                break;
        }
        return ql70Var == null ? ql70.UNRECOGNIZED : ql70Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
