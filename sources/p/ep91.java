package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ep91 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip91 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ ep91(ip91 ip91Var, String str, String str2, String str3, byte b) {
        this.a = b;
        this.b = ip91Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        String str = this.e;
        String str2 = this.d;
        ip91 ip91Var = this.b;
        String str3 = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return ip91Var.f.a(str3).flatMapCompletable(new dp91(ip91Var, str2, str, b2));
                }
                Logger.k(l1d.m("Lens signal not allowed for context ", str3), new Object[0]);
                return CompletableEmpty.a;
            case 1:
                ip91 ip91Var2 = this.b;
                String str4 = this.c;
                String str5 = this.d;
                String str6 = this.e;
                return rqt0.F(o6x.a, new bj81((byte) 1, (Object) ip91Var2, (Object) str4, (Object) str5, (Object) str6, obj, (lnm) null)).flatMapCompletable(new k9p1(str6, (byte) 15));
            default:
                if (((Boolean) obj).booleanValue()) {
                    return ip91Var.f.a(str3).flatMapCompletable(new dp91(ip91Var, str2, str, (byte) 5));
                }
                Logger.k(l1d.m("Lens signal not allowed for context ", str3), new Object[0]);
                return CompletableEmpty.a;
        }
    }
}
