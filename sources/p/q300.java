package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q300 implements p600 {
    public final String a;

    public q300(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q300) && u890.j(this.a, ((q300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
