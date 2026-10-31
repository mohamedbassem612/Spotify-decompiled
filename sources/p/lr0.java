package p;

import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lr0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final bpb1 b;
    public final bpb1 c;
    public final llm d;

    public lr0(q8n q8nVar) {
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        this.d = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ruz ruzVar, boolean z, onm onmVar) {
        kr0 kr0Var;
        if (onmVar instanceof kr0) {
            kr0Var = (kr0) onmVar;
            int i = kr0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                kr0Var.c = i - os00.INVALID_ID;
            } else {
                kr0Var = new kr0(this, onmVar);
            }
        } else {
            kr0Var = new kr0(this, onmVar);
        }
        Object objJ = kr0Var.a;
        int i2 = kr0Var.c;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var = this.b;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (z) {
                    bpb1Var.m((Object) null, Boolean.TRUE);
                    Single singleA = ruzVar.a(new d9u0("ads-playercontroller", false));
                    kr0Var.c = 1;
                    objJ = fc11.j(singleA, kr0Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
            z2 = ((feh) objJ) instanceof ceh;
            if (z2) {
                this.a.set(true);
            }
            if (!z2) {
                bpb1Var.m((Object) null, Boolean.FALSE);
            }
            return rih1Var;
        } catch (Throwable th) {
            if (!z2) {
                bpb1Var.m((Object) null, Boolean.FALSE);
            }
            throw th;
        }
    }

    public final void b(w9u0 w9u0Var) {
        this.b.m((Object) null, Boolean.FALSE);
        if (this.a.getAndSet(false)) {
            fn31.T(this.d, null, 0, new qm(w9u0Var, (lnm) null, (byte) 2), 3);
        }
    }
}
