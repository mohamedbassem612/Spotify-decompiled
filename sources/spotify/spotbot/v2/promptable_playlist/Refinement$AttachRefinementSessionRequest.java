package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sa11;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Refinement$AttachRefinementSessionRequest extends h implements v2j0 {
    private static final Refinement$AttachRefinementSessionRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 1;
    private String spotbotUri_ = "";
    private String messageId_ = "";

    static {
        Refinement$AttachRefinementSessionRequest refinement$AttachRefinementSessionRequest = new Refinement$AttachRefinementSessionRequest();
        DEFAULT_INSTANCE = refinement$AttachRefinementSessionRequest;
        h.registerDefaultInstance(Refinement$AttachRefinementSessionRequest.class, refinement$AttachRefinementSessionRequest);
    }

    private Refinement$AttachRefinementSessionRequest() {
    }

    public static sa11 n() {
        return (sa11) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"spotbotUri_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new Refinement$AttachRefinementSessionRequest();
        }
        if (iOrdinal == 4) {
            return new sa11(DEFAULT_INSTANCE);
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
        synchronized (Refinement$AttachRefinementSessionRequest.class) {
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
        this.messageId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.spotbotUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
