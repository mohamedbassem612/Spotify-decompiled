package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n09 extends zrn {
    public final Context a;
    public final xqg b;
    public final xqg c;
    public final String d;

    public n09(Context context, xqg xqgVar, xqg xqgVar2, String str) {
        if (context == null) {
            bhn0.i("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (xqgVar == null) {
            bhn0.i("Null wallClock");
            throw null;
        }
        this.b = xqgVar;
        if (xqgVar2 == null) {
            bhn0.i("Null monotonicClock");
            throw null;
        }
        this.c = xqgVar2;
        if (str != null) {
            this.d = str;
        } else {
            bhn0.i("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zrn) {
            n09 n09Var = (n09) ((zrn) obj);
            if (this.a.equals(n09Var.a) && this.b.equals(n09Var.b) && this.c.equals(n09Var.c) && this.d.equals(n09Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return l1d.n(this.d, "}", sb);
    }
}
