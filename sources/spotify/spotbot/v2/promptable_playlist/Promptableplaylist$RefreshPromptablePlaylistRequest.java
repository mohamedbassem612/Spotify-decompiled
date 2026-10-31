package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n1y0;
import p.o1y0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Promptableplaylist$RefreshPromptablePlaylistRequest extends h implements v2j0 {
    private static final Promptableplaylist$RefreshPromptablePlaylistRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REFRESH_TYPE_FIELD_NUMBER = 3;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 1;
    private int refreshType_;
    private String spotbotUri_ = "";

    static {
        Promptableplaylist$RefreshPromptablePlaylistRequest promptableplaylist$RefreshPromptablePlaylistRequest = new Promptableplaylist$RefreshPromptablePlaylistRequest();
        DEFAULT_INSTANCE = promptableplaylist$RefreshPromptablePlaylistRequest;
        h.registerDefaultInstance(Promptableplaylist$RefreshPromptablePlaylistRequest.class, promptableplaylist$RefreshPromptablePlaylistRequest);
    }

    private Promptableplaylist$RefreshPromptablePlaylistRequest() {
    }

    public static n1y0 n() {
        return (n1y0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\f", new Object[]{"spotbotUri_", "refreshType_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$RefreshPromptablePlaylistRequest();
        }
        if (iOrdinal == 4) {
            return new n1y0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$RefreshPromptablePlaylistRequest.class) {
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

    public final void o(o1y0 o1y0Var) {
        this.refreshType_ = o1y0Var.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.spotbotUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
