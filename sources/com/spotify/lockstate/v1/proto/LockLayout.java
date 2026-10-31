package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class LockLayout extends h implements v2j0 {
    public static final int CARD_FIELD_NUMBER = 2;
    public static final int COLUMN_LAYOUT_FIELD_NUMBER = 1;
    private static final LockLayout DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONED_FIELD_NUMBER = 3;
    private int layoutCase_ = 0;
    private Object layout_;

    static {
        LockLayout lockLayout = new LockLayout();
        DEFAULT_INSTANCE = lockLayout;
        h.registerDefaultInstance(LockLayout.class, lockLayout);
    }

    private LockLayout() {
    }

    public static LockLayout o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"layout_", "layoutCase_", ColumnLayout.class, CardLayout.class, SectionedLayout.class});
        }
        if (iOrdinal == 3) {
            return new LockLayout();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (LockLayout.class) {
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

    public final ColumnLayout n() {
        return this.layoutCase_ == 1 ? (ColumnLayout) this.layout_ : ColumnLayout.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SectionedLayout p() {
        return this.layoutCase_ == 3 ? (SectionedLayout) this.layout_ : SectionedLayout.o();
    }

    public final boolean q() {
        return this.layoutCase_ == 1;
    }

    public final boolean r() {
        return this.layoutCase_ == 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
