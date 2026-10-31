package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.fog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class MapLink extends h implements v2j0 {
    private static final MapLink DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private int provider_;
    private String url_ = "";

    static {
        MapLink mapLink = new MapLink();
        DEFAULT_INSTANCE = mapLink;
        h.registerDefaultInstance(MapLink.class, mapLink);
    }

    private MapLink() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"provider_", "url_"});
        }
        if (iOrdinal == 3) {
            return new MapLink();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (MapLink.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final fog0 n() {
        fog0 fog0Var;
        int i = this.provider_;
        if (i == 0) {
            fog0Var = fog0.MAPS_PROVIDER_UNSPECIFIED;
        } else if (i != 1) {
            fog0Var = i != 2 ? null : fog0.MAPS_PROVIDER_APPLE;
        } else {
            fog0Var = fog0.MAPS_PROVIDER_GOOGLE;
        }
        return fog0Var == null ? fog0.UNRECOGNIZED : fog0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
