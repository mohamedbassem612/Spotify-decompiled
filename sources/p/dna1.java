package p;

import android.util.SparseArray;
import android.view.View;
import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsDetailsRequest;
import io.reactivex.rxjava3.functions.Function;
import java.util.Arrays;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dna1 implements sh, wua, Function {
    public int a;
    public Object b;
    public Object c;

    public dna1() {
        this.b = new Object[8];
        this.a = 0;
    }

    public Object a(int i) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.a + 1)) {
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public Object apply(Object obj) {
        Optional optional = (Optional) obj;
        jqd0 jqd0Var = (jqd0) this.b;
        pks0 pks0Var = (pks0) this.c;
        int i = this.a;
        qf60 qf60Var = ((pf60) jqd0Var.c).a;
        if (!jqd0Var.b) {
            lqz0 lqz0Var = (!optional.isPresent() || optional.get() == gp20.a) ? lqz0.MONTH : lqz0.WEEK;
            nks0 nks0Var = pks0Var instanceof nks0 ? (nks0) pks0Var : null;
            int i2 = nks0Var != null ? nks0Var.a : 0;
            tsb1 tsb1VarN = StatsDetailsRequest.n();
            tsb1VarN.r(lqz0Var);
            tsb1VarN.q(i2);
            tsb1VarN.n(tnt.a(i));
            tsb1VarN.s(upo1.s());
            return qf60Var.c((StatsDetailsRequest) tsb1VarN.build()).map(new eoc((byte) 28));
        }
        String strQ = g3p1.q(optional);
        ssb1 ssb1VarN = com.spotify.highlightsstats.data.proto.v2.StatsDetailsRequest.n();
        if (pks0Var instanceof oks0) {
            long j = ((oks0) pks0Var).a;
            sve1 sve1VarR = Timestamp.r();
            sve1VarR.q(j);
            ssb1VarN.s((Timestamp) sve1VarR.build());
        } else {
            if (!(pks0Var instanceof nks0)) {
                eg.o();
                return null;
            }
            ssb1VarN.q(((nks0) pks0Var).a);
        }
        ssb1VarN.n(tnt.a(i));
        ssb1VarN.r(upo1.s());
        return qf60Var.f((com.spotify.highlightsstats.data.proto.v2.StatsDetailsRequest) ssb1VarN.build()).map(new t4o(strQ, (byte) 12));
    }

    public void b(String str, pl10 pl10Var) {
        int i = this.a + 1;
        Object[] objArrCopyOf = (Object[]) this.b;
        int length = objArrCopyOf.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                eg.f("cannot store more than MAX_VALUE elements");
                return;
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            this.b = objArrCopyOf;
        }
        int i4 = this.a;
        int i5 = i4 + i4;
        objArrCopyOf[i5] = str;
        objArrCopyOf[i5 + 1] = pl10Var;
        this.a = i4 + 1;
    }

    public vua c(fc10 fc10Var, long j) {
        long j2;
        long position = fc10Var.getPosition();
        int iMin = (int) Math.min(112800L, fc10Var.getLength() - position);
        izr0 izr0Var = (izr0) this.c;
        izr0Var.O(iMin);
        fc10Var.h(0, izr0Var.a, iMin);
        int i = izr0Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (izr0Var.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = izr0Var.a;
            int i2 = izr0Var.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jU = kqn1.u(izr0Var, i2, this.a);
            if (jU != j2) {
                long jB = ((yve1) this.b).b(jU);
                if (jB > j) {
                    return j5 == j2 ? new vua(-1, jB, position) : new vua(0, -9223372036854775807L, position + j4);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new vua(0, -9223372036854775807L, position + ((long) i2));
                }
                j4 = i2;
            }
            izr0Var.R(i3);
            j3 = i3;
        }
        return j5 != j2 ? new vua(-2, j5, position + j3) : vua.d;
    }

    public void d() {
        izr0 izr0Var = (izr0) this.c;
        byte[] bArr = zoi1.b;
        izr0Var.P(bArr, bArr.length);
    }

    public boolean r(View view) {
        qqf1 qqf1Var = (qqf1) this.b;
        if (qqf1Var.t) {
            return false;
        }
        iu30 iu30Var = qqf1Var.h;
        aqf1 aqf1Var = (aqf1) this.c;
        iu30Var.invoke(new hrf1(aqf1Var.a, this.a, aqf1Var.h));
        return true;
    }

    public /* synthetic */ dna1(int i, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
