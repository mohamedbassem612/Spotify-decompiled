package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cbr0 implements bbr0 {
    public static final cbr0 c = new cbr0(new dbr0[0], false);
    public final boolean a;
    public final LinkedHashMap b = new LinkedHashMap();

    public cbr0(dbr0[] dbr0VarArr, boolean z) {
        this.a = z;
        for (dbr0 dbr0Var : dbr0VarArr) {
            this.b.put(dbr0Var.getClass(), new kdn0(dbr0Var));
        }
    }

    public final void a(dbr0 dbr0Var) {
        Class<?> cls = dbr0Var.getClass();
        boolean z = this.a;
        LinkedHashMap linkedHashMap = this.b;
        if (!z && !linkedHashMap.containsKey(cls)) {
            eg.m("can't update properties that didn't get a default value in constructor");
            return;
        }
        Object kdn0Var = linkedHashMap.get(cls);
        if (kdn0Var == null) {
            kdn0Var = new kdn0();
            linkedHashMap.put(cls, kdn0Var);
        }
        ((kdn0) kdn0Var).m(dbr0Var);
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        LinkedHashMap linkedHashMap = this.b;
        Object kdn0Var = linkedHashMap.get(cls);
        if (kdn0Var == null) {
            kdn0Var = new kdn0();
            linkedHashMap.put(cls, kdn0Var);
        }
        return new j1c0((kdn0) kdn0Var, (byte) 1);
    }
}
