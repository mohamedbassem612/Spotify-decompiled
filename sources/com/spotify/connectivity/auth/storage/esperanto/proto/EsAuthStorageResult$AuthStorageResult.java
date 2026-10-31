package com.spotify.connectivity.auth.storage.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mkz;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthStorageResult$AuthStorageResult extends h implements v2j0 {
    private static final EsAuthStorageResult$AuthStorageResult DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        EsAuthStorageResult$AuthStorageResult esAuthStorageResult$AuthStorageResult = new EsAuthStorageResult$AuthStorageResult();
        DEFAULT_INSTANCE = esAuthStorageResult$AuthStorageResult;
        h.registerDefaultInstance(EsAuthStorageResult$AuthStorageResult.class, esAuthStorageResult$AuthStorageResult);
    }

    private EsAuthStorageResult$AuthStorageResult() {
    }

    public static EsAuthStorageResult$AuthStorageResult p(byte[] bArr) {
        return (EsAuthStorageResult$AuthStorageResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthStorageResult$AuthStorageResult();
        }
        if (iOrdinal == 4) {
            return new rdz((byte) 11);
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
        synchronized (EsAuthStorageResult$AuthStorageResult.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final mkz o() {
        mkz mkzVar;
        int i = this.result_;
        if (i == 0) {
            mkzVar = mkz.success;
        } else if (i != 1) {
            mkzVar = i != 2 ? null : mkz.userAlreadyExists;
        } else {
            mkzVar = mkz.userNotFound;
        }
        return mkzVar == null ? mkz.UNRECOGNIZED : mkzVar;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
