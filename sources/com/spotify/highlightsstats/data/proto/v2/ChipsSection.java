package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Chip;
import p.bf40;
import p.h290;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ChipsSection extends h implements v2j0 {
    public static final int CHIPS_FIELD_NUMBER = 1;
    private static final ChipsSection DEFAULT_INSTANCE;
    public static final int NON_SHAREABLE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_SUBTITLE_FIELD_NUMBER = 2;
    public static final int SHAREABLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Object shareability_;
    private int shareabilityCase_ = 0;
    private h290 chips_ = h.emptyProtobufList();
    private String sectionSubtitle_ = "";

    static {
        ChipsSection chipsSection = new ChipsSection();
        DEFAULT_INSTANCE = chipsSection;
        h.registerDefaultInstance(ChipsSection.class, chipsSection);
    }

    private ChipsSection() {
    }

    public static ChipsSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"shareability_", "shareabilityCase_", "bitField0_", "chips_", Chip.class, "sectionSubtitle_", Shareable.class, NonShareable.class});
        }
        if (iOrdinal == 3) {
            return new ChipsSection();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ChipsSection.class) {
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

    public final h290 n() {
        return this.chips_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final NonShareable p() {
        return this.shareabilityCase_ == 4 ? (NonShareable) this.shareability_ : NonShareable.o();
    }

    public final String q() {
        return this.sectionSubtitle_;
    }

    public final int r() {
        int i = this.shareabilityCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    public final Shareable s() {
        return this.shareabilityCase_ == 3 ? (Shareable) this.shareability_ : Shareable.n();
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
