package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class h541 {
    public final dhn0 a;
    public final int b;
    public final hjj0 c;
    public boolean d;

    public h541(ie30 ie30Var, dhn0 dhn0Var) {
        this.a = dhn0Var;
        this.c = ie30Var.m;
        this.b = mue1.G(ie30Var.f66p);
    }

    public static String b(ie30 ie30Var, List list) {
        String str = ie30Var.f66p;
        x8h x8hVar = ie30Var.H;
        str.getClass();
        boolean zO = asj0.o(str);
        r380 r380Var = new r380(4);
        r380Var.g(str);
        if (zO) {
            r380Var.g("video/hevc");
            r380Var.g("video/avc");
        }
        r380Var.h(list);
        b380 b380VarB = r380Var.i().b();
        for (int i = 0; i < b380VarB.size(); i++) {
            String str2 = (String) b380VarB.get(i);
            if (list.contains(str2)) {
                if (zO && x8h.h(x8hVar)) {
                    if (!abx.f(str2, x8hVar).isEmpty()) {
                        return str2;
                    }
                } else if (!abx.e(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract gd50 j(e4w e4wVar, ie30 ie30Var, int i);

    public abstract gar k();

    public abstract ie30 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void p();

    public void o() {
    }
}
