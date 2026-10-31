package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.gvg;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RCPointer$tryAcquire$1 extends hab0 implements Function0 {
    final /* synthetic */ int $current;
    final /* synthetic */ String $source;
    final /* synthetic */ RCPointer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCPointer$tryAcquire$1(RCPointer rCPointer, String str, int i) {
        super(0);
        this.this$0 = rCPointer;
        this.$source = str;
        this.$current = i;
    }

    public final String invoke() {
        String label = this.this$0.getLabel();
        String str = this.$source;
        return gvg.j(gvg.n("Acquiring ", label, " (source: ", str, "; ref count before acquire: "), this.$current, ")");
    }
}
