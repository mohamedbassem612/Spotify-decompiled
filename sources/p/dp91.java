package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dp91 implements Function, SingleTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ip91 c;
    public final /* synthetic */ String d;

    public /* synthetic */ dp91(String str, ip91 ip91Var, String str2, byte b) {
        this.a = b;
        this.b = str;
        this.c = ip91Var;
        this.d = str2;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        String str = this.d;
        String str2 = this.b;
        ip91 ip91Var = this.c;
        switch (b) {
            case 0:
                return ip91Var.h((String) obj, str2, str, "plus").p(new cp91((byte) 0, str, ip91Var));
            case 1:
                List list = (List) obj;
                kkt0 kkt0Var = (kkt0) o7h.s0(list);
                return !u890.j(kkt0Var != null ? kkt0Var.a : null, str2) ? ip91Var.g.firstOrError().map(new q371(str2, list, str)) : Single.just(list);
            case 2:
            default:
                return ip91Var.h((String) obj, str2, str, "minus");
            case 3:
                return ((Boolean) obj).booleanValue() ? ip91Var.f.a(str2).flatMapObservable(new ap91(b2, str, ip91Var)) : Observable.just(new to91(Boolean.FALSE));
            case 4:
                return ((Boolean) obj).booleanValue() ? ip91Var.f.a(str2).flatMapObservable(new bp91(b2, str, ip91Var)) : Observable.just(new to91(Boolean.FALSE));
        }
    }

    public Single c(Single single) {
        return single.flatMap(new dp91(this.b, this.c, this.d, (byte) 1));
    }

    public /* synthetic */ dp91(ip91 ip91Var, String str, String str2, byte b) {
        this.a = b;
        this.c = ip91Var;
        this.b = str;
        this.d = str2;
    }
}
