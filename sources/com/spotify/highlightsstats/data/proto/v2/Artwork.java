package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Person;
import p.bf40;
import p.db6;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Artwork extends h implements v2j0 {
    public static final int AVATARS_FIELD_NUMBER = 6;
    private static final Artwork DEFAULT_INSTANCE;
    public static final int DIAGONAL2_FIELD_NUMBER = 8;
    public static final int GRID3_FIELD_NUMBER = 1;
    public static final int OVERLAP2_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SINGLE_FIELD_NUMBER = 2;
    public static final int SPREAD3_FIELD_NUMBER = 7;
    public static final int TILTED_OVERLAP2_FIELD_NUMBER = 4;
    public static final int TILTED_OVERLAP3_FIELD_NUMBER = 5;
    private Object artwork_;
    private int artworkCase_ = 0;
    private h290 avatars_ = h.emptyProtobufList();

    static {
        Artwork artwork = new Artwork();
        DEFAULT_INSTANCE = artwork;
        h.registerDefaultInstance(Artwork.class, artwork);
    }

    private Artwork() {
    }

    public static Artwork p() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u001b\u0007<\u0000\b<\u0000", new Object[]{"artwork_", "artworkCase_", Grid3.class, Single.class, Overlap2.class, TiltedOverlap2.class, TiltedOverlap3.class, "avatars_", Person.class, Spread3.class, Diagonal2.class});
        }
        if (iOrdinal == 3) {
            return new Artwork();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (Artwork.class) {
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

    public final int n() {
        switch (this.artworkCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
            default:
                return 0;
            case 7:
                return 6;
            case 8:
                return 7;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.avatars_;
    }

    public final Diagonal2 q() {
        return this.artworkCase_ == 8 ? (Diagonal2) this.artwork_ : Diagonal2.n();
    }

    public final Grid3 r() {
        return this.artworkCase_ == 1 ? (Grid3) this.artwork_ : Grid3.n();
    }

    public final Overlap2 s() {
        return this.artworkCase_ == 3 ? (Overlap2) this.artwork_ : Overlap2.n();
    }

    public final Single t() {
        return this.artworkCase_ == 2 ? (Single) this.artwork_ : Single.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Spread3 u() {
        return this.artworkCase_ == 7 ? (Spread3) this.artwork_ : Spread3.n();
    }

    public final TiltedOverlap2 v() {
        return this.artworkCase_ == 4 ? (TiltedOverlap2) this.artwork_ : TiltedOverlap2.n();
    }

    public final TiltedOverlap3 w() {
        return this.artworkCase_ == 5 ? (TiltedOverlap3) this.artwork_ : TiltedOverlap3.n();
    }
}
