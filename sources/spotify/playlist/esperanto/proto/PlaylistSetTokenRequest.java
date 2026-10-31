package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vtu0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PlaylistSetTokenRequest extends h implements v2j0 {
    private static final PlaylistSetTokenRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String token_ = "";

    static {
        PlaylistSetTokenRequest playlistSetTokenRequest = new PlaylistSetTokenRequest();
        DEFAULT_INSTANCE = playlistSetTokenRequest;
        h.registerDefaultInstance(PlaylistSetTokenRequest.class, playlistSetTokenRequest);
    }

    private PlaylistSetTokenRequest() {
    }

    public static vtu0 n() {
        return (vtu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "token_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistSetTokenRequest();
        }
        if (iOrdinal == 4) {
            return new vtu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistSetTokenRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.token_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
