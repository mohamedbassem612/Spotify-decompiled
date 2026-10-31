package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wzm implements yzm {
    public final int a;

    public wzm(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yzm yzmVar = (yzm) obj;
        if (yzmVar instanceof uzm) {
            return -1;
        }
        if (yzmVar instanceof wzm) {
            return -u890.q(this.a, ((wzm) yzmVar).a);
        }
        if ((yzmVar instanceof vzm) || (yzmVar instanceof xzm)) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzm) && this.a == ((wzm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
