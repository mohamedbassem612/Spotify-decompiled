package p;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ebm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebm1(rwj rwjVar, byte b) {
        super(1);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case 0:
                kby kbyVar = ((abm1) obj).a;
                x4i1 x4i1Var = kbyVar.u;
                if (Boolean.parseBoolean((String) kbyVar.q.get("wrapped.isEligible"))) {
                    String str = (String) rwjVar.f;
                    if (str.length() > 0 && x4i1Var != null && !u890.j(x4i1Var.b, str)) {
                        return new lt20(new xkb1(new ph11(yoi1.g(((v5n) rwjVar.e).b(str)), (byte) 26), (byte) 23), new v2m1(3, null, (byte) 1), (byte) 0);
                    }
                }
                return new huz(new zam1(null), (byte) 10);
            case 1:
                ((qtr) obj).b(new efj1(rwjVar, null, (byte) 7));
                return rih1.a;
            default:
                CreatorButtonView creatorButtonView = new CreatorButtonView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                creatorButtonView.setViewContext(new szn((af10) rwjVar.g));
                return creatorButtonView;
        }
    }
}
