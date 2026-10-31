package com.spotify.liveroom.listeningparty.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class StageUserData extends com.google.protobuf.h implements v2j0 {
    private static final StageUserData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_TO_SPEAK_QUEUE_FIELD_NUMBER = 2;
    public static final int USERS_ON_STAGE_FIELD_NUMBER = 1;
    private h290 usersOnStage_ = com.google.protobuf.h.emptyProtobufList();
    private h290 requestToSpeakQueue_ = com.google.protobuf.h.emptyProtobufList();

    static {
        StageUserData stageUserData = new StageUserData();
        DEFAULT_INSTANCE = stageUserData;
        com.google.protobuf.h.registerDefaultInstance(StageUserData.class, stageUserData);
    }

    private StageUserData() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"usersOnStage_", StageUser.class, "requestToSpeakQueue_", UserIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new StageUserData();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (StageUserData.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
