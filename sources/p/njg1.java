package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class njg1 implements qjg1 {
    public final String a;

    public njg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njg1) && u890.j(this.a, ((njg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
