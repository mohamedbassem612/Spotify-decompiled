package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j0a implements xpw {
    public final /* synthetic */ byte a;
    public final Context b;
    public final kvs0 c;
    public final js20 d;
    public final ia00 e;
    public final f70 f;

    public j0a(Context context, yo31 yo31Var, los losVar, kvs0 kvs0Var, a0i1 a0i1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = context;
                this.c = kvs0Var;
                this.d = bzn1.p(this, new mn41(this, (byte) 16), yo31Var, a0i1Var, losVar, new lok0(this, (lnm) null, (byte) 28));
                this.e = n3o1.q(this).a(v451.b1, v451.c1);
                this.f = new f70((byte) 14);
                break;
            default:
                this.b = context;
                this.c = kvs0Var;
                this.d = bzn1.p(this, new uv8(this, (byte) 22), yo31Var, a0i1Var, losVar, new l2(this, (lnm) null, (byte) 17));
                this.e = n3o1.q(this).a(pn9.Z, pn9.N0);
                this.f = new f70((byte) 14);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }
}
