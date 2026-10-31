package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class q950 implements Update {
    public static final q950 a = new q950();

    public final Next a(Object obj, Object obj2) {
        j000 j000Var = (j000) obj2;
        v850 v850Var = ((s950) obj).a;
        if (j000Var.equals(j000.a)) {
            return Next.j();
        }
        if (j000Var.equals(j000.b)) {
            return Next.a(Collections.singleton(q9w.b));
        }
        if (j000Var.equals(j000.d)) {
            return Next.i(new s950(v850Var, true), Collections.singleton(e9w.a));
        }
        if (j000Var.equals(j000.c)) {
            return Next.i(new s950(v850Var, false), Collections.singleton(haw.a));
        }
        eg.o();
        return null;
    }
}
