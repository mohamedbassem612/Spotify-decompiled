package p;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zu61 {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();

    public zu61(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, bu61 bu61Var, xu30 xu30Var, onm onmVar) {
        yu61 yu61Var;
        wu61 wu61Var;
        Object obj;
        if (onmVar instanceof yu61) {
            yu61Var = (yu61) onmVar;
            int i = yu61Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yu61Var.e = i - Integer.MIN_VALUE;
            } else {
                yu61Var = new yu61(this, onmVar);
            }
        } else {
            yu61Var = new yu61(this, onmVar);
        }
        Object objInvoke = yu61Var.c;
        int i2 = yu61Var.e;
        LinkedHashMap linkedHashMap = this.b;
        if (i2 == 0) {
            hm5.M(objInvoke);
            xu61 xu61Var = (xu61) linkedHashMap.get(str);
            if (xu61Var != null) {
                xu61 xu61Var2 = u890.j(xu61Var.a, bu61Var) ? xu61Var : null;
                if (xu61Var2 != null && (wu61Var = xu61Var2.b) != null) {
                    return wu61Var;
                }
            }
            yu61Var.a = str;
            yu61Var.b = bu61Var;
            yu61Var.e = 1;
            objInvoke = xu30Var.invoke(this.a, str, yu61Var);
            d9n d9nVar = d9n.a;
            obj = bu61Var;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = yu61Var.b;
            str = yu61Var.a;
            hm5.M(objInvoke);
            obj = obj2;
        }
        wu61 wu61Var2 = (wu61) objInvoke;
        linkedHashMap.put(str, new xu61(obj, wu61Var2));
        return wu61Var2;
    }
}
