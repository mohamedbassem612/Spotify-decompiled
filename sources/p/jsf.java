package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jsf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u7h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jsf(u7h u7hVar, byte b) {
        super(2);
        this.a = b;
        this.b = u7hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        u7h u7hVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(tnx.c, isl.a, (qim0) null, u7hVar != null ? u7hVar.a : u7h.k, 0L, false, x340Var2, tnx.d | 48, 52);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 1:
                long j = u7hVar.a;
                return u7hVar;
            case 2:
                long j2 = u7hVar.a;
                return u7hVar;
            case 3:
                long j3 = u7hVar.a;
                return u7hVar;
            default:
                return new u7h(u7hVar != null ? u7hVar.a : u7h.j);
        }
    }
}
