package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqq0 {
    public final Random a;
    public final lxg b;
    public final String[] c = {"arm64-v8a", "x86_64", "armeabi-v7a", "x86"};
    public final BehaviorSubject d = BehaviorSubject.g(iqq0.a);
    public final hwb e = new hwb((byte) 18);

    static {
        new pob((byte) 18, false);
    }

    public jqq0(Random random, lxg lxgVar) {
        this.a = random;
        this.b = lxgVar;
    }
}
