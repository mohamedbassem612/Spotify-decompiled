package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aaj0 {
    public final String a;

    public aaj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aaj0) && u890.j(this.a, ((aaj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
