package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.w5t0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Placeholder extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    public static final int ARTWORK_OPTIONS_FIELD_NUMBER = 4;
    private static final Placeholder DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String title_ = "";
    private String artwork_ = "";
    private h290 artworkOptions_ = h.emptyProtobufList();

    static {
        Placeholder placeholder = new Placeholder();
        DEFAULT_INSTANCE = placeholder;
        h.registerDefaultInstance(Placeholder.class, placeholder);
    }

    private Placeholder() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Placeholder q() {
        return DEFAULT_INSTANCE;
    }

    public static w5t0 r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț", new Object[]{"id_", "title_", "artwork_", "artworkOptions_"});
        }
        if (iOrdinal == 3) {
            return new Placeholder();
        }
        if (iOrdinal == 4) {
            return new w5t0(DEFAULT_INSTANCE);
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
        synchronized (Placeholder.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.artworkOptions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.artworkOptions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artwork_;
    }

    public final h290 p() {
        return this.artworkOptions_;
    }

    public final void s(String str) {
        str.getClass();
        this.artwork_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.id_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.title_ = str;
    }
}
