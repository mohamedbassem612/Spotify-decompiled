package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fpc extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kpc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpc(kpc kpcVar, byte b) {
        super(1);
        this.a = b;
        this.b = kpcVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kpc kpcVar = this.b;
        switch (b) {
            case 0:
                gfd1 gfd1Var = (gfd1) obj;
                Function0 function0 = kpcVar.n;
                if (function0 != null) {
                    gfd1Var.b = new pj8(function0, (byte) 14);
                }
                dpc dpcVar = kpcVar.m;
                if (dpcVar != null) {
                    gfd1Var.c = new dpc(dpcVar.a, dpcVar.b, dpcVar.c);
                }
                for (epc epcVar : kpcVar.l) {
                    gfd1Var.a.add(new ffd1(epcVar.a, epcVar.b, epcVar.c, epcVar.d, epcVar.e, epcVar.f, epcVar.g, epcVar.h, new b1c1(epcVar.i, (byte) 3)));
                }
                break;
            case 1:
                kpcVar.b.T((jb31) obj);
                break;
            default:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    String str = null;
                    h8k1 h8k1Var = obj2 instanceof h8k1 ? (h8k1) obj2 : null;
                    Object obj3 = h8k1Var != null ? h8k1Var.a : null;
                    if (obj3 instanceof apc) {
                        str = ((apc) obj3).a;
                    } else if (!u890.j(obj3, zoc.a)) {
                        u890.j(obj3, bpc.a);
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                kpcVar.b.T(new ec91(arrayList));
                break;
        }
        return rih1Var;
    }
}
