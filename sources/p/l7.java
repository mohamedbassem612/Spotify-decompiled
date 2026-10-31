package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l7 extends k6 {
    public final /* synthetic */ byte a;
    public final m7 b;

    public /* synthetic */ l7(m7 m7Var, byte b) {
        this.a = b;
        this.b = m7Var;
    }

    public final int b() {
        byte b = this.a;
        eps0 eps0Var = this.b;
        switch (b) {
            case 0:
                return eps0Var.c();
            default:
                return eps0Var.c;
        }
    }

    public final boolean contains(Object obj) {
        byte b = this.a;
        eps0 eps0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return eps0Var.containsValue(obj);
    }

    public final Iterator iterator() {
        byte b = this.a;
        eps0 eps0Var = this.b;
        switch (b) {
            case 0:
                return new k7(eps0Var.a().iterator());
            default:
                kug1 kug1Var = eps0Var.b;
                mug1[] mug1VarArr = new mug1[8];
                for (int i = 0; i < 8; i++) {
                    mug1VarArr[i] = new oug1((byte) 1);
                }
                return new ups0(kug1Var, mug1VarArr);
        }
    }
}
