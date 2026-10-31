package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.oqz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsProvidedTrack$ProvidedTrack extends h implements v2j0 {
    public static final int BLOCKED_FIELD_NUMBER = 3;
    public static final int CONTEXT_TRACK_FIELD_NUMBER = 1;
    private static final EsProvidedTrack$ProvidedTrack DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int REMOVED_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsContextTrack$ContextTrack contextTrack_;
    private h290 removed_ = h.emptyProtobufList();
    private h290 blocked_ = h.emptyProtobufList();
    private String provider_ = "";

    static {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = new EsProvidedTrack$ProvidedTrack();
        DEFAULT_INSTANCE = esProvidedTrack$ProvidedTrack;
        h.registerDefaultInstance(EsProvidedTrack$ProvidedTrack.class, esProvidedTrack$ProvidedTrack);
    }

    private EsProvidedTrack$ProvidedTrack() {
    }

    public static EsProvidedTrack$ProvidedTrack p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static oqz r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002Ț\u0003Ț\u0004Ȉ", new Object[]{"bitField0_", "contextTrack_", "removed_", "blocked_", "provider_"});
        }
        if (iOrdinal == 3) {
            return new EsProvidedTrack$ProvidedTrack();
        }
        if (iOrdinal == 4) {
            return new oqz();
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
        synchronized (EsProvidedTrack$ProvidedTrack.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsContextTrack$ContextTrack o() {
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.contextTrack_;
        return esContextTrack$ContextTrack == null ? EsContextTrack$ContextTrack.o() : esContextTrack$ContextTrack;
    }

    public final String q() {
        return this.provider_;
    }

    public final void s(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        this.contextTrack_ = esContextTrack$ContextTrack;
        this.bitField0_ |= 1;
    }

    public final void t(String str) {
        str.getClass();
        this.provider_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
