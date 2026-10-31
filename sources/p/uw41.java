package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uw41 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi11 b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw41(vi11 vi11Var, Map map, Map map2, String str, byte b) {
        super(0);
        this.a = b;
        this.b = vi11Var;
        this.c = map;
        this.d = map2;
        this.e = str;
    }

    public final Object invoke() {
        byte b = this.a;
        String str = this.e;
        Map<String, String> map = this.d;
        Map<String, String> map2 = this.c;
        vi11 vi11Var = this.b;
        switch (b) {
            case 0:
                return ((rd51) vi11Var.b).e(map2, map).map(new m021(str, vi11Var, (byte) 22));
            default:
                return ((rd51) vi11Var.b).c(map2, map).map(new acn1(str, vi11Var));
        }
    }
}
