package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ku70 implements tyq {
    public final /* synthetic */ byte a = 1;
    public final d0r b;
    public final String c;
    public final f4r d;
    public final mqw e;
    public final rqw f;
    public final jsw g;

    public ku70(syq syqVar, fqg0 fqg0Var) {
        this.b = syqVar.e();
        this.d = syqVar.getData();
        this.e = fqg0Var.e;
        this.f = fqg0Var.f;
        this.g = fqg0Var.g;
        this.c = fqg0Var.a.b();
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f;
    }

    public final String b() {
        byte b = this.a;
        return this.c;
    }

    public final jsw c() {
        byte b = this.a;
        jsw jswVar = this.g;
        switch (b) {
            case 0:
                return (rzj) jswVar;
            case 1:
                return (rzj) jswVar;
            default:
                return jswVar;
        }
    }

    public final d0r e() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public ku70(ku70 ku70Var) {
        b9b0 b9b0Var = b9b0.a;
        c9b0 c9b0Var = c9b0.a;
        this.b = ku70Var.b;
        this.d = ku70Var.d;
        this.e = ku70Var.e;
        this.f = ku70Var.f;
        this.c = ku70Var.c;
        this.g = new rzj(ku70Var);
    }

    public ku70(lu70 lu70Var) {
        this.b = lu70Var.a;
        this.d = lu70Var.h;
        this.e = lu70Var.i;
        this.f = lu70Var.t;
        this.g = new rzj(lu70Var, (byte) 4);
        this.c = lu70Var.b();
    }
}
