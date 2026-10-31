package spotify.progress_playback_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ProgressPlaybackEsperanto$OnUpdateResponse extends h implements v2j0 {
    private static final ProgressPlaybackEsperanto$OnUpdateResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        ProgressPlaybackEsperanto$OnUpdateResponse progressPlaybackEsperanto$OnUpdateResponse = new ProgressPlaybackEsperanto$OnUpdateResponse();
        DEFAULT_INSTANCE = progressPlaybackEsperanto$OnUpdateResponse;
        h.registerDefaultInstance(ProgressPlaybackEsperanto$OnUpdateResponse.class, progressPlaybackEsperanto$OnUpdateResponse);
    }

    private ProgressPlaybackEsperanto$OnUpdateResponse() {
    }

    public static ProgressPlaybackEsperanto$OnUpdateResponse n(byte[] bArr) {
        return (ProgressPlaybackEsperanto$OnUpdateResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new ProgressPlaybackEsperanto$OnUpdateResponse();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (ProgressPlaybackEsperanto$OnUpdateResponse.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
