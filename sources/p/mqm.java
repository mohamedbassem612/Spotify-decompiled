package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mqm {
    public final nvm a;
    public final lqm b;

    public mqm(nvm nvmVar, lqm lqmVar) {
        this.a = nvmVar;
        this.b = lqmVar;
    }

    public final lqm a() {
        return this.b;
    }

    public final nvm b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqm)) {
            return false;
        }
        mqm mqmVar = (mqm) obj;
        return u890.j(this.a, mqmVar.a) && this.b.equals(mqmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
