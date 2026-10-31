package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fkg0 implements Function {
    public static final fkg0 a = new fkg0();

    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        return new rjg0(bool.booleanValue());
    }
}
