package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$ImageGroup extends h implements v2j0 {
    private static final Metadata$ImageGroup DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 image_ = h.emptyProtobufList();

    static {
        Metadata$ImageGroup metadata$ImageGroup = new Metadata$ImageGroup();
        DEFAULT_INSTANCE = metadata$ImageGroup;
        h.registerDefaultInstance(Metadata$ImageGroup.class, metadata$ImageGroup);
    }

    private Metadata$ImageGroup() {
    }

    public static Metadata$ImageGroup n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"image_", Metadata$Image.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$ImageGroup();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (Metadata$ImageGroup.class) {
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

    public final int getImageCount() {
        return this.image_.size();
    }

    public final List getImageList() {
        return this.image_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
