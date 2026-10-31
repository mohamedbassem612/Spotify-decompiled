package p;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t570 implements c670, e670 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Cloneable c;

    public t570(j380 j380Var) {
        this.b = new HashMap(j380Var.size());
        this.c = new HashMap(j380Var.size());
        for (Map.Entry entry : j380Var.entrySet()) {
            String str = (String) entry.getKey();
            o570 o570Var = (o570) entry.getValue();
            HashMap map = (HashMap) this.c;
            Integer numValueOf = Integer.valueOf(o570Var.a());
            Object obj = map.get(numValueOf);
            if (obj == null) {
                map.put(numValueOf, o570Var);
                obj = o570Var;
            }
            if (!obj.getClass().equals(o570Var.getClass())) {
                o570 o570Var2 = (o570) ((HashMap) this.c).get(Integer.valueOf(o570Var.a()));
                throw new IllegalArgumentException(("Binder ID " + o570Var.a() + " has multiple binders: " + o570Var.getClass() + " and " + (o570Var2 != null ? o570Var2.getClass() : null)).toString());
            }
            ((HashMap) this.b).put(str, Integer.valueOf(o570Var.a()));
        }
    }

    public final n570 a(int i) {
        byte b = this.a;
        Cloneable cloneable = this.c;
        switch (b) {
            case 0:
                return (n570) ((HashMap) cloneable).get(Integer.valueOf(i));
            default:
                v970 v970Var = (v970) ((SparseArray) cloneable).get(i);
                if (v970Var != null) {
                    return v970Var.a((fe70) this.b);
                }
                return null;
        }
    }

    public int h(y570 y570Var) {
        Integer num = (Integer) ((HashMap) this.b).get(y570Var.h().a());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public t570(fe70 fe70Var, v970[] v970VarArr) {
        fe70Var.getClass();
        this.b = fe70Var;
        this.c = new SparseArray(v970VarArr.length);
        for (v970 v970Var : v970VarArr) {
            ((SparseArray) this.c).append(v970Var.getId(), v970Var);
        }
    }
}
