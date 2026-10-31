package com.spotify.unboxingfeatureflows.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowButton extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BUTTON_TEXT_FIELD_NUMBER = 1;
    private static final FlowButton DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private Action action_;
    private int bitField0_;
    private String buttonText_ = "";

    static {
        FlowButton flowButton = new FlowButton();
        DEFAULT_INSTANCE = flowButton;
        h.registerDefaultInstance(FlowButton.class, flowButton);
    }

    private FlowButton() {
    }

    public static FlowButton p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "buttonText_", "action_"});
        }
        if (iOrdinal == 3) {
            return new FlowButton();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (FlowButton.class) {
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
        return action == null ? Action.n() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.buttonText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
