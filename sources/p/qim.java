package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qim implements fq50 {
    public final Set a;

    /* JADX WARN: Multi-variable type inference failed */
    public qim(npy0 npy0Var, x3f0 x3f0Var, y880 y880Var, y880 y880Var2, y880 y880Var3) {
        this.a = f46.S0(new lhm[]{npy0Var, y880Var2, y880Var, x3f0Var, y880Var3});
    }

    public Object a(Object obj) {
        return Integer.valueOf(((ov00) obj).b());
    }

    public Iterator f() {
        return this.a.iterator();
    }

    public qim(Set set, byte b) {
        switch (b) {
            case 2:
                this.a = set;
                break;
            default:
                this.a = set;
                break;
        }
    }
}
