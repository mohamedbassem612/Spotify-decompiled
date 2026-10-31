package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hf90;
import p.i9;
import p.if90;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class IsCuratedRequest extends h implements v2j0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final IsCuratedRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int filter_;
    private int updateThrottling_;
    private h290 uri_ = h.emptyProtobufList();
    private String contextUri_ = "";

    static {
        IsCuratedRequest isCuratedRequest = new IsCuratedRequest();
        DEFAULT_INSTANCE = isCuratedRequest;
        h.registerDefaultInstance(IsCuratedRequest.class, isCuratedRequest);
    }

    private IsCuratedRequest() {
    }

    public static hf90 p() {
        return (hf90) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ț\u0003Ȉ\u0004\f", new Object[]{"updateThrottling_", "uri_", "contextUri_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new IsCuratedRequest();
        }
        if (iOrdinal == 4) {
            return new hf90(DEFAULT_INSTANCE);
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
        synchronized (IsCuratedRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.uri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uri_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.uri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uri_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(String str) {
        str.getClass();
        this.contextUri_ = str;
    }

    public final void r(if90 if90Var) {
        this.filter_ = if90Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
