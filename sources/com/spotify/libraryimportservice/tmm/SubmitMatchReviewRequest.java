package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.nmc1;
import p.omc1;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SubmitMatchReviewRequest extends h implements v2j0 {
    private static final SubmitMatchReviewRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SELECTIONS_FIELD_NUMBER = 1;
    public static final int TRANSFER_IDS_FIELD_NUMBER = 2;
    private qng0 selections_ = qng0.b;
    private h290 transferIds_ = h.emptyProtobufList();

    static {
        SubmitMatchReviewRequest submitMatchReviewRequest = new SubmitMatchReviewRequest();
        DEFAULT_INSTANCE = submitMatchReviewRequest;
        h.registerDefaultInstance(SubmitMatchReviewRequest.class, submitMatchReviewRequest);
    }

    private SubmitMatchReviewRequest() {
    }

    public static nmc1 p() {
        return (nmc1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u00012\u0002Ț", new Object[]{"selections_", omc1.a, "transferIds_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMatchReviewRequest();
        }
        if (iOrdinal == 4) {
            return new nmc1(DEFAULT_INSTANCE);
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
        synchronized (SubmitMatchReviewRequest.class) {
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
        h290 h290VarMutableCopy = this.transferIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.transferIds_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.selections_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.selections_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
