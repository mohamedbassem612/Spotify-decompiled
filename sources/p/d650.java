package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d650 implements h650 {
    public final String a;

    public d650(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d650) && u890.j(this.a, ((d650) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
