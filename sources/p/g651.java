package p;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g651 implements f961 {
    public final llm b;
    public boolean e;
    public boolean f;
    public o051 g;
    public final Object a = new Object();
    public final byte c = 64;
    public final LinkedHashSet d = new LinkedHashSet();
    public final g651 h = this;
    public final m441 i = new m441(new lru(this, (lnm) null));

    public g651(q8n q8nVar) {
        this.b = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004f -> B:22:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.e651 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.f651
            if (r0 == 0) goto L13
            r0 = r9
            p.f651 r0 = (p.f651) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.f651 r0 = new p.f651
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            p.d9n r1 = p.d9n.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            p.e651 r8 = r0.a
            p.hm5.M(r9)
            goto L51
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L33:
            p.e651 r8 = r0.a
            p.hm5.M(r9)
            p.qge r9 = (p.qge) r9
            java.lang.Object r9 = r9.a
            goto L4d
        L3d:
            p.hm5.M(r9)
        L40:
            p.bbc r9 = r8.b
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = p.bbc.O(r9, r0)
            if (r9 != r1) goto L4d
            goto L8a
        L4d:
            boolean r9 = r9 instanceof p.pge
            if (r9 != 0) goto La9
        L51:
            java.lang.Object r9 = r7.a
            monitor-enter(r9)
            java.util.ArrayDeque r2 = r8.a     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L6c
            p.d651 r2 = new p.d651     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayDeque r6 = r8.a     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r6.removeFirst()     // Catch: java.lang.Throwable -> L6a
            p.p151 r6 = (p.p151) r6     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            goto L75
        L6a:
            r7 = move-exception
            goto La7
        L6c:
            boolean r2 = r8.d     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L73
            p.c651 r2 = p.c651.a     // Catch: java.lang.Throwable -> L6a
            goto L75
        L73:
            p.b651 r2 = p.b651.a     // Catch: java.lang.Throwable -> L6a
        L75:
            monitor-exit(r9)
            boolean r9 = r2 instanceof p.d651
            if (r9 == 0) goto L8b
            p.bbc r9 = r8.c
            p.d651 r2 = (p.d651) r2
            p.p151 r2 = r2.a
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r9.b(r2, r0)
            if (r9 != r1) goto L51
        L8a:
            return r1
        L8b:
            p.b651 r9 = p.b651.a
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto L40
            p.c651 r7 = p.c651.a
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto La3
            p.bbc r7 = r8.c
            r7.H(r3)
            p.rih1 r7 = p.rih1.a
            return r7
        La3:
            p.eg.o()
            return r3
        La7:
            monitor-exit(r9)
            throw r7
        La9:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g651.a(p.e651, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0006 A[SYNTHETIC] */
    public final void b(p151 p151Var) {
        boolean z;
        for (e651 e651Var : this.d) {
            boolean z2 = p151Var instanceof o051;
            byte b = this.c;
            if (!z2 || ((o051) p151Var).b) {
                ArrayDeque arrayDeque = e651Var.a;
                ArrayDeque arrayDeque2 = e651Var.a;
                if (arrayDeque.size() >= b) {
                    Iterator it = arrayDeque2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayDeque2.removeFirst();
                            break;
                        }
                        p151 p151Var2 = (p151) it.next();
                        if ((p151Var2 instanceof o051) && !((o051) p151Var2).b) {
                            it.remove();
                            break;
                        }
                    }
                }
            } else {
                Iterator it2 = e651Var.a.iterator();
                while (it2.hasNext()) {
                    p151 p151Var3 = (p151) it2.next();
                    if ((p151Var3 instanceof o051) && !((o051) p151Var3).b) {
                        it2.remove();
                        break;
                    }
                }
                z = e651Var.a.size() < b;
                if (z) {
                    e651Var.b.l(rih1.a);
                }
            }
            e651Var.a.addLast(p151Var);
            if (z) {
                e651Var.b.l(rih1.a);
            }
        }
    }

    public final Object getApi() {
        return this.h;
    }

    public final void shutdown() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                for (e651 e651Var : this.d) {
                    e651Var.d = true;
                    e651Var.b.l(rih1.a);
                }
                boolean zIsEmpty = this.d.isEmpty();
                if (zIsEmpty) {
                    smo1.p(this.b, (CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
