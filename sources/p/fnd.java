package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fnd extends ind {
    public final String a;
    public final String b;

    public fnd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnd)) {
            return false;
        }
        fnd fndVar = (fnd) obj;
        return this.a.equals(fndVar.a) && this.b.equals(fndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
