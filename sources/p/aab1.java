package p;

import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aab1 {
    public final /* synthetic */ bab1 a;

    public aab1(bab1 bab1Var) {
        this.a = bab1Var;
    }

    public static void b(aab1 aab1Var) {
        aab1Var.a(smg1.a);
    }

    public static void e(aab1 aab1Var, Object obj) {
        aab1Var.d(obj, smg1.a);
    }

    public final boolean a(p9m p9mVar) {
        bab1 bab1Var = this.a;
        if (!bab1Var.a()) {
            return false;
        }
        bab1Var.c = p9mVar;
        r7h.e0(bab1Var.a);
        return true;
    }

    public final boolean c(Parcelable parcelable, p9m p9mVar) {
        bab1 bab1Var = this.a;
        bw91 bw91Var = bab1Var.a;
        ek60 ek60VarListIterator = bw91Var.listIterator();
        int i = 0;
        while (true) {
            ek60 ek60Var = ek60VarListIterator;
            if (!ek60Var.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((z9b1) ek60Var.next()).b, parcelable)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        bab1Var.c = p9mVar;
        bw91Var.b(i + 1, bw91Var.size());
        return true;
    }

    public final void d(Object obj, p9m p9mVar) {
        bab1 bab1Var = this.a;
        bab1Var.c = p9mVar;
        bab1Var.a.add(new z9b1(UUID.randomUUID(), obj));
    }
}
