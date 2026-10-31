package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rgs {
    public final c9c0 a;
    public final zfr b;
    public final p4s c;
    public final z1s d;
    public final cn30 e;
    public final www0 f;
    public final b7d0 g;

    public rgs(c9c0 c9c0Var, zfr zfrVar, p4s p4sVar, z1s z1sVar, cn30 cn30Var, www0 www0Var, b7d0 b7d0Var) {
        this.a = c9c0Var;
        this.b = zfrVar;
        this.c = p4sVar;
        this.d = z1sVar;
        this.e = cn30Var;
        this.f = www0Var;
        this.g = b7d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (b(r12, r11, r0) == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, p.eww0 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.pgs
            if (r0 == 0) goto L13
            r0 = r13
            p.pgs r0 = (p.pgs) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.pgs r0 = new p.pgs
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L45
            if (r1 == r5) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            p.hm5.M(r13)
            goto Lad
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L35:
            p.eww0 r11 = r0.b
            java.lang.String r12 = r0.a
            p.hm5.M(r13)
            goto La0
        L3d:
            p.eww0 r12 = r0.b
            java.lang.String r11 = r0.a
            p.hm5.M(r13)
            goto L57
        L45:
            p.hm5.M(r13)
            r0.a = r11
            r0.b = r12
            r0.e = r5
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r13 = p.hap1.i(r7, r0)
            if (r13 != r6) goto L57
            goto Lac
        L57:
            p.c9c0 r13 = r10.a
            p.omo r13 = r13.b
            p.zob1 r13 = r13.current()
            java.lang.Object r13 = r13.getValue()
            p.pp90 r13 = (p.pp90) r13
            if (r13 == 0) goto L89
            p.np90 r13 = r13.h
            p.hp90 r13 = r13.b
            boolean r13 = r13.f
            if (r13 != r5) goto L89
            p.zfr r13 = r10.b
            java.lang.Object r1 = r13.b
            p.e831 r1 = (p.e831) r1
            android.app.Activity r1 = r1.a()
            if (r1 == 0) goto L8e
            java.lang.Object r13 = r13.c
            p.hu90 r13 = (p.hu90) r13
            java.lang.Object r13 = r13.invoke(r1)
            p.e7p0 r13 = (p.e7p0) r13
            r13.c()
            goto L8e
        L89:
            p.p4s r13 = r10.c
            r13.b(r4)
        L8e:
            r0.a = r11
            r0.b = r12
            r0.e = r3
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r13 = p.hap1.i(r7, r0)
            if (r13 != r6) goto L9d
            goto Lac
        L9d:
            r9 = r12
            r12 = r11
            r11 = r9
        La0:
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r10 = r10.b(r12, r11, r0)
            if (r10 != r6) goto Lad
        Lac:
            return r6
        Lad:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rgs.a(java.lang.String, p.eww0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, eww0 eww0Var, onm onmVar) {
        qgs qgsVar;
        boolean z;
        if (onmVar instanceof qgs) {
            qgsVar = (qgs) onmVar;
            int i = qgsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgsVar.d = i - Integer.MIN_VALUE;
            } else {
                qgsVar = new qgs(this, onmVar);
            }
        } else {
            qgsVar = new qgs(this, onmVar);
        }
        Object obj = qgsVar.b;
        int i2 = qgsVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            c9c0 c9c0Var = this.a;
            pp90 pp90Var = (pp90) c9c0Var.b.current().getValue();
            boolean z2 = ((bp90) c9c0Var.e.a().getValue()).g;
            if (pp90Var != null && pp90Var.h.k) {
                String str2 = pno1.h(pp90Var.c).c;
                qgsVar.a = z2;
                qgsVar.d = 1;
                if (this.e.b(str2, qgsVar) != d9nVar) {
                    return rih1Var;
                }
            } else {
                if (z2) {
                    ArrayList arrayList = pp90Var != null ? pp90Var.c : null;
                    if (arrayList == null) {
                        arrayList = z6x.a;
                    }
                    ArrayList<hp90> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (hp90 hp90Var : arrayList2) {
                        arrayList3.add(new nj70(hp90Var.c, hp90Var.b, hp90Var.d, hp90Var.e));
                    }
                    this.d.a(new ti70(arrayList3, new fj70(str, eww0Var != null ? eww0Var.b : null, eww0Var != null ? eww0Var.f : null)));
                    return rih1Var;
                }
                qgsVar.a = z2;
                qgsVar.d = 2;
                Object objA = this.g.a(qgsVar);
                if (objA != d9nVar) {
                    obj = objA;
                    z = z2;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = qgsVar.a;
        hm5.M(obj);
        if (!((Boolean) obj).booleanValue()) {
            Single singleA = this.f.a(vww0.b);
            qgsVar.a = z;
            qgsVar.d = 3;
            if (fc11.j(singleA, qgsVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
