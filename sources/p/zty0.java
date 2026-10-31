package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zty0 implements Update {
    public final Next a(Object obj, Object obj2) {
        fuy0 fuy0Var = (fuy0) obj;
        xty0 xty0Var = (xty0) obj2;
        boolean zEquals = xty0Var.equals(sty0.a);
        mty0 mty0Var = mty0.c;
        if (zEquals) {
            return Next.a(Collections.singleton(mty0Var));
        }
        if (xty0Var.equals(uty0.a)) {
            return Next.a(Collections.singleton(new oty0(!((mdr0) fuy0Var.a).d)));
        }
        if (xty0Var instanceof vty0) {
            return Next.a(Collections.singleton(new lty0(((vty0) xty0Var).a)));
        }
        if (xty0Var instanceof wty0) {
            wty0 wty0Var = (wty0) xty0Var;
            return Next.h(new fuy0(new mdr0(mqo1.A(wty0Var.a), wty0Var.b)));
        }
        if (xty0Var.equals(rty0.a)) {
            return Next.a(Collections.singleton(nty0.c));
        }
        if (xty0Var instanceof qty0) {
            return ((qty0) xty0Var).a instanceof sb0 ? Next.j() : Next.a(Collections.singleton(mty0Var));
        }
        if (xty0Var.equals(tty0.a)) {
            return Next.h(new fuy0(rdr0.c));
        }
        eg.o();
        return null;
    }
}
