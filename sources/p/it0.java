package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class it0 implements aac0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public it0(hac0 hac0Var) {
        this.a = (byte) 8;
        this.b = hac0Var;
        teg tegVar = teg.c;
        Class<?> cls = hac0Var.getClass();
        reg regVar = (reg) tegVar.a.get(cls);
        this.c = regVar == null ? tegVar.a(cls, null) : regVar;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        byte b = this.a;
        w8c0 w8c0Var = w8c0.d;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (k8c0Var == k8c0.ON_STOP) {
                    ((frr0) obj2).t(((Number) ((ven0) obj).getValue()).longValue());
                }
                break;
            case 1:
                ((ven0) obj).setValue(Boolean.valueOf(((x8c0) obj2).b().a(w8c0Var)));
                break;
            case 2:
                if (k8c0Var.a().a(w8c0Var)) {
                    ((l811) obj).a = false;
                    ((zf30) obj2).s1.d(this);
                }
                break;
            case 3:
                dfd dfdVar = ((uff) obj).G;
                int i = aff.a[k8c0Var.ordinal()];
                if (i == 1) {
                    dfdVar.a = ((ncf) obj2).a.a;
                    break;
                } else if (i == 2) {
                    dfdVar.a = null;
                    break;
                }
                break;
            case 4:
                if (k8c0Var == k8c0.ON_RESUME) {
                    ((ven0) obj).setValue(Boolean.valueOf(((pe) obj2).b(5)));
                }
                break;
            case 5:
                if (k8c0Var == k8c0.ON_START) {
                    ((x8c0) obj).d(this);
                    ((oe41) obj2).d();
                }
                break;
            case 6:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(((x8c0) obj2).b());
                }
                break;
            case 7:
                drp0 drp0Var = (drp0) obj;
                vku vkuVar = drp0Var.o;
                int i2 = brp0.a[k8c0Var.ordinal()];
                if (i2 == 1) {
                    if (vkuVar.a.i() == 0) {
                        drp0Var.f();
                        drp0Var.e();
                        drp0Var.d();
                    }
                    break;
                } else if (i2 == 2) {
                    vkuVar.c();
                    break;
                } else if (i2 == 3) {
                    vkuVar.c();
                    ((f0i) ((dg30) obj2)).a.d(this);
                    break;
                }
                break;
            case 8:
                hac0 hac0Var = (hac0) obj;
                HashMap map = ((reg) obj2).a;
                reg.a((List) map.get(k8c0Var), iac0Var, k8c0Var, hac0Var);
                reg.a((List) map.get(k8c0.ON_ANY), iac0Var, k8c0Var, hac0Var);
                break;
            case 9:
                if (k8c0Var == k8c0.ON_STOP) {
                    ((CompositeDisposable) ((fdc) ((wdm) obj).g).e).g();
                    ((x8c0) obj2).d(this);
                }
                break;
            default:
                uoa uoaVar = (uoa) obj2;
                int i3 = cya1.a[k8c0Var.ordinal()];
                if (i3 == 1) {
                    if (!((Boolean) ((ven0) obj).getValue()).booleanValue()) {
                        uoaVar.p(1);
                        uoaVar.l();
                    }
                    break;
                } else if (i3 == 2) {
                    uoaVar.f();
                    uoaVar.p(3);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ it0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ it0(byte b, Object obj, ven0 ven0Var) {
        this.a = b;
        this.c = obj;
        this.b = ven0Var;
    }
}
