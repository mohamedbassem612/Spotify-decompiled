package p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c4k {
    public final String a;
    public final xgn0 b = ygn0.a();
    public final bpb1 c = gio1.b(g3k.a);

    public c4k(String str) {
        this.a = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(onm onmVar) throws Throwable {
        a4k a4kVar;
        a4k a4kVar2;
        int i;
        a4k a4kVar3;
        Exception e;
        if (onmVar instanceof a4k) {
            a4kVar = (a4k) onmVar;
            int i2 = a4kVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4kVar.e = i2 - Integer.MIN_VALUE;
            } else {
                a4kVar = new a4k(this, onmVar);
            }
        } else {
            a4kVar = new a4k(this, onmVar);
        }
        Object obj = a4kVar.c;
        int i3 = a4kVar.e;
        g3k g3kVar = g3k.a;
        bpb1 bpb1Var = this.c;
        d9n d9nVar = d9n.a;
        try {
            try {
                try {
                    if (i3 == 0) {
                        hm5.M(obj);
                        a4kVar2 = this.b;
                        a4kVar.a = a4kVar2;
                        a4kVar.b = 0;
                        a4kVar.e = 1;
                        if (a4kVar2.a(a4kVar) != d9nVar) {
                            i = 0;
                        }
                        return d9nVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a4kVar3 = a4kVar.a;
                        try {
                            hm5.M(obj);
                        } catch (Exception e2) {
                            e = e2;
                            Logger.e(e, "Error disposing composition for story: ".concat(this.a), new Object[0]);
                        }
                        bpb1Var.m((Object) null, g3kVar);
                        a4kVar2 = a4kVar3;
                        rih1 rih1Var = rih1.a;
                        a4kVar2.c((Object) null);
                        return rih1Var;
                    }
                    i = a4kVar.b;
                    a4k a4kVar4 = a4kVar.a;
                    hm5.M(obj);
                    a4kVar2 = a4kVar4;
                    Logger.e(e, "Error disposing composition for story: ".concat(this.a), new Object[0]);
                    bpb1Var.m((Object) null, g3kVar);
                    a4kVar2 = a4kVar3;
                    rih1 rih1Var2 = rih1.a;
                    a4kVar2.c((Object) null);
                    return rih1Var2;
                    i3k i3kVar = (i3k) bpb1Var.getValue();
                    if (i3kVar instanceof h3k) {
                        bpb1Var.m((Object) null, c3k.a);
                        try {
                            wj41 wj41Var = ((h3k) i3kVar).a;
                            a4kVar.a = a4kVar2;
                            a4kVar.b = i;
                            a4kVar.e = 2;
                            if (wj41Var.b(a4kVar) != d9nVar) {
                                a4kVar3 = a4kVar2;
                                bpb1Var.m((Object) null, g3kVar);
                                a4kVar2 = a4kVar3;
                            }
                            return d9nVar;
                        } catch (Exception e3) {
                            a4kVar3 = a4kVar2;
                            e = e3;
                            Logger.e(e, "Error disposing composition for story: ".concat(this.a), new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            bpb1Var.m((Object) null, g3kVar);
                            throw th;
                        }
                    }
                    rih1 rih1Var3 = rih1.a;
                    a4kVar2.c((Object) null);
                    return rih1Var3;
                } catch (Throwable th2) {
                    th = th2;
                    a4kVar2.c((Object) null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                a4kVar2 = a4kVar;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:51:0x00c3, B:76:0x010b, B:55:0x00ce, B:59:0x00e3, B:61:0x00e8, B:64:0x00ed, B:66:0x00f1, B:75:0x0105, B:67:0x00f4, B:69:0x00f8, B:72:0x00fd, B:73:0x0100, B:74:0x0103), top: B:83:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0103 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:51:0x00c3, B:76:0x010b, B:55:0x00ce, B:59:0x00e3, B:61:0x00e8, B:64:0x00ed, B:66:0x00f1, B:75:0x0105, B:67:0x00f4, B:69:0x00f8, B:72:0x00fd, B:73:0x0100, B:74:0x0103), top: B:83:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(i24 i24Var, onm onmVar) throws Throwable {
        b4k b4kVar;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        vgn0 vgn0Var3;
        int i2;
        wj41 wj41Var;
        wj41 wj41Var2;
        Throwable cause;
        d3k d3kVar;
        if (onmVar instanceof b4k) {
            b4kVar = (b4k) onmVar;
            int i3 = b4kVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b4kVar.h = i3 - Integer.MIN_VALUE;
            } else {
                b4kVar = new b4k(this, onmVar);
            }
        } else {
            b4kVar = new b4k(this, onmVar);
        }
        Object obj = b4kVar.f;
        int i4 = b4kVar.h;
        bpb1 bpb1Var = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(obj);
                b4kVar.a = i24Var;
                vgn0Var = this.b;
                b4kVar.b = vgn0Var;
                b4kVar.d = 0;
                b4kVar.h = 1;
                if (vgn0Var.a(b4kVar) != d9nVar) {
                    i = 0;
                }
                return d9nVar;
            }
            if (i4 == 1) {
                int i5 = b4kVar.d;
                vgn0 vgn0Var4 = b4kVar.b;
                i24 i24Var2 = b4kVar.a;
                hm5.M(obj);
                vgn0Var = vgn0Var4;
                i = i5;
                i24Var = i24Var2;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wj41Var2 = b4kVar.c;
                    vgn0Var2 = b4kVar.b;
                    try {
                        try {
                            hm5.M(obj);
                            bpb1Var.m((Object) null, new h3k(wj41Var2));
                        } catch (Exception e) {
                            e = e;
                            Logger.e(e, "Error initializing composition for story: ".concat(this.a), new Object[0]);
                            cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            if (e instanceof SocketTimeoutException) {
                                d3kVar = d3k.b;
                            } else {
                                d3kVar = d3k.b;
                            }
                            bpb1Var.m((Object) null, new e3k(d3kVar));
                        }
                        rih1 rih1Var = rih1.a;
                        vgn0Var2.c((Object) null);
                        return rih1Var;
                    } catch (Throwable th) {
                        th = th;
                        vgn0Var2.c((Object) null);
                        throw th;
                    }
                }
                i2 = b4kVar.e;
                i = b4kVar.d;
                vgn0Var3 = b4kVar.b;
                try {
                    hm5.M(obj);
                    wj41Var = (wj41) obj;
                    b4kVar.a = null;
                    b4kVar.b = vgn0Var3;
                    b4kVar.c = wj41Var;
                    b4kVar.d = i;
                    b4kVar.e = i2;
                    b4kVar.h = 3;
                    if (wj41Var.c(b4kVar) != d9nVar) {
                        wj41Var2 = wj41Var;
                        vgn0Var2 = vgn0Var3;
                        bpb1Var.m((Object) null, new h3k(wj41Var2));
                        rih1 rih1Var2 = rih1.a;
                        vgn0Var2.c((Object) null);
                        return rih1Var2;
                    }
                    return d9nVar;
                } catch (Exception e2) {
                    e = e2;
                    vgn0Var2 = vgn0Var3;
                    Logger.e(e, "Error initializing composition for story: ".concat(this.a), new Object[0]);
                    cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    if (e instanceof SocketTimeoutException) {
                        d3kVar = d3k.b;
                    } else {
                        d3kVar = d3k.b;
                    }
                    bpb1Var.m((Object) null, new e3k(d3kVar));
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2 = vgn0Var3;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            i3k i3kVar = (i3k) bpb1Var.getValue();
            if (u890.j(i3kVar, g3k.a) || (i3kVar instanceof e3k)) {
                bpb1Var.m((Object) null, f3k.a);
                try {
                    b4kVar.a = null;
                    b4kVar.b = vgn0Var;
                    b4kVar.d = i;
                    b4kVar.e = 0;
                    b4kVar.h = 2;
                    Object objInvoke = i24Var.invoke(b4kVar);
                    if (objInvoke != d9nVar) {
                        vgn0Var3 = vgn0Var;
                        obj = objInvoke;
                        i2 = 0;
                        wj41Var = (wj41) obj;
                        b4kVar.a = null;
                        b4kVar.b = vgn0Var3;
                        b4kVar.c = wj41Var;
                        b4kVar.d = i;
                        b4kVar.e = i2;
                        b4kVar.h = 3;
                        if (wj41Var.c(b4kVar) != d9nVar) {
                            wj41Var2 = wj41Var;
                            vgn0Var2 = vgn0Var3;
                            bpb1Var.m((Object) null, new h3k(wj41Var2));
                        }
                    }
                    return d9nVar;
                } catch (Exception e3) {
                    e = e3;
                    vgn0Var2 = vgn0Var;
                    Logger.e(e, "Error initializing composition for story: ".concat(this.a), new Object[0]);
                    cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    if ((e instanceof SocketTimeoutException) || (e instanceof TimeoutException)) {
                        d3kVar = d3k.b;
                    } else if (e instanceof IOException) {
                        d3kVar = d3k.a;
                    } else {
                        d3kVar = ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? d3k.d : d3k.e;
                    }
                    bpb1Var.m((Object) null, new e3k(d3kVar));
                }
            } else {
                vgn0Var2 = vgn0Var;
            }
            rih1 rih1Var3 = rih1.a;
            vgn0Var2.c((Object) null);
            return rih1Var3;
        } catch (Throwable th3) {
            th = th3;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
