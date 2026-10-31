package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sga {
    public final Context a;
    public final f5k b;
    public final j080 c;
    public final q8n d;
    public final q8n e;
    public final q8n f;

    public sga(Context context, f5k f5kVar, j080 j080Var, q8n q8nVar, int i, int i2) {
        this.a = context;
        this.b = f5kVar;
        this.c = j080Var;
        this.d = q8nVar;
        p8n p8nVar = q8n.b;
        this.e = q8nVar.M(i);
        this.f = q8nVar.M(i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, vga vgaVar, int i, nga ngaVar, onm onmVar) {
        qga qgaVar;
        if (onmVar instanceof qga) {
            qgaVar = (qga) onmVar;
            int i2 = qgaVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qgaVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qgaVar = new qga(this, onmVar);
            }
        } else {
            qgaVar = new qga(this, onmVar);
        }
        Object obj = qgaVar.a;
        int i3 = qgaVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        dx70 dx70Var = new dx70(new Long(2097152L), l1d.k(i, vgaVar.a, "/image_"));
        c5a c5aVar = new c5a(ngaVar, (byte) 2);
        qgaVar.c = 1;
        Object objC = this.c.c(str, dx70Var, c5aVar, qgaVar);
        d9n d9nVar = d9n.a;
        return objC == d9nVar ? d9nVar : objC;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r0 == r12) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r21, p.vga r22, int r23, p.nga r24, p.onm r25) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sga.b(java.lang.String, p.vga, int, p.nga, p.onm):java.lang.Object");
    }
}
