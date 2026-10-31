package com.spotify.decipher.agent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.clg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ClientSideEventRequest extends h implements v2j0 {
    private static final ClientSideEventRequest DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PUSH_NOTIFICATION_TAPPED_FIELD_NUMBER = 3;
    public static final int SEARCH_BEGAN_FIELD_NUMBER = 2;
    public static final int SEARCH_PLAYABLE_ITEM_TAPPED_FIELD_NUMBER = 4;
    public static final int SEARCH_RESCUE_PLAYBACK_STARTED_FIELD_NUMBER = 5;
    private int eventCase_ = 0;
    private String eventId_ = "";
    private Object event_;

    static {
        ClientSideEventRequest clientSideEventRequest = new ClientSideEventRequest();
        DEFAULT_INSTANCE = clientSideEventRequest;
        h.registerDefaultInstance(ClientSideEventRequest.class, clientSideEventRequest);
    }

    private ClientSideEventRequest() {
    }

    public static clg n() {
        return (clg) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"event_", "eventCase_", "eventId_", SearchBeganEvent.class, PushNotificationTappedEvent.class, SearchPlayableItemTappedEvent.class, SearchRescuePlaybackStartedEvent.class});
        }
        if (iOrdinal == 3) {
            return new ClientSideEventRequest();
        }
        if (iOrdinal == 4) {
            return new clg(DEFAULT_INSTANCE);
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
        synchronized (ClientSideEventRequest.class) {
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
        this.eventId_ = str;
    }

    public final void p(PushNotificationTappedEvent pushNotificationTappedEvent) {
        pushNotificationTappedEvent.getClass();
        this.event_ = pushNotificationTappedEvent;
        this.eventCase_ = 3;
    }

    public final void q(SearchPlayableItemTappedEvent searchPlayableItemTappedEvent) {
        searchPlayableItemTappedEvent.getClass();
        this.event_ = searchPlayableItemTappedEvent;
        this.eventCase_ = 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
