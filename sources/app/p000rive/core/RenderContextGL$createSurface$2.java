package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RenderContextGL$createSurface$2 extends hab0 implements Function0 {
    final /* synthetic */ String $error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderContextGL$createSurface$2(String str) {
        super(0);
        this.$error = str;
    }

    public final String invoke() {
        return l1d.m("eglCreateWindowSurface failed with error: ", this.$error);
    }
}
