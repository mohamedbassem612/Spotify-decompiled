package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pyn {
    public final String a;
    public final String b;
    public final kyn c;
    public final kyn d;

    public pyn(String str, String str2, kyn kynVar, kyn kynVar2) {
        this.a = str;
        this.b = str2;
        this.c = kynVar;
        this.d = kynVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyn)) {
            return false;
        }
        pyn pynVar = (pyn) obj;
        return u890.j(this.a, pynVar.a) && u890.j(this.b, pynVar.b) && u890.j(this.c, pynVar.c) && u890.j(this.d, pynVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public /* synthetic */ pyn(String str, kyn kynVar, kyn kynVar2) {
        this(str, "", kynVar, kynVar2);
    }
}
