package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vhn implements shn {
    public static final q3c c = new q3c();
    public final aqq0 a;
    public final AtomicReference b = new AtomicReference(null);

    public vhn(aqq0 aqq0Var) {
        this.a = aqq0Var;
        aqq0Var.a(new thn(this, (byte) 0));
    }

    @Override // p.shn
    public final tmn0 a(String str) {
        shn shnVar = (shn) this.b.get();
        return shnVar == null ? c : shnVar.a(str);
    }

    @Override // p.shn
    public final boolean b() {
        shn shnVar = (shn) this.b.get();
        return shnVar != null && shnVar.b();
    }

    @Override // p.shn
    public final void c(String str, long j, e29 e29Var) {
        ws10.Z.g();
        this.a.a(new uhn(str, j, e29Var));
    }

    @Override // p.shn
    public final boolean d(String str) {
        shn shnVar = (shn) this.b.get();
        return shnVar != null && shnVar.d(str);
    }
}
