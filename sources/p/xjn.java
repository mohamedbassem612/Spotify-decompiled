package p;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xjn {
    public Serializable a;
    public Object b;
    public Object c;
    public final Object d;

    public xjn(String str, Bundle bundle, Bundle bundle2, ham hamVar) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = hamVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }

    public q6h1 a() {
        ArrayList arrayList = (ArrayList) this.d;
        r6h1 r6h1Var = (r6h1) this.b;
        if (r6h1Var == null) {
            r6h1Var = r6h1.c;
        }
        r6h1 r6h1Var2 = r6h1Var;
        y6h1 y6h1Var = (y6h1) this.a;
        if (y6h1Var != null) {
            arrayList.addAll(y6h1Var.a());
            ArrayList arrayListR = gxo1.r(r6h1Var2.a);
            if (!arrayListR.isEmpty()) {
                arrayList.addAll(arrayListR);
            }
            Long l = (Long) this.c;
            return b(y6h1Var, r6h1Var2, l != null ? l.longValue() : 0L, arrayList);
        }
        long jLongValue = 0;
        y6h1 y6h1Var2 = y6h1.i;
        Long l2 = (Long) this.c;
        if (l2 != null) {
            jLongValue = l2.longValue();
        }
        arrayList.add("No location!");
        return b(y6h1Var2, r6h1Var2, jLongValue, arrayList);
    }

    public abstract q6h1 b(y6h1 y6h1Var, r6h1 r6h1Var, long j, ArrayList arrayList);

    public void c(long j) {
        this.c = Long.valueOf(j);
    }

    public void d(y6h1 y6h1Var) {
        this.a = y6h1Var;
    }

    public void e(r6h1 r6h1Var) {
        this.b = r6h1Var;
    }

    public xjn() {
        this.d = new ArrayList();
    }
}
