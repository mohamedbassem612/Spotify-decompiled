package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qj80 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof qj80) {
            return this.a == ((qj80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
