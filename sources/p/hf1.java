package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class hf1 implements Update {
    public final Next a(Object obj, Object obj2) {
        gf1 gf1Var = (gf1) obj2;
        if (gf1Var instanceof ff1) {
            ff1 ff1Var = (ff1) gf1Var;
            return Next.a(Collections.singleton(new df1(ff1Var.a, ff1Var.b, ff1Var.c)));
        }
        if (gf1Var instanceof ef1) {
            ef1 ef1Var = (ef1) gf1Var;
            return Next.a(Collections.singleton(new cf1(ef1Var.a, ef1Var.b, ef1Var.c)));
        }
        eg.o();
        return null;
    }
}
