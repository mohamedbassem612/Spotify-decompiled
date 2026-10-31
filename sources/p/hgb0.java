package p;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hgb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ogb0 b;
    public final /* synthetic */ ggb0 c;
    public final /* synthetic */ igb0 d;
    public final /* synthetic */ t081 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgb0(ogb0 ogb0Var, ggb0 ggb0Var, igb0 igb0Var, t081 t081Var, byte b) {
        super(1);
        this.a = b;
        this.b = ogb0Var;
        this.c = ggb0Var;
        this.d = igb0Var;
        this.e = t081Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t081 t081Var = this.e;
        igb0 igb0Var = this.d;
        ggb0 ggb0Var = this.c;
        ogb0 ogb0Var = this.b;
        switch (b) {
            case 0:
                IconCompat iconCompat = (IconCompat) obj;
                String strA = ogb0Var.a();
                Context context = igb0Var.c;
                if (context == null) {
                    u890.C("context");
                    throw null;
                }
                t081 t081VarA = ggb0Var.a(context, strA, iconCompat);
                Context context2 = ((lb) ogb0Var.e.c).a;
                try {
                    w081.v(context2, Collections.singletonList(t081Var.b));
                    w081.q(context2, t081VarA);
                    break;
                } catch (IllegalArgumentException e) {
                    n57.g("Could not update dynamic shortcut", e);
                }
                return rih1Var;
            default:
                IconCompat iconCompat2 = (IconCompat) obj;
                String strA2 = ogb0Var.a();
                Context context3 = igb0Var.c;
                if (context3 == null) {
                    u890.C("context");
                    throw null;
                }
                t081 t081VarA2 = ggb0Var.a(context3, strA2, iconCompat2);
                Context context4 = ((lb) ogb0Var.e.c).a;
                try {
                    w081.v(context4, Collections.singletonList(t081Var.b));
                    w081.q(context4, t081VarA2);
                    break;
                } catch (IllegalArgumentException e2) {
                    n57.g("Could not update dynamic shortcut", e2);
                }
                return rih1Var;
        }
    }
}
