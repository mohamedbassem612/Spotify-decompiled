package p;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ur61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr61 b;
    public final /* synthetic */ mr61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur61(vr61 vr61Var, mr61 mr61Var, byte b) {
        super(1);
        this.a = b;
        this.b = vr61Var;
        this.c = mr61Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mr61 mr61Var = this.c;
        vr61 vr61Var = this.b;
        switch (b) {
            case 0:
                bim0 bim0Var = (bim0) obj;
                jr61 jr61Var = vr61Var.b;
                jr61Var.getClass();
                List listM = p7h.M(new Object[]{new r9b0(2131952673, 14), new dgc0(mr61Var.a), new xlu(), new z360(jr61Var.a.getString(2131952676))});
                if (!listM.isEmpty()) {
                    bim0Var.a.add(listM);
                }
                break;
            default:
                bim0 bim0Var2 = (bim0) obj;
                Context context = vr61Var.b.a;
                List listM2 = mr61Var.d.b == 0 ? p7h.M(new Object[]{new r9b0(2131952674, 10), new u8c(context.getString(2131952672))}) : Collections.singletonList(new fxg1(context.getString(2131952677), mr61Var.b));
                if (!listM2.isEmpty()) {
                    bim0Var2.a.add(listM2);
                }
                break;
        }
        return rih1Var;
    }
}
