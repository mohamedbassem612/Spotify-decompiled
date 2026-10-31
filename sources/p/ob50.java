package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ob50 implements Update {
    public static final ob50 a = new ob50();

    public final Next a(Object obj, Object obj2) {
        qb50 qb50Var = (qb50) obj;
        m600 m600Var = (m600) obj2;
        if (m600Var.equals(o000.a)) {
            return Next.a(Collections.singleton(s9w.b));
        }
        if (m600Var.equals(o000.c)) {
            if (qb50Var.d) {
                return Next.i(qb50.a(qb50Var, false, true, false, 15), Collections.singleton(new d9w(qb50Var.a)));
            }
            n57.e("User must accept privacy policy to proceed");
            return Next.j();
        }
        if (m600Var.equals(o000.b)) {
            return Next.h(qb50.a(qb50Var, false, false, false, 31));
        }
        if (m600Var.equals(o000.e)) {
            return Next.a(Collections.singleton(new sdw(qb50Var.b)));
        }
        if (m600Var.equals(o000.d)) {
            return Next.h(qb50.a(qb50Var, false, false, true, 15));
        }
        if (m600Var instanceof s100) {
            return Next.h(qb50.a(qb50Var, ((s100) m600Var).a, false, false, 55));
        }
        if (m600Var.equals(o000.f)) {
            return Next.h(qb50.a(qb50Var, false, false, false, 15));
        }
        eg.o();
        return null;
    }
}
