package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ps6 implements Function {
    public final /* synthetic */ byte a;
    public final List b;

    public ps6(int i, int i2) {
        int i3;
        z6x arrayList;
        this.a = (byte) 1;
        int i4 = -(i / 2);
        i4 = i % 2 == 0 ? i4 + 1 : i4;
        if (i <= 0) {
            hhg1.n("rowCount must be > 0");
            throw null;
        }
        if (i2 < 0) {
            hhg1.n("itemCount must be >= 0");
            throw null;
        }
        if (i2 == 0) {
            arrayList = z6x.a;
        } else {
            int i5 = 2;
            if (i == 2) {
                arrayList = new ArrayList();
                arrayList.add(new z760(0, i4));
                if (i2 > 1) {
                    arrayList.add(new z760(1, i4));
                }
                if (i2 > 2) {
                    arrayList.add(new z760(0, i4 + 1));
                }
                if (i2 > 3) {
                    arrayList.add(new z760(1, i4 + 1));
                }
                int i6 = 4;
                while (i6 < i2) {
                    arrayList.add(new z760(i5, i4));
                    int i7 = i6 + 1;
                    if (i7 < i2) {
                        arrayList.add(new z760(i5, i4 + 1));
                        i6 += 2;
                    } else {
                        i6 = i7;
                    }
                    i5++;
                }
            } else {
                z6x arrayList2 = new ArrayList();
                arrayList2.add(new z760(0, i4));
                if (1 < i2) {
                    arrayList2.add(new z760(1, i4));
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                for (int i8 = 1; i8 < i && i3 < i2; i8++) {
                    arrayList2.add(new z760(0, i4 + i8));
                    i3++;
                }
                int i9 = i - 1;
                for (int i10 = i9; i10 > 0 && i3 < i2; i10--) {
                    arrayList2.add(new z760(1, i4 + i10));
                    i3++;
                }
                while (i3 < i2) {
                    arrayList2.add(new z760(i5, i4));
                    i3++;
                    for (int i11 = i9; i11 > 0 && i3 < i2; i11--) {
                        arrayList2.add(new z760(i5, i4 + i11));
                        i3++;
                    }
                    i5++;
                }
                arrayList = arrayList2;
            }
        }
        this.b = arrayList;
    }

    public exs a(Context context, h2b1 h2b1Var) {
        exs exsVar = new exs(context, h2b1Var);
        List list = this.b;
        if (!list.isEmpty()) {
            yws ywsVarD = exsVar.d();
            String[] strArr = (String[]) list.toArray(new String[0]);
            ((j0g1) ywsVarD).m = b380.q((String[]) Arrays.copyOf(strArr, strArr.length));
            exsVar.p(new zws(ywsVarD));
        }
        return exsVar;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                List listB = ((uv00) obj).b(vy6.class);
                ArrayList arrayList = new ArrayList();
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    vy6 vy6Var = ((tv00) it.next()).b;
                    if (vy6Var != null) {
                        arrayList.add(vy6Var);
                    }
                }
                return o7h.a1(arrayList, new os6(list, (byte) 0));
            case 1:
            default:
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    list = list2;
                }
                return list;
            case 2:
                return new mmr0((da61) obj, list);
        }
    }

    public /* synthetic */ ps6(List list, byte b) {
        this.a = b;
        this.b = list;
    }
}
