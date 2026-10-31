package p;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ob4 implements o5s, View.OnAttachStateChangeListener {
    public w161 X;
    public boolean Y;
    public final fe Z;
    public final ha4 a;
    public final q01 b;
    public url c;
    public final ArrayList d = new ArrayList();
    public int e = 1;
    public boolean f = true;
    public final bbc g = mno1.a(1, 0, 6);
    public fdn0 h;
    public long i;
    public final fdn0 t;

    public ob4(ha4 ha4Var, q01 q01Var) {
        this.a = ha4Var;
        this.b = q01Var;
        new Handler(Looper.getMainLooper());
        fdn0 fdn0Var = pr80.a;
        this.h = fdn0Var;
        this.t = new fdn0();
        this.X = new w161(ha4Var.getSemanticsOwner().a(), fdn0Var);
        this.Z = new fe(this, (byte) 2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (p.hap1.i(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p.nb4
            if (r0 == 0) goto L13
            r0 = r9
            p.nb4 r0 = (p.nb4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.nb4 r0 = new p.nb4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            p.uac r1 = r0.a
            p.hm5.M(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L34:
            p.uac r1 = r0.a
            p.hm5.M(r9)
            goto L52
        L3a:
            p.hm5.M(r9)
            p.uac r9 = new p.uac
            p.bbc r1 = r8.g
            r9.<init>(r1)
        L44:
            r0.a = r9
            r0.d = r3
            java.lang.Object r1 = r9.a(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L66
            r8.e()
        L66:
            p.ha4 r9 = r8.a
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.Y
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.Y = r3
            p.fe r5 = r8.Z
            r9.post(r5)
        L79:
            r0.a = r1
            r0.d = r2
            r5 = 100
            java.lang.Object r9 = p.hap1.i(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ob4.a(p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[LOOP:2: B:21:0x006f->B:39:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x015e A[LOOP:4: B:45:0x00e5->B:70:0x015e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d0 A[EDGE_INSN: B:90:0x00d0->B:41:0x00d0 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0164 A[EDGE_INSN: B:96:0x0164->B:71:0x0164 BREAK  A[LOOP:4: B:45:0x00e5->B:70:0x015e], SYNTHETIC] */
    public final void b(or80 or80Var) throws KotlinNothingValueException {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        or80 or80Var2 = or80Var;
        int[] iArr3 = or80Var2.b;
        long[] jArr = or80Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        w161 w161Var = (w161) this.t.b(i7);
                        x161 x161Var = (x161) or80Var2.b(i7);
                        v161 v161Var = x161Var != null ? x161Var.a : null;
                        if (v161Var == null) {
                            throw l1d.w("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = v161Var.f;
                        o161 o161Var = v161Var.d;
                        nen0 nen0Var = o161Var.a;
                        if (w161Var == null) {
                            Object[] objArr = nen0Var.b;
                            long[] jArr2 = nen0Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                d261 d261Var = (d261) objArr[(i10 << 3) + i12];
                                                d261 d261Var2 = z161.C;
                                                if (u890.j(d261Var, d261Var2)) {
                                                    List list = (List) eko1.v(o161Var, d261Var2);
                                                    g(i8, String.valueOf(list != null ? (af5) o7h.s0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = nen0Var.b;
                            long[] jArr3 = nen0Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                d261 d261Var3 = (d261) objArr2[(i13 << 3) + i15];
                                                d261 d261Var4 = z161.C;
                                                if (u890.j(d261Var3, d261Var4)) {
                                                    List list2 = (List) eko1.v(w161Var.a, d261Var4);
                                                    af5 af5Var = list2 != null ? (af5) o7h.s0(list2) : null;
                                                    List list3 = (List) eko1.v(o161Var, d261Var4);
                                                    af5 af5Var2 = list3 != null ? (af5) o7h.s0(list3) : null;
                                                    if (!u890.j(af5Var, af5Var2)) {
                                                        g(i8, String.valueOf(af5Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    or80Var2 = or80Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            or80Var2 = or80Var;
            iArr3 = iArr;
        }
    }

    public final or80 c() {
        if (this.f) {
            this.f = false;
            this.h = ggo1.C(this.a.getSemanticsOwner(), new z9((byte) 10));
            this.i = System.currentTimeMillis();
        }
        return this.h;
    }

    public final boolean d() {
        return this.c != null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e() throws NoWhenBranchMatchedException {
        trl trlVar = this.c;
        if (trlVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                srl srlVar = (srl) arrayList.get(i);
                int iC = l1d.C(srlVar.c());
                if (iC == 0) {
                    ghk1 ghk1VarB = srlVar.b();
                    if (ghk1VarB != null) {
                        trlVar.d(ghk1VarB.m());
                    }
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    trl trlVar2 = trlVar;
                    AutofillId autofillIdB = trlVar2.b(srlVar.a());
                    if (autofillIdB != null) {
                        trlVar2.e(autofillIdB);
                    }
                }
            }
            trlVar.a();
            arrayList.clear();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void f(v161 v161Var, w161 w161Var) throws KotlinNothingValueException {
        f14 f14Var = new f14(w161Var, this, (byte) 1);
        v161Var.getClass();
        List listI = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listI.get(i2);
            if (c().a(((v161) obj).f)) {
                f14Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listI2 = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            v161 v161Var2 = (v161) listI2.get(i3);
            or80 or80VarC = c();
            int i4 = v161Var2.f;
            if (or80VarC.a(i4)) {
                fdn0 fdn0Var = this.t;
                if (fdn0Var.a(i4)) {
                    Object objB = fdn0Var.b(i4);
                    if (objB == null) {
                        throw l1d.w("node not present in pruned tree before this change");
                    }
                    f(v161Var2, (w161) objB);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void g(int i, String str) throws KotlinNothingValueException {
        trl trlVar;
        if (Build.VERSION.SDK_INT >= 29 && (trlVar = this.c) != null) {
            trl trlVar2 = trlVar;
            AutofillId autofillIdB = trlVar2.b(i);
            if (autofillIdB == null) {
                throw l1d.w("Invalid content capture ID");
            }
            trlVar2.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    public final void h(int i, v161 v161Var) {
        we weVar;
        iu30 iu30Var;
        d69 d69VarH;
        AutofillId autofillIdA;
        n511 n511VarA;
        ghk1 ghk1Var;
        String strV;
        iu30 iu30Var2;
        if (d()) {
            o161 o161Var = v161Var.d;
            Boolean bool = (Boolean) eko1.v(o161Var, z161.E);
            if (this.e == 1 && u890.j(bool, Boolean.TRUE)) {
                we weVar2 = (we) eko1.v(o161Var, m161.m);
                if (weVar2 != null && (iu30Var2 = weVar2.b) != null) {
                }
            } else if (this.e == 2 && u890.j(bool, Boolean.FALSE) && (weVar = (we) eko1.v(o161Var, m161.m)) != null && (iu30Var = weVar.b) != null) {
            }
            int i2 = v161Var.f;
            trl trlVar = this.c;
            if (trlVar == null || Build.VERSION.SDK_INT < 29 || (d69VarH = t6p1.h(this.a)) == null) {
                ghk1Var = null;
            } else {
                v161 v161VarL = v161Var.l();
                int i3 = v161Var.f;
                if (v161VarL != null) {
                    autofillIdA = trlVar.b(v161VarL.f);
                    if (autofillIdA == null) {
                        ghk1Var = null;
                    }
                } else {
                    autofillIdA = d69VarH.a();
                }
                ghk1 ghk1VarC = trlVar.c(autofillIdA, i3);
                if (ghk1VarC == null) {
                    ghk1Var = null;
                } else {
                    o161 o161Var2 = v161Var.d;
                    if (o161Var2.a.c(z161.N)) {
                        ghk1Var = null;
                    } else {
                        Bundle bundleC = ghk1VarC.c();
                        if (bundleC != null) {
                            bundleC.putLong("android.view.contentcapture.EventTimestamp", this.i);
                            bundleC.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        String str = (String) eko1.v(o161Var2, z161.A);
                        if (str != null) {
                            ghk1VarC.i(i3, str);
                        }
                        if (((Boolean) eko1.v(o161Var2, z161.n)) != null) {
                            ghk1VarC.f("android.widget.ViewGroup");
                        }
                        List list = (List) eko1.v(o161Var2, z161.C);
                        if (list != null) {
                            ghk1VarC.f("android.widget.TextView");
                            ghk1VarC.k(p5d0.b(list, "\n", (iu30) null, 62));
                        }
                        af5 af5Var = (af5) eko1.v(o161Var2, z161.G);
                        if (af5Var != null) {
                            ghk1VarC.f("android.widget.EditText");
                            ghk1VarC.k(af5Var);
                        }
                        List list2 = (List) eko1.v(o161Var2, z161.a);
                        if (list2 != null) {
                            ghk1VarC.g(p5d0.b(list2, "\n", (iu30) null, 62));
                        }
                        pm31 pm31Var = (pm31) eko1.v(o161Var2, z161.z);
                        if (pm31Var != null && (strV = flo1.v(pm31Var.a)) != null) {
                            ghk1VarC.f(strV);
                        }
                        y9e1 y9e1VarI = flo1.i(o161Var2);
                        if (y9e1VarI != null) {
                            x9e1 x9e1Var = y9e1VarI.a;
                            lee1 lee1Var = x9e1Var.b;
                            wat watVar = x9e1Var.g;
                            ghk1VarC.l(watVar.U0() * watVar.h() * TextUnit.c(lee1Var.a.b));
                        }
                        ndo0 ndo0VarD = v161Var.d();
                        if (ndo0VarD == null) {
                            n511VarA = n511.e;
                        } else {
                            ndo0 ndo0Var = ndo0VarD.f1().N0 ? ndo0VarD : null;
                            if (ndo0Var != null) {
                                n511VarA = v161Var.a(ndo0Var);
                            } else {
                                n511VarA = n511.e;
                            }
                        }
                        float f = n511VarA.a;
                        float f2 = n511VarA.b;
                        ghk1VarC.h((int) f, (int) f2, (int) (n511VarA.c - f), (int) (n511VarA.d - f2));
                        ghk1Var = ghk1VarC;
                    }
                }
            }
            if (ghk1Var != null) {
                this.d.add(new srl(i2, this.i, 1, ghk1Var));
            }
            List listI = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listI.get(i5);
                if (c().a(((v161) obj).f)) {
                    h(i4, (v161) obj);
                    i4++;
                }
            }
        }
    }

    public final void i(v161 v161Var) {
        if (d()) {
            this.d.add(new srl(v161Var.f, this.i, 2, (ghk1) null));
            List listI = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                i((v161) listI.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void j() {
        fdn0 fdn0Var = this.t;
        fdn0Var.c();
        or80 or80VarC = c();
        int[] iArr = or80VarC.b;
        Object[] objArr = or80VarC.c;
        long[] jArr = or80VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            fdn0Var.i(iArr[i4], new w161(((x161) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.X = new w161(this.a.getSemanticsOwner().a(), c());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.o5s
    public final void onStart(iac0 iac0Var) throws NoWhenBranchMatchedException {
        this.c = (url) this.b.invoke();
        h(-1, this.a.getSemanticsOwner().a());
        e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.o5s
    public final void onStop(iac0 iac0Var) throws NoWhenBranchMatchedException {
        i(this.a.getSemanticsOwner().a());
        e();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.Z);
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
