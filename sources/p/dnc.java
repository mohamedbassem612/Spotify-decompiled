package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dnc {
    public final ynb0 a;
    public final kly0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final ywv0 f;
    public final g3q0 g;
    public final uvy h;
    public Disposable i;
    public final vmc j;

    public dnc(ynb0 ynb0Var, kly0 kly0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ywv0 ywv0Var, g3q0 g3q0Var, ra81 ra81Var, uvy uvyVar, upp0 upp0Var, n3d0 n3d0Var, String str, bn70 bn70Var, b7r0 b7r0Var, ov20 ov20Var, iac0 iac0Var, yqg yqgVar) {
        this.a = ynb0Var;
        this.b = kly0Var;
        this.c = ynb0Var2;
        this.d = ynb0Var3;
        this.e = ynb0Var4;
        this.f = ywv0Var;
        this.g = g3q0Var;
        this.h = uvyVar;
        this.j = new vmc(kly0Var, upp0Var, b7r0Var, ov20Var, yqgVar, n3d0Var, str, bn70Var, ra81Var);
        iac0Var.getLifecycle().a(new xmc(this, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        ymc ymcVar;
        if (onmVar instanceof ymc) {
            ymcVar = (ymc) onmVar;
            int i = ymcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ymcVar.c = i - Integer.MIN_VALUE;
            } else {
                ymcVar = new ymc(this, onmVar);
            }
        } else {
            ymcVar = new ymc(this, onmVar);
        }
        Object objJ = ymcVar.a;
        int i2 = ymcVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = ((w9u0) this.c.get()).a(q9u0.c(((PlayOrigin) this.b.get()).featureIdentifier(), false));
            ymcVar.c = 1;
            objJ = fc11.j(singleA, ymcVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[PHI: r2 r7
      0x00b6: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:32:0x009a, B:37:0x00a2, B:42:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r7v6 p.enc) = (r7v4 p.enc), (r7v4 p.enc), (r7v7 p.enc) binds: [B:32:0x009a, B:37:0x00a2, B:42:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r1 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r1 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.enc r18, p.onm r19) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dnc.b(p.enc, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, boolean z, PlayCommand playCommand, ou80 ou80Var, onm onmVar) {
        anc ancVar;
        if (onmVar instanceof anc) {
            ancVar = (anc) onmVar;
            int i = ancVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ancVar.f = i - Integer.MIN_VALUE;
            } else {
                ancVar = new anc(this, onmVar);
            }
        } else {
            ancVar = new anc(this, onmVar);
        }
        Object obj = ancVar.d;
        int i2 = ancVar.f;
        ywv0 ywv0Var = this.f;
        if (i2 == 0) {
            hm5.M(obj);
            d9n d9nVar = d9n.a;
            if (z) {
                ancVar.a = str;
                ancVar.b = playCommand;
                ancVar.c = ou80Var;
                ancVar.f = 2;
                Object objC = ywv0Var.c(str, ancVar);
                if (objC != d9nVar) {
                    obj = objC;
                }
            } else {
                Single singleA = ((muz) this.a.get()).a(playCommand);
                ancVar.a = null;
                ancVar.b = null;
                ancVar.c = null;
                ancVar.f = 1;
                Object objJ = fc11.j(singleA, ancVar);
                if (objJ != d9nVar) {
                    return objJ;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return obj;
        }
        if (i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ou80Var = ancVar.c;
        playCommand = ancVar.b;
        str = ancVar.a;
        hm5.M(obj);
        ndj1 ndj1Var = (ndj1) obj;
        if (u890.j(ndj1Var, ndj1.c)) {
            this.i = ywv0Var.h(playCommand, str, ou80Var);
            return feh.f();
        }
        if (u890.j(ndj1Var, ndj1.a) || u890.j(ndj1Var, ndj1.b)) {
            return feh.b("");
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        bnc bncVar;
        if (onmVar instanceof bnc) {
            bncVar = (bnc) onmVar;
            int i = bncVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bncVar.c = i - Integer.MIN_VALUE;
            } else {
                bncVar = new bnc(this, onmVar);
            }
        } else {
            bncVar = new bnc(this, onmVar);
        }
        Object objJ = bncVar.a;
        int i2 = bncVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = ((w9u0) this.c.get()).a(q9u0.e(((PlayOrigin) this.b.get()).featureIdentifier(), false));
            bncVar.c = 1;
            objJ = fc11.j(singleA, bncVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(enc encVar, onm onmVar) {
        cnc cncVar;
        sq51 sq51VarB;
        String strB;
        String strG;
        if (onmVar instanceof cnc) {
            cncVar = (cnc) onmVar;
            int i = cncVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cncVar.d = i - Integer.MIN_VALUE;
            } else {
                cncVar = new cnc(this, onmVar);
            }
        } else {
            cncVar = new cnc(this, onmVar);
        }
        Object objA = cncVar.b;
        int i2 = cncVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                uvy uvyVar = this.h;
                if (uvyVar == null || (strB = encVar.b()) == null || (strG = encVar.g()) == null || encVar.f() != null) {
                    return encVar;
                }
                cncVar.a = encVar;
                cncVar.d = 1;
                objA = uvyVar.a(strG, strB, cncVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                encVar = cncVar.a;
                hm5.M(objA);
            }
            sq51VarB = ((lvy) objA).b();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            sq51VarB = null;
        }
        return sq51VarB != null ? enc.a(encVar, (String) null, yah0.q(sq51VarB.a()), 191) : encVar;
    }
}
