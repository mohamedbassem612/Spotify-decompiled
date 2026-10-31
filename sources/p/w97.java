package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w97 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ up41 a;

    public w97(up41 up41Var) {
        this.a = up41Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        bpb1 bpb1Var;
        i091 i091Var;
        ksm0 ksm0Var;
        n97 n97Var = (n97) obj;
        i iVar = n97Var.b;
        String strI = xcg1.i(iVar.a(), iVar.getUri(), n97Var.a);
        ec7 ec7Var = (ec7) this.a.b;
        r091 r091Var = (r091) ec7Var.e.getValue();
        if (r091Var == null || (bpb1Var = r091Var.g) == null || (i091Var = (i091) bpb1Var.getValue()) == null) {
            String strA = iVar.a();
            str = ihc1.y0(strA) ? null : strA;
            if (str != null) {
                ec7Var.a(new hqt0(iVar.getUri(), str, strI, n97Var.c));
            }
        } else {
            lsm0 lsm0Var = i091Var.a;
            if (u890.j((lsm0Var == null || (ksm0Var = lsm0Var.b) == null) ? null : ksm0Var.e, strI) && u890.j(i091Var.h, n091.a)) {
                ec7Var.b(strI);
            } else {
                String strA2 = iVar.a();
                if (ihc1.y0(strA2)) {
                }
                if (str != null) {
                    ec7Var.a(new hqt0(iVar.getUri(), str, strI, n97Var.c));
                }
            }
        }
        return rih1.a;
    }
}
