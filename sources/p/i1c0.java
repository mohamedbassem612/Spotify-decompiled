package p;

import java.util.List;
import java.util.concurrent.CancellationException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i1c0 implements rix0 {
    public final zxl a;
    public final jn7 b;
    public final q8n c;
    public final boolean d;
    public final bpb1 e;
    public final nix0 f;

    public i1c0(zxl zxlVar, jn7 jn7Var, q8n q8nVar, pix0 pix0Var, n6r0 n6r0Var, boolean z) {
        this.a = zxlVar;
        this.b = jn7Var;
        this.c = q8nVar;
        this.d = z;
        bpb1 bpb1VarB = gio1.b(w7x.a);
        this.e = bpb1VarB;
        this.f = o1p1.y(pix0Var.a.a(bpb1VarB, n6r0Var, z)).d();
    }

    public final pua0 c(iu30 iu30Var) {
        return new jrb0(this, iu30Var);
    }

    public final zjd1 d() {
        return hjx0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(List list, onm onmVar) {
        g1c0 g1c0Var;
        if (onmVar instanceof g1c0) {
            g1c0Var = (g1c0) onmVar;
            int i = g1c0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g1c0Var.c = i - Integer.MIN_VALUE;
            } else {
                g1c0Var = new g1c0(this, onmVar);
            }
        } else {
            g1c0Var = new g1c0(this, onmVar);
        }
        Object obj = g1c0Var.a;
        int i2 = g1c0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                t831 t831VarO = ResumptionProgressEsperanto.MarkAsFinishedRequest.o();
                t831VarO.n(list);
                ResumptionProgressEsperanto.MarkAsFinishedRequest markAsFinishedRequestBuild = t831VarO.build();
                jn7 jn7Var = this.b;
                markAsFinishedRequestBuild.getClass();
                g1c0Var.c = 1;
                Object objL = jn7Var.L(markAsFinishedRequestBuild, g1c0Var);
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
        h1c0 h1c0Var;
        if (onmVar instanceof h1c0) {
            h1c0Var = (h1c0) onmVar;
            int i = h1c0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1c0Var.c = i - Integer.MIN_VALUE;
            } else {
                h1c0Var = new h1c0(this, onmVar);
            }
        } else {
            h1c0Var = new h1c0(this, onmVar);
        }
        Object obj = h1c0Var.a;
        int i2 = h1c0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                v831 v831VarO = ResumptionProgressEsperanto.MarkAsNotStartedRequest.o();
                v831VarO.n(list);
                ResumptionProgressEsperanto.MarkAsNotStartedRequest markAsNotStartedRequestBuild = v831VarO.build();
                jn7 jn7Var = this.b;
                markAsNotStartedRequestBuild.getClass();
                h1c0Var.c = 1;
                Object objM = jn7Var.M(markAsNotStartedRequestBuild, h1c0Var);
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
