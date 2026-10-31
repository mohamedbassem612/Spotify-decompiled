package p;

import android.content.res.Resources;
import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.work.impl.WorkerStoppedException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class svb0 implements iu30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public svb0(List list, tvb0 tvb0Var) {
        this.a = (byte) 1;
        this.b = list;
        this.c = tvb0Var;
    }

    public i541 a(toq0 toq0Var) {
        epq0 epq0Var;
        x5u x5uVar = (x5u) this.b;
        if (!toq0Var.equals(joq0.c)) {
            if (toq0Var.equals(joq0.b)) {
                return new apq0(2131958175, true);
            }
            if (toq0Var.equals(joq0.a)) {
                return new apq0(2131958175, true);
            }
            if (!(toq0Var instanceof poq0)) {
                if (toq0Var.equals(joq0.d)) {
                    return new apq0(2131958176, false);
                }
                if (toq0Var instanceof ooq0) {
                    return new bpq0(((ooq0) toq0Var).a instanceof k560);
                }
                if (toq0Var instanceof soq0) {
                    return new bpq0(false);
                }
                boolean z = toq0Var instanceof koq0;
                epq0 epq0Var2 = dpq0.d;
                if (z) {
                    koq0 koq0Var = (koq0) toq0Var;
                    c560 c560Var = koq0Var.a;
                    unx unxVar = (c560Var.b().c || c560Var.b().f) ? vnx.c : unx.c;
                    String str = koq0Var.b;
                    me20 me20VarB = c560Var.b();
                    epq0 epq0Var3 = me20VarB.d != null ? new epq0(2131962822, 2131962821, true, me20VarB.f, true, 2131101180) : epq0Var2;
                    me20 me20VarB2 = c560Var.b();
                    if (((Boolean) x5uVar.invoke()).booleanValue()) {
                        epq0Var2 = new epq0(2131955876, 2131955875, true, me20VarB2.c, true, 2131101180);
                    }
                    return new gpq0(unxVar, str, new fpq0(epq0Var3, epq0Var2), true);
                }
                if (toq0Var instanceof moq0) {
                    moq0 moq0Var = (moq0) toq0Var;
                    boolean z2 = moq0Var.c;
                    boolean z3 = moq0Var.b;
                    c560 c560Var2 = moq0Var.a;
                    vnx vnxVar = ((z2 && c560Var2.b().f) || (z3 && c560Var2.b().c)) ? vnx.c : unx.c;
                    String str2 = moq0Var.d;
                    me20 me20VarB3 = c560Var2.b();
                    if (me20VarB3.d != null) {
                        epq0Var = z2 ? new epq0(2131962822, 2131962821, true, me20VarB3.f, true, 2131101180) : new epq0(2131962822, 2131956001, false, false, false, 2131101184);
                    } else {
                        epq0Var = epq0Var2;
                    }
                    if (((Boolean) x5uVar.invoke()).booleanValue()) {
                        epq0Var2 = z3 ? new epq0(2131955876, 2131955875, true, c560Var2.b().c, true, 2131101180) : new epq0(2131955876, 2131956001, false, false, false, 2131101184);
                    }
                    return new gpq0(vnxVar, str2, new fpq0(epq0Var, epq0Var2), true);
                }
                if (toq0Var instanceof loq0) {
                    loq0 loq0Var = (loq0) toq0Var;
                    return d(loq0Var.b, loq0Var.a.b().d != null);
                }
                if (toq0Var instanceof noq0) {
                    noq0 noq0Var = (noq0) toq0Var;
                    return d(noq0Var.b, noq0Var.a.b().d != null);
                }
                if (!(toq0Var instanceof qoq0) && !toq0Var.equals(joq0.e) && !toq0Var.equals(joq0.f)) {
                    if (toq0Var.equals(roq0.a)) {
                        return new gpq0(unx.c, ((Resources) this.c).getString(2131963489), new fpq0(new epq0(2131962822, 2131962823, false, false, true, 2131101184), epq0Var2), false);
                    }
                    eg.o();
                    return null;
                }
            }
        }
        return cpq0.d;
    }

    public gpq0 d(String str, boolean z) {
        unx unxVar = unx.c;
        epq0 epq0Var = dpq0.d;
        epq0 epq0Var2 = z ? new epq0(2131962822, 2131956001, false, false, false, 2131101184) : epq0Var;
        if (((Boolean) ((x5u) this.b).invoke()).booleanValue()) {
            epq0Var = new epq0(2131955876, 2131956001, false, false, false, 2131101184);
        }
        return new gpq0(unxVar, str, new fpq0(epq0Var2, epq0Var), true);
    }

    public final Object invoke(Object obj) {
        boolean zI = false;
        switch (this.a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((gs90) this.c).invoke(Integer.valueOf(iIntValue), ((List) this.b).get(iIntValue));
            case 1:
                return Integer.valueOf(((tvb0) this.c).a.a((mhy) ((List) this.b).get(((Number) obj).intValue())).ordinal());
            case 2:
                return a((toq0) obj);
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                return ((qm0) this.c).invoke(Integer.valueOf(iIntValue2), ((List) this.b).get(iIntValue2));
            case 4:
                return new m441(new l4f0(this, (vzn0) obj, (lnm) null, (byte) 21));
            case 5:
                int iIntValue3 = ((Number) obj).intValue();
                return ((fk01) this.c).invoke(Integer.valueOf(iIntValue3), ((List) this.b).get(iIntValue3));
            case 6:
                int iIntValue4 = ((Number) obj).intValue();
                return ((vu30) this.c).invoke(Integer.valueOf(iIntValue4), ((c380) this.b).get(iIntValue4));
            case 7:
                return ((q4z0) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 8:
                Completable completable = (Completable) ((d6u) this.b).invoke();
                hce1 hce1Var = (hce1) this.c;
                return completable.c(((Single) ((na) hce1Var.c).invoke()).flatMapCompletable(new bih1((m560) obj, hce1Var, (byte) 4)));
            case 9:
                int iIntValue5 = ((Number) obj).intValue();
                return ((i90) this.c).invoke(Integer.valueOf(iIntValue5), ((List) this.b).get(iIntValue5));
            case 10:
                KeyEvent keyEvent = ((cpa0) obj).a;
                dz20 dz20Var = (az20) this.c;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && ern1.t(keyEvent) == 2 && keyEvent.getSource() != 257)) {
                    if (g3p1.p(19, keyEvent)) {
                        zI = dz20Var.i(5, true);
                    } else if (g3p1.p(20, keyEvent)) {
                        zI = dz20Var.i(6, true);
                    } else if (g3p1.p(21, keyEvent)) {
                        zI = dz20Var.i(3, true);
                    } else if (g3p1.p(22, keyEvent)) {
                        zI = dz20Var.i(4, true);
                    } else if (g3p1.p(23, keyEvent)) {
                        b6t b6tVar = ((r1c0) this.b).c;
                        if (b6tVar != null) {
                            b6tVar.b();
                        }
                        zI = true;
                    }
                }
                return Boolean.valueOf(zI);
            case 11:
                ((ggg1) this.c).a.h.k((w7e1) this.b);
                return rih1.a;
            case 12:
                WorkerStoppedException workerStoppedException = (Throwable) obj;
                if (workerStoppedException instanceof WorkerStoppedException) {
                    ((z8d0) this.c).e(workerStoppedException.a);
                }
                ((n8d0) this.b).cancel(false);
                return rih1.a;
            case 13:
                mxa1 mxa1Var = (mxa1) this.c;
                ayh ayhVar = (ayh) this.b;
                Exception exc = (Exception) obj;
                lqo1 lqo1Var = (lqo1) mxa1Var.g;
                synchronized (lqo1Var.a) {
                    if (((ayh) lqo1Var.c) == ayhVar) {
                        lqo1Var.c = null;
                        lqo1Var.d = null;
                    }
                    break;
                }
                ayhVar.y0(exc);
                return rih1.a;
            default:
                sln1 sln1Var = (sln1) obj;
                String strX = sln1Var.x();
                sln1 sln1Var2 = (sln1) ((vrv0) this.c).e;
                if (!u890.j(sln1Var2 != null ? sln1Var2.x() : null, strX)) {
                    return null;
                }
                ymn1 ymn1Var = (ymn1) this.b;
                rln1 rln1VarI = sln1Var.i();
                rln1VarI.h(ymn1Var.x());
                rln1VarI.i(ymn1Var.y());
                return rln1VarI.e();
        }
    }

    public /* synthetic */ svb0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
