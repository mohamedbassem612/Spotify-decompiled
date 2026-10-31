package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mwa1 implements Connectable, Connection {
    public final mxr a;

    public mwa1(mxr mxrVar) {
        this.a = mxrVar;
    }

    public final Connection L(Consumer consumer) {
        this.a.d = new my71(consumer, (byte) 1);
        return this;
    }

    public final void accept(Object obj) {
        gua1 gua1Var = (gua1) obj;
        int i = gua1Var.a;
        boolean z = gua1Var.b;
        wyr wyrVar = (wyr) this.a.c;
        wyrVar.getClass();
        inl1 inl1Var = (inl1) wyrVar.f;
        int iP = yoi1.p((i - inl1Var.d) / inl1Var.f, 0, inl1Var.e() - 1);
        int i2 = inl1Var.i;
        if (i2 != iP) {
            if (i2 != iP) {
                inl1Var.i = iP;
                inl1Var.h();
            }
            idd1 idd1Var = (idd1) wyrVar.e;
            if (z) {
                ((knl1) idd1Var.getValue()).b.u0(iP);
            } else {
                ((knl1) idd1Var.getValue()).b.y0(iP);
            }
        }
    }

    public final void dispose() {
    }
}
