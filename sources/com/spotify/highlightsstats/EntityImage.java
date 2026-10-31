package com.spotify.highlightsstats;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vgy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityImage extends h implements v2j0 {
    private static final EntityImage DEFAULT_INSTANCE;
    public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int entityType_;
    private String imageUrl_ = "";

    static {
        EntityImage entityImage = new EntityImage();
        DEFAULT_INSTANCE = entityImage;
        h.registerDefaultInstance(EntityImage.class, entityImage);
    }

    private EntityImage() {
    }

    public static EntityImage n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "entityType_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new EntityImage();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (EntityImage.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final vgy o() {
        vgy vgyVar;
        switch (this.entityType_) {
            case 0:
                vgyVar = vgy.UNSPECIFIED;
                break;
            case 1:
                vgyVar = vgy.TRACK;
                break;
            case 2:
                vgyVar = vgy.ARTIST;
                break;
            case 3:
                vgyVar = vgy.ALBUM;
                break;
            case 4:
                vgyVar = vgy.SHOW;
                break;
            case 5:
                vgyVar = vgy.AUDIOBOOK;
                break;
            case 6:
                vgyVar = vgy.PLAYLIST;
                break;
            default:
                vgyVar = null;
                break;
        }
        return vgyVar == null ? vgy.UNRECOGNIZED : vgyVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
