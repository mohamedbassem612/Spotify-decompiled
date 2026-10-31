package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum l1k0 implements v190 {
    MIXING_ENABLEMENT_CHANGE_TYPE_UNSPECIFIED(0),
    MIXING_ENABLEMENT_CHANGE_TYPE_ENABLED(1),
    MIXING_ENABLEMENT_CHANGE_TYPE_DISABLED(2),
    UNRECOGNIZED(-1);

    public final int a;

    l1k0(int i) {
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
