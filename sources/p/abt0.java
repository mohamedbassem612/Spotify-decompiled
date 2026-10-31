package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class abt0 implements ebt0 {
    public final String a;

    public abt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abt0) && this.a.equals(((abt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
