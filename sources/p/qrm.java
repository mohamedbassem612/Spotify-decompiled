package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qrm extends trm {
    public final nvm a;
    public final String b;

    public qrm(nvm nvmVar, String str) {
        this.a = nvmVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrm)) {
            return false;
        }
        qrm qrmVar = (qrm) obj;
        return u890.j(this.a, qrmVar.a) && u890.j(this.b, qrmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
