package p;

import android.util.AttributeSet;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class kmy extends k01 implements iu30 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmy(mmy mmyVar) {
        super(1, mmyVar, mmy.class, "renderOverlay", "renderOverlay(Lcom/spotify/encoreconsumermobile/elements/entitymedia/EntityMedia$OverlayModel;)Ljava/lang/Object;", 8);
        this.h = (byte) 0;
    }

    public final Object invoke(Object obj) {
        byte b = this.h;
        rih1 rih1Var = rih1.a;
        Object obj2 = ((k01) this).a;
        switch (b) {
            case 0:
                zly zlyVar = (zly) obj;
                mmy mmyVar = (mmy) obj2;
                lqr lqrVar = mmyVar.T0;
                float f = 1.0f;
                if (zlyVar instanceof zly) {
                    bjw0 bjw0Var = zlyVar.a;
                    ArtworkView artworkViewF = lqrVar.f();
                    if (bjw0Var instanceof yiw0) {
                        f = 0.3f;
                    } else if ((bjw0Var instanceof ajw0) || bjw0Var.equals(ziw0.a)) {
                        f = 0.54f;
                    } else if (!bjw0Var.equals(ziw0.b)) {
                        eg.o();
                    }
                    artworkViewF.setAlpha(f);
                    lqrVar.h().setVisibility(0);
                    View viewH = lqrVar.h();
                    PreviewOverlayView previewOverlayView = viewH instanceof PreviewOverlayView ? (PreviewOverlayView) viewH : null;
                    if (previewOverlayView != null) {
                        previewOverlayView.y(bjw0Var);
                        return rih1Var;
                    }
                    PreviewOverlayView previewOverlayView2 = new PreviewOverlayView(mmyVar.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    previewOverlayView2.y(bjw0Var);
                    k8p1.o(lqrVar.h(), previewOverlayView2);
                    iu30 iu30Var = mmyVar.U0;
                    if (iu30Var == null) {
                        return rih1Var;
                    }
                    previewOverlayView2.n(new w3w(iu30Var, mmyVar, (byte) 21));
                    return rih1Var;
                }
                if (zlyVar == null) {
                    lqrVar.f().setAlpha(1.0f);
                    lqrVar.h().setVisibility(8);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                ((sen0) obj2).a((e4h0) obj);
                return rih1Var;
            case 2:
                ((bfn0) obj2).b((wq41) obj);
                return rih1Var;
            case 3:
                return rec1.U((rec1) obj2, (String) obj);
            case 4:
                return wec1.U((wec1) obj2, (String) obj);
            default:
                ((z4e1) obj2).N1(((r180) obj).a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmy(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }
}
