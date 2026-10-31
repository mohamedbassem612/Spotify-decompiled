package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w0i0 {
    public final ArrayList a;
    public final Context b;
    public final r4z0 c;

    public w0i0(Context context, boolean z, j2i0 j2i0Var, ArrayList arrayList, long j) {
        this.b = context;
        int i = z ? 2 : 1;
        int i2 = 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + (j2i0Var == null ? 0 : 1));
        this.a = arrayList2;
        this.c = new r4z0(context.getString(2131960157), j, arrayList2);
        if (j2i0Var != null) {
            arrayList2.add(j2i0Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j2i0 j2i0Var2 = (j2i0) it.next();
            if (j2i0Var2.b()) {
                i2++;
                if (i2 >= i) {
                    return;
                }
            } else {
                this.a.add(j2i0Var2);
            }
        }
    }

    public final r4z0 a() {
        r4z0 r4z0Var = this.c;
        if (r4z0Var == null) {
            return new r4z0("", 0L, z6x.a);
        }
        return new r4z0(r4z0Var.a, r4z0Var.b, o7h.d1(r4z0Var.c, 50));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w0i0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w0i0 w0i0Var = (w0i0) obj;
        return u890.j(this.a, w0i0Var.a) && u890.j(this.b, w0i0Var.b) && u890.j(this.c, w0i0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Context context = this.b;
        int iHashCode2 = (iHashCode + (context != null ? context.hashCode() : 0)) * 31;
        r4z0 r4z0Var = this.c;
        return iHashCode2 + (r4z0Var != null ? r4z0Var.hashCode() : 0);
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((j2i0) it.next()).a());
        }
        return "MediaSessionQueue(uris=" + arrayList2 + ")";
    }

    public w0i0() {
        this.a = new ArrayList();
    }
}
