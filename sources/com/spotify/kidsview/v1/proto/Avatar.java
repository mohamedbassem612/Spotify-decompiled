package com.spotify.kidsview.v1.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum Avatar implements v190 {
    AVATAR_UNKNOWN(0),
    HEADPHONES(1),
    VINYL_PLAYER(2),
    SAXOPHONE(3),
    CASSETTE_RECORDER(4),
    SYNTHESIZER(5),
    GUITAR(6),
    BOOMBOX(7),
    MPC(8),
    MICROPHONE(9),
    DOUBLE_BASS(10),
    OUD(11),
    MODULAR_SYNTHESIS(12),
    BALAFON(13),
    KALIMBA(14),
    TABLA(15),
    UNRECOGNIZED(-1);

    public static final int AVATAR_UNKNOWN_VALUE = 0;
    public static final int BALAFON_VALUE = 13;
    public static final int BOOMBOX_VALUE = 7;
    public static final int CASSETTE_RECORDER_VALUE = 4;
    public static final int DOUBLE_BASS_VALUE = 10;
    public static final int GUITAR_VALUE = 6;
    public static final int HEADPHONES_VALUE = 1;
    public static final int KALIMBA_VALUE = 14;
    public static final int MICROPHONE_VALUE = 9;
    public static final int MODULAR_SYNTHESIS_VALUE = 12;
    public static final int MPC_VALUE = 8;
    public static final int OUD_VALUE = 11;
    public static final int SAXOPHONE_VALUE = 3;
    public static final int SYNTHESIZER_VALUE = 5;
    public static final int TABLA_VALUE = 15;
    public static final int VINYL_PLAYER_VALUE = 2;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.kidsview.v1.proto.Avatar.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public Avatar m55findValueByNumber(int i) {
            return Avatar.forNumber(i);
        }
    };
    private final int value;

    public static final class AvatarVerifier implements z190 {
        static final z190 INSTANCE = new AvatarVerifier();

        private AvatarVerifier() {
        }

        public boolean isInRange(int i) {
            return Avatar.forNumber(i) != null;
        }
    }

    Avatar(int i) {
        this.value = i;
    }

    public static Avatar forNumber(int i) {
        switch (i) {
            case 0:
                return AVATAR_UNKNOWN;
            case 1:
                return HEADPHONES;
            case 2:
                return VINYL_PLAYER;
            case 3:
                return SAXOPHONE;
            case 4:
                return CASSETTE_RECORDER;
            case 5:
                return SYNTHESIZER;
            case 6:
                return GUITAR;
            case 7:
                return BOOMBOX;
            case 8:
                return MPC;
            case 9:
                return MICROPHONE;
            case 10:
                return DOUBLE_BASS;
            case 11:
                return OUD;
            case 12:
                return MODULAR_SYNTHESIS;
            case 13:
                return BALAFON;
            case 14:
                return KALIMBA;
            case 15:
                return TABLA;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return AvatarVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static Avatar valueOf(int i) {
        return forNumber(i);
    }
}
