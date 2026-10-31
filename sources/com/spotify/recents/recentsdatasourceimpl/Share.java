package com.spotify.recents.recentsdatasourceimpl;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Share extends h implements v2j0 {
    private static final Share DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_DEEPLINK_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int USER_URI_FIELD_NUMBER = 1;
    private String userUri_ = "";
    private String shareDeeplink_ = "";
    private String source_ = "";

    static {
        Share share = new Share();
        DEFAULT_INSTANCE = share;
        h.registerDefaultInstance(Share.class, share);
    }

    private Share() {
    }

    public static Share p(byte[] bArr) {
        return (Share) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"userUri_", "shareDeeplink_", "source_"});
        }
        if (iOrdinal == 3) {
            return new Share();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (Share.class) {
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
        return this.shareDeeplink_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.userUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
