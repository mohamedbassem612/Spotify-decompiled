package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EntryPointCard extends h implements v2j0 {
    private static final EntryPointCard DEFAULT_INSTANCE;
    public static final int ENTRY_POINTS_HORIZONTAL_FIELD_NUMBER = 4;
    public static final int ENTRY_POINTS_LARGE_FIELD_NUMBER = 3;
    public static final int ENTRY_POINTS_WITH_DIVIDER_FIELD_NUMBER = 2;
    public static final int ENTRY_POINTS_WITH_GAP_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int entryPointsCase_ = 0;
    private Object entryPoints_;

    static {
        EntryPointCard entryPointCard = new EntryPointCard();
        DEFAULT_INSTANCE = entryPointCard;
        h.registerDefaultInstance(EntryPointCard.class, entryPointCard);
    }

    private EntryPointCard() {
    }

    public static EntryPointCard n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"entryPoints_", "entryPointsCase_", EntryPointList.class, EntryPointList.class, EntryPointList.class, EntryPointList.class});
        }
        if (iOrdinal == 3) {
            return new EntryPointCard();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (EntryPointCard.class) {
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

    public final int o() {
        int i = this.entryPointsCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final EntryPointList p() {
        return this.entryPointsCase_ == 4 ? (EntryPointList) this.entryPoints_ : EntryPointList.n();
    }

    public final EntryPointList q() {
        return this.entryPointsCase_ == 3 ? (EntryPointList) this.entryPoints_ : EntryPointList.n();
    }

    public final EntryPointList r() {
        return this.entryPointsCase_ == 2 ? (EntryPointList) this.entryPoints_ : EntryPointList.n();
    }

    public final EntryPointList s() {
        return this.entryPointsCase_ == 1 ? (EntryPointList) this.entryPoints_ : EntryPointList.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
