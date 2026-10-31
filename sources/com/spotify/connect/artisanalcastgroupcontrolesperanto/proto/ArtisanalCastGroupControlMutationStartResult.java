package com.spotify.connect.artisanalcastgroupcontrolesperanto.proto;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.jf40;
import p.ma6;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ArtisanalCastGroupControlMutationStartResult extends h implements v2j0 {
    private static final ArtisanalCastGroupControlMutationStartResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private int error_;
    private long requestId_;

    static {
        ArtisanalCastGroupControlMutationStartResult artisanalCastGroupControlMutationStartResult = new ArtisanalCastGroupControlMutationStartResult();
        DEFAULT_INSTANCE = artisanalCastGroupControlMutationStartResult;
        h.registerDefaultInstance(ArtisanalCastGroupControlMutationStartResult.class, artisanalCastGroupControlMutationStartResult);
    }

    private ArtisanalCastGroupControlMutationStartResult() {
    }

    public static ArtisanalCastGroupControlMutationStartResult p(byte[] bArr) {
        return (ArtisanalCastGroupControlMutationStartResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\f", new Object[]{"requestId_", "error_"});
        }
        if (iOrdinal == 3) {
            return new ArtisanalCastGroupControlMutationStartResult();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ArtisanalCastGroupControlMutationStartResult.class) {
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

    public final ma6 n() {
        ma6 ma6VarA = ma6.a(this.error_);
        return ma6VarA == null ? ma6.UNRECOGNIZED : ma6VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.requestId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
