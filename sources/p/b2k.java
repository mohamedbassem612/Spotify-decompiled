package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b2k implements i650 {
    public final List a;

    public b2k(f32 f32Var, f32 f32Var2, hhv0 hhv0Var, f32 f32Var3) {
        this.a = p7h.M(new i650[]{f32Var, f32Var2, hhv0Var, f32Var3});
    }

    @Override // p.i650
    public final h650 a(Integer num, String str) {
        String string = ihc1.e1(str).toString();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            h650 h650VarA = ((i650) it.next()).a(num, string);
            if (!u890.j(h650VarA, g650.a)) {
                return h650VarA;
            }
        }
        return new d650(string);
    }
}
