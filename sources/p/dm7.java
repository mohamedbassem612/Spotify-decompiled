package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum dm7 implements v190 {
    KIND_UNSPECIFIED(0),
    KIND_NAME(3),
    KIND_DESCRIPTION(4),
    KIND_PICTURE_FILE_ID(20),
    KIND_PICTURE_SIZES(21),
    KIND_SAVE_SOURCE(28),
    UNRECOGNIZED(-1);

    public final int a;

    dm7(int i2) {
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
