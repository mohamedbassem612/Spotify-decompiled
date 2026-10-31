package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ma6 implements v190 {
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NONE(0),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_DISABLED(1),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NO_ACTIVE_SESSION(2),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_BUSY(3),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_TARGET_NOT_FOUND(4),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_OPERATION_NOT_ALLOWED(5),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_TIMEOUT(6),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_RECEIVER_REJECTED(7),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_MIGRATION_FAILED(8),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_INTERNAL(9),
    UNRECOGNIZED(-1);

    public final int a;

    ma6(int i) {
        this.a = i;
    }

    public static ma6 a(int i) {
        switch (i) {
            case 0:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NONE;
            case 1:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_DISABLED;
            case 2:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NO_ACTIVE_SESSION;
            case 3:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_BUSY;
            case 4:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_TARGET_NOT_FOUND;
            case 5:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_OPERATION_NOT_ALLOWED;
            case 6:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_TIMEOUT;
            case 7:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_RECEIVER_REJECTED;
            case 8:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_MIGRATION_FAILED;
            case 9:
                return ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_INTERNAL;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
