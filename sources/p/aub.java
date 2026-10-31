package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aub implements nku {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;

    public aub(Function0 function0, boolean z) {
        this.a = z;
        this.b = function0;
    }

    public final void dispose() {
        if (this.a) {
            this.b.invoke();
        }
    }
}
