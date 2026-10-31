package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e610 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g610 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ e610(g610 g610Var, String str, String str2, byte b) {
        this.a = b;
        this.b = g610Var;
        this.c = str;
        this.d = str2;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        g610 g610Var = this.b;
        switch (b) {
            case 0:
                return g610Var.f.h(str2, str, (Map) obj);
            default:
                return g610Var.f.h(str2, str, (Map) obj);
        }
    }
}
