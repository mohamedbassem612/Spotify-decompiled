package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvs0 implements lf81 {
    public final /* synthetic */ byte a;

    public final Single a(int i, yrc0 yrc0Var) {
        boolean z;
        byte b = this.a;
        if81 if81Var = if81.a;
        if81 if81Var2 = if81.b;
        switch (b) {
            case 0:
                if (i == 5) {
                    return Single.just(new kf81(f46.S0(new if81[]{if81Var, if81Var2})));
                }
                z = (yrc0Var != null ? yrc0Var.f : 0) == 5;
                Set setS0 = z ? f46.S0(new if81[]{if81Var, if81Var2}) : Collections.singleton(if81Var2);
                if (!z) {
                    if81Var = if81Var2;
                }
                return Single.just(new kf81(setS0, if81Var, z));
            default:
                if (i == 5) {
                    return Single.just(new kf81(f46.S0(new if81[]{if81Var, if81Var2})));
                }
                Set setW0 = dm61.w0(new if81[]{if81Var2});
                z = (yrc0Var != null ? yrc0Var.f : 0) == 5;
                if (z) {
                    setW0.add(if81Var);
                }
                if (!z) {
                    if81Var = if81Var2;
                }
                return Single.just(new kf81(setW0, if81Var, z));
        }
    }
}
