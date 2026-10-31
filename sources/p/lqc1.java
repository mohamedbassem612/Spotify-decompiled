package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface lqc1 {
    default ipc1 d(int i, byte[] bArr, int i2) {
        v280 v280VarM = b380.m();
        g(bArr, 0, i2, kqc1.c, new ifb1(v280VarM, (byte) 11));
        return new cfo(v280VarM.g());
    }

    void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar);

    int i();

    default void reset() {
    }
}
