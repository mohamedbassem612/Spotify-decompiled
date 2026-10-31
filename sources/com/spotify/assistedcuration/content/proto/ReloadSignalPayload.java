package com.spotify.assistedcuration.content.proto;

import com.google.protobuf.h;
import p.bf40;
import p.by11;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ReloadSignalPayload extends h implements v2j0 {
    public static final int ASSISTED_CURATION_TRACKS_FIELD_NUMBER = 4;
    public static final int BRIDGE_TRACKS_FIELD_NUMBER = 2;
    private static final ReloadSignalPayload DEFAULT_INSTANCE;
    public static final int IS_MIXED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_EXTENDER_FIELD_NUMBER = 3;
    private int featurePayloadCase_ = 0;
    private Object featurePayload_;
    private boolean isMixed_;

    static {
        ReloadSignalPayload reloadSignalPayload = new ReloadSignalPayload();
        DEFAULT_INSTANCE = reloadSignalPayload;
        h.registerDefaultInstance(ReloadSignalPayload.class, reloadSignalPayload);
    }

    private ReloadSignalPayload() {
    }

    public static by11 n() {
        return (by11) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"featurePayload_", "featurePayloadCase_", "isMixed_", BridgeTracks.class, PlaylistExtender.class, AssistedCurationTracks.class});
        }
        if (iOrdinal == 3) {
            return new ReloadSignalPayload();
        }
        if (iOrdinal == 4) {
            return new by11(DEFAULT_INSTANCE);
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

    public final void o(AssistedCurationTracks assistedCurationTracks) {
        assistedCurationTracks.getClass();
        this.featurePayload_ = assistedCurationTracks;
        this.featurePayloadCase_ = 4;
    }

    public final void p() {
        this.isMixed_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
