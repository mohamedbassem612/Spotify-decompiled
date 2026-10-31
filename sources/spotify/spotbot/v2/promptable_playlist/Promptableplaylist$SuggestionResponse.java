package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Promptableplaylist$SuggestionResponse extends h implements v2j0 {
    private static final Promptableplaylist$SuggestionResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUGGESTION_FIELD_NUMBER = 1;
    private h290 suggestion_ = h.emptyProtobufList();

    static {
        Promptableplaylist$SuggestionResponse promptableplaylist$SuggestionResponse = new Promptableplaylist$SuggestionResponse();
        DEFAULT_INSTANCE = promptableplaylist$SuggestionResponse;
        h.registerDefaultInstance(Promptableplaylist$SuggestionResponse.class, promptableplaylist$SuggestionResponse);
    }

    private Promptableplaylist$SuggestionResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"suggestion_", Promptableplaylist$Suggestion.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$SuggestionResponse();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Promptableplaylist$SuggestionResponse.class) {
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

    public final h290 n() {
        return this.suggestion_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
