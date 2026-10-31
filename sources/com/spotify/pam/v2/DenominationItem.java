package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tat;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class DenominationItem extends h implements v2j0 {
    public static final int BADGE_FIELD_NUMBER = 2;
    private static final DenominationItem DEFAULT_INSTANCE;
    public static final int DENOMINATION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 3;
    public static final int SELECTION_BUTTON_FIELD_NUMBER = 5;
    public static final int SELECTION_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private DenominationCta selectionButton_;
    private int selectionState_;
    private String denomination_ = "";
    private String badge_ = "";
    private String price_ = "";

    static {
        DenominationItem denominationItem = new DenominationItem();
        DEFAULT_INSTANCE = denominationItem;
        h.registerDefaultInstance(DenominationItem.class, denominationItem);
    }

    private DenominationItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\f\u0005ဉ\u0001", new Object[]{"bitField0_", "denomination_", "badge_", "price_", "selectionState_", "selectionButton_"});
        }
        if (iOrdinal == 3) {
            return new DenominationItem();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (DenominationItem.class) {
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

    public final String n() {
        return this.badge_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.denomination_;
    }

    public final String p() {
        return this.price_;
    }

    public final DenominationCta q() {
        DenominationCta denominationCta = this.selectionButton_;
        return denominationCta == null ? DenominationCta.o() : denominationCta;
    }

    public final tat r() {
        tat tatVar;
        int i = this.selectionState_;
        if (i == 0) {
            tatVar = tat.DENOMINATION_SELECTION_STATE_UNSPECIFIED;
        } else if (i != 1) {
            tatVar = i != 2 ? null : tat.DENOMINATION_SELECTION_STATE_PRE_SELECTED;
        } else {
            tatVar = tat.DENOMINATION_SELECTION_STATE_DISABLED;
        }
        return tatVar == null ? tat.UNRECOGNIZED : tatVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
