package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class auc {
    public final Integer a;

    public auc(Integer num) {
        this.a = num;
    }

    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof auc) && u890.j(this.a, ((auc) obj).a);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(5) * 31;
        Integer num = this.a;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
