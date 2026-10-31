package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bla1 implements dla1 {
    public final bxt a;

    public bla1(bxt bxtVar) {
        this.a = bxtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bla1) && u890.j(this.a, ((bla1) obj).a);
    }

    public final int hashCode() {
        bxt bxtVar = this.a;
        if (bxtVar == null) {
            return 0;
        }
        return bxtVar.hashCode();
    }
}
