package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hv01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu00 b;
    public final /* synthetic */ vh4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv01(uu00 uu00Var, vh4 vh4Var, byte b) {
        super(1);
        this.a = b;
        this.b = uu00Var;
        this.c = vh4Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vh4 vh4Var = this.c;
        zu00 zu00Var = this.b;
        switch (b) {
            case 0:
                List listQ0 = ihc1.Q0((String) obj, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listQ0) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                List listD1 = o7h.d1(arrayList, 3);
                if (listD1.isEmpty()) {
                    return new huz(new gv01(z6x.a, 0), (byte) 10);
                }
                ezc ezcVarG = yoi1.g(zu00Var.b(new oi("recents", false, new nec0(listD1, (byte) 15))).filter(ybx0.e).take(1L).map(new y3v0(listD1, (byte) 1)));
                return vh4Var.a() ? new ht20(ezcVarG, new nw5(2, (lnm) null, (byte) 25)) : ezcVarG;
            default:
                String str = (String) obj;
                if (!nhc1.Y(str, "spotify:user:", false)) {
                    return new huz(new jw01(str, "", "", ""), (byte) 10);
                }
                ezc ezcVarG2 = yoi1.g(zu00Var.b(new oi("recents", false, new q4z0(str, (byte) 14))).filter(jcx0.e).take(1L).map(new xrh(str, (byte) 5)));
                return vh4Var.a() ? new ht20(ezcVarG2, new nw5(2, (lnm) null, (byte) 28)) : ezcVarG2;
        }
    }
}
