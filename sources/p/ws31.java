package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ws31 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws31(xu30 xu30Var, byte b) {
        super(4);
        this.a = b;
        this.b = xu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                jh5 jh5Var = (jh5) obj;
                int iIntValue = ((Number) obj3).intValue();
                ((Number) obj4).intValue();
                zjd1 zjd1Var = jh5Var.a;
                i3r i3rVarO = ((ses0) obj2).o(iIntValue);
                if (i3rVarO == null) {
                    i3rVarO = i3r.a;
                }
                return (k3r) xu30Var.invoke(zjd1Var, jh5Var, i3rVarO);
            case 1:
                return (w7h1) xu30Var.invoke((n8h1) obj, ((jp61) obj2).c, obj4);
            default:
                ((Number) obj3).intValue();
                mv61 mv61Var = (mv61) xu30Var.invoke(obj, obj2, (r6h1) obj4);
                return mv61Var == null ? mv61.b : mv61Var;
        }
    }
}
