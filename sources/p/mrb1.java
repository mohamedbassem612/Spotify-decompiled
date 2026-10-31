package p;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mrb1 extends zda {
    public final /* synthetic */ byte e;
    public final gpr0 f;
    public final gpr0 g;
    public final Bitmap h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrb1(gpr0 gpr0Var, gpr0 gpr0Var2, Bitmap bitmap, byte b) {
        super(new f3a(2131624261, 2131427773));
        this.e = b;
        switch (b) {
            case 1:
                super(new f3a(2131626191, 2131431084));
                this.f = gpr0Var;
                this.g = gpr0Var2;
                this.h = bitmap;
                break;
            default:
                this.f = gpr0Var;
                this.g = gpr0Var2;
                this.h = bitmap;
                break;
        }
    }

    public final pj41 b() {
        byte b = this.e;
        return oj41.a;
    }

    public final void d(ConstraintLayout constraintLayout) {
        byte b = this.e;
        Bitmap bitmap = this.h;
        gpr0 gpr0Var = this.g;
        gpr0 gpr0Var2 = this.f;
        switch (b) {
            case 0:
                b8k1.n(constraintLayout, 2131427773).x(gpr0Var2);
                b8k1.n(constraintLayout, 2131427772).x(gpr0Var);
                ((ImageView) b8k1.n(constraintLayout, 2131427771)).setImageBitmap(bitmap);
                break;
            default:
                b8k1.n(constraintLayout, 2131431084).x(gpr0Var2);
                b8k1.n(constraintLayout, 2131431083).x(gpr0Var);
                ((ImageView) b8k1.n(constraintLayout, 2131431080)).setImageBitmap(bitmap);
                break;
        }
    }

    public final void e() {
        byte b = this.e;
    }

    public final void g() {
        byte b = this.e;
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }
}
