package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cjk0 {
    public final kly0 a;
    public final r6h1 b;

    public cjk0(caq caqVar, r6h1 r6h1Var) {
        this.a = caqVar;
        this.b = r6h1Var;
    }

    public final void a(int i) {
        ((i8h1) this.a.get()).f(b(i).e(), (Set) null);
    }

    public final wqk0 b(int i) {
        int i2 = 9;
        switch (l1d.C(i)) {
            case 0:
                i2 = 7;
                break;
            case 1:
                i2 = 6;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
            case 9:
                break;
            case 5:
                i2 = 10;
                break;
            case 6:
                i2 = 2;
                break;
            case 7:
                i2 = 1;
                break;
            case 8:
                i2 = 4;
                break;
            default:
                eg.o();
                return null;
        }
        return new wqk0(i2, this.b, (byte) 23);
    }
}
