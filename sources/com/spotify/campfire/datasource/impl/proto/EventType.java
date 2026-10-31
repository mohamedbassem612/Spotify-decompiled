package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum EventType implements v190 {
    EVENT_TYPE_UNSPECIFIED(0),
    EVENT_TYPE_ADD(1),
    EVENT_TYPE_BULK_ADD(2),
    EVENT_TYPE_DELETE(3),
    EVENT_TYPE_MODIFY(4),
    UNRECOGNIZED(-1);

    public static final int EVENT_TYPE_ADD_VALUE = 1;
    public static final int EVENT_TYPE_BULK_ADD_VALUE = 2;
    public static final int EVENT_TYPE_DELETE_VALUE = 3;
    public static final int EVENT_TYPE_MODIFY_VALUE = 4;
    public static final int EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.EventType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public EventType m320findValueByNumber(int i) {
            return EventType.forNumber(i);
        }
    };
    private final int value;

    public static final class EventTypeVerifier implements z190 {
        static final z190 INSTANCE = new EventTypeVerifier();

        private EventTypeVerifier() {
        }

        public boolean isInRange(int i) {
            return EventType.forNumber(i) != null;
        }
    }

    EventType(int i) {
        this.value = i;
    }

    public static EventType forNumber(int i) {
        if (i == 0) {
            return EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return EVENT_TYPE_ADD;
        }
        if (i == 2) {
            return EVENT_TYPE_BULK_ADD;
        }
        if (i == 3) {
            return EVENT_TYPE_DELETE;
        }
        if (i != 4) {
            return null;
        }
        return EVENT_TYPE_MODIFY;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return EventTypeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static EventType valueOf(int i) {
        return forNumber(i);
    }
}
