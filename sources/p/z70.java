package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z70 implements xpw {
    public final /* synthetic */ byte a;
    public final ArrayList b;
    public final ljm0 c;
    public final eih1 d;
    public final psw e;

    public z70(ArrayList arrayList, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = arrayList;
                this.c = h7w.B(zlt.X, (o8n) null, zlt.Z, v0t.V0, 2);
                this.d = new eih1();
                j2i j2iVar = new j2i(682766277, new ent(this, (byte) 0), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 2:
                this.b = arrayList;
                this.c = h7w.B(p7w0.Q0, (o8n) null, (iu30) null, nzv0.O0, 6);
                this.d = new eih1();
                j2i j2iVar2 = new j2i(-605084487, new qsu0(this, (byte) 11), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            default:
                this.b = arrayList;
                this.c = h7w.B(ft.X, (o8n) null, (iu30) null, n1.W0, 6);
                this.d = new eih1();
                j2i j2iVar3 = new j2i(1228805813, new r1(this, (byte) 6), true);
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }
}
