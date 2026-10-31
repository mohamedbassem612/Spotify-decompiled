package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uzm implements yzm {
    public final int a;

    public uzm(int i) {
        this.a = i;
    }

    public final int compareTo(Object obj) {
        yzm yzmVar = (yzm) obj;
        if (yzmVar instanceof uzm) {
            return -u890.q(this.a, ((uzm) yzmVar).a);
        }
        if ((yzmVar instanceof wzm) || (yzmVar instanceof vzm) || (yzmVar instanceof xzm)) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzm) && this.a == ((uzm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
