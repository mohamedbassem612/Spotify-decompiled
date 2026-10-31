package p;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qgp1 {
    protected int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(ArrayList arrayList, lip1 lip1Var) {
        Charset charset = mip1.a;
        int size = arrayList.size();
        if (lip1Var instanceof ArrayList) {
            ((ArrayList) lip1Var).ensureCapacity(lip1Var.size() + size);
        } else if (lip1Var instanceof rjp1) {
            rjp1 rjp1Var = (rjp1) lip1Var;
            int i = rjp1Var.c + size;
            int length = rjp1Var.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = f4i1.a(length, 3, 2, 1, 10);
                    }
                    rjp1Var.b = Arrays.copyOf(rjp1Var.b, length);
                } else {
                    rjp1Var.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = lip1Var.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                int size4 = lip1Var.size() - size2;
                String strH = fd21.h(new StringBuilder(String.valueOf(size4).length() + 26), "Element at index ", size4, " is null.");
                int size5 = lip1Var.size();
                while (true) {
                    size5--;
                    if (size5 < size2) {
                        bhn0.i(strH);
                        return;
                    }
                    lip1Var.remove(size5);
                }
            } else {
                lip1Var.add(obj);
            }
        }
    }

    public abstract int a();

    public final byte[] b() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            fhp1 fhp1Var = new fhp1(bArr, iA);
            cip1 cip1Var = (cip1) this;
            ujp1 ujp1VarA = qjp1.c.a(cip1Var.getClass());
            i2i1 i2i1Var = fhp1Var.e;
            if (i2i1Var == null) {
                i2i1Var = new i2i1(fhp1Var);
            }
            ujp1VarA.c(cip1Var, i2i1Var);
            if (iA - fhp1Var.h == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            bhn0.o(l1d.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(ujp1 ujp1Var);
}
