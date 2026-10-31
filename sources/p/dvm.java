package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum dvm implements v190 {
    CONTRIBUTION_SOURCE_UNSPECIFIED(0),
    CONTRIBUTION_SOURCE_USER(1),
    CONTRIBUTION_SOURCE_EDITORIAL(2),
    UNRECOGNIZED(-1);

    public final int a;

    dvm(int i) {
        this.a = i;
    }

    public static dvm a(int i) {
        if (i == 0) {
            return CONTRIBUTION_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return CONTRIBUTION_SOURCE_USER;
        }
        if (i != 2) {
            return null;
        }
        return CONTRIBUTION_SOURCE_EDITORIAL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
