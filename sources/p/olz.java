package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum olz implements v190 {
    unknown(0),
    smsCode(1),
    emailCode(2),
    UNRECOGNIZED(-1);

    public final int a;

    olz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
