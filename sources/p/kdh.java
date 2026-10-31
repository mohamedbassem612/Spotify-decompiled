package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kdh implements sdh {
    public final tv80 a;

    public kdh(tv80 tv80Var) {
        this.a = tv80Var;
    }

    @Override // p.sdh
    public final tv80 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdh) && this.a.equals(((kdh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
