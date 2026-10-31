package com.spotify.allcap.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ProgressBar extends h implements v2j0 {
    private static final ProgressBar DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REMAINING_QUOTA_FIELD_NUMBER = 2;
    public static final int SEGMENTS_FIELD_NUMBER = 3;
    public static final int USED_QUOTA_FIELD_NUMBER = 1;
    private String usedQuota_ = "";
    private String remainingQuota_ = "";
    private h290 segments_ = h.emptyProtobufList();

    static {
        ProgressBar progressBar = new ProgressBar();
        DEFAULT_INSTANCE = progressBar;
        h.registerDefaultInstance(ProgressBar.class, progressBar);
    }

    private ProgressBar() {
    }

    public static ProgressBar n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"usedQuota_", "remainingQuota_", "segments_", ProgressBarSegment.class});
        }
        if (iOrdinal == 3) {
            return new ProgressBar();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ProgressBar.class) {
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
        return this.remainingQuota_;
    }

    public final h290 p() {
        return this.segments_;
    }

    public final String q() {
        return this.usedQuota_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
