package p;

import com.spotify.liveroom.listeningparty.messagesourcefactory.PartyMessageSourceInstallException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vjd0 implements f961 {
    public final yqg a;
    public final zip0 b;
    public final cfd c;
    public final kly0 d;
    public final q3s0 e;
    public final llm f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final Object h = new Object();
    public boolean i = true;

    public vjd0(yqg yqgVar, zip0 zip0Var, cfd cfdVar, kly0 kly0Var, q3s0 q3s0Var, q8n q8nVar) {
        this.a = yqgVar;
        this.b = zip0Var;
        this.c = cfdVar;
        this.d = kly0Var;
        this.e = q3s0Var;
        this.f = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) throws PartyMessageSourceInstallException {
        rjd0 rjd0Var;
        if (onmVar instanceof rjd0) {
            rjd0Var = (rjd0) onmVar;
            int i = rjd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rjd0Var.e = i - Integer.MIN_VALUE;
            } else {
                rjd0Var = new rjd0(this, onmVar);
            }
        } else {
            rjd0Var = new rjd0(this, onmVar);
        }
        Object objB = rjd0Var.c;
        int i2 = rjd0Var.e;
        if (i2 == 0) {
            hm5.M(objB);
            rjd0Var.a = str;
            rjd0Var.b = str2;
            rjd0Var.e = 1;
            objB = this.e.b(str, rjd0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = rjd0Var.b;
            str = rjd0Var.a;
            hm5.M(objB);
        }
        return new b8d0(yoi1.g(((l3s0) objB).b(((qq4) this.d.get()).h(), str2, str).flatMapIterable(zj20.i)), this, (byte) 5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, s3s0 s3s0Var, onm onmVar) throws PartyMessageSourceInstallException {
        sjd0 sjd0Var;
        u3f u3fVar;
        if (onmVar instanceof sjd0) {
            sjd0Var = (sjd0) onmVar;
            int i = sjd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjd0Var.e = i - Integer.MIN_VALUE;
            } else {
                sjd0Var = new sjd0(this, onmVar);
            }
        } else {
            sjd0Var = new sjd0(this, onmVar);
        }
        Object objA = sjd0Var.c;
        int i2 = sjd0Var.e;
        if (i2 == 0) {
            hm5.M(objA);
            String str2 = s3s0Var.a;
            if (str2 == null) {
                eg.m("Required value was null.");
                return null;
            }
            ibf ibfVar = s3s0Var.c;
            u3f u3fVar2 = new u3f(ibfVar, p7h.N(ibfVar));
            sjd0Var.a = s3s0Var;
            sjd0Var.b = u3fVar2;
            sjd0Var.e = 1;
            objA = a(str, str2, sjd0Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
            u3fVar = u3fVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u3fVar = sjd0Var.b;
            s3s0Var = sjd0Var.a;
            hm5.M(objA);
        }
        return z4p1.v(new ipr(u3fVar, (mr20) objA, new qr0(this, (lnm) null, (byte) 29), (byte) 16), s3s0Var.c != null ? 0 : 1);
    }

    public final void shutdown() {
        synchronized (this.h) {
            if (this.i) {
                this.i = false;
                smo1.p(this.f, (CancellationException) null);
                this.g.clear();
            }
        }
    }

    public final Object getApi() {
        return this;
    }
}
