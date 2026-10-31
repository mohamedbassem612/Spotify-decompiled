package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AppVersionNotSupported extends h implements v2j0 {
    private static final AppVersionNotSupported DEFAULT_INSTANCE;
    public static final int MIN_VERSION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_CTA_FIELD_NUMBER = 4;
    public static final int SECONDARY_CTA_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String minVersion_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String primaryCta_ = "";
    private String secondaryCta_ = "";

    static {
        AppVersionNotSupported appVersionNotSupported = new AppVersionNotSupported();
        DEFAULT_INSTANCE = appVersionNotSupported;
        h.registerDefaultInstance(AppVersionNotSupported.class, appVersionNotSupported);
    }

    private AppVersionNotSupported() {
    }

    public static AppVersionNotSupported n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"minVersion_", "title_", "subtitle_", "primaryCta_", "secondaryCta_"});
        }
        if (iOrdinal == 3) {
            return new AppVersionNotSupported();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (AppVersionNotSupported.class) {
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

    public final String getMinVersion() {
        return this.minVersion_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.primaryCta_;
    }

    public final String p() {
        return this.secondaryCta_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
