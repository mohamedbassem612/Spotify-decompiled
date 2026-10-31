package com.spotify.listuxplatformconsumers.standard.sections.bottomactions;

import com.google.protobuf.h;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tsb;
import p.usb;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class BottomActionsVisibilityProto$State extends h implements v2j0 {
    private static final BottomActionsVisibilityProto$State DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_STATE_FIELD_NUMBER = 1;
    private qng0 userState_ = qng0.b;

    static {
        BottomActionsVisibilityProto$State bottomActionsVisibilityProto$State = new BottomActionsVisibilityProto$State();
        DEFAULT_INSTANCE = bottomActionsVisibilityProto$State;
        h.registerDefaultInstance(BottomActionsVisibilityProto$State.class, bottomActionsVisibilityProto$State);
    }

    private BottomActionsVisibilityProto$State() {
    }

    public static BottomActionsVisibilityProto$State n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BottomActionsVisibilityProto$State q(FileInputStream fileInputStream) {
        return (BottomActionsVisibilityProto$State) h.parseFrom(DEFAULT_INSTANCE, fileInputStream);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"userState_", usb.a});
        }
        if (iOrdinal == 3) {
            return new BottomActionsVisibilityProto$State();
        }
        if (iOrdinal == 4) {
            return new tsb(DEFAULT_INSTANCE);
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
        synchronized (BottomActionsVisibilityProto$State.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.userState_);
    }

    public final qng0 p() {
        qng0 qng0Var = this.userState_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.userState_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
