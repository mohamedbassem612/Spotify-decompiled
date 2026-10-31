package p;

import com.spotify.promptedplaylists.artifactpage.playlistconfig.PlaylistGenerationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mmu0 implements o46, bqh1 {
    public final h3y0 a;
    public final e7y0 b;
    public final myq0 c;
    public final yeu0 d;
    public final mie0 e;
    public final u6y0 f;

    public mmu0(h3y0 h3y0Var, e7y0 e7y0Var, myq0 myq0Var, yeu0 yeu0Var, mie0 mie0Var, u6y0 u6y0Var) {
        this.a = h3y0Var;
        this.b = e7y0Var;
        this.c = myq0Var;
        this.d = yeu0Var;
        this.e = mie0Var;
        this.f = u6y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: Exception -> 0x0114, CancellationException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x011b, Exception -> 0x0114, blocks: (B:15:0x003c, B:38:0x00e5), top: B:67:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p.o46
    public final Object a(fg40 fg40Var, onm onmVar) {
        jmu0 jmu0Var;
        n8y0 n8y0Var;
        String str;
        String str2;
        boolean z;
        imu0 imu0Var;
        String str3;
        h3y0 h3y0Var;
        d9n d9nVar;
        Object objC;
        imu0 imu0Var2;
        r8y0 r8y0Var;
        ArrayList arrayList;
        String str4;
        boolean z2;
        if (onmVar instanceof jmu0) {
            jmu0Var = (jmu0) onmVar;
            int i = jmu0Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                jmu0Var.t = i - Integer.MIN_VALUE;
            } else {
                jmu0Var = new jmu0(this, onmVar);
            }
        } else {
            jmu0Var = new jmu0(this, onmVar);
        }
        jmu0 jmu0Var2 = jmu0Var;
        Object obj = jmu0Var2.h;
        int i2 = jmu0Var2.t;
        mie0 mie0Var = this.e;
        h3y0 h3y0Var2 = this.a;
        d9n d9nVar2 = d9n.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    boolean z3 = jmu0Var2.g;
                    String str5 = jmu0Var2.f;
                    n8y0Var = jmu0Var2.e;
                    String str6 = jmu0Var2.d;
                    String str7 = jmu0Var2.c;
                    h3y0Var = (h3y0) jmu0Var2.b;
                    imu0 imu0Var3 = jmu0Var2.a;
                    hm5.M(obj);
                    z = z3;
                    imu0Var = imu0Var3;
                    str3 = str6;
                    str = str5;
                    str2 = str7;
                } else if (i2 == 2) {
                    imu0Var = jmu0Var2.a;
                    hm5.M(obj);
                    objC = obj;
                    d9nVar = d9nVar2;
                    imu0Var2 = imu0Var;
                    r8y0Var = (r8y0) objC;
                    if (r8y0Var instanceof q8y0) {
                        if (r8y0Var instanceof p8y0) {
                            eg.o();
                            return null;
                        }
                        List list = ((p8y0) r8y0Var).a;
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof j4y0) {
                                arrayList.add(obj2);
                            }
                        }
                        j4y0 j4y0Var = (j4y0) o7h.s0(arrayList);
                        return j4y0Var != null ? new p46(new PlaylistGenerationException(Collections.singletonList(j4y0Var))) : new p46(new PlaylistGenerationException(list));
                    }
                    str4 = ((q8y0) r8y0Var).b;
                    if (str4 == null) {
                        return new p46(new IllegalStateException("No URI returned for playlist generation"));
                    }
                    z2 = ((q8y0) r8y0Var).c;
                    jmu0Var2.a = imu0Var2;
                    jmu0Var2.b = r8y0Var;
                    jmu0Var2.c = str4;
                    jmu0Var2.t = 3;
                    if (mie0Var.b(z2, str4, h3y0Var2, jmu0Var2) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = jmu0Var2.c;
                    r8y0Var = (r8y0) jmu0Var2.b;
                    imu0Var2 = jmu0Var2.a;
                    hm5.M(obj);
                }
                if (!((q8y0) r8y0Var).c) {
                    this.f.i.a(str4);
                }
                return new r46(new dxn0(str4, 6), imu0Var2.b);
            }
            hm5.M(obj);
            imu0 imu0Var4 = (imu0) fg40Var;
            String str8 = imu0Var4.a;
            String str9 = imu0Var4.c;
            n8y0Var = imu0Var4.g;
            boolean z4 = imu0Var4.f;
            String str10 = imu0Var4.e;
            if (str10 == null) {
                str10 = "";
            }
            jmu0Var2.a = imu0Var4;
            jmu0Var2.b = h3y0Var2;
            jmu0Var2.c = str8;
            jmu0Var2.d = str9;
            jmu0Var2.e = n8y0Var;
            jmu0Var2.f = str10;
            jmu0Var2.g = z4;
            jmu0Var2.t = 1;
            Object objC2 = mie0Var.c(jmu0Var2);
            if (objC2 == d9nVar2) {
                return d9nVar2;
            }
            str = str10;
            obj = objC2;
            str2 = str8;
            z = z4;
            imu0Var = imu0Var4;
            str3 = str9;
            h3y0Var = h3y0Var2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            nmu0 nmu0Var = imu0Var.i;
            jmu0Var2.a = imu0Var;
            jmu0Var2.b = null;
            jmu0Var2.c = null;
            jmu0Var2.d = null;
            jmu0Var2.e = null;
            jmu0Var2.f = null;
            jmu0Var2.t = 2;
            d9nVar = d9nVar2;
            objC = h3y0Var.c(str2, str3, n8y0Var, z, str, zBooleanValue, nmu0Var, jmu0Var2);
            if (objC == d9nVar) {
                return d9nVar;
            }
            imu0Var2 = imu0Var;
            r8y0Var = (r8y0) objC;
            if (r8y0Var instanceof q8y0) {
                if (r8y0Var instanceof p8y0) {
                    eg.o();
                    return null;
                }
                List list2 = ((p8y0) r8y0Var).a;
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    if (obj2 instanceof j4y0) {
                        arrayList.add(obj2);
                    }
                }
                j4y0 j4y0Var2 = (j4y0) o7h.s0(arrayList);
                if (j4y0Var2 != null) {
                }
            }
            str4 = ((q8y0) r8y0Var).b;
            if (str4 == null) {
                return new p46(new IllegalStateException("No URI returned for playlist generation"));
            }
            z2 = ((q8y0) r8y0Var).c;
            jmu0Var2.a = imu0Var2;
            jmu0Var2.b = r8y0Var;
            jmu0Var2.c = str4;
            jmu0Var2.t = 3;
            if (mie0Var.b(z2, str4, h3y0Var2, jmu0Var2) == d9nVar) {
                return d9nVar;
            }
            if (!((q8y0) r8y0Var).c) {
                this.f.i.a(str4);
            }
            return new r46(new dxn0(str4, 6), imu0Var2.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new p46(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x012e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p.bqh1
    public final Object b(fg40 fg40Var, onm onmVar) {
        lmu0 lmu0Var;
        Exception exc;
        CancellationException cancellationException;
        imu0 imu0Var;
        String str;
        String str2;
        h3y0 h3y0Var;
        String str3;
        imu0 imu0Var2;
        h2w h2wVar;
        boolean z;
        String str4;
        imu0 imu0Var3;
        if (onmVar instanceof lmu0) {
            lmu0Var = (lmu0) onmVar;
            int i = lmu0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmu0Var.i = i - Integer.MIN_VALUE;
            } else {
                lmu0Var = new lmu0(this, onmVar);
            }
        } else {
            lmu0Var = new lmu0(this, onmVar);
        }
        lmu0 lmu0Var2 = lmu0Var;
        Object objA = lmu0Var2.g;
        int i2 = lmu0Var2.i;
        mie0 mie0Var = this.e;
        h3y0 h3y0Var2 = this.a;
        u6y0 u6y0Var = this.f;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objA);
                    imu0Var = (imu0) fg40Var;
                    str = imu0Var.d;
                    if (str == null) {
                        return new p46(new IllegalStateException("No URI provided for playlist update"));
                    }
                    fg40Var = u6y0Var.i.a(str);
                    String str5 = imu0Var.a;
                    lmu0Var2.a = imu0Var;
                    lmu0Var2.b = str;
                    lmu0Var2.c = fg40Var;
                    lmu0Var2.d = h3y0Var2;
                    lmu0Var2.e = str;
                    lmu0Var2.f = str5;
                    lmu0Var2.i = 1;
                    Object objC = mie0Var.c(lmu0Var2);
                    if (objC != d9nVar) {
                        str2 = str5;
                        objA = objC;
                        h3y0Var = h3y0Var2;
                        str3 = str;
                    }
                    return d9nVar;
                }
                if (i2 == 1) {
                    String str6 = lmu0Var2.f;
                    String str7 = lmu0Var2.e;
                    h3y0 h3y0Var3 = lmu0Var2.d;
                    fg40 fg40Var2 = lmu0Var2.c;
                    String str8 = lmu0Var2.b;
                    imu0Var = lmu0Var2.a;
                    try {
                        hm5.M(objA);
                        str2 = str6;
                        fg40Var = fg40Var2;
                        str3 = str7;
                        str = str8;
                        h3y0Var = h3y0Var3;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        fg40Var = fg40Var2;
                        u6y0Var.i.b(fg40Var);
                        throw cancellationException;
                    } catch (Exception e2) {
                        exc = e2;
                        fg40Var = fg40Var2;
                        u6y0Var.i.b(fg40Var);
                        return new p46(exc);
                    }
                } else {
                    if (i2 == 2) {
                        fg40Var = lmu0Var2.c;
                        str = lmu0Var2.b;
                        imu0Var2 = lmu0Var2.a;
                        hm5.M(objA);
                        h2wVar = (h2w) objA;
                        if (h2wVar instanceof g2w) {
                            if (h2wVar instanceof f2w) {
                                u6y0Var.i.b(fg40Var);
                                return new p46(new PlaylistGenerationException(((f2w) h2wVar).a));
                            }
                            eg.o();
                            return null;
                        }
                        if (((g2w) h2wVar).b) {
                            u6y0Var.i.b(fg40Var);
                        }
                        z = ((g2w) h2wVar).b;
                        lmu0Var2.a = imu0Var2;
                        lmu0Var2.b = str;
                        lmu0Var2.c = null;
                        lmu0Var2.d = null;
                        lmu0Var2.i = 3;
                        if (mie0Var.b(z, str, h3y0Var2, lmu0Var2) != d9nVar) {
                            str4 = str;
                            imu0Var3 = imu0Var2;
                        }
                        return d9nVar;
                    }
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = lmu0Var2.b;
                    imu0Var3 = lmu0Var2.a;
                    hm5.M(objA);
                }
                return new r46(new dxn0(str4, 6), imu0Var3.b);
                imu0 imu0Var4 = imu0Var;
                boolean zBooleanValue = ((Boolean) objA).booleanValue();
                nmu0 nmu0Var = imu0Var4.i;
                lmu0Var2.a = imu0Var4;
                lmu0Var2.b = str;
                lmu0Var2.c = fg40Var;
                lmu0Var2.d = null;
                lmu0Var2.e = null;
                lmu0Var2.f = null;
                lmu0Var2.i = 2;
                objA = h3y0Var.a(str3, str2, zBooleanValue, nmu0Var, lmu0Var2);
                if (objA != d9nVar) {
                    imu0Var2 = imu0Var4;
                    h2wVar = (h2w) objA;
                    if (h2wVar instanceof g2w) {
                        if (h2wVar instanceof f2w) {
                            u6y0Var.i.b(fg40Var);
                            return new p46(new PlaylistGenerationException(((f2w) h2wVar).a));
                        }
                        eg.o();
                        return null;
                    }
                    if (((g2w) h2wVar).b) {
                        u6y0Var.i.b(fg40Var);
                    }
                    z = ((g2w) h2wVar).b;
                    lmu0Var2.a = imu0Var2;
                    lmu0Var2.b = str;
                    lmu0Var2.c = null;
                    lmu0Var2.d = null;
                    lmu0Var2.i = 3;
                    if (mie0Var.b(z, str, h3y0Var2, lmu0Var2) != d9nVar) {
                        str4 = str;
                        imu0Var3 = imu0Var2;
                        return new r46(new dxn0(str4, 6), imu0Var3.b);
                    }
                }
                return d9nVar;
            } catch (CancellationException e3) {
                cancellationException = e3;
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e6) {
            return new p46(e6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TryCatch #3 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002c, B:46:0x009e, B:48:0x00a4, B:50:0x00aa, B:52:0x00b5, B:54:0x00b9, B:56:0x00cd, B:57:0x00d2, B:58:0x00d3, B:42:0x008c), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TryCatch #3 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002c, B:46:0x009e, B:48:0x00a4, B:50:0x00aa, B:52:0x00b5, B:54:0x00b9, B:56:0x00cd, B:57:0x00d2, B:58:0x00d3, B:42:0x008c), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5 A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TryCatch #3 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002c, B:46:0x009e, B:48:0x00a4, B:50:0x00aa, B:52:0x00b5, B:54:0x00b9, B:56:0x00cd, B:57:0x00d2, B:58:0x00d3, B:42:0x008c), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TryCatch #3 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002c, B:46:0x009e, B:48:0x00a4, B:50:0x00aa, B:52:0x00b5, B:54:0x00b9, B:56:0x00cd, B:57:0x00d2, B:58:0x00d3, B:42:0x008c), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TryCatch #3 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002c, B:46:0x009e, B:48:0x00a4, B:50:0x00aa, B:52:0x00b5, B:54:0x00b9, B:56:0x00cd, B:57:0x00d2, B:58:0x00d3, B:42:0x008c), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3 A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002c, B:46:0x009e, B:48:0x00a4, B:50:0x00aa, B:52:0x00b5, B:54:0x00b9, B:56:0x00cd, B:57:0x00d2, B:58:0x00d3, B:42:0x008c), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(fg40 fg40Var, onm onmVar) throws NoWhenBranchMatchedException {
        kmu0 kmu0Var;
        g6y0 g6y0VarA;
        Object obj;
        String str;
        String str2;
        Throwable thA;
        me11 me11Var;
        if (onmVar instanceof kmu0) {
            kmu0Var = (kmu0) onmVar;
            int i = kmu0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmu0Var.e = i - Integer.MIN_VALUE;
            } else {
                kmu0Var = new kmu0(this, onmVar);
            }
        } else {
            kmu0Var = new kmu0(this, onmVar);
        }
        Object obj2 = kmu0Var.c;
        int i2 = kmu0Var.e;
        u6y0 u6y0Var = this.f;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        str2 = kmu0Var.a;
                        hm5.M(obj2);
                        return new r46(new dxn0(str2, 6), null);
                    }
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g6y0VarA = kmu0Var.b;
                    str = kmu0Var.a;
                    hm5.M(obj2);
                    obj = ((e331) obj2).a;
                    thA = e331.a(obj);
                    if (thA == null) {
                        u6y0Var.i.b(g6y0VarA);
                        return new p46(thA);
                    }
                    me11Var = (me11) obj;
                    if (me11Var instanceof le11) {
                        return new r46(new dxn0(str, 6), null);
                    }
                    if (me11Var instanceof ke11) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u6y0Var.i.b(g6y0VarA);
                    return new p46(new PlaylistGenerationException(((ke11) me11Var).a));
                }
                hm5.M(obj2);
                imu0 imu0Var = (imu0) fg40Var;
                String str3 = imu0Var.d;
                if (str3 == null) {
                    return new p46(new IllegalStateException("No URI provided for template generation"));
                }
                boolean z = imu0Var.h;
                h3y0 h3y0Var = this.a;
                d9n d9nVar = d9n.a;
                if (z) {
                    mie0 mie0Var = this.e;
                    kmu0Var.a = str3;
                    kmu0Var.e = 1;
                    if (mie0Var.b(true, str3, h3y0Var, kmu0Var) != d9nVar) {
                        str2 = str3;
                        return new r46(new dxn0(str2, 6), null);
                    }
                } else {
                    g6y0VarA = u6y0Var.i.a(str3);
                    o8y0 o8y0Var = o8y0.a;
                    kmu0Var.a = str3;
                    kmu0Var.b = g6y0VarA;
                    kmu0Var.e = 2;
                    Object objE = h3y0Var.e(str3, o8y0Var, kmu0Var);
                    if (objE != d9nVar) {
                        obj = objE;
                        str = str3;
                        thA = e331.a(obj);
                        if (thA == null) {
                            u6y0Var.i.b(g6y0VarA);
                            return new p46(thA);
                        }
                        me11Var = (me11) obj;
                        if (me11Var instanceof le11) {
                            return new r46(new dxn0(str, 6), null);
                        }
                        if (me11Var instanceof ke11) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u6y0Var.i.b(g6y0VarA);
                        return new p46(new PlaylistGenerationException(((ke11) me11Var).a));
                    }
                }
                return d9nVar;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new p46(e2);
            }
        } catch (CancellationException e3) {
            u6y0Var.i.b(this);
            throw e3;
        } catch (Exception e4) {
            u6y0Var.i.b(this);
            return new p46(e4);
        }
    }
}
