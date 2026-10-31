package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pnz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsGetStateRequest$GetStateRequest extends h implements v2j0 {
    private static final EsGetStateRequest$GetStateRequest DEFAULT_INSTANCE;
    public static final int LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int NEXT_TRACKS_CAP_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PREV_TRACKS_CAP_FIELD_NUMBER = 1;
    private int bitField0_;
    private String logicalPlaybackIdentifier_ = "";
    private EsOptional$OptionalInt64 nextTracksCap_;
    private EsOptional$OptionalInt64 prevTracksCap_;

    static {
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = new EsGetStateRequest$GetStateRequest();
        DEFAULT_INSTANCE = esGetStateRequest$GetStateRequest;
        h.registerDefaultInstance(EsGetStateRequest$GetStateRequest.class, esGetStateRequest$GetStateRequest);
    }

    private EsGetStateRequest$GetStateRequest() {
    }

    public static EsGetStateRequest$GetStateRequest n() {
        return DEFAULT_INSTANCE;
    }

    public static pnz o() {
        return (pnz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "prevTracksCap_", "nextTracksCap_", "logicalPlaybackIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsGetStateRequest$GetStateRequest();
        }
        if (iOrdinal == 4) {
            return new pnz(DEFAULT_INSTANCE);
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
        synchronized (EsGetStateRequest$GetStateRequest.class) {
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

    public final void p(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esOptional$OptionalInt64.getClass();
        this.nextTracksCap_ = esOptional$OptionalInt64;
        this.bitField0_ |= 2;
    }

    public final void q(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esOptional$OptionalInt64.getClass();
        this.prevTracksCap_ = esOptional$OptionalInt64;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
