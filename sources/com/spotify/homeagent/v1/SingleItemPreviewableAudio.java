package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SingleItemPreviewableAudio extends h implements v2j0 {
    private static final SingleItemPreviewableAudio DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int HEADING_FIELD_NUMBER = 4;
    public static final int ITEM_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Heading heading_;
    private WorldItem item_;
    private String title_ = "";
    private String description_ = "";

    static {
        SingleItemPreviewableAudio singleItemPreviewableAudio = new SingleItemPreviewableAudio();
        DEFAULT_INSTANCE = singleItemPreviewableAudio;
        h.registerDefaultInstance(SingleItemPreviewableAudio.class, singleItemPreviewableAudio);
    }

    private SingleItemPreviewableAudio() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "title_", "description_", "item_", "heading_"});
        }
        if (iOrdinal == 3) {
            return new SingleItemPreviewableAudio();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (SingleItemPreviewableAudio.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
