package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rlj0 extends jca implements Handler.Callback {
    public final f610 T0;
    public final plj0 U0;
    public final Handler V0;
    public final gkj0 W0;
    public lap1 X0;
    public boolean Y0;
    public boolean Z0;
    public long a1;
    public hjj0 b1;
    public long c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlj0(plj0 plj0Var, Looper looper) {
        Handler handler;
        super(5);
        f610 f610Var = f610.O0;
        this.U0 = plj0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = zoi1.a;
            handler = new Handler(looper, this);
        }
        this.V0 = handler;
        this.T0 = f610Var;
        this.W0 = new gkj0(1);
        this.c1 = -9223372036854775807L;
    }

    @Override // p.jca
    public final void E(ie30[] ie30VarArr, long j, long j2, p2i0 p2i0Var) {
        this.X0 = this.T0.a(ie30VarArr[0]);
        hjj0 hjj0Var = this.b1;
        if (hjj0Var != null) {
            long j3 = hjj0Var.b;
            long j4 = (this.c1 + j3) - j2;
            if (j3 != j4) {
                hjj0Var = new hjj0(j4, hjj0Var.a);
            }
            this.b1 = hjj0Var;
        }
        this.c1 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    @Override // p.jca
    public final void I(long j, long j2) {
        int iG;
        hjj0 hjj0VarH;
        ArrayList arrayList;
        boolean z = true;
        while (z) {
            if (!this.Y0 && this.b1 == null) {
                gkj0 gkj0Var = this.W0;
                gkj0Var.g();
                w2z w2zVar = this.c;
                w2zVar.b();
                int iG2 = G(w2zVar, gkj0Var, 5);
                if (iG2 != -3 || gkj0Var.f(4)) {
                    if (iG2 != -4 || gkj0Var.f(4)) {
                        if (iG2 == -4 || iG2 == -3) {
                            long j3 = this.R0;
                            long j4 = j - this.X;
                            if (j3 != -9223372036854775807L && j4 >= j3 - 1000000) {
                                iG = G(w2zVar, gkj0Var, 0);
                                if (iG == -4) {
                                    if (gkj0Var.f(4)) {
                                        this.Y0 = true;
                                    } else if (gkj0Var.f >= this.Y) {
                                        gkj0Var.i = this.a1;
                                        gkj0Var.j();
                                        lap1 lap1Var = this.X0;
                                        String str = zoi1.a;
                                        hjj0VarH = lap1Var.h(gkj0Var);
                                        if (hjj0VarH != null) {
                                            arrayList = new ArrayList(hjj0VarH.a.length);
                                            V(hjj0VarH, arrayList);
                                            if (!arrayList.isEmpty()) {
                                                this.b1 = new hjj0(W(gkj0Var.f), (rij0[]) arrayList.toArray(new rij0[0]));
                                            }
                                        }
                                    }
                                } else if (iG == -5) {
                                    ie30 ie30Var = (ie30) w2zVar.c;
                                    ie30Var.getClass();
                                    this.a1 = ie30Var.u;
                                }
                            }
                        } else {
                            iG = G(w2zVar, gkj0Var, 0);
                            if (iG == -4) {
                                if (gkj0Var.f(4)) {
                                    this.Y0 = true;
                                } else if (gkj0Var.f >= this.Y) {
                                    gkj0Var.i = this.a1;
                                    gkj0Var.j();
                                    lap1 lap1Var2 = this.X0;
                                    String str2 = zoi1.a;
                                    hjj0VarH = lap1Var2.h(gkj0Var);
                                    if (hjj0VarH != null) {
                                        arrayList = new ArrayList(hjj0VarH.a.length);
                                        V(hjj0VarH, arrayList);
                                        if (!arrayList.isEmpty()) {
                                            this.b1 = new hjj0(W(gkj0Var.f), (rij0[]) arrayList.toArray(new rij0[0]));
                                        }
                                    }
                                }
                            } else if (iG == -5) {
                                ie30 ie30Var2 = (ie30) w2zVar.c;
                                ie30Var2.getClass();
                                this.a1 = ie30Var2.u;
                            }
                        }
                    } else if (j >= gkj0Var.f - 1000000) {
                        iG = G(w2zVar, gkj0Var, 0);
                        if (iG == -4) {
                            if (gkj0Var.f(4)) {
                                this.Y0 = true;
                            } else if (gkj0Var.f >= this.Y) {
                                gkj0Var.i = this.a1;
                                gkj0Var.j();
                                lap1 lap1Var3 = this.X0;
                                String str3 = zoi1.a;
                                hjj0VarH = lap1Var3.h(gkj0Var);
                                if (hjj0VarH != null) {
                                    arrayList = new ArrayList(hjj0VarH.a.length);
                                    V(hjj0VarH, arrayList);
                                    if (!arrayList.isEmpty()) {
                                        this.b1 = new hjj0(W(gkj0Var.f), (rij0[]) arrayList.toArray(new rij0[0]));
                                    }
                                }
                            }
                        } else if (iG == -5) {
                            ie30 ie30Var3 = (ie30) w2zVar.c;
                            ie30Var3.getClass();
                            this.a1 = ie30Var3.u;
                        }
                    }
                }
            }
            hjj0 hjj0Var = this.b1;
            if (hjj0Var == null || hjj0Var.b > W(j)) {
                z = false;
            } else {
                hjj0 hjj0Var2 = this.b1;
                Handler handler = this.V0;
                if (handler != null) {
                    handler.obtainMessage(1, hjj0Var2).sendToTarget();
                } else {
                    this.U0.u(hjj0Var2);
                }
                this.b1 = null;
                z = true;
            }
            if (this.Y0 && this.b1 == null) {
                this.Z0 = true;
            }
        }
    }

    @Override // p.jca
    public final int R(ie30 ie30Var) {
        if (this.T0.k(ie30Var)) {
            return jca.a(ie30Var.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return jca.a(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void V(hjj0 hjj0Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            rij0[] rij0VarArr = hjj0Var.a;
            if (i >= rij0VarArr.length) {
                return;
            }
            ie30 ie30VarA = rij0VarArr[i].a();
            if (ie30VarA != null) {
                f610 f610Var = this.T0;
                if (f610Var.k(ie30VarA)) {
                    lap1 lap1VarA = f610Var.a(ie30VarA);
                    byte[] bArrC = rij0VarArr[i].c();
                    bArrC.getClass();
                    gkj0 gkj0Var = this.W0;
                    gkj0Var.g();
                    gkj0Var.i(bArrC.length);
                    ByteBuffer byteBuffer = gkj0Var.d;
                    String str = zoi1.a;
                    byteBuffer.put(bArrC);
                    gkj0Var.j();
                    hjj0 hjj0VarH = lap1VarA.h(gkj0Var);
                    if (hjj0VarH != null) {
                        V(hjj0VarH, arrayList);
                    }
                } else {
                    arrayList.add(rij0VarArr[i]);
                }
            } else {
                arrayList.add(rij0VarArr[i]);
            }
            i++;
        }
    }

    public final long W(long j) {
        dm5.y(j != -9223372036854775807L);
        dm5.y(this.c1 != -9223372036854775807L);
        return j - this.c1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            bhn0.w();
            return false;
        }
        this.U0.u((hjj0) message.obj);
        return true;
    }

    @Override // p.jca
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // p.jca
    public final boolean t() {
        return this.Z0;
    }

    @Override // p.jca
    public final boolean v() {
        return true;
    }

    @Override // p.jca
    public final void x() {
        this.b1 = null;
        this.X0 = null;
        this.c1 = -9223372036854775807L;
    }

    @Override // p.jca
    public final void z(long j, boolean z, boolean z2) {
        this.b1 = null;
        this.Y0 = false;
        this.Z0 = false;
    }
}
