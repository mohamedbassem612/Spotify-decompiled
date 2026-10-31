package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ssw implements xsw {
    public boolean a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public ssw(Function0 function0, Function0 function1) {
        this.b = function0;
        this.c = function1;
    }

    public final void a(boolean z) {
        if (z && !this.a) {
            this.b.invoke();
            this.a = true;
        } else {
            if (z || !this.a) {
                return;
            }
            this.c.invoke();
            this.a = false;
        }
    }

    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
