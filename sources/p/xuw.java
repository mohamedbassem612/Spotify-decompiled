package p;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xuw implements x8s0, cba, mpa0 {
    public final String b;
    public final cdf0 c;
    public final aav0 d;
    public final fba e;
    public final fcg f;
    public boolean h;
    public final Path a = new Path();
    public final zwa g = new zwa((byte) 16);

    public xuw(cdf0 cdf0Var, hba hbaVar, fcg fcgVar) {
        this.b = fcgVar.a;
        this.c = cdf0Var;
        aav0 aav0VarC0 = fcgVar.c.c0();
        this.d = aav0VarC0;
        fba fbaVarC0 = fcgVar.b.c0();
        this.e = fbaVarC0;
        this.f = fcgVar;
        hbaVar.d(aav0VarC0);
        hbaVar.d(fbaVarC0);
        aav0VarC0.a(this);
        fbaVarC0.a(this);
    }

    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            vvg1 vvg1Var = (wpl) arrayList.get(i);
            if (vvg1Var instanceof vvg1) {
                vvg1 vvg1Var2 = vvg1Var;
                if (vvg1Var2.c == 1) {
                    this.g.f(vvg1Var2);
                    vvg1Var2.d(this);
                }
            }
            i++;
        }
    }

    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        itj0.f(kpa0Var, i, arrayList, kpa0Var2, this);
    }

    public final void g(Object obj, j2e0 j2e0Var) {
        if (obj == ndf0.f) {
            this.d.j(j2e0Var);
        } else if (obj == ndf0.i) {
            this.e.j(j2e0Var);
        }
    }

    public final String getName() {
        return this.b;
    }

    public final Path getPath() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        fcg fcgVar = this.f;
        if (fcgVar.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (fcgVar.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.g(path);
        this.h = true;
        return path;
    }
}
