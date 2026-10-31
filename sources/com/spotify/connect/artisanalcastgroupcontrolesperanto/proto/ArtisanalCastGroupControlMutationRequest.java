package com.spotify.connect.artisanalcastgroupcontrolesperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oa6;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ArtisanalCastGroupControlMutationRequest extends h implements v2j0 {
    private static final ArtisanalCastGroupControlMutationRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_ENDPOINT_ID_FIELD_NUMBER = 1;
    private String rawEndpointId_ = "";

    static {
        ArtisanalCastGroupControlMutationRequest artisanalCastGroupControlMutationRequest = new ArtisanalCastGroupControlMutationRequest();
        DEFAULT_INSTANCE = artisanalCastGroupControlMutationRequest;
        h.registerDefaultInstance(ArtisanalCastGroupControlMutationRequest.class, artisanalCastGroupControlMutationRequest);
    }

    private ArtisanalCastGroupControlMutationRequest() {
    }

    public static oa6 n() {
        return (oa6) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"rawEndpointId_"});
        }
        if (iOrdinal == 3) {
            return new ArtisanalCastGroupControlMutationRequest();
        }
        if (iOrdinal == 4) {
            return new oa6(DEFAULT_INSTANCE);
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
        synchronized (ArtisanalCastGroupControlMutationRequest.class) {
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
        this.rawEndpointId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
