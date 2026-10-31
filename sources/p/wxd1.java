package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum wxd1 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    TEMPLATE_VERSION_UNSPECIFIED(0),
    TEMPLATE_VERSION_V1(1),
    TEMPLATE_VERSION_V2(2),
    UNRECOGNIZED(-1);

    public final int a;

    wxd1(int i) {
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
