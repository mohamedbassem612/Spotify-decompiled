package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class of81 implements Action {
    public final /* synthetic */ pf81 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public of81(pf81 pf81Var, String str, boolean z, boolean z2) {
        this.a = pf81Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final void run() {
        this.a.f.onNext(new mmr0(this.b, new u3u0(Boolean.valueOf(this.c), Boolean.valueOf(this.d))));
    }
}
