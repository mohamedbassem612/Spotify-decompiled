package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum r831 implements v190 {
    ITEM_RESULT_UNSPECIFIED(0),
    ITEM_RESULT_SUCCESS(1),
    ITEM_RESULT_NOT_AVAILABLE(2),
    UNRECOGNIZED(-1);

    public final int a;

    r831(int i) {
        this.a = i;
    }

    public static r831 a(int i) {
        if (i == 0) {
            return ITEM_RESULT_UNSPECIFIED;
        }
        if (i == 1) {
            return ITEM_RESULT_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ITEM_RESULT_NOT_AVAILABLE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
