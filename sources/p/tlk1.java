package p;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tlk1 implements lqc1 {
    public static final bfo e;
    public final izr0 a = new izr0();
    public final izr0 b = new izr0();
    public final slk1 c;
    public Inflater d;

    static {
        w280 w280Var = b380.b;
        e = new bfo(-9223372036854775807L, -9223372036854775807L, bg11.e);
    }

    public tlk1(List list) {
        int i;
        slk1 slk1Var = new slk1();
        this.c = slk1Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = zoi1.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                slk1Var.f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = slk1Var.f;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        oon1.I("Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    oon1.H("Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        slk1Var.g = Integer.parseInt(strArrSplit2[0]);
                        slk1Var.h = Integer.parseInt(strArrSplit2[1]);
                        slk1Var.d = true;
                    } catch (RuntimeException e3) {
                        oon1.I("Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0286  */
    /* JADX WARN: Code duplicated, block: B:104:0x028c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0292  */
    /* JADX WARN: Code duplicated, block: B:92:0x0272  */
    /* JADX WARN: Code duplicated, block: B:95:0x0279  */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00c6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar) {
        bfo bfoVar;
        char c;
        long j;
        char c2;
        feo feoVar;
        long j2;
        long j3;
        bg11 bg11VarT;
        long j4;
        Rect rect;
        izr0 izr0Var = this.a;
        izr0Var.P(bArr, i + i2);
        izr0Var.R(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = zoi1.a;
        if (izr0Var.a() > 0 && izr0Var.n() == 120) {
            izr0 izr0Var2 = this.b;
            if (zoi1.O(izr0Var, izr0Var2, inflater)) {
                izr0Var.P(izr0Var2.a, izr0Var2.c);
            }
        }
        slk1 slk1Var = this.c;
        long j5 = -9223372036854775807L;
        slk1Var.b = -9223372036854775807L;
        slk1Var.c = -9223372036854775807L;
        char c3 = 0;
        slk1Var.e = false;
        slk1Var.i = null;
        slk1Var.j = -1;
        slk1Var.k = -1;
        int iA = izr0Var.a();
        if (iA < 2 || izr0Var.L() != iA) {
            bfoVar = e;
        } else {
            if (slk1Var.f == null) {
                oon1.H("Skipping SPU (no palette)");
            } else {
                if (slk1Var.d) {
                    int i3 = izr0Var.b - 2;
                    izr0Var.R(izr0Var.L() + i3);
                    while (true) {
                        if (izr0Var.a() < 4) {
                            j = j5;
                            c2 = c3;
                            c = c2;
                        } else {
                            int i4 = izr0Var.b;
                            int iL = izr0Var.L() * 10000;
                            int iL2 = izr0Var.L() + i3;
                            c = (iL2 == i4 || iL2 >= izr0Var.c) ? c3 : (char) 1;
                            int i5 = c != 0 ? iL2 : izr0Var.c;
                            j = j5;
                            char c4 = 1;
                            while (izr0Var.b < i5 && c4 != 0) {
                                long j6 = iL;
                                int[] iArr = slk1Var.a;
                                int iE = izr0Var.E();
                                char c5 = c3;
                                if (iE != 255) {
                                    switch (iE) {
                                        case 0:
                                            c4 = 1;
                                            break;
                                        case 1:
                                            slk1Var.b = j6;
                                            c4 = 1;
                                            break;
                                        case 2:
                                            slk1Var.c = j6;
                                            c4 = 1;
                                            break;
                                        case 3:
                                            if (izr0Var.a() >= 2) {
                                                int iE2 = izr0Var.E();
                                                int iE3 = izr0Var.E();
                                                iArr[3] = slk1.a(iE2 >> 4, slk1Var.f);
                                                iArr[2] = slk1.a(iE2 & 15, slk1Var.f);
                                                iArr[1] = slk1.a(iE3 >> 4, slk1Var.f);
                                                iArr[c5] = slk1.a(iE3 & 15, slk1Var.f);
                                                slk1Var.e = true;
                                                c4 = 1;
                                            } else {
                                                oon1.H("Incomplete color command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 4:
                                            if (izr0Var.a() < 2) {
                                                oon1.H("Incomplete alpha command");
                                            } else if (slk1Var.e) {
                                                int iE4 = izr0Var.E();
                                                int iE5 = izr0Var.E();
                                                iArr[3] = slk1.c(iArr[3], iE4 >> 4);
                                                iArr[2] = slk1.c(iArr[2], iE4 & 15);
                                                iArr[1] = slk1.c(iArr[1], iE5 >> 4);
                                                iArr[c5] = slk1.c(iArr[c5], iE5 & 15);
                                                c4 = 1;
                                            } else {
                                                oon1.H("Ignoring alpha command before color command");
                                            }
                                            c4 = c5;
                                            break;
                                        case 5:
                                            if (izr0Var.a() >= 6) {
                                                int iE6 = izr0Var.E();
                                                int iE7 = izr0Var.E();
                                                int i6 = (iE6 << 4) | (iE7 >> 4);
                                                int iE8 = ((iE7 & 15) << 8) | izr0Var.E();
                                                int iE9 = izr0Var.E();
                                                int iE10 = izr0Var.E();
                                                slk1Var.i = new Rect(i6, (iE9 << 4) | (iE10 >> 4), iE8 + 1, (((iE10 & 15) << 8) | izr0Var.E()) + 1);
                                                c4 = 1;
                                            } else {
                                                oon1.H("Incomplete area command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 6:
                                            if (izr0Var.a() >= 4) {
                                                slk1Var.j = izr0Var.L();
                                                slk1Var.k = izr0Var.L();
                                                c4 = 1;
                                            } else {
                                                oon1.H("Incomplete offsets command");
                                                c4 = c5;
                                            }
                                            break;
                                        default:
                                            td6.p(iE, "Unrecognized command: ");
                                            c4 = c5;
                                            break;
                                    }
                                } else {
                                    c4 = c5;
                                }
                                c3 = c5;
                            }
                            c2 = c3;
                            if (c != 0) {
                                izr0Var.R(iL2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c3 = c2;
                        }
                    }
                } else {
                    oon1.H("Skipping SPU (no plane)");
                }
                if (slk1Var.f != null || !slk1Var.d || !slk1Var.e || (rect = slk1Var.i) == null || slk1Var.j == -1 || slk1Var.k == -1 || rect.width() < 2 || slk1Var.i.height() < 2) {
                    feoVar = null;
                } else {
                    Rect rect2 = slk1Var.i;
                    int[] iArr2 = new int[rect2.height() * rect2.width()];
                    bae baeVar = new bae();
                    izr0Var.R(slk1Var.j);
                    baeVar.k(izr0Var);
                    slk1Var.b(baeVar, true, rect2, iArr2);
                    izr0Var.R(slk1Var.k);
                    baeVar.k(izr0Var);
                    slk1Var.b(baeVar, c2, rect2, iArr2);
                    feoVar = new feo(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / slk1Var.h, 0, 0, rect2.left / slk1Var.g, 0, os00.INVALID_ID, -3.4028235E38f, rect2.width() / slk1Var.g, rect2.height() / slk1Var.h, false, -16777216, os00.INVALID_ID, 0.0f, 0);
                }
                j2 = slk1Var.c;
                if (j2 != j) {
                    j4 = slk1Var.b;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (feoVar != null) {
                    bg11VarT = b380.t(feoVar);
                } else {
                    w280 w280Var = b380.b;
                    bg11VarT = bg11.e;
                }
                bfoVar = new bfo(slk1Var.b, j3, bg11VarT);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (slk1Var.f != null) {
                feoVar = null;
            } else {
                feoVar = null;
            }
            j2 = slk1Var.c;
            if (j2 != j) {
                j4 = slk1Var.b;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (feoVar != null) {
                bg11VarT = b380.t(feoVar);
            } else {
                w280 w280Var2 = b380.b;
                bg11VarT = bg11.e;
            }
            bfoVar = new bfo(slk1Var.b, j3, bg11VarT);
        }
        aklVar.accept(bfoVar);
    }

    public final int i() {
        return 2;
    }
}
