package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class hwd1 implements Update {
    public static final hwd1 a = new hwd1();

    public final Next a(Object obj, Object obj2) {
        shm0 shm0Var = (shm0) obj;
        a600 a600Var = (a600) obj2;
        if (a600Var instanceof ixz) {
            return Next.h(shm0.a(shm0Var, ((ixz) a600Var).a, false, 11));
        }
        if (a600Var instanceof kvz) {
            return (!shm0Var.c || shm0Var.d) ? Next.j() : Next.i(shm0.a(shm0Var, false, true, 7), Collections.singleton(new eaw(((kvz) a600Var).a)));
        }
        if (a600Var instanceof rxz) {
            return Next.i(shm0.a(shm0Var, false, false, 7), Collections.singleton(new gdw(((rxz) a600Var).a)));
        }
        if (a600Var.equals(qxz.a)) {
            return Next.h(shm0.a(shm0Var, false, false, 7));
        }
        eg.o();
        return null;
    }
}
