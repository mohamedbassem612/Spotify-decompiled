package p;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fch0 extends Drawable.ConstantState {
    public iw61 a;
    public guw b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public byte n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34p;
    public byte q;
    public Paint.Style r;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        gch0 gch0Var = new gch0(this);
        gch0Var.e = true;
        return gch0Var;
    }
}
