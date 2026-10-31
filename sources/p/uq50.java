package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uq50 extends xpl1 {
    @Override // p.xct
    public final void a(xct xctVar) {
        zct zctVar = this.h;
        if (zctVar.c && !zctVar.j) {
            zctVar.d((int) ((((zct) zctVar.l.get(0)).g * ((tq50) this.b).u0) + 0.5f));
        }
    }

    @Override // p.xpl1
    public final void d() {
        cjl cjlVar = this.b;
        tq50 tq50Var = (tq50) cjlVar;
        int i = tq50Var.v0;
        int i2 = tq50Var.w0;
        int i3 = tq50Var.y0;
        zct zctVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                zctVar.l.add(cjlVar.V.d.h);
                this.b.V.d.h.k.add(zctVar);
                zctVar.f = i;
            } else if (i2 != -1) {
                zctVar.l.add(cjlVar.V.d.i);
                this.b.V.d.i.k.add(zctVar);
                zctVar.f = -i2;
            } else {
                zctVar.b = true;
                zctVar.l.add(cjlVar.V.d.i);
                this.b.V.d.i.k.add(zctVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            zctVar.l.add(cjlVar.V.e.h);
            this.b.V.e.h.k.add(zctVar);
            zctVar.f = i;
        } else if (i2 != -1) {
            zctVar.l.add(cjlVar.V.e.i);
            this.b.V.e.i.k.add(zctVar);
            zctVar.f = -i2;
        } else {
            zctVar.b = true;
            zctVar.l.add(cjlVar.V.e.i);
            this.b.V.e.i.k.add(zctVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void m(zct zctVar) {
        zct zctVar2 = this.h;
        zctVar2.k.add(zctVar);
        zctVar.l.add(zctVar2);
    }
}
