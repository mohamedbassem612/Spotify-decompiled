package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class qvr0 implements Update {
    public static final qvr0 a = new qvr0();

    public final Next a(Object obj, Object obj2) {
        svr0 svr0Var = (svr0) obj;
        pvr0 pvr0Var = (pvr0) obj2;
        String str = svr0Var.c;
        if (pvr0Var instanceof kvr0) {
            String str2 = ((kvr0) pvr0Var).a;
            return (svr0Var.d == null || svr0Var.e) ? Next.i(svr0.a(svr0Var, null, str2, 27), Collections.singleton(new bvr0(str2, null))) : Next.h(svr0.a(svr0Var, ldh1.a, str2, 25));
        }
        if (pvr0Var instanceof nvr0) {
            nvr0 nvr0Var = (nvr0) pvr0Var;
            if (str != null) {
                return Next.a(Collections.singleton(new bvr0(str, nvr0Var.a)));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (pvr0Var instanceof lvr0) {
            lvr0 lvr0Var = (lvr0) pvr0Var;
            if (str != null) {
                return Next.a(Collections.singleton(new avr0(str, lvr0Var.a)));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (pvr0Var.equals(jvr0.a)) {
            return Next.h(svr0.a(svr0Var, kdh1.a, null, 29));
        }
        if (pvr0Var.equals(ovr0.a)) {
            return Next.i(svr0.a(svr0Var, odh1.a, null, 29), Collections.singleton(zur0.b));
        }
        if (pvr0Var.equals(mvr0.a)) {
            return Next.a(Collections.singleton(yur0.b));
        }
        eg.o();
        return null;
    }
}
