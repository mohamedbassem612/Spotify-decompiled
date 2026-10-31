package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sk;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AccountControls extends h implements v2j0 {
    public static final int ALLOW_ACTIVITY_ON_PROFILE_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    public static final int ALLOW_LISTENING_ACTIVITY_FIELD_NUMBER = 7;
    public static final int ALLOW_MESSAGES_FIELD_NUMBER = 6;
    public static final int ALLOW_PLAYLISTS_PUBLIC_BY_DEFAULT_FIELD_NUMBER = 4;
    public static final int ALLOW_VIDEO_AND_CANVAS_FIELD_NUMBER = 2;
    private static final AccountControls DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_CONTROLS_FIELD_NUMBER = 3;
    private boolean allowActivityOnProfile_;
    private boolean allowExplicitContent_;
    private boolean allowListeningActivity_;
    private boolean allowMessages_;
    private boolean allowPlaylistsPublicByDefault_;
    private int bitField0_;
    private int videoSettingCase_ = 0;
    private Object videoSetting_;

    static {
        AccountControls accountControls = new AccountControls();
        DEFAULT_INSTANCE = accountControls;
        h.registerDefaultInstance(AccountControls.class, accountControls);
    }

    private AccountControls() {
    }

    public static sk A() {
        return (sk) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AccountControls s() {
        return DEFAULT_INSTANCE;
    }

    public final void B(boolean z) {
        this.bitField0_ |= 4;
        this.allowActivityOnProfile_ = z;
    }

    public final void C(boolean z) {
        this.bitField0_ |= 1;
        this.allowExplicitContent_ = z;
    }

    public final void D(boolean z) {
        this.bitField0_ |= 16;
        this.allowListeningActivity_ = z;
    }

    public final void E(boolean z) {
        this.bitField0_ |= 8;
        this.allowMessages_ = z;
    }

    public final void F(boolean z) {
        this.bitField0_ |= 2;
        this.allowPlaylistsPublicByDefault_ = z;
    }

    public final void G(boolean z) {
        this.videoSettingCase_ = 2;
        this.videoSetting_ = Boolean.valueOf(z);
    }

    public final void H(VideoControls videoControls) {
        this.videoSetting_ = videoControls;
        this.videoSettingCase_ = 3;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002:\u0000\u0003<\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"videoSetting_", "videoSettingCase_", "bitField0_", "allowExplicitContent_", VideoControls.class, "allowPlaylistsPublicByDefault_", "allowActivityOnProfile_", "allowMessages_", "allowListeningActivity_"});
        }
        if (iOrdinal == 3) {
            return new AccountControls();
        }
        if (iOrdinal == 4) {
            return new sk(DEFAULT_INSTANCE);
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
        synchronized (AccountControls.class) {
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

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasAllowExplicitContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean n() {
        return this.allowActivityOnProfile_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.allowListeningActivity_;
    }

    public final boolean p() {
        return this.allowMessages_;
    }

    public final boolean q() {
        return this.allowPlaylistsPublicByDefault_;
    }

    public final boolean r() {
        if (this.videoSettingCase_ == 2) {
            return ((Boolean) this.videoSetting_).booleanValue();
        }
        return false;
    }

    public final VideoControls t() {
        return this.videoSettingCase_ == 3 ? (VideoControls) this.videoSetting_ : VideoControls.q();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean y() {
        return this.videoSettingCase_ == 2;
    }

    public final boolean z() {
        return this.videoSettingCase_ == 3;
    }
}
