package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import com.spotify.casita.v1.resolved.dj.DjVisualMetadata;
import p.bf40;
import p.eku;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class DjCallToAction extends h implements v2j0 {
    public static final int ANIMATION_URL_FIELD_NUMBER = 7;
    private static final DjCallToAction DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRANSCRIPT_FIELD_NUMBER = 5;
    public static final int TRANSCRIPT_KEY_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VISUAL_METADATA_FIELD_NUMBER = 4;
    private int bitField0_;
    private Heading heading_;
    private DjVisualMetadata visualMetadata_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String transcript_ = "";
    private String animationUrl_ = "";
    private String transcriptKey_ = "";

    static {
        DjCallToAction djCallToAction = new DjCallToAction();
        DEFAULT_INSTANCE = djCallToAction;
        h.registerDefaultInstance(DjCallToAction.class, djCallToAction);
    }

    private DjCallToAction() {
    }

    public static DjCallToAction o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007Ȉ\bȈ", new Object[]{"bitField0_", "uri_", "title_", "subtitle_", "visualMetadata_", "transcript_", "heading_", "animationUrl_", "transcriptKey_"});
        }
        if (iOrdinal == 3) {
            return new DjCallToAction();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (DjCallToAction.class) {
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
        return this.animationUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.o() : heading;
    }

    public final String q() {
        return this.transcript_;
    }

    public final String r() {
        return this.transcriptKey_;
    }

    public final DjVisualMetadata s() {
        DjVisualMetadata djVisualMetadata = this.visualMetadata_;
        return djVisualMetadata == null ? DjVisualMetadata.p() : djVisualMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
