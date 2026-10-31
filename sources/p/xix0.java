package p;

import java.util.List;
import java.util.concurrent.CancellationException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xix0 implements rix0 {
    public final zxl a;
    public final jn7 b;
    public final boolean c;
    public final zix0 d;
    public final zhq0 e;
    public final mga f;

    public xix0(yix0 yix0Var, yll yllVar, zxl zxlVar, jn7 jn7Var, q8n q8nVar, n6r0 n6r0Var, boolean z) {
        this.a = zxlVar;
        this.b = jn7Var;
        this.c = z;
        this.d = z ? yllVar.a(n6r0Var) : yix0Var.a(n6r0Var);
        this.e = new zhq0((byte) 14);
        this.f = d7p1.f(hjx0.a, q8nVar, new ian0(this, (lnm) null, (byte) 18), new eoc((byte) 26), new mwv0(this, (byte) 26), (iu30) null, 16);
    }

    public final void b(ses0 ses0Var) {
        this.f.b(ses0Var);
    }

    public final pua0 c(iu30 iu30Var) {
        mga mgaVar = this.f;
        mgaVar.getClass();
        return new jga(mgaVar, iu30Var);
    }

    public final zjd1 d() {
        return this.f.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(List list, onm onmVar) {
        vix0 vix0Var;
        if (onmVar instanceof vix0) {
            vix0Var = (vix0) onmVar;
            int i = vix0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vix0Var.c = i - Integer.MIN_VALUE;
            } else {
                vix0Var = new vix0(this, onmVar);
            }
        } else {
            vix0Var = new vix0(this, onmVar);
        }
        Object obj = vix0Var.a;
        int i2 = vix0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                t831 t831VarO = ResumptionProgressEsperanto.MarkAsFinishedRequest.o();
                t831VarO.n(list);
                ResumptionProgressEsperanto.MarkAsFinishedRequest markAsFinishedRequestBuild = t831VarO.build();
                jn7 jn7Var = this.b;
                markAsFinishedRequestBuild.getClass();
                vix0Var.c = 1;
                Object objL = jn7Var.L(markAsFinishedRequestBuild, vix0Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException unused) {
            throw new CancellationException();
        } catch (Exception unused2) {
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List list, onm onmVar) {
        wix0 wix0Var;
        if (onmVar instanceof wix0) {
            wix0Var = (wix0) onmVar;
            int i = wix0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wix0Var.c = i - Integer.MIN_VALUE;
            } else {
                wix0Var = new wix0(this, onmVar);
            }
        } else {
            wix0Var = new wix0(this, onmVar);
        }
        Object obj = wix0Var.a;
        int i2 = wix0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                v831 v831VarO = ResumptionProgressEsperanto.MarkAsNotStartedRequest.o();
                v831VarO.n(list);
                ResumptionProgressEsperanto.MarkAsNotStartedRequest markAsNotStartedRequestBuild = v831VarO.build();
                jn7 jn7Var = this.b;
                markAsNotStartedRequestBuild.getClass();
                wix0Var.c = 1;
                Object objM = jn7Var.M(markAsNotStartedRequestBuild, wix0Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException unused) {
            throw new CancellationException();
        } catch (Exception unused2) {
        }
        return rih1.a;
    }
}
