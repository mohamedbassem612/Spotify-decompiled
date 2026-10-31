package spotify.autodownload.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ma81;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShowStateRequest extends h implements v2j0 {
    private static final ShowStateRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int updateThrottling_;
    private String uri_ = "";

    static {
        ShowStateRequest showStateRequest = new ShowStateRequest();
        DEFAULT_INSTANCE = showStateRequest;
        h.registerDefaultInstance(ShowStateRequest.class, showStateRequest);
    }

    private ShowStateRequest() {
    }

    public static ma81 n() {
        return (ma81) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"uri_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new ShowStateRequest();
        }
        if (iOrdinal == 4) {
            return new ma81(DEFAULT_INSTANCE);
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
        synchronized (ShowStateRequest.class) {
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

    public final void o() {
        this.updateThrottling_ = 100;
    }

    public final void p(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
