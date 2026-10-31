package com.spotify.carmobile.jumpstart.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.xha0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class JumpstartError extends h implements v2j0 {
    private static final JumpstartError DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int RESTRICTIONS_FIELD_NUMBER = 5;
    public static final int TRIGGER_FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int TRIGGER_METHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private String triggerFeatureIdentifier_ = "";
    private String triggerMethod_ = "";
    private String reason_ = "";
    private String message_ = "";
    private h290 restrictions_ = h.emptyProtobufList();

    static {
        JumpstartError jumpstartError = new JumpstartError();
        DEFAULT_INSTANCE = jumpstartError;
        h.registerDefaultInstance(JumpstartError.class, jumpstartError);
    }

    private JumpstartError() {
    }

    public static xha0 o() {
        return (xha0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a", new Object[]{"bitField0_", "triggerFeatureIdentifier_", "triggerMethod_", "reason_", "message_", "restrictions_"});
        }
        if (iOrdinal == 3) {
            return new JumpstartError();
        }
        if (iOrdinal == 4) {
            return new xha0(DEFAULT_INSTANCE);
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
        synchronized (JumpstartError.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.restrictions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.restrictions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.message_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.reason_ = str;
    }

    public final void r() {
        this.bitField0_ |= 1;
        this.triggerFeatureIdentifier_ = "car_detection";
    }

    public final void s() {
        this.bitField0_ |= 2;
        this.triggerMethod_ = "play";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
