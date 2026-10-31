package com.spotify.pam.v2;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class DenominationSelectionWithListAndSections extends h implements v2j0 {
    private static final DenominationSelectionWithListAndSections DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ITEMS_FIELD_NUMBER = 4;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    public static final int SECTIONS_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DenominationCta primaryButton_;
    private DenominationCta secondaryButton_;
    private String pageTitle_ = "";
    private String title_ = "";
    private String description_ = "";
    private h290 items_ = h.emptyProtobufList();
    private h290 sections_ = h.emptyProtobufList();

    static {
        DenominationSelectionWithListAndSections denominationSelectionWithListAndSections = new DenominationSelectionWithListAndSections();
        DEFAULT_INSTANCE = denominationSelectionWithListAndSections;
        h.registerDefaultInstance(DenominationSelectionWithListAndSections.class, denominationSelectionWithListAndSections);
    }

    private DenominationSelectionWithListAndSections() {
    }

    public static DenominationSelectionWithListAndSections n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u001b", new Object[]{"bitField0_", "pageTitle_", "title_", "description_", "items_", DenominationItem.class, "primaryButton_", "secondaryButton_", "sections_", DenominationSection.class});
        }
        if (iOrdinal == 3) {
            return new DenominationSelectionWithListAndSections();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (DenominationSelectionWithListAndSections.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DenominationCta o() {
        DenominationCta denominationCta = this.primaryButton_;
        return denominationCta == null ? DenominationCta.o() : denominationCta;
    }

    public final DenominationCta p() {
        DenominationCta denominationCta = this.secondaryButton_;
        return denominationCta == null ? DenominationCta.o() : denominationCta;
    }

    public final h290 q() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
