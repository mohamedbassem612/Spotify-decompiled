package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uqg implements py50 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final hab0 c;

    public uqg(Context context, byte b) {
        this.a = b;
        byte b2 = 16;
        switch (b) {
            case 1:
                this.b = context;
                this.c = new pdb0(this, b2);
                break;
            case 2:
                this.b = context;
                this.c = new l6d0(this, (byte) 2);
                break;
            case 3:
                this.b = context;
                this.c = new l6d0(this, (byte) 22);
                break;
            case 4:
                this.b = context;
                this.c = new cnp0(this, (byte) 4);
                break;
            case 5:
            default:
                this.b = context;
                this.c = new syf(this, (byte) 16);
                break;
            case 6:
                this.b = context;
                this.c = new l5b1(this, (byte) 25);
                break;
        }
    }

    @Override // p.py50
    public final iu30 k() {
        byte b = this.a;
        cnp0 cnp0Var = this.c;
        switch (b) {
            case 0:
                return (syf) cnp0Var;
            case 1:
                return (pdb0) cnp0Var;
            case 2:
                return (l6d0) cnp0Var;
            case 3:
                return (l6d0) cnp0Var;
            case 4:
                return cnp0Var;
            case 5:
                return (hox0) cnp0Var;
            case 6:
                return (l5b1) cnp0Var;
            default:
                return (tak1) cnp0Var;
        }
    }

    public uqg(koc0 koc0Var, byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = koc0Var;
                this.c = new tak1(this, (byte) 17);
                break;
            default:
                this.b = koc0Var;
                this.c = new hox0(this, (byte) 13);
                break;
        }
    }
}
