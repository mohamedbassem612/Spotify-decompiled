package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g3o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0i b;
    public final /* synthetic */ sd5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3o(sd5 sd5Var, o0i o0iVar) {
        super(1);
        this.a = (byte) 0;
        this.c = sd5Var;
        this.b = o0iVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                c3o c3oVar = (c3o) obj;
                String str = c3oVar.a;
                sd5 sd5Var = this.c;
                o0i o0iVar = this.b;
                if (str == null || ihc1.y0(str)) {
                    z0i z0iVar = c3oVar.b;
                    if (z0iVar != null) {
                        bcl1.f((bcl1) sd5Var.c, o0iVar.e, "creator_row", (String) null, (String) null, r1o.N0, 12);
                        ((hcl1) sd5Var.d).c.m((Object) null, new icl1(z0iVar, true));
                    }
                } else {
                    ((lzn0) sd5Var.b).a(str, bcl1.f((bcl1) sd5Var.c, o0iVar.e, "creator_row", (String) null, (String) null, new i3o(str, (byte) 0), 12), (Bundle) null);
                }
                break;
            case 1:
                o0i o0iVar2 = this.b;
                fn31.T(o0iVar2.a, (o8n) null, 0, new h3o(this.c, o0iVar2, (String) obj, null, (byte) 0), 3);
                break;
            default:
                o0i o0iVar3 = this.b;
                fn31.T(o0iVar3.a, (o8n) null, 0, new h3o(this.c, o0iVar3, (String) obj, null, (byte) 1), 3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3o(o0i o0iVar, sd5 sd5Var, byte b) {
        super(1);
        this.a = b;
        this.b = o0iVar;
        this.c = sd5Var;
    }
}
