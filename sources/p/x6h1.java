package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x6h1 {
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ArrayList i;
    public boolean j;
    public String k;
    public String l;

    public final y6h1 a() {
        ArrayList arrayList = new ArrayList();
        vi11 vi11VarP = m4c.p();
        String str = this.a;
        gxo1.o(str, "name");
        vi11VarP.E(str);
        vi11VarP.z(this.b);
        vi11VarP.W(this.d);
        vi11VarP.J(this.c);
        vi11VarP.M(this.e);
        arrayList.add(vi11VarP.l());
        ArrayList arrayList2 = this.i;
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        gxo1.o(str4, "app");
        return new y6h1(str2, str3, str4, arrayList, this.j, this.k, this.l);
    }
}
