package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l1w extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a2w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1w(a2w a2wVar, byte b) {
        super(0);
        this.a = b;
        this.b = a2wVar;
    }

    public final Object invoke() {
        byte b = this.a;
        a2w a2wVar = this.b;
        switch (b) {
            case 0:
                View view = a2wVar.i;
                return new e1w(view.getContext().getString(2131955329), "", view.getContext().getString(2131955328), j4b1.R7, view.getContext().getString(2131955317));
            case 1:
                View view2 = a2wVar.i;
                return new e1w(view2.getContext().getString(2131955345), (String) null, view2.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? j4b1.M1 : j4b1.O1, view2.getContext().getString(2131955344), 4);
            case 2:
                View view3 = a2wVar.i;
                return new e1w(view3.getContext().getString(2131955308), "", view3.getContext().getString(2131955307), view3.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? j4b1.M1 : j4b1.O1, view3.getContext().getString(2131955306));
            case 3:
                View view4 = a2wVar.i;
                return new e1w(view4.getContext().getString(2131955329), "", view4.getContext().getString(2131955328), j4b1.P3, view4.getContext().getString(2131955311));
            case 4:
                View view5 = a2wVar.i;
                return new e1w(view5.getContext().getString(2131955336), view5.getContext().getString(2131955335), (j4b1) null, (String) null, 24);
            default:
                View view6 = a2wVar.i;
                return new e1w(view6.getContext().getString(2131955327), "", view6.getContext().getString(2131955326), j4b1.R7, view6.getContext().getString(2131955317));
        }
    }
}
