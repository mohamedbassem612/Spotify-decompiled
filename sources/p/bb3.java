package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bb3 implements yt11 {
    public static final o3r j = w3p1.o(new l4r(hvm.b, 3, ra3.Y, new j4r(ra3.t), ra3.Z), ra3.X);
    public final fd3 a;
    public final aas b;
    public final b7r0 c;
    public final vu1 d;
    public final vgm e;
    public final q8n f;
    public final d0r g;
    public final g83 h;
    public final r9d1 i = new r9d1(new ks11(vjx.c, new lh2(3, this, bb3.class, "addToQueue", "addToQueue(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseStructuredData;Lcom/spotify/ubi/logger/InteractionLoggingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 1)), new ks11(klx.c, new lh2(3, this, bb3.class, "curateOrAddToPlaylist", "curateOrAddToPlaylist(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseStructuredData;Lcom/spotify/ubi/logger/InteractionLoggingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 2)));

    public bb3(fd3 fd3Var, aas aasVar, b7r0 b7r0Var, vu1 vu1Var, vgm vgmVar, q8n q8nVar, d0r d0rVar, g83 g83Var) {
        this.a = fd3Var;
        this.b = aasVar;
        this.c = b7r0Var;
        this.d = vu1Var;
        this.e = vgmVar;
        this.f = q8nVar;
        this.g = d0rVar;
        this.h = g83Var;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
        if (jmb1Var != null) {
            Object objE = ((id3) this.a).e(new yc3(jmb1Var.a.a), tv80Var, onmVar);
            if (objE == d9n.a) {
                return objE;
            }
        }
        return rih1.a;
    }

    public final s9d1 b() {
        return this.i;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        lnm lnmVar = null;
        jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
        if (jmb1Var != null && tv80Var != null) {
            Object objY = fn31.Y(this.f, new hb1(this, jmb1Var, tv80Var, lnmVar, (byte) 9), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(uv11 uv11Var, tv80 tv80Var, lnm lnmVar) {
        za3 za3Var;
        tv80 tv80Var2;
        Object obj;
        uv11 uv11Var2;
        if (lnmVar instanceof za3) {
            za3Var = (za3) lnmVar;
            int i = za3Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                za3Var.e = i - Integer.MIN_VALUE;
            } else {
                za3Var = new za3(this, lnmVar);
            }
        } else {
            za3Var = new za3(this, lnmVar);
        }
        za3 za3Var2 = za3Var;
        Object obj2 = za3Var2.c;
        int i2 = za3Var2.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            String str = uv11Var.a;
            za3Var2.a = uv11Var;
            za3Var2.b = tv80Var;
            za3Var2.e = 1;
            Object objE = e(str, za3Var2);
            if (objE != obj3) {
                tv80Var2 = tv80Var;
                obj = objE;
                uv11Var2 = uv11Var;
            }
            return obj3;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80 tv80Var3 = za3Var2.b;
        uv11 uv11Var3 = za3Var2.a;
        hm5.M(obj2);
        tv80Var2 = tv80Var3;
        obj = obj2;
        uv11Var2 = uv11Var3;
        lnm lnmVar2 = null;
        if (((Boolean) obj).booleanValue()) {
            hb1 hb1Var = new hb1(this, uv11Var2, tv80Var2, lnmVar2, (byte) 8);
            za3Var2.a = null;
            za3Var2.b = null;
            za3Var2.e = 3;
            if (fn31.Y(this.f, hb1Var, za3Var2) == obj3) {
                return obj3;
            }
            return rih1Var;
        }
        yy yyVar = new yy(tv80Var2);
        hvm hvmVar = hvm.b;
        String str2 = uv11Var2.a;
        za3Var2.a = null;
        za3Var2.b = null;
        za3Var2.e = 2;
        if (d0r.d(this.g, hvmVar, str2, yyVar, za3Var2) == obj3) {
            return obj3;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        ab3 ab3Var;
        if (onmVar instanceof ab3) {
            ab3Var = (ab3) onmVar;
            int i = ab3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ab3Var.d = i - Integer.MIN_VALUE;
            } else {
                ab3Var = new ab3(this, onmVar);
            }
        } else {
            ab3Var = new ab3(this, onmVar);
        }
        Object objJ = ab3Var.b;
        int i2 = ab3Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                this = x2p1.f(this.g, j, str);
                bpb1 bpb1Var = this.a().a;
                s4 s4Var = new s4(2, (lnm) null, (byte) 8);
                ab3Var.a = this;
                ab3Var.d = 1;
                objJ = b5p1.j(bpb1Var, s4Var, ab3Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = ab3Var.a;
                hm5.M(objJ);
            }
            k1r k1rVar = (k1r) objJ;
            i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
            boolean zJ = i1rVar != null ? u890.j(i1rVar.a, Boolean.TRUE) : false;
            this.dispose();
            return Boolean.valueOf(zJ);
        } catch (Throwable th) {
            this.dispose();
            throw th;
        }
    }
}
