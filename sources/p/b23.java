package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b23 implements enn {
    public static final String e = nik1.G4.a;
    public final Context a;
    public final o241 b;
    public final zwa c;
    public final bf4 d;

    public b23(Context context, o241 o241Var, zwa zwaVar, bf4 bf4Var) {
        this.a = context;
        this.b = o241Var;
        this.c = zwaVar;
        this.d = bf4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r1 == r8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.qmn r19, p.lnm r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b23.a(p.qmn, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        a23 a23Var;
        if (onmVar instanceof a23) {
            a23Var = (a23) onmVar;
            int i = a23Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a23Var.c = i - Integer.MIN_VALUE;
            } else {
                a23Var = new a23(this, onmVar);
            }
        } else {
            a23Var = new a23(this, onmVar);
        }
        Object objL = a23Var.a;
        int i2 = a23Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.b.a.map(ns80.h);
            a23Var.c = 1;
            objL = fc11.l(map, 2, (Object) null, a23Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return Boolean.valueOf(u890.j(objL, Boolean.TRUE));
    }
}
