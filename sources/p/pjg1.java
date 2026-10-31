package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pjg1 implements qjg1 {
    public final String a;

    public pjg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjg1) && u890.j(this.a, ((pjg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
