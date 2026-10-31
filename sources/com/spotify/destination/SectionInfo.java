package com.spotify.destination;

import com.google.protobuf.h;
import p.bf40;
import p.cj51;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SectionInfo extends h implements v2j0 {
    private static final SectionInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_TYPE_FIELD_NUMBER = 1;
    private int sectionType_;

    static {
        SectionInfo sectionInfo = new SectionInfo();
        DEFAULT_INSTANCE = sectionInfo;
        h.registerDefaultInstance(SectionInfo.class, sectionInfo);
    }

    private SectionInfo() {
    }

    public static SectionInfo o(byte[] bArr) {
        return (SectionInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"sectionType_"});
        }
        if (iOrdinal == 3) {
            return new SectionInfo();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 3);
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

    public final cj51 n() {
        cj51 cj51Var;
        switch (this.sectionType_) {
            case 0:
                cj51Var = cj51.SECTION_TYPE_DEFAULT;
                break;
            case 1:
                cj51Var = cj51.SECTION_TYPE_SHELF;
                break;
            case 2:
                cj51Var = cj51.SECTION_TYPE_CATEGORIES;
                break;
            case 3:
                cj51Var = cj51.SECTION_TYPE_WATCH_FEED;
                break;
            case 4:
                cj51Var = cj51.SECTION_TYPE_VIDEO_RECOMMENDATIONS;
                break;
            case 5:
                cj51Var = cj51.SECTION_TYPE_SEE_OTHER;
                break;
            case 6:
                cj51Var = cj51.SECTION_TYPE_SINGLE_CONTENT_COMPONENT;
                break;
            default:
                cj51Var = null;
                break;
        }
        return cj51Var == null ? cj51.UNRECOGNIZED : cj51Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
