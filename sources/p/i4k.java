package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i4k extends hba {
    public fba C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public float H;
    public boolean I;

    public i4k(cdf0 cdf0Var, qkb0 qkb0Var, List list, fcf0 fcf0Var) {
        hba hbaVar;
        v9e1 i4kVar;
        String str;
        super(cdf0Var, qkb0Var);
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.I = true;
        q95 q95Var = qkb0Var.s;
        if (q95Var != null) {
            fba fbaVarC0 = q95Var.c0();
            this.C = fbaVarC0;
            d(fbaVarC0);
            this.C.a(this);
        } else {
            this.C = null;
        }
        q5f0 q5f0Var = new q5f0(fcf0Var.j.size());
        int size = list.size() - 1;
        v9e1 v9e1Var = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < q5f0Var.i(); i++) {
                    hba hbaVar2 = (hba) q5f0Var.b(q5f0Var.e(i));
                    if (hbaVar2 != null && (hbaVar = (hba) q5f0Var.b(hbaVar2.f48p.f)) != null) {
                        hbaVar2.t = hbaVar;
                    }
                }
                return;
            }
            qkb0 qkb0Var2 = (qkb0) list.get(size);
            int iC = l1d.C(qkb0Var2.e);
            if (iC == 0) {
                i4kVar = new i4k(cdf0Var, qkb0Var2, (List) fcf0Var.c.get(qkb0Var2.g), fcf0Var);
            } else if (iC == 1) {
                i4kVar = new o6a1(cdf0Var, qkb0Var2);
            } else if (iC == 2) {
                i4kVar = new vt70(cdf0Var, qkb0Var2);
            } else if (iC == 3) {
                i4kVar = new cep0(cdf0Var, qkb0Var2);
            } else if (iC == 4) {
                i4kVar = new tw61(cdf0Var, qkb0Var2, this, fcf0Var);
            } else if (iC != 5) {
                switch (qkb0Var2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                nue0.c("Unknown layer type ".concat(str));
                i4kVar = null;
            } else {
                i4kVar = new v9e1(cdf0Var, qkb0Var2);
            }
            if (i4kVar != null) {
                q5f0Var.g(i4kVar.f48p.d, i4kVar);
                if (v9e1Var != null) {
                    v9e1Var.s = i4kVar;
                    v9e1Var = null;
                } else {
                    this.D.add(0, i4kVar);
                    int iC2 = l1d.C(qkb0Var2.u);
                    if (iC2 == 1 || iC2 == 2) {
                        v9e1Var = i4kVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // p.hba, p.p8v
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((hba) arrayList.get(size)).c(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // p.hba, p.lpa0
    public final void g(Object obj, j2e0 j2e0Var) {
        super.g(obj, j2e0Var);
        if (obj == ndf0.z) {
            if (j2e0Var == null) {
                fba fbaVar = this.C;
                if (fbaVar != null) {
                    fbaVar.j(null);
                    return;
                }
                return;
            }
            isi1 isi1Var = new isi1(null, j2e0Var);
            this.C = isi1Var;
            isi1Var.a(this);
            d(this.C);
        }
    }

    @Override // p.hba
    public final void j(Canvas canvas, Matrix matrix, int i) {
        qkb0 qkb0Var = this.f48p;
        float f = qkb0Var.o;
        float f2 = qkb0Var.f101p;
        RectF rectF = this.F;
        rectF.set(0.0f, 0.0f, f, f2);
        matrix.mapRect(rectF);
        boolean z = this.o.S0;
        ArrayList arrayList = this.D;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.G;
            paint.setAlpha(i);
            p5r p5rVar = qpi1.a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.I || !"__container".equals(qkb0Var.c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((hba) arrayList.get(size)).f(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    @Override // p.hba
    public final void p(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((hba) arrayList2.get(i2)).e(kpa0Var, i, arrayList, kpa0Var2);
            i2++;
        }
    }

    @Override // p.hba
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((hba) it.next()).q(z);
        }
    }

    @Override // p.hba
    public final void r(float f) {
        this.H = f;
        super.r(f);
        fba fbaVar = this.C;
        qkb0 qkb0Var = this.f48p;
        if (fbaVar != null) {
            fcf0 fcf0Var = this.o.a;
            f = ((((Float) fbaVar.e()).floatValue() * qkb0Var.b.n) - qkb0Var.b.l) / ((fcf0Var.m - fcf0Var.l) + 0.01f);
        }
        if (this.C == null) {
            float f2 = qkb0Var.n;
            fcf0 fcf0Var2 = qkb0Var.b;
            f -= f2 / (fcf0Var2.m - fcf0Var2.l);
        }
        if (qkb0Var.m != 0.0f && !"__container".equals(qkb0Var.c)) {
            f /= qkb0Var.m;
        }
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((hba) arrayList.get(size)).r(f);
        }
    }
}
