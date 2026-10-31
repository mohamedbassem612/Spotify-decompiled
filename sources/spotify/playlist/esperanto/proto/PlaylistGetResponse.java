package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.playlist.proto.PlaylistRequest$Response;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistGetResponse extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final PlaylistGetResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaylistRequest$Response data_;
    private PlaylistQuery query_;
    private ResponseStatus status_;

    static {
        PlaylistGetResponse playlistGetResponse = new PlaylistGetResponse();
        DEFAULT_INSTANCE = playlistGetResponse;
        h.registerDefaultInstance(PlaylistGetResponse.class, playlistGetResponse);
    }

    private PlaylistGetResponse() {
    }

    public static PlaylistGetResponse p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaylistGetResponse s(byte[] bArr) {
        return (PlaylistGetResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "status_", "data_", "query_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistGetResponse();
        }
        if (iOrdinal == 4) {
            return new dzt0((byte) 20);
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
        synchronized (PlaylistGetResponse.class) {
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

    public final PlaylistRequest$Response o() {
        PlaylistRequest$Response playlistRequest$Response = this.data_;
        return playlistRequest$Response == null ? PlaylistRequest$Response.s() : playlistRequest$Response;
    }

    public final PlaylistQuery q() {
        PlaylistQuery playlistQuery = this.query_;
        return playlistQuery == null ? PlaylistQuery.u() : playlistQuery;
    }

    public final ResponseStatus r() {
        ResponseStatus responseStatus = this.status_;
        return responseStatus == null ? ResponseStatus.o() : responseStatus;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
