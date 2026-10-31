package com.spotify.dj.interactionmanager.v0;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum Model implements v190 {
    MODEL_UNSPECIFIED(0),
    GPT_4O(1),
    GPT_41(2),
    GPT_4O_MINI(3),
    O4_MINI(4),
    GPT_41_MINI(5),
    GPT_41_NANO(6),
    GPT_5(7),
    GPT_5_MINI(8),
    GPT_5_NANO(9),
    GPT_35_TURBO(10),
    PRISM_V2_8B(11),
    PRISM_V2_8B_QUANTIZED(12),
    PRISM_V3_1B(13),
    UNRECOGNIZED(-1);

    public static final int GPT_35_TURBO_VALUE = 10;
    public static final int GPT_41_MINI_VALUE = 5;
    public static final int GPT_41_NANO_VALUE = 6;
    public static final int GPT_41_VALUE = 2;
    public static final int GPT_4O_MINI_VALUE = 3;
    public static final int GPT_4O_VALUE = 1;
    public static final int GPT_5_MINI_VALUE = 8;
    public static final int GPT_5_NANO_VALUE = 9;
    public static final int GPT_5_VALUE = 7;
    public static final int MODEL_UNSPECIFIED_VALUE = 0;
    public static final int O4_MINI_VALUE = 4;
    public static final int PRISM_V2_8B_QUANTIZED_VALUE = 12;
    public static final int PRISM_V2_8B_VALUE = 11;
    public static final int PRISM_V3_1B_VALUE = 13;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class ModelVerifier implements z190 {
        static final z190 INSTANCE = new ModelVerifier();

        private ModelVerifier() {
        }

        public final boolean isInRange(int i) {
            return Model.forNumber(i) != null;
        }
    }

    Model(int i) {
        this.value = i;
    }

    public static Model forNumber(int i) {
        switch (i) {
            case 0:
                return MODEL_UNSPECIFIED;
            case 1:
                return GPT_4O;
            case 2:
                return GPT_41;
            case 3:
                return GPT_4O_MINI;
            case 4:
                return O4_MINI;
            case 5:
                return GPT_41_MINI;
            case 6:
                return GPT_41_NANO;
            case 7:
                return GPT_5;
            case 8:
                return GPT_5_MINI;
            case 9:
                return GPT_5_NANO;
            case 10:
                return GPT_35_TURBO;
            case 11:
                return PRISM_V2_8B;
            case 12:
                return PRISM_V2_8B_QUANTIZED;
            case 13:
                return PRISM_V3_1B;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ModelVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.Model$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final Model findValueByNumber(int i) {
            return Model.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m60findValueByNumber(int i) {
            return Model.forNumber(i);
        }
    }

    @Deprecated
    public static Model valueOf(int i) {
        return forNumber(i);
    }
}
