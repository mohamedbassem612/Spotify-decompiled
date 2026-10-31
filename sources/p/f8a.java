package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum f8a implements v190 {
    BANNER_TYPE_UNSPECIFIED(0),
    ALL_SUCCESS(1),
    PARTIAL_SUCCESS(2),
    ALL_FAIL(3),
    PARTIAL(4),
    PARTIAL_FAIL(5),
    SUCCESSFUL_FAIL(6),
    SUCCESSFUL_PARTIAL_FAIL(7),
    PARTIAL_24H(8),
    PARTIAL_48H(9),
    PARTIAL_FAIL_24H(10),
    PARTIAL_FAIL_48H(11),
    UNRECOGNIZED(-1);

    public final int a;

    f8a(int i) {
        this.a = i;
    }

    public static f8a a(int i) {
        switch (i) {
            case 0:
                return BANNER_TYPE_UNSPECIFIED;
            case 1:
                return ALL_SUCCESS;
            case 2:
                return PARTIAL_SUCCESS;
            case 3:
                return ALL_FAIL;
            case 4:
                return PARTIAL;
            case 5:
                return PARTIAL_FAIL;
            case 6:
                return SUCCESSFUL_FAIL;
            case 7:
                return SUCCESSFUL_PARTIAL_FAIL;
            case 8:
                return PARTIAL_24H;
            case 9:
                return PARTIAL_48H;
            case 10:
                return PARTIAL_FAIL_24H;
            case 11:
                return PARTIAL_FAIL_48H;
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
