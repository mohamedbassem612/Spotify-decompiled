package com.spotify.extendedmetadata.extensions.canvasimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yzg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityCanvazResponse$Canvaz extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 6;
    public static final int CANVASURI_FIELD_NUMBER = 11;
    private static final EntityCanvazResponse$Canvaz DEFAULT_INSTANCE;
    public static final int ENTITYURI_FIELD_NUMBER = 5;
    public static final int ETAG_FIELD_NUMBER = 9;
    public static final int EXPLICIT_FIELD_NUMBER = 7;
    public static final int FILEID_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STORYLINESID_FIELD_NUMBER = 12;
    public static final int THUMBNAILS_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int UPLOADEDBY_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 2;
    private Artist artist_;
    private int bitField0_;
    private boolean explicit_;
    private int type_;
    private String id_ = "";
    private String url_ = "";
    private String fileId_ = "";
    private String entityUri_ = "";
    private String uploadedBy_ = "";
    private String etag_ = "";
    private String canvasUri_ = "";
    private String storylinesId_ = "";
    private h290 thumbnails_ = h.emptyProtobufList();

    static {
        EntityCanvazResponse$Canvaz entityCanvazResponse$Canvaz = new EntityCanvazResponse$Canvaz();
        DEFAULT_INSTANCE = entityCanvazResponse$Canvaz;
        h.registerDefaultInstance(EntityCanvazResponse$Canvaz.class, entityCanvazResponse$Canvaz);
    }

    private EntityCanvazResponse$Canvaz() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EntityCanvazResponse$Canvaz w(byte[] bArr) {
        return (EntityCanvazResponse$Canvaz) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006ဉ\u0000\u0007\u0007\bȈ\tȈ\u000bȈ\fȈ\r\u001b", new Object[]{"bitField0_", "id_", "url_", "fileId_", "type_", "entityUri_", "artist_", "explicit_", "uploadedBy_", "etag_", "canvasUri_", "storylinesId_", "thumbnails_", ImageAsset.class});
        }
        if (iOrdinal == 3) {
            return new EntityCanvazResponse$Canvaz();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (EntityCanvazResponse$Canvaz.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String getId() {
        return this.id_;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final Artist n() {
        Artist artist = this.artist_;
        return artist == null ? Artist.n() : artist;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.canvasUri_;
    }

    public final String p() {
        return this.etag_;
    }

    public final boolean q() {
        return this.explicit_;
    }

    public final String r() {
        return this.fileId_;
    }

    public final String s() {
        return this.storylinesId_;
    }

    public final h290 t() {
        return this.thumbnails_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final yzg1 u() {
        yzg1 yzg1Var;
        int i = this.type_;
        if (i == 0) {
            yzg1Var = yzg1.IMAGE;
        } else if (i == 1) {
            yzg1Var = yzg1.VIDEO;
        } else if (i != 2) {
            yzg1Var = i != 3 ? null : yzg1.VIDEO_LOOPING_RANDOM;
        } else {
            yzg1Var = yzg1.VIDEO_LOOPING;
        }
        return yzg1Var == null ? yzg1.UNRECOGNIZED : yzg1Var;
    }

    public final String v() {
        return this.uploadedBy_;
    }
}
