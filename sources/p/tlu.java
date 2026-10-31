package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tlu implements dmh1 {
    public final us31 a;
    public final xla1 b = new xla1(rc11.a.b(wlu.class));

    public tlu(Context context, kxc0 kxc0Var, s8q s8qVar) {
        this.a = xs31.a(new w1k(p7h.M(kxc0Var.a(bdc1.a).a(), s8qVar.a("android-kodiak-extendedmetadataimpl", false))), new ork(context, (byte) 1));
    }

    @Override // p.dmh1
    public final void b(ses0 ses0Var) {
        this.a.b(ses0Var);
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        return this.a.c(iu30Var);
    }

    @Override // p.dmh1
    public final yla1 e() {
        return this.b;
    }
}
