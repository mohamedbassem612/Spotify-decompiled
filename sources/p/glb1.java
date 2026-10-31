package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class glb1 extends a8d1 implements vu30 {
    public final /* synthetic */ hlb1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glb1(hlb1 hlb1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = hlb1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new glb1(this.a, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        glb1 glb1VarCreate = create((vr20) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        glb1VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        hlb1 hlb1Var = this.a;
        hlb1Var.a.addApplicationStartInfoCompletionListener(qgo1.l(hlb1Var.b), new rex0(hlb1Var, (byte) 1));
        return rih1.a;
    }
}
