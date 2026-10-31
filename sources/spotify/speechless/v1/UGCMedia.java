package spotify.speechless.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qxh1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class UGCMedia extends h implements v2j0 {
    private static final UGCMedia DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 6;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 1;
    public static final int UPLOAD_SOURCE_FIELD_NUMBER = 8;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private Duration duration_;
    private long fileSizeBytes_;
    private int height_;
    private int mediaType_;
    private int uploadSource_;
    private int width_;
    private String thumbnailUrl_ = "";
    private String mediaUrl_ = "";

    static {
        UGCMedia uGCMedia = new UGCMedia();
        DEFAULT_INSTANCE = uGCMedia;
        h.registerDefaultInstance(UGCMedia.class, uGCMedia);
    }

    private UGCMedia() {
    }

    public static UGCMedia n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0004\u0005\u0004\u0006\u0002\u0007ဉ\u0000\b\f", new Object[]{"bitField0_", "thumbnailUrl_", "mediaUrl_", "mediaType_", "width_", "height_", "fileSizeBytes_", "duration_", "uploadSource_"});
        }
        if (iOrdinal == 3) {
            return new UGCMedia();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (UGCMedia.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    public final boolean hasDuration() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.fileSizeBytes_;
    }

    public final int p() {
        return this.height_;
    }

    public final s8i0 q() {
        s8i0 s8i0Var;
        int i = this.mediaType_;
        if (i == 0) {
            s8i0Var = s8i0.b;
        } else if (i != 1) {
            s8i0Var = i != 2 ? null : s8i0.d;
        } else {
            s8i0Var = s8i0.c;
        }
        return s8i0Var == null ? s8i0.e : s8i0Var;
    }

    public final String r() {
        return this.mediaUrl_;
    }

    public final String s() {
        return this.thumbnailUrl_;
    }

    public final qxh1 t() {
        qxh1 qxh1Var;
        int i = this.uploadSource_;
        if (i == 0) {
            qxh1Var = qxh1.b;
        } else if (i != 1) {
            qxh1Var = i != 2 ? null : qxh1.d;
        } else {
            qxh1Var = qxh1.c;
        }
        return qxh1Var == null ? qxh1.e : qxh1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        return this.width_;
    }
}
