package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zch implements wsg0 {
    public final a1c0 a;
    public final k4h b;

    public zch(a1c0 a1c0Var, k4h k4hVar) {
        this.a = a1c0Var;
        this.b = k4hVar;
    }

    public final Single a(String str, String str2) {
        return Single.defer(new ych(this, str, str2, (byte) 1));
    }

    public final Single b(String str, String str2) {
        return Single.defer(new ych(this, str, str2, (byte) 0));
    }
}
