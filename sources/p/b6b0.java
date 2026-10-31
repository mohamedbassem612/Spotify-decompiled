package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b6b0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s061 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6b0(s061 s061Var, byte b) {
        super(1);
        this.a = b;
        this.b = s061Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s061 s061Var = this.b;
        switch (b) {
            case 0:
                return new ow9(s061Var.b, (Set) obj, (byte) 4);
            case 1:
                return new j3r(new u061(((Set) s061Var.b.a.getValue()).contains((String) obj)));
            case 2:
                return new sns(new x010(s061Var.d, s061Var.b, new vm0(3, (lnm) null, (byte) 20), (byte) 1), (Set) obj, (byte) 1);
            default:
                return new j3r(new gz51((Set) s061Var.b.a.getValue(), ((Boolean) s061Var.d.a.getValue()).booleanValue()));
        }
    }
}
