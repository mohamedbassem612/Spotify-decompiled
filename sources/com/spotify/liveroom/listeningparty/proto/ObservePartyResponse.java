package com.spotify.liveroom.listeningparty.proto;

import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ObservePartyResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ARCHIVED_ROOM_FIELD_NUMBER = 6;
    public static final int CLOSED_ROOM_FIELD_NUMBER = 5;
    public static final int CURRENT_USER_FIELD_NUMBER = 2;
    private static final ObservePartyResponse DEFAULT_INSTANCE;
    public static final int HYPE_ROOM_FIELD_NUMBER = 3;
    public static final int LIVE_ROOM_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private CurrentUser currentUser_;
    private Object room_;
    private int roomCase_ = 0;
    private String partyUri_ = "";

    static {
        ObservePartyResponse observePartyResponse = new ObservePartyResponse();
        DEFAULT_INSTANCE = observePartyResponse;
        com.google.protobuf.h.registerDefaultInstance(ObservePartyResponse.class, observePartyResponse);
    }

    private ObservePartyResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"room_", "roomCase_", "bitField0_", "partyUri_", "currentUser_", HypeRoom.class, LiveRoom.class, ClosedRoom.class, ArchivedRoom.class});
        }
        if (iOrdinal == 3) {
            return new ObservePartyResponse();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ObservePartyResponse.class) {
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

    public final ClosedRoom n() {
        return this.roomCase_ == 5 ? (ClosedRoom) this.room_ : ClosedRoom.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HypeRoom o() {
        return this.roomCase_ == 3 ? (HypeRoom) this.room_ : HypeRoom.n();
    }

    public final LiveRoom p() {
        return this.roomCase_ == 4 ? (LiveRoom) this.room_ : LiveRoom.n();
    }

    public final int q() {
        int i = this.roomCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    public final boolean r() {
        return this.roomCase_ == 5;
    }

    public final boolean s() {
        return this.roomCase_ == 3;
    }

    public final boolean t() {
        return this.roomCase_ == 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
