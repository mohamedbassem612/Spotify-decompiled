package com.spotify.music.spotlets.offline.util.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hxu;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DownloadInteraction extends h implements v2j0 {
    private static final DownloadInteraction DEFAULT_INSTANCE;
    public static final int DOWNLOAD_URI_FIELD_NUMBER = 2;
    public static final int ELEMENT_TYPE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTED_STATE_FIELD_NUMBER = 4;
    public static final int VIEW_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean requestedState_;
    private String viewUri_ = "";
    private String downloadUri_ = "";
    private String elementType_ = "";

    static {
        DownloadInteraction downloadInteraction = new DownloadInteraction();
        DEFAULT_INSTANCE = downloadInteraction;
        h.registerDefaultInstance(DownloadInteraction.class, downloadInteraction);
    }

    private DownloadInteraction() {
    }

    public static hxu n() {
        return (hxu) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "viewUri_", "downloadUri_", "elementType_", "requestedState_"});
        }
        if (iOrdinal == 3) {
            return new DownloadInteraction();
        }
        if (iOrdinal == 4) {
            return new hxu(DEFAULT_INSTANCE);
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
        synchronized (DownloadInteraction.class) {
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
        this.bitField0_ |= 2;
        this.downloadUri_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.elementType_ = str;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 8;
        this.requestedState_ = z;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.viewUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
