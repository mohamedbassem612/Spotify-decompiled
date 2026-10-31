package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum na6 implements v190 {
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_OPERATION_NONE(0),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_OPERATION_ADD_MEMBER(1),
    ARTISANAL_CAST_GROUP_CONTROL_MUTATION_OPERATION_REMOVE_MEMBER(2),
    UNRECOGNIZED(-1);

    public final int a;

    na6(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
