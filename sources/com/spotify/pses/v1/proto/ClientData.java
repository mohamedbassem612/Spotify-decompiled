package com.spotify.pses.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.crq0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uig;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ClientData extends h implements v2j0 {
    public static final int ALREADY_LOGGED_IN_FIELD_NUMBER = 6;
    public static final int APP_PACKAGE_FIELD_NUMBER = 10;
    public static final int DEEP_LINK_FIELD_NUMBER = 5;
    private static final ClientData DEFAULT_INSTANCE;
    public static final int DEVICE_INFORMATION_FIELD_NUMBER = 8;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    public static final int ORIGIN_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 3;
    public static final int SCREEN_FIELD_NUMBER = 7;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private boolean alreadyLoggedIn_;
    private int bitField0_;
    private DeviceInformation deviceInformation_;
    private int origin_;
    private Screen screen_;
    private String spotifyId_ = "";
    private String platform_ = "";
    private String revision_ = "";
    private String language_ = "";
    private String deepLink_ = "";
    private String appPackage_ = "";

    static {
        ClientData clientData = new ClientData();
        DEFAULT_INSTANCE = clientData;
        h.registerDefaultInstance(ClientData.class, clientData);
    }

    private ClientData() {
    }

    public static uig n() {
        return (uig) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0000\bဉ\u0001\t\f\nȈ", new Object[]{"bitField0_", "spotifyId_", "platform_", "revision_", "language_", "deepLink_", "alreadyLoggedIn_", "screen_", "deviceInformation_", "origin_", "appPackage_"});
        }
        if (iOrdinal == 3) {
            return new ClientData();
        }
        if (iOrdinal == 4) {
            return new uig(DEFAULT_INSTANCE);
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
        synchronized (ClientData.class) {
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
        this.appPackage_ = str;
    }

    public final void p(DeviceInformation deviceInformation) {
        this.deviceInformation_ = deviceInformation;
        this.bitField0_ |= 2;
    }

    public final void q(String str) {
        this.language_ = str;
    }

    public final void r(crq0 crq0Var) {
        this.origin_ = crq0Var.getNumber();
    }

    public final void s() {
        this.platform_ = "android";
    }

    public final void setRevision(String str) {
        str.getClass();
        this.revision_ = str;
    }

    public final void t(Screen screen) {
        this.screen_ = screen;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.spotifyId_ = str;
    }
}
