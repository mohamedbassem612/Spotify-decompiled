package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pte {
    public final bfd a;

    public pte(bfd bfdVar) {
        this.a = bfdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        ote oteVar;
        if (onmVar instanceof ote) {
            oteVar = (ote) onmVar;
            int i = oteVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oteVar.c = i - Integer.MIN_VALUE;
            } else {
                oteVar = new ote(this, onmVar);
            }
        } else {
            oteVar = new ote(this, onmVar);
        }
        Object obj = oteVar.a;
        int i2 = oteVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bfd bfdVar = this.a;
                oteVar.c = 1;
                Object objM = bfdVar.m(str, str2, oteVar);
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
            return k821.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return j821.a;
        }
    }
}
