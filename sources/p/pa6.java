package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum pa6 implements v190 {
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_IDLE(0),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_PENDING(1),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_ACCEPTED(2),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_MIGRATING(3),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_COMPLETED(4),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_STATUS_FAILED(5),
    UNRECOGNIZED(-1);

    public final int a;

    pa6(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
