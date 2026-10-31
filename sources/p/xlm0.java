package p;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xlm0 extends onm {
    public final /* synthetic */ amm0 N0;
    public int O0;
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public List a;
    public p811 b;
    public p811 c;
    public Bitmap d;
    public Canvas e;
    public l811 f;
    public n811 g;
    public Rect[] h;
    public String i;
    public BitmapFactory.Options t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlm0(amm0 amm0Var, onm onmVar) {
        super(onmVar);
        this.N0 = amm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.O0 |= Integer.MIN_VALUE;
        return this.N0.b((List) null, 0, this);
    }
}
