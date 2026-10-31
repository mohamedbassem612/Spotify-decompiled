package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsQueue$Queue extends h implements v2j0 {
    private static final EsQueue$Queue DEFAULT_INSTANCE;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PREV_TRACKS_FIELD_NUMBER = 4;
    public static final int QUEUE_REVISION_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 nextTracks_ = h.emptyProtobufList();
    private h290 prevTracks_ = h.emptyProtobufList();
    private long queueRevision_;
    private EsProvidedTrack$ProvidedTrack track_;

    static {
        EsQueue$Queue esQueue$Queue = new EsQueue$Queue();
        DEFAULT_INSTANCE = esQueue$Queue;
        h.registerDefaultInstance(EsQueue$Queue.class, esQueue$Queue);
    }

    private EsQueue$Queue() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsQueue$Queue v(byte[] bArr) {
        return (EsQueue$Queue) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0003\u0002ဉ\u0000\u0003\u001b\u0004\u001b", new Object[]{"bitField0_", "queueRevision_", "track_", "nextTracks_", EsProvidedTrack$ProvidedTrack.class, "prevTracks_", EsProvidedTrack$ProvidedTrack.class});
        }
        if (iOrdinal == 3) {
            return new EsQueue$Queue();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 20);
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
        synchronized (EsQueue$Queue.class) {
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

    public final int o() {
        return this.nextTracks_.size();
    }

    public final h290 p() {
        return this.nextTracks_;
    }

    public final int q() {
        return this.prevTracks_.size();
    }

    public final h290 r() {
        return this.prevTracks_;
    }

    public final long s() {
        return this.queueRevision_;
    }

    public final EsProvidedTrack$ProvidedTrack t() {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.track_;
        return esProvidedTrack$ProvidedTrack == null ? EsProvidedTrack$ProvidedTrack.p() : esProvidedTrack$ProvidedTrack;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
