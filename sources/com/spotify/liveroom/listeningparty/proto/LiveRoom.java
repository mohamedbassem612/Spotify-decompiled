package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.Timestamp;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LiveRoom extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_TOKEN_FIELD_NUMBER = 2;
    private static final LiveRoom DEFAULT_INSTANCE;
    public static final int LIVE_AT_FIELD_NUMBER = 4;
    public static final int MESSAGE_TOKEN_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_SNAPSHOT_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp liveAt_;
    private PartySnapshot partySnapshot_;
    private String messageToken_ = "";
    private String audioToken_ = "";

    static {
        LiveRoom liveRoom = new LiveRoom();
        DEFAULT_INSTANCE = liveRoom;
        com.google.protobuf.h.registerDefaultInstance(LiveRoom.class, liveRoom);
    }

    private LiveRoom() {
    }

    public static LiveRoom n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "messageToken_", "audioToken_", "partySnapshot_", "liveAt_"});
        }
        if (iOrdinal == 3) {
            return new LiveRoom();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (LiveRoom.class) {
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

    public final Timestamp o() {
        Timestamp timestamp = this.liveAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String p() {
        return this.messageToken_;
    }

    public final PartySnapshot q() {
        PartySnapshot partySnapshot = this.partySnapshot_;
        return partySnapshot == null ? PartySnapshot.n() : partySnapshot;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
