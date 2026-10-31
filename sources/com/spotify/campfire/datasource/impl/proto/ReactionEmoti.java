package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ReactionEmoti implements v190 {
    REACTION_EMOTI_UNSPECIFIED(0),
    REACTION_EMOTI_THUMBS_UP(1),
    REACTION_EMOTI_HEART(2),
    REACTION_EMOTI_LAUGH(3),
    REACTION_EMOTI_PLEADING_FACE(7),
    REACTION_EMOTI_THUMBS_DOWN(8),
    REACTION_EMOTI_FIRE(9),
    REACTION_EMOTI_HEADPHONE(10),
    UNRECOGNIZED(-1);

    public static final int REACTION_EMOTI_FIRE_VALUE = 9;
    public static final int REACTION_EMOTI_HEADPHONE_VALUE = 10;
    public static final int REACTION_EMOTI_HEART_VALUE = 2;
    public static final int REACTION_EMOTI_LAUGH_VALUE = 3;
    public static final int REACTION_EMOTI_PLEADING_FACE_VALUE = 7;
    public static final int REACTION_EMOTI_THUMBS_DOWN_VALUE = 8;
    public static final int REACTION_EMOTI_THUMBS_UP_VALUE = 1;
    public static final int REACTION_EMOTI_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.ReactionEmoti.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public ReactionEmoti m604findValueByNumber(int i) {
            return ReactionEmoti.forNumber(i);
        }
    };
    private final int value;

    public static final class ReactionEmotiVerifier implements z190 {
        static final z190 INSTANCE = new ReactionEmotiVerifier();

        private ReactionEmotiVerifier() {
        }

        public boolean isInRange(int i) {
            return ReactionEmoti.forNumber(i) != null;
        }
    }

    ReactionEmoti(int i) {
        this.value = i;
    }

    public static ReactionEmoti forNumber(int i) {
        if (i == 0) {
            return REACTION_EMOTI_UNSPECIFIED;
        }
        if (i == 1) {
            return REACTION_EMOTI_THUMBS_UP;
        }
        if (i == 2) {
            return REACTION_EMOTI_HEART;
        }
        if (i == 3) {
            return REACTION_EMOTI_LAUGH;
        }
        switch (i) {
            case 7:
                return REACTION_EMOTI_PLEADING_FACE;
            case 8:
                return REACTION_EMOTI_THUMBS_DOWN;
            case 9:
                return REACTION_EMOTI_FIRE;
            case 10:
                return REACTION_EMOTI_HEADPHONE;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ReactionEmotiVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ReactionEmoti valueOf(int i) {
        return forNumber(i);
    }
}
