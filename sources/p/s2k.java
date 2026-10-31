package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s2k extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2k(int i, ArrayList arrayList, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        ArrayList<q5t0> arrayList = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj).intValue();
                mmr0 mmr0VarE = z2k.E(arrayList, i, iIntValue);
                return ((eyl) mmr0VarE.b).b.invoke(Integer.valueOf(iIntValue - ((Number) mmr0VarE.a).intValue()));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                mmr0 mmr0VarE2 = z2k.E(arrayList, i, iIntValue2);
                return ((eyl) mmr0VarE2.b).c.invoke(Integer.valueOf(iIntValue2 - ((Number) mmr0VarE2.a).intValue()));
            case 2:
                p5t0 p5t0Var = (p5t0) obj;
                int i2 = 0;
                int i3 = 0;
                for (Object obj2 : arrayList) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    q5t0 q5t0Var = (q5t0) obj2;
                    p5t0Var.k(q5t0Var, i3, 0, -i2);
                    i3 += q5t0Var.a - i;
                    i2 = i4;
                }
                return rih1Var;
            case 3:
                p5t0 p5t0Var2 = (p5t0) obj;
                Integer numValueOf = 0;
                int iU = q7h.U(arrayList, 9);
                if (iU == 0) {
                    Collections.singletonList(numValueOf);
                } else {
                    ArrayList arrayList2 = new ArrayList(iU + 1);
                    arrayList2.add(numValueOf);
                    for (q5t0 q5t0Var2 : arrayList) {
                        int iIntValue3 = numValueOf.intValue();
                        p5t0Var2.k(q5t0Var2, iIntValue3, (i - q5t0Var2.b) / 2, 0.0f);
                        numValueOf = Integer.valueOf(iIntValue3 + q5t0Var2.a);
                        arrayList2.add(numValueOf);
                    }
                }
                return rih1Var;
            case 4:
                b261.k((e261) obj, new d4h(arrayList.size(), i));
                return rih1Var;
            case 5:
                p5t0 p5t0Var3 = (p5t0) obj;
                int i5 = 0;
                for (Object obj3 : arrayList) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    q5t0 q5t0Var3 = (q5t0) obj3;
                    if (i5 == 0) {
                        p5t0Var3.k(q5t0Var3, 0, 0, 0.0f);
                    } else {
                        p5t0Var3.k(q5t0Var3, ((q5t0) o7h.q0(arrayList)).a - i, (((q5t0) o7h.q0(arrayList)).b - q5t0Var3.b) / 2, 1.0f);
                    }
                    i5 = i6;
                }
                return rih1Var;
            case 6:
                p5t0 p5t0Var4 = (p5t0) obj;
                int i7 = 0;
                for (q5t0 q5t0Var4 : arrayList) {
                    p5t0Var4.k(q5t0Var4, i7, 0, 0.0f);
                    i7 += q5t0Var4.a + i;
                }
                return rih1Var;
            case 7:
                p5t0 p5t0Var5 = (p5t0) obj;
                int i8 = 0;
                for (q5t0 q5t0Var5 : arrayList) {
                    p5t0Var5.k(q5t0Var5, 0, i8, 0.0f);
                    i8 += q5t0Var5.b + i;
                }
                return rih1Var;
            case 8:
                ((p5t0) obj).k((q5t0) arrayList.get(i), 0, 0, 0.0f);
                return rih1Var;
            default:
                return new km71(arrayList, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2k(ArrayList arrayList, int i, byte b) {
        super(1);
        this.a = b;
        this.c = arrayList;
        this.b = i;
    }
}
