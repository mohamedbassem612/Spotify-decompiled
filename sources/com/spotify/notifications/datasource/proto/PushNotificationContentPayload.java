package com.spotify.notifications.datasource.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vvy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PushNotificationContentPayload extends h implements v2j0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    private static final PushNotificationContentPayload DEFAULT_INSTANCE;
    public static final int MEDIA_CONTENT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_CONTENT_FIELD_NUMBER = 2;
    private int contentCase_ = 0;
    private int contentType_;
    private Object content_;

    static {
        PushNotificationContentPayload pushNotificationContentPayload = new PushNotificationContentPayload();
        DEFAULT_INSTANCE = pushNotificationContentPayload;
        h.registerDefaultInstance(PushNotificationContentPayload.class, pushNotificationContentPayload);
    }

    private PushNotificationContentPayload() {
    }

    public static PushNotificationContentPayload o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"content_", "contentCase_", "contentType_", TextContent.class, MediaContent.class});
        }
        if (iOrdinal == 3) {
            return new PushNotificationContentPayload();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (PushNotificationContentPayload.class) {
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

    public final vvy0 n() {
        vvy0 vvy0Var;
        int i = this.contentType_;
        if (i == 0) {
            vvy0Var = vvy0.CONTENT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            vvy0Var = i != 2 ? null : vvy0.CONTENT_TYPE_MEDIA;
        } else {
            vvy0Var = vvy0.CONTENT_TYPE_TEXT;
        }
        return vvy0Var == null ? vvy0.UNRECOGNIZED : vvy0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final MediaContent p() {
        return this.contentCase_ == 3 ? (MediaContent) this.content_ : MediaContent.o();
    }

    public final TextContent q() {
        return this.contentCase_ == 2 ? (TextContent) this.content_ : TextContent.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
