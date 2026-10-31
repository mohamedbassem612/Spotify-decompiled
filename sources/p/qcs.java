package p;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qcs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinearLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qcs(LinearLayout linearLayout, byte b) {
        super(1);
        this.a = b;
        this.b = linearLayout;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        LinearLayout linearLayout = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                linearLayout.getClass();
                linearLayout.setVisibility(zBooleanValue ? 8 : 0);
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                linearLayout.getClass();
                linearLayout.setVisibility(zBooleanValue2 ? 8 : 0);
                break;
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                linearLayout.getClass();
                linearLayout.setVisibility(zBooleanValue3 ? 8 : 0);
                break;
        }
        return rih1Var;
    }
}
