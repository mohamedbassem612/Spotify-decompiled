package com.spotify.decipher.agent.v1;

import com.google.protobuf.h;
import p.a70;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ActionRequest extends h implements v2j0 {
    public static final int ACTIONS_FIELD_NUMBER = 1;
    public static final int ACTION_ID_FIELD_NUMBER = 2;
    private static final ActionRequest DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private h290 actions_ = h.emptyProtobufList();
    private String actionId_ = "";
    private String label_ = "";

    static {
        ActionRequest actionRequest = new ActionRequest();
        DEFAULT_INSTANCE = actionRequest;
        h.registerDefaultInstance(ActionRequest.class, actionRequest);
    }

    private ActionRequest() {
    }

    public static a70 p() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ", new Object[]{"actions_", Action.class, "actionId_", "label_"});
        }
        if (iOrdinal == 3) {
            return new ActionRequest();
        }
        if (iOrdinal == 4) {
            return new a70();
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
        synchronized (ActionRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(Action action) {
        action.getClass();
        h290 h290VarMutableCopy = this.actions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.actions_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(action);
    }

    public final void q(String str) {
        str.getClass();
        this.actionId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.label_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
