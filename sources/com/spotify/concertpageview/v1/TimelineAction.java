package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fse1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tqe1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class TimelineAction extends h implements v2j0 {
    public static final int BEHAVIOR_FIELD_NUMBER = 1;
    private static final TimelineAction DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 4;
    public static final int ICON_FIELD_NUMBER = 7;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SELECTED_PRESENTATION_FIELD_NUMBER = 8;
    public static final int SNACKBAR_OVERRIDES_FIELD_NUMBER = 9;
    public static final int URI_FIELD_NUMBER = 6;
    private int behavior_;
    private int bitField0_;
    private boolean disabled_;
    private int icon_;
    private PlaceHolderText label_;
    private SelectedPresentation selectedPresentation_;
    private SnackbarOverrides snackbarOverrides_;
    private String uri_ = "";

    static {
        TimelineAction timelineAction = new TimelineAction();
        DEFAULT_INSTANCE = timelineAction;
        h.registerDefaultInstance(TimelineAction.class, timelineAction);
    }

    private TimelineAction() {
    }

    public static TimelineAction o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static a v() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0004\u0007\u0006ለ\u0001\u0007ဌ\u0002\bဉ\u0003\tဉ\u0004", new Object[]{"bitField0_", "behavior_", "label_", "disabled_", "uri_", "icon_", "selectedPresentation_", "snackbarOverrides_"});
        }
        if (iOrdinal == 3) {
            return new TimelineAction();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (TimelineAction.class) {
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

    public final boolean getDisabled() {
        return this.disabled_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 2) != 0;
    }

    public final tqe1 n() {
        tqe1 tqe1Var;
        switch (this.behavior_) {
            case 0:
                tqe1Var = tqe1.BEHAVIOR_UNSPECIFIED;
                break;
            case 1:
                tqe1Var = tqe1.EXTERNAL_PURCHASE;
                break;
            case 2:
                tqe1Var = tqe1.CURATE;
                break;
            case 3:
                tqe1Var = tqe1.CANT_ATTEND;
                break;
            case 4:
                tqe1Var = tqe1.NOT_INTERESTED;
                break;
            case 5:
                tqe1Var = tqe1.SEE_ALL_SHOWS;
                break;
            case 6:
                tqe1Var = tqe1.NAVIGATE;
                break;
            case 7:
                tqe1Var = tqe1.SHARE;
                break;
            default:
                tqe1Var = null;
                break;
        }
        return tqe1Var == null ? tqe1.UNRECOGNIZED : tqe1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final fse1 p() {
        fse1 fse1VarA = fse1.a(this.icon_);
        return fse1VarA == null ? fse1.UNRECOGNIZED : fse1VarA;
    }

    public final PlaceHolderText q() {
        PlaceHolderText placeHolderText = this.label_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final SelectedPresentation r() {
        SelectedPresentation selectedPresentation = this.selectedPresentation_;
        return selectedPresentation == null ? SelectedPresentation.n() : selectedPresentation;
    }

    public final SnackbarOverrides s() {
        SnackbarOverrides snackbarOverrides = this.snackbarOverrides_;
        return snackbarOverrides == null ? SnackbarOverrides.o() : snackbarOverrides;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }

    public final void w() {
        this.behavior_ = tqe1.CANT_ATTEND.getNumber();
    }
}
