package spotify.autodownload.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fax;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class EnabledShowsCountRequest extends h implements v2j0 {
    private static final EnabledShowsCountRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 1;
    private int updateThrottling_;

    static {
        EnabledShowsCountRequest enabledShowsCountRequest = new EnabledShowsCountRequest();
        DEFAULT_INSTANCE = enabledShowsCountRequest;
        h.registerDefaultInstance(EnabledShowsCountRequest.class, enabledShowsCountRequest);
    }

    private EnabledShowsCountRequest() {
    }

    public static EnabledShowsCountRequest n() {
        return DEFAULT_INSTANCE;
    }

    public static fax o() {
        return (fax) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new EnabledShowsCountRequest();
        }
        if (iOrdinal == 4) {
            return new fax(DEFAULT_INSTANCE);
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
        synchronized (EnabledShowsCountRequest.class) {
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

    public final void p() {
        this.updateThrottling_ = 100;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
