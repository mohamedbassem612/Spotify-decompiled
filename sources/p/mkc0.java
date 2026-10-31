package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mkc0 {
    public StringBuilder e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strB = atz.b(this.f);
            StringBuilder sb = this.h;
            String strB2 = sb != null ? atz.b(sb.toString()) : null;
            String string = this.e.toString();
            lkc0 lkc0Var = new lkc0();
            lkc0Var.g = string;
            lkc0Var.h = strB;
            lkc0Var.i = strB2;
            ArrayList arrayList = this.d;
            lkc0Var.e(arrayList);
            arrayList.clear();
            this.c.add(lkc0Var);
            this.e = null;
            this.i = false;
            this.f = null;
            this.h = null;
        }
    }
}
