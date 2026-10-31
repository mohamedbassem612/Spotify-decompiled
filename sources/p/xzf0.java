package p;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xzf0 implements ebr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xzf0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rl1 rl1Var = (rl1) obj2;
                nwp nwpVarA = ((ayf0) ((kly0) rl1Var.d).get()).a((dg30) rl1Var.c, (Context) rl1Var.e, rl1Var.b, q7r0Var);
                ynb0 ynb0VarA = xqu.a(nwpVarA.M);
                ynb0 ynb0VarA2 = xqu.a(nwpVarA.O);
                r2p0 r2p0Var = (r2p0) ynb0VarA.get();
                v4p0 v4p0Var = (v4p0) ynb0VarA2.get();
                r2p0Var.getClass();
                v4p0Var.getClass();
                return new cc1((ix81) v4p0Var.a.get(), new awj((bsp) new wdm(r2p0Var, v4p0Var, q7r0Var).Y, (byte) 5));
            default:
                return ((w7w) ((yge0) obj2).b).c((aqr0) parcelable, q7r0Var, (rih1) obj);
        }
    }
}
