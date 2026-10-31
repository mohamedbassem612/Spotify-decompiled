package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ti21 implements Update {
    public static final ti21 a = new ti21();

    public final Next a(Object obj, Object obj2) {
        ri21 ri21Var = (ri21) obj2;
        String str = ((xi21) obj).a;
        if (ri21Var.equals(fi21.a)) {
            return Next.a(Collections.singleton(new vh21(false)));
        }
        if (ri21Var instanceof oi21) {
            return Next.i(new xi21(str, false), Collections.singleton(xh21.a));
        }
        if (ri21Var.equals(pi21.a)) {
            return Next.a(Collections.singleton(new vh21(true)));
        }
        String str2 = null;
        if (!(ri21Var instanceof qi21)) {
            eg.o();
            return null;
        }
        qi21 qi21Var = (qi21) ri21Var;
        xi21 xi21Var = new xi21(str, true);
        String str3 = qi21Var.a;
        if (str3 != null && str3.length() != 0) {
            str2 = str3;
        }
        return Next.i(xi21Var, Collections.singleton(new yh21(str2, qi21Var.b)));
    }
}
