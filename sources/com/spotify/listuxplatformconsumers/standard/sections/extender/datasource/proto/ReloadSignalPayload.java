package com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.proto;

import com.google.protobuf.h;
import p.ay11;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ReloadSignalPayload extends h implements v2j0 {
    private static final ReloadSignalPayload DEFAULT_INSTANCE;
    public static final int IS_MIXED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_EXTENDER_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isMixed_;
    private PlaylistExtender playlistExtender_;

    static {
        ReloadSignalPayload reloadSignalPayload = new ReloadSignalPayload();
        DEFAULT_INSTANCE = reloadSignalPayload;
        h.registerDefaultInstance(ReloadSignalPayload.class, reloadSignalPayload);
    }

    private ReloadSignalPayload() {
    }

    public static ay11 n() {
        return (ay11) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "isMixed_", "playlistExtender_"});
        }
        if (iOrdinal == 3) {
            return new ReloadSignalPayload();
        }
        if (iOrdinal == 4) {
            return new ay11(DEFAULT_INSTANCE);
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
        synchronized (ReloadSignalPayload.class) {
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

    public final void o() {
        this.isMixed_ = true;
    }

    public final void p(PlaylistExtender playlistExtender) {
        playlistExtender.getClass();
        this.playlistExtender_ = playlistExtender;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
