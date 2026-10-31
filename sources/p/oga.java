package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oga extends a8d1 implements vu30 {
    public final /* synthetic */ jpa N0;
    public final /* synthetic */ long O0;
    public final /* synthetic */ List P0;
    public final /* synthetic */ kpa Q0;
    public final /* synthetic */ gha X;
    public final /* synthetic */ kpa Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ sga c;
    public final /* synthetic */ String d;
    public final /* synthetic */ vga e;
    public final /* synthetic */ int f;
    public final /* synthetic */ AtomicInteger g;
    public final /* synthetic */ AtomicInteger h;
    public final /* synthetic */ int i;
    public final /* synthetic */ jpa t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oga(sga sgaVar, String str, vga vgaVar, int i, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i2, jpa jpaVar, gha ghaVar, kpa kpaVar, List list, jpa jpaVar2, long j, List list2, kpa kpaVar2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = sgaVar;
        this.d = str;
        this.e = vgaVar;
        this.f = i;
        this.g = atomicInteger;
        this.h = atomicInteger2;
        this.i = i2;
        this.t = jpaVar;
        this.X = ghaVar;
        this.Y = kpaVar;
        this.Z = list;
        this.N0 = jpaVar2;
        this.O0 = j;
        this.P0 = list2;
        this.Q0 = kpaVar2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new oga(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, lnmVar, (byte) 0);
            default:
                return new oga(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        gha ghaVar;
        Object objA;
        BetamaxTranscoderException betamaxTranscoderException;
        AtomicInteger atomicInteger;
        Object objB;
        BetamaxTranscoderException betamaxTranscoderException2;
        byte b = this.a;
        int i = this.i;
        AtomicInteger atomicInteger2 = this.g;
        xjz xjzVar = xjz.ERROR_UNKNOWN;
        kpa kpaVar = this.Q0;
        List list = this.P0;
        int i2 = this.f;
        jpa jpaVar = this.N0;
        List list2 = this.Z;
        kpa kpaVar2 = this.Y;
        d9n d9nVar = d9n.a;
        AtomicInteger atomicInteger3 = this.h;
        gha ghaVar2 = this.X;
        String str = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        objA = ((e331) obj).a;
                        ghaVar = ghaVar2;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                int i3 = this.f;
                nga ngaVar = new nga(kpaVar2, i3, (byte) 0);
                this.b = true;
                ghaVar = ghaVar2;
                objA = this.c.a(this.d, this.e, i3, ngaVar, this);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                if (!(objA instanceof m231)) {
                    i080 i080Var = (i080) objA;
                    list2.add(i080Var);
                    jpaVar.invoke(new aga(this.f, i080Var.b, i080Var.c, this.O0, this.d, i080Var.a));
                }
                Throwable thA = e331.a(objA);
                if (thA != null) {
                    Logger.e(thA, ab80.n("Image ", " failed: ", i2, thA.getMessage()), new Object[0]);
                    if (thA instanceof BetamaxTranscoderException) {
                        betamaxTranscoderException = (BetamaxTranscoderException) thA;
                    } else {
                        String message = thA.getMessage();
                        if (message == null) {
                            message = "Unknown error during transcoding";
                        }
                        betamaxTranscoderException = new BetamaxTranscoderException(message, xjzVar, thA);
                    }
                    w7g1 w7g1Var = new w7g1(i2, str, 2, betamaxTranscoderException);
                    list.add(w7g1Var);
                    kpaVar.invoke(new Integer(i2), w7g1Var);
                }
                int iIncrementAndGet = atomicInteger2.incrementAndGet();
                float fO = yoi1.o((atomicInteger3.get() + iIncrementAndGet) / i, 0.0f, 1.0f);
                int i4 = atomicInteger3.get();
                gha ghaVar3 = ghaVar;
                int size = ghaVar3.a.size();
                int size2 = ghaVar3.b.size();
                if (0.0f > fO || fO > 1.0f) {
                    hhg1.n("overallProgress must be between 0.0 and 1.0");
                } else if (i4 < 0) {
                    hhg1.n("videosCompleted must be non-negative");
                } else if (size < 0) {
                    hhg1.n("videosTotal must be non-negative");
                } else if (i4 > size) {
                    hhg1.n("videosCompleted cannot exceed videosTotal");
                } else if (iIncrementAndGet < 0) {
                    hhg1.n("imagesCompleted must be non-negative");
                } else if (size2 < 0) {
                    hhg1.n("imagesTotal must be non-negative");
                } else {
                    if (iIncrementAndGet <= size2) {
                        jpa jpaVar2 = this.t;
                        ConcurrentHashMap concurrentHashMap = jpaVar2.b.h;
                        long j = jpaVar2.c;
                        ppa ppaVar = (ppa) concurrentHashMap.get(Long.valueOf(j));
                        if (ppaVar != null) {
                            ppaVar.b((long) (fO * 100.0f), j);
                        }
                        return rih1Var;
                    }
                    hhg1.n("imagesCompleted cannot exceed imagesTotal");
                }
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        objB = ((e331) obj).a;
                        atomicInteger = atomicInteger3;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                int i5 = this.f;
                nga ngaVar2 = new nga(kpaVar2, i5, (byte) 1);
                this.b = true;
                atomicInteger = atomicInteger3;
                objB = this.c.b(this.d, this.e, i5, ngaVar2, this);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                if (!(objB instanceof m231)) {
                    x5k1 x5k1Var = (x5k1) objB;
                    list2.add(x5k1Var);
                    jpaVar.invoke(new bga(this.f, this.d, x5k1Var.a, this.O0, x5k1Var.c, x5k1Var.d, x5k1Var.b));
                }
                Throwable thA2 = e331.a(objB);
                if (thA2 != null) {
                    Logger.e(thA2, ab80.n("Video ", " failed: ", i2, thA2.getMessage()), new Object[0]);
                    if (thA2 instanceof BetamaxTranscoderException) {
                        betamaxTranscoderException2 = (BetamaxTranscoderException) thA2;
                    } else {
                        String message2 = thA2.getMessage();
                        if (message2 == null) {
                            message2 = "Unknown error during transcoding";
                        }
                        betamaxTranscoderException2 = new BetamaxTranscoderException(message2, xjzVar, thA2);
                    }
                    w7g1 w7g1Var2 = new w7g1(i2, str, 1, betamaxTranscoderException2);
                    list.add(w7g1Var2);
                    kpaVar.invoke(new Integer(i2), w7g1Var2);
                }
                int iIncrementAndGet2 = atomicInteger2.incrementAndGet();
                float fO2 = yoi1.o((atomicInteger.get() + iIncrementAndGet2) / i, 0.0f, 1.0f);
                int size3 = ghaVar2.a.size();
                int i6 = atomicInteger.get();
                int size4 = ghaVar2.b.size();
                if (0.0f > fO2 || fO2 > 1.0f) {
                    hhg1.n("overallProgress must be between 0.0 and 1.0");
                } else if (iIncrementAndGet2 < 0) {
                    hhg1.n("videosCompleted must be non-negative");
                } else if (size3 < 0) {
                    hhg1.n("videosTotal must be non-negative");
                } else if (iIncrementAndGet2 > size3) {
                    hhg1.n("videosCompleted cannot exceed videosTotal");
                } else if (i6 < 0) {
                    hhg1.n("imagesCompleted must be non-negative");
                } else if (size4 < 0) {
                    hhg1.n("imagesTotal must be non-negative");
                } else {
                    if (i6 <= size4) {
                        jpa jpaVar3 = this.t;
                        ConcurrentHashMap concurrentHashMap2 = jpaVar3.b.h;
                        long j2 = jpaVar3.c;
                        ppa ppaVar2 = (ppa) concurrentHashMap2.get(Long.valueOf(j2));
                        if (ppaVar2 != null) {
                            ppaVar2.b((long) (fO2 * 100.0f), j2);
                        }
                        return rih1Var;
                    }
                    hhg1.n("imagesCompleted cannot exceed imagesTotal");
                }
                return null;
        }
    }
}
