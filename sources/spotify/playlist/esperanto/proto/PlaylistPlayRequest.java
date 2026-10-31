package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import p.bf40;
import p.hqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PlaylistPlayRequest extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final PlaylistPlayRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_QUERY_FIELD_NUMBER = 1;
    public static final int PLAY_OPTIONS_FIELD_NUMBER = 3;
    public static final int PLAY_ORIGIN_FIELD_NUMBER = 6;
    public static final int PREPARE_PLAY_OPTIONS_FIELD_NUMBER = 5;
    public static final int RAW_SIGNAL_FIELD_NUMBER = 7;
    private int bitField0_;
    private EsContext.Context context_;
    private EsLoggingParams.LoggingParams loggingParams_;
    private EsPlayOptions.PlayOptions playOptions_;
    private EsPlayOrigin.PlayOrigin playOrigin_;
    private PlaylistQuery playlistQuery_;
    private EsPreparePlayOptions.PreparePlayOptions preparePlayOptions_;
    private Signal rawSignal_;

    static {
        PlaylistPlayRequest playlistPlayRequest = new PlaylistPlayRequest();
        DEFAULT_INSTANCE = playlistPlayRequest;
        h.registerDefaultInstance(PlaylistPlayRequest.class, playlistPlayRequest);
    }

    private PlaylistPlayRequest() {
    }

    public static hqu0 n() {
        return (hqu0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "playlistQuery_", "context_", "playOptions_", "loggingParams_", "preparePlayOptions_", "playOrigin_", "rawSignal_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistPlayRequest();
        }
        if (iOrdinal == 4) {
            return new hqu0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistPlayRequest.class) {
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

    public final void o(EsContext.Context context) {
        context.getClass();
        this.context_ = context;
        this.bitField0_ |= 2;
    }

    public final void p(EsLoggingParams.LoggingParams loggingParams) {
        loggingParams.getClass();
        this.loggingParams_ = loggingParams;
        this.bitField0_ |= 8;
    }

    public final void q(EsPlayOptions.PlayOptions playOptions) {
        playOptions.getClass();
        this.playOptions_ = playOptions;
        this.bitField0_ |= 4;
    }

    public final void r(EsPlayOrigin.PlayOrigin playOrigin) {
        playOrigin.getClass();
        this.playOrigin_ = playOrigin;
        this.bitField0_ |= 32;
    }

    public final void s(PlaylistQuery playlistQuery) {
        this.playlistQuery_ = playlistQuery;
        this.bitField0_ |= 1;
    }

    public final void t(EsPreparePlayOptions.PreparePlayOptions preparePlayOptions) {
        preparePlayOptions.getClass();
        this.preparePlayOptions_ = preparePlayOptions;
        this.bitField0_ |= 16;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Signal signal) {
        this.rawSignal_ = signal;
        this.bitField0_ |= 64;
    }
}
