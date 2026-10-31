package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zb10 implements f080 {
    public final /* synthetic */ SingleEmitter a;

    public zb10(s141 s141Var, SingleEmitter singleEmitter) {
        this.a = singleEmitter;
    }

    public void a(iua iuaVar, List list) {
        this.a.onSuccess(s141.a(iuaVar, list, 4));
    }

    public void e(int i, Bitmap bitmap) {
        this.a.onSuccess(Integer.valueOf(bitmap.getPixel(0, 0)));
    }

    public void m(Drawable drawable) {
        this.a.onSuccess(-7829368);
    }

    public zb10(SingleEmitter singleEmitter, ac10 ac10Var) {
        this.a = singleEmitter;
    }

    public void g(Drawable drawable) {
    }
}
