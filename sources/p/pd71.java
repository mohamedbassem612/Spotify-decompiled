package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pd71 {
    public final bpb1 a = gio1.b((Object) null);

    public pd71(xgc xgcVar, nbc nbcVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        od71 od71Var;
        if (onmVar instanceof od71) {
            od71Var = (od71) onmVar;
            int i = od71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                od71Var.c = i - Integer.MIN_VALUE;
            } else {
                od71Var = new od71(this, onmVar);
            }
        } else {
            od71Var = new od71(this, onmVar);
        }
        Object obj = od71Var.a;
        int i2 = od71Var.c;
        d9n d9nVar = rd71.a;
        if (i2 == 0) {
            hm5.M(obj);
            od71Var.c = 1;
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
            obj = d9nVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    hm5.M(obj);
                    throw null;
                } catch (Throwable th) {
                    this.a.k((Object) null, (Object) null);
                    throw th;
                }
            }
            hm5.M(obj);
        }
        sd71 sd71Var = (sd71) obj;
        if (u890.j(sd71Var, d9nVar)) {
            return new md71(null);
        }
        if (u890.j(sd71Var, qd71.a)) {
            return ld71.a;
        }
        eg.o();
        return null;
    }
}
