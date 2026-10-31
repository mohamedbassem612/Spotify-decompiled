package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k4j extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4j(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke((gmm1) obj);
                return rih1Var;
            case 1:
                iu30Var.invoke(new r70((gax) obj));
                return rih1Var;
            case 2:
                nwr0 nwr0Var = new nwr0();
                nwr0Var.a = (String) obj;
                iu30Var.invoke(nwr0Var);
                return rih1Var;
            case 3:
                ((Boolean) obj).getClass();
                iu30Var.invoke(jxr0.a);
                return rih1Var;
            case 4:
                iu30Var.invoke(new p2t0((a3t0) obj));
                return rih1Var;
            case 5:
                iu30Var.invoke((m7t0) obj);
                return rih1Var;
            case 6:
                iu30Var.invoke(new zzu0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 7:
                iu30Var.invoke(qiv0.a);
                return rih1Var;
            case 8:
                iu30Var.invoke(new s7x0((q7x0) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new ktz0(((Number) obj).intValue()));
                return rih1Var;
            case 10:
                iu30Var.invoke(new cc01((String) obj));
                return rih1Var;
            case 11:
                iu30Var.invoke(new be01(((Number) obj).intValue()));
                return rih1Var;
            case 12:
                iu30Var.invoke(new de01(((Number) obj).intValue()));
                return rih1Var;
            case 13:
                iu30Var.invoke(new me01((hc01) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new je01((fd01) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(new ke01(((Number) obj).intValue()));
                return rih1Var;
            case 16:
                iu30Var.invoke(new q451((String) obj));
                return rih1Var;
            case 17:
                iu30Var.invoke(new en61(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 18:
                iu30Var.invoke(new nz71((String) obj));
                return rih1Var;
            case 19:
                iu30Var.invoke(new x491(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 20:
                iu30Var.invoke(new ph91((String) obj));
                return rih1Var;
            case 21:
                iu30Var.invoke(new awa1(((Number) obj).intValue()));
                return rih1Var;
            case 22:
                iu30Var.invoke(new g1c1((k1c1) obj));
                return rih1Var;
            case 23:
                iu30Var.invoke(new f1c1((gax) obj));
                return rih1Var;
            case 24:
                iu30Var.invoke(new vqh1((gax) obj));
                return rih1Var;
            case 25:
                iu30Var.invoke(rih1Var);
                return rih1Var;
            case 26:
                DownloadButtonView downloadButtonView = new DownloadButtonView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                int dimensionPixelSize = downloadButtonView.getResources().getDimensionPixelSize(2131166109);
                int dimensionPixelSize2 = downloadButtonView.getResources().getDimensionPixelSize(2131166108);
                downloadButtonView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                downloadButtonView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                downloadButtonView.n(new k4j(iu30Var, (byte) 25));
                return downloadButtonView;
            case 27:
                iu30Var.invoke(new kij1(((Boolean) obj).booleanValue()));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                iu30Var.invoke(new dwj1((zvj1) obj));
                return rih1Var;
            default:
                iu30Var.invoke(new ipm1(((Number) obj).intValue()));
                return rih1Var;
        }
    }
}
