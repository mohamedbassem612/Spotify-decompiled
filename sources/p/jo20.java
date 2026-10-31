package p;

import android.os.Build;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jo20 implements dpb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kly0 b;

    public /* synthetic */ jo20(kly0 kly0Var, byte b) {
        this.a = b;
        this.b = kly0Var;
    }

    public final Object b() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((p3l) kly0Var.get()).a());
            case 1:
                return Boolean.valueOf(((p3l) kly0Var.get()).b());
            case 2:
                return Boolean.valueOf(((p3l) kly0Var.get()).S());
            case 3:
                return Boolean.valueOf(((p3l) kly0Var.get()).g());
            case 4:
                return Boolean.valueOf(((p3l) kly0Var.get()).k());
            case 5:
                return Boolean.valueOf(((p3l) kly0Var.get()).l());
            case 6:
                return Boolean.valueOf(((p3l) kly0Var.get()).n());
            case 7:
                return Boolean.valueOf(((p3l) kly0Var.get()).o());
            case 8:
                return Boolean.valueOf(((p3l) kly0Var.get()).p());
            case 9:
                return Boolean.valueOf(((p3l) kly0Var.get()).q());
            case 10:
                return Boolean.valueOf(((p3l) kly0Var.get()).r());
            case 11:
                return Boolean.valueOf(((p3l) kly0Var.get()).s());
            case 12:
                return Boolean.valueOf(((p3l) kly0Var.get()).y());
            case 13:
                return Boolean.valueOf(((p3l) kly0Var.get()).U());
            case 14:
                return Boolean.valueOf(((p3l) kly0Var.get()).z());
            case 15:
                return Boolean.valueOf(((p3l) kly0Var.get()).G());
            case 16:
                return Boolean.valueOf(((p3l) kly0Var.get()).J());
            case 17:
                return Boolean.valueOf(((p3l) kly0Var.get()).L());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(((p3l) kly0Var.get()).M());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(((p3l) kly0Var.get()).N());
            case 20:
                return Boolean.valueOf(((p3l) kly0Var.get()).P());
            case 21:
                return Boolean.valueOf(((p3l) kly0Var.get()).T());
            case 22:
                return Boolean.valueOf(((p3l) kly0Var.get()).u());
            case 23:
                return Boolean.valueOf(((p3l) kly0Var.get()).c() && Build.VERSION.SDK_INT >= 34);
            case 24:
                return Boolean.valueOf(((p3l) kly0Var.get()).A());
            default:
                return Boolean.valueOf(((dai0) kly0Var.get()).a());
        }
    }
}
