package p;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y93 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y93(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                return hu20.e(new x72(((roc0) ((koc0) resVar.e)).d(), (byte) 4), new qt((lnm) null, resVar, (byte) 6));
            case 1:
                ((qtr) obj).b(new lu(resVar, (lnm) null, (byte) 3));
                return rih1.a;
            default:
                CreatorButtonView creatorButtonView = new CreatorButtonView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                creatorButtonView.setViewContext(new szn((af10) resVar.g));
                return creatorButtonView;
        }
    }
}
