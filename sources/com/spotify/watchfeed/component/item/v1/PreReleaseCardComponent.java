package com.spotify.watchfeed.component.item.v1;

import com.google.protobuf.Timestamp;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PreReleaseCardComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 8;
    public static final int ALBUM_IMAGE_FIELD_NUMBER = 5;
    public static final int ARTIST_IMAGE_FIELD_NUMBER = 6;
    public static final int COUNTDOWN_TIMESTAMP_FIELD_NUMBER = 7;
    private static final PreReleaseCardComponent DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private Image albumImage_;
    private Image artistImage_;
    private int bitField0_;
    private Timestamp countdownTimestamp_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String description_ = "";
    private String accessibilityText_ = "";
    private String reason_ = "";

    static {
        PreReleaseCardComponent preReleaseCardComponent = new PreReleaseCardComponent();
        DEFAULT_INSTANCE = preReleaseCardComponent;
        com.google.protobuf.h.registerDefaultInstance(PreReleaseCardComponent.class, preReleaseCardComponent);
    }

    private PreReleaseCardComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PreReleaseCardComponent s(phc phcVar) {
        return (PreReleaseCardComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bȈ\u000bȈ", new Object[]{"bitField0_", "uri_", "title_", "subtitle_", "description_", "albumImage_", "artistImage_", "countdownTimestamp_", "accessibilityText_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PreReleaseCardComponent();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (PreReleaseCardComponent.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Image o() {
        Image image = this.albumImage_;
        return image == null ? Image.n() : image;
    }

    public final Image p() {
        Image image = this.artistImage_;
        return image == null ? Image.n() : image;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.countdownTimestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String r() {
        return this.reason_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
