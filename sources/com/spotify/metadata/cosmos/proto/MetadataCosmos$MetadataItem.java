package com.spotify.metadata.cosmos.proto;

import com.google.protobuf.h;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$Track;
import p.bf40;
import p.jf40;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MetadataCosmos$MetadataItem extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final MetadataCosmos$MetadataItem DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 6;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 5;
    public static final int TRACK_FIELD_NUMBER = 4;
    private int itemCase_ = 0;
    private Object item_;

    static {
        MetadataCosmos$MetadataItem metadataCosmos$MetadataItem = new MetadataCosmos$MetadataItem();
        DEFAULT_INSTANCE = metadataCosmos$MetadataItem;
        h.registerDefaultInstance(MetadataCosmos$MetadataItem.class, metadataCosmos$MetadataItem);
    }

    private MetadataCosmos$MetadataItem() {
    }

    public static MetadataCosmos$MetadataItem p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001B\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"item_", "itemCase_", Metadata$Artist.class, Metadata$Album.class, Metadata$Track.class, Metadata$Show.class, Metadata$Episode.class});
        }
        if (iOrdinal == 3) {
            return new MetadataCosmos$MetadataItem();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (MetadataCosmos$MetadataItem.class) {
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

    public final Metadata$Album n() {
        return this.itemCase_ == 3 ? (Metadata$Album) this.item_ : Metadata$Album.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Metadata$Artist o() {
        return this.itemCase_ == 2 ? (Metadata$Artist) this.item_ : Metadata$Artist.q();
    }

    public final Metadata$Episode q() {
        return this.itemCase_ == 6 ? (Metadata$Episode) this.item_ : Metadata$Episode.n();
    }

    public final int r() {
        switch (this.itemCase_) {
            case 0:
                return 7;
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
                return 6;
            default:
                return 0;
        }
    }

    public final Metadata$Show s() {
        return this.itemCase_ == 5 ? (Metadata$Show) this.item_ : Metadata$Show.n();
    }

    public final Metadata$Track t() {
        return this.itemCase_ == 4 ? (Metadata$Track) this.item_ : Metadata$Track.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
