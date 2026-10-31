package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class yyj implements s6b0 {
    public final ArrayList a;

    public yyj(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a() {
        h((String[]) this.a.toArray(new String[0]));
    }

    public boolean b(int i, z340 z340Var, Object obj) {
        ArrayList arrayList = z340Var.a;
        if (arrayList == null) {
            e(i, z340Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof s340)) {
                if (!(obj2 instanceof z340)) {
                    eg.m(f4i1.d(obj2, "Unexpected child source info "));
                    break;
                }
                if (b(i, (z340) obj2, obj)) {
                    e(0, z340Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                e(0, z340Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void d(Object obj) {
        if (obj instanceof String) {
            this.a.add((String) obj);
        }
    }

    public void e(int i, z340 z340Var, Object obj) {
        this.a.add(new zyj(i, null, null));
    }

    public void f(int i, Object obj, z340 z340Var, Object obj2) {
        if (u890.j(obj, fkj0.X)) {
            e(i, z340Var, null);
        }
    }

    public abstract void h(String[] strArr);

    public r6b0 k(heg hegVar) {
        return null;
    }

    public void c(jeg jegVar) {
    }

    public void g(heg hegVar, ajn0 ajn0Var) {
    }
}
