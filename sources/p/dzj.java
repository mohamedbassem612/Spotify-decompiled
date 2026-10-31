package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dzj implements wpw {
    public final /* synthetic */ byte a;
    public final e7m0 b;
    public final eih1 c;
    public final rsw d;

    public dzj(v8g1 v8g1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = sbl.z(new q9g1(new gcg1(0, (dn81) null, 7)), gp71.p, v8g1Var.a(), w9g1.a, x9g1.a);
                this.c = new eih1();
                this.d = jch0.j(vrf1.U0);
                break;
            default:
                this.b = sbl.z(new q9g1(new gcg1(0, (dn81) null, 7)), n4.A, v8g1Var.a(), bzj.a, czj.a);
                this.c = new eih1();
                this.d = f6o1.j((ViewGroup.LayoutParams) null, dei.a, 7);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }
}
