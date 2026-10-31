package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class zct implements xct {
    public final xpl1 d;
    public int f;
    public int g;
    public xpl1 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public d5u i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public zct(xpl1 xpl1Var) {
        this.d = xpl1Var;
    }

    @Override // p.xct
    public final void a(xct xctVar) {
        ArrayList<zct> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((zct) it.next()).j) {
                return;
            }
        }
        this.c = true;
        xpl1 xpl1Var = this.a;
        if (xpl1Var != null) {
            xpl1Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        zct zctVar = null;
        int i = 0;
        for (zct zctVar2 : arrayList) {
            if (!(zctVar2 instanceof d5u)) {
                i++;
                zctVar = zctVar2;
            }
        }
        if (zctVar != null && i == 1 && zctVar.j) {
            d5u d5uVar = this.i;
            if (d5uVar != null) {
                if (!d5uVar.j) {
                    return;
                } else {
                    this.f = this.h * d5uVar.g;
                }
            }
            d(zctVar.g + this.f);
        }
        xpl1 xpl1Var2 = this.a;
        if (xpl1Var2 != null) {
            xpl1Var2.a(this);
        }
    }

    public final void b(xpl1 xpl1Var) {
        this.k.add(xpl1Var);
        if (this.j) {
            xpl1Var.a(xpl1Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (xct xctVar : this.k) {
            xctVar.a(xctVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.k0);
        sb.append(":");
        sb.append(eqq.A(this.e));
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
