package p;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xao1 implements xbo1 {
    public final i25 a;

    public xao1(i25 i25Var) {
        this.a = i25Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    @Override // p.xbo1
    public final Object zza(Object... objArr) {
        Object objValueOf;
        String str = (String) objArr[0];
        tr80 tr80VarQ = yoi1.Q(1, objArr.length);
        List list = (Iterable) (tr80VarQ.isEmpty() ? z6x.a : Arrays.asList(f46.a0(((rr80) tr80VarQ).a, ((rr80) tr80VarQ).b + 1, objArr)));
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        bpn1 bpn1Var = (bpn1) this.a.e;
        Cursor cursorRawQuery = bpn1Var != null ? bpn1Var.b.getReadableDatabase().rawQuery(str, strArr) : null;
        if (cursorRawQuery == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            ArrayList arrayList3 = new ArrayList();
            int columnCount = cursorRawQuery.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                int type = cursorRawQuery.getType(i);
                if (type == 0) {
                    objValueOf = null;
                } else if (type == 1) {
                    objValueOf = Integer.valueOf(cursorRawQuery.getInt(i));
                } else if (type == 2) {
                    objValueOf = Float.valueOf(cursorRawQuery.getFloat(i));
                } else if (type == 3) {
                    objValueOf = cursorRawQuery.getString(i);
                } else if (type != 4) {
                    objValueOf = null;
                } else {
                    objValueOf = cursorRawQuery.getBlob(i);
                }
                arrayList3.add(objValueOf);
            }
            arrayList2.add(arrayList3);
        }
        cursorRawQuery.close();
        return arrayList2;
    }

    @Override // p.xbo1
    public /* bridge */ /* synthetic */ Object zzb(Object[] objArr) {
        return super.zzb(objArr);
    }
}
