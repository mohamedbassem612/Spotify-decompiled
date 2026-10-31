package com.spotify.watchfeedentrypoints.api.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PivotsSection extends h implements v2j0 {
    public static final int BENTO_SECTION_FIELD_NUMBER = 2;
    private static final PivotsSection DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private PivotsSectionInfo sectionInfo_;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        PivotsSection pivotsSection = new PivotsSection();
        DEFAULT_INSTANCE = pivotsSection;
        h.registerDefaultInstance(PivotsSection.class, pivotsSection);
    }

    private PivotsSection() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", "bitField0_", "sectionInfo_", PivotsBentoSection.class});
        }
        if (iOrdinal == 3) {
            return new PivotsSection();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (PivotsSection.class) {
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

    public final PivotsBentoSection n() {
        return this.sectionTypeCase_ == 2 ? (PivotsBentoSection) this.sectionType_ : PivotsBentoSection.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PivotsSectionInfo o() {
        PivotsSectionInfo pivotsSectionInfo = this.sectionInfo_;
        return pivotsSectionInfo == null ? PivotsSectionInfo.n() : pivotsSectionInfo;
    }

    public final int p() {
        int i = this.sectionTypeCase_;
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
