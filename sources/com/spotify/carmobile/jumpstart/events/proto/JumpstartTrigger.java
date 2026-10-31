package com.spotify.carmobile.jumpstart.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cia0;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class JumpstartTrigger extends h implements v2j0 {
    public static final int CONNECTED_ACCESSORIES_FIELD_NUMBER = 4;
    private static final JumpstartTrigger DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRIGGER_FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int TRIGGER_METHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private String triggerFeatureIdentifier_ = "";
    private String triggerMethod_ = "";
    private String interactionId_ = "";
    private h290 connectedAccessories_ = h.emptyProtobufList();

    static {
        JumpstartTrigger jumpstartTrigger = new JumpstartTrigger();
        DEFAULT_INSTANCE = jumpstartTrigger;
        h.registerDefaultInstance(JumpstartTrigger.class, jumpstartTrigger);
    }

    private JumpstartTrigger() {
    }

    public static cia0 o() {
        return (cia0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"bitField0_", "triggerFeatureIdentifier_", "triggerMethod_", "interactionId_", "connectedAccessories_"});
        }
        if (iOrdinal == 3) {
            return new JumpstartTrigger();
        }
        if (iOrdinal == 4) {
            return new cia0(DEFAULT_INSTANCE);
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
        synchronized (JumpstartTrigger.class) {
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

    public final void n(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.connectedAccessories_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.connectedAccessories_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.interactionId_ = str;
    }

    public final void q() {
        this.bitField0_ |= 1;
        this.triggerFeatureIdentifier_ = "car_detection";
    }

    public final void r() {
        this.bitField0_ |= 2;
        this.triggerMethod_ = "play";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
