package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vmg0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7t b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ vmg0(g7t g7tVar, String str, String str2, byte b) {
        this.a = b;
        this.b = g7tVar;
        this.c = str;
        this.d = str2;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        g7t g7tVar = this.b;
        switch (b) {
            case 0:
                return ((cqy0) g7tVar.c).a(str2, str, ((Integer) obj).intValue());
            default:
                if (((Boolean) obj).booleanValue()) {
                    Single map = ((Single) ((e6u) g7tVar.b).invoke()).flatMap(new vmg0(g7tVar, str2, str, (byte) 0)).map(kc20.N0);
                    map.getClass();
                    return map;
                }
                Single singleJust = Single.just(new wmg0(2));
                singleJust.getClass();
                return singleJust;
        }
    }
}
