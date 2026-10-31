package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vrn implements Function {
    public final /* synthetic */ byte a;
    public final yqg b;

    public vrn(yqg yqgVar, q3c q3cVar) {
        this.a = (byte) 0;
        this.b = yqgVar;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        yqg yqgVar = this.b;
        switch (b) {
            case 0:
                String str = ((m23) obj).b;
                return new c33(yqgVar.b(), UUID.randomUUID().toString(), str);
            default:
                return new rk91(yqgVar.e());
        }
    }

    public /* synthetic */ vrn(yqg yqgVar, byte b) {
        this.a = b;
        this.b = yqgVar;
    }
}
