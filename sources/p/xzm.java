package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xzm implements yzm {
    public final int a;

    public xzm(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yzm yzmVar = (yzm) obj;
        if ((yzmVar instanceof uzm) || (yzmVar instanceof wzm) || (yzmVar instanceof vzm)) {
            return -1;
        }
        if (yzmVar instanceof xzm) {
            return -u890.q(this.a, ((xzm) yzmVar).a);
        }
        eg.o();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzm) && this.a == ((xzm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
