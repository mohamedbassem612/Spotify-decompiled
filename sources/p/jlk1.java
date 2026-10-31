package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class jlk1 implements Update {
    public final Next a(Object obj, Object obj2) {
        kzc kzcVar = (kzc) obj;
        x600 x600Var = (x600) obj2;
        if (!(kzcVar instanceof izc)) {
            if (kzcVar instanceof jzc) {
                return x600Var instanceof kzz ? dro.F((kzz) x600Var) : Next.j();
            }
            eg.o();
            return null;
        }
        if (x600Var instanceof kzz) {
            kzz kzzVar = (kzz) x600Var;
            return ((izc) kzcVar).a.equals(kzzVar.a) ? Next.j() : dro.F(kzzVar);
        }
        if (!(x600Var instanceof o300)) {
            if (x600Var instanceof d500) {
                izc izcVar = (izc) kzcVar;
                return Next.a(Collections.singleton(new yfw(izcVar.d, izcVar.b, izcVar.c)));
            }
            if (x600Var instanceof h500) {
                return Next.a(Collections.singleton(new ehw(((izc) kzcVar).b, 1)));
            }
            eg.o();
            return null;
        }
        String str = ((izc) kzcVar).b;
        sz21 sz21Var = ((o300) x600Var).b;
        if (sz21Var instanceof oz21) {
            return Next.a(Collections.singleton(new qhw(((oz21) sz21Var).a)));
        }
        if (sz21Var instanceof zy21) {
            return Next.a(Collections.singleton(new phw(str, ((zy21) sz21Var).a)));
        }
        if (sz21Var instanceof qz21) {
            return Next.a(Collections.singleton(new faw(((qz21) sz21Var).a, str)));
        }
        if (sz21Var instanceof jz21) {
            return Next.a(Collections.singleton(new ehw(str, ((jz21) sz21Var).a)));
        }
        if (sz21Var instanceof uy21) {
            return Next.a(Collections.singleton(new ehw(str, 1)));
        }
        eg.o();
        return null;
    }
}
