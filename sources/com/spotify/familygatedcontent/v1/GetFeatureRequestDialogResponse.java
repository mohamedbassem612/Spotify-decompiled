package com.spotify.familygatedcontent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.jf40;
import p.qn10;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GetFeatureRequestDialogResponse extends h implements v2j0 {
    public static final int CLOSE_ACTION_TITLE_FIELD_NUMBER = 5;
    private static final GetFeatureRequestDialogResponse DEFAULT_INSTANCE;
    public static final int DIALOG_MESSAGE_FIELD_NUMBER = 2;
    public static final int DIALOG_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ACTION_FIELD_NUMBER = 3;
    public static final int REQUEST_ACTION_TITLE_FIELD_NUMBER = 4;
    private int requestAction_;
    private String dialogTitle_ = "";
    private String dialogMessage_ = "";
    private String requestActionTitle_ = "";
    private String closeActionTitle_ = "";

    static {
        GetFeatureRequestDialogResponse getFeatureRequestDialogResponse = new GetFeatureRequestDialogResponse();
        DEFAULT_INSTANCE = getFeatureRequestDialogResponse;
        h.registerDefaultInstance(GetFeatureRequestDialogResponse.class, getFeatureRequestDialogResponse);
    }

    private GetFeatureRequestDialogResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ", new Object[]{"dialogTitle_", "dialogMessage_", "requestAction_", "requestActionTitle_", "closeActionTitle_"});
        }
        if (iOrdinal == 3) {
            return new GetFeatureRequestDialogResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (GetFeatureRequestDialogResponse.class) {
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
        return this.closeActionTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.dialogMessage_;
    }

    public final String p() {
        return this.dialogTitle_;
    }

    public final qn10 q() {
        qn10 qn10Var;
        int i = this.requestAction_;
        if (i != 0) {
            qn10Var = i != 1 ? null : qn10.c;
        } else {
            qn10Var = qn10.b;
        }
        return qn10Var == null ? qn10.d : qn10Var;
    }

    public final String r() {
        return this.requestActionTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
