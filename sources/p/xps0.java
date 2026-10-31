package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xps0 extends k6 implements p280 {
    public final /* synthetic */ byte a;
    public final m7 b;

    public /* synthetic */ xps0(m7 m7Var, byte b) {
        this.a = b;
        this.b = m7Var;
    }

    public final int b() {
        byte b = this.a;
        dqs0 dqs0Var = this.b;
        switch (b) {
            case 0:
                return ((dps0) dqs0Var).c;
            default:
                return dqs0Var.d.c();
        }
    }

    public final boolean contains(Object obj) {
        byte b = this.a;
        dqs0 dqs0Var = this.b;
        switch (b) {
            case 0:
                return ((dps0) dqs0Var).containsValue(obj);
            default:
                return dqs0Var.containsValue(obj);
        }
    }

    public final Iterator iterator() {
        byte b = this.a;
        dqs0 dqs0Var = this.b;
        switch (b) {
            case 0:
                jug1 jug1Var = ((dps0) dqs0Var).b;
                lug1[] lug1VarArr = new lug1[8];
                for (int i = 0; i < 8; i++) {
                    lug1VarArr[i] = new nug1((byte) 2);
                }
                return new tps0(jug1Var, lug1VarArr);
            default:
                return new hqs0(dqs0Var, (byte) 1);
        }
    }
}
