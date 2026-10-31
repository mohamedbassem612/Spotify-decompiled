package p;

import com.google.android.gms.common.api.AvailabilityException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m9n1 {
    public int d;
    public final y36 b = new y36(0);
    public final bsd1 c = new bsd1();
    public boolean e = false;
    public final y36 a = new y36(0);

    public m9n1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.put(((mt50) it.next()).f, (Object) null);
        }
        this.d = ((jv81) this.a).c;
    }

    public final t36 a() {
        return this.a.keySet();
    }

    public final hfp1 b() {
        return this.c.a;
    }

    public final void c(gi5 gi5Var, lal lalVar, String str) {
        y36 y36Var = this.a;
        y36Var.put(gi5Var, lalVar);
        y36 y36Var2 = this.b;
        y36Var2.put(gi5Var, str);
        this.d--;
        if (!lalVar.j()) {
            this.e = true;
        }
        if (this.d == 0) {
            boolean z = this.e;
            bsd1 bsd1Var = this.c;
            if (z) {
                bsd1Var.a(new AvailabilityException(y36Var));
            } else {
                bsd1Var.b(y36Var2);
            }
        }
    }
}
