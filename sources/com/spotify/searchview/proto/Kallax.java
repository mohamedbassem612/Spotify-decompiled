package com.spotify.searchview.proto;

import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Kallax extends com.google.protobuf.h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 4;
    private static final Kallax DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 1;
    public static final int MOGEF19_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPTER_FIELD_NUMBER = 3;
    private boolean explicit_;
    private boolean mogef19_;
    private String prompter_ = "";
    private h290 artists_ = com.google.protobuf.h.emptyProtobufList();

    static {
        Kallax kallax = new Kallax();
        DEFAULT_INSTANCE = kallax;
        com.google.protobuf.h.registerDefaultInstance(Kallax.class, kallax);
    }

    private Kallax() {
    }

    public static Kallax n() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004\u001b", new Object[]{"explicit_", "mogef19_", "prompter_", "artists_", RelatedEntity.class});
        }
        if (iOrdinal == 3) {
            return new Kallax();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (Kallax.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.explicit_;
    }

    public final boolean p() {
        return this.mogef19_;
    }

    public final String q() {
        return this.prompter_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
