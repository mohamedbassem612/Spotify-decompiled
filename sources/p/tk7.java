package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tk7 implements uk7 {
    public final Integer a;
    public final Integer b;

    public tk7(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk7)) {
            return false;
        }
        tk7 tk7Var = (tk7) obj;
        return u890.j(this.a, tk7Var.a) && u890.j(this.b, tk7Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
