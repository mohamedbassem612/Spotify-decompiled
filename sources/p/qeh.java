package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qeh {
    public final String a;

    public qeh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qeh) && u890.j(this.a, ((qeh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
