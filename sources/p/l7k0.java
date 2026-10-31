package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l7k0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m7k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7k0(m7k0 m7k0Var, byte b) {
        super(1);
        this.a = b;
        this.b = m7k0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        m7k0 m7k0Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(m7k0Var.a);
            default:
                hwq hwqVar = (hwq) obj;
                String str = m7k0Var.a;
                l7e0 l7e0Var = hwqVar.g;
                j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                dwq dwqVar = hwqVar.e;
                if (j7e0Var != null) {
                    zuc0 zuc0Var = j7e0Var.a;
                    if (dwqVar != null) {
                        a8k0 a8k0Var = new a8k0(zuc0Var.c, zuc0Var.a, zuc0Var.f(), zuc0Var.g);
                        String str2 = dwqVar.a;
                        String str3 = dwqVar.b;
                        return new c8k0(new a8k0(str2, str3 != null ? str3 : "", dwqVar.c, dwqVar.d), a8k0Var, str, hwqVar.f.c);
                    }
                }
                b7x b7xVar = b7x.a;
                return new c8k0(new a8k0("", "", false, b7xVar), new a8k0("", "", false, b7xVar), str, b7xVar);
        }
    }
}
