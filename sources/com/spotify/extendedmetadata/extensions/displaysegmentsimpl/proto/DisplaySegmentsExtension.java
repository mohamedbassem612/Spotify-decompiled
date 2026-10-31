package com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DisplaySegmentsExtension extends h implements v2j0 {
    private static final DisplaySegmentsExtension DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 3;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    public static final int MUSIC_AND_TALK_DECORATION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENTS_FIELD_NUMBER = 2;
    private Object decoration_;
    private int durationMs_;
    private int decorationCase_ = 0;
    private String episodeUri_ = "";
    private h290 segments_ = h.emptyProtobufList();

    static {
        DisplaySegmentsExtension displaySegmentsExtension = new DisplaySegmentsExtension();
        DEFAULT_INSTANCE = displaySegmentsExtension;
        h.registerDefaultInstance(DisplaySegmentsExtension.class, displaySegmentsExtension);
    }

    private DisplaySegmentsExtension() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static DisplaySegmentsExtension r(byte[] bArr) {
        return (DisplaySegmentsExtension) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0004\u0004<\u0000", new Object[]{"decoration_", "decorationCase_", "episodeUri_", "segments_", DisplaySegment.class, "durationMs_", MusicAndTalkDecoration.class});
        }
        if (iOrdinal == 3) {
            return new DisplaySegmentsExtension();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (DisplaySegmentsExtension.class) {
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
        return this.durationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.episodeUri_;
    }

    public final MusicAndTalkDecoration p() {
        return this.decorationCase_ == 4 ? (MusicAndTalkDecoration) this.decoration_ : MusicAndTalkDecoration.n();
    }

    public final h290 q() {
        return this.segments_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
