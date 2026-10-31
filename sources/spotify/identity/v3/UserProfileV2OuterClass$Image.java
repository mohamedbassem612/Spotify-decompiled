package spotify.identity.v3;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class UserProfileV2OuterClass$Image extends h implements v2j0 {
    private static final UserProfileV2OuterClass$Image DEFAULT_INSTANCE;
    public static final int MAX_HEIGHT_FIELD_NUMBER = 2;
    public static final int MAX_WIDTH_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 3;
    private int maxHeight_;
    private int maxWidth_;
    private String url_ = "";

    static {
        UserProfileV2OuterClass$Image userProfileV2OuterClass$Image = new UserProfileV2OuterClass$Image();
        DEFAULT_INSTANCE = userProfileV2OuterClass$Image;
        h.registerDefaultInstance(UserProfileV2OuterClass$Image.class, userProfileV2OuterClass$Image);
    }

    private UserProfileV2OuterClass$Image() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ", new Object[]{"maxWidth_", "maxHeight_", "url_"});
        }
        if (iOrdinal == 3) {
            return new UserProfileV2OuterClass$Image();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (UserProfileV2OuterClass$Image.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final int n() {
        return this.maxHeight_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.maxWidth_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
