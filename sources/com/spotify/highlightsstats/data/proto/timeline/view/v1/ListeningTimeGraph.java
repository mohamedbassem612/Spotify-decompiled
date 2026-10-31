package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningTimeGraph extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 7;
    public static final int AVERAGE_LISTENING_TIME_FIELD_NUMBER = 2;
    private static final ListeningTimeGraph DEFAULT_INSTANCE;
    public static final int MAX_VALUE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int X_AXIS_LABELS_FIELD_NUMBER = 4;
    private int averageListeningTime_;
    private int bitField0_;
    private int maxValue_;
    private Paragraph title_;
    private h290 points_ = h.emptyProtobufList();
    private h290 xAxisLabels_ = h.emptyProtobufList();
    private String accessibilityDescription_ = "";

    static {
        ListeningTimeGraph listeningTimeGraph = new ListeningTimeGraph();
        DEFAULT_INSTANCE = listeningTimeGraph;
        h.registerDefaultInstance(ListeningTimeGraph.class, listeningTimeGraph);
    }

    private ListeningTimeGraph() {
    }

    public static ListeningTimeGraph p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u001b\u0004Ț\u0006\u0004\u0007Ȉ", new Object[]{"bitField0_", "title_", "averageListeningTime_", "points_", GraphPoint.class, "xAxisLabels_", "maxValue_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new ListeningTimeGraph();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (ListeningTimeGraph.class) {
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
        return this.accessibilityDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.averageListeningTime_;
    }

    public final int q() {
        return this.maxValue_;
    }

    public final h290 r() {
        return this.points_;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final h290 t() {
        return this.xAxisLabels_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
