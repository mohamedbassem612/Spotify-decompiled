package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ChildSummary extends h implements v2j0 {
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final ChildSummary DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_CONTRIBUTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int count_;
    private h290 highlightedContributions_ = h.emptyProtobufList();

    static {
        ChildSummary childSummary = new ChildSummary();
        DEFAULT_INSTANCE = childSummary;
        h.registerDefaultInstance(ChildSummary.class, childSummary);
    }

    private ChildSummary() {
    }

    public static ChildSummary o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"count_", "highlightedContributions_", Contribution.class});
        }
        if (iOrdinal == 3) {
            return new ChildSummary();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ChildSummary.class) {
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

    public final int n() {
        return this.count_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.highlightedContributions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
