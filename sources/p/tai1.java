package p;

import com.google.protobuf.FieldMask;
import com.spotify.userhighlight.v1.UpdateUserHighlightRequest;
import com.spotify.userhighlight.v1.UserHighlightChange;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tai1 {
    public final uai1 a;
    public final uu00 b;
    public final kv00 c;

    public tai1(uai1 uai1Var, uu00 uu00Var, kv00 kv00Var) {
        this.a = uai1Var;
        this.b = uu00Var;
        this.c = kv00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        pai1 pai1Var;
        if (onmVar instanceof pai1) {
            pai1Var = (pai1) onmVar;
            int i = pai1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pai1Var.c = i - Integer.MIN_VALUE;
            } else {
                pai1Var = new pai1(this, onmVar);
            }
        } else {
            pai1Var = new pai1(this, onmVar);
        }
        Object obj = pai1Var.a;
        int i2 = pai1Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        mai1 mai1VarQ = UserHighlightChange.q();
        mai1VarQ.t(str);
        mai1VarQ.s(str2);
        UserHighlightChange userHighlightChangeBuild = mai1VarQ.build();
        pai1Var.c = 1;
        Object objC = c(userHighlightChangeBuild, pai1Var);
        Object obj2 = d9n.a;
        return objC == obj2 ? obj2 : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (p.b5p1.j(r11, r12, r0) == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r12, java.util.List r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.qai1
            if (r0 == 0) goto L13
            r0 = r14
            p.qai1 r0 = (p.qai1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.qai1 r0 = new p.qai1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 2
            r8 = 0
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L42
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2f
            java.util.List r11 = r0.b
            java.util.List r11 = (java.util.List) r11
            p.hm5.M(r14)
            goto L91
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L36:
            java.util.List r12 = r0.b
            r13 = r12
            java.util.List r13 = (java.util.List) r13
            java.lang.String r12 = r0.a
            p.hm5.M(r14)
            r6 = r11
            goto L63
        L42:
            p.hm5.M(r14)
            java.util.List r7 = java.util.Collections.singletonList(r12)
            p.wba1 r4 = new p.wba1
            r9 = 14
            r6 = r11
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r12
            r13 = r5
            java.util.List r13 = (java.util.List) r13
            r0.b = r13
            r0.e = r2
            java.lang.Object r11 = p.smo1.s(r4, r0)
            if (r11 != r10) goto L62
            goto L90
        L62:
            r13 = r5
        L63:
            p.oi r11 = new p.oi
            p.r3j r14 = new p.r3j
            r1 = 6
            r14.<init>(r13, r12, r1)
            r12 = 0
            java.lang.String r13 = "clip-edit-metadata-refresh"
            r11.<init>(r13, r12, r14)
            p.uu00 r12 = r6.b
            p.zu00 r12 = (p.zu00) r12
            io.reactivex.rxjava3.core.Observable r11 = r12.b(r11)
            p.ezc r11 = p.yoi1.g(r11)
            p.q1c1 r12 = new p.q1c1
            r13 = 16
            r12.<init>(r3, r8, r13)
            r0.a = r8
            r0.b = r8
            r0.e = r3
            java.lang.Object r11 = p.b5p1.j(r11, r12, r0)
            if (r11 != r10) goto L91
        L90:
            return r10
        L91:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tai1.b(java.lang.String, java.util.List, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(UserHighlightChange userHighlightChange, onm onmVar) {
        sai1 sai1Var;
        List listK;
        Throwable th;
        rih1 m231Var;
        Object obj;
        if (onmVar instanceof sai1) {
            sai1Var = (sai1) onmVar;
            int i = sai1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sai1Var.f = i - Integer.MIN_VALUE;
            } else {
                sai1Var = new sai1(this, onmVar);
            }
        } else {
            sai1Var = new sai1(this, onmVar);
        }
        Object obj2 = sai1Var.d;
        int i2 = sai1Var.f;
        Object obj3 = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                List list = sai1Var.b;
                UserHighlightChange userHighlightChange2 = sai1Var.a;
                try {
                    hm5.M(obj2);
                    listK = list;
                    userHighlightChange = userHighlightChange2;
                } catch (Throwable th2) {
                    listK = list;
                    userHighlightChange = userHighlightChange2;
                    th = th2;
                    m231Var = new m231(th);
                }
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = sai1Var.c;
                hm5.M(obj2);
            }
            return obj;
        }
        hm5.M(obj2);
        smc0 smc0VarN = k4p1.n();
        if (userHighlightChange.p()) {
            smc0VarN.add("title");
        }
        if (userHighlightChange.o()) {
            smc0VarN.add("start_offset");
        }
        if (userHighlightChange.n()) {
            smc0VarN.add("end_offset");
        }
        listK = k4p1.k(smc0VarN);
        try {
            qvh1 qvh1VarN = UpdateUserHighlightRequest.n();
            qvh1VarN.n(userHighlightChange);
            h220 h220VarQ = FieldMask.q();
            h220VarQ.n(listK);
            qvh1VarN.q(h220VarQ);
            UpdateUserHighlightRequest updateUserHighlightRequestBuild = qvh1VarN.build();
            uai1 uai1Var = this.a;
            String uri = userHighlightChange.getUri();
            updateUserHighlightRequestBuild.getClass();
            sai1Var.a = userHighlightChange;
            sai1Var.b = listK;
            sai1Var.c = null;
            sai1Var.f = 1;
            if (uai1Var.c(uri, updateUserHighlightRequestBuild, sai1Var) == obj3) {
            }
        } catch (Throwable th3) {
            th = th3;
            m231Var = new m231(th);
        }
        return obj3;
        m231Var = rih1.a;
        if (m231Var instanceof m231) {
            return m231Var;
        }
        String uri2 = userHighlightChange.getUri();
        sai1Var.a = null;
        sai1Var.b = null;
        sai1Var.c = m231Var;
        sai1Var.f = 2;
        if (b(uri2, listK, sai1Var) != obj3) {
            obj = m231Var;
            return obj;
        }
        return obj3;
    }
}
