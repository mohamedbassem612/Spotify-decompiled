package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.znz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class EsLocalFiles$GetTracksRequest extends h implements v2j0 {
    private static final EsLocalFiles$GetTracksRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 2;
    public static final int QUERY_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaylistTrackDecorationPolicy policy_;
    private EsLocalFiles.Query query_;

    static {
        EsLocalFiles$GetTracksRequest esLocalFiles$GetTracksRequest = new EsLocalFiles$GetTracksRequest();
        DEFAULT_INSTANCE = esLocalFiles$GetTracksRequest;
        h.registerDefaultInstance(EsLocalFiles$GetTracksRequest.class, esLocalFiles$GetTracksRequest);
    }

    private EsLocalFiles$GetTracksRequest() {
    }

    public static znz n() {
        return (znz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "query_", "policy_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$GetTracksRequest();
        }
        if (iOrdinal == 4) {
            return new znz(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$GetTracksRequest.class) {
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

    public final void o(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.getClass();
        this.policy_ = playlistTrackDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void p(EsLocalFiles.Query query) {
        query.getClass();
        this.query_ = query;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
