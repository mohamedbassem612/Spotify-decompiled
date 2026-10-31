package p;

import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i2s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2s(m2s m2sVar, byte b) {
        super(0);
        this.a = b;
        this.b = m2sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        m2s m2sVar = this.b;
        switch (b) {
            case 0:
                return (f260) m2sVar.g.getValue();
            case 1:
                return Float.valueOf(((BehaviorRetainingAppBarLayout) m2sVar.h.b).getResources().getDimensionPixelSize(m2sVar.b ? 2131166124 : 2131166123));
            default:
                return Integer.valueOf(((BehaviorRetainingAppBarLayout) m2sVar.h.b).getContext().getColor(2131101503));
        }
    }
}
