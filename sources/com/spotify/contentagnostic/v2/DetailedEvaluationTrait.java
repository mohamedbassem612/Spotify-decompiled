package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class DetailedEvaluationTrait extends h implements v2j0 {
    private static final DetailedEvaluationTrait DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    public static final int IMAGES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String description_ = "";
    private h290 images_ = h.emptyProtobufList();

    static {
        DetailedEvaluationTrait detailedEvaluationTrait = new DetailedEvaluationTrait();
        DEFAULT_INSTANCE = detailedEvaluationTrait;
        h.registerDefaultInstance(DetailedEvaluationTrait.class, detailedEvaluationTrait);
    }

    private DetailedEvaluationTrait() {
    }

    public static DetailedEvaluationTrait p(byte[] bArr) {
        return (DetailedEvaluationTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"description_", "images_", Image.class});
        }
        if (iOrdinal == 3) {
            return new DetailedEvaluationTrait();
        }
        if (iOrdinal == 4) {
            return new o8t((byte) 12);
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
        synchronized (DetailedEvaluationTrait.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.images_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
