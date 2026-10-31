package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nl10 implements c291 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final Object c;
    public final Object d;

    public nl10(n170 n170Var) {
        this.d = n170Var;
        this.c = new jf30(((df01) n170Var.c.d).a.l());
    }

    public final void B0(nac nacVar, long j) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (this.b) {
                    nacVar.skip(j);
                } else {
                    try {
                        ((c291) this.c).B0(nacVar, j);
                    } catch (IOException e) {
                        this.b = true;
                        ((j6) obj).invoke(e);
                        return;
                    }
                }
                break;
            default:
                if (!this.b) {
                    w4n1.a(nacVar.b, 0L, j);
                    ((df01) ((n170) obj).c.d).B0(nacVar, j);
                } else {
                    eg.m("closed");
                }
                break;
        }
    }

    public final void close() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                try {
                    ((c291) obj).close();
                } catch (IOException e) {
                    this.b = true;
                    ((j6) obj2).invoke(e);
                    return;
                }
                break;
            default:
                n170 n170Var = (n170) obj2;
                if (!this.b) {
                    this.b = true;
                    jf30 jf30Var = (jf30) obj;
                    gve1 gve1Var = jf30Var.e;
                    jf30Var.e = gve1.d;
                    gve1Var.a();
                    gve1Var.b();
                    n170Var.d = (byte) 3;
                    break;
                }
                break;
        }
    }

    public final void flush() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                try {
                    ((c291) this.c).flush();
                } catch (IOException e) {
                    this.b = true;
                    ((j6) obj).invoke(e);
                    return;
                }
                break;
            default:
                if (!this.b) {
                    ((df01) ((n170) obj).c.d).flush();
                    break;
                }
                break;
        }
    }

    public final gve1 l() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((c291) obj).l();
            default:
                return (jf30) obj;
        }
    }

    public nl10(c291 c291Var, j6 j6Var) {
        this.c = c291Var;
        this.d = j6Var;
    }
}
