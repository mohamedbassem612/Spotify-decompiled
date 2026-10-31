package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lux extends hab0 implements vu30 {
    public final /* synthetic */ byte N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Uri a;
    public final /* synthetic */ ksl b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ p3v d;
    public final /* synthetic */ zvx e;
    public final /* synthetic */ ecx f;
    public final /* synthetic */ j6m g;
    public final /* synthetic */ tl3 h;
    public final /* synthetic */ ColorFilter i;
    public final /* synthetic */ qux t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lux(Uri uri, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, qux quxVar, boolean z, boolean z2, int i, int i2, int i3) {
        super(2);
        this.a = uri;
        this.b = kslVar;
        this.c = qim0Var;
        this.d = p3vVar;
        this.e = zvxVar;
        this.f = ecxVar;
        this.g = j6mVar;
        this.h = tl3Var;
        this.i = colorFilter;
        this.t = quxVar;
        this.X = z;
        this.Y = z2;
        this.Z = i;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        short s = this.O0;
        eso1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
