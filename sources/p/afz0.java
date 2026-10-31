package p;

import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class afz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ QuickActionView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afz0(QuickActionView quickActionView, byte b) {
        super(1);
        this.a = b;
        this.b = quickActionView;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        QuickActionView quickActionView = this.b;
        switch (b) {
            case 0:
                quickActionView.a.invoke(wez0.a);
                break;
            case 1:
                ((Boolean) obj).getClass();
                quickActionView.a.invoke(wez0.c);
                break;
            default:
                ((Boolean) obj).getClass();
                quickActionView.a.invoke(wez0.b);
                break;
        }
        return rih1Var;
    }
}
