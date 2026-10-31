package com.spotify.extendedmetadata.extensions.concertperformersimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.py;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Performer extends h implements v2j0 {
    public static final int ACT_FIELD_NUMBER = 2;
    public static final int ARTIST_NAME_FIELD_NUMBER = 3;
    public static final int ARTIST_URI_FIELD_NUMBER = 1;
    private static final Performer DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int act_;
    private String artistUri_ = "";
    private String artistName_ = "";

    static {
        Performer performer = new Performer();
        DEFAULT_INSTANCE = performer;
        h.registerDefaultInstance(Performer.class, performer);
    }

    private Performer() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"artistUri_", "act_", "artistName_"});
        }
        if (iOrdinal == 3) {
            return new Performer();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (Performer.class) {
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

    public final py n() {
        py pyVar;
        int i = this.act_;
        if (i == 0) {
            pyVar = py.ACT_UNKNOWN;
        } else if (i != 1) {
            pyVar = i != 2 ? null : py.ACT_SUPPORTING;
        } else {
            pyVar = py.ACT_HEADLINER;
        }
        return pyVar == null ? py.UNRECOGNIZED : pyVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artistName_;
    }

    public final String p() {
        return this.artistUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
