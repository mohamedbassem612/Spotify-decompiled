package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uzj implements vzj {
    public final d0r a;
    public final List b;
    public f1r c;
    public uyl d;
    public vzj e;
    public lwb0 f;

    public uzj(d0r d0rVar, uyl uylVar, f1r f1rVar) {
        ArrayList arrayList = new ArrayList();
        this.a = d0rVar;
        this.b = arrayList;
        this.c = f1rVar;
        this.d = uylVar;
    }

    public final List a() {
        return this.b;
    }

    public final void b(vzj vzjVar) {
        this.e = vzjVar;
    }

    public final f1r c() {
        return this.c;
    }

    public final uyl d() {
        return this.d;
    }

    public final lwb0 e() {
        return this.f;
    }

    public final k1r f() {
        f1r f1rVar = this.c;
        if (f1rVar != null) {
            return this.a.b(f1rVar);
        }
        return null;
    }

    public final void g(uyl uylVar) {
        if (!u890.j(this.d.getId(), uylVar.getId()) || !u890.j(upn1.i(this.d), upn1.i(uylVar))) {
            tzj tzjVar = this.e;
            tzj tzjVar2 = tzjVar instanceof tzj ? tzjVar : null;
            if (tzjVar2 != null) {
                tzjVar2.e++;
            }
        }
        this.d = uylVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0029  */
    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0034  */
    public final void h(lwb0 lwb0Var) {
        tzj tzjVar;
        lwb0 lwb0Var2 = this.f;
        if (u890.j(lwb0Var2 != null ? lwb0Var2.a : null, lwb0Var != null ? lwb0Var.a : null)) {
            lwb0 lwb0Var3 = this.f;
            if (!u890.j(lwb0Var3 != null ? lwb0Var3.b : null, lwb0Var != null ? lwb0Var.b : null)) {
                vzj vzjVar = this.e;
                if (vzjVar instanceof tzj) {
                }
                if (tzjVar != null) {
                    tzjVar.e++;
                }
            }
        } else {
            vzj vzjVar2 = this.e;
            tzjVar = vzjVar2 instanceof tzj ? (tzj) vzjVar2 : null;
            if (tzjVar != null) {
                tzjVar.e++;
            }
        }
        this.f = lwb0Var;
    }
}
