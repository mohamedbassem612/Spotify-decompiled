package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Artist;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class TopArtist extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 3;
    private static final TopArtist DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_CHANGE_LABEL_FIELD_NUMBER = 2;
    public static final int TIME_AT_TOP_FIELD_NUMBER = 5;
    public static final int TIME_LISTENED_FIELD_NUMBER = 4;
    private String accessibilityDescription_ = "";
    private Artist artist_;
    private int bitField0_;
    private PositionChangeLabel positionChangeLabel_;
    private Paragraph timeAtTop_;
    private Paragraph timeListened_;

    static {
        TopArtist topArtist = new TopArtist();
        DEFAULT_INSTANCE = topArtist;
        h.registerDefaultInstance(TopArtist.class, topArtist);
    }

    private TopArtist() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "positionChangeLabel_", "artist_", "timeListened_", "timeAtTop_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new TopArtist();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (TopArtist.class) {
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

    public final Artist o() {
        Artist artist = this.artist_;
        return artist == null ? Artist.o() : artist;
    }

    public final PositionChangeLabel p() {
        PositionChangeLabel positionChangeLabel = this.positionChangeLabel_;
        return positionChangeLabel == null ? PositionChangeLabel.o() : positionChangeLabel;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.timeAtTop_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
