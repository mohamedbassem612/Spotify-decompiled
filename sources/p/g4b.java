package p;

import com.spotify.blend.socialprompting.dataimpl.BlendSocialPromptingGenerationErrorException;
import com.spotify.blend.socialprompting.dataimpl.BlendSocialPromptingGenerationTimeoutException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g4b {
    public final String a;
    public final n4b b;
    public final iyc0 c;
    public final lmy0 d;
    public final String e;
    public final bpb1 f;
    public final xe01 g;
    public final bpb1 h;
    public final xe01 i;
    public volatile String j;
    public faa0 k;

    public g4b(String str, n4b n4bVar, iyc0 iyc0Var, lmy0 lmy0Var) {
        this.a = str;
        this.b = n4bVar;
        this.c = iyc0Var;
        this.d = lmy0Var;
        Set set = s4b1.f;
        this.e = uic.x(str).h();
        fg91 fg91Var = fg91.b;
        bpb1 bpb1VarB = gio1.b(new yb20(fg91Var, fg91Var));
        this.f = bpb1VarB;
        this.g = d5p1.h(bpb1VarB);
        bpb1 bpb1VarB2 = gio1.b(sob1.a);
        this.h = bpb1VarB2;
        this.i = d5p1.h(bpb1VarB2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        v3b v3bVar;
        if (onmVar instanceof v3b) {
            v3bVar = (v3b) onmVar;
            int i = v3bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3bVar.c = i - Integer.MIN_VALUE;
            } else {
                v3bVar = new v3b(this, onmVar);
            }
        } else {
            v3bVar = new v3b(this, onmVar);
        }
        Object obj = v3bVar.a;
        int i2 = v3bVar.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                a4b a4bVar = new a4b(this, str, lnmVar, (byte) 0);
                v3bVar.c = 1;
                Object objM = rc2.M(300000L, a4bVar, v3bVar);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (TimeoutCancellationException unused) {
            throw new BlendSocialPromptingGenerationTimeoutException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (p.smo1.s(r7, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r15 == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r14, p.onm r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p.b4b
            if (r0 == 0) goto L14
            r0 = r15
            p.b4b r0 = (p.b4b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p.b4b r0 = new p.b4b
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.a
            p.d9n r0 = p.d9n.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r11 = 0
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            p.hm5.M(r15)
            r10 = r13
            goto L72
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            r13 = 0
            return r13
        L35:
            p.hm5.M(r15)
            r10 = r13
            goto L77
        L3a:
            p.hm5.M(r15)
            if (r14 == 0) goto L5a
            java.lang.String r15 = "blend-social-prompting-"
            java.lang.String r9 = r15.concat(r14)
            java.lang.String r8 = r13.j
            r13.j = r9
            p.bh r7 = new p.bh
            r12 = 28
            r10 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r6.c = r3
            java.lang.Object r13 = p.smo1.s(r7, r6)
            if (r13 != r0) goto L77
            goto L71
        L5a:
            r10 = r13
            r10.j = r11
            p.iyc0 r13 = r10.c
            r14 = r2
            java.lang.String r2 = r10.a
            r6.c = r14
            r1 = r13
            p.xyc0 r1 = (p.xyc0) r1
            r4 = 0
            r5 = 1
            java.lang.String r3 = "blend-social-prompting"
            java.lang.Object r15 = r1.p(r2, r3, r4, r5, r6)
            if (r15 != r0) goto L72
        L71:
            return r0
        L72:
            p.py21 r15 = (p.py21) r15
            r15.d()
        L77:
            p.bpb1 r13 = r10.h
            p.sob1 r14 = p.sob1.b
            r13.m(r11, r14)
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g4b.b(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        c4b c4bVar;
        if (onmVar instanceof c4b) {
            c4bVar = (c4b) onmVar;
            int i = c4bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4bVar.d = i - Integer.MIN_VALUE;
            } else {
                c4bVar = new c4b(this, onmVar);
            }
        } else {
            c4bVar = new c4b(this, onmVar);
        }
        Object objP = c4bVar.b;
        int i2 = c4bVar.d;
        Object obj = null;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                n4b n4bVar = this.b;
                String str2 = this.e;
                c4bVar.a = str;
                c4bVar.d = 1;
                objP = n4bVar.p(str2, c4bVar);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = c4bVar.a;
                hm5.M(objP);
            }
            yb20 yb20Var = (yb20) objP;
            this.f.l(yb20Var);
            for (Object obj2 : yb20Var.a) {
                if (((ea61) obj2).a.equals(str)) {
                    obj = obj2;
                    break;
                }
            }
            ea61 ea61Var = (ea61) obj;
            int i3 = ea61Var != null ? ea61Var.d : 0;
            int i4 = i3 == 0 ? -1 : u3b.a[l1d.C(i3)];
            if (i4 != 1) {
                return Boolean.valueOf(i4 == 2);
            }
            throw new BlendSocialPromptingGenerationErrorException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(iu30 iu30Var, onm onmVar) throws Exception {
        d4b d4bVar;
        if (onmVar instanceof d4b) {
            d4bVar = (d4b) onmVar;
            int i = d4bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4bVar.c = i - Integer.MIN_VALUE;
            } else {
                d4bVar = new d4b(this, onmVar);
            }
        } else {
            d4bVar = new d4b(this, onmVar);
        }
        Object obj = d4bVar.a;
        int i2 = d4bVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            d4bVar.c = 1;
            Object objInvoke = iu30Var.invoke(d4bVar);
            d9n d9nVar = d9n.a;
            return objInvoke == d9nVar ? d9nVar : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.h.m((Object) null, sob1.b);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(iu30 iu30Var, onm onmVar) throws Throwable {
        f4b f4bVar;
        Throwable th;
        faa0 faa0Var;
        if (onmVar instanceof f4b) {
            f4bVar = (f4b) onmVar;
            int i = f4bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f4bVar.d = i - Integer.MIN_VALUE;
            } else {
                f4bVar = new f4b(this, onmVar);
            }
        } else {
            f4bVar = new f4b(this, onmVar);
        }
        Object obj = f4bVar.b;
        int i2 = f4bVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            faa0Var = f4bVar.a;
            try {
                hm5.M(obj);
                if (this.k == faa0Var) {
                    this.k = null;
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (this.k == faa0Var) {
                    this.k = null;
                }
                throw th;
            }
        }
        hm5.M(obj);
        faa0 faa0VarZ = op71.z(f4bVar.getContext());
        faa0 faa0Var2 = this.k;
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
        }
        this.k = faa0VarZ;
        try {
            f4bVar.a = faa0VarZ;
            f4bVar.d = 1;
            Object objD = d(iu30Var, f4bVar);
            Object obj2 = d9n.a;
            if (objD == obj2) {
                return obj2;
            }
            obj = objD;
            faa0Var = faa0VarZ;
            if (this.k == faa0Var) {
                this.k = null;
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            faa0Var = faa0VarZ;
            if (this.k == faa0Var) {
                this.k = null;
            }
            throw th;
        }
    }
}
