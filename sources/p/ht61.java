package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ht61 implements jt61 {
    public final Integer a;

    public ht61(Integer num, int i) {
        this.a = num;
    }

    @Override // p.jt61
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht61) && u890.j(this.a, ((ht61) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) * 31;
    }
}
