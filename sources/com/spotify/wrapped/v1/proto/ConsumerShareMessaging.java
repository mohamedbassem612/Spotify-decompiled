package com.spotify.wrapped.v1.proto;

import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.ekl;
import p.j4l;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ConsumerShareMessaging extends com.google.protobuf.h implements v2j0 {
    private static final ConsumerShareMessaging DEFAULT_INSTANCE;
    public static final int FREE_TEXT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_PARAMETERS_FIELD_NUMBER = 1;
    public static final int SHARE_URI_FIELD_NUMBER = 3;
    private qng0 queryParameters_ = qng0.b;
    private String freeText_ = "";
    private String shareUri_ = "";

    static {
        ConsumerShareMessaging consumerShareMessaging = new ConsumerShareMessaging();
        DEFAULT_INSTANCE = consumerShareMessaging;
        com.google.protobuf.h.registerDefaultInstance(ConsumerShareMessaging.class, consumerShareMessaging);
    }

    private ConsumerShareMessaging() {
    }

    public static ConsumerShareMessaging n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002Ȉ\u0003Ȉ", new Object[]{"queryParameters_", ekl.a, "freeText_", "shareUri_"});
        }
        if (iOrdinal == 3) {
            return new ConsumerShareMessaging();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (ConsumerShareMessaging.class) {
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
        return this.freeText_;
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.queryParameters_);
    }

    public final String q() {
        return this.shareUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
