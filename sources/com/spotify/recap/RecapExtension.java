package com.spotify.recap;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecapExtension extends h implements v2j0 {
    private static final RecapExtension DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_REQUIRED_FIELD_NUMBER = 3;
    public static final int RECAP_AVAILABLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration progressRequired_;
    private boolean recapAvailable_;

    static {
        RecapExtension recapExtension = new RecapExtension();
        DEFAULT_INSTANCE = recapExtension;
        h.registerDefaultInstance(RecapExtension.class, recapExtension);
    }

    private RecapExtension() {
    }

    public static RecapExtension p(byte[] bArr) {
        return (RecapExtension) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "recapAvailable_", "progressRequired_"});
        }
        if (iOrdinal == 3) {
            return new RecapExtension();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (RecapExtension.class) {
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

    public final Duration n() {
        Duration duration = this.progressRequired_;
        return duration == null ? Duration.n() : duration;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.recapAvailable_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
