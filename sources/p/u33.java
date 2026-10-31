package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u33 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ u33(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object get() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                break;
        }
        return Single.just(str);
    }
}
