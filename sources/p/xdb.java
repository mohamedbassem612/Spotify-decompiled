package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xdb implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdb b;

    public /* synthetic */ xdb(zdb zdbVar, byte b) {
        this.a = b;
        this.b = zdbVar;
    }

    public final void accept(Object obj) {
        p6r0 p6r0VarA2;
        j0f0 j0f0Var;
        switch (this.a) {
            case 0:
                nlb1 nlb1Var = (oob1) obj;
                nlb1 nlb1Var2 = nlb1Var instanceof nlb1 ? nlb1Var : null;
                this.b.b2 = nlb1Var2 != null ? nlb1Var2.c : null;
                return;
            default:
                g6o g6oVar = (j6o) obj;
                yit yitVarC = gto1.C(g6oVar);
                zdb zdbVar = this.b;
                if (yitVarC != null) {
                    kg0 kg0Var = zdbVar.G1;
                    if (kg0Var != null) {
                        kg0.e(kg0Var, yitVarC, (ifl1) null);
                        return;
                    } else {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                }
                if ((g6oVar instanceof h6o) || !(g6oVar instanceof g6o)) {
                    return;
                }
                int i = g6oVar.a;
                t8h1 t8h1Var = zdbVar.S1;
                if (t8h1Var == null) {
                    u890.C("ubiPageLocationChangeListener");
                    throw null;
                }
                int iC = l1d.C(i);
                if (iC == 0) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    p6r0VarA2 = yon1.A2();
                } else if (iC == 1) {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    p6r0VarA2 = yon1.y2();
                } else if (iC != 2) {
                    eg.o();
                    return;
                } else {
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    p6r0VarA2 = yon1.z2();
                }
                t8h1.n(t8h1Var, p6r0VarA2);
                Context contextP0 = zdbVar.P0();
                gf6 gf6Var = new gf6(zdbVar, i, (byte) 2);
                vdb vdbVar = new vdb(zdbVar, (byte) 3);
                q01 q01Var = new q01(0, zdbVar, zdb.class, "restoreLoginPageIdentifier", "restoreLoginPageIdentifier()V", 0, (byte) 22);
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    j0f0Var = new j0f0(contextP0.getString(2131959672), contextP0.getString(2131959671), null, new h0f0(contextP0.getString(2131959668), gf6Var), null, null, vdbVar, q01Var, 52);
                } else if (iC2 == 1) {
                    j0f0Var = new j0f0(contextP0.getString(2131954271), contextP0.getString(2131954270), null, new h0f0(contextP0.getString(2131959673), gf6Var), null, null, vdbVar, q01Var, 52);
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return;
                    }
                    j0f0Var = new j0f0(contextP0.getString(2131959670), contextP0.getString(2131959669), null, new h0f0(contextP0.getString(2131959668), gf6Var), null, null, vdbVar, q01Var, 52);
                }
                zdbVar.a2.setValue(j0f0Var);
                return;
        }
    }
}
