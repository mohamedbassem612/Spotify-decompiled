package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bhw implements fiw {
    public final String a;
    public final String b;

    public bhw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhw)) {
            return false;
        }
        bhw bhwVar = (bhw) obj;
        return u890.j(this.a, bhwVar.a) && u890.j(this.b, bhwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String q() {
        return this.a;
    }
}
