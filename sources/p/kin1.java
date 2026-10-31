package p;

import com.google.android.recaptcha.internal.zzanf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kin1 implements Cloneable {
    public final rin1 a;
    public rin1 b;

    public kin1(rin1 rin1Var) {
        this.a = rin1Var;
        if (rin1Var.v()) {
            hhg1.n("Default instance must be immutable.");
            throw null;
        }
        this.b = rin1Var.g();
    }

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

    public static void b(Iterable iterable, List list) {
        if (iterable instanceof ajn1) {
            List listZza = ((ajn1) iterable).zza();
            ajn1 ajn1Var = (ajn1) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = ajn1Var.size() - size;
                    String strH = fd21.h(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = ajn1Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            bhn0.i(strH);
                            return;
                        }
                        ajn1Var.remove(size3);
                    }
                } else if (obj instanceof ain1) {
                    ajn1Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    ain1.x(0, bArr, bArr.length);
                    ajn1Var.zzb();
                } else {
                    ajn1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof kjn1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof mjn1) {
                mjn1 mjn1Var = (mjn1) list;
                int i = mjn1Var.c + size4;
                int length = mjn1Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = ywx0.j(length, 3, 2, 1);
                        }
                        mjn1Var.b = Arrays.copyOf(mjn1Var.b, length);
                    } else {
                        mjn1Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final Object clone() {
        kin1 kin1Var = (kin1) this.a.u(5);
        boolean zV = this.b.v();
        rin1 rin1Var = this.b;
        if (zV) {
            rin1Var.getClass();
            ljn1.b.a(rin1Var.getClass()).b(rin1Var);
            rin1Var.w();
            rin1Var = this.b;
        }
        kin1Var.b = rin1Var;
        return kin1Var;
    }

    public final void d() {
        if (this.b.v()) {
            return;
        }
        rin1 rin1VarG = this.a.g();
        ljn1.b.a(rin1VarG.getClass()).a(rin1VarG, this.b);
        this.b = rin1VarG;
    }

    public final rin1 e() {
        boolean zV = this.b.v();
        rin1 rin1Var = this.b;
        if (zV) {
            rin1Var.getClass();
            ljn1.b.a(rin1Var.getClass()).b(rin1Var);
            rin1Var.w();
            rin1Var = this.b;
        }
        rin1Var.getClass();
        if (rin1.q(rin1Var, true)) {
            return rin1Var;
        }
        throw new zzanf();
    }

    public final void g(rin1 rin1Var) {
        rin1 rin1Var2 = this.a;
        if (rin1Var != null && !rin1Var2.getClass().isInstance(rin1Var)) {
            hhg1.n("mergeFrom(MessageLite) can only merge messages of the same type.");
        } else {
            if (rin1Var2.equals(rin1Var)) {
                return;
            }
            d();
            rin1 rin1Var3 = this.b;
            ljn1.b.a(rin1Var3.getClass()).a(rin1Var3, rin1Var);
        }
    }
}
