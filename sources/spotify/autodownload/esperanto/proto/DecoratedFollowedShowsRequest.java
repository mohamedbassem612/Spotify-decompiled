package spotify.autodownload.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oar;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DecoratedFollowedShowsRequest extends h implements v2j0 {
    private static final DecoratedFollowedShowsRequest DEFAULT_INSTANCE;
    public static final int LENGTH_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SKIP_FIELD_NUMBER = 1;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 3;
    private int length_;
    private int skip_;
    private int updateThrottling_;

    static {
        DecoratedFollowedShowsRequest decoratedFollowedShowsRequest = new DecoratedFollowedShowsRequest();
        DEFAULT_INSTANCE = decoratedFollowedShowsRequest;
        h.registerDefaultInstance(DecoratedFollowedShowsRequest.class, decoratedFollowedShowsRequest);
    }

    private DecoratedFollowedShowsRequest() {
    }

    public static oar n() {
        return (oar) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"skip_", "length_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedFollowedShowsRequest();
        }
        if (iOrdinal == 4) {
            return new oar(DEFAULT_INSTANCE);
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
        synchronized (DecoratedFollowedShowsRequest.class) {
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

    public final void o(int i) {
        this.length_ = i;
    }

    public final void p(int i) {
        this.skip_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
