package com.spotify.watchfeed.component.layout.v1;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.HeaderOverrides;
import com.spotify.watchfeed.component.model.v1.proto.SharedAudio;
import com.spotify.watchfeed.component.model.v1.proto.StylingOverrides;
import p.bf40;
import p.h290;
import p.jf40;
import p.lub1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class StorytellingDefaultLayout extends h implements v2j0 {
    public static final int BOTTOM_COMPONENTS_FIELD_NUMBER = 4;
    public static final int CENTER_COMPONENTS_FIELD_NUMBER = 3;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final StorytellingDefaultLayout DEFAULT_INSTANCE;
    public static final int HEADER_COLOR_OVERRIDE_FIELD_NUMBER = 7;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 10;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 9;
    public static final int HIDE_HEADER_FIELD_NUMBER = 6;
    public static final int ITEM_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SHARED_AUDIO_FIELD_NUMBER = 12;
    public static final int STYLING_OVERRIDES_FIELD_NUMBER = 11;
    public static final int TOP_COMPONENTS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 8;
    private int bitField0_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private SharedAudio sharedAudio_;
    private StylingOverrides stylingOverrides_;
    private h290 topComponents_ = h.emptyProtobufList();
    private h290 centerComponents_ = h.emptyProtobufList();
    private h290 bottomComponents_ = h.emptyProtobufList();
    private String itemId_ = "";
    private String headerColorOverride_ = "";
    private String uri_ = "";
    private String headerTitleOverride_ = "";

    static {
        StorytellingDefaultLayout storytellingDefaultLayout = new StorytellingDefaultLayout();
        DEFAULT_INSTANCE = storytellingDefaultLayout;
        h.registerDefaultInstance(StorytellingDefaultLayout.class, storytellingDefaultLayout);
    }

    private StorytellingDefaultLayout() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static StorytellingDefaultLayout y(phc phcVar) {
        return (StorytellingDefaultLayout) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\tȈ\nဉ\u0001\u000bဉ\u0002\fဉ\u0003", new Object[]{"bitField0_", "content_", "topComponents_", Any.class, "centerComponents_", Any.class, "bottomComponents_", Any.class, "itemId_", "hideHeader_", "headerColorOverride_", "uri_", "headerTitleOverride_", "headerOverrides_", "stylingOverrides_", "sharedAudio_"});
        }
        if (iOrdinal == 3) {
            return new StorytellingDefaultLayout();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (StorytellingDefaultLayout.class) {
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

    public final h290 n() {
        return this.bottomComponents_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.centerComponents_;
    }

    public final Any p() {
        Any any = this.content_;
        return any == null ? Any.o() : any;
    }

    public final HeaderOverrides q() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.o() : headerOverrides;
    }

    public final String r() {
        return this.itemId_;
    }

    public final SharedAudio s() {
        SharedAudio sharedAudio = this.sharedAudio_;
        return sharedAudio == null ? SharedAudio.o() : sharedAudio;
    }

    public final StylingOverrides t() {
        StylingOverrides stylingOverrides = this.stylingOverrides_;
        return stylingOverrides == null ? StylingOverrides.n() : stylingOverrides;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.topComponents_;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 4) != 0;
    }
}
