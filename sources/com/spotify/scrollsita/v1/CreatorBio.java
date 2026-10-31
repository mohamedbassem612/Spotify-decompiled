package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fyn;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class CreatorBio extends h implements v2j0 {
    public static final int CREATOR_URI_FIELD_NUMBER = 1;
    private static final CreatorBio DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String creatorUri_ = "";
    private String title_ = "";

    static {
        CreatorBio creatorBio = new CreatorBio();
        DEFAULT_INSTANCE = creatorBio;
        h.registerDefaultInstance(CreatorBio.class, creatorBio);
    }

    private CreatorBio() {
    }

    public static CreatorBio o() {
        return DEFAULT_INSTANCE;
    }

    public static fyn p() {
        return (fyn) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"creatorUri_", "title_"});
        }
        if (iOrdinal == 3) {
            return new CreatorBio();
        }
        if (iOrdinal == 4) {
            return new fyn(DEFAULT_INSTANCE);
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
        synchronized (CreatorBio.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.creatorUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(String str) {
        this.creatorUri_ = str;
    }

    public final void r(String str) {
        this.title_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
