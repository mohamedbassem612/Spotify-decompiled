package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class kya0 implements Update {
    public static final kya0 a = new kya0();

    public final Next a(Object obj, Object obj2) {
        mya0 mya0Var = (mya0) obj;
        hya0 hya0Var = (hya0) obj2;
        yig1 yig1Var = mya0Var.b;
        if (hya0Var.equals(eya0.a)) {
            return Next.a(Collections.singleton(bya0.b));
        }
        if (hya0Var instanceof fya0) {
            return Next.a(Collections.singleton(new cya0(yig1Var, mya0Var.e, ((fya0) hya0Var).a)));
        }
        if (hya0Var.equals(eya0.b)) {
            return Next.a(Collections.singleton(new aya0(yig1Var)));
        }
        if (hya0Var instanceof gya0) {
            return Next.a(Collections.singleton(new dya0(((gya0) hya0Var).a)));
        }
        eg.o();
        return null;
    }
}
