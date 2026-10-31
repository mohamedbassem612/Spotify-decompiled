package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.x2h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionContainsRequest extends h implements v2j0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final CollectionContainsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int updateThrottling_;
    private h290 uri_ = h.emptyProtobufList();
    private String contextUri_ = "";

    static {
        CollectionContainsRequest collectionContainsRequest = new CollectionContainsRequest();
        DEFAULT_INSTANCE = collectionContainsRequest;
        h.registerDefaultInstance(CollectionContainsRequest.class, collectionContainsRequest);
    }

    private CollectionContainsRequest() {
    }

    public static x2h p() {
        return (x2h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002Ț\u0003Ȉ", new Object[]{"updateThrottling_", "uri_", "contextUri_"});
        }
        if (iOrdinal == 3) {
            return new CollectionContainsRequest();
        }
        if (iOrdinal == 4) {
            return new x2h(DEFAULT_INSTANCE);
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
        synchronized (CollectionContainsRequest.class) {
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
        this.contextUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
