package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class bty0 implements Update {
    public static final bty0 a = new bty0();

    public final Next a(Object obj, Object obj2) {
        aty0 aty0Var = (aty0) obj2;
        boolean z = ((gty0) obj).a;
        if (aty0Var.equals(xsy0.a)) {
            return Next.a(Collections.singleton(new usy0(z)));
        }
        boolean zEquals = aty0Var.equals(ysy0.a);
        tsy0 tsy0Var = tsy0.b;
        vsy0 vsy0Var = vsy0.b;
        if (zEquals) {
            return z ? Next.a(Collections.singleton(vsy0Var)) : Next.a(Collections.singleton(tsy0Var));
        }
        if (aty0Var.equals(zsy0.a)) {
            return z ? Next.a(Collections.singleton(vsy0Var)) : Next.a(Collections.singleton(tsy0Var));
        }
        eg.o();
        return null;
    }
}
