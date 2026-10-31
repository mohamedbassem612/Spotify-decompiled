package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UnshortenUrlResponseData extends h implements v2j0 {
    public static final int ANDROID_DEEPLINK_PATH_FIELD_NUMBER = 20;
    public static final int CANONICAL_URL_FIELD_NUMBER = 22;
    public static final int CREATION_SOURCE_FIELD_NUMBER = 8;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 1;
    public static final int DEEPLINK_PATH_FIELD_NUMBER = 4;
    private static final UnshortenUrlResponseData DEFAULT_INSTANCE;
    public static final int DESKTOP_URL_FIELD_NUMBER = 5;
    public static final int FALLBACK_URL_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 7;
    public static final int LINK_TYPE_FIELD_NUMBER = 21;
    public static final int OG_APP_ID_FIELD_NUMBER = 19;
    public static final int OG_AUDIO_FIELD_NUMBER = 12;
    public static final int OG_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int OG_IMAGE_URL_FIELD_NUMBER = 11;
    public static final int OG_MUSIC_FIELD_NUMBER = 23;
    public static final int OG_TITLE_FIELD_NUMBER = 9;
    public static final int OG_TYPE_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_ID_FIELD_NUMBER = 6;
    public static final int TWITTER_CARD_FIELD_NUMBER = 16;
    public static final int TWITTER_DESCRIPTION_FIELD_NUMBER = 15;
    public static final int TWITTER_SITE_FIELD_NUMBER = 17;
    public static final int TWITTER_TITLE_FIELD_NUMBER = 14;
    public static final int URI_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 18;
    private int bitField0_;
    private int creationSource_;
    private OgMusic ogMusic_;
    private h290 customData_ = h.emptyProtobufList();
    private String uri_ = "";
    private String fallbackUrl_ = "";
    private String deeplinkPath_ = "";
    private String desktopUrl_ = "";
    private String shareId_ = "";
    private String id_ = "";
    private String ogTitle_ = "";
    private String ogDescription_ = "";
    private String ogImageUrl_ = "";
    private String ogAudio_ = "";
    private String ogType_ = "";
    private String twitterTitle_ = "";
    private String twitterDescription_ = "";
    private String twitterCard_ = "";
    private String twitterSite_ = "";
    private String url_ = "";
    private String ogAppId_ = "";
    private String androidDeeplinkPath_ = "";
    private String linkType_ = "";
    private String canonicalUrl_ = "";

    static {
        UnshortenUrlResponseData unshortenUrlResponseData = new UnshortenUrlResponseData();
        DEFAULT_INSTANCE = unshortenUrlResponseData;
        h.registerDefaultInstance(UnshortenUrlResponseData.class, unshortenUrlResponseData);
    }

    private UnshortenUrlResponseData() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static UnshortenUrlResponseData s() {
        return DEFAULT_INSTANCE;
    }

    public final OgMusic A() {
        OgMusic ogMusic = this.ogMusic_;
        return ogMusic == null ? OgMusic.n() : ogMusic;
    }

    public final String B() {
        return this.ogTitle_;
    }

    public final String C() {
        return this.ogType_;
    }

    public final String D() {
        return this.twitterCard_;
    }

    public final String E() {
        return this.twitterDescription_;
    }

    public final String F() {
        return this.twitterSite_;
    }

    public final String G() {
        return this.twitterTitle_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017ဉ\u0000", new Object[]{"bitField0_", "customData_", CustomData.class, "uri_", "fallbackUrl_", "deeplinkPath_", "desktopUrl_", "shareId_", "id_", "creationSource_", "ogTitle_", "ogDescription_", "ogImageUrl_", "ogAudio_", "ogType_", "twitterTitle_", "twitterDescription_", "twitterCard_", "twitterSite_", "url_", "ogAppId_", "androidDeeplinkPath_", "linkType_", "canonicalUrl_", "ogMusic_"});
        }
        if (iOrdinal == 3) {
            return new UnshortenUrlResponseData();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (UnshortenUrlResponseData.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getShareId() {
        return this.shareId_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final String n() {
        return this.androidDeeplinkPath_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.canonicalUrl_;
    }

    public final int p() {
        return this.creationSource_;
    }

    public final h290 q() {
        return this.customData_;
    }

    public final String r() {
        return this.deeplinkPath_;
    }

    public final String t() {
        return this.desktopUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.fallbackUrl_;
    }

    public final String v() {
        return this.linkType_;
    }

    public final String w() {
        return this.ogAppId_;
    }

    public final String x() {
        return this.ogAudio_;
    }

    public final String y() {
        return this.ogDescription_;
    }

    public final String z() {
        return this.ogImageUrl_;
    }
}
