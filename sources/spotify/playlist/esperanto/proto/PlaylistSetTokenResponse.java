package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PlaylistSetTokenResponse extends h implements v2j0 {
    private static final PlaylistSetTokenResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ResponseStatus status_;

    static {
        PlaylistSetTokenResponse playlistSetTokenResponse = new PlaylistSetTokenResponse();
        DEFAULT_INSTANCE = playlistSetTokenResponse;
        h.registerDefaultInstance(PlaylistSetTokenResponse.class, playlistSetTokenResponse);
    }

    private PlaylistSetTokenResponse() {
    }

    public static PlaylistSetTokenResponse o(byte[] bArr) {
        return (PlaylistSetTokenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "status_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistSetTokenResponse();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (PlaylistSetTokenResponse.class) {
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

    public final ResponseStatus n() {
        ResponseStatus responseStatus = this.status_;
        return responseStatus == null ? ResponseStatus.o() : responseStatus;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
