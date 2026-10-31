package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k6e {
    public final j6e a;

    public k6e(j6e j6eVar) {
        this.a = j6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6e) && u890.j(this.a, ((k6e) obj).a);
    }

    public final int hashCode() {
        j6e j6eVar = this.a;
        if (j6eVar == null) {
            return 0;
        }
        return j6eVar.a.hashCode();
    }
}
