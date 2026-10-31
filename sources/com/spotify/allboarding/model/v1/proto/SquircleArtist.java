package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SquircleArtist extends h implements v2j0 {
    private static final SquircleArtist DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER = 8;
    public static final int IMAGE_URL_FIELD_NUMBER = 6;
    public static final int LOGGING_FIELD_NUMBER = 7;
    public static final int MORE_URL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RELATED_ITEMS_FIELD_NUMBER = 4;
    public static final int SELECTED_FIELD_NUMBER = 3;
    public static final int SHOULD_FOLLOW_UPON_SELECTION_FIELD_NUMBER = 10;
    public static final int TAG_URIS_FIELD_NUMBER = 9;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int expansionLimit_;
    private NullableString imageUrl_;
    private Logging logging_;
    private NullableString moreUrl_;
    private boolean selected_;
    private boolean shouldFollowUponSelection_;
    private String uri_ = "";
    private String text_ = "";
    private h290 relatedItems_ = h.emptyProtobufList();
    private h290 tagUris_ = h.emptyProtobufList();

    static {
        SquircleArtist squircleArtist = new SquircleArtist();
        DEFAULT_INSTANCE = squircleArtist;
        h.registerDefaultInstance(SquircleArtist.class, squircleArtist);
    }

    private SquircleArtist() {
    }

    public static SquircleArtist n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\b\u0004\tȚ\n\u0007", new Object[]{"bitField0_", "uri_", "text_", "selected_", "relatedItems_", SquircleArtist.class, "moreUrl_", "imageUrl_", "logging_", "expansionLimit_", "tagUris_", "shouldFollowUponSelection_"});
        }
        if (iOrdinal == 3) {
            return new SquircleArtist();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (SquircleArtist.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.expansionLimit_;
    }

    public final NullableString p() {
        NullableString nullableString = this.imageUrl_;
        return nullableString == null ? NullableString.n() : nullableString;
    }

    public final NullableString q() {
        NullableString nullableString = this.moreUrl_;
        return nullableString == null ? NullableString.n() : nullableString;
    }

    public final h290 r() {
        return this.relatedItems_;
    }

    public final boolean s() {
        return this.selected_;
    }

    public final boolean t() {
        return this.shouldFollowUponSelection_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.tagUris_;
    }

    public final String v() {
        return this.text_;
    }
}
