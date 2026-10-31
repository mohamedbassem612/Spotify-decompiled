package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cp91 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip91 b;
    public final /* synthetic */ String c;

    public /* synthetic */ cp91(byte b, String str, ip91 ip91Var) {
        this.a = b;
        this.b = ip91Var;
        this.c = str;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        String str = this.c;
        ip91 ip91Var = this.b;
        switch (b) {
            case 0:
                ip91Var.getClass();
                return new CompletableFromAction(new fp91((byte) 1, str, ip91Var)).c(Completable.j((Throwable) obj));
            default:
                uo91 uo91Var = (uo91) obj;
                String str2 = uo91Var.b;
                return (str2.length() <= 0 || !uo91Var.c.contains(new ll81("tap"))) ? CompletableEmpty.a : ip91Var.h(uo91Var.a, str2, str, "tap");
        }
    }
}
