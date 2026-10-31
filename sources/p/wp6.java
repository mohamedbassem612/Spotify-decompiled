package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wp6 {
    public final String a;

    public wp6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp6) && u890.j(this.a, ((wp6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
