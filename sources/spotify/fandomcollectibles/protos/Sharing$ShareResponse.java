package spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Sharing$ShareResponse extends h implements v2j0 {
    private static final Sharing$ShareResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFIX_TEXT_FIELD_NUMBER = 4;
    public static final int MESSAGE_SUFFIX_TEXT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_PARAMS_FIELD_NUMBER = 3;
    public static final int SHARE_IMG_URL_FIELD_NUMBER = 1;
    public static final int SHARE_URI_FIELD_NUMBER = 2;
    private String shareImgUrl_ = "";
    private String shareUri_ = "";
    private h290 queryParams_ = h.emptyProtobufList();
    private String messagePrefixText_ = "";
    private String messageSuffixText_ = "";

    static {
        Sharing$ShareResponse sharing$ShareResponse = new Sharing$ShareResponse();
        DEFAULT_INSTANCE = sharing$ShareResponse;
        h.registerDefaultInstance(Sharing$ShareResponse.class, sharing$ShareResponse);
    }

    private Sharing$ShareResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"shareImgUrl_", "shareUri_", "queryParams_", Sharing$QueryParameter.class, "messagePrefixText_", "messageSuffixText_"});
        }
        if (iOrdinal == 3) {
            return new Sharing$ShareResponse();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (Sharing$ShareResponse.class) {
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

    public final String n() {
        return this.messagePrefixText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.messageSuffixText_;
    }

    public final h290 p() {
        return this.queryParams_;
    }

    public final String q() {
        return this.shareImgUrl_;
    }

    public final String r() {
        return this.shareUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
