package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class k8q0 extends tv30 implements xu30 {
    public static final k8q0 a = new k8q0(3, l8q0.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l8q0 l8q0Var = (l8q0) obj;
        ou51 ou51Var = (ou51) obj2;
        long j = l8q0Var.a;
        rih1 rih1Var = rih1.a;
        if (j <= 0) {
            ou51Var.e = rih1Var;
            return rih1Var;
        }
        Runnable zyh0Var = new zyh0(ou51Var, l8q0Var, (byte) 13);
        o8n o8nVar = ou51Var.a;
        ou51Var.c = hap1.l(o8nVar).f(j, zyh0Var, o8nVar);
        return rih1Var;
    }
}
