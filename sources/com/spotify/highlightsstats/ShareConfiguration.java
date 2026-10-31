package com.spotify.highlightsstats;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.ek61;
import p.jf40;
import p.pob;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShareConfiguration extends h implements v2j0 {
    private static final ShareConfiguration DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_DESTINATIONS_FIELD_NUMBER = 1;
    private static final c290 shareDestinations_converter_ = new pob((byte) 24, false);
    private int shareDestinationsMemoizedSerializedSize;
    private b290 shareDestinations_ = h.emptyIntList();

    static {
        ShareConfiguration shareConfiguration = new ShareConfiguration();
        DEFAULT_INSTANCE = shareConfiguration;
        h.registerDefaultInstance(ShareConfiguration.class, shareConfiguration);
    }

    private ShareConfiguration() {
    }

    public static ShareConfiguration n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"shareDestinations_"});
        }
        if (iOrdinal == 3) {
            return new ShareConfiguration();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ShareConfiguration.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final d290 o() {
        return new d290(this.shareDestinations_, shareDestinations_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
