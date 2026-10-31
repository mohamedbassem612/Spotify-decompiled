package com.spotify.songdnaeligibility;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SongDnaEligibility extends h implements v2j0 {
    private static final SongDnaEligibility DEFAULT_INSTANCE;
    public static final int IS_ELIGIBLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean isEligible_;

    static {
        SongDnaEligibility songDnaEligibility = new SongDnaEligibility();
        DEFAULT_INSTANCE = songDnaEligibility;
        h.registerDefaultInstance(SongDnaEligibility.class, songDnaEligibility);
    }

    private SongDnaEligibility() {
    }

    public static SongDnaEligibility o(byte[] bArr) {
        return (SongDnaEligibility) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isEligible_"});
        }
        if (iOrdinal == 3) {
            return new SongDnaEligibility();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (SongDnaEligibility.class) {
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
        return this.isEligible_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
