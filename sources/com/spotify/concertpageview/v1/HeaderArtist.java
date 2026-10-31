package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tv50;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class HeaderArtist extends h implements v2j0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 3;
    private static final HeaderArtist DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 4;
    private int role_;
    private String name_ = "";
    private String imageUrl_ = "";
    private String artistUri_ = "";

    static {
        HeaderArtist headerArtist = new HeaderArtist();
        DEFAULT_INSTANCE = headerArtist;
        h.registerDefaultInstance(HeaderArtist.class, headerArtist);
    }

    private HeaderArtist() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"name_", "imageUrl_", "artistUri_", "role_"});
        }
        if (iOrdinal == 3) {
            return new HeaderArtist();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (HeaderArtist.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.artistUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final tv50 o() {
        tv50 tv50Var;
        int i = this.role_;
        if (i == 0) {
            tv50Var = tv50.HEADER_ARTIST_ROLE_UNSPECIFIED;
        } else if (i != 1) {
            tv50Var = i != 2 ? null : tv50.HEADER_ARTIST_ROLE_SUPPORTING;
        } else {
            tv50Var = tv50.HEADER_ARTIST_ROLE_HEADLINER;
        }
        return tv50Var == null ? tv50.UNRECOGNIZED : tv50Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
