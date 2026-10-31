package p;

import app.p000rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qxa1 extends lap1 {
    public final izr0 c = new izr0();
    public final bae d = new bae();
    public yve1 e;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    public final hjj0 i(gkj0 gkj0Var, ByteBuffer byteBuffer) {
        rij0 sxa1Var;
        long j;
        long j2;
        izr0 izr0Var = this.c;
        bae baeVar = this.d;
        yve1 yve1Var = this.e;
        if (yve1Var != null) {
            long j3 = gkj0Var.i;
            synchronized (yve1Var) {
                j2 = yve1Var.b;
            }
            if (j3 != j2) {
                yve1 yve1Var2 = new yve1(gkj0Var.f);
                this.e = yve1Var2;
                yve1Var2.a(gkj0Var.f - gkj0Var.i);
            }
        } else {
            yve1 yve1Var3 = new yve1(gkj0Var.f);
            this.e = yve1Var3;
            yve1Var3.a(gkj0Var.f - gkj0Var.i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        izr0Var.P(bArrArray, iLimit);
        baeVar.l(bArrArray, iLimit);
        baeVar.o(39);
        long jG = (((long) baeVar.g(1)) << 32) | ((long) baeVar.g(32));
        baeVar.o(20);
        int iG = baeVar.g(12);
        int iG2 = baeVar.g(8);
        izr0Var.S(14);
        if (iG2 == 0) {
            sxa1Var = new sxa1();
        } else if (iG2 == 255) {
            long jG2 = izr0Var.G();
            int i = iG - 4;
            izr0Var.o(0, new byte[i], i);
            sxa1Var = new cqw0((byte) 0, jG2, jG);
        } else if (iG2 == 4) {
            int iE = izr0Var.E();
            ArrayList arrayList = new ArrayList(iE);
            for (int i2 = 0; i2 < iE; i2++) {
                izr0Var.G();
                boolean z = (izr0Var.E() & SemanticState.Focused) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iE2 = izr0Var.E();
                    boolean z2 = (iE2 & 64) != 0;
                    boolean z3 = (iE2 & 32) != 0;
                    if (z2) {
                        izr0Var.G();
                    }
                    if (!z2) {
                        int iE3 = izr0Var.E();
                        ArrayList arrayList3 = new ArrayList(iE3);
                        for (int i3 = 0; i3 < iE3; i3++) {
                            izr0Var.E();
                            izr0Var.G();
                            arrayList3.add(new mhc((byte) 25));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        izr0Var.E();
                        izr0Var.G();
                    }
                    izr0Var.L();
                    izr0Var.E();
                    izr0Var.E();
                }
                arrayList.add(new txa1(arrayList2));
            }
            sxa1Var = new uxa1(arrayList);
        } else if (iG2 == 5) {
            yve1 yve1Var4 = this.e;
            izr0Var.G();
            boolean z4 = (izr0Var.E() & SemanticState.Focused) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iE4 = izr0Var.E();
                boolean z5 = (iE4 & 64) != 0;
                boolean z6 = (iE4 & 32) != 0;
                boolean z7 = (iE4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : cqw0.d(jG, izr0Var);
                if (!z5) {
                    int iE5 = izr0Var.E();
                    ArrayList arrayList4 = new ArrayList(iE5);
                    for (int i4 = 0; i4 < iE5; i4++) {
                        izr0Var.E();
                        yve1Var4.b(!z7 ? cqw0.d(jG, izr0Var) : -9223372036854775807L);
                        arrayList4.add(new lhc((byte) 25));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    izr0Var.E();
                    izr0Var.G();
                }
                izr0Var.L();
                izr0Var.E();
                izr0Var.E();
                j = jD;
            }
            sxa1Var = new rxa1(j, yve1Var4.b(j), list);
        } else if (iG2 != 6) {
            sxa1Var = null;
        } else {
            yve1 yve1Var5 = this.e;
            long jD2 = cqw0.d(jG, izr0Var);
            sxa1Var = new cqw0((byte) 1, jD2, yve1Var5.b(jD2));
        }
        return sxa1Var == null ? new hjj0(new rij0[0]) : new hjj0(sxa1Var);
    }
}
