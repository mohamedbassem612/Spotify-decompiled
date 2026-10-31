package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r9x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu0 b;

    public /* synthetic */ r9x0(uu0 uu0Var, byte b) {
        this.a = b;
        this.b = uu0Var;
    }

    public final void accept(Object obj) {
        int i;
        byte b = this.a;
        uu0 uu0Var = this.b;
        switch (b) {
            case 0:
                s8x0 s8x0Var = (s8x0) obj;
                obx0 obx0Var = s8x0Var.d;
                tv80 tv80Var = s8x0Var.e;
                bm6 bm6Var = new bm6(true, false, false, false, false, (ok51) null, false, (p860) null, 1978);
                String str = obx0Var.b;
                fm6 fm6Var = new fm6(str, ((c4n0) uu0Var.b).getViewUri(), (String) null, bm6Var);
                if (!((em6) uu0Var.g).a.a()) {
                    mfm mfmVar = (mfm) ((idd1) uu0Var.h).getValue();
                    Observable observableA = ((js6) uu0Var.c).a(fm6Var);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVar, observableA, yon1.V0(), new bjm(6, str, (String) null), tv80Var, 16);
                } else {
                    kly0 kly0Var = (kly0) uu0Var.e;
                    if (tv80Var == null) {
                        ((yhm) kly0Var.get()).a(fm6Var, (tv80) null);
                    } else {
                        ((yhm) kly0Var.get()).a(fm6Var, tv80Var);
                    }
                }
                break;
            case 1:
                t8x0 t8x0Var = (t8x0) obj;
                obx0 obx0Var2 = t8x0Var.d;
                tv80 tv80Var2 = t8x0Var.e;
                g830 g830Var = new g830(obx0Var2.b, obx0Var2.c, obx0Var2.e);
                kly0 kly0Var2 = (kly0) uu0Var.e;
                if (tv80Var2 == null) {
                    ((yhm) kly0Var2.get()).a(g830Var, (tv80) null);
                } else {
                    ((yhm) kly0Var2.get()).a(g830Var, tv80Var2);
                }
                break;
            case 2:
                u8x0 u8x0Var = (u8x0) obj;
                obx0 obx0Var3 = u8x0Var.c;
                boolean z = u8x0Var.d;
                tv80 tv80Var3 = u8x0Var.e;
                Set set = s4b1.f;
                String str2 = obx0Var3.b;
                String strS = uic.x(str2).s();
                if (strS != null) {
                    nbx0 nbx0Var = obx0Var3.a;
                    if (u890.j(nbx0Var, fbx0.a)) {
                        i = 1;
                    } else if (u890.j(nbx0Var, hbx0.a)) {
                        i = 2;
                    } else if (nbx0Var instanceof kbx0) {
                        i = 3;
                    }
                    bo30 bo30Var = new bo30(obx0Var3.b, obx0Var3.c, obx0Var3.e, strS, ((c4n0) uu0Var.b).getViewUri(), i, z);
                    mfm mfmVar2 = (mfm) ((idd1) uu0Var.h).getValue();
                    wn30 wn30Var = (wn30) ((kly0) uu0Var.f).get();
                    mr20 mr20VarU = rqt0.u(new m441(new rzu(wn30Var.a(bo30Var, (jhm) null), bo30Var, wn30Var, (lnm) null, (byte) 13)));
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    mfm.d(mfmVar2, mr20VarU, yon1.d1(), new bjm(6, str2, (String) null), tv80Var3, 16);
                    break;
                }
                break;
            default:
                v8x0 v8x0Var = (v8x0) obj;
                tv80 tv80Var4 = v8x0Var.e;
                String str3 = v8x0Var.d.b;
                eoc0 eoc0Var = new eoc0(str3, ((c4n0) uu0Var.b).getViewUri(), mno1.k0);
                if (!uu0Var.a) {
                    mfm mfmVar3 = (mfm) ((idd1) uu0Var.h).getValue();
                    Observable observableA2 = ((ywc0) uu0Var.d).a(eoc0Var);
                    bjm bjmVar = new bjm(6, str3, (String) null);
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    mfm.b(mfmVar3, observableA2, yon1.a1(), bjmVar, tv80Var4, 16);
                } else {
                    kly0 kly0Var3 = (kly0) uu0Var.e;
                    if (tv80Var4 == null) {
                        ((yhm) kly0Var3.get()).a(eoc0Var, (tv80) null);
                    } else {
                        ((yhm) kly0Var3.get()).a(eoc0Var, tv80Var4);
                    }
                }
                break;
        }
    }
}
