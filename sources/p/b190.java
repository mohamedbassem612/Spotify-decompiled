package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class b190 implements Update {
    public static final b190 a = new b190();

    public final Next a(Object obj, Object obj2) {
        pnb1 pnb1Var = (pnb1) obj;
        qyz qyzVar = (qyz) obj2;
        if (pnb1Var.equals(umb1.a) || pnb1Var.equals(dnb1.a) || pnb1Var.equals(emb1.a) || (pnb1Var instanceof cmb1) || (pnb1Var instanceof gmb1) || (pnb1Var instanceof vlb1) || (pnb1Var instanceof bnb1) || (pnb1Var instanceof anb1)) {
            return Next.j();
        }
        if (!(pnb1Var instanceof fmb1)) {
            eg.o();
            return null;
        }
        if (qyzVar.equals(qyz.a)) {
            fmb1 fmb1Var = (fmb1) pnb1Var;
            return fmb1Var.c ? Next.a(Collections.singleton(new rcw(fmb1Var.a, null))) : Next.a(Collections.singleton(new u9w()));
        }
        eg.o();
        return null;
    }
}
