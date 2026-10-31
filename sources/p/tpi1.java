package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tpi1 extends n95 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;

    public tpi1(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override // p.n95
    public final void a() {
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // p.n95
    public final void b() {
        Function0 function0 = this.a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
