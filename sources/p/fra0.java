package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fra0 implements sra0 {
    public final String a;

    public fra0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fra0) && u890.j(this.a, ((fra0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
