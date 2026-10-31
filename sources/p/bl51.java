package p;

import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bl51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SeeMoreTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl51(SeeMoreTextView seeMoreTextView, byte b) {
        super(0);
        this.a = b;
        this.b = seeMoreTextView;
    }

    public final Object invoke() {
        byte b = this.a;
        SeeMoreTextView seeMoreTextView = this.b;
        switch (b) {
            case 0:
                return new sjc0(seeMoreTextView, vk51.b);
            default:
                return new sjc0(seeMoreTextView, vk51.a);
        }
    }
}
