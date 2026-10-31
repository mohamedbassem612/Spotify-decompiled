package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qdb implements udb {
    public final String a;
    public final String b;

    public qdb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdb)) {
            return false;
        }
        qdb qdbVar = (qdb) obj;
        return u890.j(this.a, qdbVar.a) && this.b.equals(qdbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
