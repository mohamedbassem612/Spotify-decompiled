package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zt51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ju51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt51(ju51 ju51Var, byte b) {
        super(1);
        this.a = b;
        this.b = ju51Var;
    }

    public final Object invoke(Object obj) {
        tt51 tt51Var;
        byte b = this.a;
        ju51 ju51Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                LinkedHashMap linkedHashMap = ju51Var.m;
                Object un1Var = linkedHashMap.get(str);
                if (un1Var == null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode == -934610812) {
                        if (str.equals("remove")) {
                            tt51Var = (tt51) ju51Var.i.get();
                            un1Var = tt51Var;
                        }
                        k220.f("No bottom action element for ".concat(str));
                        return null;
                    }
                    if (iHashCode != 633711736) {
                        if (iHashCode == 807559211 && str.equals("add_to_queue")) {
                            tt51Var = (tt51) ju51Var.j.get();
                            un1Var = tt51Var;
                        }
                    } else if (str.equals("add_to_playlist")) {
                        cpq cpqVar = ju51Var.k;
                        yt51 yt51Var = new yt51(ju51Var);
                        byp bypVar = (byp) cpqVar.a.c;
                        un1Var = new un1(((jbt) bypVar.b).b, bypVar.l(), bypVar.D(), ((qop) bypVar.d).d(), new mhc((byte) 19, false), yt51Var);
                    }
                    k220.f("No bottom action element for ".concat(str));
                    return null;
                    linkedHashMap.put(str, un1Var);
                }
                return (maa) un1Var;
            default:
                return new rxc0(ju51Var.d);
        }
    }
}
