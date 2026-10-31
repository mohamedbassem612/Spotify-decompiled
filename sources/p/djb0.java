package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class djb0 implements njb0 {
    public final String a;

    public djb0(String str) {
        this.a = str;
    }

    public final boolean a(rph rphVar) {
        return rphVar.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djb0) && u890.j(this.a, ((djb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
