package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Refinement$AttachRefinementSessionResponse extends h implements v2j0 {
    private static final Refinement$AttachRefinementSessionResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REFINEMENT_SESSION_ID_FIELD_NUMBER = 1;
    private String refinementSessionId_ = "";

    static {
        Refinement$AttachRefinementSessionResponse refinement$AttachRefinementSessionResponse = new Refinement$AttachRefinementSessionResponse();
        DEFAULT_INSTANCE = refinement$AttachRefinementSessionResponse;
        h.registerDefaultInstance(Refinement$AttachRefinementSessionResponse.class, refinement$AttachRefinementSessionResponse);
    }

    private Refinement$AttachRefinementSessionResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"refinementSessionId_"});
        }
        if (iOrdinal == 3) {
            return new Refinement$AttachRefinementSessionResponse();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (Refinement$AttachRefinementSessionResponse.class) {
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
        return this.refinementSessionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
