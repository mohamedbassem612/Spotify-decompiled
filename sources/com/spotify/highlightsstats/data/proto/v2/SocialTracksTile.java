package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Person;
import com.spotify.highlightsstats.TextWithOverride;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SocialTracksTile extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 7;
    private static final SocialTracksTile DEFAULT_INSTANCE;
    public static final int FALLBACK_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IMAGE_URLS_FIELD_NUMBER = 3;
    public static final int IS_EMPTY_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_CHANGE_FIELD_NUMBER = 6;
    public static final int SOCIAL_USERS_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private TextWithOverride accessibilityDescription_;
    private int bitField0_;
    private boolean isEmpty_;
    private int positionChange_;
    private Paragraph title_;
    private String header_ = "";
    private h290 imageUrls_ = h.emptyProtobufList();
    private String fallbackImageUrl_ = "";
    private h290 socialUsers_ = h.emptyProtobufList();

    static {
        SocialTracksTile socialTracksTile = new SocialTracksTile();
        DEFAULT_INSTANCE = socialTracksTile;
        h.registerDefaultInstance(SocialTracksTile.class, socialTracksTile);
    }

    private SocialTracksTile() {
    }

    public static SocialTracksTile o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ț\u0004Ȉ\u0005\u001b\u0006\u000f\u0007ဉ\u0001\b\u0007", new Object[]{"bitField0_", "header_", "title_", "imageUrls_", "fallbackImageUrl_", "socialUsers_", Person.class, "positionChange_", "accessibilityDescription_", "isEmpty_"});
        }
        if (iOrdinal == 3) {
            return new SocialTracksTile();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (SocialTracksTile.class) {
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

    public final TextWithOverride n() {
        TextWithOverride textWithOverride = this.accessibilityDescription_;
        return textWithOverride == null ? TextWithOverride.o() : textWithOverride;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.fallbackImageUrl_;
    }

    public final String q() {
        return this.header_;
    }

    public final h290 r() {
        return this.imageUrls_;
    }

    public final boolean s() {
        return this.isEmpty_;
    }

    public final int t() {
        return this.positionChange_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.socialUsers_;
    }

    public final Paragraph v() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }
}
