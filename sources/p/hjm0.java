package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hjm0 implements nve0 {
    public final /* synthetic */ byte a = 0;
    public final Update b;
    public final Connectable c;

    public hjm0(Class cls, Class cls2, Class cls3, nve0 nve0Var) {
        this.b = new gjm0(cls2, cls, nve0Var);
        this.c = new qn(nve0Var, cls3, (byte) 11);
    }

    public final Connectable a() {
        byte b = this.a;
        qn qnVar = this.c;
        switch (b) {
            case 0:
                return qnVar;
            default:
                return (bc31) qnVar;
        }
    }

    public final Update b() {
        byte b = this.a;
        gjm0 gjm0Var = this.b;
        switch (b) {
            case 0:
                return gjm0Var;
            default:
                return (dq7) gjm0Var;
        }
    }

    public hjm0(dq7 dq7Var, bc31 bc31Var) {
        this.b = dq7Var;
        this.c = bc31Var;
    }
}
