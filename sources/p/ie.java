package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.core.os.OperationCanceledException;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ie(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        boolean z2;
        long j;
        Date date;
        xd xdVar;
        String str = null;
        switch (this.a) {
            case 0:
                le leVar = (le) this.b;
                xd xdVar2 = (xd) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                Collection collection = (HashSet) this.e;
                Collection collection2 = (HashSet) this.f;
                Collection collection3 = (HashSet) this.g;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) ((ne) this.h).d;
                String str2 = (String) leVar.c;
                int i = leVar.b;
                Long l = (Long) leVar.f;
                String str3 = (String) leVar.d;
                try {
                    e4x0 e4x0Var = ne.f;
                    if (((xd) e4x0Var.u0().c) == null) {
                        z2 = false;
                    } else {
                        xd xdVar3 = (xd) e4x0Var.u0().c;
                        if (xdVar3 != null) {
                            try {
                                str = xdVar3.i;
                            } catch (Throwable th) {
                                th = th;
                                z = false;
                            }
                        }
                        if (str == xdVar2.i) {
                            if (!atomicBoolean.get() && str2 == null && i == 0) {
                                atomicBoolean2.set(false);
                                return;
                            }
                            Date date2 = xdVar2.a;
                            if (leVar.b != 0) {
                                j = 1000;
                                date = new Date(((long) leVar.b) * 1000);
                                xdVar2 = xdVar2;
                            } else {
                                j = 1000;
                                if (leVar.e != 0) {
                                    date2 = new Date((((long) leVar.e) * 1000) + new Date().getTime());
                                }
                                date = date2;
                            }
                            if (str2 == null) {
                                xdVar = xdVar2;
                                str2 = xdVar.e;
                            } else {
                                xdVar = xdVar2;
                            }
                            String str4 = str2;
                            String str5 = xdVar.h;
                            String str6 = xdVar.i;
                            if (!atomicBoolean.get()) {
                                collection = xdVar.b;
                            }
                            Collection collection4 = collection;
                            if (!atomicBoolean.get()) {
                                collection2 = xdVar.c;
                            }
                            Collection collection5 = collection2;
                            if (!atomicBoolean.get()) {
                                collection3 = xdVar.d;
                            }
                            Collection collection6 = collection3;
                            oe oeVar = xdVar.f;
                            Date date3 = new Date();
                            Date date4 = l != null ? new Date(l.longValue() * j) : xdVar.t;
                            if (str3 == null) {
                                str3 = xdVar.X;
                            }
                            e4x0Var.u0().S(new xd(str4, str5, str6, collection4, collection5, collection6, oeVar, date, date3, date4, str3), true);
                            z2 = false;
                            atomicBoolean2.set(z);
                            throw th;
                        }
                        z2 = false;
                    }
                    atomicBoolean2.set(z2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
                break;
            default:
                vq70 vq70Var = (vq70) this.b;
                zx70 zx70Var = (zx70) this.c;
                Matrix matrix = (Matrix) this.d;
                zx70 zx70Var2 = (zx70) this.e;
                Rect rect = (Rect) this.f;
                qq70 qq70Var = (qq70) this.g;
                mzc mzcVar = (mzc) this.h;
                if (!vq70Var.S0) {
                    mzcVar.c(new OperationCanceledException("ImageAnalysis is detached"));
                    return;
                }
                fm61 fm61Var = new fm61(zx70Var2, null, new b19(zx70Var.Q0().a(), zx70Var.Q0().getTimestamp(), vq70Var.e ? 0 : vq70Var.b, matrix));
                if (!rect.isEmpty()) {
                    Rect rect2 = new Rect(rect);
                    if (!rect2.intersect(0, 0, fm61Var.f, fm61Var.g)) {
                        rect2.setEmpty();
                    }
                    synchronized (fm61Var.d) {
                        break;
                    }
                }
                qq70Var.a(fm61Var);
                mzcVar.b((Object) null);
                return;
        }
    }
}
