package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cwq {
    public final LinkedHashMap a;

    public cwq() {
        this.a = new LinkedHashMap();
    }

    public ewq a() {
        ewq ewqVar = new ewq(this.a);
        o0c.N(ewqVar);
        return ewqVar;
    }

    public void b(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    public void c(Object obj, String str) {
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            jd11 jd11Var = rc11.a;
            tka0 tka0VarB = jd11Var.b(cls);
            if (!tka0VarB.equals(jd11Var.b(Boolean.TYPE)) && !tka0VarB.equals(jd11Var.b(Byte.TYPE)) && !tka0VarB.equals(jd11Var.b(Integer.TYPE)) && !tka0VarB.equals(jd11Var.b(Long.TYPE)) && !tka0VarB.equals(jd11Var.b(Float.TYPE)) && !tka0VarB.equals(jd11Var.b(Double.TYPE)) && !tka0VarB.equals(jd11Var.b(String.class)) && !tka0VarB.equals(jd11Var.b(Boolean[].class)) && !tka0VarB.equals(jd11Var.b(Byte[].class)) && !tka0VarB.equals(jd11Var.b(Integer[].class)) && !tka0VarB.equals(jd11Var.b(Long[].class)) && !tka0VarB.equals(jd11Var.b(Float[].class)) && !tka0VarB.equals(jd11Var.b(Double[].class)) && !tka0VarB.equals(jd11Var.b(String[].class))) {
                if (tka0VarB.equals(jd11Var.b(boolean[].class))) {
                    obj = b5r.a((boolean[]) obj);
                } else if (tka0VarB.equals(jd11Var.b(byte[].class))) {
                    obj = b5r.b((byte[]) obj);
                } else if (tka0VarB.equals(jd11Var.b(int[].class))) {
                    obj = b5r.e((int[]) obj);
                } else if (tka0VarB.equals(jd11Var.b(long[].class))) {
                    obj = b5r.f((long[]) obj);
                } else if (tka0VarB.equals(jd11Var.b(float[].class))) {
                    obj = b5r.d((float[]) obj);
                } else {
                    if (!tka0VarB.equals(jd11Var.b(double[].class))) {
                        hhg1.i("Key ", str, " has invalid type ", tka0VarB);
                        return;
                    }
                    obj = b5r.c((double[]) obj);
                }
            }
        }
        this.a.put(str, obj);
    }

    public void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c(entry.getValue(), (String) entry.getKey());
        }
    }

    public cwq(int i) {
        this.a = d0p1.c0(i);
    }
}
