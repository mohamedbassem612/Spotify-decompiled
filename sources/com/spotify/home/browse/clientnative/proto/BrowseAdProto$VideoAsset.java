package com.spotify.home.browse.clientnative.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class BrowseAdProto$VideoAsset extends h implements v2j0 {
    private static final BrowseAdProto$VideoAsset DEFAULT_INSTANCE;
    public static final int DURATION_SEC_FIELD_NUMBER = 3;
    public static final int HEX_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private int durationSec_;
    private String url_ = "";
    private String hexId_ = "";

    static {
        BrowseAdProto$VideoAsset browseAdProto$VideoAsset = new BrowseAdProto$VideoAsset();
        DEFAULT_INSTANCE = browseAdProto$VideoAsset;
        h.registerDefaultInstance(BrowseAdProto$VideoAsset.class, browseAdProto$VideoAsset);
    }

    private BrowseAdProto$VideoAsset() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u0004", new Object[]{"bitField0_", "url_", "hexId_", "durationSec_"});
        }
        if (iOrdinal == 3) {
            return new BrowseAdProto$VideoAsset();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (BrowseAdProto$VideoAsset.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final int n() {
        return this.durationSec_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.hexId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
