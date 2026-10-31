package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class brb implements crb {
    public final String a;
    public final String b;
    public final boolean c;

    public brb(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brb)) {
            return false;
        }
        brb brbVar = (brb) obj;
        return u890.j(this.a, brbVar.a) && u890.j(this.b, brbVar.b) && this.c == brbVar.c;
    }

    @Override // p.crb
    public final String getId() {
        return this.a;
    }

    @Override // p.crb
    public final String getLabel() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
