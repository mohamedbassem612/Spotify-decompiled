package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y7i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class UserContext extends h implements v2j0 {
    public static final int CURRENTLY_PLAYING_CONTEXT_URI_FIELD_NUMBER = 4;
    public static final int CURRENTLY_PLAYING_URI_FIELD_NUMBER = 1;
    public static final int CURRENT_PAGE_URI_FIELD_NUMBER = 6;
    private static final UserContext DEFAULT_INSTANCE;
    public static final int IS_PLAYBACK_PAUSED_FIELD_NUMBER = 5;
    public static final int LOCAL_TIME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int UTC_OFFSET_IN_MINUTES_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isPlaybackPaused_;
    private int utcOffsetInMinutes_;
    private String currentlyPlayingUri_ = "";
    private String localTime_ = "";
    private String currentlyPlayingContextUri_ = "";
    private String currentPageUri_ = "";

    static {
        UserContext userContext = new UserContext();
        DEFAULT_INSTANCE = userContext;
        h.registerDefaultInstance(UserContext.class, userContext);
    }

    private UserContext() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static UserContext q() {
        return DEFAULT_INSTANCE;
    }

    public static y7i1 y() {
        return (y7i1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        str.getClass();
        this.currentlyPlayingContextUri_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.currentlyPlayingUri_ = str;
    }

    public final void C(boolean z) {
        this.bitField0_ |= 4;
        this.isPlaybackPaused_ = z;
    }

    public final void D(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.localTime_ = str;
    }

    public final void E(int i) {
        this.bitField0_ |= 2;
        this.utcOffsetInMinutes_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003င\u0001\u0004Ȉ\u0005ဇ\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "currentlyPlayingUri_", "localTime_", "utcOffsetInMinutes_", "currentlyPlayingContextUri_", "isPlaybackPaused_", "currentPageUri_"});
        }
        if (iOrdinal == 3) {
            return new UserContext();
        }
        if (iOrdinal == 4) {
            return new y7i1(DEFAULT_INSTANCE);
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
        synchronized (UserContext.class) {
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

    public final String n() {
        return this.currentPageUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.currentlyPlayingContextUri_;
    }

    public final String p() {
        return this.currentlyPlayingUri_;
    }

    public final boolean r() {
        return this.isPlaybackPaused_;
    }

    public final String s() {
        return this.localTime_;
    }

    public final int t() {
        return this.utcOffsetInMinutes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.currentPageUri_ = str;
    }
}
