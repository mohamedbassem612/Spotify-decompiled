package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class emk implements omk {
    public final String a;

    public emk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emk) && u890.j(this.a, ((emk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
