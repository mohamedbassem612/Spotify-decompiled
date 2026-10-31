package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class q8a extends x8a {
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;

    public q8a(Context context) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new yeb0(0);
        this.t = true;
        this.Q0 = "No chart data available.";
        zdk1 zdk1Var = new zdk1();
        this.U0 = zdk1Var;
        this.W0 = 0.0f;
        this.X0 = 0.0f;
        this.Y0 = 0.0f;
        this.Z0 = 0.0f;
        this.a1 = false;
        this.c1 = 0.0f;
        this.d1 = new ArrayList();
        this.e1 = false;
        setWillNotDraw(false);
        this.V0 = new qne();
        Context context2 = getContext();
        DisplayMetrics displayMetrics = npi1.a;
        if (context2 == null) {
            npi1.b = ViewConfiguration.getMinimumFlingVelocity();
            npi1.c = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
            npi1.b = viewConfiguration.getScaledMinimumFlingVelocity();
            npi1.c = viewConfiguration.getScaledMaximumFlingVelocity();
            npi1.a = context2.getResources().getDisplayMetrics();
        }
        this.c1 = npi1.c(500.0f);
        aet aetVar = new aet();
        aetVar.e = "Description Label";
        aetVar.f = Paint.Align.RIGHT;
        aetVar.c = npi1.c(8.0f);
        this.N0 = aetVar;
        u2c0 u2c0Var = new u2c0();
        u2c0Var.e = new v2c0[0];
        u2c0Var.f = 1;
        u2c0Var.g = 3;
        u2c0Var.h = 1;
        u2c0Var.i = 1;
        u2c0Var.j = 4;
        u2c0Var.k = 8.0f;
        u2c0Var.l = 3.0f;
        u2c0Var.m = 6.0f;
        u2c0Var.n = 5.0f;
        u2c0Var.o = 3.0f;
        u2c0Var.f145p = 0.95f;
        u2c0Var.q = 0.0f;
        u2c0Var.r = 0.0f;
        u2c0Var.s = new ArrayList(16);
        u2c0Var.t = new ArrayList(16);
        u2c0Var.u = new ArrayList(16);
        u2c0Var.c = npi1.c(10.0f);
        u2c0Var.a = npi1.c(5.0f);
        u2c0Var.b = npi1.c(3.0f);
        this.O0 = u2c0Var;
        w2c0 w2c0Var = new w2c0(zdk1Var, (byte) 12);
        w2c0Var.f = new ArrayList(16);
        w2c0Var.g = new Paint.FontMetrics();
        w2c0Var.h = new Path();
        w2c0Var.e = u2c0Var;
        Paint paint = new Paint(1);
        w2c0Var.c = paint;
        paint.setTextSize(npi1.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        w2c0Var.d = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.R0 = w2c0Var;
        wjm1 wjm1Var = new wjm1();
        wjm1Var.x = 1;
        wjm1Var.y = 1;
        wjm1Var.b = npi1.c(4.0f);
        this.i = wjm1Var;
        this.g = new Paint(1);
        Paint paint3 = new Paint(1);
        this.h = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setTextSize(npi1.c(12.0f));
        this.u1 = new ymm1(1);
        this.v1 = new ymm1(2);
        this.y1 = new vi11(zdk1Var);
        this.z1 = new vi11(zdk1Var);
        this.w1 = new zmm1(zdk1Var, this.u1, this.y1);
        this.x1 = new zmm1(zdk1Var, this.v1, this.z1);
        this.A1 = new xjm1(zdk1Var, this.i, this.y1);
        setHighlighter(new une(this));
        y8a y8aVar = new y8a();
        y8aVar.a = 0;
        y8aVar.d = this;
        y8aVar.c = new GestureDetector(getContext(), y8aVar);
        y8aVar.e = new Matrix();
        y8aVar.f = new Matrix();
        y8aVar.g = duf0.b(0.0f, 0.0f);
        y8aVar.h = duf0.b(0.0f, 0.0f);
        y8aVar.i = 1.0f;
        y8aVar.t = 1.0f;
        y8aVar.X = 1.0f;
        y8aVar.N0 = 0L;
        y8aVar.O0 = duf0.b(0.0f, 0.0f);
        y8aVar.P0 = duf0.b(0.0f, 0.0f);
        y8aVar.e = zdk1Var.a;
        y8aVar.Q0 = npi1.c(3.0f);
        y8aVar.R0 = npi1.c(3.5f);
        this.P0 = y8aVar;
        Paint paint4 = new Paint();
        this.n1 = paint4;
        paint4.setStyle(style);
        this.n1.setColor(Color.rgb(240, 240, 240));
        Paint paint5 = new Paint();
        this.o1 = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.o1.setColor(-16777216);
        this.o1.setStrokeWidth(npi1.c(1.0f));
        this.S0 = new r8a(this, this.V0, zdk1Var);
        setHighlighter(new w8a(this));
        getXAxis().q = 0.5f;
        getXAxis().r = 0.5f;
        this.f1 = 100;
        this.g1 = false;
        this.h1 = false;
        this.i1 = true;
        this.j1 = true;
        this.k1 = true;
        this.l1 = true;
        this.m1 = true;
        this.p1 = false;
        this.q1 = false;
        this.r1 = false;
        this.s1 = 15.0f;
        this.t1 = false;
        this.B1 = new RectF();
        this.C1 = new Matrix();
        new Matrix();
        ofp0 ofp0Var = cuf0.d;
        cuf0 cuf0Var = (cuf0) ofp0Var.b();
        cuf0Var.b = 0.0d;
        cuf0Var.c = 0.0d;
        this.D1 = cuf0Var;
        cuf0 cuf0Var2 = (cuf0) ofp0Var.b();
        cuf0Var2.b = 0.0d;
        cuf0Var2.c = 0.0d;
        this.E1 = cuf0Var2;
        this.F1 = new float[2];
        this.G1 = false;
        this.H1 = true;
        this.I1 = false;
        this.J1 = false;
    }

    @Override // p.pne
    public final i960 b(float f, float f2) {
        if (this.b == null) {
            return null;
        }
        i960 i960VarA = getHighlighter().a(f, f2);
        return (i960VarA == null || !this.G1) ? i960VarA : new i960(i960VarA.a, i960VarA.b, i960VarA.c, i960VarA.d, i960VarA.e, i960VarA.f);
    }

    public t8a getBarData() {
        return (t8a) this.b;
    }

    public void setDrawBarShadow(boolean z) {
        this.I1 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.H1 = z;
    }

    public void setFitBars(boolean z) {
        this.J1 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.G1 = z;
    }
}
