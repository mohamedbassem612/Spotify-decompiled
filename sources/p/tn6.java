package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class tn6 implements Update {
    public static final tn6 a = new tn6();

    public final Next a(Object obj, Object obj2) {
        vn6 vn6Var = (vn6) obj;
        sn6 sn6Var = (sn6) obj2;
        if (sn6Var instanceof pn6) {
            pn6 pn6Var = (pn6) sn6Var;
            return Next.a(Effects.a(new mn6[]{new mn6(pn6Var.a, pn6Var.b)}));
        }
        if (sn6Var instanceof on6) {
            on6 on6Var = (on6) sn6Var;
            return Next.a(Effects.a(new mn6[]{new mn6(on6Var.a, on6Var.b)}));
        }
        if (sn6Var instanceof rn6) {
            return Next.a(Effects.a(new nn6[]{new nn6(vn6Var.d)}));
        }
        if (sn6Var instanceof qn6) {
            qn6 qn6Var = (qn6) sn6Var;
            return Next.a(Effects.a(new mn6[]{new mn6(qn6Var.a, qn6Var.b)}));
        }
        eg.o();
        return null;
    }
}
