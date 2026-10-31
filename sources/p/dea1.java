package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dea1 {
    public final String a;

    public dea1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dea1) && u890.j(this.a, ((dea1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
