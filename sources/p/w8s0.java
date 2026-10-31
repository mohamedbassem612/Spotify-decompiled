package p;

import android.graphics.Path;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w8s0 extends ari1 {
    public Brush b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public Brush g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f131p;
    public phc1 q;
    public final tw4 r;
    public tw4 s;
    public tw4 t;
    public final znb0 u;

    public w8s0() {
        int i = bui1.a;
        this.d = z6x.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        tw4 tw4VarA = ww4.a();
        this.r = tw4VarA;
        this.s = tw4VarA;
        this.u = dm5.S(3, new el70((byte) 20));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.ari1
    public final void a(DrawScope drawScope) throws NoWhenBranchMatchedException {
        DrawStyle drawStyle;
        if (this.n) {
            anm1.O(this.d, this.r);
            e();
        } else if (this.f131p) {
            e();
        }
        this.n = false;
        this.f131p = false;
        Brush brush = this.b;
        if (brush != null) {
            DrawScope.j1(drawScope, this.s, brush, this.c, null, 56);
        }
        Brush brush2 = this.g;
        if (brush2 != null) {
            DrawStyle drawStyle2 = this.q;
            if (this.o || drawStyle2 == null) {
                DrawStyle phc1Var = new phc1(this.f, this.j, this.h, this.i, (uw4) null, 16);
                this.q = phc1Var;
                this.o = false;
                drawStyle = phc1Var;
            } else {
                drawStyle = drawStyle2;
            }
            DrawScope.j1(drawScope, this.s, brush2, this.e, drawStyle, 48);
        }
    }

    public final void e() {
        float f = this.k;
        tw4 tw4Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = tw4Var;
            return;
        }
        tw4 tw4Var2 = this.s;
        if (tw4Var2 != tw4Var) {
            int i = tw4Var2.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.o();
            this.s.p(i);
        } else {
            this.s = ww4.a();
        }
        znb0 znb0Var = this.u;
        ((vw4) znb0Var.getValue()).c(tw4Var, false);
        float fA = ((vw4) znb0Var.getValue()).a();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * fA;
        float f5 = ((this.l + f3) % 1.0f) * fA;
        if (f4 <= f5) {
            ((vw4) znb0Var.getValue()).b(f4, f5, this.s);
            return;
        }
        tw4 tw4VarA = this.t;
        if (tw4VarA == null) {
            tw4VarA = ww4.a();
            this.t = tw4VarA;
        }
        tw4VarA.n();
        ((vw4) znb0Var.getValue()).b(f4, fA, tw4VarA);
        this.s.d(tw4VarA, 0L);
        tw4VarA.n();
        ((vw4) znb0Var.getValue()).b(0.0f, f5, tw4VarA);
        this.s.d(tw4VarA, 0L);
    }

    public final String toString() {
        return this.r.toString();
    }
}
