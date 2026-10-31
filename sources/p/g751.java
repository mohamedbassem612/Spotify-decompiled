package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g751 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h751 b;

    public /* synthetic */ g751(h751 h751Var, byte b) {
        this.a = b;
        this.b = h751Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        h751 h751Var = this.b;
        switch (b) {
            case 0:
                od51 od51Var = (od51) obj;
                h751Var.b.e(od51Var);
                svh0 svh0Var = h751Var.h;
                lw41 lw41Var = od51Var.a;
                if ((lw41Var instanceof lw41) && !(lw41Var instanceof kw41) && !svh0Var.b) {
                    svh0Var.b = true;
                    dt30 dt30Var = (dt30) svh0Var.c;
                    if (dt30Var != null) {
                        dt30Var.d();
                    }
                    svh0Var.c = null;
                    break;
                }
                break;
            default:
                i751 i751Var = h751Var.c;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    i751Var.a((hd51) it.next());
                }
                break;
        }
    }
}
