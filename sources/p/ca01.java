package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ca01 implements Update {
    public final Next a(Object obj, Object obj2) {
        fa01 fa01Var = (fa01) obj;
        x901 x901Var = (x901) obj2;
        boolean zEquals = x901Var.equals(v901.a);
        r901 r901Var = r901.a;
        if (zEquals) {
            return Next.a(Collections.singleton(r901Var));
        }
        if (x901Var instanceof w901) {
            return Next.a(f46.S0(new u901[]{new s901(fa01Var.b, fa01Var.c, ((w901) x901Var).a), t901.a, r901Var}));
        }
        eg.o();
        return null;
    }
}
