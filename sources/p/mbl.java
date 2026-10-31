package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mbl implements y341, vgn0 {
    public final y341 a;
    public final vgn0 b;
    public o8n c;
    public Throwable d;
    public final lbl e;

    public mbl(y341 y341Var) {
        xgn0 xgn0VarA = ygn0.a();
        this.a = y341Var;
        this.b = xgn0VarA;
        this.e = new lbl(this);
    }

    public final boolean V0() {
        return this.a.V0();
    }

    public final Object a(lnm lnmVar) {
        return this.b.a(lnmVar);
    }

    public final void c(Object obj) {
        this.b.c((Object) null);
    }

    public final void close() throws Exception {
        lbl lblVar = this.e;
        if (lblVar != null) {
            lblVar.f(-1);
        }
        this.a.close();
    }

    public final void d(StringBuilder sb) {
        int i;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            o8n o8nVar = this.c;
            if (o8nVar != null) {
                sb.append("\t\tCoroutine: " + o8nVar);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = o7h.k0(ihc1.D0(j2h1.I(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.e != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            lbl lblVar = this.e;
            synchronized (((ydf0) lblVar).c) {
                i = ((ydf0) lblVar).d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    public final d441 g1(String str) {
        lbl lblVar = this.e;
        if (lblVar == null) {
            return this.a.g1(str);
        }
        Object objC = lblVar.c(str);
        objC.getClass();
        return new cva((d441) objC, (byte) 1);
    }

    public final String toString() {
        return this.a.toString();
    }
}
