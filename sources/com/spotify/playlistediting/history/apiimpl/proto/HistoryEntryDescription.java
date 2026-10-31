package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HistoryEntryDescription extends h implements v2j0 {
    public static final int ATTRIBUTE_CHANGED_FIELD_NUMBER = 2;
    public static final int COMPLEX_CHANGE_FIELD_NUMBER = 3;
    public static final int CUSTOM_TRANSITION_CHANGED_FIELD_NUMBER = 5;
    private static final HistoryEntryDescription DEFAULT_INSTANCE;
    public static final int ITEMS_CHANGED_FIELD_NUMBER = 1;
    public static final int MIXING_ENABLEMENT_CHANGED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        HistoryEntryDescription historyEntryDescription = new HistoryEntryDescription();
        DEFAULT_INSTANCE = historyEntryDescription;
        h.registerDefaultInstance(HistoryEntryDescription.class, historyEntryDescription);
    }

    private HistoryEntryDescription() {
    }

    public static HistoryEntryDescription p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"kind_", "kindCase_", ItemsChanged.class, AttributeChanged.class, ComplexChange.class, MixingEnablementChanged.class, CustomTransitionChanged.class});
        }
        if (iOrdinal == 3) {
            return new HistoryEntryDescription();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (HistoryEntryDescription.class) {
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

    public final AttributeChanged n() {
        return this.kindCase_ == 2 ? (AttributeChanged) this.kind_ : AttributeChanged.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CustomTransitionChanged o() {
        return this.kindCase_ == 5 ? (CustomTransitionChanged) this.kind_ : CustomTransitionChanged.n();
    }

    public final ItemsChanged q() {
        return this.kindCase_ == 1 ? (ItemsChanged) this.kind_ : ItemsChanged.o();
    }

    public final MixingEnablementChanged r() {
        return this.kindCase_ == 4 ? (MixingEnablementChanged) this.kind_ : MixingEnablementChanged.n();
    }

    public final boolean s() {
        return this.kindCase_ == 2;
    }

    public final boolean t() {
        return this.kindCase_ == 5;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.kindCase_ == 1;
    }

    public final boolean v() {
        return this.kindCase_ == 4;
    }
}
