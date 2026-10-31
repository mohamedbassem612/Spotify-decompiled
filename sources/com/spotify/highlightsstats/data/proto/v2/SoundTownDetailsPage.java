package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SoundTownDetailsPage extends h implements v2j0 {
    public static final int CHART_SUBTITLE_FIELD_NUMBER = 2;
    public static final int CHART_TITLE_FIELD_NUMBER = 1;
    private static final SoundTownDetailsPage DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 3;
    private int bitField0_;
    private Paragraph chartSubtitle_;
    private Paragraph chartTitle_;
    private h290 tracks_ = h.emptyProtobufList();

    static {
        SoundTownDetailsPage soundTownDetailsPage = new SoundTownDetailsPage();
        DEFAULT_INSTANCE = soundTownDetailsPage;
        h.registerDefaultInstance(SoundTownDetailsPage.class, soundTownDetailsPage);
    }

    private SoundTownDetailsPage() {
    }

    public static SoundTownDetailsPage p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "chartTitle_", "chartSubtitle_", "tracks_", TopTrack.class});
        }
        if (iOrdinal == 3) {
            return new SoundTownDetailsPage();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (SoundTownDetailsPage.class) {
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

    public final List getTracksList() {
        return this.tracks_;
    }

    public final Paragraph n() {
        Paragraph paragraph = this.chartSubtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph o() {
        Paragraph paragraph = this.chartTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
