package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class PlayableItemBottomUpSheetTriggerRow extends h implements v2j0 {
    public static final int BOTTOM_UP_SHEET_TITLE_FIELD_NUMBER = 2;
    private static final PlayableItemBottomUpSheetTriggerRow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 3;
    public static final int TRIGGER_CAPTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String triggerCaption_ = "";
    private String bottomUpSheetTitle_ = "";
    private h290 rows_ = h.emptyProtobufList();

    static {
        PlayableItemBottomUpSheetTriggerRow playableItemBottomUpSheetTriggerRow = new PlayableItemBottomUpSheetTriggerRow();
        DEFAULT_INSTANCE = playableItemBottomUpSheetTriggerRow;
        h.registerDefaultInstance(PlayableItemBottomUpSheetTriggerRow.class, playableItemBottomUpSheetTriggerRow);
    }

    private PlayableItemBottomUpSheetTriggerRow() {
    }

    public static PlayableItemBottomUpSheetTriggerRow o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b", new Object[]{"bitField0_", "triggerCaption_", "bottomUpSheetTitle_", "rows_", PlayableItemRow.class});
        }
        if (iOrdinal == 3) {
            return new PlayableItemBottomUpSheetTriggerRow();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (PlayableItemBottomUpSheetTriggerRow.class) {
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
        return this.bottomUpSheetTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.rows_;
    }

    public final String q() {
        return this.triggerCaption_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
