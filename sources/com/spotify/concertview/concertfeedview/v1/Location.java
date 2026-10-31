package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.khe0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Location extends h implements v2j0 {
    private static final Location DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESOLUTION_METHOD_FIELD_NUMBER = 2;
    private String displayName_ = "";
    private int resolutionMethod_;

    static {
        Location location = new Location();
        DEFAULT_INSTANCE = location;
        h.registerDefaultInstance(Location.class, location);
    }

    private Location() {
    }

    public static Location n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"displayName_", "resolutionMethod_"});
        }
        if (iOrdinal == 3) {
            return new Location();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Location.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final khe0 o() {
        khe0 khe0Var;
        int i = this.resolutionMethod_;
        if (i == 0) {
            khe0Var = khe0.b;
        } else if (i == 1) {
            khe0Var = khe0.c;
        } else if (i != 2) {
            khe0Var = i != 3 ? null : khe0.e;
        } else {
            khe0Var = khe0.d;
        }
        return khe0Var == null ? khe0.f : khe0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
