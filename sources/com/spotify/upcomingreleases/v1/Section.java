package com.spotify.upcomingreleases.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Section extends h implements v2j0 {
    private static final Section DEFAULT_INSTANCE;
    public static final int LISTENING_PARTIES_SECTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRERELEASES_SECTION_FIELD_NUMBER = 1;
    private int sectionCase_ = 0;
    private Object section_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"section_", "sectionCase_", PrereleasesSection.class, ListeningPartiesSection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (Section.class) {
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

    public final ListeningPartiesSection n() {
        return this.sectionCase_ == 2 ? (ListeningPartiesSection) this.section_ : ListeningPartiesSection.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PrereleasesSection o() {
        return this.sectionCase_ == 1 ? (PrereleasesSection) this.section_ : PrereleasesSection.n();
    }

    public final int p() {
        int i = this.sectionCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
