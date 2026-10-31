package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q4c {
    public final String a;
    public final String b;

    public q4c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4c)) {
            return false;
        }
        q4c q4cVar = (q4c) obj;
        return this.a.equals(q4cVar.a) && u890.j(this.b, q4cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
