package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y331 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z331 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y331(z331 z331Var, byte b) {
        super(1);
        this.a = b;
        this.b = z331Var;
    }

    public final Object invoke(Object obj) {
        String string;
        byte b = this.a;
        z331 z331Var = this.b;
        switch (b) {
            case 0:
                x331 x331Var = (x331) obj;
                if (x331Var instanceof v331) {
                    string = z331Var.b.getString(((v331) x331Var).a);
                } else {
                    if (!(x331Var instanceof w331)) {
                        eg.o();
                        return null;
                    }
                    string = ((w331) x331Var).a;
                }
                string.getClass();
                return new kh51(string);
            default:
                b6s b6sVarA = z331Var.a.a((l0i) null);
                View view = b6sVarA.b;
                view.setPadding(view.getPaddingLeft(), (int) (((ViewGroup) obj).getResources().getDimension(2131166139) + view.getPaddingTop()), view.getPaddingRight(), view.getPaddingBottom());
                return b6sVarA;
        }
    }
}
