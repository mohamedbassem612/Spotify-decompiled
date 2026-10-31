package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.ir70;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ImageAttachment extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final ImageAttachment DEFAULT_INSTANCE;
    public static final int MIME_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private phc data_ = phc.b;
    private String mimeType_ = "";

    static {
        ImageAttachment imageAttachment = new ImageAttachment();
        DEFAULT_INSTANCE = imageAttachment;
        h.registerDefaultInstance(ImageAttachment.class, imageAttachment);
    }

    private ImageAttachment() {
    }

    public static ir70 n() {
        return (ir70) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"data_", "mimeType_"});
        }
        if (iOrdinal == 3) {
            return new ImageAttachment();
        }
        if (iOrdinal == 4) {
            return new ir70(DEFAULT_INSTANCE);
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
        synchronized (ImageAttachment.class) {
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

    public final void o(hhc hhcVar) {
        this.data_ = hhcVar;
    }

    public final void p() {
        this.mimeType_ = "image/jpeg";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
