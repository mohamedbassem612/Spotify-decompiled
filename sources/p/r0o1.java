package p;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r0o1 extends iao1 {
    private static final r0o1 zzb;
    private ebo1 zzd = kgo1.e;

    static {
        r0o1 r0o1Var = new r0o1();
        zzb = r0o1Var;
        iao1.f(r0o1.class, r0o1Var);
    }

    public static m0o1 q() {
        return (m0o1) zzb.k();
    }

    public static void r(r0o1 r0o1Var, ArrayList arrayList) {
        ebo1 ebo1VarZzd = r0o1Var.zzd;
        if (!((t3o1) ebo1VarZzd).a) {
            int size = ebo1VarZzd.size();
            ebo1VarZzd = ebo1VarZzd.zzd(size + size);
            r0o1Var.zzd = ebo1VarZzd;
        }
        Charset charset = wbo1.a;
        int size2 = arrayList.size();
        if (ebo1VarZzd instanceof ArrayList) {
            ((ArrayList) ebo1VarZzd).ensureCapacity(ebo1VarZzd.size() + size2);
        } else if (ebo1VarZzd instanceof kgo1) {
            kgo1 kgo1Var = (kgo1) ebo1VarZzd;
            int i = kgo1Var.c + size2;
            int length = kgo1Var.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = f4i1.a(length, 3, 2, 1, 10);
                    }
                    kgo1Var.b = Arrays.copyOf(kgo1Var.b, length);
                } else {
                    kgo1Var.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = ebo1VarZzd.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strE = gvg.e(ebo1VarZzd.size() - size3, "Element at index ", " is null.");
                int size5 = ebo1VarZzd.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        bhn0.i(strE);
                        return;
                    }
                    ebo1VarZzd.remove(size5);
                }
            } else {
                ebo1VarZzd.add(obj);
            }
        }
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", k0o1.class});
        }
        if (i2 == 3) {
            return new r0o1();
        }
        if (i2 == 4) {
            return new m0o1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
