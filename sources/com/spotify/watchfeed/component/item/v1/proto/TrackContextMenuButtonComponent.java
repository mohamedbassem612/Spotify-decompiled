package com.spotify.watchfeed.component.item.v1.proto;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.Album;
import com.spotify.watchfeed.component.model.v1.proto.Artist;
import com.spotify.watchfeed.component.model.v1.proto.Track;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TrackContextMenuButtonComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTISTS_FIELD_NUMBER = 3;
    private static final TrackContextMenuButtonComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REPORTING_URI_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 1;
    private Album album_;
    private int bitField0_;
    private Track track_;
    private h290 artists_ = h.emptyProtobufList();
    private String reportingUri_ = "";
    private String accessibilityText_ = "";

    static {
        TrackContextMenuButtonComponent trackContextMenuButtonComponent = new TrackContextMenuButtonComponent();
        DEFAULT_INSTANCE = trackContextMenuButtonComponent;
        h.registerDefaultInstance(TrackContextMenuButtonComponent.class, trackContextMenuButtonComponent);
    }

    private TrackContextMenuButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TrackContextMenuButtonComponent r(phc phcVar) {
        return (TrackContextMenuButtonComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "track_", "album_", "artists_", Artist.class, "reportingUri_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new TrackContextMenuButtonComponent();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (TrackContextMenuButtonComponent.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Album o() {
        Album album = this.album_;
        return album == null ? Album.o() : album;
    }

    public final String p() {
        return this.reportingUri_;
    }

    public final Track q() {
        Track track = this.track_;
        return track == null ? Track.n() : track;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
