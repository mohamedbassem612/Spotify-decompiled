package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class wrh1 implements Update {
    public static final wrh1 a = new wrh1();

    public final Next a(Object obj, Object obj2) {
        urh1 urh1Var = (urh1) obj2;
        String str = ((vrh1) obj).a;
        boolean z = urh1Var instanceof trh1;
        gsh1 gsh1Var = dsh1.a;
        if (z) {
            if (ihc1.y0(ihc1.e1(((trh1) urh1Var).a).toString())) {
                gsh1Var = csh1.a;
            }
            return Next.h(new vrh1(str, gsh1Var));
        }
        if (urh1Var instanceof srh1) {
            return Next.i(new vrh1(str, esh1.a), Collections.singleton(new krh1(str, ihc1.e1(((srh1) urh1Var).a).toString())));
        }
        if (urh1Var.equals(rrh1.a)) {
            return Next.h(new vrh1(str, fsh1.a));
        }
        if (urh1Var.equals(qrh1.a)) {
            return Next.i(new vrh1(str, gsh1Var), Collections.singleton(jrh1.a));
        }
        if (urh1Var.equals(prh1.a)) {
            return Next.h(new vrh1(str, bsh1.a));
        }
        eg.o();
        return null;
    }
}
