package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.playlist.proto.ContainsRequest;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rhu0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PlaylistContainsRequest extends h implements v2j0 {
    private static final PlaylistContainsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private ContainsRequest request_;
    private String uri_ = "";

    static {
        PlaylistContainsRequest playlistContainsRequest = new PlaylistContainsRequest();
        DEFAULT_INSTANCE = playlistContainsRequest;
        h.registerDefaultInstance(PlaylistContainsRequest.class, playlistContainsRequest);
    }

    private PlaylistContainsRequest() {
    }

    public static rhu0 n() {
        return (rhu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "request_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistContainsRequest();
        }
        if (iOrdinal == 4) {
            return new rhu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistContainsRequest.class) {
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

    public final void o(ContainsRequest containsRequest) {
        containsRequest.getClass();
        this.request_ = containsRequest;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
