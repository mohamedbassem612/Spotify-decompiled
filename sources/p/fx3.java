package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class fx3 implements Update {
    public final Next a(Object obj, Object obj2) {
        hx3 hx3Var = (hx3) obj;
        ex3 ex3Var = (ex3) obj2;
        c2b0 c2b0Var = hx3Var.b;
        String str = hx3Var.a;
        boolean z = true;
        if (ex3Var.equals(dx3.a)) {
            return hx3Var.c ? Next.j() : Next.i(new hx3(str, c2b0Var, true), Collections.singleton(new rw3(str)));
        }
        if (!(ex3Var instanceof cx3)) {
            if (ex3Var.equals(bx3.a)) {
                return Next.a(Collections.singleton(sw3.i));
            }
            eg.o();
            return null;
        }
        hx3 hx3Var2 = new hx3(str, c2b0Var, false);
        switch (((cx3) ex3Var).a.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 1:
            case 2:
                z = false;
                break;
            default:
                eg.o();
                return null;
        }
        return Next.i(hx3Var2, Collections.singleton(new tw3(str, c2b0Var, z)));
    }
}
