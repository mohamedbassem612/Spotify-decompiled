package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hye1;
import p.jf40;
import p.p3d1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y3f1;
import p.z3f1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Tooltip extends h implements v2j0 {
    public static final int ANCHOR_VIEW_TYPE_FIELD_NUMBER = 5;
    public static final int ARROW_DIRECTION_FIELD_NUMBER = 7;
    public static final int AUTO_DISMISS_TIMER_LENGTH_FIELD_NUMBER = 6;
    public static final int BASE_TOOLTIP_FIELD_NUMBER = 4;
    private static final Tooltip DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int anchorViewType_;
    private int arrowDirection_;
    private int autoDismissTimerLength_;
    private int bitField0_;
    private int tooltipTemplateCase_ = 0;
    private Object tooltipTemplate_;

    static {
        Tooltip tooltip = new Tooltip();
        DEFAULT_INSTANCE = tooltip;
        h.registerDefaultInstance(Tooltip.class, tooltip);
    }

    private Tooltip() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Tooltip s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004<\u0000\u0005\f\u0006င\u0000\u0007\f", new Object[]{"tooltipTemplate_", "tooltipTemplateCase_", "bitField0_", BaseTooltip.class, "anchorViewType_", "autoDismissTimerLength_", "arrowDirection_"});
        }
        if (iOrdinal == 3) {
            return new Tooltip();
        }
        if (iOrdinal == 4) {
            return new hye1((byte) 10);
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
        synchronized (Tooltip.class) {
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

    public final y3f1 o() {
        y3f1 y3f1VarA = y3f1.a(this.anchorViewType_);
        return y3f1VarA == null ? y3f1.d : y3f1VarA;
    }

    public final z3f1 p() {
        z3f1 z3f1VarA = z3f1.a(this.arrowDirection_);
        return z3f1VarA == null ? z3f1.g : z3f1VarA;
    }

    public final int q() {
        return this.autoDismissTimerLength_;
    }

    public final BaseTooltip r() {
        return this.tooltipTemplateCase_ == 4 ? (BaseTooltip) this.tooltipTemplate_ : BaseTooltip.q();
    }

    public final int t() {
        return p3d1.b(this.tooltipTemplateCase_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
