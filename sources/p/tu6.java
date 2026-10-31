package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tu6 implements wu6 {
    public final su6 a;

    public tu6(su6 su6Var) {
        this.a = su6Var;
    }

    @Override // p.wu6
    public final su6 a(y0r y0rVar) {
        return su6.a(this.a, (String) null, (u7h) null, y0rVar.f, 762);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu6) && u890.j(this.a, ((tu6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
