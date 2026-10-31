package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class n850 implements Update {
    public static final n850 a = new n850();

    public final Next a(Object obj, Object obj2) {
        p850 p850Var = (p850) obj;
        j600 j600Var = (j600) obj2;
        boolean z = p850Var.c;
        v850 v850Var = p850Var.a;
        boolean zEquals = j600Var.equals(m000.d);
        z7w z7wVar = z7w.a;
        if (zEquals) {
            return Next.i(p850.a(p850Var, true, false, z7wVar, 47), Collections.singleton(new ufw(v850Var)));
        }
        if (j600Var.equals(m000.c)) {
            return Next.i(p850.a(p850Var, false, true, z7wVar, 31), Collections.singleton(new eew(v850Var)));
        }
        if (j600Var.equals(m000.g)) {
            return Next.a(Collections.singleton(new udw(p850Var.d)));
        }
        if (j600Var.equals(m000.a)) {
            return Next.a(Collections.singleton(p9w.b));
        }
        if (j600Var.equals(m000.f)) {
            return z ? Next.a(Collections.singleton(new baw(true))) : Next.j();
        }
        if (j600Var.equals(m000.e)) {
            return z ? Next.a(Collections.singleton(new baw(false))) : Next.j();
        }
        if (j600Var.equals(m000.b)) {
            return Next.h(p850.a(p850Var, false, false, z7wVar, 63));
        }
        if (j600Var instanceof k100) {
            return Next.h(p850.a(p850Var, false, false, ((k100) j600Var).a, 15));
        }
        eg.o();
        return null;
    }
}
