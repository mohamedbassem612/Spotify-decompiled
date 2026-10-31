package com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShowExplorerEntrypointResponse extends h implements v2j0 {
    private static final ShowExplorerEntrypointResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_EXPLORER_BUTTON_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        ShowExplorerEntrypointResponse showExplorerEntrypointResponse = new ShowExplorerEntrypointResponse();
        DEFAULT_INSTANCE = showExplorerEntrypointResponse;
        h.registerDefaultInstance(ShowExplorerEntrypointResponse.class, showExplorerEntrypointResponse);
    }

    private ShowExplorerEntrypointResponse() {
    }

    public static ShowExplorerEntrypointResponse o(byte[] bArr) {
        return (ShowExplorerEntrypointResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"payload_", "payloadCase_", ShowExplorerButtonComponent.class});
        }
        if (iOrdinal == 3) {
            return new ShowExplorerEntrypointResponse();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ShowExplorerEntrypointResponse.class) {
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

    public final ShowExplorerButtonComponent n() {
        return this.payloadCase_ == 1 ? (ShowExplorerButtonComponent) this.payload_ : ShowExplorerButtonComponent.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
