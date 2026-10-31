package p;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.transformer.ExportException;
import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class owu implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ owu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pwu pwuVar = (pwu) obj;
                qwu qwuVar = pwuVar.b;
                boolean z = pwuVar.X;
                if (z) {
                    return false;
                }
                int i = message.what;
                if (i == 1) {
                    try {
                        qwuVar.d();
                    } catch (ExoPlaybackException e) {
                        pwuVar.e.obtainMessage(2, new IOException((Throwable) e)).sendToTarget();
                    }
                    break;
                } else {
                    if (i != 2) {
                        return false;
                    }
                    if (!z) {
                        pwuVar.X = true;
                        pwuVar.g.sendEmptyMessage(4);
                    }
                    Object obj2 = message.obj;
                    String str = zoi1.a;
                    qwuVar.g.post(new e0i((Object) qwuVar, obj2, (byte) 21));
                }
                return true;
            case 1:
                xxu xxuVar = (xxu) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    xxuVar.k = Collections.unmodifiableList((List) message.obj);
                    boolean zC = xxuVar.c();
                    Iterator it = xxuVar.e.iterator();
                    while (it.hasNext()) {
                        ((zma) it.next()).getClass();
                    }
                    if (zC) {
                        xxuVar.a();
                    }
                } else if (i2 == 2) {
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    int i5 = xxuVar.f - i3;
                    xxuVar.f = i5;
                    if (i4 == 0 && i5 == 0) {
                        Iterator it2 = xxuVar.e.iterator();
                        while (it2.hasNext()) {
                            ((zma) it2.next()).getClass();
                        }
                    }
                } else {
                    if (i2 != 3) {
                        bhn0.w();
                        return false;
                    }
                    txu txuVar = (txu) message.obj;
                    xxuVar.k = Collections.unmodifiableList(txuVar.c);
                    kru kruVar = txuVar.a;
                    boolean zC2 = xxuVar.c();
                    boolean z2 = txuVar.b;
                    CopyOnWriteArraySet<zma> copyOnWriteArraySet = xxuVar.e;
                    if (z2) {
                        for (zma zmaVar : copyOnWriteArraySet) {
                            zmaVar.getClass();
                            String str2 = kruVar.a.a;
                            t390 t390Var = zmaVar.a.c;
                            long j = kruVar.h.a;
                            long jB = t390Var.a.b();
                            Map.Entry entryA = t390Var.a(str2);
                            if (entryA != null) {
                                swu swuVar = (swu) entryA.getKey();
                                Iterator it3 = ((List) entryA.getValue()).iterator();
                                while (it3.hasNext()) {
                                    ((vma) it3.next()).e(swuVar, j, jB);
                                }
                            }
                            t390Var.c(str2);
                            if (zmaVar.a.i) {
                                zmaVar.a.j.add(str2);
                            }
                            zmaVar.a.g.remove(str2);
                        }
                    } else {
                        for (zma zmaVar2 : copyOnWriteArraySet) {
                            Exception exc = txuVar.d;
                            zmaVar2.getClass();
                            j0v j0vVar = kruVar.a;
                            String str3 = j0vVar.a;
                            cna cnaVar = zmaVar2.a;
                            int iH = t9p1.h((kru) cnaVar.g.get(str3));
                            int iH2 = t9p1.h(kruVar);
                            cnaVar.g.put(str3, kruVar);
                            if (iH2 == 4) {
                                t390 t390Var2 = cnaVar.c;
                                if (cnaVar.h.isDisposed()) {
                                    int i6 = Flowable.a;
                                    cnaVar.h = new FlowableOnBackpressureDrop(Flowable.G(1000L, 1000L, TimeUnit.MILLISECONDS, Schedulers.b)).subscribe(new a21(cnaVar, t390Var2, (byte) 18));
                                }
                            } else if (iH2 == 5) {
                                t390 t390Var3 = cnaVar.c;
                                long j2 = kruVar.h.a;
                                long jB2 = t390Var3.a.b();
                                Map.Entry entryA2 = t390Var3.a(str3);
                                if (entryA2 != null) {
                                    swu swuVar2 = (swu) entryA2.getKey();
                                    Iterator it4 = ((List) entryA2.getValue()).iterator();
                                    while (it4.hasNext()) {
                                        ((vma) it4.next()).c(swuVar2, j2, jB2);
                                    }
                                }
                                t390Var3.c(str3);
                            } else if (iH == 4 && iH2 == 3) {
                                t390 t390Var4 = cnaVar.c;
                                long j3 = kruVar.h.a;
                                long jB3 = t390Var4.a.b();
                                Map.Entry entryA3 = t390Var4.a(str3);
                                if (entryA3 != null) {
                                    swu swuVar3 = (swu) entryA3.getKey();
                                    Iterator it5 = ((List) entryA3.getValue()).iterator();
                                    while (it5.hasNext()) {
                                        ((vma) it5.next()).a(swuVar3, j3, jB3);
                                    }
                                }
                                t390Var4.c(str3);
                            } else if (iH == 4 && (iH2 == 2 || iH2 == 6)) {
                                cnaVar.a.g(2, j0vVar.a);
                                BetamaxDownloadException betamaxDownloadExceptionG = s9p1.G(exc, j0vVar.a, kruVar.h.a);
                                if (betamaxDownloadExceptionG.a == 3) {
                                    cnaVar.b.a(str3);
                                    cnaVar.a.e(str3);
                                }
                                cnaVar.c.b(str3, kruVar.h.a, betamaxDownloadExceptionG);
                            }
                        }
                    }
                    if (zC2) {
                        xxuVar.a();
                    }
                }
                return true;
            case 2:
                h9d0 h9d0Var = (h9d0) obj;
                f9d0 f9d0Var = (f9d0) h9d0Var.e;
                f9d0Var.getClass();
                for (g9d0 g9d0Var : (CopyOnWriteArraySet) h9d0Var.f) {
                    if (!g9d0Var.d && g9d0Var.c) {
                        ko20 ko20VarL = g9d0Var.b.l();
                        g9d0Var.b = new lls0((byte) 24);
                        g9d0Var.c = false;
                        f9d0Var.e(g9d0Var.a, ko20VarL);
                    }
                    wdd1 wdd1Var = (wdd1) h9d0Var.d;
                    wdd1Var.getClass();
                    if (wdd1Var.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                j2e0 j2e0Var = (j2e0) obj;
                if (message.what == 1) {
                    j2e0Var.d();
                }
                return true;
            case 4:
                pbq pbqVar = (pbq) obj;
                int i7 = message.what;
                if (i7 == 1) {
                    ((zjc1) pbqVar.X).a();
                } else if (i7 == 2) {
                    ((akc1) pbqVar.c).a();
                } else if (i7 == 3) {
                    ((bkc1) pbqVar.d).a();
                } else {
                    if (i7 != 4) {
                        return false;
                    }
                    ((ckc1) pbqVar.e).a();
                }
                return true;
            default:
                pgg1 pgg1Var = (pgg1) obj;
                if (!pgg1Var.B || message.what == 4) {
                    try {
                        int i8 = message.what;
                        if (i8 == 1) {
                            ArrayList arrayList = pgg1Var.j;
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                ((q561) arrayList.get(i9)).start();
                            }
                        } else if (i8 == 2) {
                            pgg1Var.m.add((h541) message.obj);
                            if (!pgg1Var.v) {
                                pgg1Var.i.j(3);
                                pgg1Var.v = true;
                            }
                        } else if (i8 == 3) {
                            pgg1Var.a();
                        } else {
                            if (i8 != 4) {
                                return false;
                            }
                            pgg1Var.b(message.arg1, (ExportException) message.obj);
                        }
                    } catch (RuntimeException e2) {
                        pgg1Var.b(2, ExportException.d(e2));
                    } catch (ExportException e3) {
                        pgg1Var.b(2, e3);
                    }
                }
                return true;
        }
    }
}
