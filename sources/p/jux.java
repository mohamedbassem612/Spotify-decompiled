package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jux extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ qim0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Uri a;
    public final /* synthetic */ ksl b;
    public final /* synthetic */ p3v c;
    public final /* synthetic */ zvx d;
    public final /* synthetic */ ecx e;
    public final /* synthetic */ j6m f;
    public final /* synthetic */ tl3 g;
    public final /* synthetic */ ColorFilter h;
    public final /* synthetic */ qux i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jux(Uri uri, ksl kslVar, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, qux quxVar, boolean z, boolean z2, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = uri;
        this.b = kslVar;
        this.c = p3vVar;
        this.d = zvxVar;
        this.e = ecxVar;
        this.f = j6mVar;
        this.g = tl3Var;
        this.h = colorFilter;
        this.i = quxVar;
        this.t = z;
        this.X = z2;
        this.Y = qim0Var;
        this.Z = i;
        this.N0 = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        eso1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
