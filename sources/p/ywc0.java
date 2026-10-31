package p;

import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ywc0 {
    public final y241 a;
    public final wdm b;
    public final List c;
    public final List d;
    public final wo4 e;

    public ywc0(y241 y241Var, wdm wdmVar, List list, List list2, wo4 wo4Var) {
        this.a = y241Var;
        this.b = wdmVar;
        this.c = list;
        this.d = list2;
        this.e = wo4Var;
    }

    public final Observable a(eoc0 eoc0Var) {
        return yoi1.i(new m441(new og5(eoc0Var, this, (lnm) null, (byte) 21)), o6x.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e A[PHI: r5 r10 r11
      0x005e: PHI (r5v2 p.hti0) = (r5v0 p.hti0), (r5v3 p.hti0) binds: [B:18:0x0052, B:28:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r10v4 java.util.Iterator) = (r10v1 java.util.Iterator), (r10v5 java.util.Iterator) binds: [B:18:0x0052, B:28:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r11v2 p.rzq) = (r11v0 p.rzq), (r11v3 p.rzq) binds: [B:18:0x0052, B:28:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:24:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p.hti0 r10, p.rzq r11, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.wwc0
            if (r0 == 0) goto L13
            r0 = r12
            p.wwc0 r0 = (p.wwc0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.wwc0 r0 = new p.wwc0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.e
            int r1 = r0.g
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            p.mr20 r9 = r0.d
            p.mr20 r9 = (p.mr20) r9
            java.util.Iterator r10 = r0.c
            p.d0r r11 = r0.b
            p.hti0 r1 = r0.a
            p.hm5.M(r12)
            r5 = r1
            goto L84
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L38:
            p.hm5.M(r12)
            p.wo4 r12 = r9.e
            boolean r12 = r12.b()
            if (r12 == 0) goto L52
            p.sh6 r3 = new p.sh6
            r8 = 3
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            p.m441 r9 = new p.m441
            r9.<init>(r3)
            return r9
        L52:
            r4 = r9
            r5 = r10
            r6 = r11
            java.util.List r9 = r4.c
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r10 = r9
        L5e:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L94
            java.lang.Object r9 = r10.next()
            p.mgm r9 = (p.mgm) r9
            p.mr20 r9 = r9.b(r5, r11)
            r0.a = r5
            r0.b = r11
            r0.c = r10
            r12 = r9
            p.mr20 r12 = (p.mr20) r12
            r0.d = r12
            r0.g = r2
            java.lang.Object r12 = p.b5p1.i(r9, r0)
            p.d9n r1 = p.d9n.a
            if (r12 != r1) goto L84
            return r1
        L84:
            p.igm r12 = (p.igm) r12
            if (r12 == 0) goto L90
            p.any r12 = new p.any
            r1 = 18
            r12.<init>(r9, r1)
            goto L91
        L90:
            r12 = r7
        L91:
            if (r12 == 0) goto L5e
            goto L95
        L94:
            r12 = r7
        L95:
            if (r12 != 0) goto La5
            p.igm r9 = new p.igm
            r10 = 7
            r9.<init>(r7, r7, r7, r10)
            p.huz r10 = new p.huz
            r11 = 10
            r10.<init>(r9, r11)
            return r10
        La5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ywc0.b(p.hti0, p.rzq, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(shm shmVar, hti0 hti0Var, rzq rzqVar, onm onmVar) {
        xwc0 xwc0Var;
        if (onmVar instanceof xwc0) {
            xwc0Var = (xwc0) onmVar;
            int i = xwc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwc0Var.c = i - Integer.MIN_VALUE;
            } else {
                xwc0Var = new xwc0(this, onmVar);
            }
        } else {
            xwc0Var = new xwc0(this, onmVar);
        }
        Object objO = xwc0Var.a;
        int i2 = xwc0Var.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                n0a0 n0a0Var = new n0a0((Object) shmVar, (Object) hti0Var, (Object) rzqVar, lnmVar, (byte) 12);
                xwc0Var.c = 1;
                objO = rc2.O(5000L, n0a0Var, xwc0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (jhm) objO;
        } catch (ItemUnavailableException unused) {
            return null;
        }
    }
}
