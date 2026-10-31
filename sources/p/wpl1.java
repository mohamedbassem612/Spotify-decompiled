package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wpl1 {
    public static final xgn0 c = ygn0.a();
    public final upl1 a;
    public final mx21 b;

    public wpl1(upl1 upl1Var, mx21 mx21Var) {
        this.a = upl1Var;
        this.b = mx21Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:39:0x009d, B:41:0x00a2, B:44:0x00ab, B:46:0x00b1, B:47:0x00b6, B:55:0x00c6, B:38:0x0097, B:50:0x00bd, B:53:0x00c4), top: B:69:0x0097, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:39:0x009d, B:41:0x00a2, B:44:0x00ab, B:46:0x00b1, B:47:0x00b6, B:55:0x00c6, B:38:0x0097, B:50:0x00bd, B:53:0x00c4), top: B:69:0x0097, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #2 {all -> 0x00c5, blocks: (B:50:0x00bd, B:53:0x00c4), top: B:67:0x00bd, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        vpl1 vpl1Var;
        vgn0 vgn0Var;
        int i;
        Throwable th;
        vgn0 vgn0Var2;
        Throwable th2;
        ajm1 m231Var;
        Throwable thA;
        Throwable thA2;
        if (onmVar instanceof vpl1) {
            vpl1Var = (vpl1) onmVar;
            int i2 = vpl1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vpl1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                vpl1Var = new vpl1(this, onmVar);
            }
        } else {
            vpl1Var = new vpl1(this, onmVar);
        }
        Object obj = vpl1Var.c;
        int i3 = vpl1Var.e;
        mx21 mx21Var = this.b;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                vgn0Var = c;
                vpl1Var.a = vgn0Var;
                i = 0;
                vpl1Var.b = 0;
                vpl1Var.e = 1;
                if (vgn0Var.a(vpl1Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = vpl1Var.a;
                try {
                    hm5.M(obj);
                    m231Var = i1k0.A((WrappedWidgetResources) obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        m231Var = new m231(th2);
                    } catch (Throwable th4) {
                        th = th4;
                        vgn0Var2.c((Object) null);
                        throw th;
                    }
                }
                if (!(m231Var instanceof m231)) {
                    mx21Var.b(m231Var);
                }
                thA = e331.a(m231Var);
                if (thA != null) {
                    n57.g("Failed to fetch widget resources", thA);
                }
                thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    try {
                        m231Var = mx21Var.a();
                        if (m231Var != null) {
                            throw thA2;
                        }
                    } catch (Throwable th5) {
                        m231Var = new m231(th5);
                    }
                }
                vgn0Var2.c((Object) null);
                return m231Var;
            }
            i = vpl1Var.b;
            vgn0 vgn0Var3 = vpl1Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            ajm1 ajm1VarA = !u890.j(((dma1) mx21Var.c.getValue()).e(mx21.d, (String) null), upn1.k(mx21Var.a)) ? null : mx21Var.a();
            if (ajm1VarA != null) {
                vgn0Var.c((Object) null);
                return ajm1VarA;
            }
            try {
                upl1 upl1Var = this.a;
                vpl1Var.a = vgn0Var;
                vpl1Var.b = i;
                vpl1Var.e = 2;
                Object objA = upl1Var.a(vpl1Var);
                if (objA != d9nVar) {
                    vgn0 vgn0Var4 = vgn0Var;
                    obj = objA;
                    vgn0Var2 = vgn0Var4;
                    m231Var = i1k0.A((WrappedWidgetResources) obj);
                    if (!(m231Var instanceof m231)) {
                        mx21Var.b(m231Var);
                    }
                    thA = e331.a(m231Var);
                    if (thA != null) {
                        n57.g("Failed to fetch widget resources", thA);
                    }
                    thA2 = e331.a(m231Var);
                    if (thA2 != null) {
                        m231Var = mx21Var.a();
                        if (m231Var != null) {
                            throw thA2;
                        }
                    }
                    vgn0Var2.c((Object) null);
                    return m231Var;
                }
                return d9nVar;
            } catch (Throwable th6) {
                vgn0 vgn0Var5 = vgn0Var;
                th2 = th6;
                vgn0Var2 = vgn0Var5;
                m231Var = new m231(th2);
            }
        } catch (Throwable th7) {
            vgn0 vgn0Var6 = vgn0Var;
            th = th7;
            vgn0Var2 = vgn0Var6;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
