package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ury0 implements Update {
    public final Next a(Object obj, Object obj2) {
        sry0 sry0Var = (sry0) obj2;
        boolean z = ((xry0) obj).a;
        boolean z2 = sry0Var instanceof ory0;
        kry0 kry0Var = kry0.e;
        iry0 iry0Var = iry0.e;
        if (z2) {
            return Next.a(z ? Collections.singleton(kry0Var) : Collections.singleton(iry0Var));
        }
        if (sry0Var instanceof nry0) {
            return Next.a(Collections.singleton(new jry0(z)));
        }
        if (sry0Var instanceof rry0) {
            return Next.a(z ? Collections.singleton(kry0Var) : Collections.singleton(iry0Var));
        }
        if (sry0Var instanceof mry0) {
            return !((mry0) sry0Var).a ? Next.a(Collections.singleton(iry0Var)) : Next.j();
        }
        if ((sry0Var instanceof qry0) || (sry0Var instanceof pry0)) {
            return Next.a(Collections.singleton(iry0Var));
        }
        eg.o();
        return null;
    }
}
