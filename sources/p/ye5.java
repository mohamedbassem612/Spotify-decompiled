package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ye5 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public ye5(int i) {
        this.a = new StringBuilder(i);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(kjc0 kjc0Var, int i, int i2) {
        this.c.add(new xe5(i, i2, 8, kjc0Var, null));
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public final void b(ljc0 ljc0Var, int i, int i2) {
        this.c.add(new xe5(i, i2, 8, ljc0Var, null));
    }

    public final void c(int i, String str, int i2, String str2) {
        this.c.add(new xe5(i, i2, new qgc1(str2), str));
    }

    public final void d(zma1 zma1Var, int i, int i2) {
        this.c.add(new xe5(i, i2, 8, zma1Var, null));
    }

    public final void e(int i, int i2, CharSequence charSequence) {
        boolean z = charSequence instanceof af5;
        StringBuilder sb = this.a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return;
        }
        af5 af5Var = (af5) charSequence;
        int length = sb.length();
        sb.append((CharSequence) af5Var.b, i, i2);
        List listA = bf5.a(af5Var, i, i2, (z9) null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                ze5 ze5Var = (ze5) listA.get(i3);
                this.c.add(new xe5(ze5Var.b + length, ze5Var.c + length, ze5Var.a, ze5Var.d));
            }
        }
    }

    public final void f(CharSequence charSequence) {
        if (charSequence instanceof af5) {
            h((af5) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    public final void g(String str) {
        this.a.append(str);
    }

    public final void h(af5 af5Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(af5Var.b);
        List list = af5Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ze5 ze5Var = (ze5) list.get(i);
                this.c.add(new xe5(ze5Var.b + length, ze5Var.c + length, ze5Var.a, ze5Var.d));
            }
        }
    }

    public final void i(iu30 iu30Var) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ze5 ze5Var = (ze5) iu30Var.invoke(((xe5) arrayList.get(i)).a(os00.INVALID_ID));
            arrayList.set(i, new xe5(ze5Var.b, ze5Var.c, ze5Var.a, ze5Var.d));
        }
    }

    public final void j() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            rf80.c("Nothing to pop.");
        }
        ((xe5) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void k(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            rf80.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            j();
        }
    }

    public final int l(mjc0 mjc0Var) {
        xe5 xe5Var = new xe5(this.a.length(), 0, 12, mjc0Var, null);
        ArrayList arrayList = this.b;
        arrayList.add(xe5Var);
        this.c.add(xe5Var);
        return arrayList.size() - 1;
    }

    public final void m(String str, String str2) {
        xe5 xe5Var = new xe5(this.a.length(), 0, 4, new qgc1(str2), str);
        ArrayList arrayList = this.b;
        arrayList.add(xe5Var);
        this.c.add(xe5Var);
        arrayList.size();
    }

    public final int n(cpr0 cpr0Var) {
        xe5 xe5Var = new xe5(this.a.length(), 0, 12, cpr0Var, null);
        ArrayList arrayList = this.b;
        arrayList.add(xe5Var);
        this.c.add(xe5Var);
        return arrayList.size() - 1;
    }

    public final int o(zma1 zma1Var) {
        xe5 xe5Var = new xe5(this.a.length(), 0, 12, zma1Var, null);
        ArrayList arrayList = this.b;
        arrayList.add(xe5Var);
        this.c.add(xe5Var);
        return arrayList.size() - 1;
    }

    public final af5 p() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayList.get(iG), arrayList2, iG, 1)) {
        }
        return new af5(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        e(i, i2, charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        f(charSequence);
        return this;
    }

    public /* synthetic */ ye5() {
        this(16);
    }

    public ye5(String str) {
        this();
        g(str);
    }

    public ye5(af5 af5Var) {
        this();
        h(af5Var);
    }
}
