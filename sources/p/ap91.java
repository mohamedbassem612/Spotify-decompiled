package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ap91 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip91 b;
    public final /* synthetic */ String c;

    public ap91(String str, ip91 ip91Var) {
        this.a = (byte) 2;
        this.c = str;
        this.b = ip91Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        String str = this.c;
        ip91 ip91Var = this.b;
        switch (b) {
            case 0:
                Single singleFirstOrError = ip91Var.g.firstOrError();
                cz8 cz8Var = new cz8();
                cz8Var.a = str;
                cz8Var.b = (List) obj;
                return singleFirstOrError.map(cz8Var);
            case 1:
                return ip91Var.g(str, (String) obj).map(s9x0.O0);
            case 2:
                String str2 = (String) obj;
                return ip91Var.g(str2, str).firstOrError().map(new v2z(str2, str, (byte) 2));
            default:
                Completable completableFlatMapCompletable = ip91Var.f.a(str).flatMapCompletable(new ke71((Object) ip91Var, obj, (byte) 27));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.o(Functions.h);
        }
    }

    public /* synthetic */ ap91(byte b, String str, ip91 ip91Var) {
        this.a = b;
        this.b = ip91Var;
        this.c = str;
    }
}
