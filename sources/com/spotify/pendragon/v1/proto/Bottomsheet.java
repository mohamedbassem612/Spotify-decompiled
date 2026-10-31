package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i3a;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Bottomsheet extends h implements v2j0 {
    public static final int BASE_BOTTOMSHEET_FIELD_NUMBER = 6;
    public static final int BASIC_BOTTOMSHEET_FIELD_NUMBER = 1;
    public static final int BUTTONS_FIELD_NUMBER = 5;
    private static final Bottomsheet DEFAULT_INSTANCE;
    public static final int FULL_BLEED_BOTTOMSHEET_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RICH_BOTTOMSHEET_FIELD_NUMBER = 2;
    private Object bottomsheetTemplate_;
    private int bottomsheetTemplateCase_ = 0;
    private h290 buttons_ = h.emptyProtobufList();

    static {
        Bottomsheet bottomsheet = new Bottomsheet();
        DEFAULT_INSTANCE = bottomsheet;
        h.registerDefaultInstance(Bottomsheet.class, bottomsheet);
    }

    private Bottomsheet() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Bottomsheet s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0005\u001b\u0006<\u0000", new Object[]{"bottomsheetTemplate_", "bottomsheetTemplateCase_", BasicBottomsheet.class, RichBottomsheet.class, FullBleedBottomsheet.class, "buttons_", Button.class, BaseBottomsheet.class});
        }
        if (iOrdinal == 3) {
            return new Bottomsheet();
        }
        if (iOrdinal == 4) {
            return new lka((byte) 13);
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
        synchronized (Bottomsheet.class) {
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

    public final BaseBottomsheet o() {
        return this.bottomsheetTemplateCase_ == 6 ? (BaseBottomsheet) this.bottomsheetTemplate_ : BaseBottomsheet.p();
    }

    public final BasicBottomsheet p() {
        return this.bottomsheetTemplateCase_ == 1 ? (BasicBottomsheet) this.bottomsheetTemplate_ : BasicBottomsheet.o();
    }

    public final int q() {
        return i3a.b(this.bottomsheetTemplateCase_);
    }

    public final h290 r() {
        return this.buttons_;
    }

    public final FullBleedBottomsheet t() {
        return this.bottomsheetTemplateCase_ == 3 ? (FullBleedBottomsheet) this.bottomsheetTemplate_ : FullBleedBottomsheet.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final RichBottomsheet u() {
        return this.bottomsheetTemplateCase_ == 2 ? (RichBottomsheet) this.bottomsheetTemplate_ : RichBottomsheet.o();
    }
}
