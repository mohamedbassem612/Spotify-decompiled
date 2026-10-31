package p;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nej1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oej1 b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nej1(oej1 oej1Var, ViewGroup viewGroup, byte b) {
        super(1);
        this.a = b;
        this.b = oej1Var;
        this.c = viewGroup;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        byte b3 = 1;
        ViewGroup viewGroup = this.c;
        oej1 oej1Var = this.b;
        switch (b) {
            case 0:
                jej1 jej1Var = (jej1) obj;
                String str = jej1Var.c;
                String str2 = jej1Var.d;
                String str3 = jej1Var.b;
                String str4 = jej1Var.h;
                String str5 = jej1Var.e;
                long j = jej1Var.f;
                long j2 = jej1Var.g;
                String str6 = jej1Var.j;
                int measuredWidth = (((List) oej1Var.c.getValue()).size() != 1 ? (byte) 0 : (byte) 1) != 0 ? viewGroup.getMeasuredWidth() - viewGroup.getResources().getDimensionPixelSize(2131167226) : (int) (((double) (viewGroup.getMeasuredWidth() - viewGroup.getResources().getDimensionPixelSize(2131167226))) * 0.8d);
                return new zej1(str, false, str2, str3, str5, null, str4, j, j2, new bfj1(measuredWidth, (measuredWidth * 9) / 16), str6, jej1Var.i, jej1Var.k, jej1Var.l, null, null, 0L, 1, jej1Var.a, jej1Var.m, 3, false);
            case 1:
                ((z2s) obj).R(jej1.class, oej1Var.f, new nej1(oej1Var, viewGroup, b2), l6j1.Y, l6j1.Z, false, zhi1.R0);
                return rih1Var;
            default:
                ((y2s) obj).b(q601.b(oej1Var.c), new nej1(oej1Var, viewGroup, b3));
                return rih1Var;
        }
    }
}
