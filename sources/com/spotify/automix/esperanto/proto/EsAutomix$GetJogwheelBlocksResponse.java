package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.automix.proto.TransitionOuterClass$JogwheelStyleBlocks;
import p.bf40;
import p.h290;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$GetJogwheelBlocksResponse extends h implements v2j0 {
    private static final EsAutomix$GetJogwheelBlocksResponse DEFAULT_INSTANCE;
    public static final int JOGWHEEL_STYLE_BLOCKS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 jogwheelStyleBlocks_ = h.emptyProtobufList();

    static {
        EsAutomix$GetJogwheelBlocksResponse esAutomix$GetJogwheelBlocksResponse = new EsAutomix$GetJogwheelBlocksResponse();
        DEFAULT_INSTANCE = esAutomix$GetJogwheelBlocksResponse;
        h.registerDefaultInstance(EsAutomix$GetJogwheelBlocksResponse.class, esAutomix$GetJogwheelBlocksResponse);
    }

    private EsAutomix$GetJogwheelBlocksResponse() {
    }

    public static EsAutomix$GetJogwheelBlocksResponse o(byte[] bArr) {
        return (EsAutomix$GetJogwheelBlocksResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"jogwheelStyleBlocks_", TransitionOuterClass$JogwheelStyleBlocks.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetJogwheelBlocksResponse();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (EsAutomix$GetJogwheelBlocksResponse.class) {
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
        return this.jogwheelStyleBlocks_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
