package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ut21 {
    public final xap a;
    public final d18 b;
    public final k261 c = l261.a(1);

    public ut21(xap xapVar, d18 d18Var) {
        this.a = xapVar;
        this.b = d18Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x008a, B:32:0x0091), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws Throwable {
        tt21 tt21Var;
        k261 k261Var;
        int i;
        String str2;
        k261 k261Var2;
        f1a0 f1a0Var;
        String str3;
        if (onmVar instanceof tt21) {
            tt21Var = (tt21) onmVar;
            int i2 = tt21Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tt21Var.h = i2 - Integer.MIN_VALUE;
            } else {
                tt21Var = new tt21(this, onmVar);
            }
        } else {
            tt21Var = new tt21(this, onmVar);
        }
        Object obj = tt21Var.f;
        int i3 = tt21Var.h;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                tt21Var.a = str;
                tt21Var.b = str;
                k261Var = this.c;
                tt21Var.c = k261Var;
                i = 0;
                tt21Var.e = 0;
                tt21Var.h = 1;
                if (k261Var.b(tt21Var) != d9nVar) {
                    str2 = str;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = tt21Var.d;
                k261Var2 = tt21Var.c;
                str3 = tt21Var.b;
                try {
                    hm5.M(obj);
                    f1a0Var = (f1a0) obj;
                    if (f1a0Var instanceof e1a0) {
                        d18 d18Var = this.b;
                        ((LinkedHashMap) d18Var.c).put(str3, new sts(((yqg) d18Var.b).b(), f1a0Var));
                    }
                    k261Var = k261Var2;
                    k261Var.e();
                    return f1a0Var;
                } catch (Throwable th) {
                    th = th;
                    k261Var2.e();
                    throw th;
                }
            }
            int i4 = tt21Var.e;
            k261 k261Var3 = tt21Var.c;
            String str4 = tt21Var.b;
            str2 = tt21Var.a;
            hm5.M(obj);
            k261Var = k261Var3;
            i = i4;
            str = str4;
            f1a0Var = (f1a0) this.b.s(str);
            if (f1a0Var == null) {
                xap xapVar = this.a;
                Set setSingleton = Collections.singleton(ko90.e);
                tt21Var.a = null;
                tt21Var.b = str;
                tt21Var.c = k261Var;
                tt21Var.d = this;
                tt21Var.e = i;
                tt21Var.h = 2;
                Object objH = xapVar.h(str2, setSingleton, tt21Var);
                if (objH != d9nVar) {
                    str3 = str;
                    k261Var2 = k261Var;
                    obj = objH;
                    f1a0Var = (f1a0) obj;
                    if (f1a0Var instanceof e1a0) {
                        d18 d18Var2 = this.b;
                        ((LinkedHashMap) d18Var2.c).put(str3, new sts(((yqg) d18Var2.b).b(), f1a0Var));
                    }
                    k261Var = k261Var2;
                }
                return d9nVar;
            }
            k261Var.e();
            return f1a0Var;
        } catch (Throwable th2) {
            th = th2;
            k261Var2 = k261Var;
            k261Var2.e();
            throw th;
        }
    }
}
