package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class pk80 extends pim0 implements dpg1 {
    public erl1 O0;
    public erl1 P0;

    public pk80() {
        mn20 mn20Var = poo1.a;
        this.O0 = mn20Var;
        this.P0 = mn20Var;
    }

    @Override // p.pim0
    public void A1() {
        this.P0 = this.O0;
        don1.G(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ok80(this, (byte) 0));
    }

    @Override // p.pim0
    public final void B1() {
        this.O0 = poo1.a;
    }

    public void I1() {
        this.P0 = H1(this.O0);
        don1.G(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ok80(this, (byte) 0));
    }

    @Override // p.dpg1
    public final Object n() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // p.pim0
    public void z1() {
        don1.E(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ok80(this, (byte) 1));
        I1();
    }

    public erl1 H1(erl1 erl1Var) {
        return erl1Var;
    }
}
