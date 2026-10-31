package p;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zwb0 implements nma0 {
    public final /* synthetic */ byte a;
    public final h661 b;
    public final nma0 c;

    public zwb0(nma0 nma0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                nma0 nma0VarSerializer = mna1.Companion.serializer(nma0Var);
                this.c = nma0VarSerializer;
                this.b = nma0VarSerializer.getDescriptor();
                break;
            default:
                nlc0 nlc0Var = new nlc0(chc1.a, nma0Var);
                this.c = nlc0Var;
                this.b = nlc0Var.c;
                break;
        }
    }

    public final Object deserialize(dar darVar) {
        byte b = this.a;
        nma0 nma0Var = this.c;
        switch (b) {
            case 0:
                Map map = (Map) ((nlc0) nma0Var).deserialize(darVar);
                ywb0 ywb0Var = new ywb0(10, 0.75f, true);
                ywb0Var.putAll(map);
                return ywb0Var;
            default:
                mna1 mna1Var = (mna1) darVar.Y(nma0Var);
                List list = mna1Var.a;
                int size = list.size();
                List list2 = mna1Var.b;
                if (size != list2.size()) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                SparseArray sparseArray = new SparseArray(list.size());
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    sparseArray.append(((Number) list.get(i)).intValue(), list2.get(i));
                }
                return sparseArray;
        }
    }

    public final h661 getDescriptor() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        byte b = this.a;
        nma0 nma0Var = this.c;
        switch (b) {
            case 0:
                ((nlc0) nma0Var).serialize(uaxVar, (ywb0) obj);
                break;
            default:
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
                }
                int size2 = sparseArray.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(sparseArray.valueAt(i2));
                }
                uaxVar.i(nma0Var, new mna1(arrayList, arrayList2));
                break;
        }
    }
}
