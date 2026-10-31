package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class e8t0 implements Update {
    public final Next a(Object obj, Object obj2) {
        k8t0 k8t0Var = (k8t0) obj;
        d8t0 d8t0Var = (d8t0) obj2;
        zmp0 zmp0Var = k8t0Var.a;
        if (d8t0Var.equals(b8t0.a)) {
            String str = k8t0Var.b.b;
            return str.equals("") ? Next.j() : Next.a(Collections.singleton(new z7t0(str)));
        }
        if (d8t0Var.equals(c8t0.a)) {
            String str2 = zmp0Var.h;
            if (str2 == null) {
                str2 = "";
            }
            return str2.equals("") ? Next.j() : Next.a(Collections.singleton(new y7t0(str2)));
        }
        if (!d8t0Var.equals(a8t0.a)) {
            eg.o();
            return null;
        }
        String str3 = zmp0Var.e.d;
        if (str3 == null) {
            str3 = "";
        }
        return str3.equals("") ? Next.j() : Next.a(Collections.singleton(new x7t0(str3)));
    }
}
