package p;

import android.app.Activity;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l230 implements ah51 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ l230(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.ah51
    public final List a(tr3 tr3Var) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                sxc0 sxc0Var = tr3Var.b;
                Parcelable parcelable = sxc0Var.c;
                if (!(parcelable instanceof b8e0) || ((b8e0) parcelable).getCount() <= 0) {
                    return z6xVar;
                }
                bqq0 bqq0Var = sxc0Var.a;
                return Collections.singletonList(new lhy(bqq0Var.c, bqq0Var.b.a(), false, ((z0t) obj).a.h(), false));
            default:
                un90 un90Var = tr3Var.b.c;
                return (!(un90Var instanceof rn90) || ((rn90) un90Var).b <= 0) ? z6xVar : Collections.singletonList(new khy(((Activity) obj).getString(2131964137)));
        }
    }
}
