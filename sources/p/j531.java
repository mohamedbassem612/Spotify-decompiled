package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class j531 implements Update {
    public static final j531 a = new j531();

    public final Next a(Object obj, Object obj2) {
        n531 n531Var = (n531) obj;
        e531 e531Var = (e531) obj2;
        if (e531Var instanceof c531) {
            return Next.a(Collections.singleton(a531.a));
        }
        if (!(e531Var instanceof d531)) {
            eg.o();
            return null;
        }
        d531 d531Var = (d531) e531Var;
        c631 c631Var = ((h631) n531Var.d.get(d531Var.a)).g;
        String str = n531Var.g;
        if (str == null) {
            str = c631Var.c;
        }
        return Next.a(Collections.singleton(new b531(str, c631Var.a, c631Var.b, c631Var.d, d531Var.b)));
    }
}
