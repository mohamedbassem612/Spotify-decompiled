package p;

import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fgt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PlayButtonView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgt0(PlayButtonView playButtonView, byte b) {
        super(0);
        this.a = b;
        this.b = playButtonView;
    }

    public final Object invoke() {
        byte b = this.a;
        tlv tlvVar = this.b;
        switch (b) {
            case 0:
                return azo1.r(tlvVar.getContext(), j4b1.P3, 2131101375, tlvVar.getContext().getResources().getDimensionPixelSize(2131165853));
            default:
                return azo1.r(tlvVar.getContext(), j4b1.a6, 2131101340, tlvVar.getContext().getResources().getDimensionPixelSize(2131165853));
        }
    }
}
