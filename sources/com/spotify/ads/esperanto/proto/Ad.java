package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.bf40;
import p.cq0;
import p.h290;
import p.hi0;
import p.ii0;
import p.j;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class Ad extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int AUDIO_FIELD_NUMBER = 5;
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 8;
    public static final int COMPANIONS_FIELD_NUMBER = 14;
    public static final int COVER_ART_FIELD_NUMBER = 4;
    private static final Ad DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 7;
    public static final int FORMAT_FIELD_NUMBER = 12;
    public static final int IS_DSA_ELIGIBLE_FIELD_NUMBER = 13;
    public static final int IS_DUMMY_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 11;
    public static final int SLOT_FIELD_NUMBER = 10;
    public static final int TRACKING_EVENTS_FIELD_NUMBER = 9;
    public static final int VERIFICATIONS_FIELD_NUMBER = 15;
    public static final int VIDEO_FIELD_NUMBER = 6;
    private String adId_;
    private h290 audio_;
    private String clickthroughUrl_;
    private h290 companions_;
    private h290 coverArt_;
    private h290 display_;
    private int format_;
    private boolean isDsaEligible_;
    private boolean isDummy_;
    private qng0 metadata_;
    private String requestId_;
    private String slot_;
    private qng0 trackingEvents_;
    private h290 verifications_;
    private h290 video_;

    static {
        Ad ad = new Ad();
        DEFAULT_INSTANCE = ad;
        h.registerDefaultInstance(Ad.class, ad);
    }

    private Ad() {
        qng0 qng0Var = qng0.b;
        this.metadata_ = qng0Var;
        this.trackingEvents_ = qng0Var;
        this.adId_ = "";
        this.coverArt_ = h.emptyProtobufList();
        this.audio_ = h.emptyProtobufList();
        this.video_ = h.emptyProtobufList();
        this.display_ = h.emptyProtobufList();
        this.clickthroughUrl_ = "";
        this.slot_ = "";
        this.requestId_ = "";
        this.companions_ = h.emptyProtobufList();
        this.verifications_ = h.emptyProtobufList();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Ad r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0002\u0006\u0000\u0001Ȉ\u00022\u0003\u0007\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\bȈ\t2\nȈ\u000bȈ\f\f\r\u0007\u000e\u001b\u000f\u001b", new Object[]{"adId_", "metadata_", hi0.a, "isDummy_", "coverArt_", AdMedia.class, "audio_", AdMedia.class, "video_", AdMedia.class, "display_", AdMedia.class, "clickthroughUrl_", "trackingEvents_", ii0.a, "slot_", "requestId_", "format_", "isDsaEligible_", "companions_", Companion.class, "verifications_", Verification.class});
        }
        if (iOrdinal == 3) {
            return new Ad();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (Ad.class) {
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

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final List getVideoList() {
        return this.video_;
    }

    public final String n() {
        return this.adId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.clickthroughUrl_;
    }

    public final h290 p() {
        return this.companions_;
    }

    public final h290 q() {
        return this.coverArt_;
    }

    public final h290 s() {
        return this.display_;
    }

    public final cq0 t() {
        cq0 cq0VarA = cq0.a(this.format_);
        return cq0VarA == null ? cq0.UNRECOGNIZED : cq0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.isDsaEligible_;
    }

    public final boolean v() {
        return this.isDummy_;
    }

    public final String w() {
        return this.requestId_;
    }

    public final String x() {
        return this.slot_;
    }
}
