package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dqy {
    public final int a;
    public final String b;
    public final Integer c;
    public final bw91 d;
    public final bw91 e;
    public final hrr0 f;
    public final hrr0 g;
    public final hrr0 h;

    public dqy(int i, Integer num, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = num;
        ll51[] ll51VarArr = (ll51[]) arrayList.toArray(new ll51[0]);
        this.d = v8r.p(Arrays.copyOf(ll51VarArr, ll51VarArr.length));
        this.e = new bw91();
        this.f = v8r.q(Boolean.FALSE);
        this.g = v8r.q(z6x.a);
        this.h = v8r.q("");
    }

    public final hl51 a() {
        bw91 bw91Var = this.d;
        ArrayList arrayList = new ArrayList(q7h.U(bw91Var, 10));
        ek60 ek60VarListIterator = bw91Var.listIterator();
        while (true) {
            ek60 ek60Var = ek60VarListIterator;
            if (!ek60Var.hasNext()) {
                return new hl51(arrayList);
            }
            ll51 ll51Var = (ll51) ek60Var.next();
            arrayList.add(new kl51(ll51Var.a, ll51Var.b));
        }
    }

    public final hl51 b(boolean z) {
        hl51 hl51VarA;
        bw91 bw91Var = this.e;
        if (z && c() && !bw91Var.isEmpty()) {
            ArrayList arrayList = new ArrayList(q7h.U(bw91Var, 10));
            ek60 ek60VarListIterator = bw91Var.listIterator();
            while (true) {
                ek60 ek60Var = ek60VarListIterator;
                if (!ek60Var.hasNext()) {
                    break;
                }
                fl51 fl51Var = (fl51) ek60Var.next();
                arrayList.add(new ll51(fl51Var.a, fl51Var.b));
            }
            this.d.addAll(arrayList);
            hl51VarA = a();
        } else {
            hl51VarA = null;
        }
        bw91Var.clear();
        this.g.setValue(z6x.a);
        this.h.setValue("");
        this.f.setValue(Boolean.FALSE);
        return hl51VarA;
    }

    public final boolean c() {
        ek60 ek60Var;
        bw91 bw91Var = this.d;
        if (bw91Var.isEmpty()) {
            return true;
        }
        ek60 ek60VarListIterator = bw91Var.listIterator();
        do {
            ek60Var = ek60VarListIterator;
            if (!ek60Var.hasNext()) {
                return true;
            }
        } while (!ihc1.y0(((ll51) ek60Var.next()).b));
        return false;
    }

    public final String d() {
        return (String) this.h.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final void f(String str) {
        if (str.equals(d())) {
            return;
        }
        this.h.setValue(str);
        bw91 bw91Var = this.e;
        ArrayList arrayList = new ArrayList(q7h.U(bw91Var, 10));
        ek60 ek60VarListIterator = bw91Var.listIterator();
        while (true) {
            ek60 ek60Var = ek60VarListIterator;
            if (!ek60Var.hasNext()) {
                this.g.setValue(arrayList);
                return;
            }
            arrayList.add(((fl51) ek60Var.next()).a);
        }
    }
}
