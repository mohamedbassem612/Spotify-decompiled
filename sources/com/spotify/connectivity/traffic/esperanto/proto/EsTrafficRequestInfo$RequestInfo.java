package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.psz;
import p.qng0;
import p.qsz;
import p.qzr0;
import p.r2j0;
import p.rsz;
import p.s2j0;
import p.ssz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficRequestInfo$RequestInfo extends h implements v2j0 {
    public static final int ADDITIONAL_CONTEXT_FIELD_NUMBER = 6;
    public static final int BYTES_SENT_FIELD_NUMBER = 4;
    private static final EsTrafficRequestInfo$RequestInfo DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 3;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 2;
    private qng0 additionalContext_;
    private long bytesSent_;
    private qng0 headers_;
    private int method_;
    private String sourceIdentifier_;
    private String url_;

    static {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = new EsTrafficRequestInfo$RequestInfo();
        DEFAULT_INSTANCE = esTrafficRequestInfo$RequestInfo;
        h.registerDefaultInstance(EsTrafficRequestInfo$RequestInfo.class, esTrafficRequestInfo$RequestInfo);
    }

    private EsTrafficRequestInfo$RequestInfo() {
        qng0 qng0Var = qng0.b;
        this.headers_ = qng0Var;
        this.additionalContext_ = qng0Var;
        this.url_ = "";
        this.sourceIdentifier_ = "";
    }

    public static EsTrafficRequestInfo$RequestInfo p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static rsz v() {
        return (rsz) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0002\u0000\u0000\u0001\f\u0002Ȉ\u00032\u0004\u0002\u0005Ȉ\u00062", new Object[]{"method_", "url_", "headers_", ssz.a, "bytesSent_", "sourceIdentifier_", "additionalContext_", qsz.a});
        }
        if (iOrdinal == 3) {
            return new EsTrafficRequestInfo$RequestInfo();
        }
        if (iOrdinal == 4) {
            return new rsz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficRequestInfo$RequestInfo.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getUrl() {
        return this.url_;
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.additionalContext_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.bytesSent_;
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.headers_);
    }

    public final psz r() {
        psz pszVar;
        switch (this.method_) {
            case 0:
                pszVar = psz.HTTP_METHOD_UNSPECIFIED;
                break;
            case 1:
                pszVar = psz.HTTP_METHOD_GET;
                break;
            case 2:
                pszVar = psz.HTTP_METHOD_POST;
                break;
            case 3:
                pszVar = psz.HTTP_METHOD_PUT;
                break;
            case 4:
                pszVar = psz.HTTP_METHOD_PATCH;
                break;
            case 5:
                pszVar = psz.HTTP_METHOD_DELETE;
                break;
            case 6:
                pszVar = psz.HTTP_METHOD_HEAD;
                break;
            case 7:
                pszVar = psz.HTTP_METHOD_CONNECT;
                break;
            case 8:
                pszVar = psz.HTTP_METHOD_OPTIONS;
                break;
            case 9:
                pszVar = psz.HTTP_METHOD_TRACE;
                break;
            default:
                pszVar = null;
                break;
        }
        return pszVar == null ? psz.UNRECOGNIZED : pszVar;
    }

    public final String s() {
        return this.sourceIdentifier_;
    }

    public final qng0 t() {
        qng0 qng0Var = this.additionalContext_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.additionalContext_ = qng0VarH;
        return qng0VarH;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final qng0 u() {
        qng0 qng0Var = this.headers_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.headers_ = qng0VarH;
        return qng0VarH;
    }

    public final void w(long j) {
        this.bytesSent_ = j;
    }

    public final void x(psz pszVar) {
        this.method_ = pszVar.getNumber();
    }

    public final void y(String str) {
        this.sourceIdentifier_ = str;
    }

    public final void z(String str) {
        this.url_ = str;
    }
}
