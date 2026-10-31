package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z731 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z731(ArrayList arrayList, String str, int i, byte b) {
        super(1);
        this.a = b;
        this.b = arrayList;
        this.c = str;
        this.d = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        String str = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.f((q5t0) arrayList.get(0), 0, 0, 0.0f);
                if (str != null) {
                    p5t0Var.f((q5t0) arrayList.get(1), 0, p5t0Var.i0(16.0f) + i, 0.0f);
                }
                break;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0Var2.f((q5t0) arrayList.get(0), 0, 0, 0.0f);
                if (str != null) {
                    p5t0Var2.f((q5t0) arrayList.get(1), 0, p5t0Var2.i0(16.0f) + i, 0.0f);
                }
                break;
            default:
                p5t0 p5t0Var3 = (p5t0) obj;
                p5t0Var3.f((q5t0) arrayList.get(0), 0, 0, 0.0f);
                if (str != null) {
                    p5t0Var3.f((q5t0) arrayList.get(1), 0, p5t0Var3.i0(16.0f) + i, 0.0f);
                }
                break;
        }
        return rih1Var;
    }
}
