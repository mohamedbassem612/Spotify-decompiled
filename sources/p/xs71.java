package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xs71 {
    public final Object a;
    public final pv71 b;
    public final wv71 c = new wv71(this);
    public final hrr0 d;
    public final hrr0 e;
    public final o95 f;
    public boolean g;
    public final ws71 h;
    public final ws71 i;

    public xs71(Object obj, pv71 pv71Var) {
        this.a = obj;
        this.b = pv71Var;
        z6x z6xVar = z6x.a;
        this.d = xto.t(z6xVar);
        this.e = xto.t(z6xVar);
        this.f = new o95(new Offset(0L), rno1.f, null, 12);
        this.h = new ws71(this, (byte) 0);
        this.i = new ws71(this, (byte) 1);
    }

    public final boolean a() {
        wv71 wv71Var = this.c;
        return wv71Var.v().b() || wv71Var.v().d() || wv71Var.u();
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (((ys71) listC.get(i)).c().d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ft71 ft71VarA = ((ys71) listC.get(i)).a();
            if (ft71VarA != null && ft71VarA.n()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ys71 ys71Var = (ys71) listB.get(i);
            if (ys71Var.q()) {
                arrayList.add(ys71Var);
                if (ys71Var.c().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        this.c.r(z);
    }
}
