package p;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qy9 extends zda {
    public final /* synthetic */ byte e;
    public final Bitmap f;
    public final pj41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy9(Bitmap bitmap, byte b) {
        super(new f3a(2131624079, 2131427677));
        this.e = b;
        mj41 mj41Var = mj41.a;
        switch (b) {
            case 1:
                super(new f3a(2131624079, 2131427677));
                this.f = bitmap;
                this.g = mj41Var;
                break;
            default:
                this.f = bitmap;
                this.g = mj41Var;
                break;
        }
    }

    public final pj41 b() {
        byte b = this.e;
        return this.g;
    }

    public final void d(ConstraintLayout constraintLayout) {
        byte b = this.e;
        Bitmap bitmap = this.f;
        switch (b) {
            case 0:
                ((ImageView) b8k1.n(constraintLayout, 2131427677)).setImageBitmap(bitmap);
                break;
            default:
                ((ImageView) b8k1.n(constraintLayout, 2131427677)).setImageBitmap(bitmap);
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
