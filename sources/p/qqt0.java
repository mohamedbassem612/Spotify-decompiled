package p;

import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qqt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PlayProgressBarView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqt0(PlayProgressBarView playProgressBarView, byte b) {
        super(0);
        this.a = b;
        this.b = playProgressBarView;
    }

    public final Object invoke() {
        byte b = this.a;
        tlv tlvVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(tlvVar.getResources().getDimensionPixelSize(2131166826));
            default:
                return Integer.valueOf(tlvVar.getResources().getDimensionPixelSize(2131166825));
        }
    }
}
