package com.spotify.campaignsservice.retrieval.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class HeroTitles extends h implements v2j0 {
    public static final int BASELINE_TITLE_FIELD_NUMBER = 2;
    private static final HeroTitles DEFAULT_INSTANCE;
    public static final int HEADER_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String headerTitle_ = "";
    private String baselineTitle_ = "";

    static {
        HeroTitles heroTitles = new HeroTitles();
        DEFAULT_INSTANCE = heroTitles;
        h.registerDefaultInstance(HeroTitles.class, heroTitles);
    }

    private HeroTitles() {
    }

    public static HeroTitles o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"headerTitle_", "baselineTitle_"});
        }
        if (iOrdinal == 3) {
            return new HeroTitles();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (HeroTitles.class) {
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
        return this.baselineTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.headerTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
