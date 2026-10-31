package p;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c7i0 implements b431 {
    public final /* synthetic */ o3e0 a;
    public final /* synthetic */ xab1 b;

    public c7i0(o3e0 o3e0Var, xab1 xab1Var) {
        this.a = o3e0Var;
        this.b = xab1Var;
    }

    public final void a(Object obj, String str) {
        String str2;
        u3i0 u3i0Var = (u3i0) obj;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(u3i0Var.a);
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal != 844) {
            str2 = iOrdinal != 926 ? "unknown" : "track";
        } else {
            str2 = "episode";
        }
        String strH = gvg.h("spotify:internal:media-trimmer:", str2, ":", s4b1VarX.h());
        a1r0 a1r0Var = (a1r0) this.a.c;
        u3i0 u3i0VarA = u3i0.a(u3i0Var, null, null, 15);
        Bundle bundle = new Bundle();
        bundle.putParcelable("mediatrimmer.args", u3i0VarA);
        a1r0.j(a1r0Var, strH, (String) null, bundle, false, 10);
    }

    public final void unregister() {
        this.b.d((CancellationException) null);
    }
}
