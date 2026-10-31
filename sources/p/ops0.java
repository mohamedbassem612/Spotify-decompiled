package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ops0 extends a9 {
    public final /* synthetic */ byte a;
    public final z8 b;

    public /* synthetic */ ops0(z8 z8Var, byte b) {
        this.a = b;
        this.b = z8Var;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int b() {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                return ((hps0) z8Var).f;
            default:
                return ((eqs0) z8Var).d.c();
        }
    }

    public final void clear() {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                ((hps0) z8Var).clear();
                break;
            default:
                ((eqs0) z8Var).clear();
                break;
        }
    }

    public final boolean contains(Object obj) {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                return ((hps0) z8Var).containsKey(obj);
            default:
                return ((eqs0) z8Var).d.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                hps0 hps0Var = (hps0) z8Var;
                lug1[] lug1VarArr = new lug1[8];
                for (int i = 0; i < 8; i++) {
                    lug1VarArr[i] = new nug1((byte) 1);
                }
                return new pps0(hps0Var, lug1VarArr);
            default:
                return new fqs0((eqs0) z8Var, (byte) 1);
        }
    }

    public final boolean remove(Object obj) {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                hps0 hps0Var = (hps0) z8Var;
                if (!hps0Var.containsKey(obj)) {
                    return false;
                }
                hps0Var.remove(obj);
                return true;
            default:
                eqs0 eqs0Var = (eqs0) z8Var;
                if (!eqs0Var.d.containsKey(obj)) {
                    return false;
                }
                eqs0Var.remove(obj);
                return true;
        }
    }
}
