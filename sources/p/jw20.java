package p;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jw20 extends q6 implements pnc1 {
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(jw20.class, "requested$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long t;
    private volatile boolean cancellationRequested;
    public final mr20 e;
    public final gnc1 f;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    static {
        Unsafe unsafe = avg.a;
        t = unsafe.objectFieldOffset(jw20.class.getDeclaredField("requested$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(jw20.class, Object.class, "producer$volatile");
        i = unsafe.objectFieldOffset(jw20.class.getDeclaredField("producer$volatile"));
    }

    public jw20(mr20 mr20Var, gnc1 gnc1Var, o8n o8nVar) {
        super(o8nVar, false, true);
        this.e = mr20Var;
        this.f = gnc1Var;
        this.producer$volatile = new hw20(this.d, this, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object B0(lnm lnmVar) {
        iw20 iw20Var;
        rih1 rih1Var = rih1.a;
        if (lnmVar instanceof iw20) {
            iw20Var = (iw20) lnmVar;
            int i2 = iw20Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iw20Var.c = i2 - Integer.MIN_VALUE;
            } else {
                iw20Var = new iw20(this, lnmVar);
            }
        } else {
            iw20Var = new iw20(this, lnmVar);
        }
        Object obj = iw20Var.a;
        d9n d9nVar = d9n.a;
        int i3 = iw20Var.c;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                iw20Var.c = 1;
                Object objCollect = this.e.collect(new xp10(this, (byte) 2), iw20Var);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            try {
                this.f.onComplete();
                return rih1Var;
            } catch (Throwable th) {
                omo1.p(th, this.d);
                return rih1Var;
            }
        } catch (Throwable th2) {
            if (!this.cancellationRequested || isActive() || th2 != g()) {
                try {
                    this.f.onError(th2);
                } catch (Throwable th3) {
                    j2h1.h(th2, th3);
                    omo1.p(th2, this.d);
                }
            }
            return rih1Var;
        }
    }

    @Override // p.pnc1
    public final /* synthetic */ void cancel() {
        this.cancellationRequested = true;
        d(null);
    }

    @Override // p.pnc1
    public final void request(long j) {
        long longVolatile;
        jw20 jw20Var;
        lnm lnmVar;
        if (j <= 0) {
            return;
        }
        while (true) {
            Unsafe unsafe = avg.a;
            long j2 = t;
            longVolatile = unsafe.getLongVolatile(this, j2);
            long j3 = longVolatile + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
            jw20Var = this;
            if (unsafe.compareAndSwapLong(jw20Var, j2, longVolatile, j3)) {
                break;
            } else {
                this = jw20Var;
            }
        }
        if (longVolatile <= 0) {
            do {
                lnmVar = (lnm) avg.a.getAndSetObject(jw20Var, i, (Object) null);
            } while (lnmVar == null);
            lnmVar.resumeWith(rih1.a);
        }
    }
}
