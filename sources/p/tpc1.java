package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tpc1 implements Comparable {
    public final long a;
    public final byte[] b;

    public tpc1(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((tpc1) obj).a);
    }
}
