package spotify.speechless.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vh2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GifMedia extends h implements v2j0 {
    private static final GifMedia DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 7;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private int bitField0_;
    private int height_;
    private int rating_;
    private int width_;
    private String id_ = "";
    private String url_ = "";
    private String title_ = "";
    private String trackUri_ = "";

    static {
        GifMedia gifMedia = new GifMedia();
        DEFAULT_INSTANCE = gifMedia;
        h.registerDefaultInstance(GifMedia.class, gifMedia);
    }

    private GifMedia() {
    }

    public static GifMedia n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u0004\u0006\u0004\u0007ለ\u0000", new Object[]{"bitField0_", "id_", "url_", "title_", "rating_", "width_", "height_", "trackUri_"});
        }
        if (iOrdinal == 3) {
            return new GifMedia();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (GifMedia.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.height_;
    }

    public final vh2 p() {
        vh2 vh2Var;
        int i = this.rating_;
        if (i == 0) {
            vh2Var = vh2.b;
        } else if (i == 1) {
            vh2Var = vh2.c;
        } else if (i == 2) {
            vh2Var = vh2.d;
        } else if (i == 3) {
            vh2Var = vh2.e;
        } else if (i != 4) {
            vh2Var = i != 5 ? null : vh2.g;
        } else {
            vh2Var = vh2.f;
        }
        return vh2Var == null ? vh2.h : vh2Var;
    }

    public final String q() {
        return this.trackUri_;
    }

    public final int r() {
        return this.width_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
