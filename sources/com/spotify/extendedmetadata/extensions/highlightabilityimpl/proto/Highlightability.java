package com.spotify.extendedmetadata.extensions.highlightabilityimpl.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Highlightability extends h implements v2j0 {
    private static final Highlightability DEFAULT_INSTANCE;
    public static final int MAX_LENGTH_FIELD_NUMBER = 3;
    public static final int MIN_LENGTH_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USER_HIGHLIGHTABLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration maxLength_;
    private Duration minLength_;
    private boolean userHighlightable_;

    static {
        Highlightability highlightability = new Highlightability();
        DEFAULT_INSTANCE = highlightability;
        h.registerDefaultInstance(Highlightability.class, highlightability);
    }

    private Highlightability() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Highlightability r(byte[] bArr) {
        return (Highlightability) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "userHighlightable_", "minLength_", "maxLength_"});
        }
        if (iOrdinal == 3) {
            return new Highlightability();
        }
        if (iOrdinal == 4) {
            return new m660((byte) 13);
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
        synchronized (Highlightability.class) {
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

    public final Duration o() {
        Duration duration = this.maxLength_;
        return duration == null ? Duration.n() : duration;
    }

    public final Duration p() {
        Duration duration = this.minLength_;
        return duration == null ? Duration.n() : duration;
    }

    public final boolean q() {
        return this.userHighlightable_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
