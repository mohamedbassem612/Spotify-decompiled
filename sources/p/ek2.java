package p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ek2 implements aac0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ek2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        int iNextIndex;
        vq71 vq71Var;
        Object obj = null;
        str = null;
        String str = null;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                if (k8c0Var == k8c0.ON_RESUME) {
                    ((iu30) this.b).invoke(gm2.a);
                    return;
                }
                return;
            case 1:
                kid kidVar = (kid) this.b;
                VideoSurfaceView videoSurfaceView = kidVar.g1;
                vku vkuVar = kidVar.d1;
                if (k8c0Var == k8c0.ON_RESUME) {
                    vkuVar.a(kidVar.W0.observeOn(kidVar.a1).subscribe(new iid(kidVar, (byte) 1)));
                    return;
                }
                if (k8c0Var == k8c0.ON_PAUSE) {
                    vkuVar.c();
                    uoa uoaVar = kidVar.j1;
                    if (uoaVar != null) {
                        uoaVar.f();
                    }
                    videoSurfaceView.setVisibility(8);
                    kidVar.f1.setVisibility(8);
                    kidVar.h1.setVisibility(8);
                    uoa uoaVar2 = kidVar.j1;
                    if (uoaVar2 != null) {
                        uoaVar2.i();
                    }
                    uoa uoaVar3 = kidVar.j1;
                    if (uoaVar3 != null) {
                        uoaVar3.k(videoSurfaceView);
                    }
                    kidVar.j1 = null;
                    return;
                }
                return;
            case 2:
                g0i g0iVar = (g0i) this.b;
                if (g0iVar.e == null) {
                    a0i a0iVar = (a0i) g0iVar.getLastNonConfigurationInstance();
                    if (a0iVar != null) {
                        g0iVar.e = a0iVar.a;
                    }
                    if (g0iVar.e == null) {
                        g0iVar.e = new rck1();
                    }
                }
                ((f0i) g0iVar).a.d(this);
                return;
            case 3:
                new HashMap();
                le40[] le40VarArr = (le40[]) this.b;
                if (le40VarArr.length > 0) {
                    le40 le40Var = le40VarArr[0];
                    throw null;
                }
                if (le40VarArr.length <= 0) {
                    return;
                }
                le40 le40Var2 = le40VarArr[0];
                throw null;
            case 4:
                f8l f8lVar = (f8l) this.b;
                Handler handler = f8lVar.c;
                tac0 tac0Var = f8lVar.d;
                w8c0 w8c0Var = tac0Var.i;
                w8c0 w8c0Var2 = w8c0.a;
                if (w8c0Var == w8c0Var2) {
                    return;
                }
                if (k8c0Var != k8c0.ON_DESTROY) {
                    if (k8c0Var.a().compareTo(tac0Var.i) >= 0 || k8c0Var.a().a(w8c0.d)) {
                        tac0Var.g(k8c0Var);
                        return;
                    } else {
                        handler.post(new s10(f8lVar, (byte) 25));
                        return;
                    }
                }
                if (f8lVar.a) {
                    handler.removeCallbacksAndMessages(null);
                    x8c0 x8c0Var = f8lVar.b;
                    if (x8c0Var != null) {
                        x8c0Var.d(f8lVar.e);
                    }
                    f8lVar.b = null;
                    f8lVar.a = false;
                }
                if (tac0Var.i.a(w8c0.c)) {
                    tac0Var.i(w8c0Var2);
                    return;
                }
                return;
            case 5:
                jhl jhlVar = (jhl) this.b;
                w8c0 w8c0VarB = jhlVar.a.b();
                w8c0 w8c0VarB2 = jhlVar.b.b();
                tac0 tac0Var2 = jhlVar.c;
                if (tac0Var2.i == w8c0.a) {
                    return;
                }
                if (w8c0VarB.compareTo(w8c0VarB2) >= 0) {
                    w8c0VarB = w8c0VarB2;
                }
                tac0Var2.i(w8c0VarB);
                return;
            case 6:
                qmo qmoVar = (qmo) this.b;
                if (iac0Var == qmoVar.b) {
                    qmoVar.a();
                    return;
                }
                return;
            case 7:
                vtt vttVar = (vtt) this.b;
                iur iurVar = vttVar.d;
                wtr wtrVar = vttVar.i;
                knr knrVar = vttVar.g;
                int i = ttt.a[k8c0Var.ordinal()];
                if (i == 1) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    knrVar.g(yon1.T0().c);
                    smo1.q(wtrVar.d);
                    return;
                } else if (i == 2) {
                    iurVar.a.m((Object) null, vxs0.a);
                    iurVar.b.m((Object) null, Boolean.TRUE);
                    return;
                } else if (i == 3) {
                    iurVar.a.m((Object) null, vxs0.b);
                    iurVar.b.m((Object) null, Boolean.FALSE);
                    return;
                } else {
                    if (i != 4) {
                        return;
                    }
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    yon1.T0();
                    knrVar.i();
                    wtrVar.b();
                    return;
                }
            case 8:
                x2u x2uVar = (x2u) this.b;
                int i2 = w2u.a[k8c0Var.ordinal()];
                if (i2 == 1) {
                    t2u t2uVar = (t2u) iac0Var;
                    Iterable iterable = (Iterable) x2uVar.b().e.a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (((hnn0) it.next()).f.equals(((zf30) t2uVar).a1)) {
                                return;
                            }
                        }
                    }
                    t2uVar.dismiss();
                    return;
                }
                if (i2 == 2) {
                    t2u t2uVar2 = (t2u) iac0Var;
                    for (Object obj3 : (Iterable) x2uVar.b().f.a.getValue()) {
                        if (((hnn0) obj3).f.equals(((zf30) t2uVar2).a1)) {
                            obj = obj3;
                        }
                    }
                    hnn0 hnn0Var = (hnn0) obj;
                    if (hnn0Var != null) {
                        x2uVar.b().c(hnn0Var);
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    t2u t2uVar3 = (t2u) iac0Var;
                    for (Object obj4 : (Iterable) x2uVar.b().f.a.getValue()) {
                        if (((hnn0) obj4).f.equals(((zf30) t2uVar3).a1)) {
                            obj2 = obj4;
                        }
                    }
                    hnn0 hnn0Var2 = (hnn0) obj2;
                    if (hnn0Var2 != null) {
                        x2uVar.b().c(hnn0Var2);
                    }
                    ((zf30) t2uVar3).s1.d(this);
                    return;
                }
                t2u t2uVar4 = (t2u) iac0Var;
                if (t2uVar4.d1().isShowing()) {
                    return;
                }
                List list = (List) x2uVar.b().e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((hnn0) listIterator.previous()).f.equals(((zf30) t2uVar4).a1)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                hnn0 hnn0Var3 = (hnn0) o7h.t0(iNextIndex, list);
                if (!u890.j(o7h.C0(list), hnn0Var3)) {
                    t2uVar4.toString();
                }
                if (hnn0Var3 != null) {
                    x2uVar.l(iNextIndex, hnn0Var3, false);
                    return;
                }
                return;
            case 9:
                bpb1 bpb1Var = ((mr10) this.b).f;
                int i3 = ir10.a[k8c0Var.ordinal()];
                if (i3 == 1) {
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                    return;
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    Boolean bool2 = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool2);
                    return;
                }
            case 10:
                ((FlowableEmitter) this.b).onNext(iac0Var.getLifecycle().b());
                return;
            case 11:
                mwn0 mwn0Var = (mwn0) this.b;
                Logger.g("[CAL] lifecycle: " + k8c0Var, new Object[0]);
                int i4 = gac0.a[k8c0Var.ordinal()];
                if (i4 == 1) {
                    mwn0Var.a();
                    return;
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    mwn0Var.c();
                    return;
                }
            case 12:
                ((dt90) this.b).invoke();
                return;
            case 13:
                q2g0 q2g0Var = (q2g0) this.b;
                if (iac0Var == q2g0Var.c && k8c0Var == k8c0.ON_DESTROY) {
                    q2g0Var.b.b((bbr0) null);
                    return;
                }
                return;
            case 14:
                wkn0 wkn0Var = (wkn0) this.b;
                vku vkuVar2 = wkn0Var.n1;
                if (k8c0Var != k8c0.ON_RESUME) {
                    if (k8c0Var == k8c0.ON_PAUSE) {
                        vkuVar2.c();
                        return;
                    }
                    return;
                }
                vkuVar2.a(wkn0Var.W0.j(mo9.i).t(Functions.a).L(wkn0Var.V0).subscribe(new lrj0(wkn0Var, (byte) 9)));
                Context context = ((w611) wkn0Var).a.getContext();
                xab1 xab1Var = wkn0Var.p1;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                iac0 iac0Var2 = wkn0Var.r1;
                if (iac0Var2 == null) {
                    iac0Var2 = wkn0Var.b1;
                }
                wkn0Var.p1 = fn31.T(cto1.q(iac0Var2), null, 0, new m3n0(wkn0Var, context, (lnm) null, (byte) 9), 3);
                return;
            case 15:
                bvn0 bvn0Var = (bvn0) this.b;
                zf30 zf30Var = bvn0Var.g;
                if (zf30Var == null || iac0Var != zf30Var) {
                    return;
                }
                if (k8c0Var == k8c0.ON_DESTROY) {
                    bvn0Var.q();
                    return;
                }
                if (zf30Var.q0()) {
                    List listL1 = o7h.l1(bvn0Var.h);
                    xun0 xun0Var = bvn0Var.d;
                    if ((xun0Var != null ? xun0Var.b() : null) == zf30Var) {
                        xun0 xun0Var2 = bvn0Var.d;
                        xg30 xg30VarA = xun0Var2 != null ? xun0Var2.a() : null;
                        if (xg30VarA != null) {
                            str = xg30VarA.b;
                        }
                    }
                    bvn0Var.q();
                    if (str != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : listL1) {
                            if (bvn0Var.f.contains((o2q0) obj5)) {
                                arrayList.add(obj5);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((o2q0) it2.next()).b(str, zf30Var);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                k5t0 k5t0Var = (k5t0) this.b;
                int i5 = j5t0.a[k8c0Var.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        return;
                    }
                    k5t0Var.I1();
                    return;
                } else {
                    View view = k5t0Var.O0;
                    Rect rect = k5t0Var.S0;
                    view.getWindowVisibleDisplayFrame(rect);
                    k5t0Var.T0 = l0p1.w(new Rect(rect.left, rect.top, rect.right, rect.bottom - k5t0Var.Q0));
                    k5t0Var.H1();
                    return;
                }
            case 17:
                if (k8c0Var != k8c0.ON_CREATE) {
                    bhn0.g(k8c0Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    iac0Var.getLifecycle().d(this);
                    ((je41) this.b).b();
                    return;
                }
            case 18:
                bo41 bo41Var = (bo41) this.b;
                tac0 tac0Var3 = bo41Var.b;
                if (tac0Var3.i != w8c0.a) {
                    tac0Var3.i(bo41Var.a.getLifecycle().b());
                    return;
                }
                return;
            case 19:
                if (k8c0Var == k8c0.ON_DESTROY) {
                    ((qy71) this.b).b.unregister();
                    iac0Var.getLifecycle().d(this);
                    return;
                }
                return;
            case 20:
                tac0 tac0Var4 = ((kw81) this.b).c;
                if (tac0Var4.i != w8c0.a) {
                    tac0Var4.g(k8c0Var);
                    return;
                }
                return;
            case 21:
                d9c1 d9c1Var = (d9c1) this.b;
                int i6 = c9c1.a[k8c0Var.ordinal()];
                if (i6 == 1) {
                    d9c1Var.q();
                    return;
                }
                if (i6 == 2) {
                    d9c1Var.a();
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    d9c1Var.q();
                    d9c1Var.c.getLifecycle().d(d9c1Var.d);
                    d9c1Var.e = null;
                    return;
                }
            case 22:
                if (k8c0Var == k8c0.ON_STOP) {
                    ((ocj1) this.b).b.g();
                    return;
                }
                return;
            case 23:
                if (k8c0Var == k8c0.ON_RESUME) {
                    ydh.m((hdn0) this.b, 1);
                    return;
                }
                return;
            case 24:
                View.OnAttachStateChangeListener onAttachStateChangeListener = (wus) this.b;
                int i7 = vbk1.a[k8c0Var.ordinal()];
                if (i7 == 1) {
                    ((Function0) ((wus) onAttachStateChangeListener).c).invoke();
                    return;
                }
                if (i7 == 2) {
                    ((Function0) ((wus) onAttachStateChangeListener).d).invoke();
                    return;
                }
                if (i7 == 3) {
                    ((Function0) ((wus) onAttachStateChangeListener).e).invoke();
                    return;
                } else {
                    if (i7 != 4) {
                        return;
                    }
                    ((View) ((wus) onAttachStateChangeListener).b).removeOnAttachStateChangeListener(onAttachStateChangeListener);
                    iac0Var.getLifecycle().d(this);
                    return;
                }
            case 25:
                ((vik1) this.b).a();
                if (k8c0Var == k8c0.ON_DESTROY) {
                    iac0Var.getLifecycle().d(this);
                    return;
                }
                return;
            case 26:
                int i8 = d9l1.a[k8c0Var.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            return;
                        }
                        ((g9l1) this.b).a();
                        return;
                    } else {
                        g9l1 g9l1Var = (g9l1) this.b;
                        if (g9l1Var.h != null || (vq71Var = g9l1Var.j) == null) {
                            return;
                        }
                        g9l1Var.b(vq71Var, g9l1Var.f(vq71Var));
                        return;
                    }
                }
                g9l1 g9l1Var2 = (g9l1) this.b;
                xab1 xab1Var2 = g9l1Var2.i;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                g9l1Var2.i = null;
                r091 r091Var = g9l1Var2.h;
                if (r091Var != null) {
                    r091Var.j();
                }
                r091 r091Var2 = g9l1Var2.h;
                if (r091Var2 != null) {
                    r091Var2.g();
                }
                g9l1Var2.h = null;
                g9l1Var2.e(lt71.a);
                return;
            default:
                if (k8c0Var == k8c0.ON_DESTROY) {
                    ((xal1) this.b).a();
                    return;
                }
                return;
        }
    }
}
