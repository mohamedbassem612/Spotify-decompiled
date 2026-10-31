package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dqf1 {
    public final String a;

    public dqf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqf1) && u890.j(this.a, ((dqf1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(false) + cy30.f(cy30.f(cy30.f((str == null ? 0 : str.hashCode()) * 31, 0L, 31), 0L, 31), 0L, 31);
    }
}
