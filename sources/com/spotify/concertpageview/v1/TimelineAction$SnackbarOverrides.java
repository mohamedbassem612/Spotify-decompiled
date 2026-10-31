package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TimelineAction$SnackbarOverrides extends h implements v2j0 {
    public static final int ACTION_SNACKBAR_FIELD_NUMBER = 1;
    private static final TimelineAction$SnackbarOverrides DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SELECTED_ACTION_SNACKBAR_FIELD_NUMBER = 2;
    private int bitField0_;
    private String actionSnackbar_ = "";
    private String selectedActionSnackbar_ = "";

    static {
        TimelineAction$SnackbarOverrides timelineAction$SnackbarOverrides = new TimelineAction$SnackbarOverrides();
        DEFAULT_INSTANCE = timelineAction$SnackbarOverrides;
        h.registerDefaultInstance(TimelineAction$SnackbarOverrides.class, timelineAction$SnackbarOverrides);
    }

    private TimelineAction$SnackbarOverrides() {
    }

    public static TimelineAction$SnackbarOverrides o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "actionSnackbar_", "selectedActionSnackbar_"});
        }
        if (iOrdinal == 3) {
            return new TimelineAction$SnackbarOverrides();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (TimelineAction$SnackbarOverrides.class) {
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
        return this.actionSnackbar_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.selectedActionSnackbar_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
