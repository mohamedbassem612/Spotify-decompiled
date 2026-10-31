package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j961 extends hab0 implements Function0 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ hpq b;
    public final /* synthetic */ k961 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j961(Integer num, hpq hpqVar, k961 k961Var) {
        super(0);
        this.a = num;
        this.b = hpqVar;
        this.c = k961Var;
    }

    public final Object invoke() {
        k961 k961Var = this.c;
        Integer num = this.a;
        hpq hpqVar = this.b;
        if (num != null) {
            hpqVar.startForeground(28, k961Var.a(), num.intValue());
        } else {
            hpqVar.startForeground(28, k961Var.a());
        }
        return rih1.a;
    }
}
