package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Content extends h implements v2j0 {
    public static final int ADDEDURIS_FIELD_NUMBER = 4;
    public static final int CONTENTURIS_FIELD_NUMBER = 3;
    private static final Content DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVEDURIS_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int UPDATE_NOTIFICATION_FIELD_NUMBER = 6;
    private int typeCase_ = 0;
    private Object type_;

    static {
        Content content = new Content();
        DEFAULT_INSTANCE = content;
        h.registerDefaultInstance(Content.class, content);
    }

    private Content() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"type_", "typeCase_", ContentUris.class, CuratedUris.class, CuratedUris.class, UpdateNotification.class});
        }
        if (iOrdinal == 3) {
            return new Content();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (Content.class) {
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

    public final CuratedUris n() {
        return this.typeCase_ == 4 ? (CuratedUris) this.type_ : CuratedUris.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ContentUris o() {
        return this.typeCase_ == 3 ? (ContentUris) this.type_ : ContentUris.n();
    }

    public final String p() {
        return this.typeCase_ == 1 ? (String) this.type_ : "";
    }

    public final CuratedUris q() {
        return this.typeCase_ == 5 ? (CuratedUris) this.type_ : CuratedUris.n();
    }

    public final String r() {
        return this.typeCase_ == 2 ? (String) this.type_ : "";
    }

    public final int s() {
        switch (this.typeCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public final UpdateNotification t() {
        return this.typeCase_ == 6 ? (UpdateNotification) this.type_ : UpdateNotification.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
