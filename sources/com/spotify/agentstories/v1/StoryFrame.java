package com.spotify.agentstories.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.r9c1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class StoryFrame extends h implements v2j0 {
    private static final StoryFrame DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REC_URIS_FIELD_NUMBER = 3;
    public static final int SOURCES_FIELD_NUMBER = 4;
    public static final int STORY_ID_FIELD_NUMBER = 1;
    public static final int STORY_TYPE_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int storyType_;
    private String storyId_ = "";
    private String text_ = "";
    private h290 recUris_ = h.emptyProtobufList();
    private h290 sources_ = h.emptyProtobufList();

    static {
        StoryFrame storyFrame = new StoryFrame();
        DEFAULT_INSTANCE = storyFrame;
        h.registerDefaultInstance(StoryFrame.class, storyFrame);
    }

    private StoryFrame() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u001b\u0007\f", new Object[]{"storyId_", "text_", "recUris_", "sources_", StorySource.class, "storyType_"});
        }
        if (iOrdinal == 3) {
            return new StoryFrame();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (StoryFrame.class) {
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

    public final h290 n() {
        return this.recUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.sources_;
    }

    public final String p() {
        return this.storyId_;
    }

    public final r9c1 q() {
        r9c1 r9c1Var;
        int i = this.storyType_;
        if (i == 0) {
            r9c1Var = r9c1.b;
        } else if (i != 1) {
            r9c1Var = i != 2 ? null : r9c1.d;
        } else {
            r9c1Var = r9c1.c;
        }
        return r9c1Var == null ? r9c1.e : r9c1Var;
    }

    public final String r() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
