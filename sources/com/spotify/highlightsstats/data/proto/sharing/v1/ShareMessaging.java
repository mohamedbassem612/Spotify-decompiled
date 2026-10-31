package com.spotify.highlightsstats.data.proto.sharing.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShareMessaging extends h implements v2j0 {
    private static final ShareMessaging DEFAULT_INSTANCE;
    public static final int MESSAGE_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PREFIX_FIELD_NUMBER = 1;
    public static final int QUERY_PARAMETERS_FIELD_NUMBER = 4;
    public static final int SUFFIX_FIELD_NUMBER = 2;
    private String prefix_ = "";
    private String suffix_ = "";
    private String messageUri_ = "";
    private h290 queryParameters_ = h.emptyProtobufList();

    static {
        ShareMessaging shareMessaging = new ShareMessaging();
        DEFAULT_INSTANCE = shareMessaging;
        h.registerDefaultInstance(ShareMessaging.class, shareMessaging);
    }

    private ShareMessaging() {
    }

    public static ShareMessaging n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"prefix_", "suffix_", "messageUri_", "queryParameters_", QueryParameters.class});
        }
        if (iOrdinal == 3) {
            return new ShareMessaging();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ShareMessaging.class) {
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

    public final String getMessageUri() {
        return this.messageUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.prefix_;
    }

    public final h290 p() {
        return this.queryParameters_;
    }

    public final String q() {
        return this.suffix_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
