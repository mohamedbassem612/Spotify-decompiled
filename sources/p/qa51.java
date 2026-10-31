package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qa51 {
    public final boolean a;

    public qa51(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa51) && this.a == ((qa51) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
