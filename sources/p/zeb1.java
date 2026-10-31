package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zeb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gfb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zeb1(gfb1 gfb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = gfb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gfb1 gfb1Var = this.b;
        switch (b) {
            case 0:
                web1 web1Var = (web1) obj;
                d0r d0rVar = gfb1Var.e;
                ay8 ay8VarH = d0rVar != null ? d3p1.H(d0rVar, gfb1Var.g, web1Var) : d5p1.h(gio1.b(new yeb1(web1Var.b, web1Var.c)));
                return yzo1.j(d0rVar == null ? ryn1.y((yeb1) ay8VarH.getValue(), (Map) gfb1Var.a.getValue()) : (yeb1) ay8VarH.getValue(), new uk71(gfb1Var, ay8VarH, (lnm) null, (byte) 29));
            case 1:
                web1 web1Var2 = (web1) obj;
                d0r d0rVar2 = gfb1Var.e;
                return d0rVar2 != null ? d3p1.H(d0rVar2, gfb1Var.g, web1Var2) : d5p1.h(gio1.b(new yeb1(web1Var2.b, web1Var2.c)));
            case 2:
                String str = ((web1) obj).a;
                if (gfb1Var.c) {
                    return str;
                }
                return null;
            default:
                String str2 = ((web1) obj).a;
                if (gfb1Var.c) {
                    return str2;
                }
                return null;
        }
    }
}
