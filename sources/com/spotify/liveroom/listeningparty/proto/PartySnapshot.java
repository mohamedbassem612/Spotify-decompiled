package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.Timestamp;
import p.bf40;
import p.gtq0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PartySnapshot extends com.google.protobuf.h implements v2j0 {
    private static final PartySnapshot DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_FIELD_NUMBER = 4;
    public static final int MEDIA_PLAYBACK_DATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PINNED_MESSAGE_DATA_FIELD_NUMBER = 5;
    public static final int STAGE_USER_DATA_FIELD_NUMBER = 2;
    public static final int USERS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp lastUpdated_;
    private MediaPlaybackData mediaPlaybackData_;
    private PinnedMessageData pinnedMessageData_;
    private StageUserData stageUserData_;
    private h290 users_ = com.google.protobuf.h.emptyProtobufList();

    static {
        PartySnapshot partySnapshot = new PartySnapshot();
        DEFAULT_INSTANCE = partySnapshot;
        com.google.protobuf.h.registerDefaultInstance(PartySnapshot.class, partySnapshot);
    }

    private PartySnapshot() {
    }

    public static PartySnapshot n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "users_", User.class, "stageUserData_", "mediaPlaybackData_", "lastUpdated_", "pinnedMessageData_"});
        }
        if (iOrdinal == 3) {
            return new PartySnapshot();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (PartySnapshot.class) {
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

    public final PinnedMessageData o() {
        PinnedMessageData pinnedMessageData = this.pinnedMessageData_;
        return pinnedMessageData == null ? PinnedMessageData.n() : pinnedMessageData;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
