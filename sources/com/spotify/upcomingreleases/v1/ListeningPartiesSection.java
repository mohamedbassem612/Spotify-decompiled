package com.spotify.upcomingreleases.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rid0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ListeningPartiesSection extends h implements v2j0 {
    private static final ListeningPartiesSection DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LISTENING_PARTIES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int id_;
    private h290 listeningParties_ = h.emptyProtobufList();

    static {
        ListeningPartiesSection listeningPartiesSection = new ListeningPartiesSection();
        DEFAULT_INSTANCE = listeningPartiesSection;
        h.registerDefaultInstance(ListeningPartiesSection.class, listeningPartiesSection);
    }

    private ListeningPartiesSection() {
    }

    public static ListeningPartiesSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"id_", "listeningParties_", ListeningParty.class});
        }
        if (iOrdinal == 3) {
            return new ListeningPartiesSection();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ListeningPartiesSection.class) {
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

    public final rid0 o() {
        rid0 rid0Var;
        int i = this.id_;
        if (i != 0) {
            rid0Var = i != 1 ? null : rid0.c;
        } else {
            rid0Var = rid0.b;
        }
        return rid0Var == null ? rid0.d : rid0Var;
    }

    public final h290 p() {
        return this.listeningParties_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
