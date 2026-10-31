package com.spotify.searchview.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AutocompleteViewResponse extends com.google.protobuf.h implements v2j0 {
    public static final int BANNER_CONTENT_FIELD_NUMBER = 2;
    private static final AutocompleteViewResponse DEFAULT_INSTANCE;
    public static final int HITS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private BannerContent bannerContent_;
    private int bitField0_;
    private h290 hits_ = com.google.protobuf.h.emptyProtobufList();

    static {
        AutocompleteViewResponse autocompleteViewResponse = new AutocompleteViewResponse();
        DEFAULT_INSTANCE = autocompleteViewResponse;
        com.google.protobuf.h.registerDefaultInstance(AutocompleteViewResponse.class, autocompleteViewResponse);
    }

    private AutocompleteViewResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "hits_", Entity.class, "bannerContent_"});
        }
        if (iOrdinal == 3) {
            return new AutocompleteViewResponse();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (AutocompleteViewResponse.class) {
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

    public final BannerContent n() {
        BannerContent bannerContent = this.bannerContent_;
        return bannerContent == null ? BannerContent.o() : bannerContent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.hits_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
