package com.spotify.wear.wearabledatalayer.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jhl1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WearOSPairedDevice extends h implements v2j0 {
    private static final WearOSPairedDevice DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTIFY_WEAR_APP_INSTALLED_FIELD_NUMBER = 2;
    public static final int SPOTIFY_WEAR_APP_LOGGED_IN_FIELD_NUMBER = 4;
    public static final int WEARABLE_ID_FIELD_NUMBER = 1;
    public static final int WEARABLE_IS_NEARBY_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean spotifyWearAppInstalled_;
    private boolean spotifyWearAppLoggedIn_;
    private String wearableId_ = "";
    private boolean wearableIsNearby_;

    static {
        WearOSPairedDevice wearOSPairedDevice = new WearOSPairedDevice();
        DEFAULT_INSTANCE = wearOSPairedDevice;
        h.registerDefaultInstance(WearOSPairedDevice.class, wearOSPairedDevice);
    }

    private WearOSPairedDevice() {
    }

    public static jhl1 n() {
        return (jhl1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "wearableId_", "spotifyWearAppInstalled_", "wearableIsNearby_", "spotifyWearAppLoggedIn_"});
        }
        if (iOrdinal == 3) {
            return new WearOSPairedDevice();
        }
        if (iOrdinal == 4) {
            return new jhl1(DEFAULT_INSTANCE);
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
        synchronized (WearOSPairedDevice.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 2;
        this.spotifyWearAppInstalled_ = z;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 8;
        this.spotifyWearAppLoggedIn_ = z;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.wearableId_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 4;
        this.wearableIsNearby_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
