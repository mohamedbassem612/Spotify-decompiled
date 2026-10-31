package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e960 extends qaj0 {
    public final /* synthetic */ byte b = 2;
    public final xpw c;

    public e960(qj0 qj0Var) {
        super(csm1.class);
        this.c = qj0Var;
    }

    @Override // p.qaj0
    public final kpg0 b() {
        byte b = this.b;
        nl9 nl9Var = this.c;
        switch (b) {
            case 0:
                return new kpg0(nl9Var, new zi50(this, (byte) 12));
            case 1:
                return new kpg0((qj0) nl9Var, new zw11(this, (byte) 4));
            default:
                return new kpg0((br0) nl9Var, new dr91(this, (byte) 22));
        }
    }

    public e960(br0 br0Var) {
        super(dsm1.class);
        this.c = br0Var;
    }

    public e960(nl9 nl9Var) {
        super(asm1.class);
        this.c = nl9Var;
    }
}
