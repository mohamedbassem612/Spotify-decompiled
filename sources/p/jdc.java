package p;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jdc implements AutoCloseable {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Serializable c;

    public jdc(Object obj, String str, ArrayDeque arrayDeque) {
        this.c = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new idc(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int iMin = Math.min(arrayDeque.size(), 11);
                String[] strArr = (String[]) this.b;
                if (strArr == null) {
                    strArr = new String[12];
                    this.b = strArr;
                }
                if (strArr[iMin] == null) {
                    char[] cArr = new char[iMin];
                    Arrays.fill(cArr, ' ');
                    String str2 = new String(cArr);
                    ((String[]) this.b)[iMin] = iMin == 11 ? str2.concat("...") : str2;
                }
                ldc.i(obj.getClass());
            }
        }
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((idc) itDescendingIterator.next()).a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        byte b = this.a;
        j2 j2Var = this.c;
        switch (b) {
            case 0:
                ((ArrayDeque) j2Var).removeFirst();
                break;
            default:
                ((gnq0) this.b).c.remove(j2Var);
                break;
        }
    }

    public jdc(gnq0 gnq0Var, j2 j2Var) {
        this.b = gnq0Var;
        this.c = j2Var;
    }
}
