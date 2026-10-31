package p;

import androidx.compose.ui.graphics.Brush;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e411 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ Brush f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ j2i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e411(String str, c380 c380Var, vu30 vu30Var, float f, qim0 qim0Var, Brush brush, String str2, Function0 function0, float f2, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = str;
        this.b = c380Var;
        this.c = vu30Var;
        this.d = f;
        this.e = qim0Var;
        this.f = brush;
        this.g = str2;
        this.h = function0;
        this.i = f2;
        this.t = j2iVar;
        this.X = i;
        this.Y = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        zzo1.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1), czo1.p(this.Y));
        return rih1.a;
    }
}
