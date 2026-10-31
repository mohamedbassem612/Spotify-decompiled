package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum gct0 implements v190 {
    PLAN_TYPE_UNSUPPORTED(0),
    PLAN_TYPE_INDIVIDUAL(1),
    PLAN_TYPE_STUDENT(2),
    PLAN_TYPE_DUO(3),
    PLAN_TYPE_FAMILY(4),
    PLAN_TYPE_BASIC(5),
    PLAN_TYPE_MINI(6),
    UNRECOGNIZED(-1);

    public final int a;

    gct0(int i) {
        this.a = i;
    }

    public static gct0 a(int i) {
        switch (i) {
            case 0:
                return PLAN_TYPE_UNSUPPORTED;
            case 1:
                return PLAN_TYPE_INDIVIDUAL;
            case 2:
                return PLAN_TYPE_STUDENT;
            case 3:
                return PLAN_TYPE_DUO;
            case 4:
                return PLAN_TYPE_FAMILY;
            case 5:
                return PLAN_TYPE_BASIC;
            case 6:
                return PLAN_TYPE_MINI;
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
