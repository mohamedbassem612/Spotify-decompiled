package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class owb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ los b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owb(los losVar, byte b) {
        super(1);
        this.a = b;
        this.b = losVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        los losVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (losVar != null) {
                    Iterator it = losVar.b.iterator();
                    while (it.hasNext()) {
                        ((iu30) it.next()).invoke(bool);
                    }
                }
                break;
            case 1:
                hxb hxbVar = (hxb) obj;
                if (losVar != null) {
                    Iterator it2 = losVar.c.iterator();
                    while (it2.hasNext()) {
                        ((iu30) it2.next()).invoke(hxbVar);
                    }
                }
                break;
            default:
                ixb ixbVar = (ixb) obj;
                if (losVar != null) {
                    Iterator it3 = losVar.d.iterator();
                    while (it3.hasNext()) {
                        ((iu30) it3.next()).invoke(ixbVar);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
