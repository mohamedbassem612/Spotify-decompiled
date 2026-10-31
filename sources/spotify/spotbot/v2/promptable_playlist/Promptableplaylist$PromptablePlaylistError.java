package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.k1y0;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Promptableplaylist$PromptablePlaylistError extends h implements v2j0 {
    private static final Promptableplaylist$PromptablePlaylistError DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPTABLE_PLAYLIST_ERROR_TYPE_FIELD_NUMBER = 1;
    public static final int RATE_LIMIT_EXCEEDED_ERROR_DETAILS_FIELD_NUMBER = 3;
    private Object details_;
    private int promptablePlaylistErrorType_;
    private int detailsCase_ = 0;
    private String displayText_ = "";

    static {
        Promptableplaylist$PromptablePlaylistError promptableplaylist$PromptablePlaylistError = new Promptableplaylist$PromptablePlaylistError();
        DEFAULT_INSTANCE = promptableplaylist$PromptablePlaylistError;
        h.registerDefaultInstance(Promptableplaylist$PromptablePlaylistError.class, promptableplaylist$PromptablePlaylistError);
    }

    private Promptableplaylist$PromptablePlaylistError() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Promptableplaylist$PromptablePlaylistError q(phc phcVar) {
        return (Promptableplaylist$PromptablePlaylistError) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003<\u0000", new Object[]{"details_", "detailsCase_", "promptablePlaylistErrorType_", "displayText_", Promptableplaylist$RateLimitExceededErrorDetails.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$PromptablePlaylistError();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Promptableplaylist$PromptablePlaylistError.class) {
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

    public final String n() {
        return this.displayText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final k1y0 o() {
        k1y0 k1y0Var;
        int i = this.promptablePlaylistErrorType_;
        if (i == 0) {
            k1y0Var = k1y0.BACKEND_ERROR;
        } else if (i == 1) {
            k1y0Var = k1y0.PROMPT_VALIDATOR_ERROR;
        } else if (i != 2) {
            k1y0Var = i != 3 ? null : k1y0.RATE_LIMIT_EXCEEDED_ERROR;
        } else {
            k1y0Var = k1y0.TERMS_AND_SERVICES_CHECKER_ERROR;
        }
        return k1y0Var == null ? k1y0.UNRECOGNIZED : k1y0Var;
    }

    public final Promptableplaylist$RateLimitExceededErrorDetails p() {
        return this.detailsCase_ == 3 ? (Promptableplaylist$RateLimitExceededErrorDetails) this.details_ : Promptableplaylist$RateLimitExceededErrorDetails.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
