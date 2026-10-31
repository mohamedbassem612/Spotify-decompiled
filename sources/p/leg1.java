package p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class leg1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ neg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ leg1(neg1 neg1Var, byte b) {
        super(0);
        this.a = b;
        this.b = neg1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        neg1 neg1Var = this.b;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) ((w611) neg1Var).a.findViewById(2131428980);
                tka0 tka0Var = dtw.C;
                Context context = neg1Var.U0.getContext();
                frameLayout.getClass();
                dtw dtwVarD = mhc.d(context, frameLayout, f6o1.A(neg1Var.V0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
                k8p1.o(frameLayout, dtwVarD.w);
                return dtwVarD;
            default:
                tka0 tka0Var2 = dtw.C;
                Context context2 = neg1Var.U0.getContext();
                FrameLayout frameLayout2 = neg1Var.e1;
                dtw dtwVarD2 = mhc.d(context2, frameLayout2, neg1Var.W0, (drw) null, 24);
                frameLayout2.addView(dtwVarD2.w);
                return dtwVarD2;
        }
    }
}
