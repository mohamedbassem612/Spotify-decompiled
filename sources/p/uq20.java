package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface uq20 extends fe5 {
    @Override // p.fe5
    default fui1 a(tzg1 tzg1Var) {
        return new hce1(this);
    }

    float b(float f, float f2, float f3, long j);

    default float c(float f, float f2, float f3) {
        return b(f, f2, f3, d(f, f2, f3));
    }

    long d(float f, float f2, float f3);

    float e(float f, float f2, float f3, long j);
}
