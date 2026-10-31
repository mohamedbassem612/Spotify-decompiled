package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class hc50 implements Update {
    public static final hc50 a = new hc50();

    public final Next a(Object obj, Object obj2) {
        jc50 jc50Var = (jc50) obj;
        fc50 fc50Var = (fc50) obj2;
        String str = jc50Var.a;
        if (fc50Var.equals(ec50.a)) {
            return Next.i(jc50.a(jc50Var, false, false, true, false, 3199), Collections.singleton(new xb50(str, true)));
        }
        if (fc50Var.equals(zb50.a)) {
            return Next.i(jc50.a(jc50Var, false, false, false, true, 2687), Collections.singleton(new xb50(str, false)));
        }
        if (fc50Var instanceof ac50) {
            return Next.i(jc50.a(jc50Var, false, false, false, false, 2559), Collections.singleton(new vb50(jc50Var.b, ((ac50) fc50Var).a)));
        }
        if (fc50Var instanceof bc50) {
            boolean z = ((bc50) fc50Var).a;
            return Next.h(jc50.a(jc50Var, z, !z, false, false, 2175));
        }
        if (fc50Var.equals(cc50.a)) {
            return Next.h(jc50.a(jc50Var, false, false, false, false, 3711));
        }
        if (fc50Var.equals(dc50.a)) {
            return Next.a(Collections.singleton(new wb50(jc50Var.Y)));
        }
        eg.o();
        return null;
    }
}
