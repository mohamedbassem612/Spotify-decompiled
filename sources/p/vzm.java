package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzm implements yzm {
    public final int a;

    public vzm(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yzm yzmVar = (yzm) obj;
        if ((yzmVar instanceof uzm) || (yzmVar instanceof wzm)) {
            return -1;
        }
        if (yzmVar instanceof vzm) {
            return -u890.q(this.a, ((vzm) yzmVar).a);
        }
        if (yzmVar instanceof xzm) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzm) && this.a == ((vzm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
