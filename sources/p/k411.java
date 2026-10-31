package p;

import androidx.compose.ui.graphics.Brush;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k411 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Brush d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k411(String str, qim0 qim0Var, String str2, Brush brush, String str3, Function0 function0, float f, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = str2;
        this.d = brush;
        this.e = str3;
        this.f = function0;
        this.g = f;
        this.h = j2iVar;
        this.i = i;
        this.t = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        d0p1.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1), this.t);
        return rih1.a;
    }
}
