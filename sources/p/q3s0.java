package p;

import com.spotify.liveroom.listeningparty.messagesourcefactory.PartyMessageSourceInstallException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q3s0 {
    public final kly0 a;
    public final mya1 b;

    public q3s0(kly0 kly0Var, mya1 mya1Var) {
        this.a = kly0Var;
        this.b = mya1Var;
    }

    public static PartyMessageSourceInstallException c(String str, String str2, TimeoutCancellationException timeoutCancellationException) {
        PartyMessageSourceInstallException partyMessageSourceInstallException = new PartyMessageSourceInstallException(gvg.h("LP dynamic feature load failed | ", str2, " | roomUri> ", str), timeoutCancellationException);
        String message = partyMessageSourceInstallException.getMessage();
        if (message != null) {
            str2 = message;
        }
        n57.t(str2, partyMessageSourceInstallException);
        return partyMessageSourceInstallException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws PartyMessageSourceInstallException {
        o3s0 o3s0Var;
        if (onmVar instanceof o3s0) {
            o3s0Var = (o3s0) onmVar;
            int i = o3s0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3s0Var.d = i - Integer.MIN_VALUE;
            } else {
                o3s0Var = new o3s0(this, onmVar);
            }
        } else {
            o3s0Var = new o3s0(this, onmVar);
        }
        Object objJ = o3s0Var.b;
        int i2 = o3s0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                mr20 mr20VarB = this.b.b(ohv.b);
                ytw0 ytw0Var = jfv.b;
                huz huzVarW = r4p1.w(mr20VarB, fdg1.l0(10000L, ngv.d));
                e3p0 e3p0Var = new e3p0(this, (lnm) null, (byte) 24);
                o3s0Var.a = str;
                o3s0Var.d = 1;
                objJ = b5p1.j(huzVarW, e3p0Var, o3s0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = o3s0Var.a;
                hm5.M(objJ);
            }
            nhv nhvVar = (nhv) objJ;
            if (u890.j(nhvVar, mhv.a)) {
                return rih1.a;
            }
            if (nhvVar instanceof khv) {
                throw c(str, "install failed: " + ((khv) nhvVar).a, null);
            }
            if (u890.j(nhvVar, jhv.a)) {
                throw c(str, "install cancelled", null);
            }
            if (u890.j(nhvVar, jhv.b)) {
                throw c(str, "dynamic features not enabled", null);
            }
            eg.m("Expected terminal install status");
            return null;
        } catch (TimeoutCancellationException e) {
            throw c(str, "install stalled for over 10000 ms", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) throws PartyMessageSourceInstallException {
        p3s0 p3s0Var;
        if (onmVar instanceof p3s0) {
            p3s0Var = (p3s0) onmVar;
            int i = p3s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p3s0Var.c = i - Integer.MIN_VALUE;
            } else {
                p3s0Var = new p3s0(this, onmVar);
            }
        } else {
            p3s0Var = new p3s0(this, onmVar);
        }
        Object obj = p3s0Var.a;
        int i2 = p3s0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.b.a().contains(ohv.b)) {
                p3s0Var.c = 1;
                Object objA = a(str, p3s0Var);
                Object obj2 = d9n.a;
                if (objA == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return this.a.get();
    }
}
