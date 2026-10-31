package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lsq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ lsq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ldo a(Function0 function0, t9h1 t9h1Var) {
        byte b = this.a;
        tsq tsqVar = this.b;
        switch (b) {
            case 0:
                wdm wdmVar = (wdm) tsqVar.c;
                xh71 xh71Var = (xh71) ((yxc1) wdmVar.b).b.get();
                c8o.l(xh71Var);
                xf60 xf60Var = new xf60(xh71Var);
                l8s l8sVar = (l8s) ((yxc1) wdmVar.b).c.get();
                c8o.l(l8sVar);
                return new ldo(xf60Var, l8sVar, new u6x((byte) 1), function0, t9h1Var);
            case 1:
                f0a f0aVar = (f0a) tsqVar.c;
                xh71 xh71Var2 = (xh71) ((lii1) f0aVar.b).h.get();
                c8o.l(xh71Var2);
                xf60 xf60Var2 = new xf60(xh71Var2);
                l8s l8sVar2 = (l8s) ((lii1) f0aVar.b).e.get();
                c8o.l(l8sVar2);
                return new ldo(xf60Var2, l8sVar2, new u6x((byte) 1), function0, t9h1Var);
            default:
                wj3 wj3Var = (wj3) tsqVar.c;
                xh71 xh71Var3 = (xh71) ((pii1) wj3Var.b).h.get();
                c8o.l(xh71Var3);
                xf60 xf60Var3 = new xf60(xh71Var3);
                l8s l8sVar3 = (l8s) ((pii1) wj3Var.b).f.get();
                c8o.l(l8sVar3);
                return new ldo(xf60Var3, l8sVar3, new u6x((byte) 1), function0, t9h1Var);
        }
    }
}
