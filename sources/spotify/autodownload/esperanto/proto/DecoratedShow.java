package spotify.autodownload.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DecoratedShow extends h implements v2j0 {
    public static final int AUTO_DL_ENABLED_FIELD_NUMBER = 7;
    private static final DecoratedShow DEFAULT_INSTANCE;
    public static final int HAS_VIDEO_FIELD_NUMBER = 6;
    public static final int IMG_URI_FIELD_NUMBER = 3;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean autoDlEnabled_;
    private boolean hasVideo_;
    private boolean musicAndTalk_;
    private String uri_ = "";
    private String title_ = "";
    private String imgUri_ = "";
    private String publisher_ = "";

    static {
        DecoratedShow decoratedShow = new DecoratedShow();
        DEFAULT_INSTANCE = decoratedShow;
        h.registerDefaultInstance(DecoratedShow.class, decoratedShow);
    }

    private DecoratedShow() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0007\u0007\u0007", new Object[]{"uri_", "title_", "imgUri_", "publisher_", "musicAndTalk_", "hasVideo_", "autoDlEnabled_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedShow();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (DecoratedShow.class) {
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

    public final String getPublisher() {
        return this.publisher_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final boolean n() {
        return this.autoDlEnabled_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.hasVideo_;
    }

    public final String p() {
        return this.imgUri_;
    }

    public final boolean q() {
        return this.musicAndTalk_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
