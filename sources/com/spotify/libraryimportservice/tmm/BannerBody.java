package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;
import p.y4a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class BannerBody extends h implements v2j0 {
    public static final int BANNER_BODY_ICON_FIELD_NUMBER = 1;
    private static final BannerBody DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int bannerBodyIcon_;
    private String text_ = "";

    static {
        BannerBody bannerBody = new BannerBody();
        DEFAULT_INSTANCE = bannerBody;
        h.registerDefaultInstance(BannerBody.class, bannerBody);
    }

    private BannerBody() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"bannerBodyIcon_", "text_"});
        }
        if (iOrdinal == 3) {
            return new BannerBody();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (BannerBody.class) {
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

    public final y4a n() {
        y4a y4aVar;
        int i = this.bannerBodyIcon_;
        if (i == 0) {
            y4aVar = y4a.BANNER_BODY_ICON_UNSPECIFIED;
        } else if (i == 1) {
            y4aVar = y4a.SUCCESS;
        } else if (i != 2) {
            y4aVar = i != 3 ? null : y4a.FAIL;
        } else {
            y4aVar = y4a.NO_MATCH;
        }
        return y4aVar == null ? y4a.UNRECOGNIZED : y4aVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
