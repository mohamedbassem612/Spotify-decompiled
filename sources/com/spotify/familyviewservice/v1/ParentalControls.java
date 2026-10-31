package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ParentalControls extends h implements v2j0 {
    public static final int CANVAS_LOCKED_FIELD_NUMBER = 4;
    private static final ParentalControls DEFAULT_INSTANCE;
    public static final int EXPLICIT_CONTENT_LOCKED_FIELD_NUMBER = 1;
    public static final int MUSIC_VIDEOS_LOCKED_FIELD_NUMBER = 2;
    public static final int OTHER_VIDEOS_LOCKED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private boolean canvasLocked_;
    private boolean explicitContentLocked_;
    private boolean musicVideosLocked_;
    private boolean otherVideosLocked_;

    static {
        ParentalControls parentalControls = new ParentalControls();
        DEFAULT_INSTANCE = parentalControls;
        h.registerDefaultInstance(ParentalControls.class, parentalControls);
    }

    private ParentalControls() {
    }

    public static ParentalControls o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"explicitContentLocked_", "musicVideosLocked_", "otherVideosLocked_", "canvasLocked_"});
        }
        if (iOrdinal == 3) {
            return new ParentalControls();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ParentalControls.class) {
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

    public final boolean n() {
        return this.canvasLocked_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.explicitContentLocked_;
    }

    public final boolean q() {
        return this.musicVideosLocked_;
    }

    public final boolean r() {
        return this.otherVideosLocked_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
