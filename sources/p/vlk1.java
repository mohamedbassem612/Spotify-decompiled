package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vlk1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vlk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        boolean z;
        l0l l0lVar;
        kx7 kx7Var;
        kx7 kx7Var2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((wlk1) obj2).a(boa0.c);
                break;
            case 1:
                ix5 ix5Var = (ix5) obj;
                nnr nnrVar = ix5Var.d;
                vtk1 vtk1Var = (vtk1) obj2;
                rku rkuVar = vtk1Var.i;
                l0l l0lVar2 = ix5Var.c;
                if (l0lVar2 != null) {
                    l0lVar2.getName();
                }
                ix5 ix5Var2 = vtk1Var.f;
                (ix5Var2 != null ? Double.valueOf(ix5Var2.a) : "null").toString();
                double d = ix5Var.a;
                if (0.0d <= d && d <= 1.0d && l0lVar2 != null) {
                    ix5 ix5Var3 = vtk1Var.f;
                    if (ix5Var3 == null || (l0lVar = ix5Var3.c) == null) {
                        z = false;
                    } else if (!u890.j(l0lVar.j(), l0lVar2.j())) {
                        z = true;
                    } else if (l0lVar.l() && l0lVar2.l()) {
                        nnr nnrVar2 = ix5Var3.d;
                        z = !u890.j((nnrVar2 == null || (kx7Var2 = nnrVar2.B.a) == null) ? null : kx7Var2.a, (nnrVar == null || (kx7Var = nnrVar.B.a) == null) ? null : kx7Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        utk1 utk1Var = vtk1Var.g;
                        if (utk1Var != null && utk1Var.g() > 0) {
                            vtk1Var.c(utk1Var);
                        }
                        vtk1Var.f = null;
                        vtk1Var.g = null;
                        rkuVar.a();
                    }
                    ix5 ix5Var4 = vtk1Var.f;
                    if (ix5Var4 != null) {
                        double d2 = d - ix5Var4.a;
                        utk1 utk1Var2 = vtk1Var.g;
                        if (d2 >= 0.25d) {
                            if (utk1Var2 != null) {
                                if (utk1Var2.g() > 0) {
                                    vtk1Var.c(utk1Var2);
                                }
                                vtk1Var.g = null;
                                rkuVar.a();
                            }
                            double d3 = ix5Var4.a;
                            double d4 = ix5Var.a;
                            nnr nnrVar3 = ix5Var.d;
                            h06 h06Var = (h06) vtk1Var.d.b.h();
                            if (h06Var == null) {
                                h06Var = h06.b;
                            }
                            vtk1Var.g = new utk1(d3, d4, l0lVar2, nnrVar3, h06Var, ix5Var.e, ix5Var.f && l0lVar2.F());
                            rkuVar.b(Observable.timer(60L, TimeUnit.SECONDS, vtk1Var.b).observeOn(vtk1Var.c).subscribe((Consumer<? super Long>) new rdj1(vtk1Var, (byte) 8)));
                        } else if (utk1Var2 != null) {
                            if (utk1Var2.f() - d >= 0.01d) {
                                utk1Var2.k(utk1Var2.f() - d);
                                utk1Var2.j(utk1Var2.g() + 1);
                            } else if (d - utk1Var2.f() >= 0.01d) {
                                if (utk1Var2.g() > 0) {
                                    vtk1Var.c(utk1Var2);
                                }
                                vtk1Var.g = null;
                                rkuVar.a();
                            }
                        }
                    }
                    vtk1Var.f = ix5Var;
                    break;
                }
                break;
            case 2:
                double dDoubleValue = ((Number) obj).doubleValue();
                av7 av7Var = ((euk1) obj2).d;
                if (av7Var != null) {
                    av7Var.m(dDoubleValue);
                }
                break;
            case 3:
                ((AtomicReference) obj2).set((flb1) obj);
                break;
            default:
                ((h5l1) obj2).t = false;
                break;
        }
    }
}
