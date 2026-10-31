package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SectionInfo extends h implements v2j0 {
    private static final SectionInfo DEFAULT_INSTANCE;
    public static final int DISPLAY_CONDITION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private DisplayCondition displayCondition_;
    private String sectionId_ = "";

    static {
        SectionInfo sectionInfo = new SectionInfo();
        DEFAULT_INSTANCE = sectionInfo;
        h.registerDefaultInstance(SectionInfo.class, sectionInfo);
    }

    private SectionInfo() {
    }

    public static SectionInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "sectionId_", "displayCondition_"});
        }
        if (iOrdinal == 3) {
            return new SectionInfo();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (SectionInfo.class) {
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

    public final DisplayCondition o() {
        DisplayCondition displayCondition = this.displayCondition_;
        return displayCondition == null ? DisplayCondition.o() : displayCondition;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
