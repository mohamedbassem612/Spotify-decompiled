package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.j;
import p.jf40;
import p.kn0;
import p.mn0;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse extends h implements v2j0 {
    public static final int CANONICAL_TO_USER_TIMESTAMPS_FIELD_NUMBER = 1;
    private static final AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRECISION_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    private qng0 canonicalToUserTimestamps_ = qng0.b;
    private int precision_;
    private int status_;

    static {
        AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse adDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse = new AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse();
        DEFAULT_INSTANCE = adDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse;
        h.registerDefaultInstance(AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse.class, adDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse);
    }

    private AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse() {
    }

    public static AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse p(byte[] bArr) {
        return (AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002\f\u0003\f", new Object[]{"canonicalToUserTimestamps_", mn0.a, "precision_", "status_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (AdDetectionOuterClass$SubscribeCanonicalToUserTimestampResponse.class) {
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

    public final Map n() {
        return Collections.unmodifiableMap(this.canonicalToUserTimestamps_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final kn0 o() {
        kn0 kn0VarA = kn0.a(this.precision_);
        return kn0VarA == null ? kn0.UNRECOGNIZED : kn0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
