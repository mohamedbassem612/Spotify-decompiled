package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.PlayOrigin;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kb8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb8 b;
    public final /* synthetic */ tcr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb8(lb8 lb8Var, tcr0 tcr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = lb8Var;
        this.c = tcr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        tcr0 tcr0Var = this.c;
        lb8 lb8Var = this.b;
        switch (b) {
            case 0:
                return f6o1.A(vyo.b(lb8Var.c, (wxu) tcr0Var.a(lcr0.a), (List) tcr0Var.a(mcr0.a)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            default:
                return f6o1.A(zet0.a(lb8Var.b, (k740) tcr0Var.a(ncr0.a), (btt0) tcr0Var.a(pcr0.a), (zrt0) tcr0Var.a(ocr0.a), lb8Var.d, (PlayOrigin) lb8Var.f.get()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        }
    }
}
