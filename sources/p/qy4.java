package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qy4 implements gfh0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qy4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m686measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        int i;
        q5t0 q5t0VarH;
        ArrayList arrayList;
        mmr0 mmr0Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ifv0) obj).setParentLayoutDirection((flb0) obj2);
                return ifh0Var.S(0, 0, b7xVar, new z9((byte) 16));
            case 1:
                long jB = hjl.b(j, 0, 0, 0, 0, 10);
                if (((ufq0) obj) != null) {
                    i = 1;
                    q5t0VarH = ((afh0) list.get(0)).H(jB);
                } else {
                    i = 0;
                    q5t0VarH = null;
                }
                int i2 = i + 1;
                afh0 afh0Var = (afh0) list.get(i);
                q5t0 q5t0VarH2 = ((qfq0) obj2) != null ? ((afh0) list.get(i2)).H(jB) : null;
                int i3 = hjl.i(j) - (Math.max(q5t0VarH != null ? q5t0VarH.a : 0, q5t0VarH2 != null ? q5t0VarH2.a : 0) * 2);
                q5t0 q5t0VarH3 = afh0Var.H(hjl.b(jB, 0, i3 < 0 ? 0 : i3, 0, 0, 13));
                int iJ = hjl.j(j);
                int[] iArr = {q5t0VarH != null ? q5t0VarH.b : 0, q5t0VarH3.b, q5t0VarH2 != null ? q5t0VarH2.b : 0};
                int iMax = iJ;
                for (int i4 = 0; i4 < 3; i4++) {
                    iMax = Math.max(iMax, iArr[i4]);
                }
                return ifh0Var.S(hjl.i(j), iMax, b7xVar, new m96(q5t0VarH, iMax, q5t0VarH3, j, q5t0VarH2, (byte) 1));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                List list2 = list;
                int size = list2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = list.get(i5);
                    if (!(((afh0) obj3).g() instanceof obe1)) {
                        arrayList2.add(obj3);
                    }
                }
                List list3 = (List) ((Function0) obj2).invoke();
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        n511 n511Var = (n511) list3.get(i6);
                        if (n511Var != null) {
                            float f = n511Var.b;
                            float f2 = n511Var.a;
                            mmr0Var = new mmr0(((afh0) arrayList2.get(i6)).H(jjl.b(0, (int) Math.floor(n511Var.c - f2), 0, (int) Math.floor(n511Var.d - f), 5)), new qr80((((long) Math.round(f2)) << 32) | (((long) Math.round(f)) & 4294967295L)));
                        } else {
                            mmr0Var = null;
                        }
                        if (mmr0Var != null) {
                            arrayList3.add(mmr0Var);
                        }
                        i6++;
                        list2 = list2;
                        obj = obj;
                        list3 = list3;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                Object obj4 = obj;
                List list4 = list2;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list4.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    Object obj5 = list.get(i7);
                    if (((afh0) obj5).g() instanceof obe1) {
                        arrayList4.add(obj5);
                    }
                }
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7xVar, new vae1(arrayList, jch0.L(arrayList4, (Function0) obj4), (byte) 0));
        }
    }
}
