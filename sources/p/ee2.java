package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ee2 implements oh81 {
    public final b7n a;
    public final ov20 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;

    public ee2(b7n b7nVar, ov20 ov20Var, thq thqVar, gbp gbpVar, gbp gbpVar2) {
        this.a = b7nVar;
        this.b = ov20Var;
        this.c = thqVar;
        this.d = gbpVar;
        this.e = gbpVar2;
    }

    @Override // p.oh81
    public final mr20 a() {
        huz huzVar;
        if (((Boolean) this.d.get()).booleanValue()) {
            huzVar = ((Boolean) this.e.get()).booleanValue() ? new huz(Boolean.TRUE, (byte) 10) : new x010(rwq0.v(this.b), this.a.a(o6n.a), new ce2(3, (lnm) null, (byte) 0), (byte) 1);
        } else {
            huzVar = new huz(Boolean.FALSE, (byte) 10);
        }
        return new gk(huzVar, this, (byte) 14);
    }
}
