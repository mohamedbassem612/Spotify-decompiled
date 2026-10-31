package com.spotify.watchfeed.component.item.v1;

import com.spotify.watchfeed.component.model.v1.proto.TranscriptFile;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TranscriptRowComponent extends com.google.protobuf.h implements v2j0 {
    private static final TranscriptRowComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSCRIPT_FILE_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private TranscriptFile transcriptFile_;
    private String url_ = "";

    static {
        TranscriptRowComponent transcriptRowComponent = new TranscriptRowComponent();
        DEFAULT_INSTANCE = transcriptRowComponent;
        com.google.protobuf.h.registerDefaultInstance(TranscriptRowComponent.class, transcriptRowComponent);
    }

    private TranscriptRowComponent() {
    }

    public static TranscriptRowComponent o(phc phcVar) {
        return (TranscriptRowComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "url_", "transcriptFile_"});
        }
        if (iOrdinal == 3) {
            return new TranscriptRowComponent();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (TranscriptRowComponent.class) {
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

    public final TranscriptFile n() {
        TranscriptFile transcriptFile = this.transcriptFile_;
        return transcriptFile == null ? TranscriptFile.n() : transcriptFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
