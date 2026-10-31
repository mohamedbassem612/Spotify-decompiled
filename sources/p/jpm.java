package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jpm {
    public final nvm a;
    public final lqm b;
    public final Integer c;

    public jpm(nvm nvmVar, lqm lqmVar, Integer num) {
        this.a = nvmVar;
        this.b = lqmVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpm)) {
            return false;
        }
        jpm jpmVar = (jpm) obj;
        return u890.j(this.a, jpmVar.a) && u890.j(this.b, jpmVar.b) && u890.j(this.c, jpmVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public /* synthetic */ jpm(nvm nvmVar, lqm lqmVar) {
        this(nvmVar, lqmVar, null);
    }
}
