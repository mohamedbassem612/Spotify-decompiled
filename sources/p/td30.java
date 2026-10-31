package p;

import com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl$send$result$1;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSerialized;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class td30 implements nb00 {
    public final hc00 a;
    public final kb00 b;
    public final qav c;
    public final prz0 d;
    public final hc00 e;
    public final zq4 f;
    public final yc9 g;
    public final ac00 h;
    public final ic00 i;
    public final kc00 j;
    public final sc00 k;
    public final idd1 l = new idd1(new f710(this, (byte) 15));
    public long m;
    public final PublishProcessor n;

    public td30(hc00 hc00Var, lb00 lb00Var, rav ravVar, prz0 prz0Var, hc00 hc00Var2, zq4 zq4Var, yc9 yc9Var, Scheduler scheduler, ac00 ac00Var, ic00 ic00Var, kc00 kc00Var, rc00 rc00Var) {
        this.a = hc00Var;
        this.b = lb00Var;
        this.c = ravVar;
        this.d = prz0Var;
        this.e = hc00Var2;
        this.f = zq4Var;
        this.g = yc9Var;
        this.h = ac00Var;
        this.i = ic00Var;
        this.j = kc00Var;
        this.k = rc00Var;
        PublishProcessor publishProcessor = new PublishProcessor();
        this.n = publishProcessor;
        int i = Flowable.a;
        ObjectHelper.a(i, "capacity");
        new FlowableSerialized(new FlowableOnBackpressureBuffer(publishProcessor, i, Functions.c)).L(scheduler).m(new bm00(this, (byte) 6)).R(Long.MAX_VALUE, new ouz(this, (byte) 7)).subscribe(new xu(this, (byte) 29), new od30(this, (byte) 1));
    }

    public static tfs0 d(rfs0 rfs0Var, int i, lny0 lny0Var, boolean z) {
        String str = rfs0Var.a;
        if (i == 1) {
            return new tfs0(rfs0Var, i, lny0Var, str, z, true);
        }
        return new tfs0(new rfs0("RejectedClientEventNonAuth", t2p1.i(i, str), null, false, rfs0Var.e), i, lny0Var, rfs0Var.a, z, t2p1.o(i));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    @Override // p.nb00
    public final int a(String str, byte[] bArr, String str2, EventSenderCoreBridgeImpl$send$result$1 eventSenderCoreBridgeImpl$send$result$1) {
        rfs0 rfs0Var;
        String strA;
        String str3;
        boolean zA;
        boolean z;
        tfs0 tfs0VarD;
        String str4;
        int i;
        int iC;
        zq4 zq4Var;
        qd00 qd00Var = qd00.ENTERED;
        rav ravVar = (rav) this.c;
        ravVar.d(str, qd00Var);
        boolean zJ = d4o1.j(str);
        if (zJ) {
            if (str2 == null) {
                strA = this.b.a();
            } else {
                str3 = str2;
            }
            this.h.getClass();
            rfs0Var = new rfs0(str, bArr, str3, zJ, ac00.a());
            if (str.length() == 0) {
                tfs0VarD = d(rfs0Var, 3, eventSenderCoreBridgeImpl$send$result$1, false);
            } else {
                zA = this.d.a(str);
                z = !zA;
                boolean z2 = ((adn0) ((den0) this.j.b).get()).f;
                if (zA && z2 && !this.g.a.contains(str)) {
                    tfs0VarD = d(rfs0Var, 6, eventSenderCoreBridgeImpl$send$result$1, true);
                } else if (!zJ && (str3 == null || str3.length() == 0)) {
                    tfs0VarD = d(rfs0Var, 4, eventSenderCoreBridgeImpl$send$result$1, z);
                } else if (bArr.length <= 5120) {
                    tfs0VarD = d(rfs0Var, 1, eventSenderCoreBridgeImpl$send$result$1, z);
                } else {
                    tfs0VarD = d(rfs0Var, 5, eventSenderCoreBridgeImpl$send$result$1, z);
                }
            }
            str4 = tfs0VarD.d;
            i = tfs0VarD.b;
            if (i != 5 || i == 6 || i == 3 || i == 4) {
                ravVar.d(str4, qd00.REJECTED_CLIENT);
                iC = l1d.C(i);
                zq4Var = this.f;
                if (iC == 3) {
                    zq4Var.g();
                } else if (iC == 4) {
                    String.format(Locale.US, "Size of event %s exceeds maximum allowed payload size of %d bytes", Arrays.copyOf(new Object[]{str4, 5120}, 2));
                    zq4Var.g();
                }
            }
            if (tfs0VarD.e && !tfs0VarD.f) {
                return i;
            }
            this.n.onNext(tfs0VarD);
            return i;
        }
        strA = null;
        str3 = strA;
        this.h.getClass();
        rfs0Var = new rfs0(str, bArr, str3, zJ, ac00.a());
        if (str.length() == 0) {
            tfs0VarD = d(rfs0Var, 3, eventSenderCoreBridgeImpl$send$result$1, false);
        } else {
            zA = this.d.a(str);
            z = !zA;
            boolean z3 = ((adn0) ((den0) this.j.b).get()).f;
            if (zA) {
                if (!zJ) {
                    if (bArr.length <= 5120) {
                        tfs0VarD = d(rfs0Var, 1, eventSenderCoreBridgeImpl$send$result$1, z);
                    } else {
                        tfs0VarD = d(rfs0Var, 5, eventSenderCoreBridgeImpl$send$result$1, z);
                    }
                } else if (bArr.length <= 5120) {
                    tfs0VarD = d(rfs0Var, 1, eventSenderCoreBridgeImpl$send$result$1, z);
                } else {
                    tfs0VarD = d(rfs0Var, 5, eventSenderCoreBridgeImpl$send$result$1, z);
                }
            } else if (!zJ) {
                if (bArr.length <= 5120) {
                    tfs0VarD = d(rfs0Var, 1, eventSenderCoreBridgeImpl$send$result$1, z);
                } else {
                    tfs0VarD = d(rfs0Var, 5, eventSenderCoreBridgeImpl$send$result$1, z);
                }
            } else if (bArr.length <= 5120) {
                tfs0VarD = d(rfs0Var, 1, eventSenderCoreBridgeImpl$send$result$1, z);
            } else {
                tfs0VarD = d(rfs0Var, 5, eventSenderCoreBridgeImpl$send$result$1, z);
            }
        }
        str4 = tfs0VarD.d;
        i = tfs0VarD.b;
        if (i != 5) {
            ravVar.d(str4, qd00.REJECTED_CLIENT);
            iC = l1d.C(i);
            zq4Var = this.f;
            if (iC == 3) {
                zq4Var.g();
            } else if (iC == 4) {
                String.format(Locale.US, "Size of event %s exceeds maximum allowed payload size of %d bytes", Arrays.copyOf(new Object[]{str4, 5120}, 2));
                zq4Var.g();
            }
        } else {
            ravVar.d(str4, qd00.REJECTED_CLIENT);
            iC = l1d.C(i);
            zq4Var = this.f;
            if (iC == 3) {
                zq4Var.g();
            } else if (iC == 4) {
                String.format(Locale.US, "Size of event %s exceeds maximum allowed payload size of %d bytes", Arrays.copyOf(new Object[]{str4, 5120}, 2));
                zq4Var.g();
            }
        }
        if (tfs0VarD.e) {
        }
        this.n.onNext(tfs0VarD);
        return i;
    }

    @Override // p.nb00
    public final int b(byte[] bArr, String str) {
        return a("ZeroFrictionAuthentication", bArr, str, null);
    }

    @Override // p.nb00
    public final int c(String str, byte[] bArr) {
        return a(str, bArr, null, null);
    }

    public final void e(tfs0 tfs0Var) {
        boolean z = tfs0Var.f;
        rfs0 rfs0Var = tfs0Var.a;
        if (z) {
            ((mb00) this.l.getValue()).b(rfs0Var.a, rfs0Var.b, rfs0Var.d, rfs0Var.c, rfs0Var.e, ((adn0) ((den0) this.j.b).get()).l);
            if (this.g.a.contains(rfs0Var.a)) {
                this.h.getClass();
                long jB = ac00.b();
                if (jB - this.m >= 30000) {
                    this.m = jB;
                    this.i.run();
                }
            }
        }
        if (tfs0Var.e) {
            ((trz0) this.e.get()).d(tfs0Var.d);
        }
    }
}
