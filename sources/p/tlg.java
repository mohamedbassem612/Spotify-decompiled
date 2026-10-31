package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tlg {
    public String A;
    public Bitmap B;
    public Bitmap C;
    public final Context a;
    public final mlg b;
    public final List c;
    public final n5f0 d;
    public final int i;
    public final int j;
    public final float e = 3.2820513f;
    public final float f = 1174.9744f;
    public final float g = 662.97437f;
    public final float h = 52.51282f;
    public final idd1 k = new idd1(new slg(this, (byte) 0));
    public final idd1 l = new idd1(new slg(this, (byte) 7));
    public final idd1 m = new idd1(new slg(this, (byte) 13));
    public final idd1 n = new idd1(new slg(this, (byte) 10));
    public final idd1 o = new idd1(new slg(this, (byte) 1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f42p = new idd1(new slg(this, (byte) 5));
    public final idd1 q = new idd1(new slg(this, (byte) 4));
    public final idd1 r = new idd1(new slg(this, (byte) 11));
    public final idd1 s = new idd1(new slg(this, (byte) 6));
    public final idd1 t = new idd1(nyf.i);
    public final idd1 u = new idd1(new slg(this, (byte) 12));
    public final idd1 v = new idd1(new slg(this, (byte) 9));
    public final idd1 w = new idd1(new slg(this, (byte) 3));
    public final idd1 x = new idd1(new slg(this, (byte) 14));
    public final idd1 y = new idd1(new slg(this, (byte) 2));
    public final idd1 z = new idd1(new slg(this, (byte) 8));
    public boolean D = true;

    public tlg(Context context, mlg mlgVar, List list, n5f0 n5f0Var) {
        this.a = context;
        this.b = mlgVar;
        this.c = list;
        this.d = n5f0Var;
        this.i = context.getColor(2131101184);
        this.j = context.getColor(2131101246);
    }

    public final void a(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        Drawable drawableMutate;
        Drawable drawable = this.a.getDrawable(i);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return;
        }
        drawableMutate.setTint(-1);
        drawableMutate.setBounds((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        drawableMutate.draw(canvas);
    }

    public final float b() {
        return ((Number) this.x.getValue()).floatValue();
    }
}
