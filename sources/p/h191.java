package p;

import androidx.datastore.core.CorruptionException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h191 implements r4r {
    public static final LinkedHashSet j = new LinkedHashSet();
    public static final Object k = new Object();
    public final Function0 a;
    public final e761 b;
    public final k9n c;
    public final m441 d = h4p1.l(new k53(this, null, 27));
    public final String e = ".tmp";
    public final idd1 f = new idd1(new fe81(this, (byte) 10));
    public final bpb1 g = gio1.b(eeh1.a);
    public List h;
    public final y441 i;

    public h191(Function0 function0, e761 e761Var, List list, k9n k9nVar, c9n c9nVar) {
        this.a = function0;
        this.b = e761Var;
        this.c = k9nVar;
        this.h = o7h.l1(list);
        this.i = new y441(c9nVar, new d781(this, (byte) 17), new w621(this, (lnm) null, (byte) 7));
    }

    @Override // p.r4r
    public final Object a(vu30 vu30Var, lnm lnmVar) {
        ayh ayhVarA = sap1.a();
        this.i.s(new t091(vu30Var, ayhVarA, (mob1) this.g.getValue(), lnmVar.getContext()));
        return ayhVarA.Q(lnmVar);
    }

    public final File b() {
        return (File) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r9 == r6) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.t091 r10, p.onm r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p.x091
            if (r0 == 0) goto L13
            r0 = r11
            p.x091 r0 = (p.x091) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.x091 r0 = new p.x091
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L36
        L2a:
            java.lang.Object r9 = r0.a
            p.zxh r9 = (p.zxh) r9
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L33
            goto Lba
        L33:
            r10 = move-exception
            goto Lb5
        L36:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r2
        L3c:
            p.ayh r9 = r0.c
            p.h191 r10 = r0.b
            java.lang.Object r1 = r0.a
            p.t091 r1 = (p.t091) r1
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L33
            r11 = r9
            r9 = r10
            r10 = r1
            goto L8e
        L4b:
            p.hm5.M(r11)
            p.ayh r11 = r10.b
            p.bpb1 r1 = r9.g     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L6f
            p.mob1 r1 = (p.mob1) r1     // Catch: java.lang.Throwable -> L6f
            boolean r7 = r1 instanceof p.kwq     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L72
            p.vu30 r1 = r10.a     // Catch: java.lang.Throwable -> L6f
            p.o8n r10 = r10.d     // Catch: java.lang.Throwable -> L6f
            r0.a = r11     // Catch: java.lang.Throwable -> L6f
            r0.f = r5     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r9 = r9.i(r1, r10, r0)     // Catch: java.lang.Throwable -> L6f
            if (r9 != r6) goto L6b
            goto La0
        L6b:
            r8 = r11
            r11 = r9
            r9 = r8
            goto Lba
        L6f:
            r10 = move-exception
            r9 = r11
            goto Lb5
        L72:
            boolean r7 = r1 instanceof p.xa01     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L77
            goto L79
        L77:
            boolean r5 = r1 instanceof p.eeh1     // Catch: java.lang.Throwable -> L6f
        L79:
            if (r5 == 0) goto La6
            p.mob1 r5 = r10.c     // Catch: java.lang.Throwable -> L6f
            if (r1 != r5) goto La1
            r0.a = r10     // Catch: java.lang.Throwable -> L6f
            r0.b = r9     // Catch: java.lang.Throwable -> L6f
            r0.c = r11     // Catch: java.lang.Throwable -> L6f
            r0.f = r4     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r9.e(r0)     // Catch: java.lang.Throwable -> L6f
            if (r1 != r6) goto L8e
            goto La0
        L8e:
            p.vu30 r1 = r10.a     // Catch: java.lang.Throwable -> L6f
            p.o8n r10 = r10.d     // Catch: java.lang.Throwable -> L6f
            r0.a = r11     // Catch: java.lang.Throwable -> L6f
            r0.b = r2     // Catch: java.lang.Throwable -> L6f
            r0.c = r2     // Catch: java.lang.Throwable -> L6f
            r0.f = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r9 = r9.i(r1, r10, r0)     // Catch: java.lang.Throwable -> L6f
            if (r9 != r6) goto L6b
        La0:
            return r6
        La1:
            p.xa01 r1 = (p.xa01) r1     // Catch: java.lang.Throwable -> L6f
            java.lang.Throwable r9 = r1.a     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        La6:
            boolean r9 = r1 instanceof p.zf20     // Catch: java.lang.Throwable -> L6f
            if (r9 == 0) goto Laf
            p.zf20 r1 = (p.zf20) r1     // Catch: java.lang.Throwable -> L6f
            java.lang.Throwable r9 = r1.a     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        Laf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L6f
            r9.<init>()     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        Lb5:
            p.m231 r11 = new p.m231
            r11.<init>(r10)
        Lba:
            p.sap1.d(r9, r11)
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h191.c(p.t091, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00ce->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) throws CorruptionException, FileNotFoundException {
        y091 y091Var;
        vgn0 vgn0VarA;
        h191 h191Var;
        p811 p811Var;
        p811 p811Var2;
        l811 l811Var;
        Iterator it;
        vgn0 vgn0Var;
        h191 h191Var2;
        p811 p811Var3;
        a191 a191Var;
        h191 h191Var3;
        l811 l811Var2;
        vgn0 vgn0Var2;
        p811 p811Var4;
        vu30 vu30Var;
        Object obj;
        int iHashCode;
        if (onmVar instanceof y091) {
            y091Var = (y091) onmVar;
            int i = y091Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                y091Var.i = i - Integer.MIN_VALUE;
            } else {
                y091Var = new y091(this, onmVar);
            }
        } else {
            y091Var = new y091(this, onmVar);
        }
        Object obj2 = y091Var.g;
        int i2 = y091Var.i;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            bpb1 bpb1Var = this.g;
            if (!u890.j(bpb1Var.getValue(), eeh1.a) && !(bpb1Var.getValue() instanceof xa01)) {
                eg.m("Check failed.");
                return null;
            }
            vgn0VarA = ygn0.a();
            p811 p811Var5 = new p811();
            y091Var.a = this;
            y091Var.b = vgn0VarA;
            y091Var.c = p811Var5;
            y091Var.d = p811Var5;
            y091Var.i = 1;
            Object objH = h(y091Var);
            if (objH != d9nVar) {
                h191Var = this;
                p811Var = p811Var5;
                obj2 = objH;
                p811Var2 = p811Var;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            p811Var = (p811) y091Var.d;
            p811Var2 = (p811) y091Var.c;
            vgn0VarA = (vgn0) y091Var.b;
            h191Var = y091Var.a;
            hm5.M(obj2);
        } else {
            if (i2 == 2) {
                it = y091Var.f;
                a191Var = y091Var.e;
                l811Var = (l811) y091Var.d;
                p811Var3 = (p811) y091Var.c;
                vgn0Var = (vgn0) y091Var.b;
                h191Var2 = y091Var.a;
                hm5.M(obj2);
                while (it.hasNext()) {
                    vu30Var = (vu30) it.next();
                    y091Var.a = h191Var2;
                    y091Var.b = vgn0Var;
                    y091Var.c = p811Var3;
                    y091Var.d = l811Var;
                    y091Var.e = a191Var;
                    y091Var.f = it;
                    y091Var.i = 2;
                    if (vu30Var.invoke(a191Var, y091Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                l811Var2 = l811Var;
                vgn0Var2 = vgn0Var;
                h191Var3 = h191Var2;
                h191Var3.h = null;
                y091Var.a = h191Var3;
                y091Var.b = p811Var3;
                y091Var.c = l811Var2;
                y091Var.d = vgn0Var2;
                y091Var.e = null;
                y091Var.f = null;
                y091Var.i = 3;
                if (vgn0Var2.a(y091Var) != d9nVar) {
                    p811Var4 = p811Var3;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vgn0Var2 = (vgn0) y091Var.d;
            l811Var2 = (l811) y091Var.c;
            p811Var4 = (p811) y091Var.b;
            h191Var3 = y091Var.a;
            hm5.M(obj2);
        }
        try {
            l811Var2.a = true;
            vgn0Var2.c((Object) null);
            bpb1 bpb1Var2 = h191Var3.g;
            obj = p811Var4.a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            kwq kwqVar = new kwq(obj, iHashCode);
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, kwqVar);
            return rih1.a;
        } catch (Throwable th) {
            vgn0Var2.c((Object) null);
            throw th;
        }
        p811Var.a = obj2;
        l811 l811Var3 = new l811();
        a191 a191Var2 = new a191(vgn0VarA, l811Var3, p811Var2, h191Var);
        List list = h191Var.h;
        if (list == null) {
            h191Var3 = h191Var;
            p811Var3 = p811Var2;
            l811Var2 = l811Var3;
            vgn0Var2 = vgn0VarA;
        } else {
            vgn0 vgn0Var3 = vgn0VarA;
            l811Var = l811Var3;
            it = list.iterator();
            vgn0Var = vgn0Var3;
            h191Var2 = h191Var;
            p811Var3 = p811Var2;
            a191Var = a191Var2;
            while (it.hasNext()) {
                vu30Var = (vu30) it.next();
                y091Var.a = h191Var2;
                y091Var.b = vgn0Var;
                y091Var.c = p811Var3;
                y091Var.d = l811Var;
                y091Var.e = a191Var;
                y091Var.f = it;
                y091Var.i = 2;
                if (vu30Var.invoke(a191Var, y091Var) == d9nVar) {
                    return d9nVar;
                }
            }
            l811Var2 = l811Var;
            vgn0Var2 = vgn0Var;
            h191Var3 = h191Var2;
        }
        h191Var3.h = null;
        y091Var.a = h191Var3;
        y091Var.b = p811Var3;
        y091Var.c = l811Var2;
        y091Var.d = vgn0Var2;
        y091Var.e = null;
        y091Var.f = null;
        y091Var.i = 3;
        if (vgn0Var2.a(y091Var) != d9nVar) {
            p811Var4 = p811Var3;
            l811Var2.a = true;
            vgn0Var2.c((Object) null);
            bpb1 bpb1Var3 = h191Var3.g;
            obj = p811Var4.a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            kwq kwqVar2 = new kwq(obj, iHashCode);
            bpb1Var3.getClass();
            bpb1Var3.m((Object) null, kwqVar2);
            return rih1.a;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        b191 b191Var;
        if (onmVar instanceof b191) {
            b191Var = (b191) onmVar;
            int i = b191Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b191Var.d = i - Integer.MIN_VALUE;
            } else {
                b191Var = new b191(this, onmVar);
            }
        } else {
            b191Var = new b191(this, onmVar);
        }
        Object obj = b191Var.b;
        int i2 = b191Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                b191Var.a = this;
                b191Var.d = 1;
                Object objD = d(b191Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h191 h191Var = b191Var.a;
                hm5.M(obj);
            }
            this = rih1.a;
            return this;
        } catch (Throwable th) {
            bpb1 bpb1Var = this.g;
            xa01 xa01Var = new xa01(th);
            bpb1Var.getClass();
            bpb1Var.m((Object) null, xa01Var);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        c191 c191Var;
        if (onmVar instanceof c191) {
            c191Var = (c191) onmVar;
            int i = c191Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c191Var.d = i - Integer.MIN_VALUE;
            } else {
                c191Var = new c191(this, onmVar);
            }
        } else {
            c191Var = new c191(this, onmVar);
        }
        Object obj = c191Var.b;
        int i2 = c191Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                c191Var.a = this;
                c191Var.d = 1;
                Object objD = d(c191Var);
                d9n d9nVar = d9n.a;
                this = objD;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h191 h191Var = c191Var.a;
                hm5.M(obj);
                this = h191Var;
            }
        } catch (Throwable th) {
            bpb1 bpb1Var = this.g;
            xa01 xa01Var = new xa01(th);
            bpb1Var.getClass();
            bpb1Var.m((Object) null, xa01Var);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [p.h191] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.d191] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.h191] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final Object g(onm onmVar) throws FileNotFoundException {
        ?? d191Var;
        FileInputStream fileInputStream;
        Throwable th;
        if (onmVar instanceof d191) {
            d191 d191Var2 = (d191) onmVar;
            int i = d191Var2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d191Var2.e = i - Integer.MIN_VALUE;
                d191Var = d191Var2;
            } else {
                d191Var = new d191(this, onmVar);
            }
        } else {
            d191Var = new d191(this, onmVar);
        }
        Object obj = d191Var.c;
        int i2 = d191Var.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileInputStream = d191Var.b;
                d191Var = d191Var.a;
                try {
                    hm5.M(obj);
                    u890.p(fileInputStream, (Throwable) null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        u890.p(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            hm5.M(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(b());
                try {
                    e761 e761Var = this.b;
                    d191Var.a = this;
                    d191Var.b = fileInputStream2;
                    d191Var.e = 1;
                    Object objB = e761Var.b(fileInputStream2);
                    d9n d9nVar = d9n.a;
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = objB;
                    u890.p(fileInputStream, (Throwable) null);
                    return obj;
                } catch (Throwable th4) {
                    d191Var = this;
                    fileInputStream = fileInputStream2;
                    th = th4;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                d191Var = this;
                e = e;
                if (d191Var.b().exists()) {
                    throw e;
                }
                return d191Var.b.a();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    @Override // p.r4r
    public final mr20 getData() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(onm onmVar) throws CorruptionException, FileNotFoundException {
        e191 e191Var;
        h191 h191Var;
        CorruptionException corruptionException;
        CorruptionException corruptionException2;
        IOException e;
        if (onmVar instanceof e191) {
            e191Var = (e191) onmVar;
            int i = e191Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e191Var.e = i - Integer.MIN_VALUE;
            } else {
                e191Var = new e191(this, onmVar);
            }
        } else {
            e191Var = new e191(this, onmVar);
        }
        Object obj = e191Var.c;
        int i2 = e191Var.e;
        d9n d9nVar = d9n.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                if (i2 == 2) {
                    corruptionException = (CorruptionException) e191Var.b;
                    h191Var = (h191) e191Var.a;
                    hm5.M(obj);
                    try {
                        e191Var.a = corruptionException;
                        e191Var.b = obj;
                        e191Var.e = 3;
                        if (h191Var.j(obj, e191Var) != d9nVar) {
                            return obj;
                        }
                    } catch (IOException e2) {
                        corruptionException2 = corruptionException;
                        e = e2;
                    }
                } else {
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = e191Var.b;
                    corruptionException2 = (CorruptionException) e191Var.a;
                    try {
                        hm5.M(obj);
                        return obj2;
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                j2h1.h(corruptionException2, e);
                throw corruptionException2;
            }
            hm5.M(obj);
            e191Var.a = this;
            e191Var.e = 1;
            Object objG = g(e191Var);
            if (objG != d9nVar) {
                return objG;
            }
        } catch (CorruptionException e4) {
            k9n k9nVar = this.c;
            e191Var.a = this;
            e191Var.b = e4;
            e191Var.e = 2;
            Object objD = k9nVar.d(e4);
            if (objD != d9nVar) {
                h191Var = this;
                corruptionException = e4;
                obj = objD;
            }
            return d9nVar;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(vu30 vu30Var, o8n o8nVar, onm onmVar) {
        f191 f191Var;
        kwq kwqVar;
        h191 h191Var;
        Object obj;
        h191 h191Var2;
        Object obj2;
        if (onmVar instanceof f191) {
            f191Var = (f191) onmVar;
            int i = f191Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                f191Var.f = i - Integer.MIN_VALUE;
            } else {
                f191Var = new f191(this, onmVar);
            }
        } else {
            f191Var = new f191(this, onmVar);
        }
        Object obj3 = f191Var.d;
        int i2 = f191Var.f;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = f191Var.c;
                kwqVar = (kwq) f191Var.b;
                h191Var = f191Var.a;
                hm5.M(obj3);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = f191Var.b;
                h191Var2 = f191Var.a;
                hm5.M(obj3);
            }
            bpb1 bpb1Var = h191Var2.g;
            kwq kwqVar2 = new kwq(obj2, obj2 != null ? obj2.hashCode() : 0);
            bpb1Var.getClass();
            bpb1Var.m((Object) null, kwqVar2);
            return obj2;
        }
        hm5.M(obj3);
        kwq kwqVar3 = (kwq) this.g.getValue();
        Object obj4 = kwqVar3.a;
        if ((obj4 != null ? obj4.hashCode() : 0) != kwqVar3.b) {
            eg.m("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        Object obj5 = kwqVar3.a;
        dt40 dt40Var = new dt40(vu30Var, obj5, (lnm) null);
        f191Var.a = this;
        f191Var.b = kwqVar3;
        f191Var.c = obj5;
        f191Var.f = 1;
        Object objH = c921.H(o8nVar, dt40Var, f191Var);
        if (objH != d9nVar) {
            obj3 = objH;
            kwqVar = kwqVar3;
            h191Var = this;
            obj = obj5;
        }
        return d9nVar;
        Object obj6 = kwqVar.a;
        if ((obj6 != null ? obj6.hashCode() : 0) != kwqVar.b) {
            eg.m("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (u890.j(obj, obj3)) {
            return obj;
        }
        f191Var.a = h191Var;
        f191Var.b = obj3;
        f191Var.c = null;
        f191Var.f = 2;
        if (h191Var.j(obj3, f191Var) != d9nVar) {
            h191Var2 = h191Var;
            obj2 = obj3;
            bpb1 bpb1Var2 = h191Var2.g;
            kwq kwqVar4 = new kwq(obj2, obj2 != null ? obj2.hashCode() : 0);
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, kwqVar4);
            return obj2;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(Object obj, onm onmVar) throws IOException {
        g191 g191Var;
        File file;
        FileOutputStream fileOutputStream;
        h191 h191Var;
        FileOutputStream fileOutputStream2;
        if (onmVar instanceof g191) {
            g191Var = (g191) onmVar;
            int i = g191Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                g191Var.g = i - Integer.MIN_VALUE;
            } else {
                g191Var = new g191(this, onmVar);
            }
        } else {
            g191Var = new g191(this, onmVar);
        }
        Object obj2 = g191Var.e;
        int i2 = g191Var.g;
        d9n d9nVar = rih1.a;
        if (i2 == 0) {
            hm5.M(obj2);
            File fileB = b();
            File parentFile = fileB.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    k220.i(u890.A(fileB, "Unable to create parent directories of "));
                    return null;
                }
            }
            file = new File(u890.A(this.e, b().getAbsolutePath()));
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    e761 e761Var = this.b;
                    v091 v091Var = new v091(fileOutputStream3);
                    g191Var.a = this;
                    g191Var.b = file;
                    g191Var.c = fileOutputStream3;
                    g191Var.d = fileOutputStream3;
                    g191Var.g = 1;
                    e761Var.c(obj, v091Var);
                    d9n d9nVar2 = d9n.a;
                    if (d9nVar == d9nVar2) {
                        return d9nVar2;
                    }
                    h191Var = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } catch (IOException e) {
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = g191Var.d;
            fileOutputStream = g191Var.c;
            file = g191Var.b;
            h191Var = g191Var.a;
            try {
                hm5.M(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    u890.p(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        u890.p(fileOutputStream, (Throwable) null);
        if (file.renameTo(h191Var.b())) {
            return d9nVar;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }
}
