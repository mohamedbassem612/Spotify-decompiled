package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.msm1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryConfig$YourLibraryLabelAndImage extends h implements v2j0 {
    private static final YourLibraryConfig$YourLibraryLabelAndImage DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int INCLUDE_EMPTY_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean includeEmpty_;
    private String label_ = "";
    private String image_ = "";

    static {
        YourLibraryConfig$YourLibraryLabelAndImage yourLibraryConfig$YourLibraryLabelAndImage = new YourLibraryConfig$YourLibraryLabelAndImage();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryLabelAndImage;
        h.registerDefaultInstance(YourLibraryConfig$YourLibraryLabelAndImage.class, yourLibraryConfig$YourLibraryLabelAndImage);
    }

    private YourLibraryConfig$YourLibraryLabelAndImage() {
    }

    public static YourLibraryConfig$YourLibraryLabelAndImage n() {
        return DEFAULT_INSTANCE;
    }

    public static msm1 o() {
        return (msm1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"label_", "image_", "includeEmpty_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryLabelAndImage();
        }
        if (iOrdinal == 4) {
            return new msm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryConfig$YourLibraryLabelAndImage.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.image_ = str;
    }

    public final void q() {
        this.includeEmpty_ = false;
    }

    public final void r(String str) {
        str.getClass();
        this.label_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
