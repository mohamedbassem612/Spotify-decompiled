package p;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class px40 extends xaa {
    public final Account A;
    public final Set z;

    public px40(Context context, Looper looper, int i, d520 d520Var, nz40 nz40Var, oz40 oz40Var) {
        b3p1 b3p1Var;
        synchronized (b3p1.g) {
            try {
                b3p1 b3p1Var2 = b3p1.h;
                if (b3p1Var2 == null) {
                    b3p1Var2 = new b3p1(context.getApplicationContext(), context.getMainLooper());
                    b3p1.h = b3p1Var2;
                }
                b3p1Var = b3p1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object obj = lz40.d;
        zod.s(nz40Var);
        zod.s(oz40Var);
        super(context, looper, b3p1Var, i, new y1t0(nz40Var, (byte) 21), new csj1(oz40Var, (byte) 10), d520Var.n0());
        this.A = null;
        Set setX = d520Var.x();
        Iterator it = setX.iterator();
        while (it.hasNext()) {
            if (!setX.contains((Scope) it.next())) {
                eg.m("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = setX;
    }
}
