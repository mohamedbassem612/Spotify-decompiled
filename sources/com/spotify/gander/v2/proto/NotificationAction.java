package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mjo0;
import p.q80;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NotificationAction extends h implements v2j0 {
    private static final NotificationAction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int type_;
    private String uri_ = "";

    static {
        NotificationAction notificationAction = new NotificationAction();
        DEFAULT_INSTANCE = notificationAction;
        h.registerDefaultInstance(NotificationAction.class, notificationAction);
    }

    private NotificationAction() {
    }

    public static NotificationAction n() {
        return DEFAULT_INSTANCE;
    }

    public static mjo0 p() {
        return (mjo0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"uri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new NotificationAction();
        }
        if (iOrdinal == 4) {
            return new mjo0(DEFAULT_INSTANCE);
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
        synchronized (NotificationAction.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final q80 o() {
        q80 q80Var;
        int i = this.type_;
        if (i == 0) {
            q80Var = q80.ACTION_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            q80Var = i != 2 ? null : q80.NAVIGATE_WEBVIEW;
        } else {
            q80Var = q80.NAVIGATE;
        }
        return q80Var == null ? q80.UNRECOGNIZED : q80Var;
    }

    public final void q(q80 q80Var) {
        this.type_ = q80Var.getNumber();
    }

    public final void r(String str) {
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
