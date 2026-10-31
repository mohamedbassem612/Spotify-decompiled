package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dok implements gok {
    public final String a;
    public final String b;

    public dok(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.gok
    public final String a() {
        return this.a;
    }

    @Override // p.gok
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dok)) {
            return false;
        }
        dok dokVar = (dok) obj;
        return u890.j(this.a, dokVar.a) && u890.j(this.b, dokVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
