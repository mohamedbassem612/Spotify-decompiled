package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class utm0 implements ttm0 {
    public final yqg a;
    public final acu0 b;
    public final ign0 c;
    public final llm d;
    public boolean e;
    public final b8p1 f;
    public final zau0 g;
    public final fz3 h;

    public utm0(yqg yqgVar, acu0 acu0Var, ign0 ign0Var) {
        this.a = yqgVar;
        this.b = acu0Var;
        this.c = ign0Var;
        llm llmVarE = smo1.e(ha71.A(op71.f(), igu.b));
        this.d = llmVarE;
        this.f = new b8p1(new nsm0(this), acu0Var.a);
        this.g = c(false);
        this.h = new fz3(this);
        c921.y(llmVarE, (o8n) null, 0, new uug0(this, (lnm) null, (byte) 18), 3);
    }

    @Override // p.ttm0
    public final void a(zau0 zau0Var) {
        acu0 acu0Var = this.b;
        ArrayList arrayList = acu0Var.f;
        if (this.e) {
            return;
        }
        zau0 zau0Var2 = zau0Var instanceof zau0 ? zau0Var : null;
        if (zau0Var2 == null) {
            eg.m("group not created by createPlayerGroup()");
            return;
        }
        b8p1 b8p1Var = this.f;
        zau0 zau0VarO = b8p1Var.o();
        if (zau0VarO != null && zau0VarO.a) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cbu0) it.next()).e(zau0VarO);
            }
        }
        acu0Var.g = zau0Var;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((cbu0) it2.next()).d(zau0Var);
        }
        b8p1Var.f(zau0Var2);
    }

    @Override // p.ttm0
    public final boolean b(zau0 zau0Var) {
        if (!(zau0Var instanceof zau0)) {
            zau0Var = null;
        }
        if (zau0Var == null) {
            eg.m("group not created by createPlayerGroup()");
            return false;
        }
        if (zau0Var != this.f.o()) {
            return false;
        }
        a(this.g);
        return true;
    }

    @Override // p.ttm0
    public final zau0 c(boolean z) {
        return new zau0(z);
    }

    @Override // p.ttm0
    public final void d() {
        if (this.e) {
            return;
        }
        this.c.d();
        a(this.g);
        this.e = true;
        smo1.q(this.d);
        acu0 acu0Var = this.b;
        ArrayList arrayList = acu0Var.f;
        LinkedList linkedList = acu0Var.e;
        while (true) {
            if (arrayList.isEmpty() && linkedList.isEmpty()) {
                return;
            }
            if (arrayList.isEmpty()) {
                ((w590) linkedList.removeFirst()).q();
            } else {
                cbu0 cbu0Var = (cbu0) o7h.q0(arrayList);
                if (arrayList.remove(cbu0Var)) {
                    acu0Var.d++;
                }
                cbu0Var.c();
            }
        }
    }
}
