package p;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class su01 {
    public final zle1 a;
    public final t45 b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public final ConcurrentHashMap.KeySetView h;
    public final ConcurrentHashMap.KeySetView i;
    public final ConcurrentHashMap j;

    public su01(zle1 zle1Var, int i) {
        this.a = zle1Var;
        t45 t45VarO = qyo1.o(zle1Var, i);
        qyo1.D(t45VarO);
        qyo1.E(t45VarO);
        qyo1.F(t45VarO);
        qyo1.C(t45VarO);
        this.b = t45VarO;
        this.h = ConcurrentHashMap.newKeySet();
        this.i = ConcurrentHashMap.newKeySet();
        this.j = new ConcurrentHashMap();
    }

    public final void a() {
        for (Map.Entry entry : this.j.entrySet()) {
            String str = (String) entry.getKey();
            pu01 pu01Var = (ru01) entry.getValue();
            if (pu01Var instanceof pu01) {
                t45.d(this.b, str, null, Long.valueOf(pu01Var.a()), 16);
            }
        }
    }

    public final void b() {
        if (!this.d) {
            this.d = true;
            qyo1.q(this.b);
        }
        if (!this.e) {
            this.e = true;
            qyo1.r(this.b);
        }
        if (this.f) {
            return;
        }
        this.f = true;
        qyo1.s(this.b);
    }

    public final void c(ou01 ou01Var) {
        this.h.add(ou01Var);
        if (this.e || this.h.size() != ou01.i.b()) {
            return;
        }
        this.e = true;
        qyo1.r(this.b);
    }

    public final void d(ou01 ou01Var) {
        this.i.add(ou01Var);
        c(ou01Var);
        if (this.f || this.i.size() != ou01.i.b()) {
            return;
        }
        this.f = true;
        qyo1.s(this.b);
    }

    public final void e(ou01 ou01Var) {
        if (!this.d) {
            this.d = true;
            qyo1.q(this.b);
        }
        c(ou01Var);
    }

    public final void f(String str) {
        ConcurrentHashMap concurrentHashMap = this.j;
        Object obj = concurrentHashMap.get(str);
        qu01 qu01Var = obj instanceof qu01 ? (qu01) obj : null;
        if (qu01Var == null) {
            return;
        }
        concurrentHashMap.put(str, new pu01((System.nanoTime() - qu01Var.a()) / 1000));
    }

    public final void g(int i) {
        if (this.g) {
            return;
        }
        this.g = true;
        if (!this.c) {
            qyo1.p(this.b);
        }
        a();
        b();
        qyo1.B(this.a, this.b, i);
    }

    public final void h(String str) {
        this.j.put(str, new qu01(System.nanoTime()));
    }
}
