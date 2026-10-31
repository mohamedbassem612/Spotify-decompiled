package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class jye0 implements Update {
    public static final jye0 a = new jye0();

    public final Next a(Object obj, Object obj2) {
        lye0 lye0Var = (lye0) obj;
        dye0 dye0Var = (dye0) obj2;
        String str = lye0Var.a;
        String str2 = lye0Var.b;
        zzy zzyVar = lye0Var.c;
        if (dye0Var.equals(cye0.a)) {
            return Next.a(Collections.singleton(new yxe0(zzyVar, str2, str)));
        }
        if (dye0Var.equals(bye0.a)) {
            return Next.h(new lye0(str, str2, zzyVar, lye0Var.d, lye0Var.e, false, lye0Var.g, lye0Var.h));
        }
        eg.o();
        return null;
    }
}
