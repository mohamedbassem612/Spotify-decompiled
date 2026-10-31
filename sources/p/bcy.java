package p;

import androidx.car.app.model.CarColor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bcy implements ccy {
    public final lwc a;
    public final fvc b;
    public final String c;
    public final k80 d;

    public bcy(lwc lwcVar, fvc fvcVar, String str) {
        this.a = lwcVar;
        this.b = fvcVar;
        this.c = str;
        this.d = new k80(str);
    }

    @Override // p.ccy
    public final hvc b() {
        return this.b;
    }

    @Override // p.ccy
    public final CarColor c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcy)) {
            return false;
        }
        bcy bcyVar = (bcy) obj;
        return this.a.equals(bcyVar.a) && this.b.equals(bcyVar.b) && u890.j(this.c, bcyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }
}
