package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gp91 implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ip91 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Boolean f;

    public gp91(String str, String str2, String str3, ip91 ip91Var, Boolean bool) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.b = ip91Var;
        this.f = bool;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                jdu0 jdu0Var = (jdu0) obj;
                String str = jdu0Var.a;
                String str2 = this.c;
                boolean zJ = u890.j(str, str2);
                ip91 ip91Var = this.b;
                String str3 = this.e;
                String str4 = this.d;
                return (zJ && u890.j(jdu0Var.c, str4) && u890.j(jdu0Var.d, str3)) ? ip91Var.l() : ip91Var.d(str2).switchMap(new gp91(ip91Var, str2, str3, str4, this.f)).distinctUntilChanged();
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str5 = this.c;
                ip91 ip91Var2 = this.b;
                if (!zBooleanValue) {
                    return ip91Var2.f(str5).map(pdx0.O0).toObservable();
                }
                Observable observableFlatMapObservable = ip91Var2.f.a(str5).flatMapObservable(new vi11(ip91Var2, this.c, this.d, this.e, this.f, (byte) 13));
                observableFlatMapObservable.getClass();
                return observableFlatMapObservable;
        }
    }

    public gp91(ip91 ip91Var, String str, String str2, String str3, Boolean bool) {
        this.b = ip91Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bool;
    }
}
