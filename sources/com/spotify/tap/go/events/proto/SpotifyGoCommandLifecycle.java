package com.spotify.tap.go.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c4b1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SpotifyGoCommandLifecycle extends h implements v2j0 {
    public static final int ACCESSORY_NAME_FIELD_NUMBER = 5;
    public static final int BRAND_FIELD_NUMBER = 3;
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    public static final int COMMAND_ID_FIELD_NUMBER = 1;
    public static final int CONNECT_SYNCED_FIELD_NUMBER = 9;
    private static final SpotifyGoCommandLifecycle DEFAULT_INSTANCE;
    public static final int ERROR_REASON_FIELD_NUMBER = 7;
    public static final int INTERACTION_ID_FIELD_NUMBER = 8;
    public static final int MODEL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int STAGE_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean connectSynced_;
    private String commandId_ = "";
    private String clientId_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String accessoryName_ = "";
    private String stage_ = "";
    private String errorReason_ = "";
    private String interactionId_ = "";

    static {
        SpotifyGoCommandLifecycle spotifyGoCommandLifecycle = new SpotifyGoCommandLifecycle();
        DEFAULT_INSTANCE = spotifyGoCommandLifecycle;
        h.registerDefaultInstance(SpotifyGoCommandLifecycle.class, spotifyGoCommandLifecycle);
    }

    private SpotifyGoCommandLifecycle() {
    }

    public static c4b1 n() {
        return (c4b1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b", new Object[]{"bitField0_", "commandId_", "clientId_", "brand_", "model_", "accessoryName_", "stage_", "errorReason_", "interactionId_", "connectSynced_"});
        }
        if (iOrdinal == 3) {
            return new SpotifyGoCommandLifecycle();
        }
        if (iOrdinal == 4) {
            return new c4b1(DEFAULT_INSTANCE);
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
        synchronized (SpotifyGoCommandLifecycle.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.accessoryName_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.brand_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.clientId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.commandId_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 256;
        this.connectSynced_ = z;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.errorReason_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.interactionId_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.model_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 32;
        this.stage_ = str;
    }
}
