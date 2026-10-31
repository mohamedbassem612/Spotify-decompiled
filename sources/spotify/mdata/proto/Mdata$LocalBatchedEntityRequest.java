package spotify.mdata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdh0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Mdata$LocalBatchedEntityRequest extends h implements v2j0 {
    private static final Mdata$LocalBatchedEntityRequest DEFAULT_INSTANCE;
    public static final int EXTENSION_QUERY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 extensionQuery_ = h.emptyProtobufList();

    static {
        Mdata$LocalBatchedEntityRequest mdata$LocalBatchedEntityRequest = new Mdata$LocalBatchedEntityRequest();
        DEFAULT_INSTANCE = mdata$LocalBatchedEntityRequest;
        h.registerDefaultInstance(Mdata$LocalBatchedEntityRequest.class, mdata$LocalBatchedEntityRequest);
    }

    private Mdata$LocalBatchedEntityRequest() {
    }

    public static rdh0 o() {
        return (rdh0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"extensionQuery_", Mdata$LocalExtensionQuery.class});
        }
        if (iOrdinal == 3) {
            return new Mdata$LocalBatchedEntityRequest();
        }
        if (iOrdinal == 4) {
            return new rdh0(DEFAULT_INSTANCE);
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
        synchronized (Mdata$LocalBatchedEntityRequest.class) {
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

    public final void n(Mdata$LocalExtensionQuery mdata$LocalExtensionQuery) {
        mdata$LocalExtensionQuery.getClass();
        h290 h290VarMutableCopy = this.extensionQuery_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.extensionQuery_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(mdata$LocalExtensionQuery);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
