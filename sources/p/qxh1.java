package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum qxh1 implements v190 {
    UPLOAD_SOURCE_UNSPECIFIED(0),
    UPLOAD_SOURCE_CAMERA(1),
    UPLOAD_SOURCE_LIBRARY(2),
    UNRECOGNIZED(-1);

    public final int a;

    qxh1(int i) {
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
