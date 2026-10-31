package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a191 {
    public final /* synthetic */ vgn0 a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ h191 d;

    public a191(vgn0 vgn0Var, l811 l811Var, p811 p811Var, h191 h191Var) {
        this.a = vgn0Var;
        this.b = l811Var;
        this.c = p811Var;
        this.d = h191Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xd1 xd1Var, onm onmVar) throws Throwable {
        z091 z091Var;
        vgn0 vgn0Var;
        l811 l811Var;
        p811 p811Var;
        h191 h191Var;
        vgn0 vgn0Var2;
        vgn0 vgn0Var3;
        p811 p811Var2;
        Object obj;
        if (onmVar instanceof z091) {
            z091Var = (z091) onmVar;
            int i = z091Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                z091Var.h = i - Integer.MIN_VALUE;
            } else {
                z091Var = new z091(this, onmVar);
            }
        } else {
            z091Var = new z091(this, onmVar);
        }
        Object obj2 = z091Var.f;
        int i2 = z091Var.h;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                z091Var.a = xd1Var;
                vgn0Var = this.a;
                z091Var.b = vgn0Var;
                l811Var = this.b;
                z091Var.c = l811Var;
                p811Var = this.c;
                z091Var.d = p811Var;
                h191Var = this.d;
                z091Var.e = h191Var;
                z091Var.h = 1;
                if (vgn0Var.a(z091Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = z091Var.c;
                    p811Var2 = (p811) z091Var.b;
                    vgn0Var2 = (vgn0) z091Var.a;
                    try {
                        hm5.M(obj2);
                        p811Var2.a = obj;
                        Object obj3 = p811Var2.a;
                        vgn0Var2.c((Object) null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        vgn0Var2.c((Object) null);
                        throw th;
                    }
                }
                h191Var = (h191) z091Var.c;
                p811Var2 = (p811) z091Var.b;
                vgn0Var3 = (vgn0) z091Var.a;
                try {
                    hm5.M(obj2);
                    if (!u890.j(obj2, p811Var2.a)) {
                        z091Var.a = vgn0Var3;
                        z091Var.b = p811Var2;
                        z091Var.c = obj2;
                        z091Var.h = 3;
                        if (h191Var.j(obj2, z091Var) != d9nVar) {
                            obj = obj2;
                            vgn0Var2 = vgn0Var3;
                            p811Var2.a = obj;
                        }
                        return d9nVar;
                    }
                    vgn0Var2 = vgn0Var3;
                    Object obj4 = p811Var2.a;
                    vgn0Var2.c((Object) null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2 = vgn0Var3;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            h191Var = z091Var.e;
            p811 p811Var3 = z091Var.d;
            l811Var = (l811) z091Var.c;
            vgn0 vgn0Var4 = (vgn0) z091Var.b;
            xd1 xd1Var2 = (vu30) z091Var.a;
            hm5.M(obj2);
            p811Var = p811Var3;
            xd1Var = xd1Var2;
            vgn0Var = vgn0Var4;
            if (l811Var.a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = p811Var.a;
            z091Var.a = vgn0Var;
            z091Var.b = p811Var;
            z091Var.c = h191Var;
            z091Var.d = null;
            z091Var.e = null;
            z091Var.h = 2;
            Object objInvoke = xd1Var.invoke(obj5, z091Var);
            if (objInvoke != d9nVar) {
                vgn0Var3 = vgn0Var;
                obj2 = objInvoke;
                p811Var2 = p811Var;
                if (!u890.j(obj2, p811Var2.a)) {
                    z091Var.a = vgn0Var3;
                    z091Var.b = p811Var2;
                    z091Var.c = obj2;
                    z091Var.h = 3;
                    if (h191Var.j(obj2, z091Var) != d9nVar) {
                        obj = obj2;
                        vgn0Var2 = vgn0Var3;
                        p811Var2.a = obj;
                    }
                } else {
                    vgn0Var2 = vgn0Var3;
                }
                Object obj6 = p811Var2.a;
                vgn0Var2.c((Object) null);
                return obj6;
            }
            return d9nVar;
        } catch (Throwable th3) {
            th = th3;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
