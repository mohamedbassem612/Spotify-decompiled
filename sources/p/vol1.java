package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vol1 implements tol1 {
    public final String a;
    public final ynb0 b;

    public vol1(String str, ynb0 ynb0Var) {
        this.a = str;
        this.b = ynb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(int i, onm onmVar) {
        uol1 uol1Var;
        if (onmVar instanceof uol1) {
            uol1Var = (uol1) onmVar;
            int i2 = uol1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uol1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                uol1Var = new uol1(this, onmVar);
            }
        } else {
            uol1Var = new uol1(this, onmVar);
        }
        Object objB = uol1Var.a;
        int i3 = uol1Var.c;
        Object obj = null;
        Enum r2 = null;
        Enum r3 = sol1.c;
        if (i3 == 0) {
            hm5.M(objB);
            String str = this.a;
            if (str.length() > 0) {
                for (Object obj2 : sol1.g) {
                    if (((sol1) obj2).a.equals(str)) {
                        obj = obj2;
                        break;
                    }
                }
                sol1 sol1Var = (sol1) obj;
                if (sol1Var != null) {
                    return sol1Var;
                }
            } else {
                ox5 ox5Var = (ox5) this.b.get();
                uol1Var.c = 1;
                objB = ox5Var.b(i, uol1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        int i4 = ((Bundle) objB).getInt("appWidgetCategory", -1);
        if (i4 == 1) {
            r2 = r3;
        } else if (i4 == 2) {
            r2 = sol1.b;
        }
        return r2 == null ? r3 : r2;
    }
}
