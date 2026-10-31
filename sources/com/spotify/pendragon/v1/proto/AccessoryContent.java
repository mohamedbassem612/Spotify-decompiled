package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x0d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AccessoryContent extends h implements v2j0 {
    private static final AccessoryContent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int contentCase_ = 0;
    private Object content_;

    static {
        AccessoryContent accessoryContent = new AccessoryContent();
        DEFAULT_INSTANCE = accessoryContent;
        h.registerDefaultInstance(AccessoryContent.class, accessoryContent);
    }

    private AccessoryContent() {
    }

    public static AccessoryContent p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"content_", "contentCase_", Icon.class, AccessoryImage.class});
        }
        if (iOrdinal == 3) {
            return new AccessoryContent();
        }
        if (iOrdinal == 4) {
            return new j((byte) 3);
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
        synchronized (AccessoryContent.class) {
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

    public final int o() {
        return x0d.a(this.contentCase_);
    }

    public final Icon q() {
        return this.contentCase_ == 1 ? (Icon) this.content_ : Icon.p();
    }

    public final AccessoryImage r() {
        return this.contentCase_ == 2 ? (AccessoryImage) this.content_ : AccessoryImage.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
