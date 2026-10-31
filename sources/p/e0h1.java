package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e0h1 implements Iterable, ola0 {
    public static final ffe1 b = new ffe1((byte) 16);
    public static final e0h1 c = new e0h1(z6x.a);
    public final x36 a;

    public e0h1(List list) {
        this.a = e6x.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ig5 ig5Var = (ig5) it.next();
            ig5Var.getClass();
            String strO = rc11.a.b(ig5.class).o();
            strO.getClass();
            int iF = b.f(strO);
            int iB = this.a.b();
            if (iB != 0) {
                if (iB == 1) {
                    x36 x36Var = this.a;
                    try {
                        lhq0 lhq0Var = (lhq0) x36Var;
                        int i = lhq0Var.b;
                        if (i == iF) {
                            this.a = new lhq0(iF, ig5Var);
                        } else {
                            a46 a46Var = new a46();
                            a46Var.a = new Object[20];
                            a46Var.b = 0;
                            a46Var.c(i, lhq0Var.a);
                            this.a = a46Var;
                        }
                    } catch (ClassCastException e) {
                        k220.p(b(x36Var, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.a.c(iF, ig5Var);
            } else {
                x36 x36Var2 = this.a;
                if (!(x36Var2 instanceof e6x)) {
                    eg.m(b(x36Var2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.a = new lhq0(iF, ig5Var);
            }
        }
    }

    public static String b(x36 x36Var, int i, String str) {
        StringBuilder sb = new StringBuilder("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(x36Var.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b.b;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(q7h.U(x36Var, 10));
        int i2 = 0;
        for (Object obj : x36Var) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i2) {
                    obj2 = obj3;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.a.b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
