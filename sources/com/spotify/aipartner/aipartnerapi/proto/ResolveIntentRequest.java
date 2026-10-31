package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.f131;
import p.i9;
import p.jf40;
import p.mta;
import p.qt21;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ResolveIntentRequest extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final ResolveIntentRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int RESTRICTIONS_FIELD_NUMBER = 4;
    private static final c290 restrictions_converter_ = new mta((byte) 23);
    private int bitField0_;
    private Context context_;
    private int limit_;
    private Query query_;
    private int restrictionsMemoizedSerializedSize;
    private String requestId_ = "";
    private b290 restrictions_ = h.emptyIntList();

    static {
        ResolveIntentRequest resolveIntentRequest = new ResolveIntentRequest();
        DEFAULT_INSTANCE = resolveIntentRequest;
        h.registerDefaultInstance(ResolveIntentRequest.class, resolveIntentRequest);
    }

    private ResolveIntentRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static qt21 r() {
        return (qt21) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004,\u0005င\u0002", new Object[]{"bitField0_", "requestId_", "query_", "context_", "restrictions_", "limit_"});
        }
        if (iOrdinal == 3) {
            return new ResolveIntentRequest();
        }
        if (iOrdinal == 4) {
            return new qt21(DEFAULT_INSTANCE);
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
        synchronized (ResolveIntentRequest.class) {
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
        i9 i9Var = this.restrictions_;
        if (!i9Var.a) {
            this.restrictions_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f131 f131Var = (f131) it.next();
            this.restrictions_.c(f131Var.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Context o() {
        Context context = this.context_;
        return context == null ? Context.n() : context;
    }

    public final Query p() {
        Query query = this.query_;
        return query == null ? Query.n() : query;
    }

    public final String q() {
        return this.requestId_;
    }

    public final void s(Context context) {
        context.getClass();
        this.context_ = context;
        this.bitField0_ |= 2;
    }

    public final void setLimit(int i) {
        this.bitField0_ |= 4;
        this.limit_ = i;
    }

    public final void t(Query query) {
        query.getClass();
        this.query_ = query;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.requestId_ = str;
    }
}
