package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CollectionItemdata$SnoozedRecsItemData extends h implements v2j0 {
    private static final CollectionItemdata$SnoozedRecsItemData DEFAULT_INSTANCE;
    public static final int EXPIRES_AT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SNOOZE_CONTEXT_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp expiresAt_;
    private String snoozeContextUri_ = "";

    static {
        CollectionItemdata$SnoozedRecsItemData collectionItemdata$SnoozedRecsItemData = new CollectionItemdata$SnoozedRecsItemData();
        DEFAULT_INSTANCE = collectionItemdata$SnoozedRecsItemData;
        h.registerDefaultInstance(CollectionItemdata$SnoozedRecsItemData.class, collectionItemdata$SnoozedRecsItemData);
    }

    private CollectionItemdata$SnoozedRecsItemData() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "expiresAt_", "snoozeContextUri_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$SnoozedRecsItemData();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (CollectionItemdata$SnoozedRecsItemData.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
