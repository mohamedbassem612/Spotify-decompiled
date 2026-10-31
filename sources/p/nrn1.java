package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class nrn1 implements Cloneable {
    public static void a(int i, List list) {
        int size = list.size() - i;
        String strH = fd21.h(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strH);
            }
            list.remove(size2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Iterable iterable, c0o1 c0o1Var) {
        iterable.getClass();
        if (iterable instanceof j1o1) {
            List listZza = ((j1o1) iterable).zza();
            pze0.m(c0o1Var);
            c0o1Var.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof gun1) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                gun1.l(0, bArr, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof s5o1) {
            c0o1Var.addAll((Collection) iterable);
            return;
        }
        int size = ((Collection) iterable).size();
        if (c0o1Var instanceof ArrayList) {
            ((ArrayList) c0o1Var).ensureCapacity(c0o1Var.size() + size);
        } else if (c0o1Var instanceof b6o1) {
            b6o1 b6o1Var = (b6o1) c0o1Var;
            b6o1Var.d(b6o1Var.size() + size);
        }
        int size2 = c0o1Var.size();
        if (!(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, c0o1Var);
                    throw null;
                }
                c0o1Var.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            Object obj2 = list.get(i);
            if (obj2 == null) {
                a(size2, c0o1Var);
                throw null;
            }
            c0o1Var.add(obj2);
        }
    }
}
