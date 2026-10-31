package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import p.bf40;
import p.jf40;
import p.pmu0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistGetRequest extends h implements v2j0 {
    private static final PlaylistGetRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 3;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaylistRequestDecorationPolicy policy_;
    private PlaylistQuery query_;
    private String uri_ = "";

    static {
        PlaylistGetRequest playlistGetRequest = new PlaylistGetRequest();
        DEFAULT_INSTANCE = playlistGetRequest;
        h.registerDefaultInstance(PlaylistGetRequest.class, playlistGetRequest);
    }

    private PlaylistGetRequest() {
    }

    public static pmu0 n() {
        return (pmu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "uri_", "query_", "policy_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistGetRequest();
        }
        if (iOrdinal == 4) {
            return new pmu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistGetRequest.class) {
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

    public final void o(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        playlistRequestDecorationPolicy.getClass();
        this.policy_ = playlistRequestDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void p(PlaylistQuery playlistQuery) {
        playlistQuery.getClass();
        this.query_ = playlistQuery;
        this.bitField0_ |= 1;
    }

    public final void q(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
