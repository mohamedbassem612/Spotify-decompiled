package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v371 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o2n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v371(o2n0 o2n0Var, byte b) {
        super(2);
        this.a = b;
        this.b = o2n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = true;
        o2n0 o2n0Var = this.b;
        switch (b) {
            case 0:
                s371 s371Var = (s371) obj;
                wn71 wn71Var = (wn71) obj2;
                boolean z2 = wn71Var.c;
                String str = s371Var.a;
                Set set = s4b1.f;
                int iOrdinal = uic.x(str).c.ordinal();
                boolean z3 = iOrdinal == 844 || iOrdinal == 860;
                boolean z4 = !o2n0Var.c && s371Var.d && z2;
                String str2 = wn71Var.a;
                return new t371(s371Var, str2.length() == 0 ? null : str2, (z3 && z4) ? false : true, !z3 || (wn71Var.b && !z4), z3 && z2);
            default:
                jo70 jo70Var = (jo70) obj;
                h1r h1rVar = (k1r) obj2;
                String str3 = jo70Var != null ? jo70Var.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                boolean z5 = o2n0Var.c;
                if (!(h1rVar instanceof i1r)) {
                    if (h1rVar instanceof j1r) {
                        if (z5) {
                            z = false;
                        }
                    } else {
                        if (!(h1rVar instanceof h1r)) {
                            eg.o();
                            return null;
                        }
                        if (eyo1.s(h1rVar.a)) {
                            z = false;
                        }
                    }
                }
                return new wn71(str3, z, h1rVar instanceof j1r);
        }
    }
}
