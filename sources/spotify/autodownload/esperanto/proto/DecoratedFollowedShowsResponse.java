package spotify.autodownload.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DecoratedFollowedShowsResponse extends h implements v2j0 {
    private static final DecoratedFollowedShowsResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    private static volatile qzr0 PARSER = null;
    public static final int REMAINING_SHOWS_FIELD_NUMBER = 2;
    public static final int SHOWS_FIELD_NUMBER = 1;
    private int remainingShows_;
    private h290 shows_ = h.emptyProtobufList();
    private String error_ = "";

    static {
        DecoratedFollowedShowsResponse decoratedFollowedShowsResponse = new DecoratedFollowedShowsResponse();
        DEFAULT_INSTANCE = decoratedFollowedShowsResponse;
        h.registerDefaultInstance(DecoratedFollowedShowsResponse.class, decoratedFollowedShowsResponse);
    }

    private DecoratedFollowedShowsResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static DecoratedFollowedShowsResponse q(byte[] bArr) {
        return (DecoratedFollowedShowsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001c\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0004cȈ", new Object[]{"shows_", DecoratedShow.class, "remainingShows_", "error_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedFollowedShowsResponse();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (DecoratedFollowedShowsResponse.class) {
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

    public final int n() {
        return this.remainingShows_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.shows_.size();
    }

    public final h290 p() {
        return this.shows_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
