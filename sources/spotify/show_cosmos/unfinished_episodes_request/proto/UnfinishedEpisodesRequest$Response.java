package spotify.show_cosmos.unfinished_episodes_request.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class UnfinishedEpisodesRequest$Response extends h implements v2j0 {
    private static final UnfinishedEpisodesRequest$Response DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 episode_ = h.emptyProtobufList();

    static {
        UnfinishedEpisodesRequest$Response unfinishedEpisodesRequest$Response = new UnfinishedEpisodesRequest$Response();
        DEFAULT_INSTANCE = unfinishedEpisodesRequest$Response;
        h.registerDefaultInstance(UnfinishedEpisodesRequest$Response.class, unfinishedEpisodesRequest$Response);
    }

    private UnfinishedEpisodesRequest$Response() {
    }

    public static UnfinishedEpisodesRequest$Response n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"episode_", UnfinishedEpisodesRequest.Episode.class});
        }
        if (iOrdinal == 3) {
            return new UnfinishedEpisodesRequest$Response();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (UnfinishedEpisodesRequest$Response.class) {
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

    public final int o() {
        return this.episode_.size();
    }

    public final h290 p() {
        return this.episode_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
