package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hge extends gge {
    public hge(mr20 mr20Var, o8n o8nVar, int i, int i2, int i3) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? o6x.a : o8nVar, mr20Var);
    }

    @Override // p.age
    public final age h(o8n o8nVar, int i, int i2) {
        return new hge(i, i2, o8nVar, this.d);
    }

    @Override // p.age
    public final mr20 i() {
        return this.d;
    }
}
