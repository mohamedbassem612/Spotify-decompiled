package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fse1;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EntryMedia extends h implements v2j0 {
    private static final EntryMedia DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_LOGO_URL_FIELD_NUMBER = 2;
    public static final int VISUAL_IDENTITY_URI_FIELD_NUMBER = 3;
    private int mediaCase_ = 0;
    private Object media_;

    static {
        EntryMedia entryMedia = new EntryMedia();
        DEFAULT_INSTANCE = entryMedia;
        h.registerDefaultInstance(EntryMedia.class, entryMedia);
    }

    private EntryMedia() {
    }

    public static EntryMedia n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000", new Object[]{"media_", "mediaCase_"});
        }
        if (iOrdinal == 3) {
            return new EntryMedia();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (EntryMedia.class) {
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

    public final fse1 o() {
        if (this.mediaCase_ != 1) {
            return fse1.b;
        }
        fse1 fse1VarA = fse1.a(((Integer) this.media_).intValue());
        return fse1VarA == null ? fse1.X : fse1VarA;
    }

    public final int p() {
        int i = this.mediaCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final String q() {
        return this.mediaCase_ == 2 ? (String) this.media_ : "";
    }

    public final String r() {
        return this.mediaCase_ == 3 ? (String) this.media_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
