package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cqz0 extends dqz0 implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return bqz0.a;
    }

    @Override // p.dqz0
    public final double b() {
        return dqz0.b.b();
    }

    @Override // p.dqz0
    public final double c(double d) {
        throw null;
    }

    @Override // p.dqz0
    public final double d(double d, double d2) {
        return dqz0.b.d(0.0d, d2);
    }

    @Override // p.dqz0
    public final float e() {
        return dqz0.b.e();
    }

    @Override // p.dqz0
    public final int g(int i) {
        return dqz0.b.g(i);
    }

    @Override // p.dqz0
    public final int h(int i, int i2) {
        return dqz0.b.h(i, i2);
    }

    @Override // p.dqz0
    public final long i() {
        return dqz0.b.i();
    }

    @Override // p.dqz0
    public final long j(long j) {
        throw null;
    }

    @Override // p.dqz0
    public final long k(long j, long j2) {
        return dqz0.b.k(j, j2);
    }
}
