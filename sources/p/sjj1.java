package p;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sjj1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sjj1(ecp1 ecp1Var, lxh1 lxh1Var) {
        this.a = (byte) 17;
        r0p1 r0p1Var = r0p1.UNKNOWN_EVENT;
        this.b = ecp1Var;
        this.c = lxh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        final byte b = 0;
        yhn1 yhn1Var = null;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((c0u0) this.b).e((String) this.c);
                return;
            case 1:
                pnj1 pnj1Var = (pnj1) this.c;
                OverlayHidingFrameLayout overlayHidingFrameLayout = pnj1Var.T1;
                if (overlayHidingFrameLayout != null) {
                    pnj1Var.i(overlayHidingFrameLayout.e());
                    return;
                } else {
                    u890.C("overlayControlsView");
                    throw null;
                }
            case 2:
                ((j6) this.b).invoke((ges) this.c);
                return;
            case 3:
                ((n7m0) this.b).invoke((String) this.c, (Object) null);
                return;
            case 4:
                ((gdl1) this.b).g((edl1) this.c);
                return;
            case 5:
                ((x8c0) this.b).d((s760) this.c);
                return;
            case 6:
                dbm dbmVar = (dbm) this.b;
                d9d0 d9d0Var = (d9d0) this.c;
                c9d0 c9d0Var = (c9d0) dbmVar.b;
                if (c9d0Var == null) {
                    d9d0Var.k();
                    return;
                }
                try {
                    d9d0Var.c(c9d0Var.a);
                    return;
                } catch (RuntimeException e) {
                    d9d0Var.k();
                    throw e;
                }
            case 7:
                ((pgn1) this.c).b1("onConnectedNodes");
                return;
            case 8:
                pgn1 pgn1Var = (pgn1) this.b;
                DataHolder dataHolder = ((uio1) this.c).b;
                int i = dataHolder.e;
                try {
                    pgn1Var.b1("onNodeMigrated");
                    dataHolder.close();
                    return;
                } catch (Throwable th) {
                    try {
                        dataHolder.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 9:
                gsa gsaVar = (gsa) this.b;
                zgz0 zgz0Var = (zgz0) this.c;
                iua iuaVar = iyn1.i;
                gsaVar.T(24, 13, iuaVar);
                zgz0Var.g(iuaVar);
                return;
            case 10:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        rxn1 rxn1VarRemove = referenceQueue.remove();
                        if (rxn1VarRemove.a.remove(rxn1VarRemove)) {
                            rxn1VarRemove.clear();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                gsa gsaVar2 = (gsa) this.b;
                do0 do0Var = (do0) this.c;
                iua iuaVar2 = iyn1.i;
                gsaVar2.T(24, 7, iuaVar2);
                vrn1 vrn1Var = dsn1.b;
                ttn1 ttn1Var = ttn1.e;
                do0Var.a(iuaVar2, new f1z0(ttn1Var, ttn1Var));
                return;
            case grn1.d /* 12 */:
                arn1 arn1Var = ((uqn1) this.b).l;
                fbn1 fbn1Var = (fbn1) this.c;
                arn1Var.getClass();
                String str = fbn1Var.a;
                if (o4e.c(str, arn1Var.v)) {
                    z = false;
                } else {
                    arn1Var.v = str;
                }
                arn1.H.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(arn1Var.o)});
                zdp1 zdp1Var = arn1Var.E;
                if (zdp1Var != null && (z || arn1Var.o)) {
                    zdp1Var.d();
                }
                arn1Var.o = false;
                return;
            case 13:
                try {
                    ((gsa) ((bym1) this.b).c).H.c((iua) this.c);
                    return;
                } catch (Throwable unused2) {
                    vsn1.i("BillingClient");
                    return;
                }
            case 14:
                final fvo1 fvo1Var = (fvo1) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (fvo1Var) {
                    if (iBinder == null) {
                        fvo1Var.a("Null service connection");
                    } else {
                        try {
                            fvo1Var.c = new frl1(iBinder);
                            fvo1Var.a = (byte) 2;
                            b8p1.H(fvo1Var.f).execute(new Runnable() { // from class: p.efo1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (b) {
                                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                            fvo1 fvo1Var2 = fvo1Var;
                                            while (true) {
                                                synchronized (fvo1Var2) {
                                                    try {
                                                        if (fvo1Var2.a != 2) {
                                                            return;
                                                        }
                                                        if (fvo1Var2.d.isEmpty()) {
                                                            fvo1Var2.c();
                                                            return;
                                                        }
                                                        a1p1 a1p1Var = (a1p1) fvo1Var2.d.poll();
                                                        fvo1Var2.e.put(a1p1Var.a, a1p1Var);
                                                        ((ScheduledExecutorService) fvo1Var2.f.d).schedule((Runnable) new mqh1(fvo1Var2, a1p1Var, (byte) 17), 30L, TimeUnit.SECONDS);
                                                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                                                            new StringBuilder(String.valueOf(a1p1Var).length() + 8);
                                                        }
                                                        Context context = (Context) fvo1Var2.f.c;
                                                        Messenger messenger = fvo1Var2.b;
                                                        Message messageObtain = Message.obtain();
                                                        messageObtain.what = a1p1Var.c;
                                                        messageObtain.arg1 = a1p1Var.a;
                                                        messageObtain.replyTo = messenger;
                                                        Bundle bundle = new Bundle();
                                                        bundle.putBoolean("oneWay", a1p1Var.b());
                                                        bundle.putString("pkg", context.getPackageName());
                                                        bundle.putBundle("data", a1p1Var.d);
                                                        messageObtain.setData(bundle);
                                                        try {
                                                            frl1 frl1Var = fvo1Var2.c;
                                                            Messenger messenger2 = (Messenger) frl1Var.b;
                                                            if (messenger2 != null) {
                                                                messenger2.send(messageObtain);
                                                            } else {
                                                                uxn1 uxn1Var = (uxn1) frl1Var.c;
                                                                if (uxn1Var == null) {
                                                                    throw new IllegalStateException("Both messengers are null");
                                                                }
                                                                uxn1Var.a(messageObtain);
                                                            }
                                                        } catch (RemoteException e2) {
                                                            fvo1Var2.a(e2.getMessage());
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            fvo1 fvo1Var3 = fvo1Var;
                                            synchronized (fvo1Var3) {
                                                if (fvo1Var3.a == 1) {
                                                    fvo1Var3.a("Timed out while binding");
                                                }
                                                break;
                                            }
                                            return;
                                    }
                                }
                            });
                        } catch (RemoteException e2) {
                            fvo1Var.a(e2.getMessage());
                        }
                    }
                }
                return;
            case 15:
                lce1 lce1Var = (lce1) this.b;
                bsd1 bsd1Var = (bsd1) this.c;
                int iDecrementAndGet = lce1Var.b.decrementAndGet();
                zod.w(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    synchronized (lce1Var) {
                        lce1.i = true;
                        lce1Var.d.zzc();
                    }
                    lce1Var.c.set(false);
                }
                c7p1.a.clear();
                m9p1.a.clear();
                bsd1Var.b((Object) null);
                return;
            case 16:
                wh41 wh41Var = (wh41) this.b;
                AtomicReference atomicReference = (AtomicReference) wh41Var.e;
                zod.w(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    atomicReference.set(null);
                    wh41Var.zzc();
                    return;
                } catch (Throwable th3) {
                    try {
                        atomicReference.set(null);
                        wh41Var.zzc();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 17:
                ecp1 ecp1Var = (ecp1) this.b;
                r0p1 r0p1Var = r0p1.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                lxh1 lxh1Var = (lxh1) this.c;
                HashMap map = ecp1Var.j;
                mkn1 mkn1Var = (mkn1) map.get(r0p1Var);
                if (mkn1Var != null) {
                    rpn1 rpn1Var = mkn1Var.c;
                    ucn1 ucn1Var = mkn1Var.a;
                    if (ucn1Var == null) {
                        ucn1Var = new ucn1(mkn1Var, rpn1Var);
                        mkn1Var.a = ucn1Var;
                    }
                    for (Object obj : ucn1Var) {
                        Object arrayList = (Collection) rpn1Var.get(obj);
                        byte b2 = 3;
                        if (arrayList == null) {
                            arrayList = new ArrayList(3);
                        }
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new ufn1(mkn1Var, obj, list, yhn1Var) : new yhn1(mkn1Var, obj, list, yhn1Var));
                        Collections.sort(arrayList2);
                        r4h1 r4h1Var = new r4h1();
                        Iterator it = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it.hasNext()) {
                            jLongValue = ((Long) it.next()).longValue() + jLongValue;
                        }
                        r4h1Var.c = Long.valueOf((jLongValue / ((long) arrayList2.size())) & Long.MAX_VALUE);
                        r4h1Var.a = Long.valueOf(ecp1.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        r4h1Var.f = Long.valueOf(ecp1.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        r4h1Var.e = Long.valueOf(ecp1.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        r4h1Var.d = Long.valueOf(ecp1.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        r4h1Var.b = Long.valueOf(Long.MAX_VALUE & ecp1.a(arrayList2, 0.0d));
                        zyo1 zyo1Var = new zyo1(r4h1Var);
                        int size = arrayList2.size();
                        lce1 lce1Var2 = (lce1) lxh1Var.b;
                        m5o1 m5o1Var = (m5o1) obj;
                        ikj1 ikj1Var = new ikj1();
                        ikj1Var.c = lce1Var2.g.a() ? p0p1.TYPE_THICK : p0p1.TYPE_THIN;
                        fqn1 fqn1Var = new fqn1(b2);
                        fqn1Var.c = Integer.valueOf(size & Integer.MAX_VALUE);
                        fqn1Var.b = m5o1Var;
                        fqn1Var.d = zyo1Var;
                        ikj1Var.f = new v5o1(fqn1Var);
                        lqn1.a(1, new hw9((Object) ecp1Var, (Object) new jcp1(ikj1Var, 0), (Object) r0p1Var, (Object) ecp1Var.c(), (byte) 18));
                        yhn1Var = null;
                    }
                    map.remove(r0p1Var);
                    return;
                }
                return;
            default:
                DataHolder dataHolder2 = (DataHolder) this.b;
                int i2 = dataHolder2.e;
                try {
                    ((pgn1) this.c).b1("onDataChanged");
                    return;
                } finally {
                    dataHolder2.close();
                }
        }
    }

    public sjj1(c0u0 c0u0Var, String str, long j, long j2) {
        this.a = (byte) 0;
        this.b = c0u0Var;
        this.c = str;
    }

    public /* synthetic */ sjj1(pgn1 pgn1Var, Object obj, byte b) {
        this.a = b;
        this.b = obj;
        this.c = pgn1Var;
    }

    public /* synthetic */ sjj1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
