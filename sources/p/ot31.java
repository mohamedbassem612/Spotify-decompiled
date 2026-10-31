package p;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ot31 {
    public static final ot31 g = new ot31(new nt31());
    public static final ot31 h;
    public static final ot31 i;
    public static final ot31 j;
    public static final ot31 k;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final yo31 f;

    static {
        nt31 nt31Var = new nt31();
        nt31Var.d = 0;
        nt31Var.e = false;
        nt31Var.c = 1;
        nt31Var.a = true;
        nt31Var.b = false;
        h = new ot31(nt31Var);
        nt31 nt31Var2 = new nt31();
        nt31Var2.d = 2;
        nt31Var2.e = true;
        nt31Var2.c = 2;
        nt31Var2.b = true;
        nt31Var2.a = false;
        i = new ot31(nt31Var2);
        nt31 nt31Var3 = new nt31();
        nt31Var3.d = 0;
        nt31Var3.e = true;
        nt31Var3.c = 2;
        nt31Var3.b = true;
        nt31Var3.a = true;
        ot31 ot31Var = new ot31(nt31Var3);
        j = ot31Var;
        nt31 nt31Var4 = new nt31();
        nt31Var4.a = ot31Var.e;
        nt31Var4.c = ot31Var.a;
        nt31Var4.d = ot31Var.b;
        nt31Var4.e = ot31Var.c;
        nt31Var4.f = ot31Var.f;
        nt31Var4.b = true;
        k = new ot31(nt31Var4);
    }

    public ot31(nt31 nt31Var) {
        this.e = nt31Var.a;
        this.a = nt31Var.c;
        this.b = nt31Var.d;
        this.d = nt31Var.b;
        this.c = nt31Var.e;
        this.f = nt31Var.f;
    }

    public final void a(Row row) {
        if (!this.e && row.getOnClickDelegate() != null) {
            hhg1.n("A click listener is not allowed on the row");
            return;
        }
        if (!this.d && row.getToggle() != null) {
            hhg1.n("A toggle is not allowed on the row");
            return;
        }
        CarIcon image = row.getImage();
        if (image != null) {
            if (!this.c) {
                hhg1.n("An image is not allowed on the row");
                return;
            }
            this.f.j(image);
        }
        int size = row.getTexts().size();
        int i2 = this.a;
        if (size <= i2) {
            return;
        }
        hhg1.n(f4i1.c(i2, "The number of lines of texts for the row exceeded the supported max of "));
    }
}
