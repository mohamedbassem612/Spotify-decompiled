package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v8c0 implements l8c0 {
    public final ArrayList a = new ArrayList();
    public m8c0 b;
    public bkl c;

    public final void a(bkl bklVar) {
        this.c = bklVar;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m8c0 m8c0Var = (m8c0) arrayList.get(size);
            this.b = m8c0Var;
            bklVar.accept(m8c0Var);
        }
        this.b = null;
        this.c = null;
    }

    @Override // p.l8c0
    public final boolean k(m8c0 m8c0Var) {
        ArrayList arrayList = this.a;
        return !arrayList.contains(m8c0Var) && arrayList.add(m8c0Var);
    }

    @Override // p.l8c0
    public final boolean u(m8c0 m8c0Var) {
        m8c0 m8c0Var2 = this.b;
        if (m8c0Var2 == null || m8c0Var == m8c0Var2) {
            return this.a.remove(m8c0Var);
        }
        hhg1.n(f4i1.f("Removing a listener (other than the one being notified) during ", String.valueOf(this.c), " is not supported."));
        return false;
    }
}
