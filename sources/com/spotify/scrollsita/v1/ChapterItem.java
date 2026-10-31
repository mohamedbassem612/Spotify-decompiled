package com.spotify.scrollsita.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ChapterItem extends h implements v2j0 {
    private static final ChapterItem DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 3;
    public static final int HAS_CREATOR_TIMESTAMPS_FIELD_NUMBER = 4;
    public static final int NEEDS_REMAPPING_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int START_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration end_;
    private boolean hasCreatorTimestamps_;
    private boolean needsRemapping_;
    private Duration start_;
    private String uri_ = "";

    static {
        ChapterItem chapterItem = new ChapterItem();
        DEFAULT_INSTANCE = chapterItem;
        h.registerDefaultInstance(ChapterItem.class, chapterItem);
    }

    private ChapterItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005\u0007", new Object[]{"bitField0_", "uri_", "start_", "end_", "hasCreatorTimestamps_", "needsRemapping_"});
        }
        if (iOrdinal == 3) {
            return new ChapterItem();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ChapterItem.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
