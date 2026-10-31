package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fks {
    public final String a;
    public final String b;

    public fks(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fks)) {
            return false;
        }
        fks fksVar = (fks) obj;
        return u890.j(this.a, fksVar.a) && u890.j(this.b, fksVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
