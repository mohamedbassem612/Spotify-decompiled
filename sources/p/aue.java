package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aue {
    public final String a;

    public aue(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aue) && u890.j(this.a, ((aue) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
