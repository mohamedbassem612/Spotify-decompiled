package com.spotify.list_collection.save_source.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oc41;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ula1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SaveSource extends h implements v2j0 {
    private static final SaveSource DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    public static final int ORIGINAL_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_TOOL_FIELD_NUMBER = 3;
    private int bitField0_;
    private int sourceTool_;
    private String originalUri_ = "";
    private String interactionId_ = "";

    static {
        SaveSource saveSource = new SaveSource();
        DEFAULT_INSTANCE = saveSource;
        h.registerDefaultInstance(SaveSource.class, saveSource);
    }

    private SaveSource() {
    }

    public static SaveSource n() {
        return DEFAULT_INSTANCE;
    }

    public static oc41 p() {
        return (oc41) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static oc41 q(SaveSource saveSource) {
        return (oc41) DEFAULT_INSTANCE.createBuilder(saveSource);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "originalUri_", "interactionId_", "sourceTool_"});
        }
        if (iOrdinal == 3) {
            return new SaveSource();
        }
        if (iOrdinal == 4) {
            return new oc41(DEFAULT_INSTANCE);
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
        synchronized (SaveSource.class) {
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

    public final ula1 o() {
        ula1 ula1Var;
        int i = this.sourceTool_;
        if (i == 0) {
            ula1Var = ula1.SOURCE_TOOL_UNSPECIFIED;
        } else if (i != 1) {
            ula1Var = i != 2 ? null : ula1.SOURCE_TOOL_STUDIO_AGENT;
        } else {
            ula1Var = ula1.SOURCE_TOOL_PROMPT;
        }
        return ula1Var == null ? ula1.UNRECOGNIZED : ula1Var;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.interactionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
