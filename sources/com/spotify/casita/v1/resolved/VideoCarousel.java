package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class VideoCarousel extends h implements v2j0 {
    private static final VideoCarousel DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_FIELD_NUMBER = 3;
    private int bitField0_;
    private Heading heading_;
    private h290 items_ = h.emptyProtobufList();
    private Playback playback_;

    static {
        VideoCarousel videoCarousel = new VideoCarousel();
        DEFAULT_INSTANCE = videoCarousel;
        h.registerDefaultInstance(VideoCarousel.class, videoCarousel);
    }

    private VideoCarousel() {
    }

    public static VideoCarousel o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "heading_", "items_", Item.class, "playback_"});
        }
        if (iOrdinal == 3) {
            return new VideoCarousel();
        }
        if (iOrdinal == 4) {
            return new ofj1((byte) 0);
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
        synchronized (VideoCarousel.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final List getItemsList() {
        return this.items_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.o() : heading;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
