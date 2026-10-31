package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ogc extends jnw0 {
    public static final ogc c = new ogc(sgc.a);

    @Override // p.l6
    public final int d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // p.j4h, p.l6
    public final void f(x1k x1kVar, int i, Object obj) {
        ((hgc) obj).e(x1kVar.q(this.b, i));
    }

    @Override // p.l6
    public final Object g(Object obj) {
        return new hgc((byte[]) obj);
    }

    @Override // p.jnw0
    public final Object j() {
        return new byte[0];
    }

    @Override // p.jnw0
    public final void k(z1k z1kVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.I(this.b, i2, bArr[i2]);
        }
    }
}
