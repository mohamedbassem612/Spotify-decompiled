package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fse1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TimelineAction$SelectedPresentation extends h implements v2j0 {
    private static final TimelineAction$SelectedPresentation DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int icon_;
    private PlaceHolderText label_;

    static {
        TimelineAction$SelectedPresentation timelineAction$SelectedPresentation = new TimelineAction$SelectedPresentation();
        DEFAULT_INSTANCE = timelineAction$SelectedPresentation;
        h.registerDefaultInstance(TimelineAction$SelectedPresentation.class, timelineAction$SelectedPresentation);
    }

    private TimelineAction$SelectedPresentation() {
    }

    public static TimelineAction$SelectedPresentation n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "label_", "icon_"});
        }
        if (iOrdinal == 3) {
            return new TimelineAction$SelectedPresentation();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (TimelineAction$SelectedPresentation.class) {
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

    public final fse1 o() {
        fse1 fse1VarA = fse1.a(this.icon_);
        return fse1VarA == null ? fse1.X : fse1VarA;
    }

    public final PlaceHolderText p() {
        PlaceHolderText placeHolderText = this.label_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
