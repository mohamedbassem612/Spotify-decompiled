package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class rvf0 implements Update {
    public static final rvf0 a = new rvf0();

    public final Next a(Object obj, Object obj2) {
        tvf0 tvf0Var = (tvf0) obj;
        pvf0 pvf0Var = (pvf0) obj2;
        boolean zEquals = pvf0Var.equals(mvf0.a);
        avf0 avf0Var = avf0.c;
        if (zEquals) {
            return Next.a(Collections.singleton(avf0Var));
        }
        if (pvf0Var instanceof nvf0) {
            return Next.a(Collections.singleton(new cvf0(((nvf0) pvf0Var).a)));
        }
        if (pvf0Var.equals(ovf0.a)) {
            return Next.a(Collections.singleton(new bvf0(tvf0Var.a)));
        }
        if (pvf0Var.equals(lvf0.a)) {
            return Next.a(Collections.singleton(avf0Var));
        }
        eg.o();
        return null;
    }
}
