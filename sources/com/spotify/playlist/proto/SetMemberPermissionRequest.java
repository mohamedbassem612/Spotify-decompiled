package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjj0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tk61;
import p.v2j0;
import p.vls0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class SetMemberPermissionRequest extends h implements v2j0 {
    private static final SetMemberPermissionRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 3;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 4;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private int permissionLevel_;
    private int timeoutMs_;
    private String playlistUri_ = "";
    private String username_ = "";

    static {
        SetMemberPermissionRequest setMemberPermissionRequest = new SetMemberPermissionRequest();
        DEFAULT_INSTANCE = setMemberPermissionRequest;
        h.registerDefaultInstance(SetMemberPermissionRequest.class, setMemberPermissionRequest);
    }

    private SetMemberPermissionRequest() {
    }

    public static tk61 n() {
        return (tk61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "playlistUri_", "username_", "permissionLevel_", cjj0.l, "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new SetMemberPermissionRequest();
        }
        if (iOrdinal == 4) {
            return new tk61(DEFAULT_INSTANCE);
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
        synchronized (SetMemberPermissionRequest.class) {
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

    public final void o(vls0 vls0Var) {
        this.permissionLevel_ = vls0Var.a;
        this.bitField0_ |= 4;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.playlistUri_ = str;
    }

    public final void q(int i) {
        this.bitField0_ |= 8;
        this.timeoutMs_ = i;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.username_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
