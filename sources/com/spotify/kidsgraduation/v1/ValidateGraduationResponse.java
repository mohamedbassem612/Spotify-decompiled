package com.spotify.kidsgraduation.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ValidateGraduationResponse extends h implements v2j0 {
    private static final ValidateGraduationResponse DEFAULT_INSTANCE;
    public static final int GEOIP_MISMATCH_FIELD_NUMBER = 2;
    public static final int GRADUATION_TOKEN_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean geoipMismatch_;
    private String graduationToken_ = "";

    static {
        ValidateGraduationResponse validateGraduationResponse = new ValidateGraduationResponse();
        DEFAULT_INSTANCE = validateGraduationResponse;
        h.registerDefaultInstance(ValidateGraduationResponse.class, validateGraduationResponse);
    }

    private ValidateGraduationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"graduationToken_", "geoipMismatch_"});
        }
        if (iOrdinal == 3) {
            return new ValidateGraduationResponse();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ValidateGraduationResponse.class) {
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

    public final boolean n() {
        return this.geoipMismatch_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.graduationToken_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
