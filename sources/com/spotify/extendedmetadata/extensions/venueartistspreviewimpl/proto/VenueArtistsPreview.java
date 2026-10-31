package com.spotify.extendedmetadata.extensions.venueartistspreviewimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VenueArtistsPreview extends h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 1;
    private static final VenueArtistsPreview DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String artists_ = "";

    static {
        VenueArtistsPreview venueArtistsPreview = new VenueArtistsPreview();
        DEFAULT_INSTANCE = venueArtistsPreview;
        h.registerDefaultInstance(VenueArtistsPreview.class, venueArtistsPreview);
    }

    private VenueArtistsPreview() {
    }

    public static VenueArtistsPreview o(byte[] bArr) {
        return (VenueArtistsPreview) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"artists_"});
        }
        if (iOrdinal == 3) {
            return new VenueArtistsPreview();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (VenueArtistsPreview.class) {
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
        return this.artists_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
