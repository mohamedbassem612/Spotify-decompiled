package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.th7;
import p.v2j0;
import p.yk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetAudiobookConsiderationRequest extends h implements v2j0 {
    public static final int ASTRO_ON_TYPE_FIELD_NUMBER = 2;
    private static final GetAudiobookConsiderationRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private int astroOnType_;
    private String payload_ = "";

    static {
        GetAudiobookConsiderationRequest getAudiobookConsiderationRequest = new GetAudiobookConsiderationRequest();
        DEFAULT_INSTANCE = getAudiobookConsiderationRequest;
        h.registerDefaultInstance(GetAudiobookConsiderationRequest.class, getAudiobookConsiderationRequest);
    }

    private GetAudiobookConsiderationRequest() {
    }

    public static yk40 n() {
        return (yk40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"payload_", "astroOnType_"});
        }
        if (iOrdinal == 3) {
            return new GetAudiobookConsiderationRequest();
        }
        if (iOrdinal == 4) {
            return new yk40(DEFAULT_INSTANCE);
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
        synchronized (GetAudiobookConsiderationRequest.class) {
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

    public final void o(th7 th7Var) {
        this.astroOnType_ = th7Var.getNumber();
    }

    public final void p() {
        this.payload_ = "yeet";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
