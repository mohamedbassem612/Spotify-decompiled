package p;

import androidx.car.app.model.CarColor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class acy implements ccy {
    public final lwc a;
    public final fvc b;
    public final String c;
    public final j80 d;

    public acy(lwc lwcVar, fvc fvcVar, String str) {
        this.a = lwcVar;
        this.b = fvcVar;
        this.c = str;
        this.d = new j80(null, str, null);
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
        if (!(obj instanceof acy)) {
            return false;
        }
        acy acyVar = (acy) obj;
        return this.a.equals(acyVar.a) && this.b.equals(acyVar.b) && u890.j(this.c, acyVar.c);
    }

    public final int hashCode() {
        return cy30.d((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 961, 31, this.c);
    }
}
