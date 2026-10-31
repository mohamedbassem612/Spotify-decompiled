package spotify.speechless.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.oz70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareCard extends h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 8;
    public static final int COLOR_FIELD_NUMBER = 3;
    public static final int DATE_FIELD_NUMBER = 6;
    private static final ShareCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int EXPLICIT_FIELD_NUMBER = 7;
    public static final int IMAGE_SHAPE_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Background background_;
    private int bitField0_;
    private int color_;
    private Date date_;
    private boolean explicit_;
    private int imageShape_;
    private String title_ = "";
    private String description_ = "";
    private String imageUrl_ = "";

    static {
        ShareCard shareCard = new ShareCard();
        DEFAULT_INSTANCE = shareCard;
        h.registerDefaultInstance(ShareCard.class, shareCard);
    }

    private ShareCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ShareCard q(byte[] bArr) {
        return (ShareCard) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ȉ\u0005\f\u0006ဉ\u0000\u0007\u0007\bဉ\u0001", new Object[]{"bitField0_", "title_", "description_", "color_", "imageUrl_", "imageShape_", "date_", "explicit_", "background_"});
        }
        if (iOrdinal == 3) {
            return new ShareCard();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (ShareCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final Background n() {
        Background background = this.background_;
        return background == null ? Background.o() : background;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Date o() {
        Date date = this.date_;
        return date == null ? Date.o() : date;
    }

    public final oz70 p() {
        oz70 oz70Var;
        int i = this.imageShape_;
        if (i == 0) {
            oz70Var = oz70.IMAGE_SHAPE_UNKNOWN;
        } else if (i != 1) {
            oz70Var = i != 2 ? null : oz70.IMAGE_SHAPE_ROUND;
        } else {
            oz70Var = oz70.IMAGE_SHAPE_SQUARE;
        }
        return oz70Var == null ? oz70.UNRECOGNIZED : oz70Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
