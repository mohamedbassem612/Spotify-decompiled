package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o171 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r171 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o171(r171 r171Var, byte b) {
        super(2);
        this.a = b;
        this.b = r171Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        r171 r171Var = this.b;
        switch (b) {
            case 0:
                j171 j171Var = (j171) obj;
                m171 m171Var = (m171) obj2;
                boolean z = m171Var.a;
                ibk0 ibk0Var = m171Var.b;
                return new k171(j171Var, z, ibk0Var != null ? new l171(ibk0Var, r171Var.Y.L, ((ol4) r171Var.c.a.getValue()).a()) : null);
            default:
                uvk0 uvk0Var = (uvk0) r171Var.s1.getValue();
                tom tomVar = ((j171) obj).j;
                String str = tomVar.a;
                uvk0Var.getClass();
                x6h1 x6h1VarC = uvk0Var.a.c();
                x6h1VarC.i.add(new a7h1("shareable_card", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = uvk0Var.b;
                l7h1 l7h1VarA = k7h1Var.a();
                if (m0p1.y(tomVar.f.b)) {
                    return l7h1VarA;
                }
                return null;
        }
    }
}
