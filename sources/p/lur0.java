package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class lur0 implements Update {
    public static final lur0 a = new lur0();

    public final Next a(Object obj, Object obj2) {
        d600 d600Var = (d600) obj2;
        if (d600Var.equals(u000.a)) {
            return Next.a(Collections.singleton(x9w.c));
        }
        if (d600Var.equals(k200.a)) {
            return Next.a(Collections.singleton(oew.c));
        }
        if (d600Var instanceof c200) {
            znb1 znb1Var = ((c200) d600Var).a;
            return u890.j(znb1Var, ylb1.a) ? Next.i(new uhm0(znb1Var), Collections.singleton(zcw.c)) : Next.h(new uhm0(znb1Var));
        }
        if (d600Var instanceof i200) {
            return Next.a(Collections.singleton(new vdw(((i200) d600Var).a)));
        }
        eg.o();
        return null;
    }
}
