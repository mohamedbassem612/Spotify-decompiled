package com.spotify.search.proto;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class OfflineTrack extends h implements v2j0 {
    public static final int ALBUM_NAME_FIELD_NUMBER = 4;
    public static final int ARTIST_NAMES_FIELD_NUMBER = 5;
    private static final OfflineTrack DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 6;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int MOGEF19_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 2;
    private boolean explicit_;
    private boolean mogef19_;
    private boolean premiumOnly_;
    private String name_ = "";
    private String uri_ = "";
    private String imageUri_ = "";
    private String albumName_ = "";
    private h290 artistNames_ = h.emptyProtobufList();

    static {
        OfflineTrack offlineTrack = new OfflineTrack();
        DEFAULT_INSTANCE = offlineTrack;
        h.registerDefaultInstance(OfflineTrack.class, offlineTrack);
    }

    private OfflineTrack() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006\u0007\u0007\u0007\b\u0007", new Object[]{"name_", "uri_", "imageUri_", "albumName_", "artistNames_", "explicit_", "mogef19_", "premiumOnly_"});
        }
        if (iOrdinal == 3) {
            return new OfflineTrack();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (OfflineTrack.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.albumName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.artistNames_;
    }

    public final boolean p() {
        return this.explicit_;
    }

    public final String q() {
        return this.imageUri_;
    }

    public final boolean r() {
        return this.mogef19_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
