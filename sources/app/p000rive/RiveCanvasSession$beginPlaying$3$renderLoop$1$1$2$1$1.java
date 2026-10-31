package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveCanvasSession$beginPlaying$3$renderLoop$1$1$2$1$1 extends hab0 implements Function0 {
    public static final RiveCanvasSession$beginPlaying$3$renderLoop$1$1$2$1$1 INSTANCE = new RiveCanvasSession$beginPlaying$3$renderLoop$1$1$2$1$1();

    public RiveCanvasSession$beginPlaying$3$renderLoop$1$1$2$1$1() {
        super(0);
    }

    public final String invoke() {
        return "No render buffer available; call setRegion(...) with a valid size before beginPlaying.";
    }
}
