package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k1c0 implements bbr0, o2q0 {
    public final gg11 a;

    public k1c0(gg11 gg11Var) {
        this.a = gg11Var;
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
        Iterator it = this.a.g().iterator();
        while (it.hasNext()) {
            ((b1c0) ((Map.Entry) it.next()).getValue()).b(str, zf30Var);
        }
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        Object obj = this.a.get(cls);
        return new j1c0(obj instanceof war0 ? (war0) obj : null, (byte) 0);
    }
}
