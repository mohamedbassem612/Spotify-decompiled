package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ebo extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebo(ug3 ug3Var, byte b) {
        super(4);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                dbo dboVar = (dbo) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var = dboVar.c;
                lvl0 lvl0Var = new lvl0(new mjl0(new mjl0((urk0) ug3Var.b, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), dboVar.d, (byte) 3);
                Integer numValueOf = Integer.valueOf(dboVar.b);
                int i = ((ysr0) ug3Var.d).d;
                String strD = i != 0 ? lf51.d(i) : null;
                if (strD == null) {
                    strD = "";
                }
                return new gwl0(lvl0Var, numValueOf, strD, dboVar.a);
            default:
                bpb1 bpb1VarB = gio1.b(z6x.a);
                return new oao((Context) obj2, (ViewGroup) obj3, new ne(3, new y0o(bpb1VarB, ug3Var, (byte) 3)), bpb1VarB, (byte) 1);
        }
    }
}
