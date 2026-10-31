package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y8n extends fai0 {
    public w6b Z;

    @Override // p.fai0, p.ymd0
    public final void h() {
        super.h();
        w6b w6bVar = this.Z;
        if (w6bVar != null) {
            faa0 faa0Var = w6bVar.g;
            if (faa0Var != null) {
                ha71.o(faa0Var);
            }
            lnm lnmVar = null;
            w6bVar.g = null;
            if (w6bVar.f != null) {
                return;
            }
            w6bVar.f = c921.y(w6bVar.d, (o8n) null, 0, new k53(w6bVar, lnmVar, (byte) 3), 3);
        }
    }

    @Override // p.fai0, p.ymd0
    public final void i() {
        super.i();
        w6b w6bVar = this.Z;
        if (w6bVar != null) {
            if (w6bVar.g != null) {
                eg.m("Cancel call cannot happen without a maybeRun");
                return;
            }
            llm llmVar = w6bVar.d;
            fns fnsVar = igu.a;
            w6bVar.g = c921.y(llmVar, pyf0.a.f, 0, new vk6(w6bVar, (lnm) null, (byte) 10), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void o(onm onmVar) {
        x8n x8nVar;
        if (onmVar instanceof x8n) {
            x8nVar = (x8n) onmVar;
            int i = x8nVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8nVar.c = i - Integer.MIN_VALUE;
            } else {
                x8nVar = new x8n(this, onmVar);
            }
        } else {
            x8nVar = new x8n(this, onmVar);
        }
        Object obj = x8nVar.a;
        int i2 = x8nVar.c;
        if (i2 == 0 || i2 == 1) {
            hm5.M(obj);
        } else {
            eg.m("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
