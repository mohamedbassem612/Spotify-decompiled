package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class frs implements Update {
    public static final frs a = new frs();

    public final Next a(Object obj, Object obj2) {
        tw91 tw91Var = (tw91) obj;
        ow91 ow91Var = (ow91) obj2;
        tw91Var.getClass();
        ow91Var.getClass();
        String str = tw91Var.a;
        if (ow91Var instanceof mw91) {
            return ((mw91) ow91Var).a instanceof fx91 ? Next.j() : Next.a(Collections.singleton(new lw91(str, true)));
        }
        if (ow91Var.equals(nw91.a)) {
            return Next.a(Collections.singleton(new lw91(str, false)));
        }
        eg.o();
        return null;
    }
}
