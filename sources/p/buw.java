package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class buw {
    public final String a;
    public final String b;

    public buw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buw)) {
            return false;
        }
        buw buwVar = (buw) obj;
        return u890.j(this.a, buwVar.a) && u890.j(this.b, buwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
