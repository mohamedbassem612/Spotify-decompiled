package p;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gw91 {
    public final iu30 a;
    public boolean c;
    public iv91 h;
    public fw91 i;
    public final AtomicReference b = new AtomicReference(null);
    public final m6 d = new m6(this, 1);
    public final z94 e = new z94(this, 5);
    public final bfn0 f = new bfn0(0, new fw91[16]);
    public final Object g = new Object();
    public long j = -1;

    public gw91(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final void a() {
        synchronized (this.g) {
            bfn0 bfn0Var = this.f;
            Object[] objArr = bfn0Var.a;
            int i = bfn0Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                fw91 fw91Var = (fw91) objArr[i2];
                fw91Var.e.a();
                fw91Var.f.a();
                fw91Var.l.a();
                fw91Var.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x008e, LOOP:1: B:14:0x002d->B:26:0x0074, LOOP_END, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:14:0x002d->B:26:0x0074], SYNTHETIC] */
    public final void b(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                bfn0 bfn0Var = this.f;
                int i2 = bfn0Var.c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = bfn0Var.a;
                    if (i3 < i2) {
                        fw91 fw91Var = (fw91) objArr[i3];
                        sdn0 sdn0Var = (sdn0) fw91Var.f.k(obj);
                        if (sdn0Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = sdn0Var.b;
                            int[] iArr = sdn0Var.c;
                            long[] jArr = sdn0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                fw91Var.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!fw91Var.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = bfn0Var.a;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        f46.e0(objArr, (te70) null, i10, i2);
                        bfn0Var.c = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean c() throws KotlinNothingValueException {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                objSubList = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        g0k.b("Unexpected notification");
                        jah.d();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                }
                if (us71.n(atomicReference, obj, objSubList)) {
                    set = set2;
                    break;
                }
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                bfn0 bfn0Var = this.f;
                Object[] objArr = bfn0Var.a;
                int i = bfn0Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((fw91) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Object obj, iu30 iu30Var, Function0 function0) {
        bfn0 bfn0Var;
        Object obj2;
        fw91 fw91Var;
        boolean z;
        fw91 fw91Var2;
        long j;
        long j2;
        fw91 fw91Var3;
        jv91 cog1Var;
        long j3;
        sdn0 sdn0Var;
        int i;
        long j4;
        sdn0 sdn0Var2;
        long jK = t8p1.k();
        synchronized (this.g) {
            bfn0Var = this.f;
            Object[] objArr = bfn0Var.a;
            int i2 = bfn0Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((fw91) obj2).a == iu30Var) {
                    break;
                } else {
                    i3++;
                }
            }
            fw91Var = (fw91) obj2;
            z = true;
            if (fw91Var == null) {
                w0h1.o(1, iu30Var);
                fw91Var = new fw91(iu30Var);
                bfn0Var.b(fw91Var);
            }
            fw91Var2 = this.i;
            j = this.j;
        }
        Object obj3 = bfn0Var;
        if (j != -1 && j != jK) {
            obj3 = bfn0Var;
            String strL = t8p1.l();
            StringBuilder sbS = cy30.s(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbS.append(jK);
            sbS.append(", name=");
            sbS.append(strL);
            sbS.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            bmv0.a(sbS.toString());
            obj3 = sbS;
        }
        try {
            obj3 = bfn0Var;
            synchronized (this.g) {
                try {
                    this.i = fw91Var;
                    this.j = jK;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            z94 z94Var = this.e;
            Object obj4 = fw91Var.b;
            sdn0 sdn0Var3 = fw91Var.c;
            int i4 = fw91Var.d;
            fw91Var.b = obj;
            fw91Var.c = (sdn0) fw91Var.f.g(obj);
            if (fw91Var.d == -1) {
                fw91Var.d = Long.hashCode(pv91.h().g());
            }
            ew91 ew91Var = fw91Var.i;
            bfn0 bfn0VarK = xto.k();
            try {
                bfn0VarK.b(ew91Var);
                if (z94Var == null) {
                    function0.invoke();
                    fw91Var3 = fw91Var;
                } else {
                    jv91 jv91Var = (jv91) pv91.b.e();
                    if (jv91Var instanceof cog1) {
                        fw91Var3 = fw91Var;
                        if (((cog1) jv91Var).t == t8p1.k()) {
                            iu30 iu30Var2 = ((cog1) jv91Var).r;
                            iu30 iu30Var3 = ((cog1) jv91Var).s;
                            try {
                                ((cog1) jv91Var).r = pv91.i(z94Var, iu30Var2, true);
                                ((cog1) jv91Var).s = iu30Var3;
                                function0.invoke();
                                ((cog1) jv91Var).r = iu30Var2;
                                ((cog1) jv91Var).s = iu30Var3;
                            } catch (Throwable th2) {
                                ((cog1) jv91Var).r = iu30Var2;
                                ((cog1) jv91Var).s = iu30Var3;
                                throw th2;
                            }
                        }
                    } else {
                        fw91Var3 = fw91Var;
                    }
                    if (jv91Var == null || (jv91Var instanceof ten0)) {
                        cog1Var = new cog1(jv91Var instanceof ten0 ? (ten0) jv91Var : null, z94Var, null, true, false);
                    } else {
                        cog1Var = jv91Var.u(z94Var);
                    }
                    try {
                        jv91 jv91VarJ = cog1Var.j();
                        try {
                            function0.invoke();
                            jv91.q(jv91VarJ);
                            cog1Var.c();
                        } catch (Throwable th3) {
                            try {
                                jv91.q(jv91VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    cog1Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    bfn0VarK.l(bfn0VarK.c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                bfn0VarK.l(bfn0VarK.c - 1);
                fw91 fw91Var4 = fw91Var3;
                Object obj5 = fw91Var4.b;
                obj5.getClass();
                int i5 = fw91Var4.d;
                sdn0 sdn0Var4 = fw91Var4.c;
                if (sdn0Var4 != null) {
                    try {
                        long[] jArr = sdn0Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                sdn0 sdn0Var5 = sdn0Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            sdn0Var2 = sdn0Var5;
                                            Object obj6 = sdn0Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = sdn0Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    fw91Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    sdn0Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = fw91Var2;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            sdn0Var2 = sdn0Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        sdn0Var5 = sdn0Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    sdn0Var = sdn0Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    sdn0Var = sdn0Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                sdn0Var4 = sdn0Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = fw91Var2;
                            this.j = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                fw91Var4.b = obj4;
                fw91Var4.c = sdn0Var3;
                fw91Var4.d = i4;
                synchronized (this.g) {
                    this.i = fw91Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void e() {
        this.h = ekb.A(this.d);
    }

    public final void f() {
        iv91 iv91Var = this.h;
        if (iv91Var != null) {
            iv91Var.a();
        }
    }
}
