package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.ShareConfiguration;
import p.bf40;
import p.h290;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Highlights extends h implements v2j0 {
    private static final Highlights DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 highlights_ = h.emptyProtobufList();
    private ShareConfiguration shareConfiguration_;
    private int status_;

    static {
        Highlights highlights = new Highlights();
        DEFAULT_INSTANCE = highlights;
        h.registerDefaultInstance(Highlights.class, highlights);
    }

    private Highlights() {
    }

    public static Highlights n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "highlights_", Highlight.class, "status_", "shareConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new Highlights();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (Highlights.class) {
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

    public final h290 o() {
        return this.highlights_;
    }

    public final ShareConfiguration p() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.n() : shareConfiguration;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
