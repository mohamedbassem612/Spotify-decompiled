package com.spotify.kidsentitybanning.search.v1;

import com.google.protobuf.h;
import p.bf40;
import p.f4a;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TrackEntity extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int BAN_STATUS_FIELD_NUMBER = 4;
    private static final TrackEntity DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private ArtistEntity artist_;
    private int banStatus_;
    private int bitField0_;
    private boolean isBanned_;
    private String uri_ = "";

    static {
        TrackEntity trackEntity = new TrackEntity();
        DEFAULT_INSTANCE = trackEntity;
        h.registerDefaultInstance(TrackEntity.class, trackEntity);
    }

    private TrackEntity() {
    }

    public static TrackEntity p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003ဉ\u0000\u0004\f", new Object[]{"bitField0_", "uri_", "isBanned_", "artist_", "banStatus_"});
        }
        if (iOrdinal == 3) {
            return new TrackEntity();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (TrackEntity.class) {
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

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasArtist() {
        return (this.bitField0_ & 1) != 0;
    }

    public final ArtistEntity n() {
        ArtistEntity artistEntity = this.artist_;
        return artistEntity == null ? ArtistEntity.o() : artistEntity;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final f4a o() {
        f4a f4aVarA = f4a.a(this.banStatus_);
        return f4aVarA == null ? f4a.UNRECOGNIZED : f4aVarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
