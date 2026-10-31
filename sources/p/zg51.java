package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zg51 {
    public final String a;

    public zg51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg51) && u890.j(this.a, ((zg51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
