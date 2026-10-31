package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zor implements a4l {
    public final y2l a;
    public final lur b;
    public final Scheduler c;
    public final q8n d;
    public final BehaviorSubject e = BehaviorSubject.g(j5.a);
    public final dt71 f = mgo1.e(0, 1, 0, 5);
    public final vku g = new vku();
    public llm h;

    public zor(y2l y2lVar, hwb hwbVar, lur lurVar, Scheduler scheduler, q8n q8nVar) {
        this.a = y2lVar;
        this.b = lurVar;
        this.c = scheduler;
        this.d = q8nVar;
        this.h = cy30.t(q8nVar);
    }

    public static void i(zor zorVar, String str, int i) {
        zorVar.g((i & 2) != 0 ? l7l.a : l7l.b);
        c921.y(zorVar.h, (o8n) null, 0, new clo(zorVar, str, (lnm) null, (byte) 15), 3);
    }

    public static String k(zor zorVar, String str, String str2, int i) {
        String str3;
        l7l l7lVar = (i & 8) != 0 ? l7l.a : l7l.b;
        zorVar.getClass();
        if (str.equals("local_device")) {
            zorVar.g(l7lVar);
            str3 = null;
        } else {
            zorVar.f.a(new j7l(str, l7lVar));
            zorVar.e.onNext(new i5w0(str));
            String strW = hwb.w();
            zorVar.b.d(str, u6t.N0);
            str3 = strW;
        }
        c921.y(zorVar.h, (o8n) null, 0, new swn(zorVar, str, str2, str3, (lnm) null, (byte) 7), 3);
        return str3;
    }

    @Override // p.a4l
    public final void a() {
        smo1.q(this.h);
        this.g.c();
    }

    @Override // p.a4l
    public final void b() {
        if (smo1.u(this.h)) {
            return;
        }
        this.h = cy30.t(this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(iu30 iu30Var, onm onmVar) {
        uor uorVar;
        if (onmVar instanceof uor) {
            uorVar = (uor) onmVar;
            int i = uorVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uorVar.c = i - Integer.MIN_VALUE;
            } else {
                uorVar = new uor(this, onmVar);
            }
        } else {
            uorVar = new uor(this, onmVar);
        }
        Object objD = uorVar.a;
        int i2 = uorVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                uorVar.c = 1;
                objD = d(iu30Var, uorVar);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            return (efg1) objD;
        } catch (Exception e) {
            op71.x(uorVar.getContext());
            return new cfg1(new weg1(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(iu30 iu30Var, onm onmVar) {
        vor vorVar;
        if (onmVar instanceof vor) {
            vorVar = (vor) onmVar;
            int i = vorVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vorVar.c = i - Integer.MIN_VALUE;
            } else {
                vorVar = new vor(this, onmVar);
            }
        } else {
            vorVar = new vor(this, onmVar);
        }
        Object objInvoke = vorVar.a;
        int i2 = vorVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                vorVar.c = 1;
                objInvoke = iu30Var.invoke(vorVar);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objInvoke);
            }
            return (efg1) objInvoke;
        } catch (CancellationException e) {
            op71.x(vorVar.getContext());
            return new cfg1(new weg1(e));
        }
    }

    public final void g(l7l l7lVar) {
        this.f.a(new i7l(l7lVar));
        this.e.onNext(j5.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(l7l l7lVar, onm onmVar) {
        yor yorVar;
        if (onmVar instanceof yor) {
            yorVar = (yor) onmVar;
            int i = yorVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yorVar.c = i - Integer.MIN_VALUE;
            } else {
                yorVar = new yor(this, onmVar);
            }
        } else {
            yorVar = new yor(this, onmVar);
        }
        Object obj = yorVar.a;
        int i2 = yorVar.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            eum eumVar = new eum(this, l7lVar, (lnm) null, (byte) 16);
            yorVar.c = 1;
            if (c921.H(this.d, eumVar, yorVar) != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        xor xorVar = new xor(this, (String) null, (lnm) null, (byte) 1);
        yorVar.c = 2;
        Object objD = d(xorVar, yorVar);
        return objD == d9nVar ? d9nVar : objD;
    }
}
