package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ajz0 implements v190 {
    QUIZ_ICON_TYPE_UNSPECIFIED(0),
    QUIZ_ICON_TYPE_INFO(1),
    UNRECOGNIZED(-1);

    public final int a;

    ajz0(int i) {
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
