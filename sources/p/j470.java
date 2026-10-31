package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum j470 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    HUB_VIEW_UNSPECIFIED(0),
    HUB_VIEW_BANNED(1),
    HUB_VIEW_ALLOWED(2),
    UNRECOGNIZED(-1);

    public final int a;

    j470(int i) {
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
