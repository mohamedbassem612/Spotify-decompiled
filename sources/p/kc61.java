package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kc61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc61(uc61 uc61Var, byte b) {
        super(1);
        this.a = b;
        this.b = uc61Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uc61 uc61Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                LinkedHashMap linkedHashMap = uc61Var.i;
                Object resVar = linkedHashMap.get(str);
                if (resVar == null) {
                    yp4 yp4Var = uc61Var.d;
                    xe01 xe01Var = uc61Var.j;
                    if (yp4Var.a() && ihc1.X0(str, "$").equals("prompt")) {
                        cp31 cp31Var = (cp31) uc61Var.f.a.c;
                        lzn0 lzn0Var = (lzn0) ((l3q) cp31Var.c).b.i.get();
                        c8o.l(lzn0Var);
                        u9c0 u9c0VarU = cp31Var.u();
                        String strD = ((qop) cp31Var.b).d();
                        zob1 zob1Var = ((jbt) cp31Var.a).a;
                        c8o.l(zob1Var);
                        resVar = new cm0(lzn0Var, u9c0VarU, strD, zob1Var, cp31Var.M(), str, xe01Var);
                    } else {
                        cp31 cp31Var2 = (cp31) uc61Var.e.a.c;
                        resVar = new res(cp31Var2.u(), cp31Var2.M(), str, xe01Var);
                    }
                    linkedHashMap.put(str, resVar);
                }
                return (maa) resVar;
            default:
                return new rxc0(uc61Var.a);
        }
    }
}
