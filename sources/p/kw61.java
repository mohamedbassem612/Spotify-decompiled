package p;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kw61 implements x8s0, cba, mpa0 {
    public final String b;
    public final boolean c;
    public final cdf0 d;
    public final sw61 e;
    public boolean f;
    public final Path a = new Path();
    public final zwa g = new zwa((byte) 16);

    public kw61(cdf0 cdf0Var, hba hbaVar, cx61 cx61Var) {
        this.b = cx61Var.a;
        this.c = cx61Var.d;
        this.d = cdf0Var;
        sw61 sw61VarV1 = cx61Var.c.v1();
        this.e = sw61VarV1;
        hbaVar.d(sw61VarV1);
        sw61VarV1.a(this);
    }

    @Override // p.cba
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // p.wpl
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            wpl wplVar = (wpl) arrayList2.get(i);
            if (wplVar instanceof vvg1) {
                vvg1 vvg1Var = (vvg1) wplVar;
                if (vvg1Var.c == 1) {
                    this.g.f(vvg1Var);
                    vvg1Var.d(this);
                } else if (!(wplVar instanceof kr31)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((kr31) wplVar);
                }
            } else if (!(wplVar instanceof kr31)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((kr31) wplVar);
            }
            i++;
        }
    }

    @Override // p.lpa0
    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        itj0.f(kpa0Var, i, arrayList, kpa0Var2, this);
    }

    @Override // p.lpa0
    public final void g(Object obj, j2e0 j2e0Var) {
        if (obj == ndf0.K) {
            this.e.j(j2e0Var);
        }
    }

    @Override // p.wpl
    public final String getName() {
        return this.b;
    }

    @Override // p.x8s0
    public final Path getPath() {
        boolean z = this.f;
        sw61 sw61Var = this.e;
        Path path = this.a;
        if (z && sw61Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) sw61Var.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.g(path);
        this.f = true;
        return path;
    }
}
